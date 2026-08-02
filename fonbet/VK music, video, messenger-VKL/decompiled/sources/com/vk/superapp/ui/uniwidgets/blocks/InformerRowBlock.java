package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.dto.InformerUniWidget;
import xsna.epx;

/* compiled from: InformerRowBlock.kt */
/* loaded from: classes6.dex */
public final class InformerRowBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final InformerUniWidget.LeftData b;
    public final InformerUniWidget.MiddleData c;
    public final InformerUniWidget.RightData d;
    public final WebAction e;

    /* compiled from: InformerRowBlock.kt */
    public static final class a implements Parcelable.Creator<InformerRowBlock> {
        @Override // android.os.Parcelable.Creator
        public final InformerRowBlock createFromParcel(Parcel parcel) {
            return new InformerRowBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InformerRowBlock[] newArray(int i) {
            return new InformerRowBlock[i];
        }
    }

    public InformerRowBlock(InformerUniWidget.LeftData leftData, InformerUniWidget.MiddleData middleData, InformerUniWidget.RightData rightData, WebAction webAction) {
        this.b = leftData;
        this.c = middleData;
        this.d = rightData;
        this.e = webAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InformerRowBlock)) {
            return false;
        }
        InformerRowBlock informerRowBlock = (InformerRowBlock) obj;
        return epx.f(this.b, informerRowBlock.b) && epx.f(this.c, informerRowBlock.c) && epx.f(this.d, informerRowBlock.d) && epx.f(this.e, informerRowBlock.e);
    }

    public final int hashCode() {
        InformerUniWidget.LeftData leftData = this.b;
        int hashCode = (leftData == null ? 0 : leftData.hashCode()) * 31;
        InformerUniWidget.MiddleData middleData = this.c;
        int hashCode2 = (hashCode + (middleData == null ? 0 : middleData.hashCode())) * 31;
        InformerUniWidget.RightData rightData = this.d;
        int hashCode3 = (hashCode2 + (rightData == null ? 0 : rightData.hashCode())) * 31;
        WebAction webAction = this.e;
        return hashCode3 + (webAction != null ? webAction.hashCode() : 0);
    }

    public final String toString() {
        return "InformerRowBlock(leftData=" + this.b + ", middleData=" + this.c + ", rightData=" + this.d + ", action=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }

    /* compiled from: InformerRowBlock.kt */
    public static final class Style implements Parcelable {
        public static final a CREATOR = new a();
        public final InformerUniWidget.LeftData.Style b;
        public final InformerUniWidget.MiddleData.Style c;
        public final InformerUniWidget.RightData.Style d;

        /* compiled from: InformerRowBlock.kt */
        public static final class a implements Parcelable.Creator<Style> {
            @Override // android.os.Parcelable.Creator
            public final Style createFromParcel(Parcel parcel) {
                return new Style(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Style[] newArray(int i) {
                return new Style[i];
            }
        }

        public Style(InformerUniWidget.LeftData.Style style, InformerUniWidget.MiddleData.Style style2, InformerUniWidget.RightData.Style style3) {
            this.b = style;
            this.c = style2;
            this.d = style3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return epx.f(this.b, style.b) && epx.f(this.c, style.c) && epx.f(this.d, style.d);
        }

        public final int hashCode() {
            InformerUniWidget.LeftData.Style style = this.b;
            int hashCode = (style == null ? 0 : style.hashCode()) * 31;
            InformerUniWidget.MiddleData.Style style2 = this.c;
            int hashCode2 = (hashCode + (style2 == null ? 0 : style2.hashCode())) * 31;
            InformerUniWidget.RightData.Style style3 = this.d;
            return hashCode2 + (style3 != null ? style3.hashCode() : 0);
        }

        public final String toString() {
            return "Style(left=" + this.b + ", middle=" + this.c + ", right=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
        }

        public Style(Parcel parcel) {
            this((InformerUniWidget.LeftData.Style) parcel.readParcelable(InformerUniWidget.LeftData.Style.class.getClassLoader()), (InformerUniWidget.MiddleData.Style) parcel.readParcelable(InformerUniWidget.MiddleData.Style.class.getClassLoader()), (InformerUniWidget.RightData.Style) parcel.readParcelable(InformerUniWidget.RightData.Style.class.getClassLoader()));
        }
    }

    public InformerRowBlock(Parcel parcel) {
        this((InformerUniWidget.LeftData) parcel.readParcelable(InformerUniWidget.LeftData.class.getClassLoader()), (InformerUniWidget.MiddleData) parcel.readParcelable(InformerUniWidget.MiddleData.class.getClassLoader()), (InformerUniWidget.RightData) parcel.readParcelable(InformerUniWidget.RightData.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()));
    }
}
