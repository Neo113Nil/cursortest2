package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhly {
    public static final Logger a = Logger.getLogger(zzhly.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    private zzhly() {
    }

    public static boolean a() {
        return b.get();
    }
}
