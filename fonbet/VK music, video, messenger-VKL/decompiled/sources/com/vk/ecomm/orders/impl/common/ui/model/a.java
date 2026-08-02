package com.vk.ecomm.orders.impl.common.ui.model;

import com.vk.ecomm.orders.impl.common.ui.model.SpanType;
import xsna.epx;
import xsna.ho8;
import xsna.tlo0;

/* compiled from: SpanValue.kt */
/* loaded from: classes18.dex */
public final class a {
    public final tlo0 a;
    public final String b;
    public final Object c;
    public final SpanType d;
    public final String e;

    public a(tlo0 tlo0Var, String str, Object obj, SpanType spanType, String str2) {
        this.a = tlo0Var;
        this.b = str;
        this.c = obj;
        this.d = spanType;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31)) * 31;
        String str2 = this.e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanValue(text=");
        sb.append(this.a);
        sb.append(", actionTag=");
        sb.append(this.b);
        sb.append(", actionData=");
        sb.append(this.c);
        sb.append(", spanType=");
        sb.append(this.d);
        sb.append(", separator=");
        return ho8.a(sb, this.e, ')');
    }

    public /* synthetic */ a(tlo0 tlo0Var, String str, Object obj, SpanType spanType, String str2, int i) {
        this(tlo0Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? new SpanType.Text(SpanType.Text.Color.Primary) : spanType, (i & 16) != 0 ? null : str2);
    }
}
