package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max;

import EE.a;
import Hj.C3143a;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.core.view.G;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.CatalogTabsV2VO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max.CloudTabsLayout;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002-.B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0007J\u0014\u0010 \u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010#\u001a\u00020\u0018J\b\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020\u0018H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000eH\u0002J\u0014\u0010)\u001a\u00020\u0018*\u00020*2\u0006\u0010+\u001a\u00020,H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CloudTabsLayout;", "Lcom/google/android/flexbox/FlexboxLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cloudTabsCallbacks", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CloudTabsLayout$CloudTabsCallbacks;", "currentTabs", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "moreTab", "rowsCount", "betweenMargin", "isExpanded", "", "tabsViewStore", "", "Landroid/view/View;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setCloudTabsCallbacks", "setRowsCount", "setMoreTab", "setTabsMargin", "between", "setTabs", DynamicElementDTO.TABS, "setMode", "invalidateAllTabs", "animateTabsAppearance", "setupExpandedMode", "setupCompactMode", "getOrCreateTabButton", "tab", "setCornerRadius", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "radius", "", "CloudTabsCallbacks", "ChildInfo", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CloudTabsLayout extends FlexboxLayout {
    private int betweenMargin;
    private CloudTabsCallbacks cloudTabsCallbacks;

    @NotNull
    private List<CatalogTabsV2VO.Tab> currentTabs;
    private boolean isExpanded;
    private CatalogTabsV2VO.Tab moreTab;
    private int rowsCount;

    @NotNull
    private final Map<CatalogTabsV2VO.Tab, View> tabsViewStore;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CloudTabsLayout$ChildInfo;", "", "Landroid/view/View;", "view", "", "fullWidth", "<init>", "(Landroid/view/View;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/view/View;", "getView", "()Landroid/view/View;", "I", "getFullWidth", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class ChildInfo {
        private final int fullWidth;

        @NotNull
        private final View view;

        public ChildInfo(@NotNull View view, int i11) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.fullWidth = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChildInfo)) {
                return false;
            }
            ChildInfo childInfo = (ChildInfo) other;
            return Intrinsics.d(this.view, childInfo.view) && this.fullWidth == childInfo.fullWidth;
        }

        public final int getFullWidth() {
            return this.fullWidth;
        }

        public int hashCode() {
            return Integer.hashCode(this.fullWidth) + (this.view.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ChildInfo(view=" + this.view + ", fullWidth=" + this.fullWidth + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/max/CloudTabsLayout$CloudTabsCallbacks;", "", "onView", "Lkotlin/Function1;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "", "getOnView", "()Lkotlin/jvm/functions/Function1;", "onClick", "getOnClick", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CloudTabsCallbacks {
        @NotNull
        Function1<CatalogTabsV2VO.Tab, Unit> getOnClick();

        @NotNull
        Function1<CatalogTabsV2VO.Tab, Unit> getOnView();
    }

    public /* synthetic */ CloudTabsLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void animateTabsAppearance() {
        if (getChildCount() == 0) {
            return;
        }
        int childCount = getChildCount() - 1;
        removeViewAt(childCount);
        int P11 = C7714v.P(this.currentTabs);
        if (childCount > P11) {
            return;
        }
        while (true) {
            View orCreateTabButton = getOrCreateTabButton(this.currentTabs.get(childCount));
            orCreateTabButton.setAlpha(0.0f);
            orCreateTabButton.setVisibility(0);
            orCreateTabButton.animate().alpha(1.0f).setDuration(300L).setListener(null).start();
            addView(orCreateTabButton);
            if (childCount == P11) {
                return;
            } else {
                childCount++;
            }
        }
    }

    private final View getOrCreateTabButton(CatalogTabsV2VO.Tab tab) {
        TagButtonDTO copy;
        copy = r1.copy((r34 & 1) != 0 ? r1.styleType : null, (r34 & 2) != 0 ? r1.size : null, (r34 & 4) != 0 ? r1.isSelected : Boolean.FALSE, (r34 & 8) != 0 ? r1.isDisabled : null, (r34 & 16) != 0 ? r1.isClosable : null, (r34 & 32) != 0 ? r1.icon : null, (r34 & 64) != 0 ? r1.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r1.indicator : null, (r34 & 256) != 0 ? r1.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r1.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r1.common : null, (r34 & 2048) != 0 ? r1.closeControlSettings : null, (r34 & 4096) != 0 ? r1.context : null, (r34 & 8192) != 0 ? r1.isStateChangeDisabled : null, (r34 & 16384) != 0 ? r1.image : null, (r34 & 32768) != 0 ? tab.getTagButton().round : null);
        final CatalogTabsV2VO.Tab copy$default = CatalogTabsV2VO.Tab.copy$default(tab, 0, false, 0, copy, null, 23, null);
        View view = this.tabsViewStore.get(copy$default);
        if (view == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            final TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
            tagButtonView.setLayoutParams(new FlexboxLayout.a(-2, -2));
            TagButtonHolderKt.bindOrGone$default(tagButtonView, copy$default.getTagButton(), null, 2, null);
            setCornerRadius(tagButtonView, UiExtKt.toPxF(copy$default.getTagRadius()));
            G.a(tagButtonView, new Runnable() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max.CloudTabsLayout$getOrCreateTabButton$lambda$12$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    CloudTabsLayout.CloudTabsCallbacks cloudTabsCallbacks;
                    cloudTabsCallbacks = this.cloudTabsCallbacks;
                    if (cloudTabsCallbacks != null) {
                        cloudTabsCallbacks.getOnView().invoke(copy$default);
                    }
                }
            });
            tagButtonView.setOnClickListener(new a(6, this, copy$default));
            view = tagButtonView;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = this.betweenMargin;
        marginLayoutParams.rightMargin = i11;
        marginLayoutParams.bottomMargin = i11;
        view.setLayoutParams(marginLayoutParams);
        this.tabsViewStore.put(copy$default, view);
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateTabButton$lambda$12$lambda$11(CloudTabsLayout cloudTabsLayout, CatalogTabsV2VO.Tab tab, View view) {
        CloudTabsCallbacks cloudTabsCallbacks = cloudTabsLayout.cloudTabsCallbacks;
        if (cloudTabsCallbacks != null) {
            cloudTabsCallbacks.getOnClick().invoke(tab);
        }
    }

    private final void setCornerRadius(TagButtonView tagButtonView, final float f7) {
        tagButtonView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.max.CloudTabsLayout$setCornerRadius$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), f7);
            }
        });
        tagButtonView.setClipToOutline(true);
    }

    private final void setupCompactMode() {
        Iterator<T> it = this.currentTabs.iterator();
        while (it.hasNext()) {
            addView(getOrCreateTabButton((CatalogTabsV2VO.Tab) it.next()));
        }
        CatalogTabsV2VO.Tab tab = this.moreTab;
        if (tab != null) {
            addView(getOrCreateTabButton(tab));
        }
    }

    private final void setupExpandedMode() {
        Iterator<T> it = this.currentTabs.iterator();
        while (it.hasNext()) {
            View orCreateTabButton = getOrCreateTabButton((CatalogTabsV2VO.Tab) it.next());
            orCreateTabButton.setVisibility(0);
            addView(orCreateTabButton);
        }
    }

    public final void invalidateAllTabs() {
        removeAllViews();
        if (this.isExpanded || this.rowsCount >= Integer.MAX_VALUE) {
            setupExpandedMode();
        } else {
            setupCompactMode();
        }
    }

    @Override // com.google.android.flexbox.FlexboxLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        CatalogTabsV2VO.Tab tab = this.moreTab;
        if (this.isExpanded || tab == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        View orCreateTabButton = getOrCreateTabButton(tab);
        if (getChildCount() != 0 && getChildAt(getChildCount() - 1) != orCreateTabButton) {
            removeView(orCreateTabButton);
            addView(orCreateTabButton);
        }
        int size = (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = new ArrayList();
        Iterator<View> it = C5316f0.b(this).iterator();
        int i11 = 0;
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                break;
            }
            View view = (View) c5314e0.next();
            measureChildWithMargins(view, widthMeasureSpec, 0, heightMeasureSpec, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int measuredWidth = view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            if (view == this.tabsViewStore.get(this.moreTab)) {
                i11 = measuredWidth;
            } else {
                arrayList.add(new ChildInfo(view, measuredWidth));
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (it2.hasNext()) {
            int i15 = i13 + 1;
            ChildInfo childInfo = (ChildInfo) it2.next();
            if (i12 > this.rowsCount) {
                break;
            }
            i14 += childInfo.getFullWidth();
            int i16 = this.rowsCount;
            if (i12 >= i16 ? i14 <= size - i11 : i14 <= size) {
                linkedHashSet.add(Integer.valueOf(i13));
            } else {
                if (i12 >= i16) {
                    break;
                }
                i12++;
                i14 = childInfo.getFullWidth();
                linkedHashSet.add(Integer.valueOf(i13));
            }
            i13 = i15;
        }
        Iterator<View> it3 = C5316f0.b(this).iterator();
        int i17 = 0;
        while (true) {
            C5314e0 c5314e02 = (C5314e0) it3;
            int i18 = 8;
            if (!c5314e02.hasNext()) {
                orCreateTabButton.setVisibility(linkedHashSet.size() >= l.d(C5316f0.b(this)) - 1 ? 8 : 0);
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                return;
            }
            Object next = c5314e02.next();
            int i19 = i17 + 1;
            if (i17 < 0) {
                C7714v.O0();
                throw null;
            }
            View view2 = (View) next;
            if (linkedHashSet.contains(Integer.valueOf(i17))) {
                i18 = 0;
            }
            view2.setVisibility(i18);
            i17 = i19;
        }
    }

    public final void setCloudTabsCallbacks(@NotNull CloudTabsCallbacks cloudTabsCallbacks) {
        Intrinsics.checkNotNullParameter(cloudTabsCallbacks, "cloudTabsCallbacks");
        this.cloudTabsCallbacks = cloudTabsCallbacks;
    }

    public final void setMode(boolean isExpanded) {
        if (!isExpanded || this.isExpanded) {
            this.isExpanded = isExpanded;
        } else {
            this.isExpanded = isExpanded;
            animateTabsAppearance();
        }
    }

    public final void setMoreTab(@NotNull CatalogTabsV2VO.Tab moreTab) {
        Intrinsics.checkNotNullParameter(moreTab, "moreTab");
        this.moreTab = moreTab;
    }

    public final void setRowsCount(int rowsCount) {
        this.rowsCount = rowsCount;
    }

    public final void setTabs(@NotNull List<CatalogTabsV2VO.Tab> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Iterator it = e0.d(this.tabsViewStore.keySet(), tabs).iterator();
        while (it.hasNext()) {
            this.tabsViewStore.remove((CatalogTabsV2VO.Tab) it.next());
        }
        this.currentTabs = tabs;
    }

    public final void setTabsMargin(int between) {
        this.betweenMargin = between;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudTabsLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentTabs = K.f71697a;
        this.rowsCount = Integer.MAX_VALUE;
        this.tabsViewStore = new LinkedHashMap();
        setFlexDirection(0);
        setFlexWrap(1);
        setAlignItems(4);
    }
}
