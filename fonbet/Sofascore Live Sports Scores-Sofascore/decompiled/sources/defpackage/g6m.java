package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.blaze.blazesdk.features.moments.container.BlazeMomentsPlayerContainer;
import com.blaze.blazesdk.features.moments.models.args.b;
import com.blaze.blazesdk.shared.results.BlazeResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g6m extends hoi implements Function2 {
    public final /* synthetic */ BlazeMomentsPlayerContainer r;
    public final /* synthetic */ u6b s;
    public final /* synthetic */ b t;
    public final /* synthetic */ ttk u;
    public final /* synthetic */ Function1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6m(BlazeMomentsPlayerContainer blazeMomentsPlayerContainer, u6b u6bVar, b bVar, ttk ttkVar, Function1 function1, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = blazeMomentsPlayerContainer;
        this.s = u6bVar;
        this.t = bVar;
        this.u = ttkVar;
        this.v = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new g6m(this.r, this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g6m) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        rpl createMomentsPlayerWrapperView;
        rpl rplVar;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        BlazeMomentsPlayerContainer blazeMomentsPlayerContainer = this.r;
        blazeMomentsPlayerContainer.containerView.removeAllViews();
        Context context = blazeMomentsPlayerContainer.containerView.getContext();
        context.getClass();
        createMomentsPlayerWrapperView = blazeMomentsPlayerContainer.createMomentsPlayerWrapperView(context, this.s, this.t, this.u);
        blazeMomentsPlayerContainer.momentsPlayerWrapperView = createMomentsPlayerWrapperView;
        FrameLayout frameLayout = blazeMomentsPlayerContainer.containerView;
        rplVar = blazeMomentsPlayerContainer.momentsPlayerWrapperView;
        frameLayout.addView(rplVar);
        Function1 function1 = this.v;
        if (function1 != null) {
            function1.invoke(new BlazeResult.Success(Unit.a));
        }
        return Unit.a;
    }
}
