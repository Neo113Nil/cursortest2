package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.c5g;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StickersDictionaryItem.kt */
/* loaded from: classes18.dex */
public final class StickersDictionaryItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersDictionaryItem> CREATOR = new a();
    public final List<String> b;
    public final List<StickerItem> c;
    public final List<StickerItem> d;
    public final List<PackPreviewItem> e;
    public final boolean f;
    public String g;
    public StickerItem h;
    public boolean i;
    public QuickSuggestCollectionType j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StickersDictionaryItem.kt */
    public static final class QuickSuggestCollectionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ QuickSuggestCollectionType[] $VALUES;
        public static final QuickSuggestCollectionType CLIPS;
        public static final QuickSuggestCollectionType POSTS;

        static {
            QuickSuggestCollectionType quickSuggestCollectionType = new QuickSuggestCollectionType("CLIPS", 0);
            CLIPS = quickSuggestCollectionType;
            QuickSuggestCollectionType quickSuggestCollectionType2 = new QuickSuggestCollectionType("POSTS", 1);
            POSTS = quickSuggestCollectionType2;
            QuickSuggestCollectionType[] quickSuggestCollectionTypeArr = {quickSuggestCollectionType, quickSuggestCollectionType2};
            $VALUES = quickSuggestCollectionTypeArr;
            $ENTRIES = new asp(quickSuggestCollectionTypeArr);
        }

        public QuickSuggestCollectionType() {
            throw null;
        }

        public static QuickSuggestCollectionType valueOf(String str) {
            return (QuickSuggestCollectionType) Enum.valueOf(QuickSuggestCollectionType.class, str);
        }

        public static QuickSuggestCollectionType[] values() {
            return (QuickSuggestCollectionType[]) $VALUES.clone();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickersDictionaryItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersDictionaryItem a(Serializer serializer) {
            return new StickersDictionaryItem(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersDictionaryItem[i];
        }
    }

    public StickersDictionaryItem() {
        this(null, null, null, null, false, 31, null);
    }

    public final boolean Ab(int i) {
        List<StickerItem> list = this.c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((StickerItem) it.next()).b == i) {
                    return false;
                }
            }
        }
        List<StickerItem> list2 = this.d;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((StickerItem) it2.next()).b == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.l0(this.b);
        serializer.o0(this.c);
        serializer.o0(this.d);
        serializer.o0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    public final boolean isEmpty() {
        return this.c.isEmpty() && this.d.isEmpty();
    }

    public final StickerItem zb(int i) {
        Object obj;
        Object obj2;
        Iterator<T> it = this.c.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((StickerItem) obj2).b == i) {
                break;
            }
        }
        StickerItem stickerItem = (StickerItem) obj2;
        if (stickerItem != null) {
            return stickerItem;
        }
        Iterator<T> it2 = this.d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((StickerItem) next).b == i) {
                obj = next;
                break;
            }
        }
        return (StickerItem) obj;
    }

    public StickersDictionaryItem(List<String> list, List<StickerItem> list2, List<StickerItem> list3, List<PackPreviewItem> list4, boolean z) {
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StickersDictionaryItem(Serializer serializer, zcl zclVar) {
        this(r1, r2, r3, r4, r7 != null ? r7.booleanValue() : false);
        ?? r2;
        ?? r3;
        ?? r4;
        ArrayList<String> h = serializer.h();
        ArrayList arrayList = new ArrayList(c5g.u(h, 10));
        Iterator<String> it = h.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        ArrayList j = serializer.j(StickerItem.CREATOR);
        if (j != null) {
            r2 = new ArrayList(c5g.u(j, 10));
            Iterator it2 = j.iterator();
            while (it2.hasNext()) {
                r2.add((StickerItem) it2.next());
            }
        } else {
            r2 = EmptyList.b;
        }
        ArrayList j2 = serializer.j(StickerItem.CREATOR);
        if (j2 != null) {
            r3 = new ArrayList(c5g.u(j2, 10));
            Iterator it3 = j2.iterator();
            while (it3.hasNext()) {
                r3.add((StickerItem) it3.next());
            }
        } else {
            r3 = EmptyList.b;
        }
        ArrayList j3 = serializer.j(PackPreviewItem.CREATOR);
        if (j3 != null) {
            r4 = new ArrayList(c5g.u(j3, 10));
            Iterator it4 = j3.iterator();
            while (it4.hasNext()) {
                r4.add((PackPreviewItem) it4.next());
            }
        } else {
            r4 = EmptyList.b;
        }
        Boolean n = serializer.n();
    }

    public StickersDictionaryItem(List list, List list2, List list3, List list4, boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? EmptyList.b : list2, (i & 4) != 0 ? EmptyList.b : list3, (i & 8) != 0 ? EmptyList.b : list4, (i & 16) != 0 ? false : z);
    }
}
