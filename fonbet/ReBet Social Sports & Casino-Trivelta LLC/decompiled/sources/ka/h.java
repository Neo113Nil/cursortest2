package ka;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.react.uimanager.ViewProps;
import xa.l;

/* loaded from: classes3.dex */
public abstract class h {
    private static final int[] STATE_LIST_ANIM_ATTRS = {R.attr.stateListAnimator};

    public static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void b(View view, float f10) {
        int integer = view.getResources().getInteger(ia.h.f48461a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, ia.c.f48257r0, -ia.c.f48259s0}, ObjectAnimator.ofFloat(view, ViewProps.ELEVATION, 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, ViewProps.ELEVATION, f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, ViewProps.ELEVATION, 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void c(View view, AttributeSet attributeSet, int i10, int i11) {
        Context context = view.getContext();
        TypedArray i12 = l.i(context, attributeSet, STATE_LIST_ANIM_ATTRS, i10, i11, new int[0]);
        try {
            if (i12.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, i12.getResourceId(0, 0)));
            }
            i12.recycle();
        } catch (Throwable th2) {
            i12.recycle();
            throw th2;
        }
    }
}
