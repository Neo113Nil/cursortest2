package ve;

import com.sports.insider.R;
import com.sports.insider.ui.views.EmptySectionView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EmptySectionView f24748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(EmptySectionView emptySectionView, Continuation continuation, int i5) {
        super(2, continuation);
        this.f24747b = i5;
        this.f24748c = emptySectionView;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f24747b) {
            case 0:
                return new n(this.f24748c, continuation, 0);
            default:
                return new n(this.f24748c, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f24747b) {
        }
        return ((n) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f24747b;
        EmptySectionView emptySectionView = this.f24748c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return emptySectionView.getContext().getResources().getString(R.string.selection_empty);
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return emptySectionView.getContext().getResources().getString(R.string.clear_forecasts);
        }
    }
}
