package com.vk.dto.money;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.qoy;

/* compiled from: MoneyTransferMethod.kt */
/* loaded from: classes18.dex */
public final class CardTransferMethod extends MoneyTransferMethod {
    public static final Serializer.c<CardTransferMethod> CREATOR = new a();
    public final String e;
    public final boolean f;
    public final List<MoneyReceiverInfo> g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CardTransferMethod> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CardTransferMethod a(Serializer serializer) {
            return new CardTransferMethod(serializer.H(), serializer.m(), serializer.l(MoneyReceiverInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardTransferMethod[i];
        }
    }

    public CardTransferMethod(String str, boolean z, List<MoneyReceiverInfo> list) {
        super(str, z, list);
        this.e = str;
        this.f = z;
        this.g = list;
    }

    @Override // com.vk.dto.money.MoneyTransferMethod
    public final List<MoneyReceiverInfo> Ab() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTransferMethod)) {
            return false;
        }
        CardTransferMethod cardTransferMethod = (CardTransferMethod) obj;
        return epx.f(this.e, cardTransferMethod.e) && this.f == cardTransferMethod.f && epx.f(this.g, cardTransferMethod.g);
    }

    @Override // com.vk.dto.money.MoneyTransferMethod
    public final String getType() {
        return this.e;
    }

    public final int hashCode() {
        return this.g.hashCode() + qoy.b(this.e.hashCode() * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardTransferMethod(type=");
        sb.append(this.e);
        sb.append(", enabled=");
        sb.append(this.f);
        sb.append(", receivers=");
        return ms9.a(')', sb, this.g);
    }

    @Override // com.vk.dto.money.MoneyTransferMethod
    public final boolean zb() {
        return this.f;
    }
}
