package com.vk.im.engine.models.dialogs;

import android.util.SparseIntArray;
import com.vk.core.serialize.Serializer;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;

/* compiled from: DialogTheme.kt */
/* loaded from: classes2.dex */
public final class DialogThemeImpl extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<DialogThemeImpl> CREATOR = new a();
    public final SparseIntArray b;
    public final List<BubbleColors> c;
    public final List<BubbleColors> d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DialogThemeImpl> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DialogThemeImpl a(Serializer serializer) {
            try {
                int u = serializer.u();
                SparseIntArray sparseIntArray = new SparseIntArray();
                if (u >= 0) {
                    for (int i = 0; i < u; i++) {
                        sparseIntArray.append(serializer.u(), serializer.u());
                    }
                }
                Serializer.c<BubbleColors> cVar = BubbleColors.CREATOR;
                return new DialogThemeImpl(sparseIntArray, serializer.j(cVar), serializer.j(cVar));
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DialogThemeImpl[i];
        }
    }

    public DialogThemeImpl(SparseIntArray sparseIntArray, List<BubbleColors> list, List<BubbleColors> list2) {
        this.b = sparseIntArray;
        this.c = list;
        this.d = list2;
    }

    public final BubbleColors Ab(long j, boolean z) {
        if (z) {
            return this.c.get((int) (j % r5.size()));
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return this.d.get((int) (j % r5.size()));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        SparseIntArray sparseIntArray = this.b;
        if (sparseIntArray == null) {
            serializer.S(-1);
        } else {
            serializer.S(sparseIntArray.size());
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                serializer.S(sparseIntArray.keyAt(i));
                serializer.S(sparseIntArray.valueAt(i));
            }
        }
        serializer.o0(this.c);
        serializer.o0(this.d);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!DialogThemeImpl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        DialogThemeImpl dialogThemeImpl = (DialogThemeImpl) obj;
        SparseIntArray sparseIntArray = dialogThemeImpl.b;
        if (sparseIntArray != null) {
            SparseIntArray sparseIntArray2 = this.b;
            if (sparseIntArray2.size() == sparseIntArray.size()) {
                int size = sparseIntArray2.size();
                z = true;
                for (int i = 0; i < size; i++) {
                    if (sparseIntArray.get(sparseIntArray2.keyAt(i)) != sparseIntArray2.valueAt(i)) {
                        z = false;
                    }
                }
                return !z && epx.f(this.c, dialogThemeImpl.c) && epx.f(this.d, dialogThemeImpl.d);
            }
        }
        z = false;
        if (z) {
            return false;
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogThemeImpl(colors=");
        sb.append(this.b);
        sb.append(", inContent=");
        sb.append(this.c);
        sb.append(", outContent=");
        return ms9.a(')', sb, this.d);
    }

    public final Integer zb(int i) {
        SparseIntArray sparseIntArray = this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return Integer.valueOf(sparseIntArray.valueAt(indexOfKey));
        }
        return null;
    }
}
