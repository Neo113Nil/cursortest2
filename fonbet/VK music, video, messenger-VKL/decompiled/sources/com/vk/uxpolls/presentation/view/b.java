package com.vk.uxpolls.presentation.view;

import android.webkit.WebResourceError;
import android.webkit.WebResourceResponse;
import com.vk.uxpolls.api.models.UxPollsAnswer;
import com.vk.uxpolls.api.models.UxPollsPoll;
import com.vk.uxpolls.domain.exception.LoadWebAppError;
import com.vk.uxpolls.domain.exception.WebAppUrlEmptyError;
import com.vk.uxpolls.presentation.js.model.UxPollsSetHeight;
import com.vk.uxpolls.presentation.view.a;
import java.util.List;
import xsna.bpn0;
import xsna.cvt0;
import xsna.drm0;
import xsna.dub0;
import xsna.gx1;
import xsna.hqt;
import xsna.izs;
import xsna.kx1;
import xsna.ofy0;
import xsna.s3q0;
import xsna.utk0;
import xsna.vtk0;
import xsna.w910;
import xsna.wtb0;
import xsna.ytb0;
import xsna.znk0;

/* compiled from: UxPollsManagerImpl.kt */
/* loaded from: classes6.dex */
public final class b implements wtb0, a {
    public final kx1 a;
    public final ofy0 b;
    public final ytb0 c;
    public dub0 d;
    public com.vk.uxpolls.presentation.js.model.a f;
    public final cvt0 e = new cvt0(0);
    public final utk0 g = vtk0.a(a.AbstractC1943a.d.a);
    public final utk0 h = vtk0.a(null);

    public b(kx1 kx1Var, ofy0 ofy0Var, ytb0 ytb0Var) {
        this.a = kx1Var;
        this.b = ofy0Var;
        this.c = ytb0Var;
    }

    @Override // xsna.wtb0
    public final void a(List<String> list, boolean z, izs<? super com.vk.uxpolls.presentation.js.model.a, s3q0> izsVar) {
        this.c.a(list, z, izsVar);
    }

    @Override // com.vk.uxpolls.presentation.view.a
    public final void b(dub0 dub0Var) {
        this.d = dub0Var;
    }

    @Override // xsna.wtb0
    public final void c(List list, w910 w910Var) {
        this.c.c(list, w910Var);
    }

    @Override // com.vk.uxpolls.presentation.view.a
    public final void d(com.vk.uxpolls.presentation.js.model.a aVar) {
        this.f = aVar;
        this.a.b = aVar;
        this.h.setValue(aVar);
    }

    @Override // com.vk.uxpolls.presentation.view.a
    public final utk0 e() {
        return this.g;
    }

    @Override // com.vk.uxpolls.presentation.view.a
    public final utk0 f() {
        return this.h;
    }

    @Override // xsna.lix0
    public final void g(WebResourceResponse webResourceResponse) {
        dub0 dub0Var = this.d;
        if (dub0Var != null) {
            StringBuilder sb = new StringBuilder("Unable to load WebApp: ");
            sb.append(webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null);
            dub0Var.J6(new LoadWebAppError(sb.toString()));
        }
        this.g.setValue(a.AbstractC1943a.C1944a.a);
    }

    @Override // xsna.lix0
    public final void h() {
        this.g.setValue(a.AbstractC1943a.b.C1946b.a);
    }

    @Override // xsna.lix0
    public final void i(WebResourceError webResourceError) {
        dub0 dub0Var = this.d;
        if (dub0Var != null) {
            StringBuilder sb = new StringBuilder("Unable to load WebApp: ");
            sb.append((Object) (webResourceError != null ? webResourceError.getDescription() : null));
            dub0Var.J6(new LoadWebAppError(sb.toString()));
        }
        this.g.setValue(a.AbstractC1943a.C1944a.a);
    }

    @Override // xsna.o2y
    public final void i1() {
        dub0 dub0Var = this.d;
        if (dub0Var != null) {
            dub0Var.i1();
        }
    }

    public final void j(gx1 gx1Var) {
        this.a.a(gx1Var);
    }

    @Override // xsna.o2y
    public final void j1(List<UxPollsAnswer> list) {
        dub0 dub0Var = this.d;
        if (dub0Var != null) {
            dub0Var.A9();
        }
        j(new gx1.b(list));
    }

    @Override // xsna.o2y
    public final void k1() {
        UxPollsPoll uxPollsPoll;
        dub0 dub0Var = this.d;
        if (dub0Var != null) {
            dub0Var.Gk();
        }
        cvt0 cvt0Var = this.e;
        cvt0Var.b = true;
        if (cvt0Var.a) {
            this.a.a(gx1.c.a);
        }
        com.vk.uxpolls.presentation.js.model.a aVar = this.f;
        if (aVar == null || (uxPollsPoll = aVar.a) == null) {
            return;
        }
        a.AbstractC1943a.b.C1945a c1945a = new a.AbstractC1943a.b.C1945a(uxPollsPoll.getId());
        utk0 utk0Var = this.g;
        utk0Var.getClass();
        utk0Var.i(null, c1945a);
    }

    @Override // xsna.o2y
    public final void l1(UxPollsSetHeight uxPollsSetHeight) {
        dub0 dub0Var = this.d;
        if (dub0Var != null) {
            dub0Var.v9(uxPollsSetHeight.getHeight());
        }
    }

    @Override // com.vk.uxpolls.presentation.view.a
    public final void load() {
        boolean C = znk0.C();
        utk0 utk0Var = this.g;
        if (!C) {
            onError(new LoadWebAppError("Web app is not configured"));
            utk0Var.setValue(a.AbstractC1943a.C1944a.a);
            return;
        }
        a.AbstractC1943a abstractC1943a = (a.AbstractC1943a) utk0Var.getValue();
        if ((abstractC1943a instanceof a.AbstractC1943a.d) || (abstractC1943a instanceof a.AbstractC1943a.C1944a)) {
            String str = (String) ((hqt) ((bpn0) this.b.c).getValue()).a();
            if (drm0.N(str)) {
                str = null;
            }
            if (str == null) {
                onError(new WebAppUrlEmptyError());
                return;
            }
            a.AbstractC1943a.c cVar = new a.AbstractC1943a.c(str);
            utk0Var.getClass();
            utk0Var.i(null, cVar);
        }
    }

    @Override // xsna.o2y
    public final void m1() {
        dub0 dub0Var = this.d;
        if (dub0Var != null) {
            dub0Var.on();
        }
        j(gx1.a.a);
    }

    @Override // com.vk.uxpolls.presentation.view.a
    public final void onError(Throwable th) {
        dub0 dub0Var = this.d;
        if (dub0Var != null) {
            dub0Var.J6(th);
        }
    }
}
