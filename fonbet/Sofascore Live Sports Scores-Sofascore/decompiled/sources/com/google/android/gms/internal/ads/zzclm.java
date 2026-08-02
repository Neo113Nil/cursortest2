package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzn;
import defpackage.ddb;
import defpackage.fjn;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzclm extends com.google.android.gms.ads.internal.client.zza, zzdlw, zzcld, zzbte, zzcmt, zzcmy, zzbtq, zzbfg, zzcnc, zzn, zzcnf, zzcng, zzcif, zzcnh {
    zzbgt B();

    void C(zzbgt zzbgtVar);

    ddb E();

    void F(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void G(String str, String str2);

    void H(Context context);

    void J(zzcnw zzcnwVar);

    void K(boolean z);

    void P(String str, zzbqh zzbqhVar);

    void Q(int i);

    boolean R(int i, boolean z);

    void S(boolean z);

    void T(String str, zzbqh zzbqhVar);

    void U();

    void V(boolean z);

    void W(zzdux zzduxVar);

    void X(String str, fjn fjnVar);

    void Y(int i);

    zzemj a();

    Context b();

    boolean canGoBack();

    boolean d();

    void d0(boolean z);

    void destroy();

    zzfld e();

    void e0(int i, boolean z);

    void f();

    zzflg g();

    void g0(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    @Override // com.google.android.gms.internal.ads.zzcmy, com.google.android.gms.internal.ads.zzcif
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    int getWidth();

    void goBack();

    void h0(zzemj zzemjVar);

    boolean i();

    boolean isAttachedToWindow();

    void j0(zzeml zzemlVar);

    void k();

    void k0(zzbmi zzbmiVar);

    void l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    String m();

    void m0(zzfld zzfldVar, zzflg zzflgVar);

    void measure(int i, int i2);

    void o();

    void o0(boolean z);

    void onPause();

    void onResume();

    zzbbd p();

    boolean q();

    void r();

    zzeml s();

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void u();

    void v();

    com.google.android.gms.ads.internal.overlay.zzm w();

    boolean x();

    boolean y();

    zzbmi z();

    WebView zzD();

    View zzE();

    ArrayList zzF();

    void zzJ();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    zzcnw zzN();

    zzclx zzP();

    boolean zzR();

    zzfma zzT();

    zzcms zzh();

    Activity zzj();

    com.google.android.gms.ads.internal.zza zzk();

    zzbjt zzq();

    VersionInfoParcel zzs();
}
