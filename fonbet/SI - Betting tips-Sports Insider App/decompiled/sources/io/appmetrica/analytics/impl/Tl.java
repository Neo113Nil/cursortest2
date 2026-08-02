package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Tl {

    /* renamed from: a, reason: collision with root package name */
    public final Vl f12940a = new Vl();

    public final StartupParamsItem a(IdentifiersResult identifiersResult) {
        String str = identifiersResult.f15009id;
        Vl vl = this.f12940a;
        IdentifierStatus identifierStatus = identifiersResult.status;
        vl.getClass();
        int i5 = Ul.f12993a[identifierStatus.ordinal()];
        return new StartupParamsItem(str, i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? StartupParamsItemStatus.UNKNOWN_ERROR : StartupParamsItemStatus.FORBIDDEN_BY_CLIENT_CONFIG : StartupParamsItemStatus.FEATURE_DISABLED : StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER : StartupParamsItemStatus.PROVIDER_UNAVAILABLE : StartupParamsItemStatus.OK, identifiersResult.errorExplanation);
    }
}
