package com.vk.im.ui.components.common;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvatarAction.kt */
/* loaded from: classes2.dex */
public final class AvatarAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AvatarAction[] $VALUES;
    public static final AvatarAction CHANGE_BY_CAMERA;
    public static final AvatarAction CHANGE_BY_GALLERY;
    public static final AvatarAction CHANGE_BY_MINI_APP;
    public static final AvatarAction REMOVE;

    static {
        AvatarAction avatarAction = new AvatarAction("CHANGE_BY_GALLERY", 0);
        CHANGE_BY_GALLERY = avatarAction;
        AvatarAction avatarAction2 = new AvatarAction("CHANGE_BY_CAMERA", 1);
        CHANGE_BY_CAMERA = avatarAction2;
        AvatarAction avatarAction3 = new AvatarAction("CHANGE_BY_MINI_APP", 2);
        CHANGE_BY_MINI_APP = avatarAction3;
        AvatarAction avatarAction4 = new AvatarAction(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 3);
        REMOVE = avatarAction4;
        AvatarAction[] avatarActionArr = {avatarAction, avatarAction2, avatarAction3, avatarAction4};
        $VALUES = avatarActionArr;
        $ENTRIES = new asp(avatarActionArr);
    }

    public AvatarAction() {
        throw null;
    }

    public static zrp<AvatarAction> h() {
        return $ENTRIES;
    }

    public static AvatarAction valueOf(String str) {
        return (AvatarAction) Enum.valueOf(AvatarAction.class, str);
    }

    public static AvatarAction[] values() {
        return (AvatarAction[]) $VALUES.clone();
    }
}
