package com.vk.ecomm.market.good.ui;

import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.ecomm.market.api.dto.OwnerResponseTime;
import com.vk.ecomm.market.good.ui.d;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;

/* compiled from: ProductActionButtonsItem.kt */
/* loaded from: classes18.dex */
public final class b {
    public final Good a;
    public final boolean b;
    public final boolean c;
    public final d.a d;
    public final List<CallProducerButton> e;
    public final OwnerResponseTime f;
    public final String g;

    public b(Good good, boolean z, boolean z2, d.a aVar, List<CallProducerButton> list, OwnerResponseTime ownerResponseTime, String str) {
        this.a = good;
        this.b = z;
        this.c = z2;
        this.d = aVar;
        this.e = list;
        this.f = ownerResponseTime;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        d.a aVar = this.d;
        int hashCode = (b + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<CallProducerButton> list = this.e;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        OwnerResponseTime ownerResponseTime = this.f;
        int hashCode3 = (hashCode2 + (ownerResponseTime == null ? 0 : ownerResponseTime.hashCode())) * 31;
        String str = this.g;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductActionButtonArgs(good=");
        sb.append(this.a);
        sb.append(", marketCartEnabled=");
        sb.append(this.b);
        sb.append(", marketAppEnabled=");
        sb.append(this.c);
        sb.append(", callback=");
        sb.append(this.d);
        sb.append(", callProducerButtons=");
        sb.append(this.e);
        sb.append(", ownerResponseTime=");
        sb.append(this.f);
        sb.append(", adsLabel=");
        return ho8.a(sb, this.g, ')');
    }
}
