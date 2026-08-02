package ru.ozon.app.android.storefront.widgets.navbarv2.core;

import Xc.a;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.navbarv2.data.ShellNavBarDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/HashSet;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ShellNavBarConfig$supportedPlaceholders$2 extends AbstractC7737t implements Function0<HashSet<String>> {
    public static final ShellNavBarConfig$supportedPlaceholders$2 INSTANCE = new ShellNavBarConfig$supportedPlaceholders$2();

    ShellNavBarConfig$supportedPlaceholders$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HashSet<String> invoke() {
        a<ShellNavBarDTO.NestedPlaceholders> entries = ShellNavBarDTO.NestedPlaceholders.getEntries();
        HashSet<String> hashSet = new HashSet<>();
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            hashSet.add(((ShellNavBarDTO.NestedPlaceholders) it.next()).getValue());
        }
        return hashSet;
    }
}
