package ru.ozon.app.android.cabinet.tabSelector.presentation;

import IU.e;
import android.R;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.R$id;
import ru.ozon.app.android.cabinet.databinding.WidgetTabsBinding;
import ru.ozon.app.android.cabinet.tabSelector.presentation.TabSelectorVO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 '2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001'B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerBus", "<init>", "(Landroid/view/View;Ll10/b;)V", "", "tabsCount", "", "updateTabsCount", "(I)V", "", "Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorVO$TabSelectorItemVO;", DynamicElementDTO.TABS, "updateTabsContent", "(Ljava/util/List;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorVO;Ll20/d;)V", "Ll10/b;", "Landroid/content/res/ColorStateList;", "tabTitleColorState", "Landroid/content/res/ColorStateList;", "getTabTitleColorState", "()Landroid/content/res/ColorStateList;", "Lru/ozon/app/android/cabinet/databinding/WidgetTabsBinding;", "binding", "Lru/ozon/app/android/cabinet/databinding/WidgetTabsBinding;", "", "isTechnicalSelect", "Z", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabSelectorViewHolder extends k<TabSelectorVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int horizontalPadding = ResourceExtKt.toPx(8);

    @NotNull
    private final WidgetTabsBinding binding;

    @NotNull
    private final InterfaceC7851b composerBus;
    private boolean isTechnicalSelect;

    @NotNull
    private final ColorStateList tabTitleColorState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorViewHolder$Companion;", "", "<init>", "()V", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabSelectorViewHolder(@NotNull View containerView, @NotNull InterfaceC7851b composerBus) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerBus, "composerBus");
        this.composerBus = composerBus;
        this.tabTitleColorState = new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{-16842913}}, new int[]{ThemeExtKt.themeColor(getContext(), R$attr.textPrimary), ThemeExtKt.themeColor(getContext(), R$attr.textSecondary)});
        WidgetTabsBinding bind = WidgetTabsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        TabLayout tabsWidgetTabLayout = bind.tabsWidgetTabLayout;
        Intrinsics.checkNotNullExpressionValue(tabsWidgetTabLayout, "tabsWidgetTabLayout");
        tabsWidgetTabLayout.c(new TabLayout.b() { // from class: ru.ozon.app.android.cabinet.tabSelector.presentation.TabSelectorViewHolder$special$$inlined$addTabSelectedListeners$default$1
            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabReselected(TabLayout.e tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
            }

            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabSelected(TabLayout.e tab) {
                boolean z11;
                InterfaceC7851b interfaceC7851b;
                Intrinsics.checkNotNullParameter(tab, "tab");
                z11 = TabSelectorViewHolder.this.isTechnicalSelect;
                if (z11) {
                    TabSelectorViewHolder.this.isTechnicalSelect = false;
                    return;
                }
                String valueOf = String.valueOf(tab.e());
                interfaceC7851b = TabSelectorViewHolder.this.composerBus;
                InterfaceC7851b.a.a(interfaceC7851b, valueOf, null, null, null, 14);
            }

            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabUnselected(TabLayout.e tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
            }
        });
        if (AppTokensProvider.INSTANCE.isSelect(getContext())) {
            TabLayout tabLayout = bind.tabsWidgetTabLayout;
            int i11 = horizontalPadding;
            tabLayout.setPadding(i11, 0, i11, 0);
        }
    }

    private final void updateTabsContent(List<TabSelectorVO.TabSelectorItemVO> tabs) {
        int i11 = 0;
        for (Object obj : tabs) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TabSelectorVO.TabSelectorItemVO tabSelectorItemVO = (TabSelectorVO.TabSelectorItemVO) obj;
            TabLayout.e k11 = this.binding.tabsWidgetTabLayout.k(i11);
            if (k11 != null) {
                Object e11 = k11.e();
                if (!Intrinsics.d(e11 instanceof String ? (String) e11 : null, tabSelectorItemVO.getDeeplink())) {
                    if (AppTokensProvider.INSTANCE.isSelect(getContext())) {
                        View c11 = k11.c();
                        AppCompatTextView appCompatTextView = c11 instanceof AppCompatTextView ? (AppCompatTextView) c11 : null;
                        if (appCompatTextView != null) {
                            appCompatTextView.setText(tabSelectorItemVO.getTitle());
                        }
                    } else {
                        k11.n(tabSelectorItemVO.getTitle());
                    }
                    k11.m(tabSelectorItemVO.getDeeplink());
                }
                if (tabSelectorItemVO.getIsSelected() && !k11.g()) {
                    this.binding.tabsWidgetTabLayout.post(new e(2, this, k11));
                }
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTabsContent$lambda$5$lambda$4$lambda$3(TabSelectorViewHolder tabSelectorViewHolder, TabLayout.e eVar) {
        tabSelectorViewHolder.isTechnicalSelect = true;
        eVar.i();
    }

    private final void updateTabsCount(int tabsCount) {
        if (tabsCount - this.binding.tabsWidgetTabLayout.l() == 0) {
            return;
        }
        this.binding.tabsWidgetTabLayout.o();
        for (int i11 = 0; i11 < tabsCount; i11++) {
            TabLayout.e m11 = this.binding.tabsWidgetTabLayout.m();
            m11.f58580g.setId(R$id.tabSelectorTab);
            if (AppTokensProvider.INSTANCE.isSelect(getContext())) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                appCompatTextView.setTextAppearance(R$style.TextStyle_Body_M_Bold);
                appCompatTextView.setTextColor(this.tabTitleColorState);
                m11.k(appCompatTextView);
            }
            Intrinsics.checkNotNullExpressionValue(m11, "apply(...)");
            this.binding.tabsWidgetTabLayout.e(m11, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TabSelectorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        updateTabsCount(item.getTabs().size());
        updateTabsContent(item.getTabs());
    }
}
