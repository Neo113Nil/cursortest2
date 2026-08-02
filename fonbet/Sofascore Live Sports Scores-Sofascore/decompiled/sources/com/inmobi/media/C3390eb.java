package com.inmobi.media;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.eb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3390eb extends AbstractC3416fb {
    public final Activity a;
    public final String b;

    public C3390eb(Activity activity, String str) {
        activity.getClass();
        str.getClass();
        this.a = activity;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3390eb)) {
            return false;
        }
        C3390eb c3390eb = (C3390eb) obj;
        return Intrinsics.c(this.a, c3390eb.a) && Intrinsics.c(this.b, c3390eb.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Valid(activity=" + this.a + ", finalUrl=" + this.b + ")";
    }
}
