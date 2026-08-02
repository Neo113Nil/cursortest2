package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import xsna.epx;

/* compiled from: TableBlock.kt */
/* loaded from: classes6.dex */
public final class TableBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final ImageBlock b;
    public final TextBlock c;
    public final TextBlock d;
    public final AvatarStackBlock e;
    public final WebAction f;
    public final HorizontalAlignment g;

    /* compiled from: TableBlock.kt */
    public static final class a implements Parcelable.Creator<TableBlock> {
        @Override // android.os.Parcelable.Creator
        public final TableBlock createFromParcel(Parcel parcel) {
            return new TableBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TableBlock[] newArray(int i) {
            return new TableBlock[i];
        }
    }

    public TableBlock(ImageBlock imageBlock, TextBlock textBlock, TextBlock textBlock2, AvatarStackBlock avatarStackBlock, WebAction webAction, HorizontalAlignment horizontalAlignment) {
        this.b = imageBlock;
        this.c = textBlock;
        this.d = textBlock2;
        this.e = avatarStackBlock;
        this.f = webAction;
        this.g = horizontalAlignment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g.name());
    }

    /* compiled from: TableBlock.kt */
    public static final class Style implements Parcelable {
        public static final a CREATOR = new a();
        public final HorizontalAlignment b;
        public final ImageBlock.Style c;
        public final TextBlock.Style d;
        public final TextBlock.Style e;

        /* compiled from: TableBlock.kt */
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

        public Style(HorizontalAlignment horizontalAlignment, ImageBlock.Style style, TextBlock.Style style2, TextBlock.Style style3) {
            this.b = horizontalAlignment;
            this.c = style;
            this.d = style2;
            this.e = style3;
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
            return this.b == style.b && epx.f(this.c, style.c) && epx.f(this.d, style.d) && epx.f(this.e, style.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Style(alignment=" + this.b + ", imageStyle=" + this.c + ", titleStyle=" + this.d + ", descStyle=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
        }

        public Style(Parcel parcel) {
            this(HorizontalAlignment.valueOf(parcel.readString()), (ImageBlock.Style) parcel.readParcelable(ImageBlock.Style.class.getClassLoader()), (TextBlock.Style) parcel.readParcelable(TextBlock.Style.class.getClassLoader()), (TextBlock.Style) parcel.readParcelable(TextBlock.Style.class.getClassLoader()));
        }
    }

    public TableBlock(Parcel parcel) {
        this((ImageBlock) parcel.readParcelable(ImageBlock.class.getClassLoader()), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (AvatarStackBlock) parcel.readParcelable(AvatarStackBlock.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), HorizontalAlignment.valueOf(parcel.readString()));
    }
}
