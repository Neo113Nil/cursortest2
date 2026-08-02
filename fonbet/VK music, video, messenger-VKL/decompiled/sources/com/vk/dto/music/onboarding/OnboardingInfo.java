package com.vk.dto.music.onboarding;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;

/* compiled from: OnboardingInfo.kt */
/* loaded from: classes18.dex */
public final class OnboardingInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<OnboardingInfo> CREATOR = new b();
    public final String b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<OnboardingInfo> {
        @Override // xsna.aay
        public final OnboardingInfo a(JSONObject jSONObject) {
            return new OnboardingInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<OnboardingInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final OnboardingInfo a(Serializer serializer) {
            return new OnboardingInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingInfo[i];
        }
    }

    static {
        new a();
        new OnboardingInfo("", "");
    }

    public OnboardingInfo(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingInfo)) {
            return false;
        }
        OnboardingInfo onboardingInfo = (OnboardingInfo) obj;
        return epx.f(this.b, onboardingInfo.b) && epx.f(this.c, onboardingInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Onboarding(scenarioType=");
        sb.append(this.b);
        sb.append(", url=");
        return ho8.a(sb, this.c, ')');
    }

    public OnboardingInfo(JSONObject jSONObject) {
        this(jSONObject.optString("scenario_type"), jSONObject.optString("url"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OnboardingInfo(Serializer serializer) {
        this(r0, r3 != null ? r3 : "");
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
    }
}
