package com.vk.pullfromtopofrecycler.coordinator;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.vk.pullfromtopofrecycler.PullFromTopMode;
import com.vk.pullfromtopofrecycler.coordinator.PullingHandlingBehavior;
import kotlin.NoWhenBranchMatchedException;
import xsna.gse;
import xsna.hfr;
import xsna.jxt0;
import xsna.lfe0;
import xsna.mfe0;
import xsna.rli0;

/* compiled from: PullFromTopLinearLayout.kt */
/* loaded from: classes5.dex */
public final class PullFromTopLinearLayout extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public ValueAnimator b;
    public PullFromTopMode c;

    /* compiled from: PullFromTopLinearLayout.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PullFromTopMode.values().length];
            try {
                iArr[PullFromTopMode.ALWAYS_HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullFromTopMode.ALWAYS_VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PullFromTopMode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PullFromTopLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = PullFromTopMode.DEFAULT;
    }

    public final void a() {
        if (getVisibility() == 0) {
            return;
        }
        setVisibility(0);
        measure(getLayoutParams().width, getLayoutParams().height);
        int measuredHeight = getMeasuredHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, measuredHeight);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new lfe0(this, true));
        ofInt.addListener(new mfe0(this, measuredHeight, true));
        ofInt.start();
        this.b = ofInt;
    }

    public final PullFromTopMode getMode() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.b = null;
    }

    public final void setMode(PullFromTopMode pullFromTopMode) {
        this.c = pullFromTopMode;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.b = null;
        int i = a.$EnumSwitchMapping$0[pullFromTopMode.ordinal()];
        boolean z = false;
        if (i == 1) {
            if (getVisibility() == 0) {
                measure(getLayoutParams().width, getLayoutParams().height);
                ValueAnimator ofInt = ValueAnimator.ofInt(getMeasuredHeight(), 0);
                ofInt.setDuration(200L);
                ofInt.addUpdateListener(new lfe0(this, false));
                ofInt.addListener(new mfe0(this, 0, false));
                ofInt.start();
                this.b = ofInt;
                return;
            }
            return;
        }
        if (i == 2) {
            a();
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ViewParent parent = getParent();
        ExpandableAppBarLayout expandableAppBarLayout = parent instanceof ExpandableAppBarLayout ? (ExpandableAppBarLayout) parent : null;
        if (expandableAppBarLayout != null) {
            hfr.a aVar = new hfr.a(rli0.j(new jxt0(expandableAppBarLayout), gse.e));
            while (true) {
                if (!aVar.hasNext()) {
                    z = true;
                    break;
                } else if (((PullFromTopLinearLayout) aVar.next()).getVisibility() != 0) {
                    break;
                }
            }
            PullingHandlingBehavior pullingHandlingBehavior = expandableAppBarLayout.B;
            pullingHandlingBehavior.u = true;
            pullingHandlingBehavior.t = z ? PullingHandlingBehavior.a.COLLAPSING : PullingHandlingBehavior.a.EXPANDING;
        }
    }
}
