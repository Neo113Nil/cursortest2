package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ActionLinkSnippet.kt */
/* loaded from: classes17.dex */
public final class ActionLinkSnippet implements Parcelable {
    public static final Parcelable.Creator<ActionLinkSnippet> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final SdkImages h;
    public final SnippetStyle i;
    public final String j;
    public final String k;
    public final ActionLinkSnippetIcon l;

    /* compiled from: ActionLinkSnippet.kt */
    public static final class a implements Parcelable.Creator<ActionLinkSnippet> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinkSnippet createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            SdkImages createFromParcel = SdkImages.CREATOR.createFromParcel(parcel);
            SnippetStyle createFromParcel2 = parcel.readInt() == 0 ? null : SnippetStyle.CREATOR.createFromParcel(parcel);
            String readString5 = parcel.readString();
            ActionLinkSnippetIcon actionLinkSnippetIcon = null;
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                actionLinkSnippetIcon = ActionLinkSnippetIcon.valueOf(parcel.readString());
            }
            return new ActionLinkSnippet(readString, readString2, readString3, readString4, readInt, readInt2, createFromParcel, createFromParcel2, readString5, readString6, actionLinkSnippetIcon);
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinkSnippet[] newArray(int i) {
            return new ActionLinkSnippet[i];
        }
    }

    public ActionLinkSnippet(String str, String str2, String str3, String str4, int i, int i2, SdkImages sdkImages, SnippetStyle snippetStyle, String str5, String str6, ActionLinkSnippetIcon actionLinkSnippetIcon) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = i2;
        this.h = sdkImages;
        this.i = snippetStyle;
        this.j = str5;
        this.k = str6;
        this.l = actionLinkSnippetIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionLinkSnippet)) {
            return false;
        }
        ActionLinkSnippet actionLinkSnippet = (ActionLinkSnippet) obj;
        return epx.f(this.b, actionLinkSnippet.b) && epx.f(this.c, actionLinkSnippet.c) && epx.f(this.d, actionLinkSnippet.d) && epx.f(this.e, actionLinkSnippet.e) && this.f == actionLinkSnippet.f && this.g == actionLinkSnippet.g && epx.f(this.h, actionLinkSnippet.h) && epx.f(this.i, actionLinkSnippet.i) && epx.f(this.j, actionLinkSnippet.j) && epx.f(this.k, actionLinkSnippet.k) && this.l == actionLinkSnippet.l;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + shy.a(this.g, shy.a(this.f, urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31)) * 31;
        SnippetStyle snippetStyle = this.i;
        int hashCode2 = (hashCode + (snippetStyle == null ? 0 : snippetStyle.hashCode())) * 31;
        String str = this.j;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ActionLinkSnippetIcon actionLinkSnippetIcon = this.l;
        return hashCode4 + (actionLinkSnippetIcon != null ? actionLinkSnippetIcon.hashCode() : 0);
    }

    public final String toString() {
        return "ActionLinkSnippet(title=" + this.b + ", description=" + this.c + ", typeName=" + this.d + ", openTitle=" + this.e + ", showTs=" + this.f + ", hideTs=" + this.g + ", images=" + this.h + ", style=" + this.i + ", appPackageName=" + this.j + ", appDeeplink=" + this.k + ", icon=" + this.l + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        this.h.writeToParcel(parcel, i);
        SnippetStyle snippetStyle = this.i;
        if (snippetStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            snippetStyle.writeToParcel(parcel, i);
        }
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        ActionLinkSnippetIcon actionLinkSnippetIcon = this.l;
        if (actionLinkSnippetIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(actionLinkSnippetIcon.name());
        }
    }

    public /* synthetic */ ActionLinkSnippet(String str, String str2, String str3, String str4, int i, int i2, SdkImages sdkImages, SnippetStyle snippetStyle, String str5, String str6, ActionLinkSnippetIcon actionLinkSnippetIcon, int i3, zcl zclVar) {
        this(str, str2, str3, str4, i, i2, sdkImages, snippetStyle, str5, str6, (i3 & 1024) != 0 ? null : actionLinkSnippetIcon);
    }
}
