package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EasyPromoteData.kt */
/* loaded from: classes17.dex */
public final class EasyPromoteUnavalabilityReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EasyPromoteUnavalabilityReason[] $VALUES;
    public static final EasyPromoteUnavalabilityReason PRIVACY;
    public static final EasyPromoteUnavalabilityReason PRIVACY_AND_PUBLICATION_DATE;
    public static final EasyPromoteUnavalabilityReason PUBLICATION_DATE;
    private final int textExternalClick;
    private final int textPromoClick;
    private final int title;

    static {
        EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason = new EasyPromoteUnavalabilityReason("PRIVACY", 0, R.string.clips_publish_easy_promote_privacy_error_title, R.string.clips_publish_easy_promote_privacy_error_promo_click_text, R.string.clips_publish_easy_promote_privacy_error_text);
        PRIVACY = easyPromoteUnavalabilityReason;
        EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason2 = new EasyPromoteUnavalabilityReason("PUBLICATION_DATE", 1, R.string.clips_publish_easy_promote_delayed_error_title, R.string.clips_publish_easy_promote_delayed_error_promo_click_text, R.string.clips_publish_easy_promote_delayed_error_text);
        PUBLICATION_DATE = easyPromoteUnavalabilityReason2;
        EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason3 = new EasyPromoteUnavalabilityReason("PRIVACY_AND_PUBLICATION_DATE", 2, R.string.clips_publish_easy_promote_delayed_and_privacy_error_title, R.string.clips_publish_easy_promote_delayed_and_privacy_error_text, -1);
        PRIVACY_AND_PUBLICATION_DATE = easyPromoteUnavalabilityReason3;
        EasyPromoteUnavalabilityReason[] easyPromoteUnavalabilityReasonArr = {easyPromoteUnavalabilityReason, easyPromoteUnavalabilityReason2, easyPromoteUnavalabilityReason3};
        $VALUES = easyPromoteUnavalabilityReasonArr;
        $ENTRIES = new asp(easyPromoteUnavalabilityReasonArr);
    }

    public EasyPromoteUnavalabilityReason(String str, int i, int i2, int i3, int i4) {
        this.title = i2;
        this.textPromoClick = i3;
        this.textExternalClick = i4;
    }

    public static EasyPromoteUnavalabilityReason valueOf(String str) {
        return (EasyPromoteUnavalabilityReason) Enum.valueOf(EasyPromoteUnavalabilityReason.class, str);
    }

    public static EasyPromoteUnavalabilityReason[] values() {
        return (EasyPromoteUnavalabilityReason[]) $VALUES.clone();
    }

    public final int h() {
        return this.textExternalClick;
    }

    public final int i() {
        return this.textPromoClick;
    }

    public final int j() {
        return this.title;
    }
}
