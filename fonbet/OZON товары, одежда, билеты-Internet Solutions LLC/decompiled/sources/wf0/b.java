package wf0;

import Cf0.J;
import org.jetbrains.annotations.NotNull;
import pf0.m;
import ru.ozon.app.android.abtool.AbToolNamespace;

/* loaded from: classes7.dex */
public abstract class b {
    private final int domainsLimit = getInternalDomainsLimit$ozon_network_release();
    private final int parallelPingLimit = getInternalParallelPingLimit$ozon_network_release();

    public final int getInternalDomainsLimit$ozon_network_release() {
        J j11 = m.f80514a;
        if (j11 != null) {
            return j11.e().getInt("on_domains_ping_limit", "ozon_network", AbToolNamespace.PLATFORM_MOBILE);
        }
        throw new RuntimeException("NetworkDi must be initialized.");
    }

    public final int getInternalParallelPingLimit$ozon_network_release() {
        J j11 = m.f80514a;
        if (j11 != null) {
            return j11.e().getInt("on_domain_parallel_ping_limit", "ozon_network", AbToolNamespace.PLATFORM_MOBILE);
        }
        throw new RuntimeException("NetworkDi must be initialized.");
    }

    @NotNull
    public abstract Ld0.c getLimbDiStore();
}
