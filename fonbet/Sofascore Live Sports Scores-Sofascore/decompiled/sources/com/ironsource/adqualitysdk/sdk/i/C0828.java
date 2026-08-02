package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.dmi;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴾ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0828 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ArrayList f2637;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f2638;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Class f2639;

    public C0828(Object obj, String str, ArrayList arrayList) {
        if (obj instanceof Class) {
            this.f2639 = (Class) obj;
        } else {
            this.f2639 = obj.getClass();
        }
        this.f2638 = str;
        this.f2637 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0828.class != obj.getClass()) {
            return false;
        }
        C0828 c0828 = (C0828) obj;
        if (this.f2639.equals(c0828.f2639) && this.f2638.equals(c0828.f2638)) {
            return this.f2637.equals(c0828.f2637);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2637.hashCode() + dmi.c(this.f2639.hashCode() * 31, 31, this.f2638);
    }

    public final String toString() {
        return StringFog.decrypt("KN7K1VmqEjcD0tDUQqc5PB4=\n", "Zbu+vTbOVlI=\n") + StringFog.decrypt("b44wfZvhzEtuoCFkww==\n", "AsFSF/6CuAg=\n") + this.f2639 + StringFog.decrypt("Bsp4ENL5Yx9OpHQw0rAs\n", "KuoVXbeNC3A=\n") + this.f2638 + '\'' + StringFog.decrypt("YHJU6y7k7rQtIUrPL74=\n", "TFI5qlyDrdg=\n") + this.f2637 + '}';
    }
}
