package com.airbnb.lottie;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f28677b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f28676a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f28679d = true;

    /* renamed from: c, reason: collision with root package name */
    public final K f28678c = null;

    public b0(LottieAnimationView lottieAnimationView) {
        this.f28677b = lottieAnimationView;
    }

    public String a(String str) {
        return str;
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    public final String c(String str, String str2) {
        if (this.f28679d && this.f28676a.containsKey(str2)) {
            return (String) this.f28676a.get(str2);
        }
        String b10 = b(str, str2);
        if (this.f28679d) {
            this.f28676a.put(str2, b10);
        }
        return b10;
    }

    public final void d() {
        LottieAnimationView lottieAnimationView = this.f28677b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        K k10 = this.f28678c;
        if (k10 != null) {
            k10.invalidateSelf();
        }
    }

    public void e(String str, String str2) {
        this.f28676a.put(str, str2);
        d();
    }
}
