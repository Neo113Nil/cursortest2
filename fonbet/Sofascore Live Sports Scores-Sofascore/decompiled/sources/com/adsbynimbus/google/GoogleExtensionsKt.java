package com.adsbynimbus.google;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import defpackage.tm8;
import defpackage.wzb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/gms/ads/AdSize;", "Landroid/content/Context;", "context", "Ltm8;", "mapToFormat", "(Lcom/google/android/gms/ads/AdSize;Landroid/content/Context;)Ltm8;", "", "width", "height", "(II)Ltm8;", "google_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GoogleExtensionsKt {
    @NotNull
    public static final tm8 mapToFormat(int i, int i2) {
        tm8 tm8Var = tm8.e;
        return i2 < 90 ? tm8Var : i2 < 250 ? i >= 728 ? tm8.h : tm8Var : (i < 768 || i2 < 768) ? (i < 480 || i2 < 320) ? (i < 320 || i2 < 480) ? i2 >= 600 ? tm8.g : tm8.f : tm8.c : tm8.d : new tm8(i, i2);
    }

    @NotNull
    public static final tm8 mapToFormat(@NotNull AdSize adSize, @NotNull Context context) {
        adSize.getClass();
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return mapToFormat(wzb.b(adSize.getWidthInPixels(context) / displayMetrics.density), wzb.b(adSize.getHeightInPixels(context) / displayMetrics.density));
    }
}
