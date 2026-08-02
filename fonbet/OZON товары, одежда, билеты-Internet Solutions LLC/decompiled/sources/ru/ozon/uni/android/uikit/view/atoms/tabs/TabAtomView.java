package ru.ozon.uni.android.uikit.view.atoms.tabs;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015J\u0016\u0010\u0016\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/tabs/TabAtomView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "addTabs", "", DynamicElementDTO.TABS, "", "Lru/ozon/uni/android/uikit/view/atoms/tabs/TabModel;", "selectedBackgroundColor", "", "backgroundColor", "onSetTabActions", "Lkotlin/Function0;", "addSeparators", "createSeparator", "Landroid/view/View;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TabAtomView extends LinearLayout implements AtomView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabAtomView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addSeparators(List<TabModel> tabs) {
        if (tabs.size() != 3) {
            return;
        }
        Iterator<TabModel> it = tabs.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getIsSelected()) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == tabs.indexOf(C7714v.K(tabs))) {
            addView(createSeparator(), 2);
        } else if (i11 == tabs.indexOf(C7714v.X(tabs))) {
            addView(createSeparator(), 1);
        }
    }

    private final View createSeparator() {
        View view = new View(getContext());
        view.setBackgroundResource(R$drawable.tab_separator_line);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(context, 0.5f);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        view.setLayoutParams(new LinearLayout.LayoutParams(px, ResourceExtKt.toPx(context2, 12.0f)));
        return view;
    }

    public final void addTabs(@NotNull List<TabModel> tabs, String selectedBackgroundColor, String backgroundColor, @NotNull Function0<Unit> onSetTabActions) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(onSetTabActions, "onSetTabActions");
        removeAllViews();
        setWeightSum(tabs.size());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundResource(UniGlobalConfigKt.getRoundCornersFlag(context) ? R$drawable.select_tabs_rounded_bg : R$drawable.tabs_rounded_bg);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ViewExtKt.setBackgroundTint(this, styleParser.parseColor(context2, backgroundColor, StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY));
        int i11 = 0;
        for (Object obj : tabs) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TabModel tabModel = (TabModel) obj;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            TabItemElement tabItemElement = new TabItemElement(context3, null, 0, 6, null);
            tabItemElement.setText(tabModel.getTitle());
            tabItemElement.setContentDescription("tab_" + i12);
            tabItemElement.setBackgroundColor(tabModel.getIsSelected(), selectedBackgroundColor);
            addView(tabItemElement);
            i11 = i12;
        }
        onSetTabActions.invoke();
        addSeparators(tabs);
    }

    public /* synthetic */ TabAtomView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabAtomView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        setGravity(16);
        setOrientation(0);
    }
}
