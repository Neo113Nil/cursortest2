package Lc;

import android.view.View;
import androidx.core.view.F0;
import androidx.core.view.J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements J {

    /* renamed from: a, reason: collision with root package name */
    public final List f7141a = new ArrayList();

    public final void a(J listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f7141a.add(listener);
    }

    @Override // androidx.core.view.J
    public F0 f(View v10, F0 insets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Iterator it = this.f7141a.iterator();
        while (it.hasNext()) {
            ((J) it.next()).f(v10, insets);
        }
        return insets;
    }
}
