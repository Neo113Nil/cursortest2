package ve;

import com.sports.insider.R;
import com.sports.insider.ui.views.LiveTargetRoiView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LiveTargetRoiView f24942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(LiveTargetRoiView liveTargetRoiView, Continuation continuation, int i5) {
        super(2, continuation);
        this.f24941b = i5;
        this.f24942c = liveTargetRoiView;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f24941b) {
            case 0:
                return new z(this.f24942c, continuation, 0);
            case 1:
                return new z(this.f24942c, continuation, 1);
            default:
                return new z(this.f24942c, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f24941b) {
        }
        return ((z) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f24941b;
        LiveTargetRoiView liveTargetRoiView = this.f24942c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return liveTargetRoiView.getContext().getResources().getString(R.string.live_dash_predictions);
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return liveTargetRoiView.getContext().getResources().getString(R.string.ROI_for_the_old_time);
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                return liveTargetRoiView.getContext().getResources().getString(R.string.try_for_free);
        }
    }
}
