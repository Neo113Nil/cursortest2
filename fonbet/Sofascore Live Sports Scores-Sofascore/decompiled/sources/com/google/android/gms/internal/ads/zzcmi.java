package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.cun;
import defpackage.ddb;
import defpackage.fjn;
import defpackage.fsn;
import defpackage.nkn;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcmi extends FrameLayout implements zzclm {
    public final n a;
    public final zzchu b;
    public final AtomicBoolean c;

    public zzcmi(n nVar, zzeaj zzeajVar) {
        super(nVar.getContext());
        this.c = new AtomicBoolean();
        this.a = nVar;
        this.b = new zzchu(nVar.a.c, this, this, zzeajVar);
        addView(nVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void A(zzbff zzbffVar) {
        this.a.A(zzbffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final zzbgt B() {
        return this.a.B();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void C(zzbgt zzbgtVar) {
        this.a.C(zzbgtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void D(String str, zzcjs zzcjsVar) {
        this.a.D(str, zzcjsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final ddb E() {
        return this.a.E();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void F(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.a.F(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void G(String str, String str2) {
        this.a.G(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void H(Context context) {
        this.a.H(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void I(int i, boolean z, boolean z2) {
        this.a.I(i, z, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void J(zzcnw zzcnwVar) {
        this.a.J(zzcnwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void K(boolean z) {
        this.a.K(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void L(long j, boolean z) {
        this.a.L(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void M() {
        n nVar = this.a;
        if (nVar != null) {
            nVar.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void N(boolean z, int i, String str, boolean z2, String str2) {
        this.a.N(z, i, str, z2, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void O() {
        n nVar = this.a;
        if (nVar != null) {
            nVar.O();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void P(String str, zzbqh zzbqhVar) {
        this.a.P(str, zzbqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void Q(int i) {
        this.a.Q(i);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final boolean R(int i, boolean z) {
        if (!this.c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.C1)).booleanValue()) {
            return false;
        }
        n nVar = this.a;
        if (nVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) nVar.getParent()).removeView(nVar);
        }
        nVar.R(i, z);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void S(boolean z) {
        this.a.n.E = z;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void T(String str, zzbqh zzbqhVar) {
        this.a.T(str, zzbqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void U() {
        this.a.b0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void V(boolean z) {
        this.a.V(z);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void W(zzdux zzduxVar) {
        this.a.W(zzduxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void X(String str, fjn fjnVar) {
        this.a.X(str, fjnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void Y(int i) {
        this.a.Y(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void Z(String str, String str2) {
        this.a.Z(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final zzemj a() {
        return this.a.a();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final Context b() {
        return this.a.a.c;
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void b0(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        this.a.b0(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void c(String str, String str2) {
        this.a.c("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final boolean canGoBack() {
        return this.a.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final boolean d() {
        return this.a.d();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void d0(boolean z) {
        this.a.d0(z);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void destroy() {
        zzemj a;
        n nVar = this.a;
        zzeml s = nVar.s();
        if (s != null) {
            zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzgbpVar.post(new fsn(s, 7));
            zzgbpVar.postDelayed(new cun(nVar, 1), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r6)).intValue());
        } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t6)).booleanValue() || (a = nVar.a()) == null) {
            nVar.destroy();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new nkn(this, a, false, 8));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcld
    public final zzfld e() {
        return this.a.j;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void e0(int i, boolean z) {
        this.a.e0(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void f() {
        this.a.f();
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void f0(zzcms zzcmsVar) {
        this.a.f0(zzcmsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcmt
    public final zzflg g() {
        return this.a.k;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void g0(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.a.g0(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void goBack() {
        this.a.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void h(String str, JSONObject jSONObject) {
        this.a.c(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void h0(zzemj zzemjVar) {
        this.a.h0(zzemjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final boolean i() {
        return this.a.i();
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void i0(int i, String str, boolean z, boolean z2, boolean z3) {
        this.a.i0(i, str, z, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final int j() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.T4)).booleanValue() ? this.a.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void j0(zzeml zzemlVar) {
        this.a.j0(zzemlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void k() {
        setBackgroundColor(0);
        this.a.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void k0(zzbmi zzbmiVar) {
        this.a.k0(zzbmiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void l() {
        this.a.l();
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final zzchu l0() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void loadData(String str, String str2, String str3) {
        this.a.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.a.loadDataWithBaseURL(str, str2, "text/html", C.UTF8_NAME, null);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void loadUrl(String str) {
        this.a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final String m() {
        return this.a.m();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void m0(zzfld zzfldVar, zzflg zzflgVar) {
        n nVar = this.a;
        nVar.j = zzfldVar;
        nVar.k = zzflgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void n(String str, Map map) {
        this.a.n(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void n0(int i) {
        this.a.n0(i);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void o() {
        this.a.o();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void o0(boolean z) {
        this.a.o0(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        n nVar = this.a;
        if (nVar != null) {
            nVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void onPause() {
        zzchl zzchlVar;
        zzchu zzchuVar = this.b;
        zzchuVar.getClass();
        Preconditions.e("onPause must be called from the UI thread.");
        zzcht zzchtVar = zzchuVar.e;
        if (zzchtVar != null && (zzchlVar = zzchtVar.g) != null) {
            zzchlVar.m();
        }
        this.a.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void onResume() {
        this.a.onResume();
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcnf
    public final zzbbd p() {
        return this.a.b;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final boolean q() {
        return this.a.q();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void r() {
        zzeml s;
        zzemj a;
        n nVar = this.a;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzc();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzB());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t6)).booleanValue() || (a = nVar.a()) == null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.s6)).booleanValue() && (s = nVar.s()) != null && s.b.g == zzfvp.HTML) {
                com.google.android.gms.ads.internal.zzt.zzu().b(s.a, textView);
                return;
            }
            return;
        }
        synchronized (a) {
            zzfvy zzfvyVar = a.f;
            if (zzfvyVar != null) {
                com.google.android.gms.ads.internal.zzt.zzu().a(zzfvyVar, textView);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final zzeml s() {
        return this.a.s();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzclm
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzclm
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.a.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.a.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.a.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void t(String str, JSONObject jSONObject) {
        this.a.t(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void u() {
        zzchu zzchuVar = this.b;
        zzchuVar.getClass();
        Preconditions.e("onDestroy must be called from the UI thread.");
        zzcht zzchtVar = zzchuVar.e;
        if (zzchtVar != null) {
            zzchtVar.e.a();
            zzchl zzchlVar = zzchtVar.g;
            if (zzchlVar != null) {
                zzchlVar.k();
            }
            zzchtVar.d();
            zzchuVar.c.removeView(zzchuVar.e);
            zzchuVar.e = null;
        }
        this.a.u();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void v() {
        this.a.v();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final com.google.android.gms.ads.internal.overlay.zzm w() {
        return this.a.w();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final boolean x() {
        return this.c.get();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final boolean y() {
        return this.a.y();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final zzbmi z() {
        return this.a.z();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final WebView zzD() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final ArrayList zzF() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.a) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzJ() {
        this.a.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.a.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final zzcnw zzN() {
        return this.a.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final zzclx zzP() {
        return this.a.n;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final boolean zzR() {
        return this.a.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final zzfma zzT() {
        return this.a.c;
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zza(String str) {
        this.a.q0(str);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdk() {
        this.a.zzdk();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdl() {
        this.a.zzdl();
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcif
    public final zzcms zzh() {
        return this.a.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final zzbjs zzi() {
        return this.a.J;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final Activity zzj() {
        return this.a.a.a;
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcif
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.a.g;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void zzl() {
        this.a.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final String zzn() {
        return this.a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final int zzp() {
        return this.a.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final zzbjt zzq() {
        return this.a.L;
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcng, com.google.android.gms.internal.ads.zzcif
    public final VersionInfoParcel zzs() {
        return this.a.e;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void zzv(int i) {
        zzcht zzchtVar = this.b.e;
        if (zzchtVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.y0)).booleanValue()) {
                zzchtVar.b.setBackgroundColor(i);
                zzchtVar.c.setBackgroundColor(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final int zzx() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.T4)).booleanValue() ? this.a.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void zzz() {
        this.a.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcnh
    public final View zzE() {
        return this;
    }
}
