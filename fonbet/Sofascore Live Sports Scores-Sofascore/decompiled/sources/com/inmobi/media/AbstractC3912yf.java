package com.inmobi.media;

import android.content.Context;
import com.iab.omid.library.inmobi.Omid;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.yf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3912yf {
    public static final /* synthetic */ int a = 0;

    public static boolean a(Context context) {
        context.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(context);
            }
            return Omid.isActive();
        } catch (Throwable th) {
            th.getStackTrace();
            return false;
        }
    }
}
