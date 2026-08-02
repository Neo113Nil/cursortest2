package com.facebook;

import android.content.Intent;
import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l {
    public final int a;
    public final int b;
    public final Intent c;

    public l(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.b == lVar.b && Intrinsics.c(this.c, lVar.c);
    }

    public final int hashCode() {
        int a = wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
        Intent intent = this.c;
        return a + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ActivityResultParameters(requestCode=" + this.a + ", resultCode=" + this.b + ", data=" + this.c + ')';
    }
}
