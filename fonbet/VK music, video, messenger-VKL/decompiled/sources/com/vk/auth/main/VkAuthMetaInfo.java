package com.vk.auth.main;

import com.vk.auth.oauth.VkOAuthGoal;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.AuthTarget;
import java.util.Locale;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: VkAuthMetaInfo.kt */
/* loaded from: classes.dex */
public final class VkAuthMetaInfo extends Serializer.StreamParcelableAdapter {
    public final VkFastLoginModifiedUser b;
    public final String c;
    public final VkOAuthGoal d;
    public final SilentAuthSource e;
    public final AuthTarget f;
    public final String g;
    public static final VkAuthMetaInfo h = new VkAuthMetaInfo(null, null, null, null, null, null, 63, null);
    public static final Serializer.c<VkAuthMetaInfo> CREATOR = new b();

    /* compiled from: VkAuthMetaInfo.kt */
    public static final class a {
        public static VkAuthMetaInfo a() {
            return new VkAuthMetaInfo(null, null, null, null, new AuthTarget(null, false, false, true, false, 23, null), null, 47, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VkAuthMetaInfo> {
        /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
        @Override // com.vk.core.serialize.Serializer.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final VkAuthMetaInfo a(Serializer serializer) {
            Enum valueOf;
            String H;
            VkFastLoginModifiedUser vkFastLoginModifiedUser = (VkFastLoginModifiedUser) serializer.A(VkFastLoginModifiedUser.class.getClassLoader());
            String H2 = serializer.H();
            String H3 = serializer.H();
            Enum r1 = null;
            if (H3 != null) {
                try {
                    valueOf = Enum.valueOf(VkOAuthGoal.class, H3.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                }
                VkOAuthGoal vkOAuthGoal = (VkOAuthGoal) valueOf;
                H = serializer.H();
                if (H != null) {
                    try {
                        r1 = Enum.valueOf(SilentAuthSource.class, H.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                SilentAuthSource silentAuthSource = (SilentAuthSource) r1;
                AuthTarget authTarget = (AuthTarget) serializer.A(AuthTarget.class.getClassLoader());
                return new VkAuthMetaInfo(vkFastLoginModifiedUser, H2, vkOAuthGoal, silentAuthSource, authTarget != null ? new AuthTarget(null, false, false, false, false, 31, null) : authTarget, serializer.H());
            }
            valueOf = null;
            VkOAuthGoal vkOAuthGoal2 = (VkOAuthGoal) valueOf;
            H = serializer.H();
            if (H != null) {
            }
            SilentAuthSource silentAuthSource2 = (SilentAuthSource) r1;
            AuthTarget authTarget2 = (AuthTarget) serializer.A(AuthTarget.class.getClassLoader());
            return new VkAuthMetaInfo(vkFastLoginModifiedUser, H2, vkOAuthGoal2, silentAuthSource2, authTarget2 != null ? new AuthTarget(null, false, false, false, false, 31, null) : authTarget2, serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkAuthMetaInfo[i];
        }
    }

    public VkAuthMetaInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static VkAuthMetaInfo zb(VkAuthMetaInfo vkAuthMetaInfo, SilentAuthSource silentAuthSource, AuthTarget authTarget, String str, int i) {
        VkFastLoginModifiedUser vkFastLoginModifiedUser = vkAuthMetaInfo.b;
        String str2 = vkAuthMetaInfo.c;
        VkOAuthGoal vkOAuthGoal = vkAuthMetaInfo.d;
        if ((i & 8) != 0) {
            silentAuthSource = vkAuthMetaInfo.e;
        }
        SilentAuthSource silentAuthSource2 = silentAuthSource;
        if ((i & 16) != 0) {
            authTarget = vkAuthMetaInfo.f;
        }
        AuthTarget authTarget2 = authTarget;
        if ((i & 32) != 0) {
            str = vkAuthMetaInfo.g;
        }
        vkAuthMetaInfo.getClass();
        return new VkAuthMetaInfo(vkFastLoginModifiedUser, str2, vkOAuthGoal, silentAuthSource2, authTarget2, str);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        VkOAuthGoal vkOAuthGoal = this.d;
        serializer.j0(vkOAuthGoal != null ? vkOAuthGoal.name() : null);
        SilentAuthSource silentAuthSource = this.e;
        serializer.j0(silentAuthSource != null ? silentAuthSource.name() : null);
        serializer.e0(this.f);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkAuthMetaInfo)) {
            return false;
        }
        VkAuthMetaInfo vkAuthMetaInfo = (VkAuthMetaInfo) obj;
        return epx.f(this.b, vkAuthMetaInfo.b) && epx.f(this.c, vkAuthMetaInfo.c) && this.d == vkAuthMetaInfo.d && this.e == vkAuthMetaInfo.e && epx.f(this.f, vkAuthMetaInfo.f) && epx.f(this.g, vkAuthMetaInfo.g);
    }

    public final int hashCode() {
        VkFastLoginModifiedUser vkFastLoginModifiedUser = this.b;
        int hashCode = (vkFastLoginModifiedUser == null ? 0 : vkFastLoginModifiedUser.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        VkOAuthGoal vkOAuthGoal = this.d;
        int hashCode3 = (hashCode2 + (vkOAuthGoal == null ? 0 : vkOAuthGoal.hashCode())) * 31;
        SilentAuthSource silentAuthSource = this.e;
        int hashCode4 = (this.f.hashCode() + ((hashCode3 + (silentAuthSource == null ? 0 : silentAuthSource.hashCode())) * 31)) * 31;
        String str2 = this.g;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAuthMetaInfo(modifiedUser=");
        sb.append(this.b);
        sb.append(", externalOauthService=");
        sb.append(this.c);
        sb.append(", externalOauthGoal=");
        sb.append(this.d);
        sb.append(", authSource=");
        sb.append(this.e);
        sb.append(", authTarget=");
        sb.append(this.f);
        sb.append(", phoneToActualize=");
        return ho8.a(sb, this.g, ')');
    }

    public /* synthetic */ VkAuthMetaInfo(VkFastLoginModifiedUser vkFastLoginModifiedUser, String str, VkOAuthGoal vkOAuthGoal, SilentAuthSource silentAuthSource, AuthTarget authTarget, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : vkFastLoginModifiedUser, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : vkOAuthGoal, (i & 8) != 0 ? null : silentAuthSource, (i & 16) != 0 ? new AuthTarget(null, false, false, false, false, 31, null) : authTarget, (i & 32) != 0 ? null : str2);
    }

    public VkAuthMetaInfo(VkFastLoginModifiedUser vkFastLoginModifiedUser, String str, VkOAuthGoal vkOAuthGoal, SilentAuthSource silentAuthSource, AuthTarget authTarget, String str2) {
        this.b = vkFastLoginModifiedUser;
        this.c = str;
        this.d = vkOAuthGoal;
        this.e = silentAuthSource;
        this.f = authTarget;
        this.g = str2;
    }
}
