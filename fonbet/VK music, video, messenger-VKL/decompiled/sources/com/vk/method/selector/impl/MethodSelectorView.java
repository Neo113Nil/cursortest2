package com.vk.method.selector.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertController;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n0;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.auth.smartflow.api.SmartflowComponent;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.method.selector.impl.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.ae8;
import xsna.ai6;
import xsna.ak20;
import xsna.b0u0;
import xsna.dge;
import xsna.drm0;
import xsna.e3m;
import xsna.eeu0;
import xsna.ehg;
import xsna.f4m;
import xsna.f550;
import xsna.f5x;
import xsna.fpf0;
import xsna.gzs;
import xsna.hj60;
import xsna.hnj;
import xsna.iah0;
import xsna.iut0;
import xsna.k7m;
import xsna.lj20;
import xsna.m1y;
import xsna.m7m;
import xsna.mnh0;
import xsna.mv;
import xsna.oj20;
import xsna.otu0;
import xsna.oyr;
import xsna.r86;
import xsna.rj20;
import xsna.rnr0;
import xsna.s3q0;
import xsna.s86;
import xsna.tcg;
import xsna.uj20;
import xsna.vgg;
import xsna.vk20;
import xsna.wcl;
import xsna.wj20;
import xsna.ygg;
import xsna.zf20;

/* compiled from: MethodSelectorView.kt */
/* loaded from: classes3.dex */
public final class MethodSelectorView extends FrameLayout implements uj20 {
    public static final /* synthetic */ int g = 0;
    public final RecyclerView b;
    public final lj20 c;
    public final FrameLayout d;
    public gzs<s3q0> e;
    public final b f;

    public MethodSelectorView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        this.f = new b(getContext(), ((SmartflowComponent) ((k7m) m7m.c(this)).mo408a(fpf0.a(SmartflowComponent.class))).c(), new otu0());
        ProgressBar progressBar = new ProgressBar(getContext());
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        progressBar.setId(View.generateViewId());
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_medium, progressBar.getContext())));
        progressBar.setIndeterminateTintMode(PorterDuff.Mode.SRC_IN);
        float f = 32;
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f), 17));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(View.generateViewId());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, iah0.a(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE)));
        f4m.j(frameLayout);
        this.d = frameLayout;
        lj20 lj20Var = new lj20(new rnr0());
        lj20Var.c = null;
        this.c = lj20Var;
        RecyclerView recyclerView = new RecyclerView(getContext(), attributeSet, 0);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(lj20Var);
        recyclerView.setNestedScrollingEnabled(false);
        ((n0) recyclerView.getItemAnimator()).g = false;
        this.b = recyclerView;
        frameLayout.addView(progressBar);
        addView(frameLayout);
        f4m.j(frameLayout);
        addView(recyclerView);
    }

    @Override // xsna.dhg
    public final ehg Mb() {
        return new wcl(getContext());
    }

    @Override // xsna.sjm
    public final void U2(String str, String str2, String str3, gzs<s3q0> gzsVar, String str4, gzs<s3q0> gzsVar2, boolean z, gzs<s3q0> gzsVar3, gzs<s3q0> gzsVar4) {
        Activity h = e3m.h(getContext());
        if (h != null) {
            eeu0.a aVar = new eeu0.a(h);
            aVar.c = z;
            aVar.setTitle(str);
            AlertController.b bVar = aVar.a;
            bVar.f = str2;
            aVar.j(str3, new tcg(1, gzsVar));
            bVar.n = new r86(gzsVar3, 2);
            aVar.i(new s86(gzsVar4, 1));
            if (str4 != null) {
                aVar.f(str4, new mv(gzsVar2, 3));
            }
            aVar.m();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f;
        bVar.h = this;
        setState(bVar.o);
        ak20 ak20Var = bVar.a;
        String str = bVar.c;
        if (str == null) {
            throw new IllegalArgumentException("Sid must be set in order to make network requests.");
        }
        bVar.m.b(mnh0.C(ak20Var.a(str).m(io.reactivex.rxjava3.android.schedulers.a.b()), (ygg) bVar.b.getValue(), new ae8(bVar), new ai6(bVar, 5), null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f;
        bVar.m.dispose();
        vk20 vk20Var = bVar.k;
        if (vk20Var != null) {
            vk20Var.cancel();
        }
        c cVar = bVar.p;
        cVar.getClass();
        c.b(cVar, new m1y(cVar, 5), 2);
    }

    public void setIsOkMimicry(boolean z) {
        this.f.d = z;
    }

    public final void setListUpdatedListener(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
    }

    public void setLogin(String str) {
        this.f.e = str;
    }

    public final void setOnHelpClickListener(gzs<s3q0> gzsVar) {
        this.c.d = gzsVar;
    }

    public void setOnMethodSelectorErrorListener(wj20 wj20Var) {
        this.f.i = wj20Var;
    }

    public void setOnMethodSelectorListener(rj20 rj20Var) {
        this.c.c = new dge(this, rj20Var);
    }

    public void setSelectedType(VerificationMethodTypes verificationMethodTypes) {
        this.f.f = verificationMethodTypes;
    }

    public void setSid(String str) {
        this.f.c = str;
    }

    @Override // xsna.uj20
    public void setState(a aVar) {
        boolean z = aVar instanceof a.c;
        FrameLayout frameLayout = this.d;
        RecyclerView recyclerView = this.b;
        if (z) {
            frameLayout.setVisibility(0);
            f4m.j(recyclerView);
            return;
        }
        if (aVar instanceof a.b) {
            f4m.j(frameLayout);
            recyclerView.setVisibility(0);
            this.c.submitList(((a.b) aVar).a);
            gzs<s3q0> gzsVar = this.e;
            if (gzsVar != null) {
                gzsVar.invoke();
                return;
            }
            return;
        }
        if (!(aVar instanceof a.AbstractC1275a)) {
            throw new NoWhenBranchMatchedException();
        }
        a.AbstractC1275a abstractC1275a = (a.AbstractC1275a) aVar;
        vgg vggVar = abstractC1275a.a;
        boolean z2 = abstractC1275a instanceof a.AbstractC1275a.d;
        b bVar = this.f;
        if (z2) {
            if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                MethodSelectorView methodSelectorView = bVar.h;
                String str = bVar.e;
                Object obj = null;
                String obj2 = str != null ? drm0.p0(str).toString() : null;
                Context context = bVar.g;
                com.vk.registration.funnels.b.a.getClass();
                com.vk.registration.funnels.b.p();
                if (methodSelectorView != null) {
                    methodSelectorView.U2(context.getString(R.string.vk_otp_method_selection_code_entering_no_available_methods_title), context.getString(R.string.vk_otp_method_selection_code_entering_no_available_methods_subtitle), context.getString(R.string.vk_otp_method_selection_code_entering_no_available_methods_restore_button_title), new zf20(obj2, 9), context.getString(R.string.close), new hj60(obj, 3), false, new f550(obj, 6), new f5x(obj, 23));
                }
                s3q0 s3q0Var = s3q0.a;
            } else {
                vggVar.c();
            }
        } else {
            if (!(abstractC1275a instanceof a.AbstractC1275a.c) && !(abstractC1275a instanceof a.AbstractC1275a.e) && !(abstractC1275a instanceof a.AbstractC1275a.b) && !(abstractC1275a instanceof a.AbstractC1275a.C1276a)) {
                throw new NoWhenBranchMatchedException();
            }
            vggVar.c();
        }
        wj20 wj20Var = bVar.i;
        if (wj20Var != null) {
            oj20 oj20Var = (oj20) ((oyr) wj20Var).c;
            oj20Var.Mn();
            rj20 rj20Var = oj20Var.C;
            if (rj20Var != null) {
                rj20Var.a();
            }
        }
    }
}
