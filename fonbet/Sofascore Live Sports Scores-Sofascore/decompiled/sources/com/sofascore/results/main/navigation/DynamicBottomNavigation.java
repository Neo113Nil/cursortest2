package com.sofascore.results.main.navigation;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import androidx.viewpager2.widget.ViewPager2;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4018c8;
import com.ironsource.C4427z5;
import defpackage.a3;
import defpackage.a99;
import defpackage.ad2;
import defpackage.av8;
import defpackage.e1d;
import defpackage.e52;
import defpackage.eoh;
import defpackage.eqf;
import defpackage.fz8;
import defpackage.gv9;
import defpackage.j41;
import defpackage.km5;
import defpackage.kz3;
import defpackage.l6g;
import defpackage.mc3;
import defpackage.nf3;
import defpackage.o13;
import defpackage.of3;
import defpackage.ouk;
import defpackage.qv5;
import defpackage.r41;
import defpackage.sz1;
import defpackage.we5;
import defpackage.znh;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR7\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\rR/\u0010(\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0015¨\u0006)"}, d2 = {"Lcom/sofascore/results/main/navigation/DynamicBottomNavigation;", "La3;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lsz1;", C4018c8.p, "", "setItems", "(Ljava/util/List;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "setupWithViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "", "color", "setWorldCupTeamColor", "(Ljava/lang/Integer;)V", "<set-?>", InneractiveMediationDefs.GENDER_MALE, "Lznh;", "getSelectedIndexState", "()I", "setSelectedIndexState", "(I)V", "selectedIndexState", C4427z5.q, "Le1d;", "getNavConfigsState", "()Ljava/util/List;", "setNavConfigsState", "navConfigsState", "o", "getWorldCupTeamColorState", "()Ljava/lang/Integer;", "setWorldCupTeamColorState", "worldCupTeamColorState", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicBottomNavigation extends a3 {
    public static final /* synthetic */ int q = 0;
    public ViewPager2 k;
    public j41 l;

    /* renamed from: m, reason: from kotlin metadata */
    public final znh selectedIndexState;

    /* renamed from: n, reason: from kotlin metadata */
    public final e1d navConfigsState;

    /* renamed from: o, reason: from kotlin metadata */
    public final e1d worldCupTeamColorState;
    public final LinkedHashMap p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicBottomNavigation(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        context.getClass();
        this.selectedIndexState = e.c(0);
        this.navConfigsState = e.f(km5.a);
        this.worldCupTeamColorState = e.f(null);
        this.p = new LinkedHashMap();
    }

    private final List<sz1> getNavConfigsState() {
        return (List) ((eoh) this.navConfigsState).getValue();
    }

    private final int getSelectedIndexState() {
        return this.selectedIndexState.h();
    }

    private final Integer getWorldCupTeamColorState() {
        return (Integer) ((eoh) this.worldCupTeamColorState).getValue();
    }

    public static final Unit l(DynamicBottomNavigation dynamicBottomNavigation, int i) {
        if (i == dynamicBottomNavigation.getSelectedIndexState()) {
            ad2 ad2Var = qv5.a;
            qv5.a(e52.a);
        } else {
            ViewPager2 viewPager2 = dynamicBottomNavigation.k;
            if (viewPager2 != null) {
                viewPager2.c(i, false);
            }
            dynamicBottomNavigation.setSelectedIndexState(i);
        }
        return Unit.a;
    }

    public static final void n(ViewPager2 viewPager2, DynamicBottomNavigation dynamicBottomNavigation) {
        if (viewPager2.getCurrentItem() < 0 || viewPager2.getCurrentItem() >= dynamicBottomNavigation.getNavConfigsState().size()) {
            return;
        }
        dynamicBottomNavigation.setSelectedIndexState(viewPager2.getCurrentItem());
    }

    private final void setNavConfigsState(List<sz1> list) {
        ((eoh) this.navConfigsState).setValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedIndexState(int i) {
        this.selectedIndexState.i(i);
    }

    private final void setWorldCupTeamColorState(Integer num) {
        ((eoh) this.worldCupTeamColorState).setValue(num);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1113779750);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (!av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            av8Var.W();
        } else if (getNavConfigsState().isEmpty()) {
            av8Var.d0(1991005916);
            av8Var.s(false);
        } else {
            av8Var.d0(1990252492);
            gv9 W = l6g.W(getNavConfigsState());
            int selectedIndexState = getSelectedIndexState();
            Integer worldCupTeamColorState = getWorldCupTeamColorState();
            boolean z = this.p.size() == getNavConfigsState().size();
            boolean i3 = av8Var.i(this);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i3 || O == a99Var) {
                O = new kz3(this, 15);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            boolean i4 = av8Var.i(this);
            Object O2 = av8Var.O();
            if (i4 || O2 == a99Var) {
                O2 = new we5(this);
                av8Var.n0(O2);
            }
            fz8.y(W, selectedIndexState, worldCupTeamColorState, z, function1, (Function2) O2, av8Var, 0);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new we5(this, i);
        }
    }

    public final void setItems(@NotNull List<sz1> configs) {
        configs.getClass();
        o13.z(this.p.keySet(), new r41(configs, 2));
        setNavConfigsState(configs);
    }

    public final void setWorldCupTeamColor(@Nullable Integer color) {
        setWorldCupTeamColorState(color);
    }

    public final void setupWithViewPager(@NotNull ViewPager2 viewPager) {
        viewPager.getClass();
        this.k = viewPager;
        ouk oukVar = this.l;
        if (oukVar != null) {
            viewPager.e(oukVar);
        }
        j41 j41Var = new j41(this, 5);
        viewPager.a(j41Var);
        this.l = j41Var;
        post(new mc3(28, viewPager, this));
    }
}
