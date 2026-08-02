package com.vk.money.createtransfer.people;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReceiverType.kt */
/* loaded from: classes3.dex */
public final class ReceiverType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReceiverType[] $VALUES;
    public static final ReceiverType Card2Card;
    public static final ReceiverType Card2VkPay;
    public static final a Companion;
    public static final ReceiverType Sbp2Sbp;
    public static final ReceiverType VkPay2VkPay;
    private final int id;

    /* compiled from: ReceiverType.kt */
    public static final class a {
    }

    static {
        ReceiverType receiverType = new ReceiverType("Card2Card", 0, 0);
        Card2Card = receiverType;
        ReceiverType receiverType2 = new ReceiverType("Card2VkPay", 1, 1);
        Card2VkPay = receiverType2;
        ReceiverType receiverType3 = new ReceiverType("VkPay2VkPay", 2, 2);
        VkPay2VkPay = receiverType3;
        ReceiverType receiverType4 = new ReceiverType("Sbp2Sbp", 3, 3);
        Sbp2Sbp = receiverType4;
        ReceiverType[] receiverTypeArr = {receiverType, receiverType2, receiverType3, receiverType4};
        $VALUES = receiverTypeArr;
        $ENTRIES = new asp(receiverTypeArr);
        Companion = new a();
    }

    public ReceiverType(String str, int i, int i2) {
        this.id = i2;
    }

    public static ReceiverType valueOf(String str) {
        return (ReceiverType) Enum.valueOf(ReceiverType.class, str);
    }

    public static ReceiverType[] values() {
        return (ReceiverType[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
