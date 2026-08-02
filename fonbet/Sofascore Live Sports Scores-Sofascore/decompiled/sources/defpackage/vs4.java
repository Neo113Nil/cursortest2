package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.fragment.app.s;
import androidx.fragment.app.y;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vs4 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ y d;
    public final /* synthetic */ e e;

    public vs4(ViewGroup viewGroup, View view, boolean z, y yVar, e eVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = yVar;
        this.e = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        y yVar = this.d;
        if (z || yVar.a == 3) {
            int i = yVar.a;
            view.getClass();
            ljg.a(i, view, viewGroup);
        }
        e eVar = this.e;
        eVar.c.a.c(eVar);
        if (s.O(2)) {
            Objects.toString(yVar);
        }
    }
}
