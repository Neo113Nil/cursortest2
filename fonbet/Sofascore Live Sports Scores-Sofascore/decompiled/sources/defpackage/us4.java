package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.c;
import androidx.fragment.app.s;
import androidx.fragment.app.y;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class us4 implements Animation.AnimationListener {
    public final /* synthetic */ y a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ c d;

    public us4(y yVar, ViewGroup viewGroup, View view, c cVar) {
        this.a = yVar;
        this.b = viewGroup;
        this.c = view;
        this.d = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.post(new p3(viewGroup, this.c, this.d));
        if (s.O(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (s.O(2)) {
            Objects.toString(this.a);
        }
    }
}
