package com.vk.superapp.verification.account;

import android.net.Uri;
import com.vk.api.generated.accountVerification.dto.AccountVerificationGetSessionInfoPlatformDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.verification.account.VerificationFlow;
import com.vk.superapp.verification.account.b;
import io.reactivex.rxjava3.core.x;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a0a;
import xsna.bee;
import xsna.bpt0;
import xsna.cl30;
import xsna.e370;
import xsna.epx;
import xsna.gyo0;
import xsna.izs;
import xsna.lw30;
import xsna.nvm0;
import xsna.par0;
import xsna.qtq0;
import xsna.r55;
import xsna.s3q0;
import xsna.sn;
import xsna.sxl0;
import xsna.tyv0;
import xsna.ujm0;
import xsna.vdx0;
import xsna.wau0;
import xsna.wbu0;
import xsna.wmc;
import xsna.xen0;

/* compiled from: VkVerificationByOAuthServicePresenter.kt */
/* loaded from: classes6.dex */
public class f extends tyv0 {
    public final b.i h;
    public final VerificationFlow i;
    public g j;
    public final String k;
    public b l;

    /* compiled from: VkVerificationByOAuthServicePresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            f.k((f) this.receiver, th);
            return s3q0.a;
        }
    }

    public f(VkOAuthService vkOAuthService, b.i iVar, VerificationFlow verificationFlow) {
        super(new e(true, vkOAuthService), true);
        this.h = iVar;
        this.i = verificationFlow;
        this.k = String.valueOf(vkOAuthService.i());
        this.l = b.j.h;
    }

    public static final void k(f fVar, Throwable th) {
        b.i iVar = fVar.h;
        VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
        Integer valueOf = vKApiExecutionException != null ? Integer.valueOf(vKApiExecutionException.s()) : null;
        if (valueOf != null && valueOf.intValue() == 8206) {
            fVar.l(iVar.c());
            return;
        }
        if ((valueOf != null && valueOf.intValue() == 8202) || ((valueOf != null && valueOf.intValue() == 8209) || (valueOf != null && valueOf.intValue() == 8203))) {
            fVar.l(iVar.b());
        } else {
            r55 r55Var = r55.a;
            fVar.i(wbu0.a(r55.a(), th, true));
        }
    }

    @Override // xsna.tyv0, xsna.kyv0
    public final void a() {
        super.a();
        b bVar = this.l;
        if (bVar instanceof b.C1911b) {
            m();
            return;
        }
        if (bVar instanceof b.k) {
            d dVar = this.e;
            if (dVar != null) {
                dVar.close();
                return;
            }
            return;
        }
        if (bVar instanceof b.l) {
            g gVar = this.j;
            List<b.f> list = gVar != null ? gVar.d : null;
            if (list != null) {
                l(this.h.d(list));
                return;
            }
            d dVar2 = this.e;
            if (dVar2 != null) {
                dVar2.close();
                return;
            }
            return;
        }
        if (!(bVar instanceof b.e)) {
            par0 par0Var = par0.a;
            String str = "Impossible action. There was a call to onPrimaryButtonClick for " + this.l;
            par0Var.getClass();
            par0.b(str);
            return;
        }
        d dVar3 = this.e;
        if (dVar3 != null) {
            dVar3.In(Uri.parse("https://m." + a0a.d + "/faq20573"));
        }
    }

    @Override // xsna.tyv0, xsna.kyv0
    public final void b() {
        x b;
        super.b();
        b bVar = this.l;
        if ((bVar instanceof b.g) || (bVar instanceof b.h) || (bVar instanceof b.l) || (bVar instanceof b.e)) {
            d dVar = this.e;
            if (dVar != null) {
                dVar.close();
                return;
            }
            return;
        }
        if (!(bVar instanceof b.C1911b)) {
            par0 par0Var = par0.a;
            String str = "Impossible action. There was a call to onSecondaryButtonClick for " + this.l;
            par0Var.getClass();
            par0.b(str);
            return;
        }
        String str2 = this.c;
        if (str2 == null) {
            h();
            return;
        }
        g gVar = this.j;
        Boolean bool = gVar != null ? Boolean.TRUE : null;
        String str3 = gVar != null ? gVar.a : null;
        Boolean bool2 = Boolean.TRUE;
        if (!epx.f(bool, bool2) || str3 == null) {
            b = (epx.f(bool, bool2) && str3 == null) ? sn.b("Sid must not be null") : x.k(bool2);
        } else {
            vdx0 vdx0Var = e370.e;
            b = (vdx0Var != null ? vdx0Var : null).b().c(str3, str2, this.k);
        }
        this.f.b(j(b).subscribe(new qtq0(new ujm0(this, 18), 6), new cl30(new wmc(1, this, f.class, "processError", "processError(Ljava/lang/Throwable;)V", 0, 8), 20)));
    }

    @Override // xsna.kyv0
    public final void c() {
        l(this.h.e());
    }

    @Override // xsna.kyv0
    public final void d(String str, String str2, String str3) {
        AccountVerificationGetSessionInfoPlatformDto accountVerificationGetSessionInfoPlatformDto = this.i instanceof VerificationFlow.App2App ? AccountVerificationGetSessionInfoPlatformDto.MOBILE_APP2APP : AccountVerificationGetSessionInfoPlatformDto.MOBILE;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.f.b(j(vdx0Var.b().b(str, str2, this.k, str3, accountVerificationGetSessionInfoPlatformDto)).subscribe(new nvm0(new gyo0(this, 14), 11), new wau0(new bee(1, this, f.class, "processError", "processError(Ljava/lang/Throwable;)V", 0, 7), 4)));
    }

    @Override // xsna.kyv0
    public final void e() {
        d dVar = this.e;
        if (dVar != null) {
            dVar.Hn();
        }
    }

    @Override // xsna.tyv0
    public final void f(String str) {
        SchemeStatSak$TypeVkConnectNavigationItem.EventType eventType = SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO;
        e eVar = this.a;
        e.c(eVar, eventType, eVar.a(), SchemeStatSak$EventScreen.OTHER, SchemeStatSak$EventScreen.NOWHERE, null, 36);
        this.c = str;
        g gVar = this.j;
        if (gVar == null) {
            l(b.j.h);
            return;
        }
        List<b.f> list = gVar.d;
        if (list.isEmpty()) {
            m();
        } else {
            l(this.h.d(list));
        }
    }

    @Override // xsna.tyv0
    public final b g() {
        return this.l;
    }

    public final void l(b bVar) {
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = this.l.g;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen2 = bVar.g;
        SchemeStatSak$TypeVkConnectNavigationItem.EventType eventType = SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO;
        e eVar = this.a;
        e.c(eVar, eventType, eVar.a(), schemeStatSak$EventScreen, schemeStatSak$EventScreen2, null, 36);
        this.l = bVar;
        d dVar = this.e;
        if (dVar != null) {
            dVar.Jn(bVar);
        }
    }

    public final void m() {
        x a2;
        String str = this.c;
        if (str == null) {
            h();
            return;
        }
        g gVar = this.j;
        Boolean bool = gVar != null ? Boolean.TRUE : null;
        String str2 = gVar != null ? gVar.a : null;
        Boolean bool2 = Boolean.TRUE;
        boolean f = epx.f(bool, bool2);
        String str3 = this.k;
        if (f && str2 != null) {
            vdx0 vdx0Var = e370.e;
            a2 = (vdx0Var != null ? vdx0Var : null).b().a(str2, str, str3);
        } else if (epx.f(bool, bool2) && str2 == null) {
            a2 = sn.b("Sid must not be null");
        } else {
            vdx0 vdx0Var2 = e370.e;
            xen0 b = (vdx0Var2 != null ? vdx0Var2 : null).b();
            if (str2 == null) {
                str2 = "";
            }
            a2 = b.a(str2, str, str3);
        }
        this.f.b(j(a2).subscribe(new lw30(new sxl0(this, 14), 20), new bpt0(new a(1, this, f.class, "processError", "processError(Ljava/lang/Throwable;)V", 0), 3)));
    }
}
