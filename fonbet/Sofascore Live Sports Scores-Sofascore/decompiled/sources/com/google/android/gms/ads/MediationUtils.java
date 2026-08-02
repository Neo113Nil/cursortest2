package com.google.android.gms.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class MediationUtils {
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9 A[SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AdSize findClosestSize(@NonNull Context context, @NonNull AdSize adSize, @NonNull List<AdSize> list) {
        AdSize adSize2 = null;
        if (list != null && adSize != null) {
            if (!adSize.f && !adSize.h) {
                float f = context.getResources().getDisplayMetrics().density;
                adSize = new AdSize(Math.round(adSize.getWidthInPixels(context) / f), Math.round(adSize.getHeightInPixels(context) / f));
            }
            float floatValue = ((Float) zzba.zzc().a(zzbjg.kg)).floatValue();
            float floatValue2 = ((Float) zzba.zzc().a(zzbjg.lg)).floatValue();
            int intValue = ((Integer) zzba.zzc().a(zzbjg.h9)).intValue();
            int intValue2 = ((Integer) zzba.zzc().a(zzbjg.i9)).intValue();
            for (AdSize adSize3 : list) {
                if (adSize3 != null) {
                    int width = adSize.getWidth();
                    int width2 = adSize3.getWidth();
                    int height = adSize.getHeight();
                    int height2 = adSize3.getHeight();
                    if ((width * floatValue) - width2 <= 1.0E-6f && width >= width2) {
                        if (adSize.h) {
                            int i = adSize.i;
                            if (intValue <= width2 && intValue2 <= height2 && i >= height2) {
                                if (adSize2 != null) {
                                    if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                    }
                                }
                                adSize2 = adSize3;
                            }
                        } else if (adSize.f) {
                            if (adSize.g >= height2) {
                                if (adSize2 != null) {
                                }
                                adSize2 = adSize3;
                            }
                        } else if ((height * floatValue2) - height2 <= 1.0E-6f && height >= height2) {
                            if (adSize2 != null) {
                            }
                            adSize2 = adSize3;
                        }
                    }
                }
            }
        }
        return adSize2;
    }
}
