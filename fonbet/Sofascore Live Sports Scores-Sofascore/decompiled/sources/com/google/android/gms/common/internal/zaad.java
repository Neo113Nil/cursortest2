package com.google.android.gms.common.internal;

import android.widget.Button;
import defpackage.a70;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zaad extends Button {
    public static final int a(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        a70.r(me4.g(i, "Unknown color scheme: ", new StringBuilder(String.valueOf(i).length() + 22)));
        return 0;
    }
}
