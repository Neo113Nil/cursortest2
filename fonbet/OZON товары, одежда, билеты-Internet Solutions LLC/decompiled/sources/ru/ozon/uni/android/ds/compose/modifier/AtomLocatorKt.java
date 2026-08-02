package ru.ozon.uni.android.ds.compose.modifier;

import C1.m;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\".\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010*(\b\u0000\u0010\u0012\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00112\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/e;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "locator", "testTag", "(Landroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/modifier/Locator;)Landroidx/compose/ui/e;", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/data/TestInfo;", "", "baseLocator", "Lkotlin/jvm/functions/Function2;", "getBaseLocator", "()Lkotlin/jvm/functions/Function2;", "LC1/m;", "LocalDsTestTag", "LC1/m;", "getLocalDsTestTag", "()LC1/m;", "Lkotlin/Function1;", "AtomLocator", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AtomLocatorKt {

    @NotNull
    private static final Function2<TestInfo, String, Locator> baseLocator = AtomLocatorKt$baseLocator$1.INSTANCE;

    @NotNull
    private static final m<String> LocalDsTestTag = new m<>(AtomLocatorKt$LocalDsTestTag$1.INSTANCE);

    @NotNull
    public static final Function2<TestInfo, String, Locator> getBaseLocator() {
        return baseLocator;
    }

    @NotNull
    public static final m<String> getLocalDsTestTag() {
        return LocalDsTestTag;
    }

    @NotNull
    public static final e testTag(@NotNull e eVar, @NotNull Locator locator) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(locator, "locator");
        return eVar.l0(new TestInfoElement(locator));
    }
}
