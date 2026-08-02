package com.vk.core.fragments.internal.stack;

import com.vk.core.fragments.FragmentEntry;
import com.vk.core.serialize.Serializer;
import java.util.LinkedList;
import xsna.j5g;
import xsna.zcl;

/* compiled from: FStack.kt */
/* loaded from: classes.dex */
public final class FStack extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<FStack> CREATOR = new a();
    public final FragmentEntry b;
    public final LinkedList<FragmentEntry> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FStack> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FStack a(Serializer serializer) {
            return new FStack((FragmentEntry) serializer.G(FragmentEntry.class.getClassLoader()), new LinkedList(serializer.l(FragmentEntry.class.getClassLoader())), null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FStack[i];
        }
    }

    public /* synthetic */ FStack(FragmentEntry fragmentEntry, LinkedList linkedList, zcl zclVar) {
        this(fragmentEntry, linkedList);
    }

    public final FragmentEntry Ab() {
        LinkedList<FragmentEntry> linkedList = this.c;
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList.removeLast();
    }

    public final void Bb(FragmentEntry fragmentEntry) {
        this.c.add(fragmentEntry);
    }

    public final FragmentEntry Cb() {
        return (FragmentEntry) j5g.k0(this.c);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.W(this.c);
    }

    public final String toString() {
        return "FStack{rootName=" + this.b.b.getName() + ", size=" + this.c.size() + '}';
    }

    public final LinkedList zb() {
        return new LinkedList(this.c);
    }

    public FStack(FragmentEntry fragmentEntry) {
        this(fragmentEntry, new LinkedList());
    }

    public FStack(FragmentEntry fragmentEntry, LinkedList<FragmentEntry> linkedList) {
        this.b = fragmentEntry;
        this.c = linkedList;
    }
}
