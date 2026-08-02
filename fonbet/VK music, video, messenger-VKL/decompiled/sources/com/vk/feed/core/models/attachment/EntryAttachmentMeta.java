package com.vk.feed.core.models.attachment;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.zrp;

/* compiled from: EntryAttachmentMeta.kt */
/* loaded from: classes18.dex */
public final class EntryAttachmentMeta implements Serializer.StreamParcelable {
    public static final Serializer.c<EntryAttachmentMeta> CREATOR = new a();
    public final Layout b;
    public final boolean c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EntryAttachmentMeta.kt */
    public static final class Layout {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Layout[] $VALUES;
        public static final Layout ROUNDED;
        public static final Layout WIDE;

        static {
            Layout layout = new Layout("ROUNDED", 0);
            ROUNDED = layout;
            Layout layout2 = new Layout("WIDE", 1);
            WIDE = layout2;
            Layout[] layoutArr = {layout, layout2};
            $VALUES = layoutArr;
            $ENTRIES = new asp(layoutArr);
        }

        public Layout() {
            throw null;
        }

        public static Layout valueOf(String str) {
            return (Layout) Enum.valueOf(Layout.class, str);
        }

        public static Layout[] values() {
            return (Layout[]) $VALUES.clone();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<EntryAttachmentMeta> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EntryAttachmentMeta a(Serializer serializer) {
            return new EntryAttachmentMeta((Layout) serializer.C(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntryAttachmentMeta[i];
        }
    }

    public EntryAttachmentMeta(Layout layout, boolean z) {
        this.b = layout;
        this.c = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
