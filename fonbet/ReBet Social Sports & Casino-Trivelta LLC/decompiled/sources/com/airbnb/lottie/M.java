package com.airbnb.lottie;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f28433a = new HashSet();

    public boolean a(L l10, boolean z10) {
        if (!z10) {
            return this.f28433a.remove(l10);
        }
        if (Build.VERSION.SDK_INT >= l10.f28403a) {
            return this.f28433a.add(l10);
        }
        com.airbnb.lottie.utils.g.c(String.format("%s is not supported pre SDK %d", l10.name(), Integer.valueOf(l10.f28403a)));
        return false;
    }

    public boolean b(L l10) {
        return this.f28433a.contains(l10);
    }
}
