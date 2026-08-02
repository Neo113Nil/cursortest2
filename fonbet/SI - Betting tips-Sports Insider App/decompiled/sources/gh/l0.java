package gh;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class l0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f10240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f10242d;

    public l0(int i5, b0 b0Var, byte[] bArr) {
        this.f10240b = b0Var;
        this.f10241c = i5;
        this.f10242d = bArr;
    }

    @Override // gh.m0
    public final long a() {
        return this.f10241c;
    }

    @Override // gh.m0
    public final b0 b() {
        return this.f10240b;
    }

    @Override // gh.m0
    public final void d(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.write(this.f10242d, 0, this.f10241c);
    }
}
