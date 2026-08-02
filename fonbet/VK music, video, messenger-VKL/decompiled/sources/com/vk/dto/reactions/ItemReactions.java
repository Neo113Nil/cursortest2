package com.vk.dto.reactions;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import xsna.c2f0;
import xsna.epx;
import xsna.kpl;
import xsna.shy;
import xsna.t33;
import xsna.uqi;

/* compiled from: ItemReactions.kt */
/* loaded from: classes18.dex */
public final class ItemReactions implements Serializer.StreamParcelable {
    public final ArrayList<ItemReaction> b;
    public int c;
    public int d;
    public Integer e;
    public transient ArrayList<ReactionMeta> f;
    public Integer g;
    public transient ArrayList<ReactionMeta> h;
    public transient ReactionMeta i;
    public static final kpl j = new kpl(1);
    public static final Serializer.c<ItemReactions> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ItemReactions> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ItemReactions a(Serializer serializer) {
            ArrayList k = serializer.k(ItemReaction.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new ItemReactions(k, serializer.u(), serializer.u(), serializer.v());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ItemReactions[i];
        }
    }

    public ItemReactions(ArrayList<ItemReaction> arrayList, int i, int i2, Integer num) {
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = num;
    }

    public static ItemReactions a(ItemReactions itemReactions, ArrayList arrayList, int i, Integer num, int i2) {
        if ((i2 & 1) != 0) {
            arrayList = itemReactions.b;
        }
        if ((i2 & 2) != 0) {
            i = itemReactions.c;
        }
        int i3 = itemReactions.d;
        itemReactions.getClass();
        return new ItemReactions(arrayList, i, i3, num);
    }

    public static ArrayList e(ItemReactions itemReactions, int i, ReactionSet reactionSet) {
        ReactionMeta d;
        ArrayList<ReactionMeta> arrayList;
        ArrayList<ItemReaction> arrayList2 = itemReactions.b;
        if (reactionSet == null) {
            return itemReactions.f;
        }
        Integer num = itemReactions.g;
        if (num != null && num.intValue() == i && (arrayList = itemReactions.f) != null) {
            return arrayList;
        }
        int size = arrayList2.size();
        if (i <= size) {
            size = i;
        }
        ArrayList<ReactionMeta> arrayList3 = new ArrayList<>(size);
        int i2 = 0;
        for (int i3 = 0; i2 < size && i3 < arrayList2.size(); i3++) {
            int i4 = arrayList2.get(i3).b;
            if (arrayList2.get(i3).c > 0 && (d = c2f0.d(reactionSet, i4)) != null) {
                arrayList3.add(d);
                i2++;
            }
        }
        itemReactions.f = arrayList3;
        itemReactions.g = Integer.valueOf(i);
        return itemReactions.f;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.V(this.e);
    }

    public final ArrayList<ItemReaction> d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemReactions)) {
            return false;
        }
        ItemReactions itemReactions = (ItemReactions) obj;
        return epx.f(this.b, itemReactions.b) && this.c == itemReactions.c && this.d == itemReactions.d && epx.f(this.e, itemReactions.e);
    }

    public final ReactionMeta f(ReactionSet reactionSet) {
        Integer num = this.e;
        if (num != null) {
            int intValue = num.intValue();
            ReactionMeta reactionMeta = this.i;
            if (reactionMeta != null && reactionMeta.getId() == intValue) {
                return reactionMeta;
            }
            this.i = null;
            if (reactionSet != null) {
                Iterator<ReactionMeta> it = reactionSet.c.iterator();
                while (it.hasNext()) {
                    ReactionMeta next = it.next();
                    if (next.getId() == intValue) {
                        this.i = next;
                        return next;
                    }
                }
            }
        }
        return null;
    }

    public final void g(int i, int i2) {
        ArrayList<ItemReaction> arrayList = this.b;
        Iterator<ItemReaction> it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (it.next().b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0 && i3 < arrayList.size()) {
            ItemReaction itemReaction = arrayList.get(i3);
            if (i2 <= 0) {
                arrayList.remove(i3);
                return;
            } else {
                itemReaction.c = i2;
                Collections.sort(arrayList, j);
                return;
            }
        }
        int size = arrayList.size() - 1;
        while (size >= 0) {
            ItemReaction itemReaction2 = arrayList.get(size);
            int i4 = itemReaction2.c;
            if (i4 > i2 || (i4 == i2 && itemReaction2.b < i)) {
                break;
            } else {
                size--;
            }
        }
        arrayList.add(size + 1, new ItemReaction(i, i2));
    }

    public final int hashCode() {
        int a2 = shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
        Integer num = this.e;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        String str = "[]";
        try {
            str = this.b.toString();
        } catch (Throwable unused) {
        }
        StringBuilder a2 = t33.a("ItemReactions(items=", str, ", count=");
        a2.append(this.c);
        a2.append(", score=");
        a2.append(this.d);
        a2.append(", userReactionId=");
        return uqi.b(a2, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
