package gh;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f10232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ByteString f10233c;

    public k0(b0 b0Var, ByteString byteString) {
        this.f10232b = b0Var;
        this.f10233c = byteString;
    }

    @Override // gh.m0
    public final long a() {
        return this.f10233c.size();
    }

    @Override // gh.m0
    public final b0 b() {
        return this.f10232b;
    }

    @Override // gh.m0
    public final void d(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.write(this.f10233c);
    }
}
