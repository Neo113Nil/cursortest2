package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.asynclayoutinflater.view.AsyncLayoutInflater;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g84 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g84(int i, rq3 rq3Var, Context context) {
        super(2, rq3Var);
        this.s = context;
        this.t = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new g84(this.t, rq3Var, this.s);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g84) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        Context context = this.s;
        j84 j84Var = new j84(context);
        j84Var.setLayoutParams(new ViewGroup.LayoutParams(this.t, -2));
        j84Var.setClipToPadding(false);
        j84Var.setClipChildren(false);
        AsyncLayoutInflater asyncLayoutInflater = new AsyncLayoutInflater(context);
        this.r = 1;
        oog oogVar = new oog(z9a.b(this));
        asyncLayoutInflater.inflate(R.layout.cup_tree_item, j84Var, new f84(j84Var, oogVar));
        Object b = oogVar.b();
        return b == lu3Var ? lu3Var : b;
    }
}
