package gh;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f10306b;

    public /* synthetic */ t(int i5, Function0 function0) {
        this.f10305a = i5;
        this.f10306b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10305a) {
            case 0:
                try {
                    return (List) this.f10306b.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return kotlin.collections.e0.f19204a;
                }
            default:
                this.f10306b.invoke();
                return Unit.f19194a;
        }
    }
}
