package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import xsna.epx;
import xsna.zcl;

/* compiled from: FooterBlock.kt */
/* loaded from: classes6.dex */
public abstract class FooterBlock implements BaseBlock {
    public FooterBlock(String str, zcl zclVar) {
    }

    /* compiled from: FooterBlock.kt */
    public static final class FooterButton extends FooterBlock {
        public static final a CREATOR = new a();
        public final String b;
        public final TextBlock c;
        public final WebAction d;

        /* compiled from: FooterBlock.kt */
        public static final class a implements Parcelable.Creator<FooterButton> {
            @Override // android.os.Parcelable.Creator
            public final FooterButton createFromParcel(Parcel parcel) {
                return new FooterButton(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final FooterButton[] newArray(int i) {
                return new FooterButton[i];
            }
        }

        public FooterButton(String str, TextBlock textBlock, WebAction webAction) {
            super(str, null);
            this.b = str;
            this.c = textBlock;
            this.d = webAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FooterButton)) {
                return false;
            }
            FooterButton footerButton = (FooterButton) obj;
            return epx.f(this.b, footerButton.b) && epx.f(this.c, footerButton.c) && epx.f(this.d, footerButton.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "FooterButton(type=" + this.b + ", title=" + this.c + ", action=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
        }

        public FooterButton(Parcel parcel) {
            this(parcel.readString(), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()));
        }
    }

    /* compiled from: FooterBlock.kt */
    public static final class FooterStack extends FooterBlock {
        public static final a CREATOR = new a();
        public final String b;
        public final TextBlock c;
        public final AvatarStackBlock d;

        /* compiled from: FooterBlock.kt */
        public static final class a implements Parcelable.Creator<FooterStack> {
            @Override // android.os.Parcelable.Creator
            public final FooterStack createFromParcel(Parcel parcel) {
                return new FooterStack(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final FooterStack[] newArray(int i) {
                return new FooterStack[i];
            }
        }

        public FooterStack(String str, TextBlock textBlock, AvatarStackBlock avatarStackBlock) {
            super(str, null);
            this.b = str;
            this.c = textBlock;
            this.d = avatarStackBlock;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FooterStack)) {
                return false;
            }
            FooterStack footerStack = (FooterStack) obj;
            return epx.f(this.b, footerStack.b) && epx.f(this.c, footerStack.c) && epx.f(this.d, footerStack.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "FooterStack(type=" + this.b + ", description=" + this.c + ", avatarStackBlock=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
        }

        public FooterStack(Parcel parcel) {
            this(parcel.readString(), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (AvatarStackBlock) parcel.readParcelable(AvatarStackBlock.class.getClassLoader()));
        }
    }

    /* compiled from: FooterBlock.kt */
    public static final class FooterTextButton extends FooterBlock {
        public static final a CREATOR = new a();
        public final String b;
        public final TextBlock c;
        public final ButtonBlock d;

        /* compiled from: FooterBlock.kt */
        public static final class a implements Parcelable.Creator<FooterTextButton> {
            @Override // android.os.Parcelable.Creator
            public final FooterTextButton createFromParcel(Parcel parcel) {
                return new FooterTextButton(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final FooterTextButton[] newArray(int i) {
                return new FooterTextButton[i];
            }
        }

        public FooterTextButton(String str, TextBlock textBlock, ButtonBlock buttonBlock) {
            super(str, null);
            this.b = str;
            this.c = textBlock;
            this.d = buttonBlock;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FooterTextButton)) {
                return false;
            }
            FooterTextButton footerTextButton = (FooterTextButton) obj;
            return epx.f(this.b, footerTextButton.b) && epx.f(this.c, footerTextButton.c) && epx.f(this.d, footerTextButton.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "FooterTextButton(type=" + this.b + ", description=" + this.c + ", button=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public FooterTextButton(Parcel parcel) {
            this(r0 == null ? "" : r0, (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (ButtonBlock) parcel.readParcelable(ButtonBlock.class.getClassLoader()));
            String readString = parcel.readString();
        }
    }
}
