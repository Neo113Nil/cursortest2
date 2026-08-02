package com.unity3d.ads.injection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\r\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/injection/EntryKey;", "", "named", "", "instanceClass", "Lkotlin/reflect/KClass;", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;)V", "getNamed", "()Ljava/lang/String;", "getInstanceClass", "()Lkotlin/reflect/KClass;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EntryKey {

    @NotNull
    private final KClass<?> instanceClass;

    @NotNull
    private final String named;

    public EntryKey(@NotNull String str, @NotNull KClass<?> kClass) {
        str.getClass();
        kClass.getClass();
        this.named = str;
        this.instanceClass = kClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, KClass kClass, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entryKey.named;
        }
        if ((i & 2) != 0) {
            kClass = entryKey.instanceClass;
        }
        return entryKey.copy(str, kClass);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNamed() {
        return this.named;
    }

    @NotNull
    public final KClass<?> component2() {
        return this.instanceClass;
    }

    @NotNull
    public final EntryKey copy(@NotNull String named, @NotNull KClass<?> instanceClass) {
        named.getClass();
        instanceClass.getClass();
        return new EntryKey(named, instanceClass);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) other;
        return Intrinsics.c(this.named, entryKey.named) && Intrinsics.c(this.instanceClass, entryKey.instanceClass);
    }

    @NotNull
    public final KClass<?> getInstanceClass() {
        return this.instanceClass;
    }

    @NotNull
    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return this.instanceClass.hashCode() + (this.named.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ EntryKey(String str, KClass kClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, kClass);
    }
}
