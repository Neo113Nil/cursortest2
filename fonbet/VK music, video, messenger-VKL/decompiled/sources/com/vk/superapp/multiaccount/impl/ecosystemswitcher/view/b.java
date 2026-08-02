package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.stat.sak.scheme.SchemeStatSak$EcosystemNavigationItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkidEcosystemNavigationItem;
import com.vk.superapp.bridges.dto.LkPage;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.superapp.multiaccount.api.UserSecurityStatus;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.c;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.d;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.g;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h;
import com.vkontakte.android.R;
import defpackage.s;
import defpackage.z;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.ayo;
import xsna.b3i0;
import xsna.c40;
import xsna.epx;
import xsna.exo;
import xsna.f4z;
import xsna.fhq0;
import xsna.g70;
import xsna.hg1;
import xsna.i340;
import xsna.j41;
import xsna.j5g;
import xsna.lwh;
import xsna.m200;
import xsna.mui0;
import xsna.rlh;
import xsna.usi0;
import xsna.vj;
import xsna.wk50;
import xsna.wxo;
import xsna.x97;
import xsna.xxo;
import xsna.yxo;
import xsna.zxo;

/* compiled from: EcosystemProfileFeature.kt */
/* loaded from: classes6.dex */
public final class b extends wk50<i, h, a, d> {
    public final i340 f;
    public final mui0 g;
    public final c h;
    public final b3i0 i;
    public final SwitcherUiMode j;
    public final wxo k;
    public final f4z l;

    public b(i340 i340Var, mui0 mui0Var, c cVar, b3i0 b3i0Var, SwitcherUiMode switcherUiMode, wxo wxoVar) {
        super(a.C1894a.b, new e(new h(new h.a.b(exo.c), new xxo(null, 31))));
        this.f = i340Var;
        this.g = mui0Var;
        this.h = cVar;
        this.i = b3i0Var;
        this.j = switcherUiMode;
        this.k = wxoVar;
        this.l = new f4z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0206, code lost:
    
        if (r0.a == false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(h hVar, a aVar) {
        Integer valueOf;
        vj a;
        String str;
        UserId userId;
        Object obj;
        UserId userId2;
        com.vk.superapp.multiaccount.api.g a2;
        h hVar2 = hVar;
        a aVar2 = aVar;
        xxo xxoVar = hVar2.c;
        boolean z = aVar2 instanceof a.C1894a;
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        c cVar = this.h;
        i340 i340Var = this.f;
        wxo wxoVar = this.k;
        if (z) {
            if (!(this.j instanceof SwitcherUiMode.EcoplateRestricted)) {
                wxoVar.getClass();
                wxo.a(wxoVar, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.OPEN, null, 6);
            }
            if (cVar instanceof c.a) {
                return;
            }
            bVar.b(hg1.h(new c0(i340Var.e.a0(io.reactivex.rxjava3.android.schedulers.a.b()), new c40(new zxo(this, 0), 19), kVar).F(new j41(new ayo(this, 0), 15)), new lwh(this, 6)));
            return;
        }
        boolean z2 = aVar2 instanceof a.b;
        mui0 mui0Var = this.g;
        if (z2) {
            com.vk.superapp.multiaccount.api.f fVar = (com.vk.superapp.multiaccount.api.f) j5g.a0(i340Var.d());
            fhq0 fhq0Var = (fVar == null || (a2 = fVar.a()) == null) ? null : new fhq0(a2.b, a2.m);
            if (fhq0Var == null || (userId = fhq0Var.a) == null) {
                userId = UserId.d;
            }
            Iterator it = mui0Var.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                usi0.a aVar3 = (usi0.a) obj;
                if (!epx.f(aVar3.c().a, userId) && aVar3.c().b != AccountProfileType.RELATED) {
                    break;
                }
            }
            usi0.a aVar4 = (usi0.a) obj;
            fhq0 c = aVar4 != null ? aVar4.c() : null;
            if (c == null || (userId2 = c.a) == null) {
                userId2 = UserId.d;
            }
            bVar.b(hg1.h(new c0(new s0(new yxo(0, userId, userId2)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new z(new rlh(this, 6), 21), kVar).G(new x97(this, 2)), new s(11, this, userId)));
            return;
        }
        boolean z3 = aVar2 instanceof a.c;
        f4z f4zVar = this.l;
        if (z3) {
            wxoVar.getClass();
            wxo.a(wxoVar, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.LOGOUT, null, 6);
            f4zVar.b(g.c.a);
            return;
        }
        if (aVar2 instanceof a.d) {
            h.a aVar5 = hVar2.b;
            if ((aVar5 instanceof h.a.c) && epx.f(((h.a.c) aVar5).a.a().o, Boolean.TRUE)) {
                return;
            }
            if (xxoVar.a instanceof g70) {
                f4zVar.b(g.a.a);
                return;
            }
            com.vk.superapp.multiaccount.api.f fVar2 = (com.vk.superapp.multiaccount.api.f) j5g.a0(i340Var.d());
            if (fVar2 != null) {
                UserSecurityStatus.a aVar6 = UserSecurityStatus.Companion;
                Integer num = fVar2.a().j;
                aVar6.getClass();
                int i = b3i0.a.$EnumSwitchMapping$0[UserSecurityStatus.a.a(num).ordinal()];
                if (i == 1 || i == 2) {
                    SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem = SchemeStatSak$EcosystemNavigationItem.AVATAR;
                    wxoVar.getClass();
                    wxo.a(wxoVar, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.TAP, schemeStatSak$EcosystemNavigationItem, 4);
                    usi0.a i2 = mui0Var.i();
                    if (i2 == null || (a = i2.a()) == null || (str = a.a) == null) {
                        return;
                    }
                    f4zVar.b(new g.d(str, LkPage.RECOMMENDATIONS));
                    return;
                }
                return;
            }
            return;
        }
        if (aVar2 instanceof a.e) {
            T(new d.b(0));
            i340Var.c();
            return;
        }
        if (aVar2 instanceof a.i) {
            xxo xxoVar2 = ((a.i) aVar2).b;
            wxoVar.g = xxoVar2.a;
            T(new d.c(xxoVar2));
            return;
        }
        if (aVar2 instanceof a.f) {
            T(new d.a(((a.f) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.g) {
            T(new d.b(((a.g) aVar2).b));
            return;
        }
        if (!(aVar2 instanceof a.h)) {
            throw new NoWhenBranchMatchedException();
        }
        com.vk.superapp.multiaccount.api.f fVar3 = ((a.h) aVar2).b;
        boolean z4 = xxoVar.c;
        T(new d.C1895d(fVar3));
        if (!z4) {
            return;
        }
        boolean z5 = cVar instanceof c.a;
        b3i0 b3i0Var = this.i;
        if (!z5) {
            b3i0Var.getClass();
        }
        Integer num2 = fVar3.a().j;
        if (!Preference.f("multi_account_security_notification_settings_prefs").getBoolean(String.valueOf(num2), false)) {
            Preference.f("multi_account_security_notification_settings_prefs").edit().putBoolean(String.valueOf(num2), true).apply();
            UserSecurityStatus.a aVar7 = UserSecurityStatus.Companion;
            Integer num3 = fVar3.a().j;
            aVar7.getClass();
            UserSecurityStatus a3 = UserSecurityStatus.a.a(num3);
            b3i0Var.getClass();
            int i3 = b3i0.a.$EnumSwitchMapping$0[a3.ordinal()];
            valueOf = i3 != 1 ? i3 != 2 ? null : Integer.valueOf(R.string.vk_auth_protect_your_account) : Integer.valueOf(R.string.vk_auth_has_recommendations_on_protection);
            if (valueOf != null && z5) {
                b3i0Var.a = true;
            }
            if (valueOf == null) {
                int intValue = valueOf.intValue();
                wxoVar.getClass();
                wxo.a(wxoVar, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.SECURITY_RECOMMENDATION_SHOW, null, 6);
                f4zVar.b(new g.C1896g(intValue));
                return;
            }
            return;
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        wxo wxoVar = this.k;
        wxoVar.getClass();
        wxo.a(wxoVar, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.CLOSE, null, 6);
        m200.c = null;
        super.onDestroy();
    }
}
