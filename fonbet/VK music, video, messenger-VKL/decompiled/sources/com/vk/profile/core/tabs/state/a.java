package com.vk.profile.core.tabs.state;

import xsna.epx;
import xsna.shy;
import xsna.uqi;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class a {
    public final int a;
    public final int b;
    public final Integer c;

    public a(int i, int i2, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = num;
    }

    public static a a(a aVar, Integer num) {
        int i = aVar.a;
        int i2 = aVar.b;
        aVar.getClass();
        return new a(i, i2, num);
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
        int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeftButton(textId=");
        sb.append(this.a);
        sb.append(", customIcon=");
        sb.append(this.b);
        sb.append(", count=");
        return uqi.b(sb, this.c, ')');
    }
}
