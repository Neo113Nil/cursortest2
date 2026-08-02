package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.navigation.NavigationBarView;
import com.sports.insider.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.n {
    private static final String TAG = "Toolbar";
    private androidx.appcompat.view.menu.y mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private c3 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private g4 mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    androidx.appcompat.view.menu.l mMenuBuilderCallback;
    final androidx.core.view.q mMenuHostHelper;
    ActionMenuView mMenuView;
    private final s mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    i4 mOnMenuItemClickListener;
    private n mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private m4 mWrapper;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new j4();

        /* renamed from: a, reason: collision with root package name */
        public int f670a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f671b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f670a = parcel.readInt();
            this.f671b = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f670a);
            parcel.writeInt(this.f671b ? 1 : 0);
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i5 = 0; i5 < menu.size(); i5++) {
            arrayList.add(menu.getItem(i5));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new n.i(getContext());
    }

    public static int h(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i5, List list) {
        boolean z5 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, getLayoutDirection());
        list.clear();
        if (!z5) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                h4 h4Var = (h4) childAt.getLayoutParams();
                if (h4Var.f769b == 0 && o(childAt)) {
                    int i11 = h4Var.f768a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        list.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            h4 h4Var2 = (h4) childAt2.getLayoutParams();
            if (h4Var2.f769b == 0 && o(childAt2)) {
                int i13 = h4Var2.f768a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    list.add(childAt2);
                }
            }
        }
    }

    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @Override // androidx.core.view.n
    public void addMenuProvider(@NonNull androidx.core.view.r rVar) {
        androidx.core.view.q qVar = this.mMenuHostHelper;
        qVar.f1383b.add(rVar);
        qVar.f1382a.run();
    }

    public final void b(View view, boolean z5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        h4 generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (h4) layoutParams;
        generateDefaultLayoutParams.f769b = 1;
        if (!z5 || this.mExpandedActionView == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.mHiddenViews.add(view);
        }
    }

    public final void c() {
        if (this.mContentInsets == null) {
            c3 c3Var = new c3();
            c3Var.f713a = 0;
            c3Var.f714b = 0;
            c3Var.f715c = Integer.MIN_VALUE;
            c3Var.f716d = Integer.MIN_VALUE;
            c3Var.f717e = 0;
            c3Var.f718f = 0;
            c3Var.f719g = false;
            c3Var.f720h = false;
            this.mContentInsets = c3Var;
        }
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.f617d;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof h4);
    }

    public void collapseActionView() {
        g4 g4Var = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.p pVar = g4Var == null ? null : g4Var.f762b;
        if (pVar != null) {
            pVar.collapseActionView();
        }
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView.f614a == null) {
            androidx.appcompat.view.menu.n nVar = (androidx.appcompat.view.menu.n) actionMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new g4(this);
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            nVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    public void dismissPopupMenus() {
        n nVar;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (nVar = actionMenuView.f618e) == null) {
            return;
        }
        nVar.b();
        i iVar = nVar.f853u;
        if (iVar == null || !iVar.b()) {
            return;
        }
        iVar.f560i.dismiss();
    }

    public final void e() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            ActionMenuView actionMenuView2 = this.mMenuView;
            androidx.appcompat.view.menu.y yVar = this.mActionMenuPresenterCallback;
            e4 e4Var = new e4(this);
            actionMenuView2.f619f = yVar;
            actionMenuView2.f620g = e4Var;
            h4 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f768a = (this.mButtonGravity & 112) | 8388613;
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            b(this.mMenuView, false);
        }
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            g0 g0Var = new g0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = g0Var;
            g0Var.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            h4 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f768a = (this.mButtonGravity & 112) | 8388611;
            generateDefaultLayoutParams.f769b = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new c(1, this));
        }
    }

    public final void f() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new g0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            h4 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f768a = (this.mButtonGravity & 112) | 8388611;
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    public final int g(int i5, View view) {
        h4 h4Var = (h4) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i5 > 0 ? (measuredHeight - i5) / 2 : 0;
        int i11 = h4Var.f768a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.mGravity & 112;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) h4Var).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) h4Var).topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) h4Var).bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        c3 c3Var = this.mContentInsets;
        if (c3Var != null) {
            return c3Var.f719g ? c3Var.f713a : c3Var.f714b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i5 = this.mContentInsetEndWithActions;
        return i5 != Integer.MIN_VALUE ? i5 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        c3 c3Var = this.mContentInsets;
        if (c3Var != null) {
            return c3Var.f713a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        c3 c3Var = this.mContentInsets;
        if (c3Var != null) {
            return c3Var.f714b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        c3 c3Var = this.mContentInsets;
        if (c3Var != null) {
            return c3Var.f719g ? c3Var.f714b : c3Var.f713a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i5 = this.mContentInsetStartWithNavigation;
        return i5 != Integer.MIN_VALUE ? i5 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.n nVar;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (nVar = actionMenuView.f614a) == null || !nVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.mMenuView.getMenu();
    }

    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public n getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.mMenuView.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public w1 getWrapper() {
        Drawable drawable;
        if (this.mWrapper == null) {
            m4 m4Var = new m4();
            m4Var.f833n = 0;
            m4Var.f821a = this;
            m4Var.f828h = getTitle();
            m4Var.f829i = getSubtitle();
            m4Var.f827g = m4Var.f828h != null;
            m4Var.f826f = getNavigationIcon();
            c4 f6 = c4.f(getContext(), null, i.a.f10830a, R.attr.actionBarStyle, 0);
            TypedArray typedArray = f6.f722b;
            m4Var.f834o = f6.b(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                m4Var.f827g = true;
                m4Var.f828h = text;
                if ((m4Var.f822b & 8) != 0) {
                    setTitle(text);
                    if (m4Var.f827g) {
                        androidx.core.view.z0.p(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                m4Var.f829i = text2;
                if ((m4Var.f822b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable b10 = f6.b(20);
            if (b10 != null) {
                m4Var.f825e = b10;
                m4Var.c();
            }
            Drawable b11 = f6.b(17);
            if (b11 != null) {
                m4Var.f824d = b11;
                m4Var.c();
            }
            if (m4Var.f826f == null && (drawable = m4Var.f834o) != null) {
                m4Var.f826f = drawable;
                if ((m4Var.f822b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            m4Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = m4Var.f823c;
                if (view != null && (m4Var.f822b & 16) != 0) {
                    removeView(view);
                }
                m4Var.f823c = inflate;
                if (inflate != null && (m4Var.f822b & 16) != 0) {
                    addView(inflate);
                }
                m4Var.a(m4Var.f822b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                setTitleTextAppearance(getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                setSubtitleTextAppearance(getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            f6.g();
            if (R.string.abc_action_bar_up_description != m4Var.f833n) {
                m4Var.f833n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i5 = m4Var.f833n;
                    m4Var.j = i5 != 0 ? getContext().getString(i5) : null;
                    m4Var.b();
                }
            }
            m4Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new k4(m4Var));
            this.mWrapper = m4Var;
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        g4 g4Var = this.mExpandedMenuPresenter;
        return (g4Var == null || g4Var.f762b == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        n nVar;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (nVar = actionMenuView.f618e) == null || !nVar.b()) ? false : true;
    }

    public void inflateMenu(int i5) {
        getMenuInflater().inflate(i5, getMenu());
    }

    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        androidx.core.view.q qVar = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = qVar.f1383b.iterator();
        while (it2.hasNext()) {
            ((androidx.fragment.app.a1) ((androidx.core.view.r) it2.next())).f1865a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    public boolean isOverflowMenuShowPending() {
        n nVar;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (nVar = actionMenuView.f618e) == null) {
            return false;
        }
        return nVar.f854v != null || nVar.c();
    }

    public boolean isOverflowMenuShowing() {
        n nVar;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (nVar = actionMenuView.f618e) == null || !nVar.c()) ? false : true;
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i5 = 0; i5 < lineCount; i5++) {
            if (layout.getEllipsisCount(i5) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public final int k(View view, int i5, int i10, int[] iArr) {
        h4 h4Var = (h4) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) h4Var).leftMargin - iArr[0];
        int max = Math.max(0, i11) + i5;
        iArr[0] = Math.max(0, -i11);
        int g10 = g(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, g10, max + measuredWidth, view.getMeasuredHeight() + g10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) h4Var).rightMargin + max;
    }

    public final int l(View view, int i5, int i10, int[] iArr) {
        h4 h4Var = (h4) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) h4Var).rightMargin - iArr[1];
        int max = i5 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int g10 = g(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, g10, max, view.getMeasuredHeight() + g10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) h4Var).leftMargin);
    }

    public final int m(View view, int i5, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void n(View view, int i5, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean o(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0293 A[LOOP:0: B:39:0x0291->B:40:0x0293, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02b1 A[LOOP:1: B:43:0x02af->B:44:0x02b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d8 A[LOOP:2: B:47:0x02d6->B:48:0x02d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x032b A[LOOP:3: B:56:0x0329->B:57:0x032b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        int i13;
        int i14;
        int max;
        boolean o3;
        boolean o4;
        boolean z7;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int size;
        int i21;
        int size2;
        int i22;
        int size3;
        int i23;
        int i24;
        int size4;
        int i25;
        boolean z10 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i12 - i10) : 0;
        if (!o(this.mNavButtonView)) {
            i13 = paddingLeft;
        } else {
            if (z10) {
                i14 = l(this.mNavButtonView, i26, min, iArr);
                i13 = paddingLeft;
                if (o(this.mCollapseButtonView)) {
                    if (z10) {
                        i14 = l(this.mCollapseButtonView, i14, min, iArr);
                    } else {
                        i13 = k(this.mCollapseButtonView, i13, min, iArr);
                    }
                }
                if (o(this.mMenuView)) {
                    if (z10) {
                        i13 = k(this.mMenuView, i13, min, iArr);
                    } else {
                        i14 = l(this.mMenuView, i14, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i13);
                iArr[1] = Math.max(0, currentContentInsetRight - (i26 - i14));
                max = Math.max(i13, currentContentInsetLeft);
                int min2 = Math.min(i14, i26 - currentContentInsetRight);
                if (o(this.mExpandedActionView)) {
                    if (z10) {
                        min2 = l(this.mExpandedActionView, min2, min, iArr);
                    } else {
                        max = k(this.mExpandedActionView, max, min, iArr);
                    }
                }
                if (o(this.mLogoView)) {
                    if (z10) {
                        min2 = l(this.mLogoView, min2, min, iArr);
                    } else {
                        max = k(this.mLogoView, max, min, iArr);
                    }
                }
                o3 = o(this.mTitleTextView);
                o4 = o(this.mSubtitleTextView);
                if (o3) {
                    z7 = z10;
                    i15 = 0;
                } else {
                    h4 h4Var = (h4) this.mTitleTextView.getLayoutParams();
                    z7 = z10;
                    i15 = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) h4Var).topMargin + ((ViewGroup.MarginLayoutParams) h4Var).bottomMargin;
                }
                if (!o4) {
                    h4 h4Var2 = (h4) this.mSubtitleTextView.getLayoutParams();
                    i15 = this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) h4Var2).topMargin + ((ViewGroup.MarginLayoutParams) h4Var2).bottomMargin + i15;
                }
                if (!o3 || o4) {
                    TextView textView = !o3 ? this.mTitleTextView : this.mSubtitleTextView;
                    TextView textView2 = !o4 ? this.mSubtitleTextView : this.mTitleTextView;
                    h4 h4Var3 = (h4) textView.getLayoutParams();
                    h4 h4Var4 = (h4) textView2.getLayoutParams();
                    int i27 = i15;
                    boolean z11 = (!o3 && this.mTitleTextView.getMeasuredWidth() > 0) || (o4 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                    i16 = this.mGravity & 112;
                    int i28 = max;
                    if (i16 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) h4Var3).topMargin + this.mTitleMarginTop;
                    } else if (i16 != 80) {
                        int i29 = (((height - paddingTop2) - paddingBottom) - i27) / 2;
                        int i30 = ((ViewGroup.MarginLayoutParams) h4Var3).topMargin;
                        int i31 = this.mTitleMarginTop;
                        if (i29 < i30 + i31) {
                            i29 = i30 + i31;
                        } else {
                            int i32 = (((height - paddingBottom) - i27) - i29) - paddingTop2;
                            int i33 = ((ViewGroup.MarginLayoutParams) h4Var3).bottomMargin;
                            int i34 = this.mTitleMarginBottom;
                            if (i32 < i33 + i34) {
                                i29 = Math.max(0, i29 - ((((ViewGroup.MarginLayoutParams) h4Var4).bottomMargin + i34) - i32));
                            }
                        }
                        paddingTop = paddingTop2 + i29;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) h4Var4).bottomMargin) - this.mTitleMarginBottom) - i27;
                    }
                    if (z7) {
                        int i35 = (z11 ? this.mTitleMarginStart : 0) - iArr[0];
                        max = Math.max(0, i35) + i28;
                        iArr[0] = Math.max(0, -i35);
                        if (o3) {
                            h4 h4Var5 = (h4) this.mTitleTextView.getLayoutParams();
                            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + max;
                            int measuredHeight = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i17 = measuredWidth + this.mTitleMarginEnd;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) h4Var5).bottomMargin;
                        } else {
                            i17 = max;
                        }
                        if (o4) {
                            int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((h4) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.mSubtitleTextView.getMeasuredWidth() + max;
                            this.mSubtitleTextView.layout(max, i36, measuredWidth2, this.mSubtitleTextView.getMeasuredHeight() + i36);
                            i18 = measuredWidth2 + this.mTitleMarginEnd;
                        } else {
                            i18 = max;
                        }
                        if (z11) {
                            max = Math.max(i17, i18);
                        }
                    } else {
                        int i37 = (z11 ? this.mTitleMarginStart : 0) - iArr[1];
                        min2 -= Math.max(0, i37);
                        iArr[1] = Math.max(0, -i37);
                        if (o3) {
                            h4 h4Var6 = (h4) this.mTitleTextView.getLayoutParams();
                            int measuredWidth3 = min2 - this.mTitleTextView.getMeasuredWidth();
                            int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i19 = measuredWidth3 - this.mTitleMarginEnd;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) h4Var6).bottomMargin;
                        } else {
                            i19 = min2;
                        }
                        if (o4) {
                            int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((h4) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            this.mSubtitleTextView.layout(min2 - this.mSubtitleTextView.getMeasuredWidth(), i38, min2, this.mSubtitleTextView.getMeasuredHeight() + i38);
                            i20 = min2 - this.mTitleMarginEnd;
                        } else {
                            i20 = min2;
                        }
                        if (z11) {
                            min2 = Math.min(i19, i20);
                        }
                        max = i28;
                    }
                }
                a(3, this.mTempViews);
                size = this.mTempViews.size();
                for (i21 = 0; i21 < size; i21++) {
                    max = k(this.mTempViews.get(i21), max, min, iArr);
                }
                a(5, this.mTempViews);
                size2 = this.mTempViews.size();
                for (i22 = 0; i22 < size2; i22++) {
                    min2 = l(this.mTempViews.get(i22), min2, min, iArr);
                }
                a(1, this.mTempViews);
                ArrayList<View> arrayList = this.mTempViews;
                int i39 = iArr[0];
                int i40 = iArr[1];
                size3 = arrayList.size();
                int i41 = i40;
                int i42 = i39;
                i23 = 0;
                int i43 = 0;
                while (i23 < size3) {
                    View view = arrayList.get(i23);
                    h4 h4Var7 = (h4) view.getLayoutParams();
                    ArrayList<View> arrayList2 = arrayList;
                    int i44 = ((ViewGroup.MarginLayoutParams) h4Var7).leftMargin - i42;
                    int i45 = ((ViewGroup.MarginLayoutParams) h4Var7).rightMargin - i41;
                    int max2 = Math.max(0, i44);
                    int max3 = Math.max(0, i45);
                    int max4 = Math.max(0, -i44);
                    int max5 = Math.max(0, -i45);
                    i43 += view.getMeasuredWidth() + max2 + max3;
                    i23++;
                    i41 = max5;
                    i42 = max4;
                    arrayList = arrayList2;
                }
                i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i43 / 2);
                int i46 = i43 + i24;
                if (i24 >= max) {
                    max = i46 > min2 ? i24 - (i46 - min2) : i24;
                }
                size4 = this.mTempViews.size();
                for (i25 = 0; i25 < size4; i25++) {
                    max = k(this.mTempViews.get(i25), max, min, iArr);
                }
                this.mTempViews.clear();
            }
            i13 = k(this.mNavButtonView, paddingLeft, min, iArr);
        }
        i14 = i26;
        if (o(this.mCollapseButtonView)) {
        }
        if (o(this.mMenuView)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i13);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - i14));
        max = Math.max(i13, currentContentInsetLeft2);
        int min22 = Math.min(i14, i26 - currentContentInsetRight2);
        if (o(this.mExpandedActionView)) {
        }
        if (o(this.mLogoView)) {
        }
        o3 = o(this.mTitleTextView);
        o4 = o(this.mSubtitleTextView);
        if (o3) {
        }
        if (!o4) {
        }
        if (!o3) {
        }
        if (!o3) {
        }
        if (!o4) {
        }
        h4 h4Var32 = (h4) textView.getLayoutParams();
        h4 h4Var42 = (h4) textView2.getLayoutParams();
        int i272 = i15;
        if (o3) {
        }
        i16 = this.mGravity & 112;
        int i282 = max;
        if (i16 != 48) {
        }
        if (z7) {
        }
        a(3, this.mTempViews);
        size = this.mTempViews.size();
        while (i21 < size) {
        }
        a(5, this.mTempViews);
        size2 = this.mTempViews.size();
        while (i22 < size2) {
        }
        a(1, this.mTempViews);
        ArrayList<View> arrayList3 = this.mTempViews;
        int i392 = iArr[0];
        int i402 = iArr[1];
        size3 = arrayList3.size();
        int i412 = i402;
        int i422 = i392;
        i23 = 0;
        int i432 = 0;
        while (i23 < size3) {
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i432 / 2);
        int i462 = i432 + i24;
        if (i24 >= max) {
        }
        size4 = this.mTempViews.size();
        while (i25 < size4) {
        }
        this.mTempViews.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        char c2;
        char c8;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr = this.mTempMargins;
        boolean z5 = u4.f982a;
        int i18 = 0;
        if (getLayoutDirection() == 1) {
            c8 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c8 = 0;
        }
        if (o(this.mNavButtonView)) {
            n(this.mNavButtonView, i5, 0, i10, this.mMaxButtonHeight);
            i11 = h(this.mNavButtonView) + this.mNavButtonView.getMeasuredWidth();
            i12 = Math.max(0, i(this.mNavButtonView) + this.mNavButtonView.getMeasuredHeight());
            i13 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (o(this.mCollapseButtonView)) {
            n(this.mCollapseButtonView, i5, 0, i10, this.mMaxButtonHeight);
            i11 = h(this.mCollapseButtonView) + this.mCollapseButtonView.getMeasuredWidth();
            i12 = Math.max(i12, i(this.mCollapseButtonView) + this.mCollapseButtonView.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i11);
        iArr[c8] = Math.max(0, currentContentInsetStart - i11);
        if (o(this.mMenuView)) {
            n(this.mMenuView, i5, max, i10, this.mMaxButtonHeight);
            i14 = h(this.mMenuView) + this.mMenuView.getMeasuredWidth();
            i12 = Math.max(i12, i(this.mMenuView) + this.mMenuView.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.mMenuView.getMeasuredState());
        } else {
            i14 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i14);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i14);
        if (o(this.mExpandedActionView)) {
            max2 += m(this.mExpandedActionView, i5, max2, i10, 0, iArr);
            i12 = Math.max(i12, i(this.mExpandedActionView) + this.mExpandedActionView.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.mExpandedActionView.getMeasuredState());
        }
        if (o(this.mLogoView)) {
            max2 += m(this.mLogoView, i5, max2, i10, 0, iArr);
            i12 = Math.max(i12, i(this.mLogoView) + this.mLogoView.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (((h4) childAt.getLayoutParams()).f769b == 0 && o(childAt)) {
                max2 += m(childAt, i5, max2, i10, 0, iArr);
                int max3 = Math.max(i12, i(childAt) + childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
                i12 = max3;
            } else {
                max2 = max2;
            }
        }
        int i20 = max2;
        int i21 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i22 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (o(this.mTitleTextView)) {
            m(this.mTitleTextView, i5, i20 + i22, i10, i21, iArr);
            int h10 = h(this.mTitleTextView) + this.mTitleTextView.getMeasuredWidth();
            int i23 = i(this.mTitleTextView) + this.mTitleTextView.getMeasuredHeight();
            i15 = h10;
            i16 = View.combineMeasuredStates(i13, this.mTitleTextView.getMeasuredState());
            i17 = i23;
        } else {
            i15 = 0;
            i16 = i13;
            i17 = 0;
        }
        if (o(this.mSubtitleTextView)) {
            i15 = Math.max(i15, m(this.mSubtitleTextView, i5, i20 + i22, i10, i21 + i17, iArr));
            i17 += i(this.mSubtitleTextView) + this.mSubtitleTextView.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i16, this.mSubtitleTextView.getMeasuredState());
        }
        int max4 = Math.max(i12, i17);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i20 + i15;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i5, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i16 << 16);
        if (this.mCollapsible) {
            int childCount2 = getChildCount();
            for (int i24 = 0; i24 < childCount2; i24++) {
                View childAt2 = getChildAt(i24);
                if (!o(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i18);
        }
        i18 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i18);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.n nVar = actionMenuView != null ? actionMenuView.f614a : null;
        int i5 = savedState.f670a;
        if (i5 != 0 && this.mExpandedMenuPresenter != null && nVar != null && (findItem = nVar.findItem(i5)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f671b) {
            removeCallbacks(this.mShowOverflowMenuRunnable);
            post(this.mShowOverflowMenuRunnable);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        c();
        c3 c3Var = this.mContentInsets;
        boolean z5 = i5 == 1;
        if (z5 == c3Var.f719g) {
            return;
        }
        c3Var.f719g = z5;
        if (!c3Var.f720h) {
            c3Var.f713a = c3Var.f717e;
            c3Var.f714b = c3Var.f718f;
            return;
        }
        if (z5) {
            int i10 = c3Var.f716d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = c3Var.f717e;
            }
            c3Var.f713a = i10;
            int i11 = c3Var.f715c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = c3Var.f718f;
            }
            c3Var.f714b = i11;
            return;
        }
        int i12 = c3Var.f715c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = c3Var.f717e;
        }
        c3Var.f713a = i12;
        int i13 = c3Var.f716d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = c3Var.f718f;
        }
        c3Var.f714b = i13;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.p pVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        g4 g4Var = this.mExpandedMenuPresenter;
        if (g4Var != null && (pVar = g4Var.f762b) != null) {
            savedState.f670a = pVar.f517a;
        }
        savedState.f671b = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((h4) childAt.getLayoutParams()).f769b != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // androidx.core.view.n
    public void removeMenuProvider(@NonNull androidx.core.view.r rVar) {
        this.mMenuHostHelper.b(rVar);
    }

    public void setBackInvokedCallbackEnabled(boolean z5) {
        if (this.mBackInvokedCallbackEnabled != z5) {
            this.mBackInvokedCallbackEnabled = z5;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(int i5) {
        setCollapseContentDescription(i5 != 0 ? getContext().getText(i5) : null);
    }

    public void setCollapseIcon(int i5) {
        setCollapseIcon(h8.b.n(getContext(), i5));
    }

    public void setCollapsible(boolean z5) {
        this.mCollapsible = z5;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i5) {
        if (i5 < 0) {
            i5 = Integer.MIN_VALUE;
        }
        if (i5 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i5;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i5) {
        if (i5 < 0) {
            i5 = Integer.MIN_VALUE;
        }
        if (i5 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i5;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i5, int i10) {
        c();
        c3 c3Var = this.mContentInsets;
        c3Var.f720h = false;
        if (i5 != Integer.MIN_VALUE) {
            c3Var.f717e = i5;
            c3Var.f713a = i5;
        }
        if (i10 != Integer.MIN_VALUE) {
            c3Var.f718f = i10;
            c3Var.f714b = i10;
        }
    }

    public void setContentInsetsRelative(int i5, int i10) {
        c();
        this.mContentInsets.a(i5, i10);
    }

    public void setLogo(int i5) {
        setLogo(h8.b.n(getContext(), i5));
    }

    public void setLogoDescription(int i5) {
        setLogoDescription(getContext().getText(i5));
    }

    public void setMenu(androidx.appcompat.view.menu.n nVar, n nVar2) {
        if (nVar == null && this.mMenuView == null) {
            return;
        }
        e();
        androidx.appcompat.view.menu.n nVar3 = this.mMenuView.f614a;
        if (nVar3 == nVar) {
            return;
        }
        if (nVar3 != null) {
            nVar3.removeMenuPresenter(this.mOuterActionMenuPresenter);
            nVar3.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new g4(this);
        }
        nVar2.f850r = true;
        if (nVar != null) {
            nVar.addMenuPresenter(nVar2, this.mPopupContext);
            nVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            nVar2.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            nVar2.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(nVar2);
        this.mOuterActionMenuPresenter = nVar2;
        updateBackInvokedCallbackState();
    }

    public void setMenuCallbacks(androidx.appcompat.view.menu.y yVar, androidx.appcompat.view.menu.l lVar) {
        this.mActionMenuPresenterCallback = yVar;
        this.mMenuBuilderCallback = lVar;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.f619f = yVar;
            actionMenuView.f620g = lVar;
        }
    }

    public void setNavigationContentDescription(int i5) {
        setNavigationContentDescription(i5 != 0 ? getContext().getText(i5) : null);
    }

    public void setNavigationIcon(int i5) {
        setNavigationIcon(h8.b.n(getContext(), i5));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i5) {
        if (this.mPopupTheme != i5) {
            this.mPopupTheme = i5;
            if (i5 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    public void setSubtitle(int i5) {
        setSubtitle(getContext().getText(i5));
    }

    public void setSubtitleTextAppearance(Context context, int i5) {
        this.mSubtitleTextAppearance = i5;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i5);
        }
    }

    public void setSubtitleTextColor(int i5) {
        setSubtitleTextColor(ColorStateList.valueOf(i5));
    }

    public void setTitle(int i5) {
        setTitle(getContext().getText(i5));
    }

    public void setTitleMargin(int i5, int i10, int i11, int i12) {
        this.mTitleMarginStart = i5;
        this.mTitleMarginTop = i10;
        this.mTitleMarginEnd = i11;
        this.mTitleMarginBottom = i12;
        requestLayout();
    }

    public void setTitleMarginBottom(int i5) {
        this.mTitleMarginBottom = i5;
        requestLayout();
    }

    public void setTitleMarginEnd(int i5) {
        this.mTitleMarginEnd = i5;
        requestLayout();
    }

    public void setTitleMarginStart(int i5) {
        this.mTitleMarginStart = i5;
        requestLayout();
    }

    public void setTitleMarginTop(int i5) {
        this.mTitleMarginTop = i5;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i5) {
        this.mTitleTextAppearance = i5;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i5);
        }
    }

    public void setTitleTextColor(int i5) {
        setTitleTextColor(ColorStateList.valueOf(i5));
    }

    public boolean showOverflowMenu() {
        n nVar;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (nVar = actionMenuView.f618e) == null || !nVar.d()) ? false : true;
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a7 = f4.a(this);
            boolean z5 = hasExpandedActionView() && a7 != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z5 && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = f4.b(new d4(this, 0));
                }
                f4.c(a7, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = a7;
                return;
            }
            if (z5 || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            f4.d(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.mGravity = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new androidx.core.view.q(new d4(this, 1));
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new e4(this);
        this.mShowOverflowMenuRunnable = new f2(this, 1);
        Context context2 = getContext();
        int[] iArr = i.a.f10853z;
        c4 f6 = c4.f(context2, attributeSet, iArr, i5, 0);
        androidx.core.view.z0.n(this, context, iArr, attributeSet, f6.f722b, i5);
        TypedArray typedArray = f6.f722b;
        this.mTitleTextAppearance = typedArray.getResourceId(28, 0);
        this.mSubtitleTextAppearance = typedArray.getResourceId(19, 0);
        this.mGravity = typedArray.getInteger(0, this.mGravity);
        this.mButtonGravity = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset5;
        }
        this.mMaxButtonHeight = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        c();
        c3 c3Var = this.mContentInsets;
        c3Var.f720h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c3Var.f717e = dimensionPixelSize;
            c3Var.f713a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c3Var.f718f = dimensionPixelSize2;
            c3Var.f714b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c3Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.mContentInsetStartWithNavigation = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.mCollapseIcon = f6.b(4);
        this.mCollapseDescription = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable b10 = f6.b(16);
        if (b10 != null) {
            setNavigationIcon(b10);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable b11 = f6.b(11);
        if (b11 != null) {
            setLogo(b11);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(f6.a(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(f6.a(20));
        }
        if (typedArray.hasValue(14)) {
            inflateMenu(typedArray.getResourceId(14, 0));
        }
        f6.g();
    }

    @Override // android.view.ViewGroup
    public h4 generateDefaultLayoutParams() {
        h4 h4Var = new h4(-2, -2);
        h4Var.f769b = 0;
        h4Var.f768a = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        return h4Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.mLogoView == null) {
                this.mLogoView = new AppCompatImageView(getContext(), null);
            }
            if (!j(this.mLogoView)) {
                b(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && j(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext(), null);
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            m4.g.v(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!j(this.mNavButtonView)) {
                b(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && j(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && j(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                n1 n1Var = new n1(context, null);
                this.mSubtitleTextView = n1Var;
                n1Var.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i5 = this.mSubtitleTextAppearance;
                if (i5 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i5);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!j(this.mSubtitleTextView)) {
                b(this.mSubtitleTextView, true);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mTitleTextView;
            if (textView != null && j(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        } else {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                n1 n1Var = new n1(context, null);
                this.mTitleTextView = n1Var;
                n1Var.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i5 = this.mTitleTextAppearance;
                if (i5 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i5);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!j(this.mTitleTextView)) {
                b(this.mTitleTextView, true);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    @Override // android.view.ViewGroup
    public h4 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        h4 h4Var = new h4(context, attributeSet);
        h4Var.f768a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f10831b);
        h4Var.f768a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        h4Var.f769b = 0;
        return h4Var;
    }

    public void addMenuProvider(@NonNull androidx.core.view.r rVar, @NonNull androidx.lifecycle.e0 e0Var) {
        androidx.core.view.q qVar = this.mMenuHostHelper;
        qVar.f1383b.add(rVar);
        qVar.f1382a.run();
        androidx.lifecycle.y lifecycle = e0Var.getLifecycle();
        HashMap hashMap = qVar.f1384c;
        androidx.core.view.p pVar = (androidx.core.view.p) hashMap.remove(rVar);
        if (pVar != null) {
            pVar.f1373a.b(pVar.f1374b);
            pVar.f1374b = null;
        }
        hashMap.put(rVar, new androidx.core.view.p(lifecycle, new a2.g(1, qVar, rVar)));
    }

    @Override // android.view.ViewGroup
    public h4 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean z5 = layoutParams instanceof h4;
        if (z5) {
            h4 h4Var = (h4) layoutParams;
            h4 h4Var2 = new h4(h4Var);
            h4Var2.f769b = 0;
            h4Var2.f769b = h4Var.f769b;
            return h4Var2;
        }
        if (z5) {
            h4 h4Var3 = new h4((h4) layoutParams);
            h4Var3.f769b = 0;
            return h4Var3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            h4 h4Var4 = new h4(marginLayoutParams);
            h4Var4.f769b = 0;
            ((ViewGroup.MarginLayoutParams) h4Var4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) h4Var4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) h4Var4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) h4Var4).bottomMargin = marginLayoutParams.bottomMargin;
            return h4Var4;
        }
        h4 h4Var5 = new h4(layoutParams);
        h4Var5.f769b = 0;
        return h4Var5;
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull final androidx.core.view.r rVar, @NonNull androidx.lifecycle.e0 e0Var, @NonNull final androidx.lifecycle.x xVar) {
        final androidx.core.view.q qVar = this.mMenuHostHelper;
        qVar.getClass();
        androidx.lifecycle.y lifecycle = e0Var.getLifecycle();
        HashMap hashMap = qVar.f1384c;
        androidx.core.view.p pVar = (androidx.core.view.p) hashMap.remove(rVar);
        if (pVar != null) {
            pVar.f1373a.b(pVar.f1374b);
            pVar.f1374b = null;
        }
        hashMap.put(rVar, new androidx.core.view.p(lifecycle, new androidx.lifecycle.c0() { // from class: androidx.core.view.o
            @Override // androidx.lifecycle.c0
            public final void c(androidx.lifecycle.e0 e0Var2, androidx.lifecycle.w wVar) {
                q qVar2 = q.this;
                qVar2.getClass();
                Runnable runnable = qVar2.f1382a;
                CopyOnWriteArrayList copyOnWriteArrayList = qVar2.f1383b;
                androidx.lifecycle.w.Companion.getClass();
                androidx.lifecycle.x xVar2 = xVar;
                androidx.lifecycle.w c2 = androidx.lifecycle.u.c(xVar2);
                r rVar2 = rVar;
                if (wVar == c2) {
                    copyOnWriteArrayList.add(rVar2);
                    runnable.run();
                } else if (wVar == androidx.lifecycle.w.ON_DESTROY) {
                    qVar2.b(rVar2);
                } else if (wVar == androidx.lifecycle.u.a(xVar2)) {
                    copyOnWriteArrayList.remove(rVar2);
                    runnable.run();
                }
            }
        }));
    }

    public void setOnMenuItemClickListener(i4 i4Var) {
    }
}
