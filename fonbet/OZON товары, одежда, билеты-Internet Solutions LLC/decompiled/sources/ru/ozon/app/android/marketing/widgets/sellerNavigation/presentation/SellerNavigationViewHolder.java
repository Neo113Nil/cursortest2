package ru.ozon.app.android.marketing.widgets.sellerNavigation.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.databinding.WidgetSellerNavigationBinding;
import ru.ozon.app.android.marketing.widgets.sellerNavigation.presentation.SellerNavigationVO;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0015\u0010\u0019R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerNavigation/presentation/SellerNavigationViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/sellerNavigation/presentation/SellerNavigationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "view", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "<init>", "(Landroid/view/View;Ll10/b;)V", "tabViewOne", "", "id", "", "setTextViewId", "(Landroid/view/View;I)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/sellerNavigation/presentation/SellerNavigationVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/marketing/widgets/sellerNavigation/presentation/SellerNavigationVO;Ll20/d;Ljava/lang/Object;)V", "Ll10/b;", "Lcom/google/android/material/tabs/TabLayout$e;", "currentTab", "Lcom/google/android/material/tabs/TabLayout$e;", "Lru/ozon/app/android/marketing/databinding/WidgetSellerNavigationBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetSellerNavigationBinding;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerNavigationViewHolder extends k<SellerNavigationVO> {

    @NotNull
    private final WidgetSellerNavigationBinding binding;

    @NotNull
    private final InterfaceC7851b controller;
    private TabLayout.e currentTab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerNavigationViewHolder(@NotNull View view, @NotNull InterfaceC7851b controller) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
        WidgetSellerNavigationBinding bind = WidgetSellerNavigationBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    private final void setTextViewId(View tabViewOne, int id2) {
        Iterable<View> children;
        ViewGroup viewGroup = tabViewOne instanceof ViewGroup ? (ViewGroup) tabViewOne : null;
        if (viewGroup == null || (children = ViewGroupExtKt.children(viewGroup)) == null) {
            return;
        }
        for (View view : children) {
            if (view instanceof TextView) {
                ((TextView) view).setId(id2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerNavigationVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.tabsTl.o();
        for (SellerNavigationVO.Item item2 : item.getItems()) {
            TabLayout.e m11 = this.binding.tabsTl.m();
            m11.n(item2.getTitle());
            m11.m(item2.getDeeplink());
            Intrinsics.checkNotNullExpressionValue(m11, "apply(...)");
            if (item2.getIsActive()) {
                this.currentTab = m11;
            }
            this.binding.tabsTl.e(m11, item2.getIsActive());
        }
        int l11 = this.binding.tabsTl.l();
        for (int i11 = 0; i11 < l11; i11++) {
            if (this.binding.tabsTl.k(i11) != null) {
                if (i11 == 0) {
                    View childAt = this.binding.tabsTl.getChildAt(0);
                    Intrinsics.g(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                    View childAt2 = ((ViewGroup) childAt).getChildAt(i11);
                    childAt2.setId(R$id.tab_id_one);
                    setTextViewId(childAt2, R$id.text_id_one);
                } else if (i11 == 1) {
                    View childAt3 = this.binding.tabsTl.getChildAt(0);
                    Intrinsics.g(childAt3, "null cannot be cast to non-null type android.view.ViewGroup");
                    View childAt4 = ((ViewGroup) childAt3).getChildAt(i11);
                    childAt4.setId(R$id.tab_id_two);
                    setTextViewId(childAt4, R$id.text_id_two);
                } else if (i11 == 2) {
                    View childAt5 = this.binding.tabsTl.getChildAt(0);
                    Intrinsics.g(childAt5, "null cannot be cast to non-null type android.view.ViewGroup");
                    View childAt6 = ((ViewGroup) childAt5).getChildAt(i11);
                    childAt6.setId(R$id.tab_id_three);
                    setTextViewId(childAt6, R$id.text_id_three);
                }
            }
        }
        this.binding.tabsTl.c(new TabLayout.b() { // from class: ru.ozon.app.android.marketing.widgets.sellerNavigation.presentation.SellerNavigationViewHolder$bind$2
            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabReselected(TabLayout.e tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabSelected(TabLayout.e tab) {
                TabLayout.e eVar;
                InterfaceC7851b interfaceC7851b;
                Intrinsics.checkNotNullParameter(tab, "tab");
                eVar = SellerNavigationViewHolder.this.currentTab;
                if (Intrinsics.d(eVar != null ? eVar.e() : null, tab.e())) {
                    return;
                }
                String removeSchema = UriExtKt.removeSchema(String.valueOf(tab.e()));
                interfaceC7851b = SellerNavigationViewHolder.this.controller;
                InterfaceC7851b.a.a(interfaceC7851b, removeSchema, null, null, null, 14);
                SellerNavigationViewHolder.this.currentTab = tab;
            }

            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabUnselected(TabLayout.e tab) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerNavigationVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if ((payload instanceof Boolean) && ((Boolean) payload).booleanValue() && item.getItems().size() == this.binding.tabsTl.l()) {
            Iterator<SellerNavigationVO.Item> it = item.getItems().iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (it.next().getIsActive()) {
                    break;
                } else {
                    i11++;
                }
            }
            TabLayout.e k11 = this.binding.tabsTl.k(i11);
            if (k11 != null) {
                k11.i();
                return;
            }
            return;
        }
        bind(item, info);
    }
}
