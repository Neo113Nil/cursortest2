package com.vk.ecomm.reviews.impl.allreviews.domain.model;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemStatus.kt */
/* loaded from: classes18.dex */
public final class ItemStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ItemStatus[] $VALUES;
    public static final ItemStatus ACTIVE;
    public static final a Companion;
    public static final ItemStatus DELETED;
    public static final ItemStatus DISABLED;
    public static final ItemStatus HARDBANNED;
    private final int value;

    /* compiled from: ItemStatus.kt */
    public static final class a {
    }

    static {
        ItemStatus itemStatus = new ItemStatus(SignalingProtocol.STATE_ACTIVE, 0, 0);
        ACTIVE = itemStatus;
        ItemStatus itemStatus2 = new ItemStatus("DELETED", 1, 1);
        DELETED = itemStatus2;
        ItemStatus itemStatus3 = new ItemStatus("DISABLED", 2, 2);
        DISABLED = itemStatus3;
        ItemStatus itemStatus4 = new ItemStatus("HARDBANNED", 3, 3);
        HARDBANNED = itemStatus4;
        ItemStatus[] itemStatusArr = {itemStatus, itemStatus2, itemStatus3, itemStatus4};
        $VALUES = itemStatusArr;
        $ENTRIES = new asp(itemStatusArr);
        Companion = new a();
    }

    public ItemStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<ItemStatus> h() {
        return $ENTRIES;
    }

    public static ItemStatus valueOf(String str) {
        return (ItemStatus) Enum.valueOf(ItemStatus.class, str);
    }

    public static ItemStatus[] values() {
        return (ItemStatus[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
