package com.orkestapay.orkestapay.client.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/enums/CardType;", "", "(Ljava/lang/String;I)V", "DEBIT", "CREDIT", "PREPAID", "CHARGE", "UNKNOWN", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardType[] $VALUES;
    public static final CardType DEBIT = new CardType("DEBIT", 0);
    public static final CardType CREDIT = new CardType("CREDIT", 1);
    public static final CardType PREPAID = new CardType("PREPAID", 2);
    public static final CardType CHARGE = new CardType("CHARGE", 3);
    public static final CardType UNKNOWN = new CardType("UNKNOWN", 4);

    private static final /* synthetic */ CardType[] $values() {
        return new CardType[]{DEBIT, CREDIT, PREPAID, CHARGE, UNKNOWN};
    }

    static {
        CardType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CardType(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<CardType> getEntries() {
        return $ENTRIES;
    }

    public static CardType valueOf(String str) {
        return (CardType) Enum.valueOf(CardType.class, str);
    }

    public static CardType[] values() {
        return (CardType[]) $VALUES.clone();
    }
}
