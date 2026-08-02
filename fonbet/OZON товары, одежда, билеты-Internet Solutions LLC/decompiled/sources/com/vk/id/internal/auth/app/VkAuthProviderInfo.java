package com.vk.id.internal.auth.app;

import android.content.ComponentName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH×\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/vk/id/internal/auth/app/VkAuthProviderInfo;", "", "Landroid/content/ComponentName;", "componentName", "", "weight", "<init>", "(Landroid/content/ComponentName;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/ComponentName;", "getComponentName", "()Landroid/content/ComponentName;", "I", "getWeight", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class VkAuthProviderInfo {

    @NotNull
    private final ComponentName componentName;
    private final int weight;

    public VkAuthProviderInfo(@NotNull ComponentName componentName, int i11) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        this.componentName = componentName;
        this.weight = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VkAuthProviderInfo)) {
            return false;
        }
        VkAuthProviderInfo vkAuthProviderInfo = (VkAuthProviderInfo) other;
        return Intrinsics.d(this.componentName, vkAuthProviderInfo.componentName) && this.weight == vkAuthProviderInfo.weight;
    }

    @NotNull
    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return Integer.hashCode(this.weight) + (this.componentName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VkAuthProviderInfo(componentName=" + this.componentName + ", weight=" + this.weight + ")";
    }
}
