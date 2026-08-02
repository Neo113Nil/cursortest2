package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class ActionButtonHints implements Parcelable {
    public static final Parcelable.Creator<ActionButtonHints> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: PostingViewState.kt */
    public static final class a implements Parcelable.Creator<ActionButtonHints> {
        @Override // android.os.Parcelable.Creator
        public final ActionButtonHints createFromParcel(Parcel parcel) {
            return new ActionButtonHints(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionButtonHints[] newArray(int i) {
            return new ActionButtonHints[i];
        }
    }

    public ActionButtonHints(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionButtonHints)) {
            return false;
        }
        ActionButtonHints actionButtonHints = (ActionButtonHints) obj;
        return epx.f(this.b, actionButtonHints.b) && epx.f(this.c, actionButtonHints.c) && epx.f(this.d, actionButtonHints.d);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionButtonHints(donutOnboardingHint=");
        sb.append(this.b);
        sb.append(", productsActionOnboardingHint=");
        sb.append(this.c);
        sb.append(", vkTicketActionOnboarding=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
