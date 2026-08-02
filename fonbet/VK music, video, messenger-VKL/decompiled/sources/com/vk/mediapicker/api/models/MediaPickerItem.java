package com.vk.mediapicker.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.mediastore.system.MediaStoreEntry;
import defpackage.q0;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: MediaPickerItem.kt */
/* loaded from: classes3.dex */
public abstract class MediaPickerItem implements Parcelable {

    /* compiled from: MediaPickerItem.kt */
    public static final class CameraItem extends MediaPickerItem {
        public static final Parcelable.Creator<CameraItem> CREATOR = new a();
        public final boolean b;

        /* compiled from: MediaPickerItem.kt */
        public static final class a implements Parcelable.Creator<CameraItem> {
            @Override // android.os.Parcelable.Creator
            public final CameraItem createFromParcel(Parcel parcel) {
                return new CameraItem(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final CameraItem[] newArray(int i) {
                return new CameraItem[i];
            }
        }

        public CameraItem() {
            this(false, 1, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CameraItem) && this.b == ((CameraItem) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("CameraItem(isEnabled="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }

        public /* synthetic */ CameraItem(boolean z, int i, zcl zclVar) {
            this((i & 1) != 0 ? true : z);
        }

        public CameraItem(boolean z) {
            super(null);
            this.b = z;
        }
    }

    /* compiled from: MediaPickerItem.kt */
    public static final class ImageItem extends MediaPickerItem {
        public static final Parcelable.Creator<ImageItem> CREATOR = new a();
        public final MediaStoreEntry b;
        public final String c;
        public final SelectedState d;

        /* compiled from: MediaPickerItem.kt */
        public static abstract class SelectedState implements Parcelable {

            /* compiled from: MediaPickerItem.kt */
            public static final class Checked extends SelectedState {
                public static final Checked b = new Checked(null);
                public static final Parcelable.Creator<Checked> CREATOR = new a();

                /* compiled from: MediaPickerItem.kt */
                public static final class a implements Parcelable.Creator<Checked> {
                    @Override // android.os.Parcelable.Creator
                    public final Checked createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Checked.b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Checked[] newArray(int i) {
                        return new Checked[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Checked);
                }

                public final int hashCode() {
                    return -1202156322;
                }

                public final String toString() {
                    return "Checked";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: MediaPickerItem.kt */
            public static final class Counted extends SelectedState {
                public static final Parcelable.Creator<Counted> CREATOR = new a();
                public final int b;

                /* compiled from: MediaPickerItem.kt */
                public static final class a implements Parcelable.Creator<Counted> {
                    @Override // android.os.Parcelable.Creator
                    public final Counted createFromParcel(Parcel parcel) {
                        return new Counted(parcel.readInt());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Counted[] newArray(int i) {
                        return new Counted[i];
                    }
                }

                public Counted(int i) {
                    super(null);
                    this.b = i;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Counted) && this.b == ((Counted) obj).b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("Counted(value="), this.b, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(this.b);
                }
            }

            /* compiled from: MediaPickerItem.kt */
            public static final class Disabled extends SelectedState {
                public static final Disabled b = new Disabled(null);
                public static final Parcelable.Creator<Disabled> CREATOR = new a();

                /* compiled from: MediaPickerItem.kt */
                public static final class a implements Parcelable.Creator<Disabled> {
                    @Override // android.os.Parcelable.Creator
                    public final Disabled createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Disabled.b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Disabled[] newArray(int i) {
                        return new Disabled[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Disabled);
                }

                public final int hashCode() {
                    return 121906213;
                }

                public final String toString() {
                    return "Disabled";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: MediaPickerItem.kt */
            public static final class NotSelected extends SelectedState {
                public static final NotSelected b = new NotSelected(null);
                public static final Parcelable.Creator<NotSelected> CREATOR = new a();

                /* compiled from: MediaPickerItem.kt */
                public static final class a implements Parcelable.Creator<NotSelected> {
                    @Override // android.os.Parcelable.Creator
                    public final NotSelected createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return NotSelected.b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final NotSelected[] newArray(int i) {
                        return new NotSelected[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof NotSelected);
                }

                public final int hashCode() {
                    return -1577465787;
                }

                public final String toString() {
                    return "NotSelected";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(1);
                }
            }

            public /* synthetic */ SelectedState(zcl zclVar) {
                this();
            }

            public SelectedState() {
            }
        }

        /* compiled from: MediaPickerItem.kt */
        public static final class a implements Parcelable.Creator<ImageItem> {
            @Override // android.os.Parcelable.Creator
            public final ImageItem createFromParcel(Parcel parcel) {
                return new ImageItem((MediaStoreEntry) parcel.readParcelable(ImageItem.class.getClassLoader()), parcel.readString(), (SelectedState) parcel.readParcelable(ImageItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ImageItem[] newArray(int i) {
                return new ImageItem[i];
            }
        }

        public ImageItem(MediaStoreEntry mediaStoreEntry, String str, SelectedState selectedState) {
            super(null);
            this.b = mediaStoreEntry;
            this.c = str;
            this.d = selectedState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageItem)) {
                return false;
            }
            ImageItem imageItem = (ImageItem) obj;
            return epx.f(this.b, imageItem.b) && epx.f(this.c, imageItem.c) && epx.f(this.d, imageItem.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return "ImageItem(mediaStoreEntry=" + this.b + ", contentDescription=" + this.c + ", selectedState=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeParcelable(this.d, i);
        }
    }

    /* compiled from: MediaPickerItem.kt */
    public static final class PartMediaPermissionWarningItem extends MediaPickerItem {
        public static final PartMediaPermissionWarningItem b = new PartMediaPermissionWarningItem(null);
        public static final Parcelable.Creator<PartMediaPermissionWarningItem> CREATOR = new a();

        /* compiled from: MediaPickerItem.kt */
        public static final class a implements Parcelable.Creator<PartMediaPermissionWarningItem> {
            @Override // android.os.Parcelable.Creator
            public final PartMediaPermissionWarningItem createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PartMediaPermissionWarningItem.b;
            }

            @Override // android.os.Parcelable.Creator
            public final PartMediaPermissionWarningItem[] newArray(int i) {
                return new PartMediaPermissionWarningItem[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PartMediaPermissionWarningItem);
        }

        public final int hashCode() {
            return -1756764448;
        }

        public final String toString() {
            return "PartMediaPermissionWarningItem";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ MediaPickerItem(zcl zclVar) {
        this();
    }

    public MediaPickerItem() {
    }
}
