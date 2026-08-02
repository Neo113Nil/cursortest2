package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.dmi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.qj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3709qj {
    public static SharedPreferences a() {
        Context context = AbstractC3424fj.a;
        String y = dmi.y(context != null ? context.getPackageName() : null, "_preferences");
        if (context != null) {
            return context.getSharedPreferences(y, 0);
        }
        return null;
    }
}
