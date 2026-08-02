package defpackage;

import com.blaze.blazesdk.app_configurations.models.ads.c;
import com.blaze.blazesdk.app_configurations.models.ads.d;
import com.blaze.blazesdk.app_configurations.models.ads.e;
import com.blaze.blazesdk.app_configurations.models.ads.f;
import com.blaze.blazesdk.app_configurations.models.ads.g;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class b4m {
    public static final String a(c.b bVar) {
        g gVar = bVar.a;
        if (gVar instanceof e) {
            return fc6.h(((e) gVar).a, " stories", new StringBuilder("every "));
        }
        if (gVar instanceof f) {
            return "fixed pages: ".concat(CollectionsKt.f0(((f) gVar).a, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, U3.j.d, U3.j.e, null, 56));
        }
        if (gVar instanceof d) {
            return fc6.h(((d) gVar).a, " pages", new StringBuilder("every "));
        }
        zzl.b();
        return null;
    }
}
