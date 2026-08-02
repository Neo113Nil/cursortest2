package ru.ozon.fintech.analytic.models;

import B0.C2454a;
import G.g;
import Pk0.a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JB\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lru/ozon/fintech/analytic/models/HealthScreenInfo;", "", "size", "Lru/ozon/fintech/analytic/models/HealthScreenSize;", "theme", "", "systemTheme", "brightness", "", "ultraTheme", "", "<init>", "(Lru/ozon/fintech/analytic/models/HealthScreenSize;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getSize", "()Lru/ozon/fintech/analytic/models/HealthScreenSize;", "getTheme", "()Ljava/lang/String;", "getSystemTheme", "getBrightness", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUltraTheme", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/fintech/analytic/models/HealthScreenSize;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lru/ozon/fintech/analytic/models/HealthScreenInfo;", "equals", "other", "hashCode", "toString", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthScreenInfo {

    @i(name = "brightness")
    private final Integer brightness;

    @i(name = "size")
    @NotNull
    private final HealthScreenSize size;

    @i(name = "system_theme")
    @NotNull
    private final String systemTheme;

    @i(name = "theme")
    @NotNull
    private final String theme;

    @i(name = "ultra_theme")
    private final boolean ultraTheme;

    public HealthScreenInfo(@NotNull HealthScreenSize size, @NotNull String theme, @NotNull String systemTheme, Integer num, boolean z11) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(systemTheme, "systemTheme");
        this.size = size;
        this.theme = theme;
        this.systemTheme = systemTheme;
        this.brightness = num;
        this.ultraTheme = z11;
    }

    public static /* synthetic */ HealthScreenInfo copy$default(HealthScreenInfo healthScreenInfo, HealthScreenSize healthScreenSize, String str, String str2, Integer num, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            healthScreenSize = healthScreenInfo.size;
        }
        if ((i11 & 2) != 0) {
            str = healthScreenInfo.theme;
        }
        if ((i11 & 4) != 0) {
            str2 = healthScreenInfo.systemTheme;
        }
        if ((i11 & 8) != 0) {
            num = healthScreenInfo.brightness;
        }
        if ((i11 & 16) != 0) {
            z11 = healthScreenInfo.ultraTheme;
        }
        boolean z12 = z11;
        String str3 = str2;
        return healthScreenInfo.copy(healthScreenSize, str, str3, num, z12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final HealthScreenSize getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSystemTheme() {
        return this.systemTheme;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getBrightness() {
        return this.brightness;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUltraTheme() {
        return this.ultraTheme;
    }

    @NotNull
    public final HealthScreenInfo copy(@NotNull HealthScreenSize size, @NotNull String theme, @NotNull String systemTheme, Integer brightness, boolean ultraTheme) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(systemTheme, "systemTheme");
        return new HealthScreenInfo(size, theme, systemTheme, brightness, ultraTheme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthScreenInfo)) {
            return false;
        }
        HealthScreenInfo healthScreenInfo = (HealthScreenInfo) other;
        return Intrinsics.d(this.size, healthScreenInfo.size) && Intrinsics.d(this.theme, healthScreenInfo.theme) && Intrinsics.d(this.systemTheme, healthScreenInfo.systemTheme) && Intrinsics.d(this.brightness, healthScreenInfo.brightness) && this.ultraTheme == healthScreenInfo.ultraTheme;
    }

    public final Integer getBrightness() {
        return this.brightness;
    }

    @NotNull
    public final HealthScreenSize getSize() {
        return this.size;
    }

    @NotNull
    public final String getSystemTheme() {
        return this.systemTheme;
    }

    @NotNull
    public final String getTheme() {
        return this.theme;
    }

    public final boolean getUltraTheme() {
        return this.ultraTheme;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.size.hashCode() * 31, 31, this.theme), 31, this.systemTheme);
        Integer num = this.brightness;
        return Boolean.hashCode(this.ultraTheme) + ((a11 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        HealthScreenSize healthScreenSize = this.size;
        String str = this.theme;
        String str2 = this.systemTheme;
        Integer num = this.brightness;
        boolean z11 = this.ultraTheme;
        StringBuilder sb2 = new StringBuilder("HealthScreenInfo(size=");
        sb2.append(healthScreenSize);
        sb2.append(", theme=");
        sb2.append(str);
        sb2.append(", systemTheme=");
        C2454a.f(num, str2, ", brightness=", ", ultraTheme=", sb2);
        return a.a(")", sb2, z11);
    }
}
