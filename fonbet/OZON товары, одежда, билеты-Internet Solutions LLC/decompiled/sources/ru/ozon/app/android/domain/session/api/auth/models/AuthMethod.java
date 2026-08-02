package ru.ozon.app.android.domain.session.api.auth.models;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/AuthMethod;", "", "type", "", "selectorAuthMethod", "Lru/ozon/app/android/domain/session/api/auth/models/SelectorAuthMethod;", "biometry", "Lru/ozon/app/android/domain/session/api/auth/models/BiometryAuthMethod;", "action", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/domain/session/api/auth/models/SelectorAuthMethod;Lru/ozon/app/android/domain/session/api/auth/models/BiometryAuthMethod;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getSelectorAuthMethod", "()Lru/ozon/app/android/domain/session/api/auth/models/SelectorAuthMethod;", "getBiometry", "()Lru/ozon/app/android/domain/session/api/auth/models/BiometryAuthMethod;", "getAction", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuthMethod {
    private final String action;
    private final BiometryAuthMethod biometry;
    private final SelectorAuthMethod selectorAuthMethod;

    @NotNull
    private final String type;

    public AuthMethod(@NotNull String type, SelectorAuthMethod selectorAuthMethod, BiometryAuthMethod biometryAuthMethod, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.selectorAuthMethod = selectorAuthMethod;
        this.biometry = biometryAuthMethod;
        this.action = str;
    }

    public static /* synthetic */ AuthMethod copy$default(AuthMethod authMethod, String str, SelectorAuthMethod selectorAuthMethod, BiometryAuthMethod biometryAuthMethod, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authMethod.type;
        }
        if ((i11 & 2) != 0) {
            selectorAuthMethod = authMethod.selectorAuthMethod;
        }
        if ((i11 & 4) != 0) {
            biometryAuthMethod = authMethod.biometry;
        }
        if ((i11 & 8) != 0) {
            str2 = authMethod.action;
        }
        return authMethod.copy(str, selectorAuthMethod, biometryAuthMethod, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final SelectorAuthMethod getSelectorAuthMethod() {
        return this.selectorAuthMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final BiometryAuthMethod getBiometry() {
        return this.biometry;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final AuthMethod copy(@NotNull String type, SelectorAuthMethod selectorAuthMethod, BiometryAuthMethod biometry, String action) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new AuthMethod(type, selectorAuthMethod, biometry, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthMethod)) {
            return false;
        }
        AuthMethod authMethod = (AuthMethod) other;
        return Intrinsics.d(this.type, authMethod.type) && Intrinsics.d(this.selectorAuthMethod, authMethod.selectorAuthMethod) && Intrinsics.d(this.biometry, authMethod.biometry) && Intrinsics.d(this.action, authMethod.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final BiometryAuthMethod getBiometry() {
        return this.biometry;
    }

    public final SelectorAuthMethod getSelectorAuthMethod() {
        return this.selectorAuthMethod;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        SelectorAuthMethod selectorAuthMethod = this.selectorAuthMethod;
        int hashCode2 = (hashCode + (selectorAuthMethod == null ? 0 : selectorAuthMethod.hashCode())) * 31;
        BiometryAuthMethod biometryAuthMethod = this.biometry;
        int hashCode3 = (hashCode2 + (biometryAuthMethod == null ? 0 : biometryAuthMethod.hashCode())) * 31;
        String str = this.action;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AuthMethod(type=" + this.type + ", selectorAuthMethod=" + this.selectorAuthMethod + ", biometry=" + this.biometry + ", action=" + this.action + ")";
    }
}
