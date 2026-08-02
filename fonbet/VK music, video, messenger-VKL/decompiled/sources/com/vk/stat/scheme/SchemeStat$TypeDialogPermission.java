package com.vk.stat.scheme;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeDialogPermission {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SchemeStat$TypeDialogPermission[] $VALUES;

    @pmi0(SignalingProtocol.KEY_CAMERA)
    public static final SchemeStat$TypeDialogPermission CAMERA;

    @pmi0("disk")
    public static final SchemeStat$TypeDialogPermission DISK;

    @pmi0("geo")
    public static final SchemeStat$TypeDialogPermission GEO;

    @pmi0("idfa")
    public static final SchemeStat$TypeDialogPermission IDFA;

    @pmi0("mic")
    public static final SchemeStat$TypeDialogPermission MIC;

    static {
        SchemeStat$TypeDialogPermission schemeStat$TypeDialogPermission = new SchemeStat$TypeDialogPermission("GEO", 0);
        GEO = schemeStat$TypeDialogPermission;
        SchemeStat$TypeDialogPermission schemeStat$TypeDialogPermission2 = new SchemeStat$TypeDialogPermission("CAMERA", 1);
        CAMERA = schemeStat$TypeDialogPermission2;
        SchemeStat$TypeDialogPermission schemeStat$TypeDialogPermission3 = new SchemeStat$TypeDialogPermission("DISK", 2);
        DISK = schemeStat$TypeDialogPermission3;
        SchemeStat$TypeDialogPermission schemeStat$TypeDialogPermission4 = new SchemeStat$TypeDialogPermission("MIC", 3);
        MIC = schemeStat$TypeDialogPermission4;
        SchemeStat$TypeDialogPermission schemeStat$TypeDialogPermission5 = new SchemeStat$TypeDialogPermission("IDFA", 4);
        IDFA = schemeStat$TypeDialogPermission5;
        SchemeStat$TypeDialogPermission[] schemeStat$TypeDialogPermissionArr = {schemeStat$TypeDialogPermission, schemeStat$TypeDialogPermission2, schemeStat$TypeDialogPermission3, schemeStat$TypeDialogPermission4, schemeStat$TypeDialogPermission5};
        $VALUES = schemeStat$TypeDialogPermissionArr;
        $ENTRIES = new asp(schemeStat$TypeDialogPermissionArr);
    }

    private SchemeStat$TypeDialogPermission(String str, int i) {
    }

    public static SchemeStat$TypeDialogPermission valueOf(String str) {
        return (SchemeStat$TypeDialogPermission) Enum.valueOf(SchemeStat$TypeDialogPermission.class, str);
    }

    public static SchemeStat$TypeDialogPermission[] values() {
        return (SchemeStat$TypeDialogPermission[]) $VALUES.clone();
    }
}
