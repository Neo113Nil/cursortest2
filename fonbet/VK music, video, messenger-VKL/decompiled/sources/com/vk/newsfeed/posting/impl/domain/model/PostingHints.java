package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;

/* compiled from: PostingHints.kt */
/* loaded from: classes4.dex */
public final class PostingHints implements Parcelable {
    public static final Parcelable.Creator<PostingHints> CREATOR = new a();
    public static final PostingHints l = new PostingHints(null, null, null, null, null, null, null, false, null, false);
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;
    public final boolean k;

    /* compiled from: PostingHints.kt */
    public static final class a implements Parcelable.Creator<PostingHints> {
        @Override // android.os.Parcelable.Creator
        public final PostingHints createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            return new PostingHints(readString, readString2, readString3, readString4, readString5, readString6, readString7, z, parcel.readString(), parcel.readInt() == 0 ? z2 : true);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingHints[] newArray(int i) {
            return new PostingHints[i];
        }
    }

    public PostingHints(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, boolean z2) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = z;
        this.j = str8;
        this.k = z2;
    }

    public static PostingHints a(PostingHints postingHints, String str, String str2, boolean z, int i) {
        String str3 = (i & 1) != 0 ? postingHints.b : null;
        String str4 = (i & 2) != 0 ? postingHints.c : null;
        String str5 = (i & 4) != 0 ? postingHints.d : null;
        if ((i & 8) != 0) {
            str = postingHints.e;
        }
        String str6 = str;
        String str7 = (i & 16) != 0 ? postingHints.f : null;
        String str8 = (i & 32) != 0 ? postingHints.g : null;
        String str9 = (i & 64) != 0 ? postingHints.h : str2;
        boolean z2 = (i & 128) != 0 ? postingHints.i : z;
        String str10 = (i & 256) != 0 ? postingHints.j : null;
        boolean z3 = (i & 512) != 0 ? postingHints.k : false;
        postingHints.getClass();
        return new PostingHints(str3, str4, str5, str6, str7, str8, str9, z2, str10, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingHints)) {
            return false;
        }
        PostingHints postingHints = (PostingHints) obj;
        return epx.f(this.b, postingHints.b) && epx.f(this.c, postingHints.c) && epx.f(this.d, postingHints.d) && epx.f(this.e, postingHints.e) && epx.f(this.f, postingHints.f) && epx.f(this.g, postingHints.g) && epx.f(this.h, postingHints.h) && this.i == postingHints.i && epx.f(this.j, postingHints.j) && this.k == postingHints.k;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int b = qoy.b((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.i);
        String str8 = this.j;
        return Boolean.hashCode(this.k) + ((b + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingHints(nextStepButtonHint=");
        sb.append(this.b);
        sb.append(", coauthorsOnboarding=");
        sb.append(this.c);
        sb.append(", donutOnboarding=");
        sb.append(this.d);
        sb.append(", productsActionOnboarding=");
        sb.append(this.e);
        sb.append(", vkTicketActionOnboarding=");
        sb.append(this.f);
        sb.append(", musicSnippetOnboarding=");
        sb.append(this.g);
        sb.append(", remoteDraftsOnboarding=");
        sb.append(this.h);
        sb.append(", isDraftOnboardingAvailable=");
        sb.append(this.i);
        sb.append(", bcProductsPostingOnboarding=");
        sb.append(this.j);
        sb.append(", isDonutPrivacyOnboarding=");
        return q0.a(sb, this.k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.j);
        parcel.writeInt(this.k ? 1 : 0);
    }
}
