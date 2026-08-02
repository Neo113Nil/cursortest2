package com.vk.dto.user;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes18.dex */
public class UserProfileGift extends UserProfile {
    public static final Serializer.c<UserProfileGift> CREATOR = new a();
    public final boolean h0;
    public final String i0;

    public class a extends Serializer.c<UserProfileGift> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UserProfileGift a(@NonNull Serializer serializer) {
            return new UserProfileGift(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserProfileGift[i];
        }
    }

    public UserProfileGift(UserProfile userProfile, boolean z, String str) {
        super(userProfile);
        this.h0 = z;
        this.i0 = str;
    }

    @Override // com.vk.dto.user.UserProfile, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.L(this.h0 ? (byte) 1 : (byte) 0);
        serializer.j0(this.i0);
    }

    public UserProfileGift(Serializer serializer) {
        super(serializer);
        this.h0 = serializer.p() == 1;
        this.i0 = serializer.H();
    }

    public UserProfileGift(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        this.h0 = jSONObject.optInt("can_see_gifts") == 1;
        this.i0 = jSONObject.optString("first_name_gen");
    }
}
