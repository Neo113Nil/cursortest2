package ru.ozon.app.android.commonwidgets.widgets.tabs.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.commonwidgets.R$id;
import ru.ozon.app.android.common.commonwidgets.R$layout;
import ru.ozon.app.android.common.commonwidgets.databinding.WidgetCommonTabsBinding;
import ru.ozon.app.android.commonwidgets.widgets.tabs.presentation.TabsVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u001b\u0010\u0014\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\t*\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\t*\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\t*\u00020\u00122\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u00020\t*\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\t*\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J-\u0010*\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010(\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010.\u001a\u00020\u001a¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\t2\u0006\u00101\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b2\u00103J)\u0010\u0018\u001a\u00020\t2\u0006\u00101\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0018\u00104J\u001d\u00106\u001a\u00020\t2\u0006\u00101\u001a\u00020\f2\u0006\u00105\u001a\u00020\u001a¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\u00020\t2\u0006\u00101\u001a\u00020\f2\u0006\u00108\u001a\u00020!¢\u0006\u0004\b9\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsView;", "", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "", "Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsVO$TabsItemVO;", "items", "", "updateTabsIfNeeded", "(Ljava/util/List;)V", "", "diff", "addTabs", "(I)V", "removeTabs", "bindData", "Lcom/google/android/material/tabs/TabLayout$e;", "itemVO", "bind", "(Lcom/google/android/material/tabs/TabLayout$e;Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsVO$TabsItemVO;)V", "badge", "badgeColor", "updateBadge", "(Lcom/google/android/material/tabs/TabLayout$e;Ljava/lang/Integer;I)V", "", "isSelected", "setTabEnabled", "(Lcom/google/android/material/tabs/TabLayout$e;Z)V", "minWidth", "setMinWidth", "(Lcom/google/android/material/tabs/TabLayout$e;I)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTabTitle", "(Lcom/google/android/material/tabs/TabLayout$e;Ljava/lang/String;)V", "setTabDescription", "updateSelectedTabIndicator", "()V", "isScrollable", "scrollableMinWidth", "setupTabs", "(Ljava/util/List;ZLjava/lang/Integer;)V", "updateScrollingMode", "(Z)V", "scrollable", "updateMinWidth", "(Ljava/lang/Integer;Z)V", "tabIndex", "updateTitle", "(ILjava/lang/String;)V", "(ILjava/lang/Integer;I)V", "selected", "updateSelection", "(IZ)V", "deeplink", "updateDeeplink", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/common/commonwidgets/databinding/WidgetCommonTabsBinding;", "binding", "Lru/ozon/app/android/common/commonwidgets/databinding/WidgetCommonTabsBinding;", "Landroid/graphics/drawable/ColorDrawable;", "unselectedTabsIndicator$delegate", "LSc/j;", "getUnselectedTabsIndicator", "()Landroid/graphics/drawable/ColorDrawable;", "unselectedTabsIndicator", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabsView {

    @NotNull
    private final WidgetCommonTabsBinding binding;

    @NotNull
    private final View containerView;

    /* renamed from: unselectedTabsIndicator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j unselectedTabsIndicator;

    public TabsView(@NotNull View containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetCommonTabsBinding bind = WidgetCommonTabsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.unselectedTabsIndicator = k.a(n.NONE, TabsView$unselectedTabsIndicator$2.INSTANCE);
    }

    @SuppressLint({"InflateParams"})
    private final void addTabs(int diff) {
        LayoutInflater from = LayoutInflater.from(this.containerView.getContext());
        for (int i11 = 0; i11 < diff; i11++) {
            View inflate = from.inflate(R$layout.widget_common_tabs_item, (ViewGroup) null);
            TabLayout.e m11 = this.binding.tabsTl.m();
            m11.k(inflate);
            Intrinsics.checkNotNullExpressionValue(m11, "apply(...)");
            this.binding.tabsTl.e(m11, false);
        }
    }

    private final void bind(TabLayout.e eVar, TabsVO.TabsItemVO tabsItemVO) {
        eVar.m(tabsItemVO);
        if (tabsItemVO.getIsSelected()) {
            eVar.i();
        }
        setTabTitle(eVar, tabsItemVO.getTitle());
        setTabDescription(eVar, tabsItemVO.getTitle());
        setTabEnabled(eVar, tabsItemVO.getIsSelected());
    }

    private final void bindData(List<TabsVO.TabsItemVO> items) {
        boolean z11 = false;
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TabsVO.TabsItemVO tabsItemVO = (TabsVO.TabsItemVO) obj;
            TabLayout.e k11 = this.binding.tabsTl.k(i11);
            if (k11 != null) {
                k11.j("tab" + i11);
                bind(k11, tabsItemVO);
                updateBadge(k11, tabsItemVO.getBadge(), tabsItemVO.getBadgeColor());
                if (tabsItemVO.getIsSelected()) {
                    z11 = true;
                }
            }
            i11 = i12;
        }
        if (z11) {
            return;
        }
        this.binding.tabsTl.s(null, true);
    }

    private final ColorDrawable getUnselectedTabsIndicator() {
        return (ColorDrawable) this.unselectedTabsIndicator.getValue();
    }

    private final void removeTabs(int diff) {
        int abs = Math.abs(diff);
        for (int i11 = 0; i11 < abs; i11++) {
            this.binding.tabsTl.q(this.binding.tabsTl.l() - i11);
        }
    }

    private final void setMinWidth(TabLayout.e eVar, int i11) {
        ConstraintLayout constraintLayout;
        View c11 = eVar.c();
        if (c11 == null || (constraintLayout = (ConstraintLayout) c11.findViewById(R$id.tabContainer)) == null) {
            return;
        }
        constraintLayout.setMinWidth(ResourceExtKt.toPx(i11));
    }

    private final void setTabDescription(TabLayout.e eVar, String str) {
        ConstraintLayout constraintLayout;
        View c11 = eVar.c();
        if (c11 == null || (constraintLayout = (ConstraintLayout) c11.findViewById(R$id.tabContainer)) == null) {
            return;
        }
        constraintLayout.setContentDescription(str);
    }

    private final void setTabEnabled(TabLayout.e eVar, boolean z11) {
        TextView textView;
        View c11 = eVar.c();
        if (c11 == null || (textView = (TextView) c11.findViewById(R$id.pointTv)) == null) {
            return;
        }
        textView.setEnabled(z11);
    }

    private final void setTabTitle(TabLayout.e eVar, String str) {
        TextView textView;
        View c11 = eVar.c();
        if (c11 == null || (textView = (TextView) c11.findViewById(R$id.pointTv)) == null) {
            return;
        }
        textView.setText(str);
    }

    private final void updateSelectedTabIndicator() {
        this.binding.tabsTl.v(this.binding.tabsTl.j() < 0 ? getUnselectedTabsIndicator() : null);
    }

    private final void updateTabsIfNeeded(List<TabsVO.TabsItemVO> items) {
        int size = items.size() - this.binding.tabsTl.l();
        if (size == 0) {
            return;
        }
        if (size > 0) {
            addTabs(size);
        } else {
            removeTabs(size);
        }
    }

    public final void setupTabs(@NotNull List<TabsVO.TabsItemVO> items, boolean isScrollable, Integer scrollableMinWidth) {
        Intrinsics.checkNotNullParameter(items, "items");
        updateTabsIfNeeded(items);
        bindData(items);
        updateScrollingMode(isScrollable);
        updateMinWidth(scrollableMinWidth, isScrollable);
        updateSelectedTabIndicator();
    }

    public final void updateBadge(int tabIndex, Integer badge, int badgeColor) {
        TextView textView;
        TabLayout.e k11 = this.binding.tabsTl.k(tabIndex);
        if (k11 == null) {
            return;
        }
        updateBadge(k11, badge, badgeColor);
        View c11 = k11.c();
        if (c11 == null || (textView = (TextView) c11.findViewById(R$id.badgeTv)) == null) {
            return;
        }
        textView.requestLayout();
    }

    public final void updateDeeplink(int tabIndex, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        TabLayout.e k11 = this.binding.tabsTl.k(tabIndex);
        if (k11 != null) {
            k11.m(deeplink);
        }
    }

    public final void updateMinWidth(Integer minWidth, boolean scrollable) {
        if (scrollable) {
            int l11 = this.binding.tabsTl.l();
            for (int i11 = 0; i11 < l11; i11++) {
                TabLayout.e k11 = this.binding.tabsTl.k(i11);
                if (k11 == null) {
                    return;
                }
                if (minWidth != null) {
                    setMinWidth(k11, minWidth.intValue());
                }
            }
        }
    }

    public final void updateScrollingMode(boolean isScrollable) {
        if (isScrollable) {
            this.binding.tabsTl.x(0);
        } else {
            this.binding.tabsTl.x(1);
        }
    }

    public final void updateSelection(int tabIndex, boolean selected) {
        TabLayout.e k11 = this.binding.tabsTl.k(tabIndex);
        if (k11 != null) {
            setTabEnabled(k11, selected);
        }
        updateSelectedTabIndicator();
    }

    public final void updateTitle(int tabIndex, @NotNull String title) {
        TextView textView;
        Intrinsics.checkNotNullParameter(title, "title");
        TabLayout.e k11 = this.binding.tabsTl.k(tabIndex);
        if (k11 == null) {
            return;
        }
        setTabTitle(k11, title);
        View c11 = k11.c();
        if (c11 == null || (textView = (TextView) c11.findViewById(R$id.pointTv)) == null) {
            return;
        }
        textView.requestLayout();
    }

    private final void updateBadge(TabLayout.e eVar, Integer num, int i11) {
        TextView textView;
        View c11 = eVar.c();
        if (c11 == null || (textView = (TextView) c11.findViewById(R$id.badgeTv)) == null) {
            return;
        }
        String num2 = num != null ? num.toString() : null;
        textView.setTextColor(i11);
        TextViewExtKt.setTextOrGone(textView, num2);
        textView.setContentDescription(num2);
    }
}
