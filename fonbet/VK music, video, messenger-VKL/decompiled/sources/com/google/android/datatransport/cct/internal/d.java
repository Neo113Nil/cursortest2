package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes.dex */
public final class d extends NetworkConnectionInfo {
    public final NetworkConnectionInfo.NetworkType a;
    public final NetworkConnectionInfo.MobileSubtype b;

    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    /* loaded from: classes12.dex */
    public static final class a extends NetworkConnectionInfo.a {
        public NetworkConnectionInfo.NetworkType a;
        public NetworkConnectionInfo.MobileSubtype b;

        public final d a() {
            return new d(this.a, this.b);
        }

        public final a b(@Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.b = mobileSubtype;
            return this;
        }

        public final a c(@Nullable NetworkConnectionInfo.NetworkType networkType) {
            this.a = networkType;
            return this;
        }
    }

    public d(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.a = networkType;
        this.b = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public final NetworkConnectionInfo.MobileSubtype a() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public final NetworkConnectionInfo.NetworkType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.a;
        if (networkType == null) {
            if (networkConnectionInfo.b() != null) {
                return false;
            }
        } else if (!networkType.equals(networkConnectionInfo.b())) {
            return false;
        }
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.b;
        return mobileSubtype == null ? networkConnectionInfo.a() == null : mobileSubtype.equals(networkConnectionInfo.a());
    }

    public final int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.a;
        int hashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.b;
        return (mobileSubtype != null ? mobileSubtype.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
