package com.inmobi.media;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ag, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3292ag {
    public static final boolean a(Context context, String str) {
        str.getClass();
        if (context == null) {
            return false;
        }
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
