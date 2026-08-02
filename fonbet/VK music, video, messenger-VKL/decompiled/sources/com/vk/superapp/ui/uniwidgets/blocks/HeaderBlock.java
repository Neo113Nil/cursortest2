package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;

/* compiled from: UiBlocks.kt */
/* loaded from: classes6.dex */
public final class HeaderBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final ImageBlock b;
    public final TextBlock c;
    public final String d;

    /* compiled from: UiBlocks.kt */
    public static final class a implements Parcelable.Creator<HeaderBlock> {
        public static BaseBlock a(String str, String str2, String str3) {
            TextBlock textBlock = null;
            ImageBlock imageBlock = (str == null || str.length() == 0) ? null : new ImageBlock(null, str, null, new ImageBlock.Style(ImageBlock.Style.Size.NONE, ImageBlock.Style.Outline.SQUARE, null, 4, null), null, null, 32, null);
            if (str2 != null && str2.length() != 0) {
                textBlock = new TextBlock(str2, new TextBlock.Style(WidgetColor.NONE, null, 2, null));
            }
            return (imageBlock == null && textBlock == null) ? EmptyBlock.b : new HeaderBlock(imageBlock, textBlock, str3);
        }

        @Override // android.os.Parcelable.Creator
        public final HeaderBlock createFromParcel(Parcel parcel) {
            return new HeaderBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final HeaderBlock[] newArray(int i) {
            return new HeaderBlock[i];
        }
    }

    public HeaderBlock(ImageBlock imageBlock, TextBlock textBlock, String str) {
        this.b = imageBlock;
        this.c = textBlock;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }

    public HeaderBlock(Parcel parcel) {
        this((ImageBlock) parcel.readParcelable(ImageBlock.class.getClassLoader()), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), parcel.readString());
    }
}
