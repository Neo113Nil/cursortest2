package d4;

import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Source;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends ForwardingSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8112a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Object f8113b;

    public /* synthetic */ b(Source source) {
        super(source);
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer buffer, long j) {
        switch (this.f8112a) {
            case 0:
                try {
                    return super.read(buffer, j);
                } catch (Exception e7) {
                    this.f8113b = e7;
                    throw e7;
                }
            default:
                try {
                    return super.read(buffer, j);
                } catch (IOException e9) {
                    ((oi.y) this.f8113b).f21358e = e9;
                    throw e9;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(oi.y yVar, BufferedSource bufferedSource) {
        super(bufferedSource);
        this.f8113b = yVar;
    }
}
