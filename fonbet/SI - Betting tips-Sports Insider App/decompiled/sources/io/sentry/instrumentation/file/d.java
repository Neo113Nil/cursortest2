package io.sentry.instrumentation.file;

import java.io.Closeable;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f16503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16504c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Closeable f16506e;

    public /* synthetic */ d(Closeable closeable, byte[] bArr, int i5, int i10, int i11) {
        this.f16502a = i11;
        this.f16506e = closeable;
        this.f16503b = bArr;
        this.f16504c = i5;
        this.f16505d = i10;
    }

    @Override // io.sentry.instrumentation.file.a
    public final Object call() {
        switch (this.f16502a) {
            case 0:
                e eVar = (e) this.f16506e;
                return Integer.valueOf(eVar.f16507a.read(this.f16503b, this.f16504c, this.f16505d));
            default:
                FileOutputStream fileOutputStream = ((f) this.f16506e).f16509a;
                byte[] bArr = this.f16503b;
                int i5 = this.f16504c;
                int i10 = this.f16505d;
                fileOutputStream.write(bArr, i5, i10);
                return Integer.valueOf(i10);
        }
    }
}
