package com.vk.clips.sdk.shared.item.clip.state;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OwnerRightState.kt */
/* loaded from: classes17.dex */
public final class OwnerRightState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OwnerRightState[] $VALUES;
    public static final OwnerRightState CLIP_COOWNER;
    public static final OwnerRightState CLIP_OWNER;
    public static final OwnerRightState GROUP_ADMIN;
    public static final OwnerRightState GROUP_ADMIN_LEVEL_EDITOR;
    public static final OwnerRightState NONE;
    private final boolean canEdit;
    private final boolean isAdmin;

    static {
        OwnerRightState ownerRightState = new OwnerRightState("NONE", 0, false, false);
        NONE = ownerRightState;
        OwnerRightState ownerRightState2 = new OwnerRightState("CLIP_OWNER", 1, true, true);
        CLIP_OWNER = ownerRightState2;
        OwnerRightState ownerRightState3 = new OwnerRightState("CLIP_COOWNER", 2, false, false);
        CLIP_COOWNER = ownerRightState3;
        OwnerRightState ownerRightState4 = new OwnerRightState("GROUP_ADMIN", 3, true, false);
        GROUP_ADMIN = ownerRightState4;
        OwnerRightState ownerRightState5 = new OwnerRightState("GROUP_ADMIN_LEVEL_EDITOR", 4, true, true);
        GROUP_ADMIN_LEVEL_EDITOR = ownerRightState5;
        OwnerRightState[] ownerRightStateArr = {ownerRightState, ownerRightState2, ownerRightState3, ownerRightState4, ownerRightState5};
        $VALUES = ownerRightStateArr;
        $ENTRIES = new asp(ownerRightStateArr);
    }

    public OwnerRightState(String str, int i, boolean z, boolean z2) {
        this.isAdmin = z;
        this.canEdit = z2;
    }

    public static OwnerRightState valueOf(String str) {
        return (OwnerRightState) Enum.valueOf(OwnerRightState.class, str);
    }

    public static OwnerRightState[] values() {
        return (OwnerRightState[]) $VALUES.clone();
    }

    public final boolean h() {
        return this.canEdit;
    }

    public final boolean i() {
        return this.isAdmin;
    }
}
