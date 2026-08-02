package com.vk.toggle.data;

import xsna.epx;
import xsna.yoo;

/* compiled from: AdsButtonConfig.kt */
/* loaded from: classes11.dex */
public final class a {
    public static final C1928a d = new C1928a();
    public final AdsBtnStyle a;
    public final AdsBtnAnimationStyle b;
    public final yoo c;

    /* compiled from: AdsButtonConfig.kt */
    /* renamed from: com.vk.toggle.data.a$a, reason: collision with other inner class name */
    public static final class C1928a {
    }

    public a(AdsBtnStyle adsBtnStyle, AdsBtnAnimationStyle adsBtnAnimationStyle, yoo yooVar) {
        this.a = adsBtnStyle;
        this.b = adsBtnAnimationStyle;
        this.c = yooVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
    }

    public final int hashCode() {
        AdsBtnStyle adsBtnStyle = this.a;
        int hashCode = (adsBtnStyle == null ? 0 : adsBtnStyle.hashCode()) * 31;
        AdsBtnAnimationStyle adsBtnAnimationStyle = this.b;
        int hashCode2 = (hashCode + (adsBtnAnimationStyle == null ? 0 : adsBtnAnimationStyle.hashCode())) * 31;
        yoo yooVar = this.c;
        return hashCode2 + (yooVar != null ? yooVar.hashCode() : 0);
    }

    public final String toString() {
        return "AdsButtonConfig(buttonStyle=" + this.a + ", animationStyle=" + this.b + ", dynamicColorButton=" + this.c + ')';
    }
}
