package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k3k extends a3 {
    public final e1d k;
    public final e1d l;
    public TvChannelData m;
    public List n;
    public final e1d o;
    public Function1 p;
    public Function0 q;
    public ct8 r;
    public Function2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3k(Context context) {
        super(context, null, 0);
        context.getClass();
        this.k = e.f(null);
        this.l = e.f(Boolean.FALSE);
        this.o = e.f(CollectionsKt.Y(zu3.y0));
        setClipToPadding(false);
        setClipChildren(false);
    }

    private final boolean getCanVote() {
        return ((Boolean) ((eoh) this.l).getValue()).booleanValue();
    }

    private final Country getCurrentCountry() {
        return (Country) ((eoh) this.o).getValue();
    }

    private final gv9 getTvChannelsState() {
        return (gv9) ((eoh) this.k).getValue();
    }

    public static final Unit l(k3k k3kVar, String str, gv9 gv9Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(1 & i, (i & 3) != 2)) {
            boolean canVote = k3kVar.getCanVote();
            boolean i2 = av8Var.i(k3kVar);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i2 || O == a99Var) {
                O = new mx5(k3kVar, 2);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            boolean i3 = av8Var.i(k3kVar);
            Object O2 = av8Var.O();
            if (i3 || O2 == a99Var) {
                O2 = new j3k(k3kVar);
                av8Var.n0(O2);
            }
            Function2 function2 = (Function2) O2;
            boolean i4 = av8Var.i(k3kVar) | av8Var.g(str);
            Object O3 = av8Var.O();
            if (i4 || O3 == a99Var) {
                O3 = new fej(6, k3kVar, str);
                av8Var.n0(O3);
            }
            Function0 function02 = (Function0) O3;
            boolean i5 = av8Var.i(k3kVar);
            Object O4 = av8Var.O();
            if (i5 || O4 == a99Var) {
                O4 = new mx5(k3kVar, 3);
                av8Var.n0(O4);
            }
            u0a.p(str, gv9Var, canVote, function0, function2, function02, (Function0) O4, av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    public static final Unit m(k3k k3kVar) {
        Function1 function1 = k3kVar.p;
        if (function1 != null) {
            function1.invoke(k3kVar.getCurrentCountry());
        }
        return Unit.a;
    }

    private final void setCanVote(boolean z) {
        ((eoh) this.l).setValue(Boolean.valueOf(z));
    }

    private final void setCurrentCountry(Country country) {
        ((eoh) this.o).setValue(country);
    }

    private final void setTvChannelsState(gv9 gv9Var) {
        ((eoh) this.k).setValue(gv9Var);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        eqf u;
        j3k j3kVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1457190248);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            String iso2Alpha = getCurrentCountry().getIso2Alpha();
            gv9 tvChannelsState = getTvChannelsState();
            if (tvChannelsState == null) {
                u = av8Var.u();
                if (u != null) {
                    j3kVar = new j3k(this, i, 0);
                    u.d = j3kVar;
                }
                return;
            }
            haa.f(yqo.H(-26256093, av8Var, new mfh(17, this, iso2Alpha, tvChannelsState)), av8Var, 6);
        } else {
            av8Var.W();
        }
        u = av8Var.u();
        if (u != null) {
            j3kVar = new j3k(this, i, 1);
            u.d = j3kVar;
        }
    }

    @Nullable
    public final Function2<String, TvChannelData, Unit> getOnContributeClick() {
        return this.s;
    }

    @Nullable
    public final Function0<Unit> getOnFullTvChannelClick() {
        return this.q;
    }

    @Nullable
    public final Function1<Country, Unit> getOnSelectCountryClick() {
        return this.p;
    }

    @Nullable
    public final ct8 getOnVoteClick() {
        return this.r;
    }

    public final void n(TvChannelData tvChannelData, v3k v3kVar, List list) {
        list.getClass();
        TvChannelData tvChannelData2 = this.m;
        if (tvChannelData2 == null) {
            this.n = list;
            this.m = tvChannelData;
        } else {
            tvChannelData = tvChannelData2;
        }
        if (ug5.n(yaa.v(), tvChannelData.c * 1000) <= 7) {
            TvChannelData tvChannelData3 = this.m;
            if (tvChannelData3 == null) {
                Intrinsics.i("tvChannelData");
                throw null;
            }
            if (ug5.n(yaa.v(), tvChannelData3.c * 1000) < -30) {
                return;
            }
            setTvChannelsListData(v3kVar);
        }
    }

    public final void setOnContributeClick(@Nullable Function2<? super String, ? super TvChannelData, Unit> function2) {
        this.s = function2;
    }

    public final void setOnFullTvChannelClick(@Nullable Function0<Unit> function0) {
        this.q = function0;
    }

    public final void setOnSelectCountryClick(@Nullable Function1<? super Country, Unit> function1) {
        this.p = function1;
    }

    public final void setOnVoteClick(@Nullable ct8 ct8Var) {
        this.r = ct8Var;
    }

    public final void setTvChannelsListData(@NotNull v3k v3kVar) {
        boolean z;
        v3kVar.getClass();
        setCurrentCountry(v3kVar.a);
        setTvChannelsState(v3kVar.b);
        if (getCurrentCountry().getMccList().contains(Integer.valueOf(ke0.c))) {
            TvChannelData tvChannelData = this.m;
            if (tvChannelData == null) {
                Intrinsics.i("tvChannelData");
                throw null;
            }
            if (!Intrinsics.c(tvChannelData.b, StatusKt.STATUS_FINISHED)) {
                z = true;
                setCanVote(z);
            }
        }
        z = false;
        setCanVote(z);
    }
}
