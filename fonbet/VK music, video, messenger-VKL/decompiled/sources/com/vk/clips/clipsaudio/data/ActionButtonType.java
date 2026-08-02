package com.vk.clips.clipsaudio.data;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionButtonType.kt */
/* loaded from: classes16.dex */
public final class ActionButtonType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionButtonType[] $VALUES;
    public static final ActionButtonType CHANGE;
    public static final ActionButtonType DELETE;
    public static final ActionButtonType TRIM;
    private final int text;

    static {
        ActionButtonType actionButtonType = new ActionButtonType("TRIM", 0, R.string.clips_audio_dialog_music_cut);
        TRIM = actionButtonType;
        ActionButtonType actionButtonType2 = new ActionButtonType("DELETE", 1, R.string.clips_audio_dialog_music_delete);
        DELETE = actionButtonType2;
        ActionButtonType actionButtonType3 = new ActionButtonType("CHANGE", 2, R.string.clips_audio_dialog_selected_music_change);
        CHANGE = actionButtonType3;
        ActionButtonType[] actionButtonTypeArr = {actionButtonType, actionButtonType2, actionButtonType3};
        $VALUES = actionButtonTypeArr;
        $ENTRIES = new asp(actionButtonTypeArr);
    }

    public ActionButtonType(String str, int i, int i2) {
        this.text = i2;
    }

    public static ActionButtonType valueOf(String str) {
        return (ActionButtonType) Enum.valueOf(ActionButtonType.class, str);
    }

    public static ActionButtonType[] values() {
        return (ActionButtonType[]) $VALUES.clone();
    }

    public final int h() {
        return this.text;
    }
}
