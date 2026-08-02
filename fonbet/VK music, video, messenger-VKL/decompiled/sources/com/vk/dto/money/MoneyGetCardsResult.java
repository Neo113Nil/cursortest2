package com.vk.dto.money;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;

/* compiled from: MoneyGetCardsResult.kt */
/* loaded from: classes18.dex */
public final class MoneyGetCardsResult extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MoneyGetCardsResult> CREATOR = new a();
    public final List<MoneyCard> b;
    public final MoneyCard c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MoneyGetCardsResult> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MoneyGetCardsResult a(Serializer serializer) {
            return new MoneyGetCardsResult(serializer.j(MoneyCard.CREATOR), (MoneyCard) serializer.A(MoneyCard.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyGetCardsResult[i];
        }
    }

    public MoneyGetCardsResult(List<MoneyCard> list, MoneyCard moneyCard) {
        this.b = list;
        this.c = moneyCard;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
        serializer.e0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyGetCardsResult)) {
            return false;
        }
        MoneyGetCardsResult moneyGetCardsResult = (MoneyGetCardsResult) obj;
        return epx.f(this.b, moneyGetCardsResult.b) && epx.f(this.c, moneyGetCardsResult.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "MoneyGetCardsResult(cards=" + this.b + ", selectedCard=" + this.c + ')';
    }
}
