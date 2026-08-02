package ru.ozon.uni.ozi.config;

import Kk.C3532b;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/ozi/config/OziConfig;", "", "", "enableOziTestTags", "enableStrictMode", "testTagsAsResourceId", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnableOziTestTags", "()Z", "setEnableOziTestTags", "(Z)V", "getEnableStrictMode", "setEnableStrictMode", "getTestTagsAsResourceId", "setTestTagsAsResourceId", "enablePackageNamePrefixInTestTags", "getEnablePackageNamePrefixInTestTags", "setEnablePackageNamePrefixInTestTags", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OziConfig {
    private boolean enableOziTestTags;
    private boolean enablePackageNamePrefixInTestTags;
    private boolean enableStrictMode;
    private boolean testTagsAsResourceId;
    public static final int $stable = 8;

    public OziConfig() {
        this(false, false, false, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OziConfig)) {
            return false;
        }
        OziConfig oziConfig = (OziConfig) other;
        return this.enableOziTestTags == oziConfig.enableOziTestTags && this.enableStrictMode == oziConfig.enableStrictMode && this.testTagsAsResourceId == oziConfig.testTagsAsResourceId;
    }

    public final boolean getEnableOziTestTags() {
        return this.enableOziTestTags;
    }

    public final boolean getEnablePackageNamePrefixInTestTags() {
        return this.enablePackageNamePrefixInTestTags;
    }

    public final boolean getEnableStrictMode() {
        return this.enableStrictMode;
    }

    public final boolean getTestTagsAsResourceId() {
        return this.testTagsAsResourceId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.testTagsAsResourceId) + C3532b.a(Boolean.hashCode(this.enableOziTestTags) * 31, 31, this.enableStrictMode);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.enableOziTestTags;
        boolean z12 = this.enableStrictMode;
        return a.a(")", Lh.a.d("OziConfig(enableOziTestTags=", ", enableStrictMode=", ", testTagsAsResourceId=", z11, z12), this.testTagsAsResourceId);
    }

    public OziConfig(boolean z11, boolean z12, boolean z13) {
        this.enableOziTestTags = z11;
        this.enableStrictMode = z12;
        this.testTagsAsResourceId = z13;
    }

    public /* synthetic */ OziConfig(boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? false : z13);
    }
}
