package ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces;

import androidx.annotation.Keep;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0007¨\u0006\u0003"}, d2 = {"toCbottomElement2", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/interfaces/CbottomElement2;", "", "cbottom-base_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CbottomElement2Kt {
    @Keep
    public static final CbottomElement2 toCbottomElement2(String str) {
        if (str == null) {
            return null;
        }
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return CbottomElement2.valueOf(upperCase);
        } catch (Exception unused) {
            return null;
        }
    }
}
