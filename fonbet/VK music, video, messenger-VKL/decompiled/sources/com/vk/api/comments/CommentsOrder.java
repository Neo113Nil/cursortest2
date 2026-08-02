package com.vk.api.comments;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;

/* compiled from: CommentsOrder.kt */
/* loaded from: classes14.dex */
public final class CommentsOrder extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CommentsOrder> CREATOR = new a();
    public String b;
    public final List<Item> c;

    /* compiled from: CommentsOrder.kt */
    public static final class Item extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Item> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Item> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Item a(Serializer serializer) {
                return new Item(serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return epx.f(this.b, item.b) && epx.f(this.c, item.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(id=");
            sb.append(this.b);
            sb.append(", name=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CommentsOrder> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CommentsOrder a(Serializer serializer) {
            return new CommentsOrder(serializer.H(), serializer.j(Item.CREATOR));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommentsOrder[i];
        }
    }

    public CommentsOrder(String str, List<Item> list) {
        this.b = str;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.o0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentsOrder)) {
            return false;
        }
        CommentsOrder commentsOrder = (CommentsOrder) obj;
        return epx.f(this.b, commentsOrder.b) && epx.f(this.c, commentsOrder.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentsOrder(currentOrder=");
        sb.append(this.b);
        sb.append(", items=");
        return ms9.a(')', sb, this.c);
    }
}
