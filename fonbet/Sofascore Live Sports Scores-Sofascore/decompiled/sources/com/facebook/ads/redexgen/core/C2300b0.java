package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.b0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2300b0 {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", "s", "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = C2300b0.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<InterfaceC1878Lt> A03;
    public final WeakReference<InterfaceC2301b1> A04;
    public final WeakReference<C2597fp> A05;
    public final WeakReference<LV> A06;

    public C2300b0(LV lv, InterfaceC2301b1 interfaceC2301b1, C2597fp c2597fp, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C2652gi c2652gi) {
        this.A06 = new WeakReference<>(lv);
        this.A04 = new WeakReference<>(interfaceC2301b1);
        this.A05 = new WeakReference<>(c2597fp);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c2652gi.A0F());
    }

    private InterfaceC1878Lt A00() {
        InterfaceC1878Lt funnel = this.A03.get();
        if (funnel == null) {
            return new C2872kX();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC2163Xd.A01(C2074Tn.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AKr(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AKs();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AKt();
            if (this.A06.get().isShown()) {
                A00().AKu();
                new Handler(Looper.getMainLooper()).post(new C1866Lh(this.A05));
            }
            InterfaceC2301b1 interfaceC2301b1 = this.A04.get();
            if (interfaceC2301b1 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC2299az(this, interfaceC2301b1));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        LV webView = this.A06.get();
        if (webView == null || webView.A0J()) {
            A00().AKv(true);
            return;
        }
        InterfaceC2301b1 interfaceC2301b1 = this.A04.get();
        if (interfaceC2301b1 == null) {
            A00().AKv(true);
            return;
        }
        InterfaceC1878Lt A00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        A00.AKv(false);
        interfaceC2301b1.AF8();
    }
}
