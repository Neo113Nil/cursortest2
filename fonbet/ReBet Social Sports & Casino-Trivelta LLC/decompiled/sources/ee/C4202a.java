package ee;

import java.io.File;
import java.io.FileInputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import ti.InterfaceC6479i;

/* renamed from: ee.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4202a extends RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public final File f45970a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45971b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45972c;

    /* renamed from: d, reason: collision with root package name */
    public Function2 f45973d;

    /* renamed from: e, reason: collision with root package name */
    public int f45974e;

    public C4202a(File file, String messageId, String contentType, Function2 function2) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f45970a = file;
        this.f45971b = messageId;
        this.f45972c = contentType;
        this.f45973d = function2;
        this.f45974e = -1;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.f45970a.length();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public MediaType get$contentType() {
        return MediaType.INSTANCE.parse(this.f45972c);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC6479i sink) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long length = this.f45970a.length();
        byte[] bArr = new byte[8192];
        FileInputStream fileInputStream = new FileInputStream(this.f45970a);
        try {
            Result.Companion companion = Result.INSTANCE;
            double d10 = 0.0d;
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                int i10 = (int) ((d10 / length) * 100);
                d10 += read;
                if (i10 != this.f45974e && (function2 = this.f45973d) != null) {
                    function2.invoke(this.f45971b, Integer.valueOf(i10));
                }
                this.f45974e = i10;
                sink.write(bArr, 0, read);
            }
            Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Function2 function22 = this.f45973d;
        if (function22 != null) {
            function22.invoke(this.f45971b, 100);
        }
        fileInputStream.close();
    }
}
