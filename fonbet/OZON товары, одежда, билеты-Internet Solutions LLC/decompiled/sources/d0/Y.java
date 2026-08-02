package d0;

import android.util.Range;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public interface Y {
    @NonNull
    Range<Integer> a(int i11);

    default boolean b(int i11, int i12) {
        if (i(i11, i12)) {
            return true;
        }
        return g() && i(i12, i11);
    }

    @NonNull
    Range<Integer> c();

    @NonNull
    Range<Integer> d(int i11);

    @NonNull
    Range<Integer> e();

    @NonNull
    Range<Integer> f();

    boolean g();

    int h();

    boolean i(int i11, int i12);

    int j();
}
