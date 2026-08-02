package ye;

import gh.b0;
import gh.m0;
import ic.f0;
import ic.g0;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f25871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f25872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hg.m0 f25873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f25874e;

    public a(b0 b0Var, File file, hg.m0 m0Var, Integer num) {
        f0 f0Var = f0.f11115a;
        this.f25871b = b0Var;
        this.f25872c = file;
        this.f25873d = m0Var;
        this.f25874e = num;
    }

    @Override // gh.m0
    public final long a() {
        return this.f25872c.length();
    }

    @Override // gh.m0
    public final b0 b() {
        return this.f25871b;
    }

    @Override // gh.m0
    public final void d(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        byte[] bArr = new byte[Segment.SIZE];
        File file = this.f25872c;
        long length = file.length();
        FileInputStream m6 = y4.a.m(new FileInputStream(file), file);
        Integer num = this.f25874e;
        f0 type = f0.f11115a;
        try {
            long j = 0;
            for (int read = m6.read(bArr); read != -1; read = m6.read(bArr)) {
                hg.m0 m0Var = this.f25873d;
                if (m0Var != null) {
                    long j6 = j + read;
                    Integer valueOf = Integer.valueOf((int) ((j6 / length) * 100));
                    Intrinsics.checkNotNullParameter(type, "type");
                    g0 g0Var = new g0();
                    g0Var.f11117a = num;
                    g0Var.f11118b = valueOf;
                    g0Var.f11119c = type;
                    m0Var.b(g0Var);
                    sink.write(bArr, 0, read);
                    j = j6;
                }
            }
            Unit unit = Unit.f19194a;
            m6.close();
        } finally {
        }
    }
}
