package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: ScrollItemBlock.kt */
/* loaded from: classes6.dex */
public final class ScrollItemBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final ImageBlock b;
    public final TextBlock c;
    public final TextBlock d;
    public final BadgeBlock e;
    public final WebAction f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScrollItemBlock.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size EXTRA_LARGE;
        public static final Size LARGE;
        public static final Size REGULAR;

        static {
            Size size = new Size("REGULAR", 0);
            REGULAR = size;
            Size size2 = new Size("LARGE", 1);
            LARGE = size2;
            Size size3 = new Size("EXTRA_LARGE", 2);
            EXTRA_LARGE = size3;
            Size[] sizeArr = {size, size2, size3};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: ScrollItemBlock.kt */
    public static final class a implements Parcelable.Creator<ScrollItemBlock> {
        @Override // android.os.Parcelable.Creator
        public final ScrollItemBlock createFromParcel(Parcel parcel) {
            return new ScrollItemBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ScrollItemBlock[] newArray(int i) {
            return new ScrollItemBlock[i];
        }
    }

    public ScrollItemBlock(ImageBlock imageBlock, TextBlock textBlock, TextBlock textBlock2, BadgeBlock badgeBlock, WebAction webAction) {
        this.b = imageBlock;
        this.c = textBlock;
        this.d = textBlock2;
        this.e = badgeBlock;
        this.f = webAction;
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
    }

    /* compiled from: ScrollItemBlock.kt */
    public static final class Style implements Parcelable {
        public static final a CREATOR = new a();
        public final Size b;
        public final HorizontalAlignment c;
        public final ImageBlock.Style d;
        public final TextBlock.Style e;
        public final TextBlock.Style f;
        public final HorizontalAlignment g;

        /* compiled from: ScrollItemBlock.kt */
        public static final class a implements Parcelable.Creator<Style> {

            /* compiled from: ScrollItemBlock.kt */
            /* renamed from: com.vk.superapp.ui.uniwidgets.blocks.ScrollItemBlock$Style$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C1908a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Size.values().length];
                    try {
                        iArr[Size.REGULAR.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Size.LARGE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Size.EXTRA_LARGE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Style createFromParcel(Parcel parcel) {
                return new Style(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Style[] newArray(int i) {
                return new Style[i];
            }
        }

        public Style(Size size, HorizontalAlignment horizontalAlignment, ImageBlock.Style style, TextBlock.Style style2, TextBlock.Style style3, HorizontalAlignment horizontalAlignment2) {
            this.b = size;
            this.c = horizontalAlignment;
            this.d = style;
            this.e = style2;
            this.f = style3;
            this.g = horizontalAlignment2;
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
            return this.b == style.b && this.c == style.c && epx.f(this.d, style.d) && epx.f(this.e, style.e) && epx.f(this.f, style.f) && this.g == style.g;
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Style(size=" + this.b + ", alignment=" + this.c + ", imageStyle=" + this.d + ", titleStyle=" + this.e + ", descStyle=" + this.f + ", badgeAlignment=" + this.g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
            parcel.writeString(this.c.name());
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
            parcel.writeString(this.g.name());
        }

        public Style(Parcel parcel) {
            this(Size.valueOf(parcel.readString()), HorizontalAlignment.valueOf(parcel.readString()), (ImageBlock.Style) parcel.readParcelable(ImageBlock.Style.class.getClassLoader()), (TextBlock.Style) parcel.readParcelable(TextBlock.Style.class.getClassLoader()), (TextBlock.Style) parcel.readParcelable(TextBlock.Style.class.getClassLoader()), HorizontalAlignment.valueOf(parcel.readString()));
        }
    }

    public ScrollItemBlock(Parcel parcel) {
        this((ImageBlock) parcel.readParcelable(ImageBlock.class.getClassLoader()), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (BadgeBlock) parcel.readParcelable(BadgeBlock.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()));
    }
}
