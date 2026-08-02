package A5;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2094j0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import u5.C6523d;

/* loaded from: classes2.dex */
public abstract class G {
    public static final List c(ViewGroup viewGroup) {
        return SequencesKt.toList(SequencesKt.map(AbstractC2094j0.a(viewGroup), new Function1() { // from class: A5.F
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y5.d d10;
                d10 = G.d((View) obj);
                return d10;
            }
        }));
    }

    public static final y5.d d(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return v5.g.f67034a.h(child, C6523d.f66138a.i());
    }
}
