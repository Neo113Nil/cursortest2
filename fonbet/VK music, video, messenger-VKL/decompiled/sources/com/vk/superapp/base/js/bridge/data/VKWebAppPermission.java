package com.vk.superapp.base.js.bridge.data;

import com.ironsource.X3;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VKWebAppPermission.kt */
/* loaded from: classes6.dex */
public final class VKWebAppPermission {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VKWebAppPermission[] $VALUES;
    public static final VKWebAppPermission AUDIO;
    public static final VKWebAppPermission CAMERA;
    public static final a Companion;
    public static final VKWebAppPermission LOCATION;
    public static final VKWebAppPermission PUSH_NOTIFICATIONS;
    public static final VKWebAppPermission STORAGE;
    private final String permissionName;

    /* compiled from: VKWebAppPermission.kt */
    public static final class a {
    }

    static {
        VKWebAppPermission vKWebAppPermission = new VKWebAppPermission("LOCATION", 0, "location");
        LOCATION = vKWebAppPermission;
        VKWebAppPermission vKWebAppPermission2 = new VKWebAppPermission("CAMERA", 1, SignalingProtocol.KEY_CAMERA);
        CAMERA = vKWebAppPermission2;
        VKWebAppPermission vKWebAppPermission3 = new VKWebAppPermission("STORAGE", 2, X3.a.k);
        STORAGE = vKWebAppPermission3;
        VKWebAppPermission vKWebAppPermission4 = new VKWebAppPermission(SignalingProtocol.MEDIA_OPTION_AUDIO, 3, "audio");
        AUDIO = vKWebAppPermission4;
        VKWebAppPermission vKWebAppPermission5 = new VKWebAppPermission("PUSH_NOTIFICATIONS", 4, "push_notifications");
        PUSH_NOTIFICATIONS = vKWebAppPermission5;
        VKWebAppPermission[] vKWebAppPermissionArr = {vKWebAppPermission, vKWebAppPermission2, vKWebAppPermission3, vKWebAppPermission4, vKWebAppPermission5};
        $VALUES = vKWebAppPermissionArr;
        $ENTRIES = new asp(vKWebAppPermissionArr);
        Companion = new a();
    }

    public VKWebAppPermission(String str, int i, String str2) {
        this.permissionName = str2;
    }

    public static VKWebAppPermission valueOf(String str) {
        return (VKWebAppPermission) Enum.valueOf(VKWebAppPermission.class, str);
    }

    public static VKWebAppPermission[] values() {
        return (VKWebAppPermission[]) $VALUES.clone();
    }

    public final String h() {
        return this.permissionName;
    }
}
