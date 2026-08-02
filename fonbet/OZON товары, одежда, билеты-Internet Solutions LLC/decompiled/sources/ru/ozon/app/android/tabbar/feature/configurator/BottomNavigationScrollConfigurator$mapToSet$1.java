package ru.ozon.app.android.tabbar.feature.configurator;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BottomNavigationScrollConfigurator$mapToSet$1 extends AbstractC7737t implements Function1<String, String> {
    public static final BottomNavigationScrollConfigurator$mapToSet$1 INSTANCE = new BottomNavigationScrollConfigurator$mapToSet$1();

    BottomNavigationScrollConfigurator$mapToSet$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return h.z0(it).toString();
    }
}
