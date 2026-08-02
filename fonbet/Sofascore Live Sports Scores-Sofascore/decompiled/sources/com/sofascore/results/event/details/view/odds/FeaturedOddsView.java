package com.sofascore.results.event.details.view.odds;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.i;
import com.sofascore.results.R;
import com.vungle.ads.internal.task.g;
import defpackage.and;
import defpackage.d17;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.esk;
import defpackage.fdi;
import defpackage.fgf;
import defpackage.g6b;
import defpackage.g9i;
import defpackage.gdi;
import defpackage.gf0;
import defpackage.go7;
import defpackage.gv9;
import defpackage.h6b;
import defpackage.hl7;
import defpackage.jq2;
import defpackage.kc4;
import defpackage.m61;
import defpackage.of3;
import defpackage.r13;
import defpackage.s5d;
import defpackage.tc3;
import defpackage.tld;
import defpackage.u6b;
import defpackage.uu7;
import defpackage.vmd;
import defpackage.vv8;
import defpackage.wca;
import defpackage.xmd;
import defpackage.xw3;
import defpackage.zkd;
import defpackage.zsk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR/\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00198F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R0\u00108\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0007\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/sofascore/results/event/details/view/odds/FeaturedOddsView;", "Lh6b;", "", "getLayoutId", "()I", "Lg6b;", "lifecycle", "", "setupNatsSocket", "(Lg6b;)V", "Lesk;", InneractiveMediationDefs.GENDER_FEMALE, "Lesk;", "getBinding", "()Lesk;", "binding", "Lxmd;", "<set-?>", g.e, "Le1d;", "getOddsState", "()Lxmd;", "setOddsState", "(Lxmd;)V", "oddsState", "", h.b, "isOddsVisible", "()Z", "setOddsVisible", "(Z)V", "Lkotlin/Function0;", "Lr13;", i.a, "Lkotlin/jvm/functions/Function2;", "getBackgroundColor", "()Lkotlin/jvm/functions/Function2;", "setBackgroundColor", "(Lkotlin/jvm/functions/Function2;)V", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Lvmd;", j.b, "Lvmd;", "getLocation", "()Lvmd;", "setLocation", "(Lvmd;)V", "location", "Lkotlin/Function1;", "Lzkd;", CampaignEx.JSON_KEY_AD_K, "Lkotlin/jvm/functions/Function1;", "getAction", "()Lkotlin/jvm/functions/Function1;", "setAction", "(Lkotlin/jvm/functions/Function1;)V", "action", "Ls5d;", C4427z5.q, "Ls5d;", "getNatsSocket", "()Ls5d;", "setNatsSocket", "(Ls5d;)V", "natsSocket", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class FeaturedOddsView extends h6b implements vv8 {
    public static final /* synthetic */ int p = 0;
    public gf0 d;
    public final boolean e;

    /* renamed from: f, reason: from kotlin metadata */
    public final esk binding;

    /* renamed from: g, reason: from kotlin metadata */
    public final e1d oddsState;

    /* renamed from: h, reason: from kotlin metadata */
    public final e1d isOddsVisible;

    /* renamed from: i, reason: from kotlin metadata */
    public Function2 backgroundColor;

    /* renamed from: j, reason: from kotlin metadata */
    public vmd location;

    /* renamed from: k, reason: from kotlin metadata */
    public Function1 action;
    public zsk l;
    public final fdi m;

    /* renamed from: n, reason: from kotlin metadata */
    public s5d natsSocket;
    public g9i o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedOddsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        context.getClass();
        if (!isInEditMode() && !this.e) {
            this.e = true;
            this.natsSocket = (s5d) ((kc4) ((uu7) f())).a.F0.get();
        }
        this.binding = esk.a(getRoot());
        this.oddsState = e.f(null);
        this.isOddsVisible = e.f(Boolean.FALSE);
        this.backgroundColor = jq2.l;
        this.m = gdi.a(null);
        l();
    }

    private final void setOddsVisible(boolean z) {
        ((eoh) this.isOddsVisible).setValue(Boolean.valueOf(z));
    }

    private final void setupNatsSocket(g6b lifecycle) {
        if (this.o == null) {
            this.o = xw3.L(wca.x(lifecycle), null, null, new d17(this, null, 15), 3);
        }
    }

    @Override // defpackage.uv8
    public final Object f() {
        gf0 gf0Var = this.d;
        if (gf0Var == null) {
            gf0Var = new gf0(this);
            this.d = gf0Var;
        }
        return gf0Var.f();
    }

    @Nullable
    public final Function1<zkd, Unit> getAction() {
        return this.action;
    }

    @NotNull
    public final Function2<of3, Integer, r13> getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final esk getBinding() {
        return this.binding;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_compose_view;
    }

    @NotNull
    public vmd getLocation() {
        vmd vmdVar = this.location;
        if (vmdVar != null) {
            return vmdVar;
        }
        Intrinsics.i("location");
        throw null;
    }

    @NotNull
    public final s5d getNatsSocket() {
        s5d s5dVar = this.natsSocket;
        if (s5dVar != null) {
            return s5dVar;
        }
        Intrinsics.i("natsSocket");
        throw null;
    }

    @Nullable
    public final xmd getOddsState() {
        return (xmd) ((eoh) this.oddsState).getValue();
    }

    @Override // defpackage.h6b
    public final void j(g6b g6bVar) {
        this.l = new zsk(g6bVar, 45);
        setupNatsSocket(g6bVar);
    }

    public void l() {
        this.binding.b.setContent(new tc3(626108292, new hl7(this, 10), true));
    }

    public final void n(xmd xmdVar) {
        String str;
        zsk zskVar;
        xmdVar.getClass();
        gv9 gv9Var = xmdVar.a;
        and andVar = (and) CollectionsKt.firstOrNull(gv9Var);
        String str2 = null;
        fgf fgfVar = andVar != null ? andVar.b : null;
        boolean z = gv9Var.size() == 1;
        if (gv9Var.isEmpty() || (getLocation() == vmd.CHAT && !z)) {
            setOddsVisible(false);
            zsk zskVar2 = this.l;
            if (zskVar2 != null) {
                zskVar2.a();
            }
            g9i g9iVar = this.o;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            this.o = null;
            return;
        }
        setOddsState(xmdVar);
        setOddsVisible(true);
        this.m.l(fgfVar);
        tld tldVar = xmdVar.e;
        if (tldVar.a) {
            str2 = "affiliate_button";
        } else if (tldVar.c) {
            str = "bet_boost_button";
            if (xmdVar.b != null || Intrinsics.c(str, "bet_boost_button") || (zskVar = this.l) == null) {
                return;
            }
            zskVar.b(this, new m61(this, xmdVar, fgfVar, str, 8), new go7(13));
            return;
        }
        str = str2;
        if (xmdVar.b != null) {
        }
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        g9i g9iVar = this.o;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
    }

    @Override // defpackage.rq4
    public final void onStop(u6b u6bVar) {
        zsk zskVar = this.l;
        if (zskVar != null) {
            zskVar.a();
        }
    }

    public final void setAction(@Nullable Function1<? super zkd, Unit> function1) {
        this.action = function1;
    }

    public final void setBackgroundColor(@NotNull Function2<? super of3, ? super Integer, r13> function2) {
        function2.getClass();
        this.backgroundColor = function2;
    }

    public void setLocation(@NotNull vmd vmdVar) {
        vmdVar.getClass();
        this.location = vmdVar;
    }

    public final void setNatsSocket(@NotNull s5d s5dVar) {
        s5dVar.getClass();
        this.natsSocket = s5dVar;
    }

    public final void setOddsState(@Nullable xmd xmdVar) {
        ((eoh) this.oddsState).setValue(xmdVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeaturedOddsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    public /* synthetic */ FeaturedOddsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
