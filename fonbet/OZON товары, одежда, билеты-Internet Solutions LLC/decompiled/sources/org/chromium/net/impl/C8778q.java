package org.chromium.net.impl;

import android.os.SystemProperties;

/* renamed from: org.chromium.net.impl.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8778q {
    public static String a() {
        return SystemProperties.get("debug.cronet.trace_netlog", "heavily_redacted");
    }
}
