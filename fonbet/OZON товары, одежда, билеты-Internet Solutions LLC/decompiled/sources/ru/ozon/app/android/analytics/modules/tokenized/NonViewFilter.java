package ru.ozon.app.android.analytics.modules.tokenized;

import Sc.InterfaceC3999a;
import WZ.i;
import WZ.s;
import WZ.u;
import YZ.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\f\u001a\u0018\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\u001c\u0010\t\u001a\u0018\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/analytics/modules/tokenized/NonViewFilter;", "LWZ/i;", "<init>", "()V", "", "LYZ/a;", "Lru/ozon/app/android/analytics/modules/tokenized/payloadprocessing/base/PayloadType;", "", "LWZ/s;", "events", "LWZ/u;", "tokenizedViewPool", "filterEvents", "(Ljava/util/Map;LWZ/u;)Ljava/util/Map;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NonViewFilter extends i {

    @NotNull
    public static final NonViewFilter INSTANCE = new NonViewFilter();

    private NonViewFilter() {
    }

    @Override // WZ.i
    @NotNull
    public Map<a, List<s>> filterEvents(@NotNull Map<a, ? extends List<s>> events, @NotNull u tokenizedViewPool) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(tokenizedViewPool, "tokenizedViewPool");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<a, ? extends List<s>> entry : events.entrySet()) {
            if (!h.e0(entry.getKey().b(), "view", true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
