package ru.ozon.uni.android.ds.compose.component.tabs;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tabs/DsTabsLocator;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "defaultTag", "", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)V", "tab", "Lkotlin/Function1;", "", "getTab", "()Lkotlin/jvm/functions/Function1;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class DsTabsLocator extends Locator {

    @NotNull
    private final Function1<Integer, Locator> tab;

    public /* synthetic */ DsTabsLocator(TestInfo testInfo, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : testInfo, (i11 & 2) != 0 ? DynamicElementDTO.TABS : str);
    }

    @NotNull
    public final Function1<Integer, Locator> getTab() {
        return this.tab;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsTabsLocator(TestInfo testInfo, @NotNull String defaultTag) {
        super(testInfo, defaultTag);
        Intrinsics.checkNotNullParameter(defaultTag, "defaultTag");
        this.tab = new DsTabsLocator$tab$1(this);
    }
}
