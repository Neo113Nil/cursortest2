package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.favorites.FavoritesStagesData;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class f31 extends FrameLayout {
    public final mqi a;
    public final e1d b;
    public final ComposeView c;
    public boolean d;
    public final e1d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f31(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.a = ypa.b(new c6(context, 6));
        this.b = e.f(null);
        ComposeView composeView = new ComposeView(context, null, 6);
        this.c = composeView;
        this.e = e.f(Boolean.FALSE);
        addView(composeView, new FrameLayout.LayoutParams(-1, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.b, 0, 0);
        e31[] e31VarArr = e31.a;
        setCircular(obtainStyledAttributes.getInt(0, 0) == 1);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, Function1 function1) {
        context.getClass();
        Context context2 = context instanceof BaseActivity ? context : null;
        if (context2 == null) {
            ContextThemeWrapper contextThemeWrapper = context instanceof ContextThemeWrapper ? (ContextThemeWrapper) context : null;
            context2 = contextThemeWrapper != null ? contextThemeWrapper.getBaseContext() : null;
        }
        context = context2;
        if (context instanceof BaseActivity) {
            p4h.t((BaseActivity) context, false, function1, null, 56);
        } else {
            function1.invoke(Boolean.FALSE);
        }
    }

    private final void setCircular(boolean z) {
        ((eoh) this.e).setValue(Boolean.valueOf(z));
    }

    public final void a(int i, of3 of3Var) {
        av8 av8Var;
        e1d l;
        e1d l2;
        e1d e1dVar;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-176373118);
        int i2 = 2;
        int i3 = (av8Var2.i(this) ? 4 : 2) | i;
        int i4 = 0;
        if (av8Var2.T(i3 & 1, (i3 & 3) != 2)) {
            boolean isInEditMode = isInEditMode();
            a99 a99Var = nf3.a;
            if (isInEditMode) {
                av8Var2.d0(-1586477394);
                Object O = av8Var2.O();
                if (O == a99Var) {
                    O = e.f(new FavoritesEventsData(null, null, null, 7, null));
                    av8Var2.n0(O);
                }
                l = (e1d) O;
                av8Var2.s(false);
            } else if ((getFollowableItem() instanceof Event) || (getFollowableItem() instanceof Team) || (getFollowableItem() instanceof d31) || (getFollowableItem() instanceof UniqueTournament)) {
                av8Var2.d0(-1586274685);
                ia0 ia0Var = ia0.q;
                l = sea.l((ddi) ok3.p().h().o.getValue(), av8Var2, 0);
                av8Var2.s(false);
            } else {
                av8Var2.d0(-1586162465);
                Object O2 = av8Var2.O();
                if (O2 == a99Var) {
                    O2 = e.f(null);
                    av8Var2.n0(O2);
                }
                l = (e1d) O2;
                av8Var2.s(false);
            }
            if (isInEditMode()) {
                av8Var2.d0(-1586056786);
                Object O3 = av8Var2.O();
                if (O3 == a99Var) {
                    O3 = e.f(new FavoritesStagesData(null, null, 3, null));
                    av8Var2.n0(O3);
                }
                l2 = (e1d) O3;
                av8Var2.s(false);
            } else {
                if (!(getFollowableItem() instanceof Stage)) {
                    getFollowableItem();
                    if (!(getFollowableItem() instanceof UniqueStage)) {
                        av8Var2.d0(-1585809313);
                        Object O4 = av8Var2.O();
                        if (O4 == a99Var) {
                            O4 = e.f(null);
                            av8Var2.n0(O4);
                        }
                        l2 = (e1d) O4;
                        av8Var2.s(false);
                    }
                }
                av8Var2.d0(-1990819022);
                ia0 ia0Var2 = ia0.q;
                l2 = sea.l((ddi) ok3.p().h().p.getValue(), av8Var2, 0);
                av8Var2.s(false);
            }
            if (isInEditMode()) {
                av8Var2.d0(-1585704936);
                Object O5 = av8Var2.O();
                if (O5 == a99Var) {
                    O5 = e.f(km5.a);
                    av8Var2.n0(O5);
                }
                e1dVar = (e1d) O5;
                av8Var2.s(false);
            } else if (getFollowableItem() instanceof Player) {
                av8Var2.d0(-1990810158);
                ia0 ia0Var3 = ia0.q;
                e1dVar = sea.l((ddi) ok3.p().h().q.getValue(), av8Var2, 0);
                av8Var2.s(false);
            } else {
                av8Var2.d0(-1585534529);
                Object O6 = av8Var2.O();
                if (O6 == a99Var) {
                    O6 = e.f(null);
                    av8Var2.n0(O6);
                }
                e1dVar = (e1d) O6;
                av8Var2.s(false);
            }
            setState(d((FavoritesEventsData) l.getValue(), (FavoritesStagesData) l2.getValue(), (List) e1dVar.getValue()));
            Object followableItem = getFollowableItem();
            Object O7 = av8Var2.O();
            if (O7 == a99Var) {
                O7 = e.f(null);
                av8Var2.n0(O7);
            }
            e1d e1dVar2 = (e1d) O7;
            boolean z = followableItem != null && Intrinsics.c(e1dVar2.getValue(), followableItem);
            boolean i5 = av8Var2.i(followableItem);
            Object O8 = av8Var2.O();
            if (i5 || O8 == a99Var) {
                O8 = new j4(15, followableItem, e1dVar2);
                av8Var2.n0(O8);
            }
            hz8.t((Function0) O8, av8Var2);
            ze8 state = getState();
            if (state == null) {
                av8Var2.d0(-1584841277);
                av8Var2.s(false);
                av8Var = av8Var2;
            } else {
                av8Var2.d0(-1584841276);
                av8Var2.d0(-1990784899);
                e1d e1dVar3 = this.e;
                boolean booleanValue = ((Boolean) ((eoh) e1dVar3).getValue()).booleanValue();
                xtc xtcVar = utc.a;
                if (booleanValue) {
                    n7g n7gVar = o7g.a;
                    xtcVar = yso.o(wnn.A(xtcVar, n7gVar), 1.0f, lz.D(R.color.n_lv_5, av8Var2), n7gVar);
                }
                av8Var2.s(false);
                boolean booleanValue2 = ((Boolean) ((eoh) e1dVar3).getValue()).booleanValue();
                long D = lz.D(R.color.n_lv_4, av8Var2);
                Object O9 = av8Var2.O();
                if (O9 == a99Var) {
                    O9 = mz1.e(av8Var2);
                }
                wzc wzcVar = (wzc) O9;
                Object[] objArr = new Object[0];
                Object O10 = av8Var2.O();
                if (O10 == a99Var) {
                    O10 = fi.e;
                    av8Var2.n0(O10);
                }
                xtc y = tol.y(xtcVar, true, booleanValue2, true, D, wzcVar, new pi(i2, (boh) o3a.N(objArr, (Function0) O10, av8Var2, 48), this), av8Var2, 0);
                k1c c = e12.c(uxf.g, false);
                int hashCode = Long.hashCode(av8Var2.T);
                aee m = av8Var2.m();
                xtc C = fqj.C(av8Var2, y);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, c, hf3.g);
                waa.K(av8Var2, m, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C, hf3.d);
                boolean h = av8Var2.h(z);
                Object O11 = av8Var2.O();
                if (h || O11 == a99Var) {
                    O11 = new c31(z, i4);
                    av8Var2.n0(O11);
                }
                l98.b(state, null, (Function1) O11, null, null, null, yso.a, av8Var2, 1572864, 58);
                av8Var = av8Var2;
                av8Var.s(true);
                av8Var.s(false);
            }
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b31(this, i);
        }
    }

    public abstract void b();

    public abstract ze8 d(FavoritesEventsData favoritesEventsData, FavoritesStagesData favoritesStagesData, List list);

    @NotNull
    public final au1 getBellButtonPopup() {
        return (au1) this.a.getValue();
    }

    @NotNull
    public abstract wu getFollowSource();

    @Nullable
    public final Object getFollowableItem() {
        return ((eoh) this.b).getValue();
    }

    @Nullable
    public abstract ze8 getState();

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.setContent(new tc3(-366043788, new b31(this), true));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (isAttachedToWindow()) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public abstract void setFollowSource(@NotNull wu wuVar);

    public final void setFollowableItem(@Nullable Object obj) {
        ((eoh) this.b).setValue(obj);
    }

    public abstract void setState(@Nullable ze8 ze8Var);
}
