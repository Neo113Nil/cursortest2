package com.vk.movika.sdk.utils;

import xsna.brm0;
import xsna.drm0;

/* loaded from: classes3.dex */
public final class h {
    public static final boolean a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return brm0.w(drm0.p0(str).toString(), drm0.p0(str2).toString(), true);
    }
}
