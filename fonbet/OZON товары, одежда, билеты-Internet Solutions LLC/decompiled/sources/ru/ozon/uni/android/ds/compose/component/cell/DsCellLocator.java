package ru.ozon.uni.android.ds.compose.component.cell;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/DsCellLocator;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "defaultTag", "", "<init>", "(Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)V", "leftBlock", "Lkotlin/Function0;", "getLeftBlock", "()Lkotlin/jvm/functions/Function0;", "centerBlock", "getCenterBlock", "rightBlock", "getRightBlock", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsCellLocator extends Locator {

    @NotNull
    private final Function0<Locator> centerBlock;

    @NotNull
    private final Function0<Locator> leftBlock;

    @NotNull
    private final Function0<Locator> rightBlock;

    public /* synthetic */ DsCellLocator(TestInfo testInfo, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : testInfo, (i11 & 2) != 0 ? "cell" : str);
    }

    @NotNull
    public final Function0<Locator> getCenterBlock() {
        return this.centerBlock;
    }

    @NotNull
    public final Function0<Locator> getLeftBlock() {
        return this.leftBlock;
    }

    @NotNull
    public final Function0<Locator> getRightBlock() {
        return this.rightBlock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsCellLocator(TestInfo testInfo, @NotNull String defaultTag) {
        super(testInfo, defaultTag);
        Intrinsics.checkNotNullParameter(defaultTag, "defaultTag");
        this.leftBlock = new DsCellLocator$leftBlock$1(this);
        this.centerBlock = new DsCellLocator$centerBlock$1(this);
        this.rightBlock = new DsCellLocator$rightBlock$1(this);
    }
}
