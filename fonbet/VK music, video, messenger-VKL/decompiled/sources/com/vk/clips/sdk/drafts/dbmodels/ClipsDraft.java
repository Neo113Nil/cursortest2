package com.vk.clips.sdk.drafts.dbmodels;

import android.os.Parcel;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: ClipsDraft.kt */
/* loaded from: classes17.dex */
public final class ClipsDraft implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<ClipsDraft> CREATOR = new b();
    public static final a d = new a();
    public final ClipsDraftCommonData b;
    public final JSONObject c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsDraft> {
        @Override // xsna.aay
        public final ClipsDraft a(JSONObject jSONObject) {
            return new ClipsDraft(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsDraft> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsDraft a(Serializer serializer) {
            return new ClipsDraft((ClipsDraftCommonData) serializer.G(ClipsDraftCommonData.class.getClassLoader()), new JSONObject(String.valueOf(serializer.H())));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsDraft[i];
        }
    }

    public ClipsDraft(ClipsDraftCommonData clipsDraftCommonData, JSONObject jSONObject) {
        this.b = clipsDraftCommonData;
        this.c = jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c.toString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.g("draft_common_data", this.b);
        w9yVar.e(this.c, "extra_data");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClipsDraft)) {
            return false;
        }
        ClipsDraft clipsDraft = (ClipsDraft) obj;
        return epx.f(this.b, clipsDraft.b) && epx.f(this.c.toString(), clipsDraft.c.toString());
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c.toString());
    }

    public final String toString() {
        return "ClipsDraft(commonData=" + this.b + ", extraData=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsDraft(JSONObject jSONObject) {
        this(r0, r4 == null ? new JSONObject() : r4);
        ClipsDraftCommonData clipsDraftCommonData;
        ClipsDraftCommonData.a aVar = ClipsDraftCommonData.p;
        if (jSONObject.has("draft_common_data")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("draft_common_data");
                aVar.getClass();
                clipsDraftCommonData = new ClipsDraftCommonData(jSONObject2);
            } catch (JSONException e) {
                L.i(e);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("extra_data");
        }
        clipsDraftCommonData = null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("extra_data");
    }
}
