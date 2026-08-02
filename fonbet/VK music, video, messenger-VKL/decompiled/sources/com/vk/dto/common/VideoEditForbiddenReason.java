package com.vk.dto.common;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.aay;
import xsna.cqm0;
import xsna.epx;
import xsna.ho8;

/* compiled from: VideoEditForbiddenReason.kt */
/* loaded from: classes18.dex */
public interface VideoEditForbiddenReason extends Serializer.StreamParcelable {
    public static final a Y6 = a.a;

    /* compiled from: VideoEditForbiddenReason.kt */
    public static final class Ad implements VideoEditForbiddenReason {
        public static final Serializer.c<Ad> CREATOR = new a();
        public final String b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Ad> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Ad a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                return new Ad(H);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ad[i];
            }
        }

        public Ad(String str) {
            this.b = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ad) && epx.f(this.b, ((Ad) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Ad(description="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: VideoEditForbiddenReason.kt */
    public static final class Test implements VideoEditForbiddenReason {
        public static final Serializer.c<Test> CREATOR = new a();
        public final String b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Test> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Test a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                return new Test(H);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Test[i];
            }
        }

        public Test(String str) {
            this.b = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Test) && epx.f(this.b, ((Test) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Test(description="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: VideoEditForbiddenReason.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C0907a b = new C0907a();

        /* compiled from: JsonParser.kt */
        /* renamed from: com.vk.dto.common.VideoEditForbiddenReason$a$a, reason: collision with other inner class name */
        public static final class C0907a extends aay<VideoEditForbiddenReason> {
            @Override // xsna.aay
            public final VideoEditForbiddenReason a(JSONObject jSONObject) {
                String a;
                String optString;
                try {
                    a = cqm0.a(jSONObject.optString("code"));
                    optString = jSONObject.optString("description");
                } catch (Throwable unused) {
                }
                if (epx.f(a, "ad")) {
                    return new Ad(optString);
                }
                if (epx.f(a, LoginRequest.CLIENT_NAME)) {
                    return new Test(optString);
                }
                return null;
            }
        }
    }
}
