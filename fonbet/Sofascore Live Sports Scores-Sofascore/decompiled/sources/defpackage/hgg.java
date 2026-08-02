package defpackage;

import android.text.format.DateUtils;
import android.widget.SeekBar;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hgg extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hgg(igg iggVar, long j, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = iggVar;
        this.t = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new hgg((igg) this.s, this.t, rq3Var, 0);
            case 1:
                return new hgg((igg) this.s, this.t, rq3Var, 1);
            default:
                hgg hggVar = new hgg(this.t, rq3Var);
                hggVar.s = obj;
                return hggVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((hgg) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((hgg) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((hgg) create((qvg) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        long j = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                igg iggVar = (igg) this.s;
                ((SeekBar) iggVar.b.e).setMax((int) j);
                ez0 ez0Var = iggVar.b;
                ((TextView) ez0Var.c).setText(DateUtils.formatElapsedTime(0L));
                ((TextView) ez0Var.d).setText(DateUtils.formatElapsedTime(j / 1000));
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                igg iggVar2 = (igg) this.s;
                ((SeekBar) iggVar2.b.e).setProgress((int) j);
                ez0 ez0Var2 = iggVar2.b;
                ((TextView) ez0Var2.c).setText(DateUtils.formatElapsedTime(j / 1000));
                ((TextView) ez0Var2.d).setText(DateUtils.formatElapsedTime((((SeekBar) ez0Var2.e).getMax() - j) / 1000));
                break;
            default:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                svg svgVar = ((qvg) this.s).a;
                svgVar.c(svgVar.k, j, 1);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgg(long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.t = j;
    }
}
