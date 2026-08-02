package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class L5 extends BaseRequestConfig.DataSource {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final C0161fm f12506a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final SdkEnvironmentProvider f12507b;

    public L5(@NonNull C0161fm c0161fm, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c0161fm.c(), c0161fm.a(), c0161fm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f12506a = c0161fm;
        this.f12507b = sdkEnvironmentProvider;
    }
}
