package ru.ozon.app.android.domain.session.api.auth.models;

import C.o0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/BiometryAuthMethod;", "", "isNeedToSetBiometry", "", "permission", "Lru/ozon/app/android/domain/session/api/auth/models/BiometryPermission;", "analyticTag", "", "<init>", "(ZLru/ozon/app/android/domain/session/api/auth/models/BiometryPermission;Ljava/lang/String;)V", "()Z", "getPermission", "()Lru/ozon/app/android/domain/session/api/auth/models/BiometryPermission;", "getAnalyticTag", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BiometryAuthMethod {

    @NotNull
    private final String analyticTag;
    private final boolean isNeedToSetBiometry;

    @NotNull
    private final BiometryPermission permission;

    public BiometryAuthMethod(boolean z11, @NotNull BiometryPermission permission, @NotNull String analyticTag) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        this.isNeedToSetBiometry = z11;
        this.permission = permission;
        this.analyticTag = analyticTag;
    }

    public static /* synthetic */ BiometryAuthMethod copy$default(BiometryAuthMethod biometryAuthMethod, boolean z11, BiometryPermission biometryPermission, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = biometryAuthMethod.isNeedToSetBiometry;
        }
        if ((i11 & 2) != 0) {
            biometryPermission = biometryAuthMethod.permission;
        }
        if ((i11 & 4) != 0) {
            str = biometryAuthMethod.analyticTag;
        }
        return biometryAuthMethod.copy(z11, biometryPermission, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNeedToSetBiometry() {
        return this.isNeedToSetBiometry;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BiometryPermission getPermission() {
        return this.permission;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAnalyticTag() {
        return this.analyticTag;
    }

    @NotNull
    public final BiometryAuthMethod copy(boolean isNeedToSetBiometry, @NotNull BiometryPermission permission, @NotNull String analyticTag) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        return new BiometryAuthMethod(isNeedToSetBiometry, permission, analyticTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometryAuthMethod)) {
            return false;
        }
        BiometryAuthMethod biometryAuthMethod = (BiometryAuthMethod) other;
        return this.isNeedToSetBiometry == biometryAuthMethod.isNeedToSetBiometry && Intrinsics.d(this.permission, biometryAuthMethod.permission) && Intrinsics.d(this.analyticTag, biometryAuthMethod.analyticTag);
    }

    @NotNull
    public final String getAnalyticTag() {
        return this.analyticTag;
    }

    @NotNull
    public final BiometryPermission getPermission() {
        return this.permission;
    }

    public int hashCode() {
        return this.analyticTag.hashCode() + ((this.permission.hashCode() + (Boolean.hashCode(this.isNeedToSetBiometry) * 31)) * 31);
    }

    public final boolean isNeedToSetBiometry() {
        return this.isNeedToSetBiometry;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isNeedToSetBiometry;
        BiometryPermission biometryPermission = this.permission;
        String str = this.analyticTag;
        StringBuilder sb2 = new StringBuilder("BiometryAuthMethod(isNeedToSetBiometry=");
        sb2.append(z11);
        sb2.append(", permission=");
        sb2.append(biometryPermission);
        sb2.append(", analyticTag=");
        return o0.c(sb2, str, ")");
    }
}
