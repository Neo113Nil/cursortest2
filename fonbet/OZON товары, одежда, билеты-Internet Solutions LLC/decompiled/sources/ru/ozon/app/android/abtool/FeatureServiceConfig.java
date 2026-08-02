package ru.ozon.app.android.abtool;

import Fb0.e;
import We.B;
import We.InterfaceC4875q;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;
import ru.ozon.app.android.abtool.data.network.AdditionalParametersProvider;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\u0018\u0000 ;2\u00020\u0001:\u0001;B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010&\u0012\u0004\b)\u0010\u001f\u001a\u0004\b'\u0010(R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010&\u0012\u0004\b+\u0010\u001f\u001a\u0004\b*\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010/\u0012\u0004\b2\u0010\u001f\u001a\u0004\b0\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b6\u0010%R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b7\u0010.R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b\u0017\u0010.R\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b\u0018\u0010.R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/abtool/FeatureServiceConfig;", "", "LFb0/e;", "appDomain", "", "namespace", "", "Lru/ozon/app/android/abtool/data/model/FeatureDTO;", "features", "", "LWe/B;", "interceptors", "networkInterceptors", "", "debug", "LWe/q;", "cookieJar", "", "refreshIntervalMs", "Lru/ozon/app/android/abtool/data/network/AdditionalParametersProvider;", "additionalParametersProvider", "featureServicePriority", "fetchFromRemoteOnInit", "isPlatformNamespaceEnabled", "isPlatformOverridesEnabled", "<init>", "(LFb0/e;Ljava/lang/String;Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;ZLWe/q;Ljava/lang/Long;Lru/ozon/app/android/abtool/data/network/AdditionalParametersProvider;Ljava/util/List;ZZZ)V", "LFb0/e;", "getAppDomain", "()LFb0/e;", "getAppDomain$annotations", "()V", "Ljava/lang/String;", "getNamespace", "()Ljava/lang/String;", "Ljava/util/List;", "getFeatures", "()Ljava/util/List;", "Ljava/util/Collection;", "getInterceptors", "()Ljava/util/Collection;", "getInterceptors$annotations", "getNetworkInterceptors", "getNetworkInterceptors$annotations", "Z", "getDebug", "()Z", "LWe/q;", "getCookieJar", "()LWe/q;", "getCookieJar$annotations", "Ljava/lang/Long;", "getRefreshIntervalMs", "()Ljava/lang/Long;", "getFeatureServicePriority", "getFetchFromRemoteOnInit", "Lru/ozon/app/android/abtool/data/network/AdditionalParametersProvider;", "getAdditionalParametersProvider", "()Lru/ozon/app/android/abtool/data/network/AdditionalParametersProvider;", "Companion", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureServiceConfig {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final e appDomain;
    private final InterfaceC4875q cookieJar;
    private final boolean debug;

    @NotNull
    private final List<String> featureServicePriority;

    @NotNull
    private final List<FeatureDTO> features;
    private final boolean fetchFromRemoteOnInit;

    @NotNull
    private final Collection<B> interceptors;
    private final boolean isPlatformNamespaceEnabled;
    private final boolean isPlatformOverridesEnabled;

    @NotNull
    private final String namespace;
    private final Collection<B> networkInterceptors;
    private final Long refreshIntervalMs;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/abtool/FeatureServiceConfig$Companion;", "", "<init>", "()V", "IS_PLATFORM_NAMESPACE_ENABLED_DEFAULT", "", "IS_PLATFORM_OVERRIDES_ENABLED_DEFAULT", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureServiceConfig(@NotNull e appDomain, @NotNull String namespace, @NotNull List<FeatureDTO> features, @NotNull Collection<? extends B> interceptors, Collection<? extends B> collection, boolean z11, InterfaceC4875q interfaceC4875q, Long l11, AdditionalParametersProvider additionalParametersProvider, @NotNull List<String> featureServicePriority, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(appDomain, "appDomain");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(featureServicePriority, "featureServicePriority");
        this.appDomain = appDomain;
        this.namespace = namespace;
        this.features = features;
        this.interceptors = interceptors;
        this.networkInterceptors = collection;
        this.debug = z11;
        this.cookieJar = interfaceC4875q;
        this.refreshIntervalMs = l11;
        this.featureServicePriority = featureServicePriority;
        this.fetchFromRemoteOnInit = z12;
        this.isPlatformNamespaceEnabled = z13;
        this.isPlatformOverridesEnabled = z14;
    }

    public final AdditionalParametersProvider getAdditionalParametersProvider() {
        return null;
    }

    @NotNull
    public final e getAppDomain() {
        return this.appDomain;
    }

    public final InterfaceC4875q getCookieJar() {
        return this.cookieJar;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    @NotNull
    public final List<String> getFeatureServicePriority() {
        return this.featureServicePriority;
    }

    @NotNull
    public final List<FeatureDTO> getFeatures() {
        return this.features;
    }

    public final boolean getFetchFromRemoteOnInit() {
        return this.fetchFromRemoteOnInit;
    }

    @NotNull
    public final Collection<B> getInterceptors() {
        return this.interceptors;
    }

    @NotNull
    public final String getNamespace() {
        return this.namespace;
    }

    public final Collection<B> getNetworkInterceptors() {
        return this.networkInterceptors;
    }

    public final Long getRefreshIntervalMs() {
        return this.refreshIntervalMs;
    }

    /* renamed from: isPlatformNamespaceEnabled, reason: from getter */
    public final boolean getIsPlatformNamespaceEnabled() {
        return this.isPlatformNamespaceEnabled;
    }

    /* renamed from: isPlatformOverridesEnabled, reason: from getter */
    public final boolean getIsPlatformOverridesEnabled() {
        return this.isPlatformOverridesEnabled;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public FeatureServiceConfig(Fb0.e r18, java.lang.String r19, java.util.List r20, java.util.Collection r21, java.util.Collection r22, boolean r23, We.InterfaceC4875q r24, java.lang.Long r25, ru.ozon.app.android.abtool.data.network.AdditionalParametersProvider r26, java.util.List r27, boolean r28, boolean r29, boolean r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L9
            r8 = r2
            goto Lb
        L9:
            r8 = r22
        Lb:
            r1 = r0 & 32
            r3 = 0
            if (r1 == 0) goto L12
            r9 = r3
            goto L14
        L12:
            r9 = r23
        L14:
            r1 = r0 & 64
            if (r1 == 0) goto L1a
            r10 = r2
            goto L1c
        L1a:
            r10 = r24
        L1c:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L22
            r11 = r2
            goto L24
        L22:
            r11 = r25
        L24:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2a
            r12 = r2
            goto L2c
        L2a:
            r12 = r26
        L2c:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L34
            kotlin.collections.K r1 = kotlin.collections.K.f71697a
            r13 = r1
            goto L36
        L34:
            r13 = r27
        L36:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 1
            if (r1 == 0) goto L3d
            r14 = r2
            goto L3f
        L3d:
            r14 = r28
        L3f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L45
            r15 = r2
            goto L47
        L45:
            r15 = r29
        L47:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L58
            r16 = r3
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r3 = r17
            goto L64
        L58:
            r16 = r30
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
        L64:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.abtool.FeatureServiceConfig.<init>(Fb0.e, java.lang.String, java.util.List, java.util.Collection, java.util.Collection, boolean, We.q, java.lang.Long, ru.ozon.app.android.abtool.data.network.AdditionalParametersProvider, java.util.List, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
