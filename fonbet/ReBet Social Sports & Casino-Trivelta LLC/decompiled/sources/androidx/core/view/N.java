package androidx.core.view;

import android.content.Context;
import android.view.PointerIcon;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final PointerIcon f19170a;

    public static class a {
        public static PointerIcon a(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }
    }

    public N(PointerIcon pointerIcon) {
        this.f19170a = pointerIcon;
    }

    public static N b(Context context, int i10) {
        return new N(a.a(context, i10));
    }

    public Object a() {
        return this.f19170a;
    }
}
