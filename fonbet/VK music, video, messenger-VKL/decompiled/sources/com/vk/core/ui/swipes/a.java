package com.vk.core.ui.swipes;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.swipes.ButtonsSwipeView;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.i1u;
import xsna.iut0;

/* compiled from: SwipeHelper.kt */
/* loaded from: classes17.dex */
public final class a {
    public final float a;
    public ButtonsSwipeView c;
    public final float b = 0.25f;
    public final C0792a d = new C0792a();

    /* compiled from: SwipeHelper.kt */
    /* renamed from: com.vk.core.ui.swipes.a$a, reason: collision with other inner class name */
    public static final class C0792a implements ButtonsSwipeView.a {
        public boolean b;
        public int c;

        public C0792a() {
        }

        @Override // com.vk.core.ui.swipes.ButtonsSwipeView.a
        public final void a(int i, int i2, View view) {
            int i3 = i2 - i;
            if (i3 != 0) {
                this.b = true;
            }
            this.c = Integer.signum(i3);
        }

        @Override // com.vk.core.ui.swipes.ButtonsSwipeView.a
        public final void c() {
            if (this.b) {
                int i = 0;
                this.b = false;
                int i2 = this.c;
                a aVar = a.this;
                ButtonsSwipeView buttonsSwipeView = aVar.c;
                if (buttonsSwipeView == null || buttonsSwipeView.getMeasuredWidth() == 0) {
                    return;
                }
                float f = aVar.b;
                int initialScrollOffset = buttonsSwipeView.getInitialScrollOffset();
                int scrollX = initialScrollOffset - buttonsSwipeView.getScrollX();
                if (scrollX > 0) {
                    i = buttonsSwipeView.getStartMeasuredWidth();
                } else if (scrollX < 0) {
                    i = buttonsSwipeView.getEndMeasuredWidth();
                }
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (i != 0) {
                    float f3 = i;
                    f2 = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.abs(scrollX) - aVar.a), f3) / f3;
                }
                if (scrollX <= 0 ? i2 >= 0 : i2 < 0) {
                    f = 1.0f - f;
                }
                if (f2 >= f) {
                    if (scrollX > 0) {
                        initialScrollOffset = buttonsSwipeView.getMaxStartScrollOffset();
                    } else if (scrollX < 0) {
                        initialScrollOffset = buttonsSwipeView.getMaxEndScrollOffset();
                    }
                }
                i1u i1uVar = new i1u(buttonsSwipeView, initialScrollOffset, 1);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                buttonsSwipeView.postOnAnimation(i1uVar);
            }
        }
    }

    public a(Context context) {
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void a(ButtonsSwipeView buttonsSwipeView) {
        ButtonsSwipeView buttonsSwipeView2 = this.c;
        if (buttonsSwipeView2 == buttonsSwipeView) {
            return;
        }
        C0792a c0792a = this.d;
        if (buttonsSwipeView2 != null) {
            buttonsSwipeView2.g.remove(c0792a);
        }
        this.c = buttonsSwipeView;
        if (buttonsSwipeView != null) {
            buttonsSwipeView.g.add(c0792a);
        }
    }
}
