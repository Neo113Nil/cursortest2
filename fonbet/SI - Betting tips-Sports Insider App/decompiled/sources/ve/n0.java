package ve;

import com.sports.insider.R;
import com.sports.insider.ui.views.StateGameView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StateGameView f24750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(StateGameView stateGameView, Continuation continuation, int i5) {
        super(2, continuation);
        this.f24749b = i5;
        this.f24750c = stateGameView;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f24749b) {
            case 0:
                return new n0(this.f24750c, continuation, 0);
            case 1:
                return new n0(this.f24750c, continuation, 1);
            case 2:
                return new n0(this.f24750c, continuation, 2);
            case 3:
                return new n0(this.f24750c, continuation, 3);
            default:
                return new n0(this.f24750c, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f24749b) {
        }
        return ((n0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f24749b;
        StateGameView stateGameView = this.f24750c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return stateGameView.getContext().getResources().getString(R.string.awaiting);
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return stateGameView.getContext().getResources().getString(R.string.return_status);
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                return stateGameView.getContext().getResources().getString(R.string.passed);
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                return stateGameView.getContext().getResources().getString(R.string.not_passed);
            default:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                return stateGameView.getContext().getResources().getString(R.string.match_completed);
        }
    }
}
