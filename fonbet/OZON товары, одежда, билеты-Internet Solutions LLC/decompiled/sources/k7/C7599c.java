package k7;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import k7.C7598b;
import s7.C9613h;

/* renamed from: k7.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7599c {
    @NonNull
    public static SparseArray<C7597a> a(Context context, @NonNull C9613h c9613h) {
        SparseArray<C7597a> sparseArray = new SparseArray<>(c9613h.size());
        for (int i11 = 0; i11 < c9613h.size(); i11++) {
            int keyAt = c9613h.keyAt(i11);
            C7598b.a aVar = (C7598b.a) c9613h.valueAt(i11);
            if (aVar == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(keyAt, C7597a.c(context, aVar));
        }
        return sparseArray;
    }

    @NonNull
    public static C9613h b(@NonNull SparseArray<C7597a> sparseArray) {
        C9613h c9613h = new C9613h();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            int keyAt = sparseArray.keyAt(i11);
            C7597a valueAt = sparseArray.valueAt(i11);
            if (valueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            c9613h.put(keyAt, valueAt.i());
        }
        return c9613h;
    }
}
