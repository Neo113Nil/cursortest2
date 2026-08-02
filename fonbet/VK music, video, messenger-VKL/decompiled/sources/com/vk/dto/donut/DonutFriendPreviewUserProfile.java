package com.vk.dto.donut;

import com.vk.dto.user.UserProfile;
import org.json.JSONObject;
import xsna.aay;

/* compiled from: DonutFriendPreviewUserProfile.kt */
/* loaded from: classes18.dex */
public final class DonutFriendPreviewUserProfile extends UserProfile {
    public static final a i0 = new a();
    public final boolean h0;

    /* compiled from: DonutFriendPreviewUserProfile.kt */
    public static final class a extends aay<UserProfile> {
        @Override // xsna.aay
        public final UserProfile a(JSONObject jSONObject) {
            return new DonutFriendPreviewUserProfile(jSONObject);
        }
    }

    public DonutFriendPreviewUserProfile(JSONObject jSONObject) {
        super(jSONObject);
        this.h0 = jSONObject.optBoolean("is_don", false);
    }
}
