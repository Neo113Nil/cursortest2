package com.vk.newsfeed.api.posting.dto;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.zcl;

/* compiled from: PostingOrd.kt */
/* loaded from: classes3.dex */
public final class PostingOrd implements Parcelable {
    public static final Parcelable.Creator<PostingOrd> CREATOR = new a();
    public final boolean b;
    public final String c;
    public final String d;

    /* compiled from: PostingOrd.kt */
    public static final class a implements Parcelable.Creator<PostingOrd> {
        @Override // android.os.Parcelable.Creator
        public final PostingOrd createFromParcel(Parcel parcel) {
            return new PostingOrd(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingOrd[] newArray(int i) {
            return new PostingOrd[i];
        }
    }

    public PostingOrd(boolean z, String str, String str2) {
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingOrd)) {
            return false;
        }
        PostingOrd postingOrd = (PostingOrd) obj;
        return this.b == postingOrd.b && epx.f(this.c, postingOrd.c) && epx.f(this.d, postingOrd.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingOrd(isAddOrd=");
        sb.append(this.b);
        sb.append(", predId=");
        sb.append(this.c);
        sb.append(", erId=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public /* synthetic */ PostingOrd(boolean z, String str, String str2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str, str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PostingOrd(JSONObject jSONObject) {
        this(r0 != null ? r0.booleanValue() : false, f370.D(jSONObject, "pred_id_ord"), f370.D(jSONObject, "er_id_ord"));
        Boolean q = f370.q(jSONObject, "is_add_ord");
    }
}
