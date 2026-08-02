package ru.ozon.app.android.domain.session.api.auth.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/MappedAuthMethods;", "", "", "type", "Lru/ozon/app/android/domain/session/api/auth/models/SelectorAuthMethod;", "selectorAuth", "Lru/ozon/app/android/domain/session/api/auth/models/BiometryAuthMethod;", "biometry", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/domain/session/api/auth/models/SelectorAuthMethod;Lru/ozon/app/android/domain/session/api/auth/models/BiometryAuthMethod;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Lru/ozon/app/android/domain/session/api/auth/models/SelectorAuthMethod;", "getSelectorAuth", "()Lru/ozon/app/android/domain/session/api/auth/models/SelectorAuthMethod;", "Lru/ozon/app/android/domain/session/api/auth/models/BiometryAuthMethod;", "getBiometry", "()Lru/ozon/app/android/domain/session/api/auth/models/BiometryAuthMethod;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MappedAuthMethods {
    private final BiometryAuthMethod biometry;
    private final SelectorAuthMethod selectorAuth;

    @NotNull
    private final String type;

    public MappedAuthMethods(@NotNull String type, SelectorAuthMethod selectorAuthMethod, BiometryAuthMethod biometryAuthMethod) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.selectorAuth = selectorAuthMethod;
        this.biometry = biometryAuthMethod;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MappedAuthMethods)) {
            return false;
        }
        MappedAuthMethods mappedAuthMethods = (MappedAuthMethods) other;
        return Intrinsics.d(this.type, mappedAuthMethods.type) && Intrinsics.d(this.selectorAuth, mappedAuthMethods.selectorAuth) && Intrinsics.d(this.biometry, mappedAuthMethods.biometry);
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        SelectorAuthMethod selectorAuthMethod = this.selectorAuth;
        int hashCode2 = (hashCode + (selectorAuthMethod == null ? 0 : selectorAuthMethod.hashCode())) * 31;
        BiometryAuthMethod biometryAuthMethod = this.biometry;
        return hashCode2 + (biometryAuthMethod != null ? biometryAuthMethod.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MappedAuthMethods(type=" + this.type + ", selectorAuth=" + this.selectorAuth + ", biometry=" + this.biometry + ")";
    }
}
