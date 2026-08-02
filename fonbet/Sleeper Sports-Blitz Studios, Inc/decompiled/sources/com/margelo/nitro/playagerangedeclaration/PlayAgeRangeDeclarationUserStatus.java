package com.margelo.nitro.playagerangedeclaration;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayAgeRangeDeclarationUserStatus.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "VERIFIED", "SUPERVISED", "SUPERVISED_APPROVAL_PENDING", "SUPERVISED_APPROVAL_DENIED", "UNKNOWN", "Companion", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlayAgeRangeDeclarationUserStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PlayAgeRangeDeclarationUserStatus[] $VALUES;
    private final int value;
    public static final PlayAgeRangeDeclarationUserStatus VERIFIED = new PlayAgeRangeDeclarationUserStatus("VERIFIED", 0, 0);
    public static final PlayAgeRangeDeclarationUserStatus SUPERVISED = new PlayAgeRangeDeclarationUserStatus("SUPERVISED", 1, 1);
    public static final PlayAgeRangeDeclarationUserStatus SUPERVISED_APPROVAL_PENDING = new PlayAgeRangeDeclarationUserStatus("SUPERVISED_APPROVAL_PENDING", 2, 2);
    public static final PlayAgeRangeDeclarationUserStatus SUPERVISED_APPROVAL_DENIED = new PlayAgeRangeDeclarationUserStatus("SUPERVISED_APPROVAL_DENIED", 3, 3);
    public static final PlayAgeRangeDeclarationUserStatus UNKNOWN = new PlayAgeRangeDeclarationUserStatus("UNKNOWN", 4, 4);

    private static final /* synthetic */ PlayAgeRangeDeclarationUserStatus[] $values() {
        return new PlayAgeRangeDeclarationUserStatus[]{VERIFIED, SUPERVISED, SUPERVISED_APPROVAL_PENDING, SUPERVISED_APPROVAL_DENIED, UNKNOWN};
    }

    public static EnumEntries<PlayAgeRangeDeclarationUserStatus> getEntries() {
        return $ENTRIES;
    }

    private PlayAgeRangeDeclarationUserStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        PlayAgeRangeDeclarationUserStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static PlayAgeRangeDeclarationUserStatus valueOf(String str) {
        return (PlayAgeRangeDeclarationUserStatus) Enum.valueOf(PlayAgeRangeDeclarationUserStatus.class, str);
    }

    public static PlayAgeRangeDeclarationUserStatus[] values() {
        return (PlayAgeRangeDeclarationUserStatus[]) $VALUES.clone();
    }
}
