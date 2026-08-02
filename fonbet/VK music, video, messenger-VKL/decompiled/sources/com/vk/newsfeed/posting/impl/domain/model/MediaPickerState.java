package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.shy;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MediaPickerState.kt */
/* loaded from: classes4.dex */
public final class MediaPickerState implements Parcelable {
    public static final Parcelable.Creator<MediaPickerState> CREATOR = new a();
    public static final MediaPickerState k;
    public final com.vk.newsfeed.posting.impl.domain.model.a b;
    public final List<LocalAlbum> c;
    public final int d;
    public final List<MediaPickerSelectedItem> e;
    public final List<LocalMediaEntry> f;
    public final SheetState g;
    public final SheetState h;
    public final Boolean i;
    public final Boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaPickerState.kt */
    public static final class SheetState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SheetState[] $VALUES;
        public static final SheetState Collapsed;
        public static final SheetState Expanded;
        public static final SheetState Hidden;

        static {
            SheetState sheetState = new SheetState("Hidden", 0);
            Hidden = sheetState;
            SheetState sheetState2 = new SheetState("Collapsed", 1);
            Collapsed = sheetState2;
            SheetState sheetState3 = new SheetState("Expanded", 2);
            Expanded = sheetState3;
            SheetState[] sheetStateArr = {sheetState, sheetState2, sheetState3};
            $VALUES = sheetStateArr;
            $ENTRIES = new asp(sheetStateArr);
        }

        public SheetState() {
            throw null;
        }

        public static SheetState valueOf(String str) {
            return (SheetState) Enum.valueOf(SheetState.class, str);
        }

        public static SheetState[] values() {
            return (SheetState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaPickerState.kt */
    public static final class Tab {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Tab[] $VALUES;
        public static final Tab LocalAlbum;
        public static final Tab PhotoVk;
        public static final Tab VideoVk;

        /* compiled from: MediaPickerState.kt */
        public static final class a extends Tab {
            public a() {
                super("LocalAlbum", 0);
            }

            @Override // com.vk.newsfeed.posting.impl.domain.model.MediaPickerState.Tab
            public final long a(UserId userId) {
                return super.a(UserId.d);
            }
        }

        static {
            a aVar = new a();
            LocalAlbum = aVar;
            Tab tab = new Tab("PhotoVk", 1);
            PhotoVk = tab;
            Tab tab2 = new Tab("VideoVk", 2);
            VideoVk = tab2;
            Tab[] tabArr = {aVar, tab, tab2};
            $VALUES = tabArr;
            $ENTRIES = new asp(tabArr);
        }

        public Tab() {
            throw null;
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) $VALUES.clone();
        }

        public long a(UserId userId) {
            return (name().hashCode() * 37) + (userId != null ? Long.hashCode(userId.b) : -1L);
        }
    }

    /* compiled from: MediaPickerState.kt */
    public static final class a implements Parcelable.Creator<MediaPickerState> {
        @Override // android.os.Parcelable.Creator
        public final MediaPickerState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(LocalAlbum.CREATOR, parcel, arrayList2, i2, 1);
                }
                arrayList = arrayList2;
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = bo.b(MediaPickerState.class, parcel, arrayList3, i, 1);
            }
            return new MediaPickerState(null, arrayList, readInt2, arrayList3, null, parcel.readInt() == 0 ? null : SheetState.valueOf(parcel.readString()), parcel.readInt() != 0 ? SheetState.valueOf(parcel.readString()) : null, null, null, 401, null);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaPickerState[] newArray(int i) {
            return new MediaPickerState[i];
        }
    }

    static {
        a.d dVar = a.d.a;
        EmptyList emptyList = EmptyList.b;
        k = new MediaPickerState(dVar, null, 0, emptyList, emptyList, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaPickerState(com.vk.newsfeed.posting.impl.domain.model.a aVar, List<LocalAlbum> list, int i, List<? extends MediaPickerSelectedItem> list2, List<? extends LocalMediaEntry> list3, SheetState sheetState, SheetState sheetState2, Boolean bool, Boolean bool2) {
        this.b = aVar;
        this.c = list;
        this.d = i;
        this.e = list2;
        this.f = list3;
        this.g = sheetState;
        this.h = sheetState2;
        this.i = bool;
        this.j = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MediaPickerState a(MediaPickerState mediaPickerState, com.vk.newsfeed.posting.impl.domain.model.a aVar, ArrayList arrayList, int i, AbstractList abstractList, List list, SheetState sheetState, SheetState sheetState2, Boolean bool, Boolean bool2, int i2) {
        if ((i2 & 1) != 0) {
            aVar = mediaPickerState.b;
        }
        com.vk.newsfeed.posting.impl.domain.model.a aVar2 = aVar;
        List list2 = arrayList;
        if ((i2 & 2) != 0) {
            list2 = mediaPickerState.c;
        }
        List list3 = list2;
        if ((i2 & 4) != 0) {
            i = mediaPickerState.d;
        }
        int i3 = i;
        List list4 = abstractList;
        if ((i2 & 8) != 0) {
            list4 = mediaPickerState.e;
        }
        List list5 = list4;
        if ((i2 & 16) != 0) {
            list = mediaPickerState.f;
        }
        List list6 = list;
        SheetState sheetState3 = (i2 & 32) != 0 ? mediaPickerState.g : sheetState;
        SheetState sheetState4 = (i2 & 64) != 0 ? mediaPickerState.h : sheetState2;
        Boolean bool3 = (i2 & 128) != 0 ? mediaPickerState.i : bool;
        Boolean bool4 = (i2 & 256) != 0 ? mediaPickerState.j : bool2;
        mediaPickerState.getClass();
        return new MediaPickerState(aVar2, list3, i3, list5, list6, sheetState3, sheetState4, bool3, bool4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPickerState)) {
            return false;
        }
        MediaPickerState mediaPickerState = (MediaPickerState) obj;
        return epx.f(this.b, mediaPickerState.b) && epx.f(this.c, mediaPickerState.c) && this.d == mediaPickerState.d && epx.f(this.e, mediaPickerState.e) && epx.f(this.f, mediaPickerState.f) && this.g == mediaPickerState.g && this.h == mediaPickerState.h && epx.f(this.i, mediaPickerState.i) && epx.f(this.j, mediaPickerState.j);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List<LocalAlbum> list = this.c;
        int a2 = fw3.a(fw3.a(shy.a(this.d, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.e), 31, this.f);
        SheetState sheetState = this.g;
        int hashCode2 = (a2 + (sheetState == null ? 0 : sheetState.hashCode())) * 31;
        SheetState sheetState2 = this.h;
        int hashCode3 = (hashCode2 + (sheetState2 == null ? 0 : sheetState2.hashCode())) * 31;
        Boolean bool = this.i;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.j;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaPickerState(localMediaPagingState=");
        sb.append(this.b);
        sb.append(", localAlbums=");
        sb.append(this.c);
        sb.append(", selectedLocalAlbumId=");
        sb.append(this.d);
        sb.append(", selectedItems=");
        sb.append(this.e);
        sb.append(", loadedLocalItems=");
        sb.append(this.f);
        sb.append(", nextSheetState=");
        sb.append(this.g);
        sb.append(", currentSheetState=");
        sb.append(this.h);
        sb.append(", canAccessGallery=");
        sb.append(this.i);
        sb.append(", canAccessCamera=");
        return tn.a(sb, this.j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<LocalAlbum> list = this.c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((LocalAlbum) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.d);
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        SheetState sheetState = this.g;
        if (sheetState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sheetState.name());
        }
        SheetState sheetState2 = this.h;
        if (sheetState2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sheetState2.name());
        }
    }

    public MediaPickerState(com.vk.newsfeed.posting.impl.domain.model.a aVar, List list, int i, List list2, List list3, SheetState sheetState, SheetState sheetState2, Boolean bool, Boolean bool2, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? a.d.a : aVar, list, i, list2, (i2 & 16) != 0 ? EmptyList.b : list3, sheetState, sheetState2, bool, bool2);
    }
}
