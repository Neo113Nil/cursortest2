package pi;

import com.google.gson.j;
import com.google.gson.x;
import gh.a0;
import gh.b0;
import gh.k0;
import gh.m0;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import oi.m;
import okio.Buffer;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b implements m {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f21892c;

    /* renamed from: a, reason: collision with root package name */
    public final j f21893a;

    /* renamed from: b, reason: collision with root package name */
    public final x f21894b;

    static {
        Regex regex = b0.f10117d;
        f21892c = a0.a("application/json; charset=UTF-8");
    }

    public b(j jVar, x xVar) {
        this.f21893a = jVar;
        this.f21894b = xVar;
    }

    @Override // oi.m
    public final Object e(Object obj) {
        Buffer buffer = new Buffer();
        r9.b e7 = this.f21893a.e(new OutputStreamWriter(buffer.outputStream(), StandardCharsets.UTF_8));
        this.f21894b.c(e7, obj);
        e7.close();
        ByteString content = buffer.readByteString();
        int i5 = m0.f10243a;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new k0(f21892c, content);
    }
}
