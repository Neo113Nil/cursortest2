package com.vk.dto.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import xsna.epx;
import xsna.f370;
import xsna.ho8;

/* compiled from: TitleAction.kt */
/* loaded from: classes18.dex */
public final class TitleAction implements Parcelable {
    public static final Parcelable.Creator<TitleAction> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final Snippet e;

    /* compiled from: TitleAction.kt */
    public static final class Snippet implements Parcelable {
        public static final Parcelable.Creator<Snippet> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: TitleAction.kt */
        public static final class a implements Parcelable.Creator<Snippet> {
            @Override // android.os.Parcelable.Creator
            public final Snippet createFromParcel(Parcel parcel) {
                return new Snippet(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Snippet[] newArray(int i) {
                return new Snippet[i];
            }
        }

        public Snippet(String str, String str2, String str3, String str4) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Snippet)) {
                return false;
            }
            Snippet snippet = (Snippet) obj;
            return epx.f(this.b, snippet.b) && epx.f(this.c, snippet.c) && epx.f(this.d, snippet.d) && epx.f(this.e, snippet.e);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Snippet(openTitle=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", description=");
            sb.append(this.d);
            sb.append(", typeName=");
            return ho8.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }
    }

    /* compiled from: TitleAction.kt */
    public static final class a {
        public static TitleAction a(JSONObject jSONObject) {
            Snippet snippet;
            JSONObject optJSONObject = jSONObject.optJSONObject("snippet");
            if (optJSONObject != null) {
                String A = f370.A("open_title", optJSONObject);
                String A2 = f370.A("title", optJSONObject);
                String A3 = f370.A("description", optJSONObject);
                String A4 = f370.A("type_name", optJSONObject);
                String[] strArr = {A, A2, A3, A4};
                for (int i = 0; i < 4; i++) {
                    if (strArr[i] != null) {
                        snippet = new Snippet(A, A2, A3, A4);
                        break;
                    }
                }
            }
            snippet = null;
            String optString = jSONObject.optString("url");
            String A5 = f370.A("id", jSONObject);
            String A6 = f370.A("type", jSONObject);
            if (A5 != null) {
                return new TitleAction(A5, A6, optString, snippet);
            }
            return null;
        }
    }

    /* compiled from: TitleAction.kt */
    public static final class b implements Parcelable.Creator<TitleAction> {
        @Override // android.os.Parcelable.Creator
        public final TitleAction createFromParcel(Parcel parcel) {
            return new TitleAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Snippet.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TitleAction[] newArray(int i) {
            return new TitleAction[i];
        }
    }

    public TitleAction(String str, String str2, String str3, Snippet snippet) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = snippet;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleAction)) {
            return false;
        }
        TitleAction titleAction = (TitleAction) obj;
        return epx.f(this.b, titleAction.b) && epx.f(this.c, titleAction.c) && epx.f(this.d, titleAction.d) && epx.f(this.e, titleAction.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Snippet snippet = this.e;
        return hashCode3 + (snippet != null ? snippet.hashCode() : 0);
    }

    public final String toString() {
        return "TitleAction(id=" + this.b + ", type=" + this.c + ", url=" + this.d + ", snippet=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Snippet snippet = this.e;
        if (snippet == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            snippet.writeToParcel(parcel, i);
        }
    }
}
