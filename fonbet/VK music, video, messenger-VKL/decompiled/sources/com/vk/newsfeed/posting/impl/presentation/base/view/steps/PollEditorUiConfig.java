package com.vk.newsfeed.posting.impl.presentation.base.view.steps;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.shy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PollEditorUiConfig.kt */
/* loaded from: classes4.dex */
public final class PollEditorUiConfig implements Parcelable {
    public static final Parcelable.Creator<PollEditorUiConfig> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    /* compiled from: PollEditorUiConfig.kt */
    public static final class a implements Parcelable.Creator<PollEditorUiConfig> {
        @Override // android.os.Parcelable.Creator
        public final PollEditorUiConfig createFromParcel(Parcel parcel) {
            return new PollEditorUiConfig(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PollEditorUiConfig[] newArray(int i) {
            return new PollEditorUiConfig[i];
        }
    }

    public PollEditorUiConfig() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollEditorUiConfig)) {
            return false;
        }
        PollEditorUiConfig pollEditorUiConfig = (PollEditorUiConfig) obj;
        return this.b == pollEditorUiConfig.b && this.c == pollEditorUiConfig.c && this.d == pollEditorUiConfig.d && this.e == pollEditorUiConfig.e && this.f == pollEditorUiConfig.f && this.g == pollEditorUiConfig.g && this.h == pollEditorUiConfig.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollEditorUiConfig(questionMaxLength=");
        sb.append(this.b);
        sb.append(", questionLengthToMaxLeft=");
        sb.append(this.c);
        sb.append(", answersMinCount=");
        sb.append(this.d);
        sb.append(", answersMaxCount=");
        sb.append(this.e);
        sb.append(", answerMaxLength=");
        sb.append(this.f);
        sb.append(", answerLengthToMaxLeft=");
        sb.append(this.g);
        sb.append(", initialVisibleElements=");
        return vu5.b(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }

    public PollEditorUiConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
    }

    public /* synthetic */ PollEditorUiConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, zcl zclVar) {
        this((i8 & 1) != 0 ? 80 : i, (i8 & 2) != 0 ? 20 : i2, (i8 & 4) != 0 ? 1 : i3, (i8 & 8) != 0 ? 10 : i4, (i8 & 16) != 0 ? 100 : i5, (i8 & 32) != 0 ? 20 : i6, (i8 & 64) != 0 ? 2 : i7);
    }
}
