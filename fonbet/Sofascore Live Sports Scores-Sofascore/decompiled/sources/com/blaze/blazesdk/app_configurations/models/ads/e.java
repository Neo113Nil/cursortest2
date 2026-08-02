package com.blaze.blazesdk.app_configurations.models.ads;

import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e implements g {
    public final int a;

    public e(int i) {
        this.a = i;
    }

    public static e copy$default(e eVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eVar.a;
        }
        eVar.getClass();
        return new e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a == ((e) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wv8.j(new StringBuilder("EveryXStories(interval="), this.a, ')');
    }
}
