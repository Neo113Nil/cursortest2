package ke;

import com.sports.insider.R;
import com.sports.insider.ui.onboarding.BoardSiAcademyFragment;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19021b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BoardSiAcademyFragment f19022c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(BoardSiAcademyFragment boardSiAcademyFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19021b = i5;
        this.f19022c = boardSiAcademyFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19021b) {
            case 0:
                return new a(this.f19022c, continuation, 0);
            case 1:
                return new a(this.f19022c, continuation, 1);
            case 2:
                return new a(this.f19022c, continuation, 2);
            case 3:
                return new a(this.f19022c, continuation, 3);
            case 4:
                return new a(this.f19022c, continuation, 4);
            case 5:
                return new a(this.f19022c, continuation, 5);
            case 6:
                return new a(this.f19022c, continuation, 6);
            default:
                return new a(this.f19022c, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19021b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19021b;
        BoardSiAcademyFragment boardSiAcademyFragment = this.f19022c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return boardSiAcademyFragment.getResources().getText(R.string.expert_analysis_2part);
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return boardSiAcademyFragment.getResources().getText(R.string.expert_analysis_1part);
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                return boardSiAcademyFragment.getResources().getText(R.string.Get_your_first_forecast_from_the_best_cappers);
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                return boardSiAcademyFragment.getResources().getText(R.string.textButtonSub);
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                return boardSiAcademyFragment.getResources().getText(R.string.Get_trained_in_our_academy_and_increase_your_chances_of_winning_every_day);
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                return boardSiAcademyFragment.getResources().getText(R.string.Learn_together_with_us_1part);
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                return boardSiAcademyFragment.getResources().getText(R.string.next);
            default:
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                return boardSiAcademyFragment.getResources().getText(R.string.Learn_together_with_us_2part);
        }
    }
}
