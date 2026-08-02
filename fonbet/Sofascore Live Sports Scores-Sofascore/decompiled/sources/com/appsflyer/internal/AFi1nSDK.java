package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.BaseReferrerInitProvider;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerCreator;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import defpackage.dmi;
import defpackage.duf;
import defpackage.k13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFi1nSDK implements AFi1rSDK {
    @Override // com.appsflyer.internal.AFi1rSDK
    @NotNull
    public final List<Referrer> registerClient(@NotNull ReferrerProp referrerProp) {
        referrerProp.getClass();
        Set<Pair<ReferrerCreator<Referrer>, Class<? extends BaseReferrerInitProvider>>> externalReferrers = Referrer.INSTANCE.getExternalReferrers();
        ArrayList arrayList = new ArrayList(k13.r(externalReferrers, 10));
        Iterator<T> it = externalReferrers.iterator();
        while (it.hasNext()) {
            Referrer create = ((ReferrerCreator) ((Pair) it.next()).a).create(referrerProp);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REFERRER, dmi.q("External Referrer object created: ", duf.a.getOrCreateKotlinClass(create.getClass()).getSimpleName()), false, 4, null);
            arrayList.add(create);
        }
        return arrayList;
    }
}
