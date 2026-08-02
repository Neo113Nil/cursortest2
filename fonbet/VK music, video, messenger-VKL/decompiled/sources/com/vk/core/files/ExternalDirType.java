package com.vk.core.files;

import android.os.Environment;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExternalDirType.kt */
/* loaded from: classes17.dex */
public final class ExternalDirType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExternalDirType[] $VALUES;
    public static final ExternalDirType DOWNLOADS;
    public static final ExternalDirType IMAGES;
    public static final ExternalDirType VIDEO;
    private final String envDirectory;
    private final String subDirectoryPath = "VK";

    static {
        ExternalDirType externalDirType = new ExternalDirType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, Environment.DIRECTORY_MOVIES);
        VIDEO = externalDirType;
        ExternalDirType externalDirType2 = new ExternalDirType("IMAGES", 1, Environment.DIRECTORY_PICTURES);
        IMAGES = externalDirType2;
        ExternalDirType externalDirType3 = new ExternalDirType("DOWNLOADS", 2, Environment.DIRECTORY_DOWNLOADS);
        DOWNLOADS = externalDirType3;
        ExternalDirType[] externalDirTypeArr = {externalDirType, externalDirType2, externalDirType3};
        $VALUES = externalDirTypeArr;
        $ENTRIES = new asp(externalDirTypeArr);
    }

    public ExternalDirType(String str, int i, String str2) {
        this.envDirectory = str2;
    }

    public static ExternalDirType valueOf(String str) {
        return (ExternalDirType) Enum.valueOf(ExternalDirType.class, str);
    }

    public static ExternalDirType[] values() {
        return (ExternalDirType[]) $VALUES.clone();
    }

    public final String h() {
        return this.envDirectory;
    }

    public final String i() {
        return this.subDirectoryPath;
    }
}
