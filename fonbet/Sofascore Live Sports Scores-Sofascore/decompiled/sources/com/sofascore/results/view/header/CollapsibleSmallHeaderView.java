package com.sofascore.results.view.header;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.b2;
import defpackage.hkg;
import defpackage.mqi;
import defpackage.tsk;
import defpackage.ua0;
import defpackage.usk;
import defpackage.yhk;
import defpackage.yj1;
import defpackage.ypa;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/sofascore/results/view/header/CollapsibleSmallHeaderView;", "Landroid/widget/FrameLayout;", "Lua0;", "Lcom/google/android/material/appbar/AppBarLayout;", "a", "Ljoa;", "getAppBarLayout", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Landroid/view/View;", "getHeaderView", "()Landroid/view/View;", "headerView", "getMainContainer", "mainContainer", "getFollowersContainer", "followersContainer", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CollapsibleSmallHeaderView extends FrameLayout implements ua0 {
    public static final /* synthetic */ int h = 0;
    public final mqi a;
    public final View b;
    public ViewGroup c;
    public boolean d;
    public float e;
    public final int f;
    public final Rect g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsibleSmallHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.a = ypa.b(new yj1(this, 25));
        this.b = new View(context);
        this.d = true;
        this.f = ao2.s(12, context);
        setPaddingRelative(getPaddingStart(), getPaddingTop(), ao2.s(16, context), getPaddingBottom());
        this.g = new Rect();
    }

    private final AppBarLayout getAppBarLayout() {
        return (AppBarLayout) this.a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getFollowersContainer() {
        return getHeaderView().findViewById(R.id.followers_container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getHeaderView() {
        View childAt = getChildAt(0);
        childAt.getClass();
        return childAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getMainContainer() {
        return getHeaderView().findViewById(R.id.main_content);
    }

    @Override // defpackage.ua0
    public final void a(AppBarLayout appBarLayout, int i) {
        if (appBarLayout.getTotalScrollRange() < 0.001d) {
            return;
        }
        this.e = (-i) / appBarLayout.getTotalScrollRange();
        getHeaderView().setScaleX(1.0f - (this.e * 0.2f));
        getHeaderView().setScaleY(1.0f - (this.e * 0.2f));
        View followersContainer = getFollowersContainer();
        if (followersContainer != null) {
            followersContainer.setAlpha(1.0f - (this.e * 1.5f));
        }
        ViewGroup viewGroup = this.c;
        float pivotY = (getHeaderView().getPivotY() - (viewGroup != null ? viewGroup.getPivotY() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) * this.e;
        Context context = getContext();
        context.getClass();
        float f = hkg.c0(context) ? -1 : 1;
        getHeaderView().setTranslationX((getHeaderView().getPivotX() * 0.2f * this.e * f) + ((1.0f - this.e) * this.f * f));
        getHeaderView().setTranslationY(pivotY);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppBarLayout appBarLayout = getAppBarLayout();
        if (appBarLayout != null) {
            appBarLayout.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AppBarLayout appBarLayout = getAppBarLayout();
        if (appBarLayout != null) {
            appBarLayout.f(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.b;
        if (view.isAttachedToWindow() && view.getVisibility() == 0 && this.d) {
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.addOnLayoutChangeListener(new b2(this, 4));
            }
            this.d = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ViewGroup viewGroup;
        super.onMeasure(i, i2);
        if (this.c == null) {
            ViewParent parent = getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                Iterator it = new tsk(viewGroup2).iterator();
                while (true) {
                    usk uskVar = (usk) it;
                    if (!uskVar.hasNext()) {
                        break;
                    }
                    View view = (View) uskVar.next();
                    if (view instanceof Toolbar) {
                        this.c = (ViewGroup) view;
                    }
                }
            }
        }
        if (this.c != null) {
            View view2 = this.b;
            if (view2.getParent() == null && (viewGroup = this.c) != null) {
                viewGroup.addView(view2, -1, -1);
            }
        }
        View headerView = getHeaderView();
        ViewGroup.LayoutParams layoutParams = headerView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        ViewGroup viewGroup3 = this.c;
        layoutParams2.topMargin = viewGroup3 != null ? viewGroup3.getMeasuredHeight() : 0;
        headerView.setLayoutParams(layoutParams2);
        getHeaderView().getMeasuredWidth();
    }
}
