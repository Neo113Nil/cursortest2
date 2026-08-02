package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.FootballEvent;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.player.PlayerEventIncidents;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.view.WDLView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jqe extends ir1 {
    public final boolean p;
    public final gt8 q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jqe(bcb bcbVar, gt8 gt8Var, int i) {
        super(bcbVar, false, !r0, (sl6) null, 0, 26);
        boolean z = (i & 2) == 0;
        gt8Var = (i & 4) != 0 ? null : gt8Var;
        this.p = z;
        this.q = gt8Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0320, code lost:
    
        if (r0.intValue() == com.sofascore.model.mvvm.model.Event.getAwayTeam$default(r29.d(), null, 1, null).getId()) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0082, code lost:
    
        if ((r3 != null ? r3.i : null) == defpackage.is1.e) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0305, code lost:
    
        if (r0.intValue() == com.sofascore.model.mvvm.model.Event.getHomeTeam$default(r29.d(), null, 1, null).getId()) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0308, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x07f5  */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44, types: [com.sofascore.model.mvvm.model.FootballEvent] */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v49, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r13v26, types: [int] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v49 */
    @Override // defpackage.ir1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i, int i2, final y21 y21Var, boolean z) {
        Object obj;
        TextView textView;
        TextView textView2;
        int i3;
        Double valueOf;
        char c;
        String str;
        Object obj2;
        final int i4;
        vse vseVar;
        char c2;
        LayerDrawable layerDrawable;
        boolean z2;
        boolean z3;
        boolean z4;
        Drawable drawable;
        Drawable drawable2;
        boolean z5;
        int i5;
        boolean z6;
        TeamSides teamSides;
        ?? valueOf2;
        ImageView imageView;
        String f;
        String f2;
        int id;
        int i6;
        boolean z7;
        ?? r6;
        LayerDrawable i7;
        Drawable drawable3;
        Integer valueOf3 = Integer.valueOf(R.color.n_lv_1);
        super.q(i, i2, y21Var, z);
        bcb bcbVar = (bcb) this.o;
        nr1 nr1Var = bcbVar.b;
        TextView textView3 = bcbVar.x;
        TextView textView4 = bcbVar.g;
        TextView textView5 = bcbVar.v;
        TextView textView6 = bcbVar.e;
        nr1Var.g.setBackground(null);
        nr1 nr1Var2 = bcbVar.b;
        nr1Var2.g.setOnClickListener(null);
        if (y21Var.L != null) {
            d((BellButton) nr1Var2.d, (WDLView) nr1Var2.i, y21Var.d(), y21Var.L);
            textView = textView3;
            textView2 = textView4;
            obj2 = Sports.FOOTBALL;
        } else {
            boolean c3 = Intrinsics.c(ok3.s(y21Var.d()), Sports.FOOTBALL);
            boolean z8 = this.p;
            if (!c3) {
                if (Intrinsics.c(ok3.s(y21Var.d()), Sports.BASKETBALL)) {
                    v8a v8aVar = y21Var.I;
                    vse vseVar2 = v8aVar instanceof vse ? (vse) v8aVar : null;
                }
                View view = nr1Var2.g;
                ((BellButton) nr1Var2.d).setVisibility(8);
                ((ImageView) nr1Var2.e).setVisibility(8);
                SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) nr1Var2.h;
                Paint paint = sofascoreSmallRatingView.p;
                ImageView imageView2 = (ImageView) nr1Var2.f;
                TextView textView7 = nr1Var2.b;
                obj = Sports.FOOTBALL;
                sofascoreSmallRatingView.setVisibility(0);
                imageView2.setVisibility(8);
                textView7.setVisibility(8);
                sofascoreSmallRatingView.o = 0;
                paint.setColor(0);
                sofascoreSmallRatingView.j = 1.0f;
                haa.E(sofascoreSmallRatingView);
                sofascoreSmallRatingView.invalidate();
                Integer num = y21Var.l;
                if (num != null) {
                    textView = textView3;
                    textView2 = textView4;
                    if (num.intValue() == Event.getAwayTeam$default(y21Var.d(), null, 1, null).getId()) {
                        i4 = 2;
                        v8a v8aVar2 = y21Var.I;
                        vseVar = !(v8aVar2 instanceof vse) ? (vse) v8aVar2 : null;
                        if (vseVar != null) {
                            xse xseVar = vseVar.i;
                            if (!Intrinsics.c(y21Var.d().getHasEventPlayerStatistics(), Boolean.TRUE)) {
                                xseVar = null;
                            }
                            if (xseVar != null) {
                                String str2 = (String) xseVar.d().invoke(y21Var.H);
                                Set set = wyh.a;
                                if (!CollectionsKt.R(wyh.k, ok3.s(y21Var.d())) || Intrinsics.c(str2, "-")) {
                                    sofascoreSmallRatingView.setVisibility(8);
                                    imageView2.setVisibility(0);
                                    if (!z8) {
                                        final int i8 = 1;
                                        z8e.a0(imageView2, 1000L, new Function0() { // from class: hqe
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i9 = i8;
                                                jqe jqeVar = this;
                                                y21 y21Var2 = y21Var;
                                                int i10 = i4;
                                                switch (i9) {
                                                    case 0:
                                                        Event d = y21Var2.d();
                                                        Team homeTeam$default = i10 == 1 ? Event.getHomeTeam$default(d, null, 1, null) : Event.getAwayTeam$default(d, null, 1, null);
                                                        gt8 gt8Var = jqeVar.q;
                                                        if (gt8Var != null) {
                                                            gt8Var.invoke(Integer.valueOf(y21Var2.d().getId()), homeTeam$default, y21Var2.d().getStatusType(), Integer.valueOf(i10), null, y21Var2.d().getHasXg());
                                                        }
                                                        break;
                                                    default:
                                                        Event d2 = y21Var2.d();
                                                        Team homeTeam$default2 = i10 == 1 ? Event.getHomeTeam$default(d2, null, 1, null) : Event.getAwayTeam$default(d2, null, 1, null);
                                                        gt8 gt8Var2 = jqeVar.q;
                                                        if (gt8Var2 != null) {
                                                            gt8Var2.invoke(Integer.valueOf(y21Var2.d().getId()), homeTeam$default2, y21Var2.d().getStatusType(), Integer.valueOf(i10), null, y21Var2.d().getHasXg());
                                                        }
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        });
                                    }
                                } else {
                                    sofascoreSmallRatingView.setVisibility(8);
                                    final int i9 = 0;
                                    textView7.setVisibility(0);
                                    textView7.setText(str2);
                                    if (!z8) {
                                        z8e.a0(textView7, 1000L, new Function0() { // from class: hqe
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i92 = i9;
                                                jqe jqeVar = this;
                                                y21 y21Var2 = y21Var;
                                                int i10 = i4;
                                                switch (i92) {
                                                    case 0:
                                                        Event d = y21Var2.d();
                                                        Team homeTeam$default = i10 == 1 ? Event.getHomeTeam$default(d, null, 1, null) : Event.getAwayTeam$default(d, null, 1, null);
                                                        gt8 gt8Var = jqeVar.q;
                                                        if (gt8Var != null) {
                                                            gt8Var.invoke(Integer.valueOf(y21Var2.d().getId()), homeTeam$default, y21Var2.d().getStatusType(), Integer.valueOf(i10), null, y21Var2.d().getHasXg());
                                                        }
                                                        break;
                                                    default:
                                                        Event d2 = y21Var2.d();
                                                        Team homeTeam$default2 = i10 == 1 ? Event.getHomeTeam$default(d2, null, 1, null) : Event.getAwayTeam$default(d2, null, 1, null);
                                                        gt8 gt8Var2 = jqeVar.q;
                                                        if (gt8Var2 != null) {
                                                            gt8Var2.invoke(Integer.valueOf(y21Var2.d().getId()), homeTeam$default2, y21Var2.d().getStatusType(), Integer.valueOf(i10), null, y21Var2.d().getHasXg());
                                                        }
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        });
                                    }
                                }
                                obj2 = obj;
                            }
                        }
                        final int i10 = 0;
                        sofascoreSmallRatingView.o = 0;
                        paint.setColor(0);
                        sofascoreSmallRatingView.j = 1.0f;
                        sofascoreSmallRatingView.setText("N/A");
                        haa.D(sofascoreSmallRatingView);
                        sofascoreSmallRatingView.invalidate();
                        if (!z8) {
                            aba.y(view, 0, 3);
                            z8e.a0(view, 1000L, new Function0(this) { // from class: iqe
                                public final /* synthetic */ jqe b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i11 = i10;
                                    jqe jqeVar = this.b;
                                    switch (i11) {
                                        case 0:
                                            Calendar calendar = ke0.a;
                                            Context context = jqeVar.b;
                                            ke0.g(context, context.getString(R.string.no_player_statistics), 1);
                                            break;
                                        default:
                                            Calendar calendar2 = ke0.a;
                                            Context context2 = jqeVar.b;
                                            ke0.g(context2, context2.getString(R.string.no_player_rating), 1);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            });
                        }
                        obj2 = obj;
                    }
                } else {
                    textView = textView3;
                    textView2 = textView4;
                }
                i4 = 1;
                v8a v8aVar22 = y21Var.I;
                if (!(v8aVar22 instanceof vse)) {
                }
                if (vseVar != null) {
                }
                final int i102 = 0;
                sofascoreSmallRatingView.o = 0;
                paint.setColor(0);
                sofascoreSmallRatingView.j = 1.0f;
                sofascoreSmallRatingView.setText("N/A");
                haa.D(sofascoreSmallRatingView);
                sofascoreSmallRatingView.invalidate();
                if (!z8) {
                }
                obj2 = obj;
            }
            obj = Sports.FOOTBALL;
            textView = textView3;
            textView2 = textView4;
            BellButton bellButton = (BellButton) nr1Var2.d;
            View view2 = nr1Var2.g;
            ((BellButton) nr1Var2.d).setVisibility(8);
            ((ImageView) nr1Var2.f).setVisibility(8);
            nr1Var2.b.setVisibility(8);
            SofascoreSmallRatingView sofascoreSmallRatingView2 = (SofascoreSmallRatingView) nr1Var2.h;
            ImageView imageView3 = (ImageView) nr1Var2.e;
            sofascoreSmallRatingView2.setVisibility(0);
            imageView3.setVisibility(8);
            bellButton.setVisibility(8);
            Integer num2 = y21Var.l;
            if (num2 != null) {
                if (num2.intValue() == Event.getAwayTeam$default(y21Var.d(), null, 1, null).getId()) {
                    i3 = 2;
                    PlayerMatchesEventStatistics playerMatchesEventStatistics = y21Var.H;
                    valueOf = playerMatchesEventStatistics == null ? Double.valueOf(playerMatchesEventStatistics.getRating()) : null;
                    Boolean bool = y21Var.J;
                    boolean booleanValue = bool == null ? bool.booleanValue() : false;
                    if (Intrinsics.a(valueOf, 0.0d) || (!booleanValue && Intrinsics.c(y21Var.d().getHasEventPlayerStatistics(), Boolean.TRUE))) {
                        c = 0;
                        if (valueOf != null) {
                            double doubleValue = valueOf.doubleValue();
                            if (doubleValue > 0.001d) {
                                str = Math.abs(doubleValue - 10.0d) < 0.001d ? "10" : String.valueOf(valueOf.doubleValue());
                                SofascoreSmallRatingView.l(sofascoreSmallRatingView2, str);
                                if (!z8) {
                                    aba.y(view2, 0, 3);
                                    obj2 = obj;
                                    z8e.a0(view2, 1000L, new x22(this, y21Var, i3 == 1 ? Event.getHomeTeam$default(y21Var.d(), null, 1, null) : Event.getAwayTeam$default(y21Var.d(), null, 1, null), i3, valueOf));
                                }
                            }
                        }
                        str = "-";
                        SofascoreSmallRatingView.l(sofascoreSmallRatingView2, str);
                        if (!z8) {
                        }
                    } else {
                        if (booleanValue) {
                            sofascoreSmallRatingView2.setVisibility(8);
                            imageView3.setVisibility(0);
                            if (!z8) {
                                aba.y(view2, 0, 3);
                                z8e.a0(view2, 1000L, new zbe(5, this, y21Var));
                            }
                        } else if (ok3.E(y21Var.d())) {
                            bellButton.setVisibility(0);
                            sofascoreSmallRatingView2.setVisibility(8);
                            imageView3.setVisibility(8);
                        } else {
                            sofascoreSmallRatingView2.o = 0;
                            sofascoreSmallRatingView2.p.setColor(0);
                            c = 0;
                            sofascoreSmallRatingView2.j = 1.0f;
                            sofascoreSmallRatingView2.setText("N/A");
                            haa.D(sofascoreSmallRatingView2);
                            sofascoreSmallRatingView2.invalidate();
                            if (!z8) {
                                aba.y(view2, 0, 3);
                                final int i11 = 1;
                                z8e.a0(view2, 1000L, new Function0(this) { // from class: iqe
                                    public final /* synthetic */ jqe b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i112 = i11;
                                        jqe jqeVar = this.b;
                                        switch (i112) {
                                            case 0:
                                                Calendar calendar = ke0.a;
                                                Context context = jqeVar.b;
                                                ke0.g(context, context.getString(R.string.no_player_statistics), 1);
                                                break;
                                            default:
                                                Calendar calendar2 = ke0.a;
                                                Context context2 = jqeVar.b;
                                                ke0.g(context2, context2.getString(R.string.no_player_rating), 1);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                            }
                        }
                        obj2 = obj;
                    }
                    obj2 = obj;
                }
            }
            i3 = 1;
            PlayerMatchesEventStatistics playerMatchesEventStatistics2 = y21Var.H;
            if (playerMatchesEventStatistics2 == null) {
            }
            Boolean bool2 = y21Var.J;
            if (bool2 == null) {
            }
            if (Intrinsics.a(valueOf, 0.0d)) {
            }
            c = 0;
            if (valueOf != null) {
            }
            str = "-";
            SofascoreSmallRatingView.l(sofascoreSmallRatingView2, str);
            if (!z8) {
            }
            obj2 = obj;
        }
        bcbVar.q.setVisibility(8);
        bcbVar.h.setVisibility(8);
        bcbVar.i.setVisibility(8);
        bcbVar.y.setVisibility(8);
        bcbVar.z.setVisibility(8);
        textView6.setVisibility(8);
        textView5.setVisibility(8);
        Integer num3 = y21Var.L;
        if (num3 != null) {
            c2 = 1;
        } else {
            Integer num4 = y21Var.l;
            if (num4 != null) {
            }
            c2 = 1;
        }
        PlayerEventIncidents playerEventIncidents = y21Var.G;
        String s = ok3.s(y21Var.d());
        int hashCode = s.hashCode();
        qa5 qa5Var = qa5.a;
        Context context = this.b;
        switch (hashCode) {
            case -2002238939:
                if (s.equals(Sports.ICE_HOCKEY)) {
                    PlayerEventIncidents playerEventIncidents2 = playerEventIncidents != null ? playerEventIncidents : null;
                    context.getClass();
                    if (playerEventIncidents2 != null) {
                        ArrayList arrayList = new ArrayList();
                        int i12 = 4;
                        if (playerEventIncidents2.getGoals() + playerEventIncidents2.getAssists() > 7) {
                            if (playerEventIncidents2.getAssists() > 0) {
                                z2 = true;
                                arrayList.addAll(k03.m(context, arrayList.size(), qa5.f(qa5Var, context, R.drawable.ic_ice_hockey, valueOf3, 4), true, playerEventIncidents2.getAssists()));
                            } else {
                                z2 = true;
                            }
                            if (playerEventIncidents2.getGoals() > 0) {
                                arrayList.addAll(k03.m(context, arrayList.size(), qa5Var.k(context), z2, playerEventIncidents2.getGoals()));
                            }
                        } else {
                            int i13 = 1;
                            int assists = playerEventIncidents2.getAssists();
                            int i14 = 0;
                            while (i14 < assists) {
                                arrayList.addAll(k03.m(context, arrayList.size(), qa5.f(qa5Var, context, R.drawable.ic_ice_hockey, valueOf3, i12), false, 1));
                                i14++;
                                i12 = 4;
                            }
                            boolean z9 = false;
                            int goals = playerEventIncidents2.getGoals();
                            int i15 = 0;
                            while (i15 < goals) {
                                arrayList.addAll(k03.m(context, arrayList.size(), qa5Var.k(context), z9, i13));
                                i15++;
                                z9 = false;
                                i13 = 1;
                            }
                        }
                        layerDrawable = k03.i(arrayList);
                        break;
                    }
                }
                layerDrawable = null;
                break;
            case -83759494:
                if (s.equals(Sports.AMERICAN_FOOTBALL)) {
                    PlayerEventIncidents playerEventIncidents3 = playerEventIncidents != null ? playerEventIncidents : null;
                    context.getClass();
                    if (playerEventIncidents3 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int receivingTouchdowns = playerEventIncidents3.getReceivingTouchdowns() + playerEventIncidents3.getPuntReturnsTouchdowns() + playerEventIncidents3.getPuntingReturnTouchdowns() + playerEventIncidents3.getRushingTouchdowns() + playerEventIncidents3.getKickReturnsTouchdowns() + playerEventIncidents3.getFumbleTouchdownReturns() + playerEventIncidents3.getDefensiveInterceptionsTouchdowns();
                        if (playerEventIncidents3.getKickingExtraMade() > 0) {
                            z3 = true;
                            arrayList2.addAll(k03.m(context, arrayList2.size(), qa5Var.a(context), true, playerEventIncidents3.getKickingExtraMade()));
                        } else {
                            z3 = true;
                        }
                        if (playerEventIncidents3.getKickingFgMade() > 0) {
                            arrayList2.addAll(k03.m(context, arrayList2.size(), qa5Var.b(context), z3, playerEventIncidents3.getKickingFgMade()));
                        }
                        if (playerEventIncidents3.getPassingTouchdowns() > 0) {
                            int size = arrayList2.size();
                            Drawable drawable4 = context.getDrawable(R.drawable.ic_passing_touchdown_16);
                            if (drawable4 == null || (drawable = drawable4.mutate()) == null) {
                                drawable = null;
                            } else {
                                drawable.setTint(context.getColor(R.color.n_lv_1));
                            }
                            z4 = true;
                            arrayList2.addAll(k03.m(context, size, drawable, true, playerEventIncidents3.getPassingTouchdowns()));
                        } else {
                            z4 = true;
                        }
                        if (receivingTouchdowns > 0) {
                            arrayList2.addAll(k03.m(context, arrayList2.size(), qa5Var.c(context), z4, receivingTouchdowns));
                        }
                        layerDrawable = k03.i(arrayList2);
                        break;
                    }
                }
                layerDrawable = null;
                break;
            case 1767150:
                if (s.equals(Sports.HANDBALL)) {
                    PlayerEventIncidents playerEventIncidents4 = playerEventIncidents != null ? playerEventIncidents : null;
                    if (playerEventIncidents4 != null) {
                        int goals2 = playerEventIncidents4.getGoals();
                        context.getClass();
                        if (goals2 > 0) {
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList3.size();
                            Drawable drawable5 = context.getDrawable(R.drawable.ic_handball_goal_16);
                            if (drawable5 == null || (drawable2 = drawable5.mutate()) == null) {
                                drawable2 = null;
                            } else {
                                drawable2.setTint(context.getColor(R.color.n_lv_1));
                            }
                            arrayList3.addAll(k03.m(context, size2, drawable2, true, goals2));
                            layerDrawable = k03.i(arrayList3);
                            break;
                        }
                    }
                }
                layerDrawable = null;
                break;
            case 394668909:
                if (s.equals(obj2)) {
                    PlayerEventIncidents playerEventIncidents5 = playerEventIncidents != null ? playerEventIncidents : null;
                    context.getClass();
                    if (playerEventIncidents5 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int goals3 = playerEventIncidents5.getGoals() + playerEventIncidents5.getPenaltyGoals() + playerEventIncidents5.getAssists() + playerEventIncidents5.getOwnGoals() + (playerEventIncidents5.getYellowCards() + (playerEventIncidents5.getYellowRedCards() + playerEventIncidents5.getRedCards()) > 0 ? 1 : 0);
                        if (playerEventIncidents5.getRedCards() <= 0) {
                            z5 = true;
                            z5 = true;
                            z6 = true;
                            if (playerEventIncidents5.getYellowRedCards() > 0) {
                                arrayList4.addAll(k03.m(context, arrayList4.size(), qa5.f(qa5Var, context, R.drawable.ic_yellow_double_16, null, 6), goals3 > 7, 1));
                            } else if (playerEventIncidents5.getYellowCards() > 0) {
                                i5 = 7;
                                arrayList4.addAll(k03.m(context, arrayList4.size(), qa5.f(qa5Var, context, R.drawable.ic_card_yellow_16, null, 6), goals3 > 7, 1));
                                if (goals3 <= i5) {
                                    if (playerEventIncidents5.getOwnGoals() > 0) {
                                        arrayList4.addAll(k03.m(context, arrayList4.size(), qa5Var.e(context), z6, playerEventIncidents5.getOwnGoals()));
                                    }
                                    if (playerEventIncidents5.getAssists() > 0) {
                                        arrayList4.addAll(k03.m(context, arrayList4.size(), qa5Var.g(context), z6, playerEventIncidents5.getAssists()));
                                    }
                                    if (playerEventIncidents5.getPenaltyGoals() > 0) {
                                        arrayList4.addAll(k03.m(context, arrayList4.size(), qa5Var.j(context), z6, playerEventIncidents5.getPenaltyGoals()));
                                    }
                                    if (playerEventIncidents5.getGoals() > 0) {
                                        arrayList4.addAll(k03.m(context, arrayList4.size(), qa5Var.i(context), z6, playerEventIncidents5.getGoals()));
                                    }
                                } else {
                                    int ownGoals = playerEventIncidents5.getOwnGoals();
                                    for (int i16 = 0; i16 < ownGoals; i16++) {
                                        arrayList4.addAll(k03.m(context, arrayList4.size(), qa5Var.e(context), false, z6 ? 1 : 0));
                                    }
                                    boolean z10 = false;
                                    int assists2 = playerEventIncidents5.getAssists();
                                    for (int i17 = 0; i17 < assists2; i17++) {
                                        arrayList4.addAll(k03.m(context, arrayList4.size(), qa5Var.g(context), false, z6 ? 1 : 0));
                                    }
                                    int penaltyGoals = playerEventIncidents5.getPenaltyGoals();
                                    for (int i18 = 0; i18 < penaltyGoals; i18++) {
                                        arrayList4.addAll(k03.m(context, arrayList4.size(), qa5Var.j(context), false, z6 ? 1 : 0));
                                    }
                                    int goals4 = playerEventIncidents5.getGoals();
                                    int i19 = 0;
                                    ?? r13 = z6;
                                    while (i19 < goals4) {
                                        arrayList4.addAll(k03.m(context, arrayList4.size(), qa5Var.i(context), z10, r13));
                                        i19++;
                                        r13 = 1;
                                        z10 = false;
                                    }
                                }
                                layerDrawable = k03.i(arrayList4);
                                break;
                            }
                        } else {
                            z5 = true;
                            arrayList4.addAll(k03.m(context, arrayList4.size(), qa5.f(qa5Var, context, R.drawable.ic_card_red_16, null, 6), goals3 > 7, 1));
                        }
                        i5 = 7;
                        z6 = z5;
                        if (goals3 <= i5) {
                        }
                        layerDrawable = k03.i(arrayList4);
                    }
                }
                layerDrawable = null;
                break;
            case 932645060:
                if (s.equals(Sports.MINI_FOOTBALL)) {
                    if (playerEventIncidents == null) {
                        playerEventIncidents = null;
                    }
                    context.getClass();
                    if (playerEventIncidents == null) {
                        i7 = null;
                    } else {
                        int goals5 = playerEventIncidents.getGoals();
                        int assists3 = playerEventIncidents.getAssists();
                        int ownGoals2 = playerEventIncidents.getOwnGoals();
                        int accumulatedPenaltyGoals = playerEventIncidents.getAccumulatedPenaltyGoals();
                        int penaltyGoals2 = playerEventIncidents.getPenaltyGoals();
                        int yellowCards = playerEventIncidents.getYellowCards();
                        int redCards = playerEventIncidents.getRedCards();
                        int yellowRedCards = playerEventIncidents.getYellowRedCards();
                        ArrayList arrayList5 = new ArrayList();
                        if (goals5 > 0) {
                            i6 = yellowRedCards;
                            z7 = true;
                            arrayList5.addAll(k03.m(context, arrayList5.size(), qa5Var.i(context), true, goals5));
                        } else {
                            i6 = yellowRedCards;
                            z7 = true;
                        }
                        if (penaltyGoals2 > 0) {
                            arrayList5.addAll(k03.m(context, arrayList5.size(), qa5Var.j(context), z7, penaltyGoals2));
                        }
                        if (accumulatedPenaltyGoals > 0) {
                            int size3 = arrayList5.size();
                            Drawable drawable6 = context.getDrawable(R.drawable.ic_accumulated_penalty);
                            if (drawable6 == null || (drawable3 = drawable6.mutate()) == null) {
                                drawable3 = null;
                            } else {
                                drawable3.setTint(context.getColor(R.color.n_lv_1));
                            }
                            r6 = 1;
                            arrayList5.addAll(k03.m(context, size3, drawable3, true, accumulatedPenaltyGoals));
                        } else {
                            r6 = 1;
                        }
                        if (assists3 > 0) {
                            arrayList5.addAll(k03.m(context, arrayList5.size(), qa5Var.g(context), r6, assists3));
                        }
                        if (ownGoals2 > 0) {
                            arrayList5.addAll(k03.m(context, arrayList5.size(), qa5Var.e(context), r6, ownGoals2));
                        }
                        if (redCards > 0) {
                            arrayList5.addAll(k03.m(context, arrayList5.size(), qa5.f(qa5Var, context, R.drawable.ic_card_red_16, null, 6), r6, r6));
                        } else if (i6 > 0) {
                            arrayList5.addAll(k03.m(context, arrayList5.size(), qa5.f(qa5Var, context, R.drawable.ic_yellow_double_16, null, 6), r6, r6));
                        } else if (yellowCards > 0) {
                            arrayList5.addAll(k03.m(context, arrayList5.size(), qa5.f(qa5Var, context, R.drawable.ic_card_yellow_16, null, 6), r6, r6));
                        }
                        i7 = k03.i(arrayList5);
                    }
                    layerDrawable = i7;
                    break;
                }
                layerDrawable = null;
                break;
            default:
                layerDrawable = null;
                break;
        }
        if (layerDrawable != null) {
            ImageView imageView4 = bcbVar.p;
            ConstraintLayout constraintLayout = bcbVar.a;
            mm3 mm3Var = new mm3();
            mm3Var.e(constraintLayout);
            if (imageView4.getVisibility() == 0) {
                id = imageView4.getId();
            } else {
                String f3 = bcbVar.k.getF();
                if ((f3 == null || f3.length() == 0) && ((f = bcbVar.B.getF()) == null || f.length() == 0)) {
                    String f4 = bcbVar.l.getF();
                    id = ((f4 == null || f4.length() == 0) && ((f2 = bcbVar.C.getF()) == null || f2.length() == 0)) ? bcbVar.r.getId() : bcbVar.t.getId();
                } else {
                    id = bcbVar.s.getId();
                }
            }
            mm3Var.f(textView6.getId(), 7, id, 6);
            mm3Var.f(textView5.getId(), 7, id, 6);
            mm3Var.a(constraintLayout);
            if (c2 == 1) {
                teamSides = null;
                textView6.setVisibility(0);
                textView6.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, layerDrawable, (Drawable) null);
            } else if (c2 == 2) {
                textView5.setVisibility(0);
                teamSides = null;
                textView5.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, layerDrawable, (Drawable) null);
            }
            Event d = y21Var.d();
            ?? r10 = !(d instanceof FootballEvent) ? (FootballEvent) d : teamSides;
            Object isVarInProgress$default = r10 == 0 ? FootballEvent.isVarInProgress$default(r10, true, teamSides, 2, teamSides) : teamSides;
            Boolean bool3 = Boolean.TRUE;
            boolean c4 = Intrinsics.c(isVarInProgress$default, bool3);
            boolean c5 = Intrinsics.c(r10 == 0 ? FootballEvent.isVarInProgress$default(r10, false, teamSides, 2, teamSides) : teamSides, bool3);
            valueOf2 = !c4 ? Integer.valueOf(textView2.getId()) : c5 ? Integer.valueOf(textView.getId()) : teamSides;
            ?? valueOf4 = !c5 ? Integer.valueOf(textView.getId()) : c4 ? Integer.valueOf(textView2.getId()) : teamSides;
            imageView = bcbVar.H;
            if (valueOf2 != 0 || valueOf4 == 0) {
                imageView.clearAnimation();
                imageView.setVisibility(8);
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            tl3 tl3Var = (tl3) layoutParams;
            tl3Var.i = valueOf2.intValue();
            tl3Var.l = valueOf4.intValue();
            imageView.setLayoutParams(tl3Var);
            imageView.setVisibility(0);
            if (imageView.getAnimation() == null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                alphaAnimation.setDuration(1000L);
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(2);
                alphaAnimation.setInterpolator(new DecelerateInterpolator());
                imageView.startAnimation(alphaAnimation);
                return;
            }
            return;
        }
        teamSides = null;
        Event d2 = y21Var.d();
        if (!(d2 instanceof FootballEvent)) {
        }
        if (r10 == 0) {
        }
        Boolean bool32 = Boolean.TRUE;
        boolean c42 = Intrinsics.c(isVarInProgress$default, bool32);
        boolean c52 = Intrinsics.c(r10 == 0 ? FootballEvent.isVarInProgress$default(r10, false, teamSides, 2, teamSides) : teamSides, bool32);
        if (!c42) {
        }
        if (!c52) {
        }
        imageView = bcbVar.H;
        if (valueOf2 != 0) {
        }
        imageView.clearAnimation();
        imageView.setVisibility(8);
    }
}
