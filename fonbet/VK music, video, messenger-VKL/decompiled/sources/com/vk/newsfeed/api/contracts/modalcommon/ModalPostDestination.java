package com.vk.newsfeed.api.contracts.modalcommon;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ModalPostDestination.kt */
/* loaded from: classes3.dex */
public final class ModalPostDestination {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ModalPostDestination[] $VALUES;
    public static final ModalPostDestination COMMENTS;
    public static final ModalPostDestination REACTIONS_ALL;
    public static final ModalPostDestination REACTIONS_DONATS;

    static {
        ModalPostDestination modalPostDestination = new ModalPostDestination("COMMENTS", 0);
        COMMENTS = modalPostDestination;
        ModalPostDestination modalPostDestination2 = new ModalPostDestination("REACTIONS_ALL", 1);
        REACTIONS_ALL = modalPostDestination2;
        ModalPostDestination modalPostDestination3 = new ModalPostDestination("REACTIONS_DONATS", 2);
        REACTIONS_DONATS = modalPostDestination3;
        ModalPostDestination[] modalPostDestinationArr = {modalPostDestination, modalPostDestination2, modalPostDestination3};
        $VALUES = modalPostDestinationArr;
        $ENTRIES = new asp(modalPostDestinationArr);
    }

    public ModalPostDestination() {
        throw null;
    }

    public static zrp<ModalPostDestination> h() {
        return $ENTRIES;
    }

    public static ModalPostDestination valueOf(String str) {
        return (ModalPostDestination) Enum.valueOf(ModalPostDestination.class, str);
    }

    public static ModalPostDestination[] values() {
        return (ModalPostDestination[]) $VALUES.clone();
    }
}
