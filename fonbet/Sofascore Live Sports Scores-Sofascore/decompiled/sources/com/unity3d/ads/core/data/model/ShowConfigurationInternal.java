package com.unity3d.ads.core.data.model;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.dmi;
import defpackage.lm5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowConfigurationInternal;", "", "customRewardString", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getCustomRewardString", "()Ljava/lang/String;", "getExtras", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ShowConfigurationInternal {

    @Nullable
    private final String customRewardString;

    @NotNull
    private final Map<String, String> extras;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShowConfigurationInternal(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map);
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShowConfigurationInternal copy$default(ShowConfigurationInternal showConfigurationInternal, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = showConfigurationInternal.customRewardString;
        }
        if ((i & 2) != 0) {
            map = showConfigurationInternal.extras;
        }
        return showConfigurationInternal.copy(str, map);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCustomRewardString() {
        return this.customRewardString;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.extras;
    }

    @NotNull
    public final ShowConfigurationInternal copy(@Nullable String customRewardString, @NotNull Map<String, String> extras) {
        extras.getClass();
        return new ShowConfigurationInternal(customRewardString, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowConfigurationInternal)) {
            return false;
        }
        ShowConfigurationInternal showConfigurationInternal = (ShowConfigurationInternal) other;
        return Intrinsics.c(this.customRewardString, showConfigurationInternal.customRewardString) && Intrinsics.c(this.extras, showConfigurationInternal.extras);
    }

    @Nullable
    public final String getCustomRewardString() {
        return this.customRewardString;
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public int hashCode() {
        String str = this.customRewardString;
        return this.extras.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ShowConfigurationInternal(customRewardString=");
        sb.append(this.customRewardString);
        sb.append(", extras=");
        return dmi.s(sb, this.extras, ')');
    }

    public ShowConfigurationInternal(@Nullable String str, @NotNull Map<String, String> map) {
        map.getClass();
        this.customRewardString = str;
        this.extras = map;
    }

    public ShowConfigurationInternal() {
        this(null, null, 3, null);
    }
}
