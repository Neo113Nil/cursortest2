package com.vk.newsfeed.api.data;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;

/* compiled from: WallNegativeRepliesPlaceholder.kt */
/* loaded from: classes3.dex */
public final class WallNegativeRepliesPlaceholder implements Serializer.StreamParcelable {
    public static final Serializer.c<WallNegativeRepliesPlaceholder> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: WallNegativeRepliesPlaceholder.kt */
    public static final class a {
        public static WallNegativeRepliesPlaceholder a(JSONObject jSONObject) {
            return new WallNegativeRepliesPlaceholder(jSONObject.optString("title"), jSONObject.optString("subtitle"), jSONObject.optString("animation"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<WallNegativeRepliesPlaceholder> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WallNegativeRepliesPlaceholder a(Serializer serializer) {
            return new WallNegativeRepliesPlaceholder(serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WallNegativeRepliesPlaceholder[i];
        }
    }

    public WallNegativeRepliesPlaceholder(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
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
