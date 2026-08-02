package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.c4;
import androidx.core.view.k2;
import androidx.credentials.playservices.controllers.CreateRestoreCredential.a;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import i1.c;
import i1.d;
import i1.e;
import j$.util.Objects;
import java.util.ArrayList;
import n.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final c backDrawerListener;
    private final MaterialBackOrchestrator backOrchestrator;
    private boolean bottomInsetScrimEnabled;
    private int drawerLayoutCornerSize;
    private final boolean drawerLayoutCornerSizeBackAnimationEnabled;
    private final int drawerLayoutCornerSizeBackAnimationMax;
    private boolean endInsetScrimEnabled;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;

    @NonNull
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final ShapeableDelegate shapeableDelegate;
    private final MaterialSideContainerBackHelper sideContainerBackHelper;
    private boolean startInsetScrimEnabled;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_NavigationView;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList createDefaultColorStateList(int i5) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i5, typedValue, true)) {
            return null;
        }
        ColorStateList c2 = d0.c.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.sports.insider.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.data;
        int defaultColor = c2.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{c2.getColorForState(iArr, defaultColor), i10, defaultColor});
    }

    @NonNull
    private Drawable createDefaultItemBackground(@NonNull c4 c4Var) {
        return createDefaultItemDrawable(c4Var, MaterialResources.getColorStateList(getContext(), c4Var, com.google.android.material.R.styleable.NavigationView_itemShapeFillColor));
    }

    @NonNull
    private Drawable createDefaultItemDrawable(@NonNull c4 c4Var, ColorStateList colorStateList) {
        int resourceId = c4Var.f722b.getResourceId(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance, 0);
        int i5 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay;
        TypedArray typedArray = c4Var.f722b;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), resourceId, typedArray.getResourceId(i5, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart, 0), typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop, 0), typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd, 0), typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new i(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(@NonNull c4 c4Var) {
        if (c4Var.f722b.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance)) {
            return true;
        }
        return c4Var.f722b.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeClearCornerSizeAnimationForDrawerLayout() {
        if (!this.drawerLayoutCornerSizeBackAnimationEnabled || this.drawerLayoutCornerSize == 0) {
            return;
        }
        this.drawerLayoutCornerSize = 0;
        maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i5, int i10) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof d)) {
            if ((this.drawerLayoutCornerSize > 0 || this.drawerLayoutCornerSizeBackAnimationEnabled) && (getBackground() instanceof MaterialShapeDrawable)) {
                boolean z5 = Gravity.getAbsoluteGravity(((d) getLayoutParams()).f10856a, getLayoutDirection()) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.drawerLayoutCornerSize);
                if (z5) {
                    allCornerSizes.setTopLeftCornerSize(0.0f);
                    allCornerSizes.setBottomLeftCornerSize(0.0f);
                } else {
                    allCornerSizes.setTopRightCornerSize(0.0f);
                    allCornerSizes.setBottomRightCornerSize(0.0f);
                }
                ShapeAppearanceModel build = allCornerSizes.build();
                materialShapeDrawable.setShapeAppearanceModel(build);
                this.shapeableDelegate.onShapeAppearanceChanged(this, build);
                this.shapeableDelegate.onMaskChanged(this, new RectF(0.0f, 0.0f, i5, i10));
                this.shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    private Pair<DrawerLayout, d> requireDrawerLayoutParent() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof d)) {
            return new Pair<>((DrawerLayout) parent, (d) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
            /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onGlobalLayout() {
                boolean z5;
                Activity activity;
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z7 = true;
                boolean z10 = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z10);
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z10 && navigationView2.isTopInsetScrimEnabled());
                boolean z11 = NavigationView.this.getLayoutDirection() == 1;
                if (NavigationView.this.tmpLocation[0] != 0) {
                    if (NavigationView.this.getWidth() + NavigationView.this.tmpLocation[0] != 0) {
                        z5 = false;
                        NavigationView navigationView3 = NavigationView.this;
                        navigationView3.setDrawLeftInsetForeground(!z5 && (!z11 ? !navigationView3.isStartInsetScrimEnabled() : !navigationView3.isEndInsetScrimEnabled()));
                        activity = ContextUtils.getActivity(NavigationView.this.getContext());
                        if (activity == null) {
                            Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
                            boolean z12 = currentWindowBounds.height() - NavigationView.this.getHeight() == NavigationView.this.tmpLocation[1];
                            boolean z13 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                            NavigationView navigationView4 = NavigationView.this;
                            navigationView4.setDrawBottomInsetForeground(z12 && z13 && navigationView4.isBottomInsetScrimEnabled());
                            boolean z14 = currentWindowBounds.width() == NavigationView.this.tmpLocation[0] || currentWindowBounds.width() - NavigationView.this.getWidth() == NavigationView.this.tmpLocation[0];
                            NavigationView navigationView5 = NavigationView.this;
                            if (!z14 || (!z11 ? !navigationView5.isEndInsetScrimEnabled() : !navigationView5.isStartInsetScrimEnabled())) {
                                z7 = false;
                            }
                            navigationView5.setDrawRightInsetForeground(z7);
                            return;
                        }
                        return;
                    }
                }
                z5 = true;
                NavigationView navigationView32 = NavigationView.this;
                navigationView32.setDrawLeftInsetForeground(!z5 && (!z11 ? !navigationView32.isStartInsetScrimEnabled() : !navigationView32.isEndInsetScrimEnabled()));
                activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity == null) {
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(@NonNull View view) {
        this.presenter.addHeaderView(view);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
        maybeClearCornerSizeAnimationForDrawerLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new a(6, this));
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i5) {
        return this.presenter.getHeaderView(i5);
    }

    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair<DrawerLayout, d> requireDrawerLayoutParent = requireDrawerLayoutParent();
        DrawerLayout drawerLayout = (DrawerLayout) requireDrawerLayoutParent.first;
        e.a onHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (onHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.b(this, true);
            return;
        }
        this.sideContainerBackHelper.finishBackProgress(onHandleBackInvoked, ((d) requireDrawerLayoutParent.second).f10856a, DrawerLayoutUtils.getScrimCloseAnimatorListener(drawerLayout, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(drawerLayout));
    }

    public View inflateHeaderView(int i5) {
        return this.presenter.inflateHeaderView(i5);
    }

    public void inflateMenu(int i5) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i5, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isEndInsetScrimEnabled() {
        return this.endInsetScrimEnabled;
    }

    public boolean isStartInsetScrimEnabled() {
        return this.startInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            c cVar = this.backDrawerListener;
            ArrayList arrayList = drawerLayout.f1757v;
            if (arrayList != null) {
                arrayList.remove(cVar);
            }
            c cVar2 = this.backDrawerListener;
            if (drawerLayout.f1757v == null) {
                drawerLayout.f1757v = new ArrayList();
            }
            drawerLayout.f1757v.add(cVar2);
            if (DrawerLayout.k(this)) {
                this.backOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            c cVar = this.backDrawerListener;
            ArrayList arrayList = ((DrawerLayout) parent).f1757v;
            if (arrayList != null) {
                arrayList.remove(cVar);
            }
        }
        this.backOrchestrator.stopListeningForBackCallbacks();
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onInsetsChanged(@NonNull k2 k2Var) {
        this.presenter.dispatchApplyWindowInsets(k2Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        int mode = View.MeasureSpec.getMode(i5);
        if (mode == Integer.MIN_VALUE) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i5), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i5, i10);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        maybeUpdateCornerSizeForDrawerLayout(i5, i10);
    }

    public void removeHeaderView(@NonNull View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z5) {
        this.bottomInsetScrimEnabled = z5;
    }

    public void setCheckedItem(int i5) {
        MenuItem findItem = this.menu.findItem(i5);
        if (findItem != null) {
            this.presenter.setCheckedItem((p) findItem);
        }
    }

    public void setDividerInsetEnd(int i5) {
        this.presenter.setDividerInsetEnd(i5);
    }

    public void setDividerInsetStart(int i5) {
        this.presenter.setDividerInsetStart(i5);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        MaterialShapeUtils.setElevation(this, f6);
    }

    public void setEndInsetScrimEnabled(boolean z5) {
        this.endInsetScrimEnabled = z5;
    }

    public void setForceCompatClippingEnabled(boolean z5) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z5);
    }

    public void setItemBackground(Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i5) {
        setItemBackground(getContext().getDrawable(i5));
    }

    public void setItemHorizontalPadding(int i5) {
        this.presenter.setItemHorizontalPadding(i5);
    }

    public void setItemHorizontalPaddingResource(int i5) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i5));
    }

    public void setItemIconPadding(int i5) {
        this.presenter.setItemIconPadding(i5);
    }

    public void setItemIconPaddingResource(int i5) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i5));
    }

    public void setItemIconSize(int i5) {
        this.presenter.setItemIconSize(i5);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i5) {
        this.presenter.setItemMaxLines(i5);
    }

    public void setItemTextAppearance(int i5) {
        this.presenter.setItemTextAppearance(i5);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z5) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(z5);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(int i5) {
        this.presenter.setItemVerticalPadding(i5);
    }

    public void setItemVerticalPaddingResource(int i5) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i5));
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i5) {
        super.setOverScrollMode(i5);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i5);
        }
    }

    public void setStartInsetScrimEnabled(boolean z5) {
        this.startInsetScrimEnabled = z5;
    }

    public void setSubheaderInsetEnd(int i5) {
        this.presenter.setSubheaderInsetEnd(i5);
    }

    public void setSubheaderInsetStart(int i5) {
        this.presenter.setSubheaderInsetStart(i5);
    }

    public void setTopInsetScrimEnabled(boolean z5) {
        this.topInsetScrimEnabled = z5;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull e.a aVar) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(aVar);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull e.a aVar) {
        this.sideContainerBackHelper.updateBackProgress(aVar, ((d) requireDrawerLayoutParent().second).f10856a);
        if (this.drawerLayoutCornerSizeBackAnimationEnabled) {
            this.drawerLayoutCornerSize = AnimationUtils.lerp(0, this.drawerLayoutCornerSizeBackAnimationMax, this.sideContainerBackHelper.interpolateProgress(aVar.f8390c));
            maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        public Bundle menuState;

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationView(@NonNull Context context, AttributeSet attributeSet, int i5) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, r5), attributeSet, i5);
        ColorStateList createDefaultColorStateList;
        c4 c4Var;
        int i10;
        int i11;
        int i12 = DEF_STYLE_RES;
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        this.topInsetScrimEnabled = true;
        this.bottomInsetScrimEnabled = true;
        this.startInsetScrimEnabled = true;
        this.endInsetScrimEnabled = true;
        this.drawerLayoutCornerSize = 0;
        this.shapeableDelegate = ShapeableDelegate.create(this);
        this.sideContainerBackHelper = new MaterialSideContainerBackHelper(this);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.backDrawerListener = new e() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // i1.c
            public void onDrawerClosed(@NonNull View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    navigationView.backOrchestrator.stopListeningForBackCallbacks();
                    NavigationView.this.maybeClearCornerSizeAnimationForDrawerLayout();
                }
            }

            @Override // i1.c
            public void onDrawerOpened(@NonNull View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    MaterialBackOrchestrator materialBackOrchestrator = navigationView.backOrchestrator;
                    Objects.requireNonNull(materialBackOrchestrator);
                    view.post(new aa.c(9, materialBackOrchestrator));
                }
            }
        };
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.menu = navigationMenu;
        c4 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.NavigationView, i5, i12, new int[0]);
        int i13 = com.google.android.material.R.styleable.NavigationView_android_background;
        TypedArray typedArray = obtainTintedStyledAttributes.f722b;
        TypedArray typedArray2 = obtainTintedStyledAttributes.f722b;
        if (typedArray.hasValue(i13)) {
            setBackground(obtainTintedStyledAttributes.b(com.google.android.material.R.styleable.NavigationView_android_background));
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_drawerLayoutCornerSize, 0);
        this.drawerLayoutCornerSize = dimensionPixelSize;
        this.drawerLayoutCornerSizeBackAnimationEnabled = dimensionPixelSize == 0;
        this.drawerLayoutCornerSizeBackAnimationMax = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i5, i12).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            setBackground(materialShapeDrawable);
        }
        if (typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_elevation)) {
            setElevation(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_android_maxWidth, 0);
        ColorStateList a7 = typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_subheaderColor) ? obtainTintedStyledAttributes.a(com.google.android.material.R.styleable.NavigationView_subheaderColor) : null;
        int resourceId = typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance) ? typedArray2.getResourceId(com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance, 0) : 0;
        if (resourceId == 0 && a7 == null) {
            a7 = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        if (typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_itemIconTint)) {
            createDefaultColorStateList = obtainTintedStyledAttributes.a(com.google.android.material.R.styleable.NavigationView_itemIconTint);
        } else {
            createDefaultColorStateList = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int resourceId2 = typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_itemTextAppearance) ? typedArray2.getResourceId(com.google.android.material.R.styleable.NavigationView_itemTextAppearance, 0) : 0;
        boolean z5 = typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        if (typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_itemIconSize)) {
            setItemIconSize(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemIconSize, 0));
        }
        ColorStateList a10 = typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_itemTextColor) ? obtainTintedStyledAttributes.a(com.google.android.material.R.styleable.NavigationView_itemTextColor) : null;
        if (resourceId2 == 0 && a10 == null) {
            a10 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable b10 = obtainTintedStyledAttributes.b(com.google.android.material.R.styleable.NavigationView_itemBackground);
        if (b10 == null && hasShapeAppearance(obtainTintedStyledAttributes)) {
            b10 = createDefaultItemBackground(obtainTintedStyledAttributes);
            ColorStateList colorStateList = MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, com.google.android.material.R.styleable.NavigationView_itemRippleColor);
            if (colorStateList != null) {
                c4Var = obtainTintedStyledAttributes;
                navigationMenuPresenter.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList), null, createDefaultItemDrawable(obtainTintedStyledAttributes, null)));
                if (typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding)) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    setItemHorizontalPadding(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding, 0));
                }
                if (typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_itemVerticalPadding)) {
                    setItemVerticalPadding(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemVerticalPadding, i10));
                }
                setDividerInsetStart(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetStart, i10));
                setDividerInsetEnd(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetEnd, i10));
                setSubheaderInsetStart(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetStart, i10));
                setSubheaderInsetEnd(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd, i10));
                setTopInsetScrimEnabled(typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled, this.topInsetScrimEnabled));
                setBottomInsetScrimEnabled(typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled, this.bottomInsetScrimEnabled));
                setStartInsetScrimEnabled(typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_startInsetScrimEnabled, this.startInsetScrimEnabled));
                setEndInsetScrimEnabled(typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_endInsetScrimEnabled, this.endInsetScrimEnabled));
                int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemIconPadding, 0);
                setItemMaxLines(typedArray2.getInt(com.google.android.material.R.styleable.NavigationView_itemMaxLines, 1));
                navigationMenu.setCallback(new l() { // from class: com.google.android.material.navigation.NavigationView.2
                    @Override // androidx.appcompat.view.menu.l
                    public boolean onMenuItemSelected(n nVar, MenuItem menuItem) {
                        OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                        return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
                    }

                    @Override // androidx.appcompat.view.menu.l
                    public void onMenuModeChange(n nVar) {
                    }
                });
                navigationMenuPresenter.setId(1);
                navigationMenuPresenter.initForMenu(context2, navigationMenu);
                if (resourceId != 0) {
                    navigationMenuPresenter.setSubheaderTextAppearance(resourceId);
                }
                navigationMenuPresenter.setSubheaderColor(a7);
                navigationMenuPresenter.setItemIconTintList(createDefaultColorStateList);
                navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
                if (resourceId2 != 0) {
                    navigationMenuPresenter.setItemTextAppearance(resourceId2);
                }
                navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(z5);
                navigationMenuPresenter.setItemTextColor(a10);
                navigationMenuPresenter.setItemBackground(b10);
                navigationMenuPresenter.setItemIconPadding(dimensionPixelSize2);
                navigationMenu.addMenuPresenter(navigationMenuPresenter);
                addView((View) navigationMenuPresenter.getMenuView(this));
                if (typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_menu)) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    inflateMenu(typedArray2.getResourceId(com.google.android.material.R.styleable.NavigationView_menu, 0));
                }
                if (typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_headerLayout)) {
                    inflateHeaderView(typedArray2.getResourceId(com.google.android.material.R.styleable.NavigationView_headerLayout, i11));
                }
                c4Var.g();
                setupInsetScrimsListener();
            }
        }
        c4Var = obtainTintedStyledAttributes;
        if (typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding)) {
        }
        if (typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_itemVerticalPadding)) {
        }
        setDividerInsetStart(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetStart, i10));
        setDividerInsetEnd(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetEnd, i10));
        setSubheaderInsetStart(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetStart, i10));
        setSubheaderInsetEnd(typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd, i10));
        setTopInsetScrimEnabled(typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled, this.topInsetScrimEnabled));
        setBottomInsetScrimEnabled(typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled, this.bottomInsetScrimEnabled));
        setStartInsetScrimEnabled(typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_startInsetScrimEnabled, this.startInsetScrimEnabled));
        setEndInsetScrimEnabled(typedArray2.getBoolean(com.google.android.material.R.styleable.NavigationView_endInsetScrimEnabled, this.endInsetScrimEnabled));
        int dimensionPixelSize22 = typedArray2.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(typedArray2.getInt(com.google.android.material.R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new l() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // androidx.appcompat.view.menu.l
            public boolean onMenuItemSelected(n nVar, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }

            @Override // androidx.appcompat.view.menu.l
            public void onMenuModeChange(n nVar) {
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (resourceId != 0) {
        }
        navigationMenuPresenter.setSubheaderColor(a7);
        navigationMenuPresenter.setItemIconTintList(createDefaultColorStateList);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (resourceId2 != 0) {
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(z5);
        navigationMenuPresenter.setItemTextColor(a10);
        navigationMenuPresenter.setItemBackground(b10);
        navigationMenuPresenter.setItemIconPadding(dimensionPixelSize22);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        if (typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_menu)) {
        }
        if (typedArray2.hasValue(com.google.android.material.R.styleable.NavigationView_headerLayout)) {
        }
        c4Var.g();
        setupInsetScrimsListener();
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem findItem = this.menu.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.presenter.setCheckedItem((p) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
