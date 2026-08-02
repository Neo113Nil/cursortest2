package com.vk.dto.masks;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MasksCatalogItem.kt */
/* loaded from: classes18.dex */
public final class MasksCatalogItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MasksCatalogItem> CREATOR = new a();
    public final MaskSection b;
    public final ArrayList<Mask> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MasksCatalogItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MasksCatalogItem a(Serializer serializer) {
            return new MasksCatalogItem((MaskSection) serializer.G(MaskSection.class.getClassLoader()), serializer.j(Mask.CREATOR));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MasksCatalogItem[i];
        }
    }

    public MasksCatalogItem(MaskSection maskSection, ArrayList<Mask> arrayList) {
        this.b = maskSection;
        this.c = arrayList;
    }

    public final ArrayList<Mask> Ab() {
        return this.c;
    }

    public final MaskSection Bb() {
        return this.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.o0(this.c);
    }

    public final MasksCatalogItem zb() {
        ArrayList<Mask> arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList != null ? arrayList.size() : 0);
        ArrayList<Mask> arrayList3 = this.c;
        if (arrayList3 != null) {
            Iterator<T> it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Mask) it.next()).zb());
            }
        }
        MaskSection maskSection = this.b;
        return new MasksCatalogItem(new MaskSection(maskSection.b, maskSection.c, maskSection.d, maskSection.e, maskSection.f), arrayList2);
    }
}
