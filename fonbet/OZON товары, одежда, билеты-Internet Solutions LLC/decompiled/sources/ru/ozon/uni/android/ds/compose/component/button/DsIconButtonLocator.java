package ru.ozon.uni.android.ds.compose.component.button;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonLocator;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "defaultTag", "", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)V", "icon", "Lkotlin/Function0;", "getIcon", "()Lkotlin/jvm/functions/Function0;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsIconButtonLocator extends Locator {

    @NotNull
    private final Function0<DsIconButtonLocator> icon;

    public /* synthetic */ DsIconButtonLocator(TestInfo testInfo, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : testInfo, (i11 & 2) != 0 ? "iconButton" : str);
    }

    @NotNull
    public final Function0<DsIconButtonLocator> getIcon() {
        return this.icon;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsIconButtonLocator(TestInfo testInfo, @NotNull String defaultTag) {
        super(testInfo, defaultTag);
        Intrinsics.checkNotNullParameter(defaultTag, "defaultTag");
        this.icon = new DsIconButtonLocator$icon$1(this);
    }
}
