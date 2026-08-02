package com.airbnb.lottie.utils;

import android.util.Log;
import com.airbnb.lottie.AbstractC2935e;
import com.airbnb.lottie.P;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class f implements P {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f29109a = new HashSet();

    @Override // com.airbnb.lottie.P
    public void a(String str) {
        d(str, null);
    }

    @Override // com.airbnb.lottie.P
    public void b(String str, Throwable th2) {
        boolean z10 = AbstractC2935e.f28681a;
    }

    @Override // com.airbnb.lottie.P
    public void c(String str) {
        e(str, null);
    }

    @Override // com.airbnb.lottie.P
    public void d(String str, Throwable th2) {
        Set set = f29109a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    public void e(String str, Throwable th2) {
        boolean z10 = AbstractC2935e.f28681a;
    }
}
