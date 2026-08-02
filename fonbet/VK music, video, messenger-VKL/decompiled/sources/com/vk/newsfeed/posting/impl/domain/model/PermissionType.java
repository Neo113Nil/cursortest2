package com.vk.newsfeed.posting.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PermissionType.kt */
/* loaded from: classes4.dex */
public final class PermissionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PermissionType[] $VALUES;
    public static final PermissionType Camera;
    public static final PermissionType GalleryView;
    public static final PermissionType Location;

    static {
        PermissionType permissionType = new PermissionType("GalleryView", 0);
        GalleryView = permissionType;
        PermissionType permissionType2 = new PermissionType("Camera", 1);
        Camera = permissionType2;
        PermissionType permissionType3 = new PermissionType("Location", 2);
        Location = permissionType3;
        PermissionType[] permissionTypeArr = {permissionType, permissionType2, permissionType3};
        $VALUES = permissionTypeArr;
        $ENTRIES = new asp(permissionTypeArr);
    }

    public PermissionType() {
        throw null;
    }

    public static PermissionType valueOf(String str) {
        return (PermissionType) Enum.valueOf(PermissionType.class, str);
    }

    public static PermissionType[] values() {
        return (PermissionType[]) $VALUES.clone();
    }
}
