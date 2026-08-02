package ru.ozon.app.android.tabbar.feature.configurator;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BottomNavigationScrollConfigurator$mapToSet$2 extends AbstractC7737t implements Function1<String, Boolean> {
    public static final BottomNavigationScrollConfigurator$mapToSet$2 INSTANCE = new BottomNavigationScrollConfigurator$mapToSet$2();

    BottomNavigationScrollConfigurator$mapToSet$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.length() > 0);
    }
}
