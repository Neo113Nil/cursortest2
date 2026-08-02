package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.user.UserProfile;
import java.util.Arrays;
import xsna.epx;
import xsna.ho8;

/* compiled from: ActionableRecommendedProfile.kt */
/* loaded from: classes18.dex */
public final class ActionableRecommendedProfile extends RecommendedProfile implements Serializer.StreamParcelable {
    public static final Serializer.c<ActionableRecommendedProfile> CREATOR = new a();
    public final UserProfile c;
    public final ActionButton[] d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionableRecommendedProfile> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionableRecommendedProfile a(Serializer serializer) {
            return new ActionableRecommendedProfile((UserProfile) serializer.G(UserProfile.class.getClassLoader()), (ActionButton[]) serializer.i(ActionButton.CREATOR));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionableRecommendedProfile[i];
        }
    }

    public ActionableRecommendedProfile(UserProfile userProfile, ActionButton[] actionButtonArr) {
        super(userProfile);
        this.c = userProfile;
        this.d = actionButtonArr;
    }

    @Override // com.vk.dto.common.RecommendedProfile, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.c);
        serializer.n0(this.d);
    }

    @Override // com.vk.dto.common.RecommendedProfile
    public final UserProfile d() {
        return this.c;
    }

    @Override // com.vk.dto.common.RecommendedProfile
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ActionableRecommendedProfile.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ActionableRecommendedProfile actionableRecommendedProfile = (ActionableRecommendedProfile) obj;
        return epx.f(this.c, actionableRecommendedProfile.c) && Arrays.equals(this.d, actionableRecommendedProfile.d);
    }

    @Override // com.vk.dto.common.RecommendedProfile
    public final int hashCode() {
        return (this.c.hashCode() * 31) + Arrays.hashCode(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionableRecommendedProfile(profile=");
        sb.append(this.c);
        sb.append(", actions=");
        return ho8.a(sb, Arrays.toString(this.d), ')');
    }
}
