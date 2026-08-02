package ru.ozon.mapsdk.common.geoproxy.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import za0.InterfaceC11014a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/mapsdk/common/geoproxy/model/UNCAppDomainApiHost;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HostMapClientConfig$host$2 extends AbstractC7737t implements Function0<UNCAppDomainApiHost> {
    final /* synthetic */ HostMapClientConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HostMapClientConfig$host$2(HostMapClientConfig hostMapClientConfig) {
        super(0);
        this.this$0 = hostMapClientConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final UNCAppDomainApiHost invoke() {
        InterfaceC11014a hostConfig;
        InterfaceC11014a hostConfig2;
        boolean isStg;
        hostConfig = this.this$0.getHostConfig();
        String a11 = hostConfig.a();
        HostMapClientConfig hostMapClientConfig = this.this$0;
        hostConfig2 = hostMapClientConfig.getHostConfig();
        isStg = hostMapClientConfig.isStg(hostConfig2.G());
        return new UNCAppDomainApiHost(isStg, a11);
    }
}
