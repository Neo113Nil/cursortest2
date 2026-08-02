package com.vk.newsfeed.posting.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PublicationState.kt */
/* loaded from: classes4.dex */
public final class PublicationState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PublicationState[] $VALUES;
    public static final PublicationState Failure;
    public static final PublicationState InProgress;
    public static final PublicationState None;
    public static final PublicationState Success;

    static {
        PublicationState publicationState = new PublicationState("None", 0);
        None = publicationState;
        PublicationState publicationState2 = new PublicationState("InProgress", 1);
        InProgress = publicationState2;
        PublicationState publicationState3 = new PublicationState("Success", 2);
        Success = publicationState3;
        PublicationState publicationState4 = new PublicationState("Failure", 3);
        Failure = publicationState4;
        PublicationState[] publicationStateArr = {publicationState, publicationState2, publicationState3, publicationState4};
        $VALUES = publicationStateArr;
        $ENTRIES = new asp(publicationStateArr);
    }

    public PublicationState() {
        throw null;
    }

    public static PublicationState valueOf(String str) {
        return (PublicationState) Enum.valueOf(PublicationState.class, str);
    }

    public static PublicationState[] values() {
        return (PublicationState[]) $VALUES.clone();
    }
}
