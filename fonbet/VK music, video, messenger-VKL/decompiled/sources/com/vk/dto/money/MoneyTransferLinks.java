package com.vk.dto.money;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: MoneyTransferLinks.kt */
/* loaded from: classes18.dex */
public final class MoneyTransferLinks extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MoneyTransferLinks> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MoneyTransferLinks> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MoneyTransferLinks a(Serializer serializer) {
            return new MoneyTransferLinks(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyTransferLinks[i];
        }
    }

    public MoneyTransferLinks(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTransferLinks)) {
            return false;
        }
        MoneyTransferLinks moneyTransferLinks = (MoneyTransferLinks) obj;
        return epx.f(this.b, moneyTransferLinks.b) && epx.f(this.c, moneyTransferLinks.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyTransferLinks(publicLink=");
        sb.append(this.b);
        sb.append(", anonLink=");
        return ho8.a(sb, this.c, ')');
    }
}
