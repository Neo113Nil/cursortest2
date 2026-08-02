package com.vk.dto.money;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import org.json.JSONObject;

/* compiled from: TransferUserProfile.kt */
/* loaded from: classes18.dex */
public final class TransferUserProfile extends UserProfile {
    public static final Serializer.c<TransferUserProfile> CREATOR = new a();
    public String h0;

    /* compiled from: TransferUserProfile.kt */
    public static final class a extends Serializer.c<TransferUserProfile> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TransferUserProfile a(Serializer serializer) {
            TransferUserProfile transferUserProfile = new TransferUserProfile(serializer);
            transferUserProfile.h0 = serializer.H();
            return transferUserProfile;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferUserProfile[i];
        }
    }

    public TransferUserProfile(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.vk.dto.user.UserProfile, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.h0);
    }

    @Override // com.vk.dto.user.UserProfile
    public final void R(JSONObject jSONObject) {
        this.c = new UserId(jSONObject.has("id") ? jSONObject.getLong("id") : 500L);
        if (jSONObject.has("access_key")) {
            this.h0 = jSONObject.getString("access_key");
        }
    }
}
