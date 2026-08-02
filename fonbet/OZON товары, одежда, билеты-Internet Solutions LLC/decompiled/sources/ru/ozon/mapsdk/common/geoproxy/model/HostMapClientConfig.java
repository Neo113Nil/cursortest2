package ru.ozon.mapsdk.common.geoproxy.model;

import Ld0.c;
import Sc.InterfaceC4008j;
import Sc.k;
import We.B;
import We.E;
import ei0.InterfaceC6369b;
import java.util.List;
import kb0.EnumC7626a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.h;
import za0.InterfaceC11014a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/HostMapClientConfig;", "Lru/ozon/mapsdk/common/geoproxy/model/GeoProxyConfig;", "", "appName", "Lei0/b;", "ozonTracker", "", "LWe/B;", "debugInterceptors", "<init>", "(Ljava/lang/String;Lei0/b;Ljava/util/List;)V", "Lkb0/a;", "", "isStg", "(Lkb0/a;)Z", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;", "Lei0/b;", "getOzonTracker", "()Lei0/b;", "Ljava/util/List;", "LLd0/c;", "limbDiStore", "LLd0/c;", "getLimbDiStore$mapsdk_fullFirebaseOpenglRelease", "()LLd0/c;", "setLimbDiStore$mapsdk_fullFirebaseOpenglRelease", "(LLd0/c;)V", "Lza0/a;", "hostConfig$delegate", "LSc/j;", "getHostConfig", "()Lza0/a;", "hostConfig", "Lpf0/h;", "ozonNetworkPlugin$delegate", "getOzonNetworkPlugin", "()Lpf0/h;", "ozonNetworkPlugin", "LWe/E;", "networkClient$delegate", "getNetworkClient$mapsdk_fullFirebaseOpenglRelease", "()LWe/E;", "networkClient", "Lru/ozon/mapsdk/common/geoproxy/model/ApiHost;", "host$delegate", "getHost", "()Lru/ozon/mapsdk/common/geoproxy/model/ApiHost;", "host", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HostMapClientConfig extends GeoProxyConfig {

    @NotNull
    private final String appName;
    private final List<B> debugInterceptors;

    /* renamed from: host$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j host;

    /* renamed from: hostConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hostConfig;
    public c limbDiStore;

    /* renamed from: networkClient$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j networkClient;

    /* renamed from: ozonNetworkPlugin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonNetworkPlugin;
    private final InterfaceC6369b ozonTracker;

    public /* synthetic */ HostMapClientConfig(String str, InterfaceC6369b interfaceC6369b, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : interfaceC6369b, (i11 & 4) != 0 ? null : list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC11014a getHostConfig() {
        return (InterfaceC11014a) this.hostConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h getOzonNetworkPlugin() {
        return (h) this.ozonNetworkPlugin.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isStg(EnumC7626a enumC7626a) {
        return enumC7626a == EnumC7626a.CnStg || enumC7626a == EnumC7626a.Stg;
    }

    @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig
    @NotNull
    public String getAppName() {
        return this.appName;
    }

    @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig
    @NotNull
    public ApiHost getHost() {
        return (ApiHost) this.host.getValue();
    }

    @NotNull
    public final c getLimbDiStore$mapsdk_fullFirebaseOpenglRelease() {
        c cVar = this.limbDiStore;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.n("limbDiStore");
        throw null;
    }

    @NotNull
    public final E getNetworkClient$mapsdk_fullFirebaseOpenglRelease() {
        return (E) this.networkClient.getValue();
    }

    @Override // ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig
    public InterfaceC6369b getOzonTracker() {
        return this.ozonTracker;
    }

    public final void setLimbDiStore$mapsdk_fullFirebaseOpenglRelease(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.limbDiStore = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HostMapClientConfig(@NotNull String appName, InterfaceC6369b interfaceC6369b, List<? extends B> list) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        this.appName = appName;
        this.ozonTracker = interfaceC6369b;
        this.debugInterceptors = list;
        this.hostConfig = k.b(new HostMapClientConfig$hostConfig$2(this));
        this.ozonNetworkPlugin = k.b(new HostMapClientConfig$ozonNetworkPlugin$2(this));
        this.networkClient = k.b(new HostMapClientConfig$networkClient$2(this));
        this.host = k.b(new HostMapClientConfig$host$2(this));
    }
}
