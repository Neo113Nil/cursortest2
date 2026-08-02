package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537uk implements ModuleRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f14751a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f14752b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14753c;

    public C0537uk(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f14751a = sdkIdentifiers;
        this.f14752b = remoteConfigMetaInfo;
        this.f14753c = obj;
    }

    @NotNull
    public final C0537uk a(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C0537uk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    @NotNull
    public final RemoteConfigMetaInfo b() {
        return this.f14752b;
    }

    public final Object c() {
        return this.f14753c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0537uk)) {
            return false;
        }
        C0537uk c0537uk = (C0537uk) obj;
        return Intrinsics.areEqual(this.f14751a, c0537uk.f14751a) && Intrinsics.areEqual(this.f14752b, c0537uk.f14752b) && Intrinsics.areEqual(this.f14753c, c0537uk.f14753c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f14753c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.f14751a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f14752b;
    }

    public final int hashCode() {
        int hashCode = (this.f14752b.hashCode() + (this.f14751a.hashCode() * 31)) * 31;
        Object obj = this.f14753c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f14751a + ", remoteConfigMetaInfo=" + this.f14752b + ", featuresConfig=" + this.f14753c + ')';
    }

    @NotNull
    public final SdkIdentifiers a() {
        return this.f14751a;
    }

    public static C0537uk a(C0537uk c0537uk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            sdkIdentifiers = c0537uk.f14751a;
        }
        if ((i5 & 2) != 0) {
            remoteConfigMetaInfo = c0537uk.f14752b;
        }
        if ((i5 & 4) != 0) {
            obj = c0537uk.f14753c;
        }
        c0537uk.getClass();
        return new C0537uk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
