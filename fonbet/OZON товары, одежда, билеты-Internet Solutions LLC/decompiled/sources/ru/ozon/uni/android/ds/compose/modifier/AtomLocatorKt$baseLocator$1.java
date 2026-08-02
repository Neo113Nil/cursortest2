package ru.ozon.uni.android.ds.compose.modifier;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "ru/ozon/uni/android/ds/compose/modifier/AtomLocatorKt$baseLocator$1$1", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "defaultTag", "", "invoke", "(Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)Lru/ozon/uni/android/ds/compose/modifier/AtomLocatorKt$baseLocator$1$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class AtomLocatorKt$baseLocator$1 extends AbstractC7737t implements Function2<TestInfo, String, AnonymousClass1> {
    public static final AtomLocatorKt$baseLocator$1 INSTANCE = new AtomLocatorKt$baseLocator$1();

    AtomLocatorKt$baseLocator$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt$baseLocator$1$1] */
    @Override // kotlin.jvm.functions.Function2
    public final AnonymousClass1 invoke(TestInfo testInfo, String defaultTag) {
        Intrinsics.checkNotNullParameter(defaultTag, "defaultTag");
        return new Locator(testInfo, defaultTag) { // from class: ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt$baseLocator$1.1
        };
    }
}
