package com.inmobi.media;

import android.net.Network;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.i5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3488i5 {
    public static volatile Network a = null;
    public static volatile boolean b = true;
    public static long c;
    public static long d;
    public static final AtomicBoolean e = new AtomicBoolean(false);

    public static AdConfig.CustomNetworkValidation a() {
        return ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getCustomNwValidation();
    }
}
