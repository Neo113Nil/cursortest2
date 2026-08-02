package ru.ozon.app.android.cscore.orderlist.configurators;

import U7.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0005"}, d2 = {"generateOrderFilterUrl", "", "sortDeeplink", "yearDeeplinks", "", "csma_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderFiltersConfiguratorKt {
    @NotNull
    public static final String generateOrderFilterUrl(String str, @NotNull List<String> yearDeeplinks) {
        Intrinsics.checkNotNullParameter(yearDeeplinks, "yearDeeplinks");
        if (str != null && str.length() != 0) {
            return d.e(str, C7714v.V(yearDeeplinks, "", null, null, null, 62));
        }
        String str2 = (String) C7714v.M(yearDeeplinks);
        return str2 == null ? "" : str2;
    }
}
