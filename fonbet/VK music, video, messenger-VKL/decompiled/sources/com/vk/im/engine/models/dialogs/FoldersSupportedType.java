package com.vk.im.engine.models.dialogs;

import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FoldersSupportedType.kt */
/* loaded from: classes2.dex */
public final class FoldersSupportedType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FoldersSupportedType[] $VALUES;
    public static final FoldersSupportedType BUSINESS;
    public static final FoldersSupportedType CHANNELS;
    public static final FoldersSupportedType MANAGED_GROUPS;
    public static final FoldersSupportedType PERSONAL;
    private final String rawType;

    static {
        FoldersSupportedType foldersSupportedType = new FoldersSupportedType("CHANNELS", 0, RTCStatsConstants.KEY_CHANNELS);
        CHANNELS = foldersSupportedType;
        FoldersSupportedType foldersSupportedType2 = new FoldersSupportedType("BUSINESS", 1, "business");
        BUSINESS = foldersSupportedType2;
        FoldersSupportedType foldersSupportedType3 = new FoldersSupportedType("PERSONAL", 2, "personal");
        PERSONAL = foldersSupportedType3;
        FoldersSupportedType foldersSupportedType4 = new FoldersSupportedType("MANAGED_GROUPS", 3, "managed_groups");
        MANAGED_GROUPS = foldersSupportedType4;
        FoldersSupportedType[] foldersSupportedTypeArr = {foldersSupportedType, foldersSupportedType2, foldersSupportedType3, foldersSupportedType4};
        $VALUES = foldersSupportedTypeArr;
        $ENTRIES = new asp(foldersSupportedTypeArr);
    }

    public FoldersSupportedType(String str, int i, String str2) {
        this.rawType = str2;
    }

    public static FoldersSupportedType valueOf(String str) {
        return (FoldersSupportedType) Enum.valueOf(FoldersSupportedType.class, str);
    }

    public static FoldersSupportedType[] values() {
        return (FoldersSupportedType[]) $VALUES.clone();
    }

    public final String h() {
        return this.rawType;
    }
}
