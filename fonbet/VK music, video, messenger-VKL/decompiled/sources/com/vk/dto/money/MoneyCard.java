package com.vk.dto.money;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.urd0;

/* compiled from: MoneyCard.kt */
/* loaded from: classes18.dex */
public final class MoneyCard extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final String c;
    public final String d;
    public final Fee e;
    public static final MoneyCard f = new MoneyCard("0", "", "", null);
    public static final Serializer.c<MoneyCard> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MoneyCard> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MoneyCard a(Serializer serializer) {
            return new MoneyCard(serializer.H(), serializer.H(), serializer.H(), (Fee) serializer.C());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyCard[i];
        }
    }

    public MoneyCard(String str, String str2, String str3, Fee fee) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = fee;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.g0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyCard)) {
            return false;
        }
        MoneyCard moneyCard = (MoneyCard) obj;
        return epx.f(this.b, moneyCard.b) && epx.f(this.c, moneyCard.c) && epx.f(this.d, moneyCard.d) && epx.f(this.e, moneyCard.e);
    }

    public final String getTitle() {
        return this.d + ' ' + this.c;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        Fee fee = this.e;
        return a2 + (fee == null ? 0 : fee.hashCode());
    }

    public final String toString() {
        return "MoneyCard(id=" + this.b + ", number=" + this.c + ", type=" + this.d + ", fee=" + this.e + ')';
    }
}
