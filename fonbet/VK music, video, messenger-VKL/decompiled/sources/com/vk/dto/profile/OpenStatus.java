package com.vk.dto.profile;

import android.os.Parcel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.serialize.Serializer;

/* compiled from: OpenStatus.kt */
/* loaded from: classes18.dex */
public final class OpenStatus implements Serializer.StreamParcelable {
    public static final Serializer.c<OpenStatus> CREATOR = new b();
    public final int b;
    public final String c;
    public final String d;

    /* compiled from: OpenStatus.kt */
    public static final class a {
        public static int a(String str) {
            if (str == null) {
                return 0;
            }
            int hashCode = str.hashCode();
            return hashCode != 3417674 ? hashCode != 94001407 ? (hashCode == 94756344 && str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) ? 2 : 0 : !str.equals("break") ? 0 : 3 : str.equals("open") ? 1 : 0;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<OpenStatus> {
        @Override // com.vk.core.serialize.Serializer.c
        public final OpenStatus a(Serializer serializer) {
            int u = serializer.u();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new OpenStatus(u, H, H2 != null ? H2 : "");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenStatus[i];
        }
    }

    public OpenStatus(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
