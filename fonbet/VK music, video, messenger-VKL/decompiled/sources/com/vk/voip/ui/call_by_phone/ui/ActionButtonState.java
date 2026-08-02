package com.vk.voip.ui.call_by_phone.ui;

import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipCallByPhoneViewState.kt */
/* loaded from: classes7.dex */
public final class ActionButtonState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ActionButtonState[] $VALUES;
    public static final ActionButtonState CALL;
    public static final ActionButtonState CHECK_NUMBER;
    public static final ActionButtonState LOADING_SHARE;
    public static final ActionButtonState LOADING_USER;
    public static final ActionButtonState SHARE;
    private final VkButton.Appearance appearance;
    private final Integer iconRes;
    private final boolean isLoading;
    private final VkButton.Mode mode;
    private final Integer textRes;

    static {
        Integer valueOf = Integer.valueOf(R.string.voip_call_by_phone_check_number);
        VkButton.Mode mode = VkButton.Mode.Secondary;
        VkButton.Appearance appearance = VkButton.Appearance.Accent;
        ActionButtonState actionButtonState = new ActionButtonState("CHECK_NUMBER", 0, valueOf, false, mode, appearance, null);
        CHECK_NUMBER = actionButtonState;
        Integer valueOf2 = Integer.valueOf(R.string.voip_call_by_phone_call);
        VkButton.Mode mode2 = VkButton.Mode.Primary;
        ActionButtonState actionButtonState2 = new ActionButtonState("CALL", 1, valueOf2, false, mode2, VkButton.Appearance.Positive, null);
        CALL = actionButtonState2;
        Integer valueOf3 = Integer.valueOf(R.string.voip_call_by_phone_share_call_link);
        Integer valueOf4 = Integer.valueOf(R.drawable.vk_icon_share_outline_24);
        ActionButtonState actionButtonState3 = new ActionButtonState("SHARE", 2, valueOf3, false, mode2, appearance, valueOf4);
        SHARE = actionButtonState3;
        ActionButtonState actionButtonState4 = new ActionButtonState("LOADING_USER", 3, valueOf, true, mode, appearance, null);
        LOADING_USER = actionButtonState4;
        ActionButtonState actionButtonState5 = new ActionButtonState("LOADING_SHARE", 4, valueOf3, true, mode2, appearance, valueOf4);
        LOADING_SHARE = actionButtonState5;
        ActionButtonState[] actionButtonStateArr = {actionButtonState, actionButtonState2, actionButtonState3, actionButtonState4, actionButtonState5};
        $VALUES = actionButtonStateArr;
        $ENTRIES = new asp(actionButtonStateArr);
    }

    public ActionButtonState(String str, int i, Integer num, boolean z, VkButton.Mode mode, VkButton.Appearance appearance, Integer num2) {
        this.textRes = num;
        this.isLoading = z;
        this.mode = mode;
        this.appearance = appearance;
        this.iconRes = num2;
    }

    public static ActionButtonState valueOf(String str) {
        return (ActionButtonState) Enum.valueOf(ActionButtonState.class, str);
    }

    public static ActionButtonState[] values() {
        return (ActionButtonState[]) $VALUES.clone();
    }

    public final VkButton.Appearance h() {
        return this.appearance;
    }

    public final Integer i() {
        return this.iconRes;
    }

    public final VkButton.Mode j() {
        return this.mode;
    }

    public final Integer k() {
        return this.textRes;
    }

    public final boolean l() {
        return this.isLoading;
    }
}
