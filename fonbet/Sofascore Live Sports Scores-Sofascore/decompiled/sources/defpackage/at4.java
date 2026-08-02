package defpackage;

import android.transition.Transition;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.y;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class at4 extends f {
    public final Object b;
    public final boolean c;
    public final Object d;

    public at4(y yVar, boolean z, boolean z2) {
        super(yVar);
        Fragment fragment = yVar.c;
        this.b = yVar.a == 2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.c = yVar.a == 2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.d = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    public final mq8 b() {
        Object obj = this.b;
        mq8 c = c(obj);
        Object obj2 = this.d;
        mq8 c2 = c(obj2);
        if (c == null || c2 == null || c == c2) {
            return c == null ? c2 : c;
        }
        i3c.l("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", this.a.c, " returned Transition ", obj, " which uses a different Transition  type than its shared element transition ", obj2);
        return null;
    }

    public final mq8 c(Object obj) {
        if (obj == null) {
            return null;
        }
        lq8 lq8Var = gq8.a;
        if (obj instanceof Transition) {
            return lq8Var;
        }
        mq8 mq8Var = gq8.b;
        if (mq8Var != null && mq8Var.g(obj)) {
            return mq8Var;
        }
        StringBuilder sb = new StringBuilder("Transition ");
        sb.append(obj);
        Fragment fragment = this.a.c;
        sb.append(" for fragment ");
        sb.append(fragment);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }
}
