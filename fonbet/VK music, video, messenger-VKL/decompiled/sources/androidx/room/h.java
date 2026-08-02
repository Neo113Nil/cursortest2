package androidx.room;

import androidx.room.e;
import java.util.Collections;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: InvalidationTracker.android.kt */
/* loaded from: classes.dex */
public final class h {
    public final e.a a;
    public final int[] b;
    public final String[] c;
    public final Set<String> d;

    public h(e.a aVar, int[] iArr, String[] strArr) {
        this.a = aVar;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.d = !(strArr.length == 0) ? Collections.singleton(strArr[0]) : EmptySet.b;
    }
}
