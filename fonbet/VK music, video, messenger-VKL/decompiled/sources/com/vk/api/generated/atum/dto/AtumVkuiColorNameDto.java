package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.impl.L2;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;
import xsna.atv0;
import xsna.e370;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AtumVkuiColorNameDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiColorNameDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AtumVkuiColorNameDto[] $VALUES;
    public static final Parcelable.Creator<AtumVkuiColorNameDto> CREATOR;
    private final String value;

    @pmi0("accent")
    public static final AtumVkuiColorNameDto ACCENT = new AtumVkuiColorNameDto("ACCENT", 0, "accent");

    @pmi0("accent_alternate")
    public static final AtumVkuiColorNameDto ACCENT_ALTERNATE = new AtumVkuiColorNameDto("ACCENT_ALTERNATE", 1, "accent_alternate");

    @pmi0("accent_azure")
    public static final AtumVkuiColorNameDto ACCENT_AZURE = new AtumVkuiColorNameDto("ACCENT_AZURE", 2, "accent_azure");

    @pmi0("accent_blue")
    public static final AtumVkuiColorNameDto ACCENT_BLUE = new AtumVkuiColorNameDto("ACCENT_BLUE", 3, "accent_blue");

    @pmi0("accent_cyan")
    public static final AtumVkuiColorNameDto ACCENT_CYAN = new AtumVkuiColorNameDto("ACCENT_CYAN", 4, "accent_cyan");

    @pmi0("accent_gray")
    public static final AtumVkuiColorNameDto ACCENT_GRAY = new AtumVkuiColorNameDto("ACCENT_GRAY", 5, "accent_gray");

    @pmi0("accent_green")
    public static final AtumVkuiColorNameDto ACCENT_GREEN = new AtumVkuiColorNameDto("ACCENT_GREEN", 6, "accent_green");

    @pmi0("accent_lime")
    public static final AtumVkuiColorNameDto ACCENT_LIME = new AtumVkuiColorNameDto("ACCENT_LIME", 7, "accent_lime");

    @pmi0("accent_orange")
    public static final AtumVkuiColorNameDto ACCENT_ORANGE = new AtumVkuiColorNameDto("ACCENT_ORANGE", 8, "accent_orange");

    @pmi0("accent_orange_fire")
    public static final AtumVkuiColorNameDto ACCENT_ORANGE_FIRE = new AtumVkuiColorNameDto("ACCENT_ORANGE_FIRE", 9, "accent_orange_fire");

    @pmi0("accent_orange_peach")
    public static final AtumVkuiColorNameDto ACCENT_ORANGE_PEACH = new AtumVkuiColorNameDto("ACCENT_ORANGE_PEACH", 10, "accent_orange_peach");

    @pmi0("accent_pink")
    public static final AtumVkuiColorNameDto ACCENT_PINK = new AtumVkuiColorNameDto("ACCENT_PINK", 11, "accent_pink");

    @pmi0("accent_purple")
    public static final AtumVkuiColorNameDto ACCENT_PURPLE = new AtumVkuiColorNameDto("ACCENT_PURPLE", 12, "accent_purple");

    @pmi0("accent_raspberry_pink")
    public static final AtumVkuiColorNameDto ACCENT_RASPBERRY_PINK = new AtumVkuiColorNameDto("ACCENT_RASPBERRY_PINK", 13, "accent_raspberry_pink");

    @pmi0("accent_red")
    public static final AtumVkuiColorNameDto ACCENT_RED = new AtumVkuiColorNameDto("ACCENT_RED", 14, "accent_red");

    @pmi0("accent_secondary")
    public static final AtumVkuiColorNameDto ACCENT_SECONDARY = new AtumVkuiColorNameDto("ACCENT_SECONDARY", 15, "accent_secondary");

    @pmi0("accent_violet")
    public static final AtumVkuiColorNameDto ACCENT_VIOLET = new AtumVkuiColorNameDto("ACCENT_VIOLET", 16, "accent_violet");

    @pmi0("action_sheet_action_foreground")
    public static final AtumVkuiColorNameDto ACTION_SHEET_ACTION_FOREGROUND = new AtumVkuiColorNameDto("ACTION_SHEET_ACTION_FOREGROUND", 17, "action_sheet_action_foreground");

    @pmi0("action_sheet_separator")
    public static final AtumVkuiColorNameDto ACTION_SHEET_SEPARATOR = new AtumVkuiColorNameDto("ACTION_SHEET_SEPARATOR", 18, "action_sheet_separator");

    @pmi0("action_sheet_text")
    public static final AtumVkuiColorNameDto ACTION_SHEET_TEXT = new AtumVkuiColorNameDto("ACTION_SHEET_TEXT", 19, "action_sheet_text");

    @pmi0("activity_indicator_tint")
    public static final AtumVkuiColorNameDto ACTIVITY_INDICATOR_TINT = new AtumVkuiColorNameDto("ACTIVITY_INDICATOR_TINT", 20, "activity_indicator_tint");

    @pmi0("attach_picker_tab_active_background")
    public static final AtumVkuiColorNameDto ATTACH_PICKER_TAB_ACTIVE_BACKGROUND = new AtumVkuiColorNameDto("ATTACH_PICKER_TAB_ACTIVE_BACKGROUND", 21, "attach_picker_tab_active_background");

    @pmi0("attach_picker_tab_active_icon")
    public static final AtumVkuiColorNameDto ATTACH_PICKER_TAB_ACTIVE_ICON = new AtumVkuiColorNameDto("ATTACH_PICKER_TAB_ACTIVE_ICON", 22, "attach_picker_tab_active_icon");

    @pmi0("attach_picker_tab_active_text")
    public static final AtumVkuiColorNameDto ATTACH_PICKER_TAB_ACTIVE_TEXT = new AtumVkuiColorNameDto("ATTACH_PICKER_TAB_ACTIVE_TEXT", 23, "attach_picker_tab_active_text");

    @pmi0("attach_picker_tab_inactive_background")
    public static final AtumVkuiColorNameDto ATTACH_PICKER_TAB_INACTIVE_BACKGROUND = new AtumVkuiColorNameDto("ATTACH_PICKER_TAB_INACTIVE_BACKGROUND", 24, "attach_picker_tab_inactive_background");

    @pmi0("attach_picker_tab_inactive_icon")
    public static final AtumVkuiColorNameDto ATTACH_PICKER_TAB_INACTIVE_ICON = new AtumVkuiColorNameDto("ATTACH_PICKER_TAB_INACTIVE_ICON", 25, "attach_picker_tab_inactive_icon");

    @pmi0("attach_picker_tab_inactive_text")
    public static final AtumVkuiColorNameDto ATTACH_PICKER_TAB_INACTIVE_TEXT = new AtumVkuiColorNameDto("ATTACH_PICKER_TAB_INACTIVE_TEXT", 26, "attach_picker_tab_inactive_text");

    @pmi0("avatar_overlay")
    public static final AtumVkuiColorNameDto AVATAR_OVERLAY = new AtumVkuiColorNameDto("AVATAR_OVERLAY", 27, "avatar_overlay");

    @pmi0("avatar_overlay_inverse_alpha")
    public static final AtumVkuiColorNameDto AVATAR_OVERLAY_INVERSE_ALPHA = new AtumVkuiColorNameDto("AVATAR_OVERLAY_INVERSE_ALPHA", 28, "avatar_overlay_inverse_alpha");

    @pmi0(L2.g)
    public static final AtumVkuiColorNameDto BACKGROUND = new AtumVkuiColorNameDto("BACKGROUND", 29, L2.g);

    @pmi0("background_accent")
    public static final AtumVkuiColorNameDto BACKGROUND_ACCENT = new AtumVkuiColorNameDto("BACKGROUND_ACCENT", 30, "background_accent");

    @pmi0("background_accent_alternative")
    public static final AtumVkuiColorNameDto BACKGROUND_ACCENT_ALTERNATIVE = new AtumVkuiColorNameDto("BACKGROUND_ACCENT_ALTERNATIVE", 31, "background_accent_alternative");

    @pmi0("background_accent_themed")
    public static final AtumVkuiColorNameDto BACKGROUND_ACCENT_THEMED = new AtumVkuiColorNameDto("BACKGROUND_ACCENT_THEMED", 32, "background_accent_themed");

    @pmi0("background_accent_themed_alpha")
    public static final AtumVkuiColorNameDto BACKGROUND_ACCENT_THEMED_ALPHA = new AtumVkuiColorNameDto("BACKGROUND_ACCENT_THEMED_ALPHA", 33, "background_accent_themed_alpha");

    @pmi0("background_accent_tint")
    public static final AtumVkuiColorNameDto BACKGROUND_ACCENT_TINT = new AtumVkuiColorNameDto("BACKGROUND_ACCENT_TINT", 34, "background_accent_tint");

    @pmi0("background_card_alpha")
    public static final AtumVkuiColorNameDto BACKGROUND_CARD_ALPHA = new AtumVkuiColorNameDto("BACKGROUND_CARD_ALPHA", 35, "background_card_alpha");

    @pmi0("background_content")
    public static final AtumVkuiColorNameDto BACKGROUND_CONTENT = new AtumVkuiColorNameDto("BACKGROUND_CONTENT", 36, "background_content");

    @pmi0("background_content_alpha")
    public static final AtumVkuiColorNameDto BACKGROUND_CONTENT_ALPHA = new AtumVkuiColorNameDto("BACKGROUND_CONTENT_ALPHA", 37, "background_content_alpha");

    @pmi0("background_content_inverse")
    public static final AtumVkuiColorNameDto BACKGROUND_CONTENT_INVERSE = new AtumVkuiColorNameDto("BACKGROUND_CONTENT_INVERSE", 38, "background_content_inverse");

    @pmi0("background_contrast")
    public static final AtumVkuiColorNameDto BACKGROUND_CONTRAST = new AtumVkuiColorNameDto("BACKGROUND_CONTRAST", 39, "background_contrast");

    @pmi0("background_contrast_inverse")
    public static final AtumVkuiColorNameDto BACKGROUND_CONTRAST_INVERSE = new AtumVkuiColorNameDto("BACKGROUND_CONTRAST_INVERSE", 40, "background_contrast_inverse");

    @pmi0("background_contrast_secondary_alpha")
    public static final AtumVkuiColorNameDto BACKGROUND_CONTRAST_SECONDARY_ALPHA = new AtumVkuiColorNameDto("BACKGROUND_CONTRAST_SECONDARY_ALPHA", 41, "background_contrast_secondary_alpha");

    @pmi0("background_contrast_themed")
    public static final AtumVkuiColorNameDto BACKGROUND_CONTRAST_THEMED = new AtumVkuiColorNameDto("BACKGROUND_CONTRAST_THEMED", 42, "background_contrast_themed");

    @pmi0("background_highlighted")
    public static final AtumVkuiColorNameDto BACKGROUND_HIGHLIGHTED = new AtumVkuiColorNameDto("BACKGROUND_HIGHLIGHTED", 43, "background_highlighted");

    @pmi0("background_hover")
    public static final AtumVkuiColorNameDto BACKGROUND_HOVER = new AtumVkuiColorNameDto("BACKGROUND_HOVER", 44, "background_hover");

    @pmi0("background_info_tint")
    public static final AtumVkuiColorNameDto BACKGROUND_INFO_TINT = new AtumVkuiColorNameDto("BACKGROUND_INFO_TINT", 45, "background_info_tint");

    @pmi0("background_keyboard")
    public static final AtumVkuiColorNameDto BACKGROUND_KEYBOARD = new AtumVkuiColorNameDto("BACKGROUND_KEYBOARD", 46, "background_keyboard");

    @pmi0("background_light")
    public static final AtumVkuiColorNameDto BACKGROUND_LIGHT = new AtumVkuiColorNameDto("BACKGROUND_LIGHT", 47, "background_light");

    @pmi0("background_modal")
    public static final AtumVkuiColorNameDto BACKGROUND_MODAL = new AtumVkuiColorNameDto("BACKGROUND_MODAL", 48, "background_modal");

    @pmi0("background_modal_inverse")
    public static final AtumVkuiColorNameDto BACKGROUND_MODAL_INVERSE = new AtumVkuiColorNameDto("BACKGROUND_MODAL_INVERSE", 49, "background_modal_inverse");

    @pmi0("background_negative")
    public static final AtumVkuiColorNameDto BACKGROUND_NEGATIVE = new AtumVkuiColorNameDto("BACKGROUND_NEGATIVE", 50, "background_negative");

    @pmi0("background_negative_tint")
    public static final AtumVkuiColorNameDto BACKGROUND_NEGATIVE_TINT = new AtumVkuiColorNameDto("BACKGROUND_NEGATIVE_TINT", 51, "background_negative_tint");

    @pmi0("background_overlay_secondary")
    public static final AtumVkuiColorNameDto BACKGROUND_OVERLAY_SECONDARY = new AtumVkuiColorNameDto("BACKGROUND_OVERLAY_SECONDARY", 52, "background_overlay_secondary");

    @pmi0("background_page")
    public static final AtumVkuiColorNameDto BACKGROUND_PAGE = new AtumVkuiColorNameDto("BACKGROUND_PAGE", 53, "background_page");

    @pmi0("background_positive")
    public static final AtumVkuiColorNameDto BACKGROUND_POSITIVE = new AtumVkuiColorNameDto("BACKGROUND_POSITIVE", 54, "background_positive");

    @pmi0("background_positive_tint")
    public static final AtumVkuiColorNameDto BACKGROUND_POSITIVE_TINT = new AtumVkuiColorNameDto("BACKGROUND_POSITIVE_TINT", 55, "background_positive_tint");

    @pmi0("background_secondary")
    public static final AtumVkuiColorNameDto BACKGROUND_SECONDARY = new AtumVkuiColorNameDto("BACKGROUND_SECONDARY", 56, "background_secondary");

    @pmi0("background_secondary_alpha")
    public static final AtumVkuiColorNameDto BACKGROUND_SECONDARY_ALPHA = new AtumVkuiColorNameDto("BACKGROUND_SECONDARY_ALPHA", 57, "background_secondary_alpha");

    @pmi0("background_suggestions")
    public static final AtumVkuiColorNameDto BACKGROUND_SUGGESTIONS = new AtumVkuiColorNameDto("BACKGROUND_SUGGESTIONS", 58, "background_suggestions");

    @pmi0("background_tertiary")
    public static final AtumVkuiColorNameDto BACKGROUND_TERTIARY = new AtumVkuiColorNameDto("BACKGROUND_TERTIARY", 59, "background_tertiary");

    @pmi0("background_tertiary_alpha")
    public static final AtumVkuiColorNameDto BACKGROUND_TERTIARY_ALPHA = new AtumVkuiColorNameDto("BACKGROUND_TERTIARY_ALPHA", 60, "background_tertiary_alpha");

    @pmi0("background_text_highlighted")
    public static final AtumVkuiColorNameDto BACKGROUND_TEXT_HIGHLIGHTED = new AtumVkuiColorNameDto("BACKGROUND_TEXT_HIGHLIGHTED", 61, "background_text_highlighted");

    @pmi0("background_warning")
    public static final AtumVkuiColorNameDto BACKGROUND_WARNING = new AtumVkuiColorNameDto("BACKGROUND_WARNING", 62, "background_warning");

    @pmi0("button_bot_shadow")
    public static final AtumVkuiColorNameDto BUTTON_BOT_SHADOW = new AtumVkuiColorNameDto("BUTTON_BOT_SHADOW", 63, "button_bot_shadow");

    @pmi0("button_commerce_background")
    public static final AtumVkuiColorNameDto BUTTON_COMMERCE_BACKGROUND = new AtumVkuiColorNameDto("BUTTON_COMMERCE_BACKGROUND", 64, "button_commerce_background");

    @pmi0("button_commerce_foreground")
    public static final AtumVkuiColorNameDto BUTTON_COMMERCE_FOREGROUND = new AtumVkuiColorNameDto("BUTTON_COMMERCE_FOREGROUND", 65, "button_commerce_foreground");

    @pmi0("button_icon")
    public static final AtumVkuiColorNameDto BUTTON_ICON = new AtumVkuiColorNameDto("BUTTON_ICON", 66, "button_icon");

    @pmi0("button_muted_background")
    public static final AtumVkuiColorNameDto BUTTON_MUTED_BACKGROUND = new AtumVkuiColorNameDto("BUTTON_MUTED_BACKGROUND", 67, "button_muted_background");

    @pmi0("button_muted_foreground")
    public static final AtumVkuiColorNameDto BUTTON_MUTED_FOREGROUND = new AtumVkuiColorNameDto("BUTTON_MUTED_FOREGROUND", 68, "button_muted_foreground");

    @pmi0("button_outline_border")
    public static final AtumVkuiColorNameDto BUTTON_OUTLINE_BORDER = new AtumVkuiColorNameDto("BUTTON_OUTLINE_BORDER", 69, "button_outline_border");

    @pmi0("button_outline_foreground")
    public static final AtumVkuiColorNameDto BUTTON_OUTLINE_FOREGROUND = new AtumVkuiColorNameDto("BUTTON_OUTLINE_FOREGROUND", 70, "button_outline_foreground");

    @pmi0("button_primary_background")
    public static final AtumVkuiColorNameDto BUTTON_PRIMARY_BACKGROUND = new AtumVkuiColorNameDto("BUTTON_PRIMARY_BACKGROUND", 71, "button_primary_background");

    @pmi0("button_primary_foreground")
    public static final AtumVkuiColorNameDto BUTTON_PRIMARY_FOREGROUND = new AtumVkuiColorNameDto("BUTTON_PRIMARY_FOREGROUND", 72, "button_primary_foreground");

    @pmi0("button_secondary_background")
    public static final AtumVkuiColorNameDto BUTTON_SECONDARY_BACKGROUND = new AtumVkuiColorNameDto("BUTTON_SECONDARY_BACKGROUND", 73, "button_secondary_background");

    @pmi0("button_secondary_background_highlighted")
    public static final AtumVkuiColorNameDto BUTTON_SECONDARY_BACKGROUND_HIGHLIGHTED = new AtumVkuiColorNameDto("BUTTON_SECONDARY_BACKGROUND_HIGHLIGHTED", 74, "button_secondary_background_highlighted");

    @pmi0("button_secondary_destructive_background")
    public static final AtumVkuiColorNameDto BUTTON_SECONDARY_DESTRUCTIVE_BACKGROUND = new AtumVkuiColorNameDto("BUTTON_SECONDARY_DESTRUCTIVE_BACKGROUND", 75, "button_secondary_destructive_background");

    @pmi0("button_secondary_destructive_background_highlighted")
    public static final AtumVkuiColorNameDto BUTTON_SECONDARY_DESTRUCTIVE_BACKGROUND_HIGHLIGHTED = new AtumVkuiColorNameDto("BUTTON_SECONDARY_DESTRUCTIVE_BACKGROUND_HIGHLIGHTED", 76, "button_secondary_destructive_background_highlighted");

    @pmi0("button_secondary_destructive_foreground")
    public static final AtumVkuiColorNameDto BUTTON_SECONDARY_DESTRUCTIVE_FOREGROUND = new AtumVkuiColorNameDto("BUTTON_SECONDARY_DESTRUCTIVE_FOREGROUND", 77, "button_secondary_destructive_foreground");

    @pmi0("button_secondary_destructive_foreground_highlighted")
    public static final AtumVkuiColorNameDto BUTTON_SECONDARY_DESTRUCTIVE_FOREGROUND_HIGHLIGHTED = new AtumVkuiColorNameDto("BUTTON_SECONDARY_DESTRUCTIVE_FOREGROUND_HIGHLIGHTED", 78, "button_secondary_destructive_foreground_highlighted");

    @pmi0("button_secondary_foreground")
    public static final AtumVkuiColorNameDto BUTTON_SECONDARY_FOREGROUND = new AtumVkuiColorNameDto("BUTTON_SECONDARY_FOREGROUND", 79, "button_secondary_foreground");

    @pmi0("button_secondary_foreground_highlighted")
    public static final AtumVkuiColorNameDto BUTTON_SECONDARY_FOREGROUND_HIGHLIGHTED = new AtumVkuiColorNameDto("BUTTON_SECONDARY_FOREGROUND_HIGHLIGHTED", 80, "button_secondary_foreground_highlighted");

    @pmi0("button_stroke")
    public static final AtumVkuiColorNameDto BUTTON_STROKE = new AtumVkuiColorNameDto("BUTTON_STROKE", 81, "button_stroke");

    @pmi0("button_tertiary_background")
    public static final AtumVkuiColorNameDto BUTTON_TERTIARY_BACKGROUND = new AtumVkuiColorNameDto("BUTTON_TERTIARY_BACKGROUND", 82, "button_tertiary_background");

    @pmi0("button_tertiary_foreground")
    public static final AtumVkuiColorNameDto BUTTON_TERTIARY_FOREGROUND = new AtumVkuiColorNameDto("BUTTON_TERTIARY_FOREGROUND", 83, "button_tertiary_foreground");

    @pmi0("button_text")
    public static final AtumVkuiColorNameDto BUTTON_TEXT = new AtumVkuiColorNameDto("BUTTON_TEXT", 84, "button_text");

    @pmi0("cell_button_foreground")
    public static final AtumVkuiColorNameDto CELL_BUTTON_FOREGROUND = new AtumVkuiColorNameDto("CELL_BUTTON_FOREGROUND", 85, "cell_button_foreground");

    @pmi0("content_placeholder_icon")
    public static final AtumVkuiColorNameDto CONTENT_PLACEHOLDER_ICON = new AtumVkuiColorNameDto("CONTENT_PLACEHOLDER_ICON", 86, "content_placeholder_icon");

    @pmi0("content_placeholder_text")
    public static final AtumVkuiColorNameDto CONTENT_PLACEHOLDER_TEXT = new AtumVkuiColorNameDto("CONTENT_PLACEHOLDER_TEXT", 87, "content_placeholder_text");

    @pmi0("content_positive_background")
    public static final AtumVkuiColorNameDto CONTENT_POSITIVE_BACKGROUND = new AtumVkuiColorNameDto("CONTENT_POSITIVE_BACKGROUND", 88, "content_positive_background");

    @pmi0("content_tint_background")
    public static final AtumVkuiColorNameDto CONTENT_TINT_BACKGROUND = new AtumVkuiColorNameDto("CONTENT_TINT_BACKGROUND", 89, "content_tint_background");

    @pmi0("content_tint_foreground")
    public static final AtumVkuiColorNameDto CONTENT_TINT_FOREGROUND = new AtumVkuiColorNameDto("CONTENT_TINT_FOREGROUND", 90, "content_tint_foreground");

    @pmi0("content_warning_background")
    public static final AtumVkuiColorNameDto CONTENT_WARNING_BACKGROUND = new AtumVkuiColorNameDto("CONTENT_WARNING_BACKGROUND", 91, "content_warning_background");

    @pmi0("control_background")
    public static final AtumVkuiColorNameDto CONTROL_BACKGROUND = new AtumVkuiColorNameDto("CONTROL_BACKGROUND", 92, "control_background");

    @pmi0("control_background_secondary")
    public static final AtumVkuiColorNameDto CONTROL_BACKGROUND_SECONDARY = new AtumVkuiColorNameDto("CONTROL_BACKGROUND_SECONDARY", 93, "control_background_secondary");

    @pmi0("control_foreground")
    public static final AtumVkuiColorNameDto CONTROL_FOREGROUND = new AtumVkuiColorNameDto("CONTROL_FOREGROUND", 94, "control_foreground");

    @pmi0("control_tint")
    public static final AtumVkuiColorNameDto CONTROL_TINT = new AtumVkuiColorNameDto("CONTROL_TINT", 95, "control_tint");

    @pmi0("control_tint_muted")
    public static final AtumVkuiColorNameDto CONTROL_TINT_MUTED = new AtumVkuiColorNameDto("CONTROL_TINT_MUTED", 96, "control_tint_muted");

    @pmi0("counter_primary_background")
    public static final AtumVkuiColorNameDto COUNTER_PRIMARY_BACKGROUND = new AtumVkuiColorNameDto("COUNTER_PRIMARY_BACKGROUND", 97, "counter_primary_background");

    @pmi0("counter_primary_text")
    public static final AtumVkuiColorNameDto COUNTER_PRIMARY_TEXT = new AtumVkuiColorNameDto("COUNTER_PRIMARY_TEXT", 98, "counter_primary_text");

    @pmi0("counter_prominent_background")
    public static final AtumVkuiColorNameDto COUNTER_PROMINENT_BACKGROUND = new AtumVkuiColorNameDto("COUNTER_PROMINENT_BACKGROUND", 99, "counter_prominent_background");

    @pmi0("counter_prominent_text")
    public static final AtumVkuiColorNameDto COUNTER_PROMINENT_TEXT = new AtumVkuiColorNameDto("COUNTER_PROMINENT_TEXT", 100, "counter_prominent_text");

    @pmi0("counter_secondary_background")
    public static final AtumVkuiColorNameDto COUNTER_SECONDARY_BACKGROUND = new AtumVkuiColorNameDto("COUNTER_SECONDARY_BACKGROUND", 101, "counter_secondary_background");

    @pmi0("counter_secondary_text")
    public static final AtumVkuiColorNameDto COUNTER_SECONDARY_TEXT = new AtumVkuiColorNameDto("COUNTER_SECONDARY_TEXT", 102, "counter_secondary_text");

    @pmi0("destructive")
    public static final AtumVkuiColorNameDto DESTRUCTIVE = new AtumVkuiColorNameDto("DESTRUCTIVE", 103, "destructive");

    @pmi0("dynamic_blue")
    public static final AtumVkuiColorNameDto DYNAMIC_BLUE = new AtumVkuiColorNameDto("DYNAMIC_BLUE", 104, "dynamic_blue");

    @pmi0("dynamic_gray")
    public static final AtumVkuiColorNameDto DYNAMIC_GRAY = new AtumVkuiColorNameDto("DYNAMIC_GRAY", 105, "dynamic_gray");

    @pmi0("dynamic_green")
    public static final AtumVkuiColorNameDto DYNAMIC_GREEN = new AtumVkuiColorNameDto("DYNAMIC_GREEN", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "dynamic_green");

    @pmi0("dynamic_neon_pink")
    public static final AtumVkuiColorNameDto DYNAMIC_NEON_PINK = new AtumVkuiColorNameDto("DYNAMIC_NEON_PINK", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "dynamic_neon_pink");

    @pmi0("dynamic_orange")
    public static final AtumVkuiColorNameDto DYNAMIC_ORANGE = new AtumVkuiColorNameDto("DYNAMIC_ORANGE", 108, "dynamic_orange");

    @pmi0("dynamic_orange_peach")
    public static final AtumVkuiColorNameDto DYNAMIC_ORANGE_PEACH = new AtumVkuiColorNameDto("DYNAMIC_ORANGE_PEACH", 109, "dynamic_orange_peach");

    @pmi0("dynamic_purple")
    public static final AtumVkuiColorNameDto DYNAMIC_PURPLE = new AtumVkuiColorNameDto("DYNAMIC_PURPLE", 110, "dynamic_purple");

    @pmi0("dynamic_raspberry_pink")
    public static final AtumVkuiColorNameDto DYNAMIC_RASPBERRY_PINK = new AtumVkuiColorNameDto("DYNAMIC_RASPBERRY_PINK", 111, "dynamic_raspberry_pink");

    @pmi0("dynamic_red")
    public static final AtumVkuiColorNameDto DYNAMIC_RED = new AtumVkuiColorNameDto("DYNAMIC_RED", 112, "dynamic_red");

    @pmi0("dynamic_violet")
    public static final AtumVkuiColorNameDto DYNAMIC_VIOLET = new AtumVkuiColorNameDto("DYNAMIC_VIOLET", 113, "dynamic_violet");

    @pmi0("feed_recommended_friend_promo_background")
    public static final AtumVkuiColorNameDto FEED_RECOMMENDED_FRIEND_PROMO_BACKGROUND = new AtumVkuiColorNameDto("FEED_RECOMMENDED_FRIEND_PROMO_BACKGROUND", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, "feed_recommended_friend_promo_background");

    @pmi0("field_background")
    public static final AtumVkuiColorNameDto FIELD_BACKGROUND = new AtumVkuiColorNameDto("FIELD_BACKGROUND", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, "field_background");

    @pmi0("field_border")
    public static final AtumVkuiColorNameDto FIELD_BORDER = new AtumVkuiColorNameDto("FIELD_BORDER", 116, "field_border");

    @pmi0("field_border_alpha")
    public static final AtumVkuiColorNameDto FIELD_BORDER_ALPHA = new AtumVkuiColorNameDto("FIELD_BORDER_ALPHA", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "field_border_alpha");

    @pmi0("field_error_background")
    public static final AtumVkuiColorNameDto FIELD_ERROR_BACKGROUND = new AtumVkuiColorNameDto("FIELD_ERROR_BACKGROUND", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "field_error_background");

    @pmi0("field_error_border")
    public static final AtumVkuiColorNameDto FIELD_ERROR_BORDER = new AtumVkuiColorNameDto("FIELD_ERROR_BORDER", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "field_error_border");

    @pmi0("field_text_placeholder")
    public static final AtumVkuiColorNameDto FIELD_TEXT_PLACEHOLDER = new AtumVkuiColorNameDto("FIELD_TEXT_PLACEHOLDER", 120, "field_text_placeholder");

    @pmi0("field_valid_border")
    public static final AtumVkuiColorNameDto FIELD_VALID_BORDER = new AtumVkuiColorNameDto("FIELD_VALID_BORDER", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "field_valid_border");

    @pmi0("float_button_background")
    public static final AtumVkuiColorNameDto FLOAT_BUTTON_BACKGROUND = new AtumVkuiColorNameDto("FLOAT_BUTTON_BACKGROUND", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "float_button_background");

    @pmi0("float_button_background_highlighted")
    public static final AtumVkuiColorNameDto FLOAT_BUTTON_BACKGROUND_HIGHLIGHTED = new AtumVkuiColorNameDto("FLOAT_BUTTON_BACKGROUND_HIGHLIGHTED", 123, "float_button_background_highlighted");

    @pmi0("float_button_border")
    public static final AtumVkuiColorNameDto FLOAT_BUTTON_BORDER = new AtumVkuiColorNameDto("FLOAT_BUTTON_BORDER", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "float_button_border");

    @pmi0("float_button_foreground")
    public static final AtumVkuiColorNameDto FLOAT_BUTTON_FOREGROUND = new AtumVkuiColorNameDto("FLOAT_BUTTON_FOREGROUND", 125, "float_button_foreground");

    @pmi0("header_alternate_background")
    public static final AtumVkuiColorNameDto HEADER_ALTERNATE_BACKGROUND = new AtumVkuiColorNameDto("HEADER_ALTERNATE_BACKGROUND", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, "header_alternate_background");

    @pmi0("header_alternate_tab_active_indicator")
    public static final AtumVkuiColorNameDto HEADER_ALTERNATE_TAB_ACTIVE_INDICATOR = new AtumVkuiColorNameDto("HEADER_ALTERNATE_TAB_ACTIVE_INDICATOR", 127, "header_alternate_tab_active_indicator");

    @pmi0("header_alternate_tab_active_text")
    public static final AtumVkuiColorNameDto HEADER_ALTERNATE_TAB_ACTIVE_TEXT = new AtumVkuiColorNameDto("HEADER_ALTERNATE_TAB_ACTIVE_TEXT", 128, "header_alternate_tab_active_text");

    @pmi0("header_alternate_tab_inactive_text")
    public static final AtumVkuiColorNameDto HEADER_ALTERNATE_TAB_INACTIVE_TEXT = new AtumVkuiColorNameDto("HEADER_ALTERNATE_TAB_INACTIVE_TEXT", 129, "header_alternate_tab_inactive_text");

    @pmi0("header_background")
    public static final AtumVkuiColorNameDto HEADER_BACKGROUND = new AtumVkuiColorNameDto("HEADER_BACKGROUND", 130, "header_background");

    @pmi0("header_background_before_blur")
    public static final AtumVkuiColorNameDto HEADER_BACKGROUND_BEFORE_BLUR = new AtumVkuiColorNameDto("HEADER_BACKGROUND_BEFORE_BLUR", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, "header_background_before_blur");

    @pmi0("header_background_before_blur_alternate")
    public static final AtumVkuiColorNameDto HEADER_BACKGROUND_BEFORE_BLUR_ALTERNATE = new AtumVkuiColorNameDto("HEADER_BACKGROUND_BEFORE_BLUR_ALTERNATE", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, "header_background_before_blur_alternate");

    @pmi0("header_search_field_background")
    public static final AtumVkuiColorNameDto HEADER_SEARCH_FIELD_BACKGROUND = new AtumVkuiColorNameDto("HEADER_SEARCH_FIELD_BACKGROUND", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "header_search_field_background");

    @pmi0("header_search_field_tint")
    public static final AtumVkuiColorNameDto HEADER_SEARCH_FIELD_TINT = new AtumVkuiColorNameDto("HEADER_SEARCH_FIELD_TINT", 134, "header_search_field_tint");

    @pmi0("header_tab_active_background")
    public static final AtumVkuiColorNameDto HEADER_TAB_ACTIVE_BACKGROUND = new AtumVkuiColorNameDto("HEADER_TAB_ACTIVE_BACKGROUND", 135, "header_tab_active_background");

    @pmi0("header_tab_active_indicator")
    public static final AtumVkuiColorNameDto HEADER_TAB_ACTIVE_INDICATOR = new AtumVkuiColorNameDto("HEADER_TAB_ACTIVE_INDICATOR", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, "header_tab_active_indicator");

    @pmi0("header_tab_active_text")
    public static final AtumVkuiColorNameDto HEADER_TAB_ACTIVE_TEXT = new AtumVkuiColorNameDto("HEADER_TAB_ACTIVE_TEXT", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "header_tab_active_text");

    @pmi0("header_tab_inactive_text")
    public static final AtumVkuiColorNameDto HEADER_TAB_INACTIVE_TEXT = new AtumVkuiColorNameDto("HEADER_TAB_INACTIVE_TEXT", 138, "header_tab_inactive_text");

    @pmi0("header_text")
    public static final AtumVkuiColorNameDto HEADER_TEXT = new AtumVkuiColorNameDto("HEADER_TEXT", 139, "header_text");

    @pmi0("header_text_alternate")
    public static final AtumVkuiColorNameDto HEADER_TEXT_ALTERNATE = new AtumVkuiColorNameDto("HEADER_TEXT_ALTERNATE", VersionConstants.PRODUCT_MAJOR_VERSION, "header_text_alternate");

    @pmi0("header_text_secondary")
    public static final AtumVkuiColorNameDto HEADER_TEXT_SECONDARY = new AtumVkuiColorNameDto("HEADER_TEXT_SECONDARY", 141, "header_text_secondary");

    @pmi0("header_tint")
    public static final AtumVkuiColorNameDto HEADER_TINT = new AtumVkuiColorNameDto("HEADER_TINT", 142, "header_tint");

    @pmi0("header_tint_alternate")
    public static final AtumVkuiColorNameDto HEADER_TINT_ALTERNATE = new AtumVkuiColorNameDto("HEADER_TINT_ALTERNATE", 143, "header_tint_alternate");

    @pmi0("icon_accent")
    public static final AtumVkuiColorNameDto ICON_ACCENT = new AtumVkuiColorNameDto("ICON_ACCENT", 144, "icon_accent");

    @pmi0("icon_accent_themed")
    public static final AtumVkuiColorNameDto ICON_ACCENT_THEMED = new AtumVkuiColorNameDto("ICON_ACCENT_THEMED", 145, "icon_accent_themed");

    @pmi0("icon_alpha_placeholder")
    public static final AtumVkuiColorNameDto ICON_ALPHA_PLACEHOLDER = new AtumVkuiColorNameDto("ICON_ALPHA_PLACEHOLDER", 146, "icon_alpha_placeholder");

    @pmi0("icon_contrast")
    public static final AtumVkuiColorNameDto ICON_CONTRAST = new AtumVkuiColorNameDto("ICON_CONTRAST", 147, "icon_contrast");

    @pmi0("icon_contrast_secondary")
    public static final AtumVkuiColorNameDto ICON_CONTRAST_SECONDARY = new AtumVkuiColorNameDto("ICON_CONTRAST_SECONDARY", 148, "icon_contrast_secondary");

    @pmi0("icon_contrast_themed")
    public static final AtumVkuiColorNameDto ICON_CONTRAST_THEMED = new AtumVkuiColorNameDto("ICON_CONTRAST_THEMED", 149, "icon_contrast_themed");

    @pmi0("icon_medium")
    public static final AtumVkuiColorNameDto ICON_MEDIUM = new AtumVkuiColorNameDto("ICON_MEDIUM", 150, "icon_medium");

    @pmi0("icon_medium_alpha")
    public static final AtumVkuiColorNameDto ICON_MEDIUM_ALPHA = new AtumVkuiColorNameDto("ICON_MEDIUM_ALPHA", 151, "icon_medium_alpha");

    @pmi0("icon_name")
    public static final AtumVkuiColorNameDto ICON_NAME = new AtumVkuiColorNameDto("ICON_NAME", 152, "icon_name");

    @pmi0("icon_negative")
    public static final AtumVkuiColorNameDto ICON_NEGATIVE = new AtumVkuiColorNameDto("ICON_NEGATIVE", 153, "icon_negative");

    @pmi0("icon_outline_medium")
    public static final AtumVkuiColorNameDto ICON_OUTLINE_MEDIUM = new AtumVkuiColorNameDto("ICON_OUTLINE_MEDIUM", 154, "icon_outline_medium");

    @pmi0("icon_outline_secondary")
    public static final AtumVkuiColorNameDto ICON_OUTLINE_SECONDARY = new AtumVkuiColorNameDto("ICON_OUTLINE_SECONDARY", 155, "icon_outline_secondary");

    @pmi0("icon_positive")
    public static final AtumVkuiColorNameDto ICON_POSITIVE = new AtumVkuiColorNameDto("ICON_POSITIVE", 156, "icon_positive");

    @pmi0("icon_primary")
    public static final AtumVkuiColorNameDto ICON_PRIMARY = new AtumVkuiColorNameDto("ICON_PRIMARY", 157, "icon_primary");

    @pmi0("icon_primary_invariably")
    public static final AtumVkuiColorNameDto ICON_PRIMARY_INVARIABLY = new AtumVkuiColorNameDto("ICON_PRIMARY_INVARIABLY", 158, "icon_primary_invariably");

    @pmi0("icon_secondary")
    public static final AtumVkuiColorNameDto ICON_SECONDARY = new AtumVkuiColorNameDto("ICON_SECONDARY", 159, "icon_secondary");

    @pmi0("icon_secondary_alpha")
    public static final AtumVkuiColorNameDto ICON_SECONDARY_ALPHA = new AtumVkuiColorNameDto("ICON_SECONDARY_ALPHA", 160, "icon_secondary_alpha");

    @pmi0("icon_tertiary")
    public static final AtumVkuiColorNameDto ICON_TERTIARY = new AtumVkuiColorNameDto("ICON_TERTIARY", 161, "icon_tertiary");

    @pmi0("icon_tertiary_alpha")
    public static final AtumVkuiColorNameDto ICON_TERTIARY_ALPHA = new AtumVkuiColorNameDto("ICON_TERTIARY_ALPHA", 162, "icon_tertiary_alpha");

    @pmi0("icon_warning")
    public static final AtumVkuiColorNameDto ICON_WARNING = new AtumVkuiColorNameDto("ICON_WARNING", 163, "icon_warning");

    @pmi0("im_attach_tint")
    public static final AtumVkuiColorNameDto IM_ATTACH_TINT = new AtumVkuiColorNameDto("IM_ATTACH_TINT", 164, "im_attach_tint");

    @pmi0("im_bubble_border_alternate")
    public static final AtumVkuiColorNameDto IM_BUBBLE_BORDER_ALTERNATE = new AtumVkuiColorNameDto("IM_BUBBLE_BORDER_ALTERNATE", 165, "im_bubble_border_alternate");

    @pmi0("im_bubble_border_alternate_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_BORDER_ALTERNATE_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_BORDER_ALTERNATE_HIGHLIGHTED", 166, "im_bubble_border_alternate_highlighted");

    @pmi0("im_bubble_button_background")
    public static final AtumVkuiColorNameDto IM_BUBBLE_BUTTON_BACKGROUND = new AtumVkuiColorNameDto("IM_BUBBLE_BUTTON_BACKGROUND", 167, "im_bubble_button_background");

    @pmi0("im_bubble_button_background_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_BUTTON_BACKGROUND_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_BUTTON_BACKGROUND_HIGHLIGHTED", 168, "im_bubble_button_background_highlighted");

    @pmi0("im_bubble_button_foreground")
    public static final AtumVkuiColorNameDto IM_BUBBLE_BUTTON_FOREGROUND = new AtumVkuiColorNameDto("IM_BUBBLE_BUTTON_FOREGROUND", 169, "im_bubble_button_foreground");

    @pmi0("im_bubble_button_outgoing_background")
    public static final AtumVkuiColorNameDto IM_BUBBLE_BUTTON_OUTGOING_BACKGROUND = new AtumVkuiColorNameDto("IM_BUBBLE_BUTTON_OUTGOING_BACKGROUND", 170, "im_bubble_button_outgoing_background");

    @pmi0("im_bubble_gift_background")
    public static final AtumVkuiColorNameDto IM_BUBBLE_GIFT_BACKGROUND = new AtumVkuiColorNameDto("IM_BUBBLE_GIFT_BACKGROUND", 171, "im_bubble_gift_background");

    @pmi0("im_bubble_gift_background_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_GIFT_BACKGROUND_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_GIFT_BACKGROUND_HIGHLIGHTED", 172, "im_bubble_gift_background_highlighted");

    @pmi0("im_bubble_gift_text")
    public static final AtumVkuiColorNameDto IM_BUBBLE_GIFT_TEXT = new AtumVkuiColorNameDto("IM_BUBBLE_GIFT_TEXT", 173, "im_bubble_gift_text");

    @pmi0("im_bubble_gift_text_secondary")
    public static final AtumVkuiColorNameDto IM_BUBBLE_GIFT_TEXT_SECONDARY = new AtumVkuiColorNameDto("IM_BUBBLE_GIFT_TEXT_SECONDARY", 174, "im_bubble_gift_text_secondary");

    @pmi0("im_bubble_incoming")
    public static final AtumVkuiColorNameDto IM_BUBBLE_INCOMING = new AtumVkuiColorNameDto("IM_BUBBLE_INCOMING", 175, "im_bubble_incoming");

    @pmi0("im_bubble_incoming_alternate")
    public static final AtumVkuiColorNameDto IM_BUBBLE_INCOMING_ALTERNATE = new AtumVkuiColorNameDto("IM_BUBBLE_INCOMING_ALTERNATE", 176, "im_bubble_incoming_alternate");

    @pmi0("im_bubble_incoming_alternate_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_INCOMING_ALTERNATE_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_INCOMING_ALTERNATE_HIGHLIGHTED", 177, "im_bubble_incoming_alternate_highlighted");

    @pmi0("im_bubble_incoming_expiring")
    public static final AtumVkuiColorNameDto IM_BUBBLE_INCOMING_EXPIRING = new AtumVkuiColorNameDto("IM_BUBBLE_INCOMING_EXPIRING", 178, "im_bubble_incoming_expiring");

    @pmi0("im_bubble_incoming_expiring_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_INCOMING_EXPIRING_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_INCOMING_EXPIRING_HIGHLIGHTED", 179, "im_bubble_incoming_expiring_highlighted");

    @pmi0("im_bubble_incoming_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_INCOMING_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_INCOMING_HIGHLIGHTED", 180, "im_bubble_incoming_highlighted");

    @pmi0("im_bubble_mable_outgoing")
    public static final AtumVkuiColorNameDto IM_BUBBLE_MABLE_OUTGOING = new AtumVkuiColorNameDto("IM_BUBBLE_MABLE_OUTGOING", 181, "im_bubble_mable_outgoing");

    @pmi0("im_bubble_mable_outgoing_expiring_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_MABLE_OUTGOING_EXPIRING_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_MABLE_OUTGOING_EXPIRING_HIGHLIGHTED", 182, "im_bubble_mable_outgoing_expiring_highlighted");

    @pmi0("im_bubble_mable_outgoing_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_MABLE_OUTGOING_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_MABLE_OUTGOING_HIGHLIGHTED", 183, "im_bubble_mable_outgoing_highlighted");

    @pmi0("im_bubble_mable_wallpaper_outgoing")
    public static final AtumVkuiColorNameDto IM_BUBBLE_MABLE_WALLPAPER_OUTGOING = new AtumVkuiColorNameDto("IM_BUBBLE_MABLE_WALLPAPER_OUTGOING", 184, "im_bubble_mable_wallpaper_outgoing");

    @pmi0("im_bubble_mable_wallpaper_outgoing_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_MABLE_WALLPAPER_OUTGOING_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_MABLE_WALLPAPER_OUTGOING_HIGHLIGHTED", 185, "im_bubble_mable_wallpaper_outgoing_highlighted");

    @pmi0("im_bubble_outgoing")
    public static final AtumVkuiColorNameDto IM_BUBBLE_OUTGOING = new AtumVkuiColorNameDto("IM_BUBBLE_OUTGOING", 186, "im_bubble_outgoing");

    @pmi0("im_bubble_outgoing_alternate")
    public static final AtumVkuiColorNameDto IM_BUBBLE_OUTGOING_ALTERNATE = new AtumVkuiColorNameDto("IM_BUBBLE_OUTGOING_ALTERNATE", 187, "im_bubble_outgoing_alternate");

    @pmi0("im_bubble_outgoing_alternate_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_OUTGOING_ALTERNATE_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_OUTGOING_ALTERNATE_HIGHLIGHTED", 188, "im_bubble_outgoing_alternate_highlighted");

    @pmi0("im_bubble_outgoing_expiring")
    public static final AtumVkuiColorNameDto IM_BUBBLE_OUTGOING_EXPIRING = new AtumVkuiColorNameDto("IM_BUBBLE_OUTGOING_EXPIRING", PsExtractor.PRIVATE_STREAM_1, "im_bubble_outgoing_expiring");

    @pmi0("im_bubble_outgoing_expiring_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_OUTGOING_EXPIRING_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_OUTGOING_EXPIRING_HIGHLIGHTED", 190, "im_bubble_outgoing_expiring_highlighted");

    @pmi0("im_bubble_outgoing_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_OUTGOING_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_OUTGOING_HIGHLIGHTED", 191, "im_bubble_outgoing_highlighted");

    @pmi0("im_bubble_wallpaper_button_background")
    public static final AtumVkuiColorNameDto IM_BUBBLE_WALLPAPER_BUTTON_BACKGROUND = new AtumVkuiColorNameDto("IM_BUBBLE_WALLPAPER_BUTTON_BACKGROUND", PsExtractor.AUDIO_STREAM, "im_bubble_wallpaper_button_background");

    @pmi0("im_bubble_wallpaper_button_background_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_WALLPAPER_BUTTON_BACKGROUND_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_WALLPAPER_BUTTON_BACKGROUND_HIGHLIGHTED", 193, "im_bubble_wallpaper_button_background_highlighted");

    @pmi0("im_bubble_wallpaper_button_foreground")
    public static final AtumVkuiColorNameDto IM_BUBBLE_WALLPAPER_BUTTON_FOREGROUND = new AtumVkuiColorNameDto("IM_BUBBLE_WALLPAPER_BUTTON_FOREGROUND", 194, "im_bubble_wallpaper_button_foreground");

    @pmi0("im_bubble_wallpaper_incoming")
    public static final AtumVkuiColorNameDto IM_BUBBLE_WALLPAPER_INCOMING = new AtumVkuiColorNameDto("IM_BUBBLE_WALLPAPER_INCOMING", 195, "im_bubble_wallpaper_incoming");

    @pmi0("im_bubble_wallpaper_incoming_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_WALLPAPER_INCOMING_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_WALLPAPER_INCOMING_HIGHLIGHTED", 196, "im_bubble_wallpaper_incoming_highlighted");

    @pmi0("im_bubble_wallpaper_outgoing")
    public static final AtumVkuiColorNameDto IM_BUBBLE_WALLPAPER_OUTGOING = new AtumVkuiColorNameDto("IM_BUBBLE_WALLPAPER_OUTGOING", 197, "im_bubble_wallpaper_outgoing");

    @pmi0("im_bubble_wallpaper_outgoing_highlighted")
    public static final AtumVkuiColorNameDto IM_BUBBLE_WALLPAPER_OUTGOING_HIGHLIGHTED = new AtumVkuiColorNameDto("IM_BUBBLE_WALLPAPER_OUTGOING_HIGHLIGHTED", 198, "im_bubble_wallpaper_outgoing_highlighted");

    @pmi0("im_forward_line_tint")
    public static final AtumVkuiColorNameDto IM_FORWARD_LINE_TINT = new AtumVkuiColorNameDto("IM_FORWARD_LINE_TINT", 199, "im_forward_line_tint");

    @pmi0("im_reply_separator")
    public static final AtumVkuiColorNameDto IM_REPLY_SEPARATOR = new AtumVkuiColorNameDto("IM_REPLY_SEPARATOR", 200, "im_reply_separator");

    @pmi0("im_service_message_text")
    public static final AtumVkuiColorNameDto IM_SERVICE_MESSAGE_TEXT = new AtumVkuiColorNameDto("IM_SERVICE_MESSAGE_TEXT", 201, "im_service_message_text");

    @pmi0("im_text_name")
    public static final AtumVkuiColorNameDto IM_TEXT_NAME = new AtumVkuiColorNameDto("IM_TEXT_NAME", 202, "im_text_name");

    @pmi0("im_toolbar_separator")
    public static final AtumVkuiColorNameDto IM_TOOLBAR_SEPARATOR = new AtumVkuiColorNameDto("IM_TOOLBAR_SEPARATOR", 203, "im_toolbar_separator");

    @pmi0("im_toolbar_voice_msg_background")
    public static final AtumVkuiColorNameDto IM_TOOLBAR_VOICE_MSG_BACKGROUND = new AtumVkuiColorNameDto("IM_TOOLBAR_VOICE_MSG_BACKGROUND", 204, "im_toolbar_voice_msg_background");

    @pmi0("image_border")
    public static final AtumVkuiColorNameDto IMAGE_BORDER = new AtumVkuiColorNameDto("IMAGE_BORDER", 205, "image_border");

    @pmi0("image_border_alpha")
    public static final AtumVkuiColorNameDto IMAGE_BORDER_ALPHA = new AtumVkuiColorNameDto("IMAGE_BORDER_ALPHA", 206, "image_border_alpha");

    @pmi0("image_placeholder")
    public static final AtumVkuiColorNameDto IMAGE_PLACEHOLDER = new AtumVkuiColorNameDto("IMAGE_PLACEHOLDER", 207, "image_placeholder");

    @pmi0("image_placeholder_alpha")
    public static final AtumVkuiColorNameDto IMAGE_PLACEHOLDER_ALPHA = new AtumVkuiColorNameDto("IMAGE_PLACEHOLDER_ALPHA", Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, "image_placeholder_alpha");

    @pmi0("input_background")
    public static final AtumVkuiColorNameDto INPUT_BACKGROUND = new AtumVkuiColorNameDto("INPUT_BACKGROUND", Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, "input_background");

    @pmi0("input_border")
    public static final AtumVkuiColorNameDto INPUT_BORDER = new AtumVkuiColorNameDto("INPUT_BORDER", Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, "input_border");

    @pmi0("landing_background")
    public static final AtumVkuiColorNameDto LANDING_BACKGROUND = new AtumVkuiColorNameDto("LANDING_BACKGROUND", 211, "landing_background");

    @pmi0("landing_field_background")
    public static final AtumVkuiColorNameDto LANDING_FIELD_BACKGROUND = new AtumVkuiColorNameDto("LANDING_FIELD_BACKGROUND", Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, "landing_field_background");

    @pmi0("landing_field_border")
    public static final AtumVkuiColorNameDto LANDING_FIELD_BORDER = new AtumVkuiColorNameDto("LANDING_FIELD_BORDER", Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, "landing_field_border");

    @pmi0("landing_field_placeholder")
    public static final AtumVkuiColorNameDto LANDING_FIELD_PLACEHOLDER = new AtumVkuiColorNameDto("LANDING_FIELD_PLACEHOLDER", Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, "landing_field_placeholder");

    @pmi0("landing_login_button_background")
    public static final AtumVkuiColorNameDto LANDING_LOGIN_BUTTON_BACKGROUND = new AtumVkuiColorNameDto("LANDING_LOGIN_BUTTON_BACKGROUND", Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, "landing_login_button_background");

    @pmi0("landing_login_button_foreground")
    public static final AtumVkuiColorNameDto LANDING_LOGIN_BUTTON_FOREGROUND = new AtumVkuiColorNameDto("LANDING_LOGIN_BUTTON_FOREGROUND", Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, "landing_login_button_foreground");

    @pmi0("landing_primary_button_background")
    public static final AtumVkuiColorNameDto LANDING_PRIMARY_BUTTON_BACKGROUND = new AtumVkuiColorNameDto("LANDING_PRIMARY_BUTTON_BACKGROUND", Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, "landing_primary_button_background");

    @pmi0("landing_primary_button_foreground")
    public static final AtumVkuiColorNameDto LANDING_PRIMARY_BUTTON_FOREGROUND = new AtumVkuiColorNameDto("LANDING_PRIMARY_BUTTON_FOREGROUND", Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, "landing_primary_button_foreground");

    @pmi0("landing_secondary_button_background")
    public static final AtumVkuiColorNameDto LANDING_SECONDARY_BUTTON_BACKGROUND = new AtumVkuiColorNameDto("LANDING_SECONDARY_BUTTON_BACKGROUND", Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, "landing_secondary_button_background");

    @pmi0("landing_secondary_button_foreground")
    public static final AtumVkuiColorNameDto LANDING_SECONDARY_BUTTON_FOREGROUND = new AtumVkuiColorNameDto("LANDING_SECONDARY_BUTTON_FOREGROUND", Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, "landing_secondary_button_foreground");

    @pmi0("landing_snippet_border")
    public static final AtumVkuiColorNameDto LANDING_SNIPPET_BORDER = new AtumVkuiColorNameDto("LANDING_SNIPPET_BORDER", Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, "landing_snippet_border");

    @pmi0("landing_tertiary_button_background")
    public static final AtumVkuiColorNameDto LANDING_TERTIARY_BUTTON_BACKGROUND = new AtumVkuiColorNameDto("LANDING_TERTIARY_BUTTON_BACKGROUND", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, "landing_tertiary_button_background");

    @pmi0("landing_tertiary_button_foreground")
    public static final AtumVkuiColorNameDto LANDING_TERTIARY_BUTTON_FOREGROUND = new AtumVkuiColorNameDto("LANDING_TERTIARY_BUTTON_FOREGROUND", Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, "landing_tertiary_button_foreground");

    @pmi0("landing_text_primary")
    public static final AtumVkuiColorNameDto LANDING_TEXT_PRIMARY = new AtumVkuiColorNameDto("LANDING_TEXT_PRIMARY", 224, "landing_text_primary");

    @pmi0("landing_text_secondary")
    public static final AtumVkuiColorNameDto LANDING_TEXT_SECONDARY = new AtumVkuiColorNameDto("LANDING_TEXT_SECONDARY", Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, "landing_text_secondary");

    @pmi0("landing_text_title")
    public static final AtumVkuiColorNameDto LANDING_TEXT_TITLE = new AtumVkuiColorNameDto("LANDING_TEXT_TITLE", Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, "landing_text_title");

    @pmi0("like_text_tint")
    public static final AtumVkuiColorNameDto LIKE_TEXT_TINT = new AtumVkuiColorNameDto("LIKE_TEXT_TINT", Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, "like_text_tint");

    @pmi0("link_alternate")
    public static final AtumVkuiColorNameDto LINK_ALTERNATE = new AtumVkuiColorNameDto("LINK_ALTERNATE", 228, "link_alternate");

    @pmi0("link_contrast")
    public static final AtumVkuiColorNameDto LINK_CONTRAST = new AtumVkuiColorNameDto("LINK_CONTRAST", 229, "link_contrast");

    @pmi0("loader_background")
    public static final AtumVkuiColorNameDto LOADER_BACKGROUND = new AtumVkuiColorNameDto("LOADER_BACKGROUND", 230, "loader_background");

    @pmi0("loader_tint")
    public static final AtumVkuiColorNameDto LOADER_TINT = new AtumVkuiColorNameDto("LOADER_TINT", 231, "loader_tint");

    @pmi0("loader_track_fill")
    public static final AtumVkuiColorNameDto LOADER_TRACK_FILL = new AtumVkuiColorNameDto("LOADER_TRACK_FILL", 232, "loader_track_fill");

    @pmi0("loader_track_value_fill")
    public static final AtumVkuiColorNameDto LOADER_TRACK_VALUE_FILL = new AtumVkuiColorNameDto("LOADER_TRACK_VALUE_FILL", 233, "loader_track_value_fill");

    @pmi0("media_overlay_button_background")
    public static final AtumVkuiColorNameDto MEDIA_OVERLAY_BUTTON_BACKGROUND = new AtumVkuiColorNameDto("MEDIA_OVERLAY_BUTTON_BACKGROUND", 234, "media_overlay_button_background");

    @pmi0("media_overlay_button_foreground")
    public static final AtumVkuiColorNameDto MEDIA_OVERLAY_BUTTON_FOREGROUND = new AtumVkuiColorNameDto("MEDIA_OVERLAY_BUTTON_FOREGROUND", 235, "media_overlay_button_foreground");

    @pmi0("modal_card_background")
    public static final AtumVkuiColorNameDto MODAL_CARD_BACKGROUND = new AtumVkuiColorNameDto("MODAL_CARD_BACKGROUND", 236, "modal_card_background");

    @pmi0("modal_card_border")
    public static final AtumVkuiColorNameDto MODAL_CARD_BORDER = new AtumVkuiColorNameDto("MODAL_CARD_BORDER", 237, "modal_card_border");

    @pmi0("modal_card_header_close")
    public static final AtumVkuiColorNameDto MODAL_CARD_HEADER_CLOSE = new AtumVkuiColorNameDto("MODAL_CARD_HEADER_CLOSE", 238, "modal_card_header_close");

    @pmi0("music_playback_icon")
    public static final AtumVkuiColorNameDto MUSIC_PLAYBACK_ICON = new AtumVkuiColorNameDto("MUSIC_PLAYBACK_ICON", 239, "music_playback_icon");

    @pmi0("overlay_primary")
    public static final AtumVkuiColorNameDto OVERLAY_PRIMARY = new AtumVkuiColorNameDto("OVERLAY_PRIMARY", PsExtractor.VIDEO_STREAM_MASK, "overlay_primary");

    @pmi0("overlay_secondary")
    public static final AtumVkuiColorNameDto OVERLAY_SECONDARY = new AtumVkuiColorNameDto("OVERLAY_SECONDARY", 241, "overlay_secondary");

    @pmi0("overlay_status_background")
    public static final AtumVkuiColorNameDto OVERLAY_STATUS_BACKGROUND = new AtumVkuiColorNameDto("OVERLAY_STATUS_BACKGROUND", 242, "overlay_status_background");

    @pmi0("overlay_status_foreground")
    public static final AtumVkuiColorNameDto OVERLAY_STATUS_FOREGROUND = new AtumVkuiColorNameDto("OVERLAY_STATUS_FOREGROUND", 243, "overlay_status_foreground");

    @pmi0("overlay_status_icon")
    public static final AtumVkuiColorNameDto OVERLAY_STATUS_ICON = new AtumVkuiColorNameDto("OVERLAY_STATUS_ICON", 244, "overlay_status_icon");

    @pmi0("panel_header_icon")
    public static final AtumVkuiColorNameDto PANEL_HEADER_ICON = new AtumVkuiColorNameDto("PANEL_HEADER_ICON", 245, "panel_header_icon");

    @pmi0("panel_tab_active_background")
    public static final AtumVkuiColorNameDto PANEL_TAB_ACTIVE_BACKGROUND = new AtumVkuiColorNameDto("PANEL_TAB_ACTIVE_BACKGROUND", 246, "panel_tab_active_background");

    @pmi0("panel_tab_active_text")
    public static final AtumVkuiColorNameDto PANEL_TAB_ACTIVE_TEXT = new AtumVkuiColorNameDto("PANEL_TAB_ACTIVE_TEXT", 247, "panel_tab_active_text");

    @pmi0("panel_tab_inactive_text")
    public static final AtumVkuiColorNameDto PANEL_TAB_INACTIVE_TEXT = new AtumVkuiColorNameDto("PANEL_TAB_INACTIVE_TEXT", 248, "panel_tab_inactive_text");

    @pmi0("placeholder_icon_background")
    public static final AtumVkuiColorNameDto PLACEHOLDER_ICON_BACKGROUND = new AtumVkuiColorNameDto("PLACEHOLDER_ICON_BACKGROUND", 249, "placeholder_icon_background");

    @pmi0("placeholder_icon_background_opaque")
    public static final AtumVkuiColorNameDto PLACEHOLDER_ICON_BACKGROUND_OPAQUE = new AtumVkuiColorNameDto("PLACEHOLDER_ICON_BACKGROUND_OPAQUE", 250, "placeholder_icon_background_opaque");

    @pmi0("placeholder_icon_foreground_primary")
    public static final AtumVkuiColorNameDto PLACEHOLDER_ICON_FOREGROUND_PRIMARY = new AtumVkuiColorNameDto("PLACEHOLDER_ICON_FOREGROUND_PRIMARY", 251, "placeholder_icon_foreground_primary");

    @pmi0("placeholder_icon_foreground_secondary")
    public static final AtumVkuiColorNameDto PLACEHOLDER_ICON_FOREGROUND_SECONDARY = new AtumVkuiColorNameDto("PLACEHOLDER_ICON_FOREGROUND_SECONDARY", 252, "placeholder_icon_foreground_secondary");

    @pmi0("placeholder_icon_tint")
    public static final AtumVkuiColorNameDto PLACEHOLDER_ICON_TINT = new AtumVkuiColorNameDto("PLACEHOLDER_ICON_TINT", 253, "placeholder_icon_tint");

    @pmi0("poll_option_background")
    public static final AtumVkuiColorNameDto POLL_OPTION_BACKGROUND = new AtumVkuiColorNameDto("POLL_OPTION_BACKGROUND", 254, "poll_option_background");

    @pmi0("primary_overlay_badge")
    public static final AtumVkuiColorNameDto PRIMARY_OVERLAY_BADGE = new AtumVkuiColorNameDto("PRIMARY_OVERLAY_BADGE", 255, "primary_overlay_badge");

    @pmi0("search_bar_background")
    public static final AtumVkuiColorNameDto SEARCH_BAR_BACKGROUND = new AtumVkuiColorNameDto("SEARCH_BAR_BACKGROUND", 256, "search_bar_background");

    @pmi0("search_bar_field_background")
    public static final AtumVkuiColorNameDto SEARCH_BAR_FIELD_BACKGROUND = new AtumVkuiColorNameDto("SEARCH_BAR_FIELD_BACKGROUND", 257, "search_bar_field_background");

    @pmi0("search_bar_field_tint")
    public static final AtumVkuiColorNameDto SEARCH_BAR_FIELD_TINT = new AtumVkuiColorNameDto("SEARCH_BAR_FIELD_TINT", 258, "search_bar_field_tint");

    @pmi0("search_bar_segmented_control_tint")
    public static final AtumVkuiColorNameDto SEARCH_BAR_SEGMENTED_CONTROL_TINT = new AtumVkuiColorNameDto("SEARCH_BAR_SEGMENTED_CONTROL_TINT", 259, "search_bar_segmented_control_tint");

    @pmi0("search_field_background")
    public static final AtumVkuiColorNameDto SEARCH_FIELD_BACKGROUND = new AtumVkuiColorNameDto("SEARCH_FIELD_BACKGROUND", 260, "search_field_background");

    @pmi0("secondary_overlay_badge")
    public static final AtumVkuiColorNameDto SECONDARY_OVERLAY_BADGE = new AtumVkuiColorNameDto("SECONDARY_OVERLAY_BADGE", 261, "secondary_overlay_badge");

    @pmi0("segmented_control")
    public static final AtumVkuiColorNameDto SEGMENTED_CONTROL = new AtumVkuiColorNameDto("SEGMENTED_CONTROL", 262, "segmented_control");

    @pmi0("segmented_control_bar_background")
    public static final AtumVkuiColorNameDto SEGMENTED_CONTROL_BAR_BACKGROUND = new AtumVkuiColorNameDto("SEGMENTED_CONTROL_BAR_BACKGROUND", 263, "segmented_control_bar_background");

    @pmi0("segmented_control_tint")
    public static final AtumVkuiColorNameDto SEGMENTED_CONTROL_TINT = new AtumVkuiColorNameDto("SEGMENTED_CONTROL_TINT", 264, "segmented_control_tint");

    @pmi0("selection_off_icon")
    public static final AtumVkuiColorNameDto SELECTION_OFF_ICON = new AtumVkuiColorNameDto("SELECTION_OFF_ICON", 265, "selection_off_icon");

    @pmi0("separator_alpha")
    public static final AtumVkuiColorNameDto SEPARATOR_ALPHA = new AtumVkuiColorNameDto("SEPARATOR_ALPHA", 266, "separator_alpha");

    @pmi0("separator_alternate")
    public static final AtumVkuiColorNameDto SEPARATOR_ALTERNATE = new AtumVkuiColorNameDto("SEPARATOR_ALTERNATE", 267, "separator_alternate");

    @pmi0("separator_common")
    public static final AtumVkuiColorNameDto SEPARATOR_COMMON = new AtumVkuiColorNameDto("SEPARATOR_COMMON", 268, "separator_common");

    @pmi0("separator_primary")
    public static final AtumVkuiColorNameDto SEPARATOR_PRIMARY = new AtumVkuiColorNameDto("SEPARATOR_PRIMARY", 269, "separator_primary");

    @pmi0("separator_primary_2x")
    public static final AtumVkuiColorNameDto SEPARATOR_PRIMARY_2X = new AtumVkuiColorNameDto("SEPARATOR_PRIMARY_2X", atv0.b, "separator_primary_2x");

    @pmi0("separator_primary_3x")
    public static final AtumVkuiColorNameDto SEPARATOR_PRIMARY_3X = new AtumVkuiColorNameDto("SEPARATOR_PRIMARY_3X", 271, "separator_primary_3x");

    @pmi0("separator_primary_alpha")
    public static final AtumVkuiColorNameDto SEPARATOR_PRIMARY_ALPHA = new AtumVkuiColorNameDto("SEPARATOR_PRIMARY_ALPHA", 272, "separator_primary_alpha");

    @pmi0("separator_secondary")
    public static final AtumVkuiColorNameDto SEPARATOR_SECONDARY = new AtumVkuiColorNameDto("SEPARATOR_SECONDARY", 273, "separator_secondary");

    @pmi0("skeleton_foreground_from")
    public static final AtumVkuiColorNameDto SKELETON_FOREGROUND_FROM = new AtumVkuiColorNameDto("SKELETON_FOREGROUND_FROM", 274, "skeleton_foreground_from");

    @pmi0("skeleton_foreground_to")
    public static final AtumVkuiColorNameDto SKELETON_FOREGROUND_TO = new AtumVkuiColorNameDto("SKELETON_FOREGROUND_TO", 275, "skeleton_foreground_to");

    @pmi0("skeleton_from")
    public static final AtumVkuiColorNameDto SKELETON_FROM = new AtumVkuiColorNameDto("SKELETON_FROM", 276, "skeleton_from");

    @pmi0("skeleton_shimmer_from")
    public static final AtumVkuiColorNameDto SKELETON_SHIMMER_FROM = new AtumVkuiColorNameDto("SKELETON_SHIMMER_FROM", 277, "skeleton_shimmer_from");

    @pmi0("skeleton_shimmer_to")
    public static final AtumVkuiColorNameDto SKELETON_SHIMMER_TO = new AtumVkuiColorNameDto("SKELETON_SHIMMER_TO", 278, "skeleton_shimmer_to");

    @pmi0("skeleton_to")
    public static final AtumVkuiColorNameDto SKELETON_TO = new AtumVkuiColorNameDto("SKELETON_TO", 279, "skeleton_to");

    @pmi0("snippet_background")
    public static final AtumVkuiColorNameDto SNIPPET_BACKGROUND = new AtumVkuiColorNameDto("SNIPPET_BACKGROUND", 280, "snippet_background");

    @pmi0("snippet_border")
    public static final AtumVkuiColorNameDto SNIPPET_BORDER = new AtumVkuiColorNameDto("SNIPPET_BORDER", 281, "snippet_border");

    @pmi0("snippet_icon_tertiary")
    public static final AtumVkuiColorNameDto SNIPPET_ICON_TERTIARY = new AtumVkuiColorNameDto("SNIPPET_ICON_TERTIARY", 282, "snippet_icon_tertiary");

    @pmi0("splashscreen_icon")
    public static final AtumVkuiColorNameDto SPLASHSCREEN_ICON = new AtumVkuiColorNameDto("SPLASHSCREEN_ICON", 283, "splashscreen_icon");

    @pmi0("statusbar_alternate_legacy_background")
    public static final AtumVkuiColorNameDto STATUSBAR_ALTERNATE_LEGACY_BACKGROUND = new AtumVkuiColorNameDto("STATUSBAR_ALTERNATE_LEGACY_BACKGROUND", 284, "statusbar_alternate_legacy_background");

    @pmi0("stories_create_button_background_from")
    public static final AtumVkuiColorNameDto STORIES_CREATE_BUTTON_BACKGROUND_FROM = new AtumVkuiColorNameDto("STORIES_CREATE_BUTTON_BACKGROUND_FROM", 285, "stories_create_button_background_from");

    @pmi0("stories_create_button_background_to")
    public static final AtumVkuiColorNameDto STORIES_CREATE_BUTTON_BACKGROUND_TO = new AtumVkuiColorNameDto("STORIES_CREATE_BUTTON_BACKGROUND_TO", 286, "stories_create_button_background_to");

    @pmi0("stories_create_button_foreground")
    public static final AtumVkuiColorNameDto STORIES_CREATE_BUTTON_FOREGROUND = new AtumVkuiColorNameDto("STORIES_CREATE_BUTTON_FOREGROUND", MBSupportMuteAdType.INTERSTITIAL_VIDEO, "stories_create_button_foreground");

    @pmi0("stories_create_button_icon_background")
    public static final AtumVkuiColorNameDto STORIES_CREATE_BUTTON_ICON_BACKGROUND = new AtumVkuiColorNameDto("STORIES_CREATE_BUTTON_ICON_BACKGROUND", 288, "stories_create_button_icon_background");

    @pmi0("stories_skeleton_loader_background")
    public static final AtumVkuiColorNameDto STORIES_SKELETON_LOADER_BACKGROUND = new AtumVkuiColorNameDto("STORIES_SKELETON_LOADER_BACKGROUND", 289, "stories_skeleton_loader_background");

    @pmi0("stroke_accent")
    public static final AtumVkuiColorNameDto STROKE_ACCENT = new AtumVkuiColorNameDto("STROKE_ACCENT", 290, "stroke_accent");

    @pmi0("stroke_accent_themed")
    public static final AtumVkuiColorNameDto STROKE_ACCENT_THEMED = new AtumVkuiColorNameDto("STROKE_ACCENT_THEMED", 291, "stroke_accent_themed");

    @pmi0("stroke_contrast")
    public static final AtumVkuiColorNameDto STROKE_CONTRAST = new AtumVkuiColorNameDto("STROKE_CONTRAST", 292, "stroke_contrast");

    @pmi0("stroke_negative")
    public static final AtumVkuiColorNameDto STROKE_NEGATIVE = new AtumVkuiColorNameDto("STROKE_NEGATIVE", 293, "stroke_negative");

    @pmi0("stroke_positive")
    public static final AtumVkuiColorNameDto STROKE_POSITIVE = new AtumVkuiColorNameDto("STROKE_POSITIVE", 294, "stroke_positive");

    @pmi0("stroke_primary")
    public static final AtumVkuiColorNameDto STROKE_PRIMARY = new AtumVkuiColorNameDto("STROKE_PRIMARY", 295, "stroke_primary");

    @pmi0("switch_ios_off_border")
    public static final AtumVkuiColorNameDto SWITCH_IOS_OFF_BORDER = new AtumVkuiColorNameDto("SWITCH_IOS_OFF_BORDER", 296, "switch_ios_off_border");

    @pmi0("tabbar_active_icon")
    public static final AtumVkuiColorNameDto TABBAR_ACTIVE_ICON = new AtumVkuiColorNameDto("TABBAR_ACTIVE_ICON", 297, "tabbar_active_icon");

    @pmi0("tabbar_background")
    public static final AtumVkuiColorNameDto TABBAR_BACKGROUND = new AtumVkuiColorNameDto("TABBAR_BACKGROUND", 298, "tabbar_background");

    @pmi0("tabbar_inactive_icon")
    public static final AtumVkuiColorNameDto TABBAR_INACTIVE_ICON = new AtumVkuiColorNameDto("TABBAR_INACTIVE_ICON", 299, "tabbar_inactive_icon");

    @pmi0("tabbar_tablet_active_icon")
    public static final AtumVkuiColorNameDto TABBAR_TABLET_ACTIVE_ICON = new AtumVkuiColorNameDto("TABBAR_TABLET_ACTIVE_ICON", 300, "tabbar_tablet_active_icon");

    @pmi0("tabbar_tablet_background")
    public static final AtumVkuiColorNameDto TABBAR_TABLET_BACKGROUND = new AtumVkuiColorNameDto("TABBAR_TABLET_BACKGROUND", 301, "tabbar_tablet_background");

    @pmi0("tabbar_tablet_inactive_icon")
    public static final AtumVkuiColorNameDto TABBAR_TABLET_INACTIVE_ICON = new AtumVkuiColorNameDto("TABBAR_TABLET_INACTIVE_ICON", 302, "tabbar_tablet_inactive_icon");

    @pmi0("tabbar_tablet_text_primary")
    public static final AtumVkuiColorNameDto TABBAR_TABLET_TEXT_PRIMARY = new AtumVkuiColorNameDto("TABBAR_TABLET_TEXT_PRIMARY", Http.StatusCode.SEE_OTHER, "tabbar_tablet_text_primary");

    @pmi0("tabbar_tablet_text_secondary")
    public static final AtumVkuiColorNameDto TABBAR_TABLET_TEXT_SECONDARY = new AtumVkuiColorNameDto("TABBAR_TABLET_TEXT_SECONDARY", Sdk.SDKError.Reason.AD_EXPIRED_VALUE, "tabbar_tablet_text_secondary");

    @pmi0("tabbar_text_inactive")
    public static final AtumVkuiColorNameDto TABBAR_TEXT_INACTIVE = new AtumVkuiColorNameDto("TABBAR_TEXT_INACTIVE", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, "tabbar_text_inactive");

    @pmi0("text_accent")
    public static final AtumVkuiColorNameDto TEXT_ACCENT = new AtumVkuiColorNameDto("TEXT_ACCENT", 306, "text_accent");

    @pmi0("text_accent_themed")
    public static final AtumVkuiColorNameDto TEXT_ACCENT_THEMED = new AtumVkuiColorNameDto("TEXT_ACCENT_THEMED", 307, "text_accent_themed");

    @pmi0("text_action_counter")
    public static final AtumVkuiColorNameDto TEXT_ACTION_COUNTER = new AtumVkuiColorNameDto("TEXT_ACTION_COUNTER", Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, "text_action_counter");

    @pmi0("text_contrast")
    public static final AtumVkuiColorNameDto TEXT_CONTRAST = new AtumVkuiColorNameDto("TEXT_CONTRAST", Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, "text_contrast");

    @pmi0("text_contrast_themed")
    public static final AtumVkuiColorNameDto TEXT_CONTRAST_THEMED = new AtumVkuiColorNameDto("TEXT_CONTRAST_THEMED", Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, "text_contrast_themed");

    @pmi0("text_highlight_alpha")
    public static final AtumVkuiColorNameDto TEXT_HIGHLIGHT_ALPHA = new AtumVkuiColorNameDto("TEXT_HIGHLIGHT_ALPHA", Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, "text_highlight_alpha");

    @pmi0("text_link")
    public static final AtumVkuiColorNameDto TEXT_LINK = new AtumVkuiColorNameDto("TEXT_LINK", Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, "text_link");

    @pmi0("text_link_highlighted_background")
    public static final AtumVkuiColorNameDto TEXT_LINK_HIGHLIGHTED_BACKGROUND = new AtumVkuiColorNameDto("TEXT_LINK_HIGHLIGHTED_BACKGROUND", Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, "text_link_highlighted_background");

    @pmi0("text_link_themed")
    public static final AtumVkuiColorNameDto TEXT_LINK_THEMED = new AtumVkuiColorNameDto("TEXT_LINK_THEMED", Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, "text_link_themed");

    @pmi0("text_link_tint")
    public static final AtumVkuiColorNameDto TEXT_LINK_TINT = new AtumVkuiColorNameDto("TEXT_LINK_TINT", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, "text_link_tint");

    @pmi0("text_link_visited")
    public static final AtumVkuiColorNameDto TEXT_LINK_VISITED = new AtumVkuiColorNameDto("TEXT_LINK_VISITED", Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, "text_link_visited");

    @pmi0("text_muted")
    public static final AtumVkuiColorNameDto TEXT_MUTED = new AtumVkuiColorNameDto("TEXT_MUTED", Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, "text_muted");

    @pmi0("text_name")
    public static final AtumVkuiColorNameDto TEXT_NAME = new AtumVkuiColorNameDto("TEXT_NAME", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, "text_name");

    @pmi0("text_negative")
    public static final AtumVkuiColorNameDto TEXT_NEGATIVE = new AtumVkuiColorNameDto("TEXT_NEGATIVE", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, "text_negative");

    @pmi0("text_placeholder")
    public static final AtumVkuiColorNameDto TEXT_PLACEHOLDER = new AtumVkuiColorNameDto("TEXT_PLACEHOLDER", 320, "text_placeholder");

    @pmi0("text_positive")
    public static final AtumVkuiColorNameDto TEXT_POSITIVE = new AtumVkuiColorNameDto("TEXT_POSITIVE", Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, "text_positive");

    @pmi0("text_primary")
    public static final AtumVkuiColorNameDto TEXT_PRIMARY = new AtumVkuiColorNameDto("TEXT_PRIMARY", Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE, "text_primary");

    @pmi0("text_primary_alpha")
    public static final AtumVkuiColorNameDto TEXT_PRIMARY_ALPHA = new AtumVkuiColorNameDto("TEXT_PRIMARY_ALPHA", 323, "text_primary_alpha");

    @pmi0("text_primary_invariably")
    public static final AtumVkuiColorNameDto TEXT_PRIMARY_INVARIABLY = new AtumVkuiColorNameDto("TEXT_PRIMARY_INVARIABLY", 324, "text_primary_invariably");

    @pmi0("text_secondary")
    public static final AtumVkuiColorNameDto TEXT_SECONDARY = new AtumVkuiColorNameDto("TEXT_SECONDARY", 325, "text_secondary");

    @pmi0("text_secondary_alpha")
    public static final AtumVkuiColorNameDto TEXT_SECONDARY_ALPHA = new AtumVkuiColorNameDto("TEXT_SECONDARY_ALPHA", 326, "text_secondary_alpha");

    @pmi0("text_subhead")
    public static final AtumVkuiColorNameDto TEXT_SUBHEAD = new AtumVkuiColorNameDto("TEXT_SUBHEAD", 327, "text_subhead");

    @pmi0("text_tertiary")
    public static final AtumVkuiColorNameDto TEXT_TERTIARY = new AtumVkuiColorNameDto("TEXT_TERTIARY", 328, "text_tertiary");

    @pmi0("toolbar_attach_background_from")
    public static final AtumVkuiColorNameDto TOOLBAR_ATTACH_BACKGROUND_FROM = new AtumVkuiColorNameDto("TOOLBAR_ATTACH_BACKGROUND_FROM", 329, "toolbar_attach_background_from");

    @pmi0("toolbar_attach_background_to")
    public static final AtumVkuiColorNameDto TOOLBAR_ATTACH_BACKGROUND_TO = new AtumVkuiColorNameDto("TOOLBAR_ATTACH_BACKGROUND_TO", 330, "toolbar_attach_background_to");

    @pmi0("track_background")
    public static final AtumVkuiColorNameDto TRACK_BACKGROUND = new AtumVkuiColorNameDto("TRACK_BACKGROUND", 331, "track_background");

    @pmi0("track_buffer")
    public static final AtumVkuiColorNameDto TRACK_BUFFER = new AtumVkuiColorNameDto("TRACK_BUFFER", 332, "track_buffer");

    @pmi0(X3.i.T)
    public static final AtumVkuiColorNameDto TRANSPARENT = new AtumVkuiColorNameDto("TRANSPARENT", 333, X3.i.T);

    @pmi0("vk_connect_button_primary_background")
    public static final AtumVkuiColorNameDto VK_CONNECT_BUTTON_PRIMARY_BACKGROUND = new AtumVkuiColorNameDto("VK_CONNECT_BUTTON_PRIMARY_BACKGROUND", 334, "vk_connect_button_primary_background");

    @pmi0("vk_connect_button_primary_foreground")
    public static final AtumVkuiColorNameDto VK_CONNECT_BUTTON_PRIMARY_FOREGROUND = new AtumVkuiColorNameDto("VK_CONNECT_BUTTON_PRIMARY_FOREGROUND", 335, "vk_connect_button_primary_foreground");

    @pmi0("vk_connect_button_secondary_background")
    public static final AtumVkuiColorNameDto VK_CONNECT_BUTTON_SECONDARY_BACKGROUND = new AtumVkuiColorNameDto("VK_CONNECT_BUTTON_SECONDARY_BACKGROUND", 336, "vk_connect_button_secondary_background");

    @pmi0("vk_connect_button_secondary_foreground")
    public static final AtumVkuiColorNameDto VK_CONNECT_BUTTON_SECONDARY_FOREGROUND = new AtumVkuiColorNameDto("VK_CONNECT_BUTTON_SECONDARY_FOREGROUND", 337, "vk_connect_button_secondary_foreground");

    @pmi0("vk_donut_background")
    public static final AtumVkuiColorNameDto VK_DONUT_BACKGROUND = new AtumVkuiColorNameDto("VK_DONUT_BACKGROUND", 338, "vk_donut_background");

    @pmi0("write_bar_icon")
    public static final AtumVkuiColorNameDto WRITE_BAR_ICON = new AtumVkuiColorNameDto("WRITE_BAR_ICON", 339, "write_bar_icon");

    @pmi0("write_bar_input_background")
    public static final AtumVkuiColorNameDto WRITE_BAR_INPUT_BACKGROUND = new AtumVkuiColorNameDto("WRITE_BAR_INPUT_BACKGROUND", 340, "write_bar_input_background");

    @pmi0("write_bar_input_border")
    public static final AtumVkuiColorNameDto WRITE_BAR_INPUT_BORDER = new AtumVkuiColorNameDto("WRITE_BAR_INPUT_BORDER", 341, "write_bar_input_border");

    @pmi0("write_bar_input_border_alpha")
    public static final AtumVkuiColorNameDto WRITE_BAR_INPUT_BORDER_ALPHA = new AtumVkuiColorNameDto("WRITE_BAR_INPUT_BORDER_ALPHA", 342, "write_bar_input_border_alpha");

    @pmi0("writebar_icon")
    public static final AtumVkuiColorNameDto WRITEBAR_ICON = new AtumVkuiColorNameDto("WRITEBAR_ICON", 343, "writebar_icon");

    static {
        AtumVkuiColorNameDto[] i = i();
        $VALUES = i;
        $ENTRIES = e370.d(i);
        CREATOR = new Parcelable.Creator<AtumVkuiColorNameDto>() { // from class: com.vk.api.generated.atum.dto.AtumVkuiColorNameDto.a
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiColorNameDto createFromParcel(Parcel parcel) {
                return AtumVkuiColorNameDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiColorNameDto[] newArray(int i2) {
                return new AtumVkuiColorNameDto[i2];
            }
        };
    }

    private AtumVkuiColorNameDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static final /* synthetic */ AtumVkuiColorNameDto[] i() {
        return new AtumVkuiColorNameDto[]{ACCENT, ACCENT_ALTERNATE, ACCENT_AZURE, ACCENT_BLUE, ACCENT_CYAN, ACCENT_GRAY, ACCENT_GREEN, ACCENT_LIME, ACCENT_ORANGE, ACCENT_ORANGE_FIRE, ACCENT_ORANGE_PEACH, ACCENT_PINK, ACCENT_PURPLE, ACCENT_RASPBERRY_PINK, ACCENT_RED, ACCENT_SECONDARY, ACCENT_VIOLET, ACTION_SHEET_ACTION_FOREGROUND, ACTION_SHEET_SEPARATOR, ACTION_SHEET_TEXT, ACTIVITY_INDICATOR_TINT, ATTACH_PICKER_TAB_ACTIVE_BACKGROUND, ATTACH_PICKER_TAB_ACTIVE_ICON, ATTACH_PICKER_TAB_ACTIVE_TEXT, ATTACH_PICKER_TAB_INACTIVE_BACKGROUND, ATTACH_PICKER_TAB_INACTIVE_ICON, ATTACH_PICKER_TAB_INACTIVE_TEXT, AVATAR_OVERLAY, AVATAR_OVERLAY_INVERSE_ALPHA, BACKGROUND, BACKGROUND_ACCENT, BACKGROUND_ACCENT_ALTERNATIVE, BACKGROUND_ACCENT_THEMED, BACKGROUND_ACCENT_THEMED_ALPHA, BACKGROUND_ACCENT_TINT, BACKGROUND_CARD_ALPHA, BACKGROUND_CONTENT, BACKGROUND_CONTENT_ALPHA, BACKGROUND_CONTENT_INVERSE, BACKGROUND_CONTRAST, BACKGROUND_CONTRAST_INVERSE, BACKGROUND_CONTRAST_SECONDARY_ALPHA, BACKGROUND_CONTRAST_THEMED, BACKGROUND_HIGHLIGHTED, BACKGROUND_HOVER, BACKGROUND_INFO_TINT, BACKGROUND_KEYBOARD, BACKGROUND_LIGHT, BACKGROUND_MODAL, BACKGROUND_MODAL_INVERSE, BACKGROUND_NEGATIVE, BACKGROUND_NEGATIVE_TINT, BACKGROUND_OVERLAY_SECONDARY, BACKGROUND_PAGE, BACKGROUND_POSITIVE, BACKGROUND_POSITIVE_TINT, BACKGROUND_SECONDARY, BACKGROUND_SECONDARY_ALPHA, BACKGROUND_SUGGESTIONS, BACKGROUND_TERTIARY, BACKGROUND_TERTIARY_ALPHA, BACKGROUND_TEXT_HIGHLIGHTED, BACKGROUND_WARNING, BUTTON_BOT_SHADOW, BUTTON_COMMERCE_BACKGROUND, BUTTON_COMMERCE_FOREGROUND, BUTTON_ICON, BUTTON_MUTED_BACKGROUND, BUTTON_MUTED_FOREGROUND, BUTTON_OUTLINE_BORDER, BUTTON_OUTLINE_FOREGROUND, BUTTON_PRIMARY_BACKGROUND, BUTTON_PRIMARY_FOREGROUND, BUTTON_SECONDARY_BACKGROUND, BUTTON_SECONDARY_BACKGROUND_HIGHLIGHTED, BUTTON_SECONDARY_DESTRUCTIVE_BACKGROUND, BUTTON_SECONDARY_DESTRUCTIVE_BACKGROUND_HIGHLIGHTED, BUTTON_SECONDARY_DESTRUCTIVE_FOREGROUND, BUTTON_SECONDARY_DESTRUCTIVE_FOREGROUND_HIGHLIGHTED, BUTTON_SECONDARY_FOREGROUND, BUTTON_SECONDARY_FOREGROUND_HIGHLIGHTED, BUTTON_STROKE, BUTTON_TERTIARY_BACKGROUND, BUTTON_TERTIARY_FOREGROUND, BUTTON_TEXT, CELL_BUTTON_FOREGROUND, CONTENT_PLACEHOLDER_ICON, CONTENT_PLACEHOLDER_TEXT, CONTENT_POSITIVE_BACKGROUND, CONTENT_TINT_BACKGROUND, CONTENT_TINT_FOREGROUND, CONTENT_WARNING_BACKGROUND, CONTROL_BACKGROUND, CONTROL_BACKGROUND_SECONDARY, CONTROL_FOREGROUND, CONTROL_TINT, CONTROL_TINT_MUTED, COUNTER_PRIMARY_BACKGROUND, COUNTER_PRIMARY_TEXT, COUNTER_PROMINENT_BACKGROUND, COUNTER_PROMINENT_TEXT, COUNTER_SECONDARY_BACKGROUND, COUNTER_SECONDARY_TEXT, DESTRUCTIVE, DYNAMIC_BLUE, DYNAMIC_GRAY, DYNAMIC_GREEN, DYNAMIC_NEON_PINK, DYNAMIC_ORANGE, DYNAMIC_ORANGE_PEACH, DYNAMIC_PURPLE, DYNAMIC_RASPBERRY_PINK, DYNAMIC_RED, DYNAMIC_VIOLET, FEED_RECOMMENDED_FRIEND_PROMO_BACKGROUND, FIELD_BACKGROUND, FIELD_BORDER, FIELD_BORDER_ALPHA, FIELD_ERROR_BACKGROUND, FIELD_ERROR_BORDER, FIELD_TEXT_PLACEHOLDER, FIELD_VALID_BORDER, FLOAT_BUTTON_BACKGROUND, FLOAT_BUTTON_BACKGROUND_HIGHLIGHTED, FLOAT_BUTTON_BORDER, FLOAT_BUTTON_FOREGROUND, HEADER_ALTERNATE_BACKGROUND, HEADER_ALTERNATE_TAB_ACTIVE_INDICATOR, HEADER_ALTERNATE_TAB_ACTIVE_TEXT, HEADER_ALTERNATE_TAB_INACTIVE_TEXT, HEADER_BACKGROUND, HEADER_BACKGROUND_BEFORE_BLUR, HEADER_BACKGROUND_BEFORE_BLUR_ALTERNATE, HEADER_SEARCH_FIELD_BACKGROUND, HEADER_SEARCH_FIELD_TINT, HEADER_TAB_ACTIVE_BACKGROUND, HEADER_TAB_ACTIVE_INDICATOR, HEADER_TAB_ACTIVE_TEXT, HEADER_TAB_INACTIVE_TEXT, HEADER_TEXT, HEADER_TEXT_ALTERNATE, HEADER_TEXT_SECONDARY, HEADER_TINT, HEADER_TINT_ALTERNATE, ICON_ACCENT, ICON_ACCENT_THEMED, ICON_ALPHA_PLACEHOLDER, ICON_CONTRAST, ICON_CONTRAST_SECONDARY, ICON_CONTRAST_THEMED, ICON_MEDIUM, ICON_MEDIUM_ALPHA, ICON_NAME, ICON_NEGATIVE, ICON_OUTLINE_MEDIUM, ICON_OUTLINE_SECONDARY, ICON_POSITIVE, ICON_PRIMARY, ICON_PRIMARY_INVARIABLY, ICON_SECONDARY, ICON_SECONDARY_ALPHA, ICON_TERTIARY, ICON_TERTIARY_ALPHA, ICON_WARNING, IM_ATTACH_TINT, IM_BUBBLE_BORDER_ALTERNATE, IM_BUBBLE_BORDER_ALTERNATE_HIGHLIGHTED, IM_BUBBLE_BUTTON_BACKGROUND, IM_BUBBLE_BUTTON_BACKGROUND_HIGHLIGHTED, IM_BUBBLE_BUTTON_FOREGROUND, IM_BUBBLE_BUTTON_OUTGOING_BACKGROUND, IM_BUBBLE_GIFT_BACKGROUND, IM_BUBBLE_GIFT_BACKGROUND_HIGHLIGHTED, IM_BUBBLE_GIFT_TEXT, IM_BUBBLE_GIFT_TEXT_SECONDARY, IM_BUBBLE_INCOMING, IM_BUBBLE_INCOMING_ALTERNATE, IM_BUBBLE_INCOMING_ALTERNATE_HIGHLIGHTED, IM_BUBBLE_INCOMING_EXPIRING, IM_BUBBLE_INCOMING_EXPIRING_HIGHLIGHTED, IM_BUBBLE_INCOMING_HIGHLIGHTED, IM_BUBBLE_MABLE_OUTGOING, IM_BUBBLE_MABLE_OUTGOING_EXPIRING_HIGHLIGHTED, IM_BUBBLE_MABLE_OUTGOING_HIGHLIGHTED, IM_BUBBLE_MABLE_WALLPAPER_OUTGOING, IM_BUBBLE_MABLE_WALLPAPER_OUTGOING_HIGHLIGHTED, IM_BUBBLE_OUTGOING, IM_BUBBLE_OUTGOING_ALTERNATE, IM_BUBBLE_OUTGOING_ALTERNATE_HIGHLIGHTED, IM_BUBBLE_OUTGOING_EXPIRING, IM_BUBBLE_OUTGOING_EXPIRING_HIGHLIGHTED, IM_BUBBLE_OUTGOING_HIGHLIGHTED, IM_BUBBLE_WALLPAPER_BUTTON_BACKGROUND, IM_BUBBLE_WALLPAPER_BUTTON_BACKGROUND_HIGHLIGHTED, IM_BUBBLE_WALLPAPER_BUTTON_FOREGROUND, IM_BUBBLE_WALLPAPER_INCOMING, IM_BUBBLE_WALLPAPER_INCOMING_HIGHLIGHTED, IM_BUBBLE_WALLPAPER_OUTGOING, IM_BUBBLE_WALLPAPER_OUTGOING_HIGHLIGHTED, IM_FORWARD_LINE_TINT, IM_REPLY_SEPARATOR, IM_SERVICE_MESSAGE_TEXT, IM_TEXT_NAME, IM_TOOLBAR_SEPARATOR, IM_TOOLBAR_VOICE_MSG_BACKGROUND, IMAGE_BORDER, IMAGE_BORDER_ALPHA, IMAGE_PLACEHOLDER, IMAGE_PLACEHOLDER_ALPHA, INPUT_BACKGROUND, INPUT_BORDER, LANDING_BACKGROUND, LANDING_FIELD_BACKGROUND, LANDING_FIELD_BORDER, LANDING_FIELD_PLACEHOLDER, LANDING_LOGIN_BUTTON_BACKGROUND, LANDING_LOGIN_BUTTON_FOREGROUND, LANDING_PRIMARY_BUTTON_BACKGROUND, LANDING_PRIMARY_BUTTON_FOREGROUND, LANDING_SECONDARY_BUTTON_BACKGROUND, LANDING_SECONDARY_BUTTON_FOREGROUND, LANDING_SNIPPET_BORDER, LANDING_TERTIARY_BUTTON_BACKGROUND, LANDING_TERTIARY_BUTTON_FOREGROUND, LANDING_TEXT_PRIMARY, LANDING_TEXT_SECONDARY, LANDING_TEXT_TITLE, LIKE_TEXT_TINT, LINK_ALTERNATE, LINK_CONTRAST, LOADER_BACKGROUND, LOADER_TINT, LOADER_TRACK_FILL, LOADER_TRACK_VALUE_FILL, MEDIA_OVERLAY_BUTTON_BACKGROUND, MEDIA_OVERLAY_BUTTON_FOREGROUND, MODAL_CARD_BACKGROUND, MODAL_CARD_BORDER, MODAL_CARD_HEADER_CLOSE, MUSIC_PLAYBACK_ICON, OVERLAY_PRIMARY, OVERLAY_SECONDARY, OVERLAY_STATUS_BACKGROUND, OVERLAY_STATUS_FOREGROUND, OVERLAY_STATUS_ICON, PANEL_HEADER_ICON, PANEL_TAB_ACTIVE_BACKGROUND, PANEL_TAB_ACTIVE_TEXT, PANEL_TAB_INACTIVE_TEXT, PLACEHOLDER_ICON_BACKGROUND, PLACEHOLDER_ICON_BACKGROUND_OPAQUE, PLACEHOLDER_ICON_FOREGROUND_PRIMARY, PLACEHOLDER_ICON_FOREGROUND_SECONDARY, PLACEHOLDER_ICON_TINT, POLL_OPTION_BACKGROUND, PRIMARY_OVERLAY_BADGE, SEARCH_BAR_BACKGROUND, SEARCH_BAR_FIELD_BACKGROUND, SEARCH_BAR_FIELD_TINT, SEARCH_BAR_SEGMENTED_CONTROL_TINT, SEARCH_FIELD_BACKGROUND, SECONDARY_OVERLAY_BADGE, SEGMENTED_CONTROL, SEGMENTED_CONTROL_BAR_BACKGROUND, SEGMENTED_CONTROL_TINT, SELECTION_OFF_ICON, SEPARATOR_ALPHA, SEPARATOR_ALTERNATE, SEPARATOR_COMMON, SEPARATOR_PRIMARY, SEPARATOR_PRIMARY_2X, SEPARATOR_PRIMARY_3X, SEPARATOR_PRIMARY_ALPHA, SEPARATOR_SECONDARY, SKELETON_FOREGROUND_FROM, SKELETON_FOREGROUND_TO, SKELETON_FROM, SKELETON_SHIMMER_FROM, SKELETON_SHIMMER_TO, SKELETON_TO, SNIPPET_BACKGROUND, SNIPPET_BORDER, SNIPPET_ICON_TERTIARY, SPLASHSCREEN_ICON, STATUSBAR_ALTERNATE_LEGACY_BACKGROUND, STORIES_CREATE_BUTTON_BACKGROUND_FROM, STORIES_CREATE_BUTTON_BACKGROUND_TO, STORIES_CREATE_BUTTON_FOREGROUND, STORIES_CREATE_BUTTON_ICON_BACKGROUND, STORIES_SKELETON_LOADER_BACKGROUND, STROKE_ACCENT, STROKE_ACCENT_THEMED, STROKE_CONTRAST, STROKE_NEGATIVE, STROKE_POSITIVE, STROKE_PRIMARY, SWITCH_IOS_OFF_BORDER, TABBAR_ACTIVE_ICON, TABBAR_BACKGROUND, TABBAR_INACTIVE_ICON, TABBAR_TABLET_ACTIVE_ICON, TABBAR_TABLET_BACKGROUND, TABBAR_TABLET_INACTIVE_ICON, TABBAR_TABLET_TEXT_PRIMARY, TABBAR_TABLET_TEXT_SECONDARY, TABBAR_TEXT_INACTIVE, TEXT_ACCENT, TEXT_ACCENT_THEMED, TEXT_ACTION_COUNTER, TEXT_CONTRAST, TEXT_CONTRAST_THEMED, TEXT_HIGHLIGHT_ALPHA, TEXT_LINK, TEXT_LINK_HIGHLIGHTED_BACKGROUND, TEXT_LINK_THEMED, TEXT_LINK_TINT, TEXT_LINK_VISITED, TEXT_MUTED, TEXT_NAME, TEXT_NEGATIVE, TEXT_PLACEHOLDER, TEXT_POSITIVE, TEXT_PRIMARY, TEXT_PRIMARY_ALPHA, TEXT_PRIMARY_INVARIABLY, TEXT_SECONDARY, TEXT_SECONDARY_ALPHA, TEXT_SUBHEAD, TEXT_TERTIARY, TOOLBAR_ATTACH_BACKGROUND_FROM, TOOLBAR_ATTACH_BACKGROUND_TO, TRACK_BACKGROUND, TRACK_BUFFER, TRANSPARENT, VK_CONNECT_BUTTON_PRIMARY_BACKGROUND, VK_CONNECT_BUTTON_PRIMARY_FOREGROUND, VK_CONNECT_BUTTON_SECONDARY_BACKGROUND, VK_CONNECT_BUTTON_SECONDARY_FOREGROUND, VK_DONUT_BACKGROUND, WRITE_BAR_ICON, WRITE_BAR_INPUT_BACKGROUND, WRITE_BAR_INPUT_BORDER, WRITE_BAR_INPUT_BORDER_ALPHA, WRITEBAR_ICON};
    }

    public static AtumVkuiColorNameDto valueOf(String str) {
        return (AtumVkuiColorNameDto) Enum.valueOf(AtumVkuiColorNameDto.class, str);
    }

    public static AtumVkuiColorNameDto[] values() {
        return (AtumVkuiColorNameDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
