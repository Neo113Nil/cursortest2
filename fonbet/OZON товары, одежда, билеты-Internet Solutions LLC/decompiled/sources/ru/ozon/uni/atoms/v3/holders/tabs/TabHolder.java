package ru.ozon.uni.atoms.v3.holders.tabs;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.view.atoms.tabs.TabAtomView;
import ru.ozon.uni.android.uikit.view.atoms.tabs.TabItemElement;
import ru.ozon.uni.android.uikit.view.atoms.tabs.TabModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.tabs.TabHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u001e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/tabs/TabHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/tabs/Tabs;", "Lru/ozon/uni/android/uikit/view/atoms/tabs/TabAtomView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/tabs/TabAtomView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "setTabActions", "tabAtomView", "tabItems", "", "Lru/ozon/uni/atoms/data/tabs/Tabs$TabsItem;", "mapToTabModel", "Lru/ozon/uni/android/uikit/view/atoms/tabs/TabModel;", "items", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TabHolder extends AtomV3<Tabs, TabAtomView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabHolder(@NotNull TabAtomView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final List<TabModel> mapToTabModel(List<Tabs.TabsItem> items) {
        List<Tabs.TabsItem> list = items;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (Tabs.TabsItem tabsItem : list) {
            arrayList.add(new TabModel(tabsItem.getText(), tabsItem.isSelected()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTabActions(TabAtomView tabAtomView, final List<Tabs.TabsItem> tabItems) {
        int childCount = tabAtomView.getChildCount();
        for (final int i11 = 0; i11 < childCount; i11++) {
            View childAt = tabAtomView.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            if (childAt instanceof TabItemElement) {
                ((TabItemElement) childAt).setSelected(tabItems.get(i11).isSelected());
                childAt.setOnClickListener(new View.OnClickListener() { // from class: il0.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TabHolder.setTabActions$lambda$5$lambda$4(tabItems, i11, this, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTabActions$lambda$5$lambda$4(List list, int i11, TabHolder tabHolder, View view) {
        AtomAction atomAction;
        AtomActionDTO action = ((Tabs.TabsItem) list.get(i11)).getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, ((Tabs.TabsItem) list.get(i11)).getTrackingInfo())) == null) {
            return;
        }
        tabHolder.handleAction(atomAction);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabHolder(@NotNull Context context, String str) {
        this(new TabAtomView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Tabs item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((TabHolder) item);
        for (Tabs.TabsItem tabsItem : item.getTabItems()) {
            if (tabsItem.getAction() != null) {
                handleAction(new AtomAction.ViewAction(tabsItem.getTrackingInfo(), null, 2, null));
            }
        }
        TabAtomView containerView = getContainerView();
        List<Tabs.TabsItem> L02 = C7714v.L0(3, item.getTabItems());
        containerView.addTabs(mapToTabModel(L02), item.getSelectedBackgroundColor(), item.getBackgroundColor(), new TabHolder$onBind$2$1(this, containerView, L02));
    }
}
