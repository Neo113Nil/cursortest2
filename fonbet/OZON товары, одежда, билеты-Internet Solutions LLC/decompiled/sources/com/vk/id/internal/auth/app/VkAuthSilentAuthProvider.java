package com.vk.id.internal.auth.app;

import K00.b;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "", "", "appPackage", "appSha", "", "weight", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAppPackage", "getAppSha", "I", "getWeight", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class VkAuthSilentAuthProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String appPackage;
    private final String appSha;
    private final int weight;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider$Companion;", "", "<init>", "()V", "parse", "Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "json", "Lorg/json/JSONObject;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VkAuthSilentAuthProvider parse(@NotNull JSONObject json) {
            int i11;
            Intrinsics.checkNotNullParameter(json, "json");
            String string = json.getString("pkg");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = json.getString("sha256");
            i11 = VkAuthSilentAuthProviderKt.getInt(json, "weight", 0);
            return new VkAuthSilentAuthProvider(string, string2, i11);
        }

        private Companion() {
        }
    }

    public VkAuthSilentAuthProvider(@NotNull String appPackage, String str, int i11) {
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        this.appPackage = appPackage;
        this.appSha = str;
        this.weight = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VkAuthSilentAuthProvider)) {
            return false;
        }
        VkAuthSilentAuthProvider vkAuthSilentAuthProvider = (VkAuthSilentAuthProvider) other;
        return Intrinsics.d(this.appPackage, vkAuthSilentAuthProvider.appPackage) && Intrinsics.d(this.appSha, vkAuthSilentAuthProvider.appSha) && this.weight == vkAuthSilentAuthProvider.weight;
    }

    @NotNull
    public final String getAppPackage() {
        return this.appPackage;
    }

    public final String getAppSha() {
        return this.appSha;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int hashCode = this.appPackage.hashCode() * 31;
        String str = this.appSha;
        return Integer.hashCode(this.weight) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return b.e(this.weight, ")", C3660k.d("VkAuthSilentAuthProvider(appPackage=", this.appPackage, ", appSha=", this.appSha, ", weight="));
    }
}
