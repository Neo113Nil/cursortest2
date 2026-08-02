package com.vk.gallerypicker.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GalleryPickerSourceConfiguration.kt */
/* loaded from: classes16.dex */
public final class GalleryPickerSourceConfiguration implements Parcelable {
    public static final Parcelable.Creator<GalleryPickerSourceConfiguration> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final EntryPoint d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final SpoilerConfiguration j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GalleryPickerSourceConfiguration.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint ALBUM;
        public static final EntryPoint IM;
        public static final EntryPoint PHOTO_FLOW;
        public static final EntryPoint STORY;

        static {
            EntryPoint entryPoint = new EntryPoint("PHOTO_FLOW", 0);
            PHOTO_FLOW = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("ALBUM", 1);
            ALBUM = entryPoint2;
            EntryPoint entryPoint3 = new EntryPoint("IM", 2);
            IM = entryPoint3;
            EntryPoint entryPoint4 = new EntryPoint("STORY", 3);
            STORY = entryPoint4;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2, entryPoint3, entryPoint4};
            $VALUES = entryPointArr;
            $ENTRIES = new asp(entryPointArr);
        }

        public EntryPoint() {
            throw null;
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* compiled from: GalleryPickerSourceConfiguration.kt */
    public static final class a implements Parcelable.Creator<GalleryPickerSourceConfiguration> {
        @Override // android.os.Parcelable.Creator
        public final GalleryPickerSourceConfiguration createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            EntryPoint entryPoint;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7 = false;
            boolean z8 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z7 = true;
            } else {
                z = false;
            }
            EntryPoint valueOf = parcel.readInt() == 0 ? null : EntryPoint.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z2 = z;
                z = true;
            } else {
                z2 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
                entryPoint = valueOf;
                z4 = true;
            } else {
                z3 = true;
                entryPoint = valueOf;
                z4 = z2;
            }
            if (parcel.readInt() != 0) {
                z5 = z2;
                z2 = z3;
            } else {
                z5 = z2;
            }
            if (parcel.readInt() != 0) {
                z6 = z3;
            } else {
                z6 = z3;
                z3 = z5;
            }
            if (parcel.readInt() != 0) {
                z5 = z6;
            }
            return new GalleryPickerSourceConfiguration(z8, z7, entryPoint, z, z4, z2, z3, z5, SpoilerConfiguration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryPickerSourceConfiguration[] newArray(int i) {
            return new GalleryPickerSourceConfiguration[i];
        }
    }

    public GalleryPickerSourceConfiguration() {
        this(false, false, null, false, false, false, false, false, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryPickerSourceConfiguration)) {
            return false;
        }
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = (GalleryPickerSourceConfiguration) obj;
        return this.b == galleryPickerSourceConfiguration.b && this.c == galleryPickerSourceConfiguration.c && this.d == galleryPickerSourceConfiguration.d && this.e == galleryPickerSourceConfiguration.e && this.f == galleryPickerSourceConfiguration.f && this.g == galleryPickerSourceConfiguration.g && this.h == galleryPickerSourceConfiguration.h && this.i == galleryPickerSourceConfiguration.i && epx.f(this.j, galleryPickerSourceConfiguration.j);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        EntryPoint entryPoint = this.d;
        return this.j.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((b + (entryPoint == null ? 0 : entryPoint.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        return "GalleryPickerSourceConfiguration(isPhotoFlowRedesign=" + this.b + ", isPhotoEditorEntryPointsRedesign=" + this.c + ", entryPoint=" + this.d + ", isStoryPickerRedesign=" + this.e + ", isClipsTemplateEditor=" + this.f + ", isForceDarkTheme=" + this.g + ", isClipsNewPicker=" + this.h + ", isStoryNewPicker=" + this.i + ", spoilerConfiguration=" + this.j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        EntryPoint entryPoint = this.d;
        if (entryPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(entryPoint.name());
        }
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        this.j.writeToParcel(parcel, i);
    }

    public GalleryPickerSourceConfiguration(boolean z, boolean z2, EntryPoint entryPoint, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, SpoilerConfiguration spoilerConfiguration) {
        this.b = z;
        this.c = z2;
        this.d = entryPoint;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = spoilerConfiguration;
    }

    public /* synthetic */ GalleryPickerSourceConfiguration(boolean z, boolean z2, EntryPoint entryPoint, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, SpoilerConfiguration spoilerConfiguration, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : entryPoint, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6, (i & 128) == 0 ? z7 : false, (i & 256) != 0 ? new SpoilerConfiguration(false, false, false, false, false, null, 63, null) : spoilerConfiguration);
    }
}
