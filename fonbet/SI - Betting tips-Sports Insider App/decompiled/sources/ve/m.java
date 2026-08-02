package ve;

import com.sports.insider.R;
import com.sports.insider.ui.views.EmptySectionFollowView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EmptySectionFollowView f24744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(EmptySectionFollowView emptySectionFollowView, Continuation continuation, int i5) {
        super(2, continuation);
        this.f24743b = i5;
        this.f24744c = emptySectionFollowView;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f24743b) {
            case 0:
                return new m(this.f24744c, continuation, 0);
            default:
                return new m(this.f24744c, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f24743b) {
        }
        return ((m) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f24743b;
        EmptySectionFollowView emptySectionFollowView = this.f24744c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return emptySectionFollowView.getContext().getResources().getString(R.string.selection_empty);
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return emptySectionFollowView.getContext().getResources().getString(R.string.empty_saved_predictions);
        }
    }
}
