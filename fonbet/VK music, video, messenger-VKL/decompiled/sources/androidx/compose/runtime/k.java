package androidx.compose.runtime;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import xsna.abk0;
import xsna.k0x;
import xsna.wh50;

/* loaded from: classes.dex */
public final class k {
    public static final <T> wh50<T> a(T t, abk0<T> abk0Var) {
        return new ParcelableSnapshotMutableState(t, abk0Var);
    }

    public static wh50 b(Object obj) {
        return new ParcelableSnapshotMutableState(obj, k0x.c);
    }

    public static final wh50 c(Object obj, a aVar, int i) {
        if (b.d()) {
            b.f(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:340)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = b(obj);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        wh50Var.setValue(obj);
        if (b.d()) {
            b.e();
        }
        return wh50Var;
    }

    public static final <T> SnapshotStateList<T> d(Collection<? extends T> collection) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }
}
