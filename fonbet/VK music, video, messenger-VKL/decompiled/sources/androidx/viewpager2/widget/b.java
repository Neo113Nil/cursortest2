package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CompositePageTransformer.java */
/* loaded from: classes12.dex */
public final class b implements ViewPager2.i {
    public final ArrayList a = new ArrayList();

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void transformPage(@NonNull View view, float f) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ViewPager2.i) it.next()).transformPage(view, f);
        }
    }
}
