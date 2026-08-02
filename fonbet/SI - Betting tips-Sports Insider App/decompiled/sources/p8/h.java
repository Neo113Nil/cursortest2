package p8;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.messaging.x;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import o8.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements o8.d, g.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21552a;

    public /* synthetic */ h(int i5) {
        this.f21552a = i5;
    }

    @Override // g.a
    public void a(Object obj) {
        Map it = (Map) obj;
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // o8.d
    public Object h(x xVar) {
        b5.f lambda$getComponents$0;
        b5.f lambda$getComponents$1;
        b5.f lambda$getComponents$2;
        switch (this.f21552a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6055b.get();
            case 1:
                l lVar = ExecutorsRegistrar.f6054a;
                return k.f21561a;
            case 19:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(xVar);
                return lambda$getComponents$0;
            case 20:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(xVar);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(xVar);
                return lambda$getComponents$2;
        }
    }
}
