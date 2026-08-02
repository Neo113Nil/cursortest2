package com.vk.auth.external;

import android.content.Context;
import android.webkit.WebView;
import com.vk.auth.external.a;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.k;
import io.reactivex.rxjava3.internal.operators.single.n;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.atu0;
import xsna.dqf;
import xsna.e370;
import xsna.epx;
import xsna.izs;
import xsna.r55;
import xsna.s3q0;
import xsna.shd;
import xsna.tsu0;
import xsna.u2k0;
import xsna.usu0;
import xsna.vdx0;
import xsna.vom0;
import xsna.vsu0;
import xsna.vtg0;
import xsna.vyq0;
import xsna.wau0;
import xsna.wdx0;
import xsna.wsu0;
import xsna.wvq0;
import xsna.x2;
import xsna.ysu0;

/* compiled from: VkExternalAuthPresenter.kt */
/* loaded from: classes15.dex */
public final class b implements tsu0 {
    public final Context a;
    public final VkExternalAuthFragment b;
    public final wsu0 c;
    public final usu0 d;
    public a.C0400a e;
    public com.vk.auth.external.a f = a.b.a;
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: VkExternalAuthPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            String str2 = str;
            b bVar = (b) this.receiver;
            bVar.e = null;
            a.b bVar2 = a.b.a;
            bVar.f = bVar2;
            VkExternalAuthFragment vkExternalAuthFragment = bVar.b;
            vkExternalAuthFragment.tn(bVar2);
            WebView webView = vkExternalAuthFragment.h;
            (webView != null ? webView : null).loadUrl(str2);
            return s3q0.a;
        }
    }

    public b(Context context, VkExternalAuthFragment vkExternalAuthFragment, wsu0 wsu0Var, ysu0 ysu0Var) {
        this.a = context;
        this.b = vkExternalAuthFragment;
        this.c = wsu0Var;
        this.d = ysu0Var;
    }

    @Override // xsna.tsu0
    public final void a(int i) {
        boolean z = i >= 100;
        VkExternalAuthFragment vkExternalAuthFragment = this.b;
        if (!z) {
            com.vk.auth.external.a aVar = this.f;
            a.b bVar = a.b.a;
            if (!epx.f(aVar, bVar)) {
                this.f = bVar;
                vkExternalAuthFragment.tn(bVar);
                return;
            }
        }
        if (z) {
            com.vk.auth.external.a aVar2 = this.e;
            if (aVar2 == null) {
                aVar2 = a.c.a;
            }
            this.f = aVar2;
            vkExternalAuthFragment.tn(aVar2);
        }
    }

    @Override // xsna.tsu0
    public final void b(String str) {
        if (str == null) {
            str = "";
        }
        a.C0400a c0400a = new a.C0400a(str);
        this.e = c0400a;
        this.f = c0400a;
        this.b.tn(c0400a);
    }

    public final void c() {
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        if (!wdx0Var.k()) {
            this.d.a();
            return;
        }
        atu0 atu0Var = r55.e;
        wsu0 wsu0Var = this.c;
        int i = wsu0Var.a;
        atu0.a.b bVar = new atu0.a.b(i, wsu0Var.b, wsu0Var.c, wsu0Var.e, wsu0Var.d);
        atu0Var.getClass();
        vdx0 vdx0Var = e370.e;
        this.g.b(new k(new n(x.B(atu0Var.a(i), (vdx0Var != null ? vdx0Var : null).e().f(i, false), new vtg0(new x2(12, atu0Var, bVar), 14)).m(io.reactivex.rxjava3.android.schedulers.a.b()).l(new dqf(vsu0.b, 1)), new wau0(new vyq0(this, 8), 1)), new shd(this, 7)).subscribe(new vom0(new a(1, this, b.class, "loadUrl", "loadUrl(Ljava/lang/String;)V", 0), 4), new wvq0(new u2k0(this, 28), 10)));
    }
}
