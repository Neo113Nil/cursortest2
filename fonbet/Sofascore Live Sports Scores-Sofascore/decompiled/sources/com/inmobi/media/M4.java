package com.inmobi.media;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.inmobi.media.core.config.models.Config;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class M4 implements A4 {
    @Override // com.inmobi.media.A4
    public final void a(Config config) {
        config.getClass();
        synchronized (this) {
            try {
                S4 s4 = S4.a;
                String str = S4.f;
                List<String> skipFields = S4.c().getContextualData().getSkipFields();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(T4.j);
                arrayList.removeAll(skipFields);
                String f0 = CollectionsKt.f0(arrayList, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
                S4.f = f0;
                if (!f0.equals(str)) {
                    s4.f();
                }
                S4.a();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
