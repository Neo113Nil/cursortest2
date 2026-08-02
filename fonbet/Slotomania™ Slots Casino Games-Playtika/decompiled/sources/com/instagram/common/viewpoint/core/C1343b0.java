package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.braze.Constants;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.b0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1343b0 {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = C1343b0.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<InterfaceC0921Lt> A03;
    public final WeakReference<InterfaceC1344b1> A04;
    public final WeakReference<C1640fp> A05;
    public final WeakReference<LV> A06;

    public C1343b0(LV lv, InterfaceC1344b1 interfaceC1344b1, C1640fp c1640fp, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1695gi c1695gi) {
        this.A06 = new WeakReference<>(lv);
        this.A04 = new WeakReference<>(interfaceC1344b1);
        this.A05 = new WeakReference<>(c1640fp);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1695gi.A0F());
    }

    private InterfaceC0921Lt A00() {
        InterfaceC0921Lt funnel = this.A03.get();
        if (funnel == null) {
            return new C1915kX();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC1206Xd.A01(C1117Tn.A02());
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
                new Handler(Looper.getMainLooper()).post(new C0909Lh(this.A05));
            }
            InterfaceC1344b1 interfaceC1344b1 = this.A04.get();
            if (interfaceC1344b1 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1342az(this, interfaceC1344b1));
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
        InterfaceC1344b1 interfaceC1344b1 = this.A04.get();
        if (interfaceC1344b1 == null) {
            A00().AKv(true);
            return;
        }
        InterfaceC0921Lt A00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        A00.AKv(false);
        interfaceC1344b1.AF8();
    }
}
