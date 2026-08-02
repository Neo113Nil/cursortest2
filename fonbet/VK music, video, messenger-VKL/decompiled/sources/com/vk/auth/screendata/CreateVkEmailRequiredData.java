package com.vk.auth.screendata;

import android.os.Parcel;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.exceptions.AuthException;
import java.util.List;
import java.util.Locale;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.j5g;
import xsna.urd0;
import xsna.zrp;

/* compiled from: CreateVkEmailRequiredData.kt */
/* loaded from: classes.dex */
public final class CreateVkEmailRequiredData implements Serializer.StreamParcelable {
    public static final Serializer.c<CreateVkEmailRequiredData> CREATOR = new b();
    public final String b;
    public final List<String> c;
    public final String d;
    public final String e;
    public final AdsAcceptance f;
    public final VkAuthMetaInfo g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateVkEmailRequiredData.kt */
    /* loaded from: classes15.dex */
    public static final class AdsAcceptance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdsAcceptance[] $VALUES;
        public static final AdsAcceptance ACCEPTED;
        public static final AdsAcceptance HIDE;
        public static final AdsAcceptance NOT_ACCEPTED;

        static {
            AdsAcceptance adsAcceptance = new AdsAcceptance("HIDE", 0);
            HIDE = adsAcceptance;
            AdsAcceptance adsAcceptance2 = new AdsAcceptance(SignalingProtocol.PARTICIPANT_STATE_ACCEPTED, 1);
            ACCEPTED = adsAcceptance2;
            AdsAcceptance adsAcceptance3 = new AdsAcceptance("NOT_ACCEPTED", 2);
            NOT_ACCEPTED = adsAcceptance3;
            AdsAcceptance[] adsAcceptanceArr = {adsAcceptance, adsAcceptance2, adsAcceptance3};
            $VALUES = adsAcceptanceArr;
            $ENTRIES = new asp(adsAcceptanceArr);
        }

        public AdsAcceptance() {
            throw null;
        }

        public static AdsAcceptance valueOf(String str) {
            return (AdsAcceptance) Enum.valueOf(AdsAcceptance.class, str);
        }

        public static AdsAcceptance[] values() {
            return (AdsAcceptance[]) $VALUES.clone();
        }
    }

    /* compiled from: CreateVkEmailRequiredData.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public static CreateVkEmailRequiredData a(AuthException.VkEmailSignUpRequiredException vkEmailSignUpRequiredException, AuthModel.EmailAdsAcceptance emailAdsAcceptance, VkAuthMetaInfo vkAuthMetaInfo) {
            boolean g = vkEmailSignUpRequiredException.g();
            return new CreateVkEmailRequiredData(vkEmailSignUpRequiredException.d(), vkEmailSignUpRequiredException.i(), vkEmailSignUpRequiredException.h(), vkEmailSignUpRequiredException.k(), vkEmailSignUpRequiredException.j() ? (emailAdsAcceptance == AuthModel.EmailAdsAcceptance.UNKNOWN || emailAdsAcceptance == AuthModel.EmailAdsAcceptance.NOT_ACCEPTED) ? g ? AdsAcceptance.ACCEPTED : AdsAcceptance.NOT_ACCEPTED : AdsAcceptance.HIDE : emailAdsAcceptance == AuthModel.EmailAdsAcceptance.NOT_ACCEPTED ? g ? AdsAcceptance.ACCEPTED : AdsAcceptance.NOT_ACCEPTED : AdsAcceptance.HIDE, vkAuthMetaInfo);
        }
    }

    /* compiled from: Serializer.kt */
    /* loaded from: classes15.dex */
    public static final class b extends Serializer.c<CreateVkEmailRequiredData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CreateVkEmailRequiredData a(Serializer serializer) {
            String H = serializer.H();
            List V = j5g.V(serializer.h());
            String H2 = serializer.H();
            String H3 = serializer.H();
            String H4 = serializer.H();
            Enum r5 = null;
            if (H4 != null) {
                try {
                    r5 = Enum.valueOf(AdsAcceptance.class, H4.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                }
            }
            return new CreateVkEmailRequiredData(H, V, H2, H3, (AdsAcceptance) r5, (VkAuthMetaInfo) serializer.A(VkAuthMetaInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreateVkEmailRequiredData[i];
        }
    }

    public CreateVkEmailRequiredData(String str, List<String> list, String str2, String str3, AdsAcceptance adsAcceptance, VkAuthMetaInfo vkAuthMetaInfo) {
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = str3;
        this.f = adsAcceptance;
        this.g = vkAuthMetaInfo;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.l0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f.name());
        serializer.e0(this.g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateVkEmailRequiredData)) {
            return false;
        }
        CreateVkEmailRequiredData createVkEmailRequiredData = (CreateVkEmailRequiredData) obj;
        return epx.f(this.b, createVkEmailRequiredData.b) && epx.f(this.c, createVkEmailRequiredData.c) && epx.f(this.d, createVkEmailRequiredData.d) && epx.f(this.e, createVkEmailRequiredData.e) && this.f == createVkEmailRequiredData.f && epx.f(this.g, createVkEmailRequiredData.g);
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "CreateVkEmailRequiredData(accessToken=" + this.b + ", domains=" + this.c + ", domain=" + this.d + ", username=" + this.e + ", adsAcceptance=" + this.f + ", authMetaInfo=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
