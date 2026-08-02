package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ck implements Function1 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ck(ek ekVar, int i, boolean z, Context context, Function1 function1) {
        vmd vmdVar = vmd.EVENT_DETAILS;
        this.d = ekVar;
        this.b = i;
        this.c = z;
        this.e = context;
        this.f = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.a;
        Integer num = null;
        final int i2 = 0;
        boolean z = this.c;
        final int i3 = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        final int i4 = 1;
        switch (i) {
            case 0:
                final ek ekVar = (ek) obj4;
                vmd vmdVar = vmd.EVENT_DETAILS;
                Context context = (Context) obj3;
                Function1 function1 = (Function1) obj2;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                if (ekVar.e != null) {
                    esa.d(esaVar, null, null, new tc3(-1798054363, new kr1(ekVar, 9), true), 3);
                } else if (ekVar.b.c || zu3.k.hasMcc(Integer.valueOf(i3))) {
                    esa.d(esaVar, null, null, new tc3(1522590030, new ct8(i3, ekVar, i4) { // from class: yj
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ ek c;

                        {
                            this.a = i4;
                            switch (i4) {
                                case 1:
                                    vmd vmdVar2 = vmd.EVENT_DETAILS;
                                    break;
                            }
                        }

                        @Override // defpackage.ct8
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i5 = this.a;
                            ek ekVar2 = this.c;
                            switch (i5) {
                                case 0:
                                    of3 of3Var = (of3) obj6;
                                    int intValue = ((Integer) obj7).intValue();
                                    ((xpa) obj5).getClass();
                                    av8 av8Var = (av8) of3Var;
                                    if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                                        o3a.d(this.b, ekVar2.b.e, null, av8Var, 0, 4);
                                    } else {
                                        av8Var.W();
                                    }
                                    break;
                                default:
                                    vmd vmdVar2 = vmd.EVENT_DETAILS;
                                    of3 of3Var2 = (of3) obj6;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    ((xpa) obj5).getClass();
                                    av8 av8Var2 = (av8) of3Var2;
                                    if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        gz8.l(this.b, ekVar2.b, null, av8Var2, 0);
                                    } else {
                                        av8Var2.W();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true), 3);
                }
                ald h = rld.h(i3, true);
                if (h != null) {
                    esa.d(esaVar, "additional_regulations", null, new tc3(-1828586230, new si(h, 2), true), 2);
                }
                gv9 gv9Var = ekVar.c;
                esaVar.a(gv9Var.size(), null, new zi(3, new ia(7), gv9Var), new tc3(802480018, new aj(gv9Var, ekVar), true));
                gv9 gv9Var2 = ekVar.d;
                esaVar.a(gv9Var2.size(), null, new zi(4, new ia(8), gv9Var2), new tc3(802480018, new bj(i4, context, gv9Var2), true));
                if (ekVar.f && z) {
                    esaVar.f("ai_insights", "ai_insights", new tc3(-631790392, new hl6(12, (Object) context, (Object) function1), true));
                }
                esaVar.f("regulation_footer", "regulation_footer", new tc3(-449909715, new ct8(i3, ekVar, i2) { // from class: yj
                    public final /* synthetic */ int a;
                    public final /* synthetic */ int b;
                    public final /* synthetic */ ek c;

                    {
                        this.a = i2;
                        switch (i2) {
                            case 1:
                                vmd vmdVar2 = vmd.EVENT_DETAILS;
                                break;
                        }
                    }

                    @Override // defpackage.ct8
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i5 = this.a;
                        ek ekVar2 = this.c;
                        switch (i5) {
                            case 0:
                                of3 of3Var = (of3) obj6;
                                int intValue = ((Integer) obj7).intValue();
                                ((xpa) obj5).getClass();
                                av8 av8Var = (av8) of3Var;
                                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                                    o3a.d(this.b, ekVar2.b.e, null, av8Var, 0, 4);
                                } else {
                                    av8Var.W();
                                }
                                break;
                            default:
                                vmd vmdVar2 = vmd.EVENT_DETAILS;
                                of3 of3Var2 = (of3) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                ((xpa) obj5).getClass();
                                av8 av8Var2 = (av8) of3Var2;
                                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    gz8.l(this.b, ekVar2.b, null, av8Var2, 0);
                                } else {
                                    av8Var2.W();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, true));
                break;
            case 1:
                TeamPlayerStatsFragment teamPlayerStatsFragment = (TeamPlayerStatsFragment) obj4;
                tug tugVar = (tug) obj3;
                f89 f89Var = (f89) obj2;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = f89Var.e;
                ((View) obj).getClass();
                if (teamPlayerStatsFragment.isResumed()) {
                    View childAt = teamPlayerStatsFragment.D().b.getChildAt(i3);
                    Rect rect = new Rect();
                    teamPlayerStatsFragment.D().e.getHitRect(rect);
                    if ((!childAt.getLocalVisibleRect(rect) || Math.abs(rect.width() + 0.01f) / (childAt.getWidth() + 0.01f) <= 0.8d) && !z) {
                        View childAt2 = teamPlayerStatsFragment.D().b.getChildAt(i3);
                        Context requireContext = teamPlayerStatsFragment.requireContext();
                        requireContext.getClass();
                        num = Integer.valueOf(hkg.c0(requireContext) ? childAt2.getRight() : childAt2.getLeft());
                        if (num != null) {
                            scrollInterceptorHorizontalScrollView.setScrollX(num.intValue());
                            teamPlayerStatsFragment.H(num.intValue());
                        }
                        break;
                    }
                }
                if (z) {
                    Context requireContext2 = teamPlayerStatsFragment.requireContext();
                    requireContext2.getClass();
                    tugVar.e(requireContext2);
                    Integer c = tugVar.c();
                    if (c != null) {
                        i2 = c.intValue();
                    } else {
                        Context context2 = f89Var.a.getContext();
                        context2.getClass();
                        if (hkg.c0(context2)) {
                            i2 = scrollInterceptorHorizontalScrollView.getChildAt(0).getWidth();
                        }
                    }
                    num = Integer.valueOf(i2);
                }
                if (num != null) {
                }
                break;
            default:
                Function1 function12 = (Function1) obj2;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                gv9 gv9Var3 = ((ajl) obj4).a;
                esaVar2.a(gv9Var3.size(), new wsd(22, new pcl(10), gv9Var3), new dyg(gv9Var3, 9), new tc3(802480018, new yfl(gv9Var3, (ajl) obj3, this.c, this.b, function12), true));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ck(ajl ajlVar, ajl ajlVar2, boolean z, int i, Function1 function1) {
        this.d = ajlVar;
        this.e = ajlVar2;
        this.c = z;
        this.b = i;
        this.f = function1;
    }

    public /* synthetic */ ck(TeamPlayerStatsFragment teamPlayerStatsFragment, int i, boolean z, tug tugVar, f89 f89Var) {
        this.d = teamPlayerStatsFragment;
        this.b = i;
        this.c = z;
        this.e = tugVar;
        this.f = f89Var;
    }
}
