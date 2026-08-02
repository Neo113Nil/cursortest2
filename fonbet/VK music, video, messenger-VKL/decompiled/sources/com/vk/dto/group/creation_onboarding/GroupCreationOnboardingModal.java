package com.vk.dto.group.creation_onboarding;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: GroupCreationOnboardingModal.kt */
/* loaded from: classes18.dex */
public final class GroupCreationOnboardingModal extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupCreationOnboardingModal> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: GroupCreationOnboardingModal.kt */
    public static final class a {
        public static GroupCreationOnboardingModal a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("subtitle");
            String optString3 = jSONObject.optString("image");
            JSONObject optJSONObject = jSONObject.optJSONObject("button");
            return new GroupCreationOnboardingModal(optString, optString2, optString3, optJSONObject != null ? optJSONObject.optString("title") : null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GroupCreationOnboardingModal> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupCreationOnboardingModal a(Serializer serializer) {
            return new GroupCreationOnboardingModal(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupCreationOnboardingModal[i];
        }
    }

    public GroupCreationOnboardingModal(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupCreationOnboardingModal)) {
            return false;
        }
        GroupCreationOnboardingModal groupCreationOnboardingModal = (GroupCreationOnboardingModal) obj;
        return epx.f(this.b, groupCreationOnboardingModal.b) && epx.f(this.c, groupCreationOnboardingModal.c) && epx.f(this.d, groupCreationOnboardingModal.d) && epx.f(this.e, groupCreationOnboardingModal.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupCreationOnboardingModal(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", buttonText=");
        return ho8.a(sb, this.e, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupCreationOnboardingModal(Serializer serializer) {
        this(r0, r2, r3, r5 != null ? r5 : "");
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        H3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
    }
}
