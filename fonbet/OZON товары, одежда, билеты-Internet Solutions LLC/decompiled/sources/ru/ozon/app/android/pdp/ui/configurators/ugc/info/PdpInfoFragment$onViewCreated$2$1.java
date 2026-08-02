package ru.ozon.app.android.pdp.ui.configurators.ugc.info;

import GZ.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PdpInfoFragment$onViewCreated$2$1 extends C7719a implements Function1<String, Boolean> {
    PdpInfoFragment$onViewCreated$2$1(Object obj) {
        super(1, obj, g.class, "openDeeplink", "openDeeplink(Ljava/lang/String;Ljava/util/Map;Lru/ozon/compass/router/DeeplinkSourceType;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return Boolean.valueOf(g.a.a((g) this.receiver, p02, null, null, 6));
    }
}
