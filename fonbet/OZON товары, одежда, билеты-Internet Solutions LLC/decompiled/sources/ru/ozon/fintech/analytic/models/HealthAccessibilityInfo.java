package ru.ozon.fintech.analytic.models;

import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Pk0.a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/fintech/analytic/models/HealthAccessibilityInfo;", "", "fontMultiplier", "", "fontMode", "", "uiMultiplier", "uiSizeMode", "interfaceAudition", "", "touchAssistance", "<init>", "(DLjava/lang/String;DLjava/lang/String;ZZ)V", "getFontMultiplier", "()D", "getFontMode", "()Ljava/lang/String;", "getUiMultiplier", "getUiSizeMode", "getInterfaceAudition", "()Z", "getTouchAssistance", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthAccessibilityInfo {

    @i(name = "font_mode")
    @NotNull
    private final String fontMode;

    @i(name = "font_multiplier")
    private final double fontMultiplier;

    @i(name = "interface_audition")
    private final boolean interfaceAudition;

    @i(name = "touch_assistance")
    private final boolean touchAssistance;

    @i(name = "ui_multiplier")
    private final double uiMultiplier;

    @i(name = "ui_size_mode")
    @NotNull
    private final String uiSizeMode;

    public HealthAccessibilityInfo(double d11, @NotNull String fontMode, double d12, @NotNull String uiSizeMode, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(fontMode, "fontMode");
        Intrinsics.checkNotNullParameter(uiSizeMode, "uiSizeMode");
        this.fontMultiplier = d11;
        this.fontMode = fontMode;
        this.uiMultiplier = d12;
        this.uiSizeMode = uiSizeMode;
        this.interfaceAudition = z11;
        this.touchAssistance = z12;
    }

    public static /* synthetic */ HealthAccessibilityInfo copy$default(HealthAccessibilityInfo healthAccessibilityInfo, double d11, String str, double d12, String str2, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = healthAccessibilityInfo.fontMultiplier;
        }
        double d13 = d11;
        if ((i11 & 2) != 0) {
            str = healthAccessibilityInfo.fontMode;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            d12 = healthAccessibilityInfo.uiMultiplier;
        }
        double d14 = d12;
        if ((i11 & 8) != 0) {
            str2 = healthAccessibilityInfo.uiSizeMode;
        }
        return healthAccessibilityInfo.copy(d13, str3, d14, str2, (i11 & 16) != 0 ? healthAccessibilityInfo.interfaceAudition : z11, (i11 & 32) != 0 ? healthAccessibilityInfo.touchAssistance : z12);
    }

    /* renamed from: component1, reason: from getter */
    public final double getFontMultiplier() {
        return this.fontMultiplier;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFontMode() {
        return this.fontMode;
    }

    /* renamed from: component3, reason: from getter */
    public final double getUiMultiplier() {
        return this.uiMultiplier;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUiSizeMode() {
        return this.uiSizeMode;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getInterfaceAudition() {
        return this.interfaceAudition;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getTouchAssistance() {
        return this.touchAssistance;
    }

    @NotNull
    public final HealthAccessibilityInfo copy(double fontMultiplier, @NotNull String fontMode, double uiMultiplier, @NotNull String uiSizeMode, boolean interfaceAudition, boolean touchAssistance) {
        Intrinsics.checkNotNullParameter(fontMode, "fontMode");
        Intrinsics.checkNotNullParameter(uiSizeMode, "uiSizeMode");
        return new HealthAccessibilityInfo(fontMultiplier, fontMode, uiMultiplier, uiSizeMode, interfaceAudition, touchAssistance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthAccessibilityInfo)) {
            return false;
        }
        HealthAccessibilityInfo healthAccessibilityInfo = (HealthAccessibilityInfo) other;
        return Double.compare(this.fontMultiplier, healthAccessibilityInfo.fontMultiplier) == 0 && Intrinsics.d(this.fontMode, healthAccessibilityInfo.fontMode) && Double.compare(this.uiMultiplier, healthAccessibilityInfo.uiMultiplier) == 0 && Intrinsics.d(this.uiSizeMode, healthAccessibilityInfo.uiSizeMode) && this.interfaceAudition == healthAccessibilityInfo.interfaceAudition && this.touchAssistance == healthAccessibilityInfo.touchAssistance;
    }

    @NotNull
    public final String getFontMode() {
        return this.fontMode;
    }

    public final double getFontMultiplier() {
        return this.fontMultiplier;
    }

    public final boolean getInterfaceAudition() {
        return this.interfaceAudition;
    }

    public final boolean getTouchAssistance() {
        return this.touchAssistance;
    }

    public final double getUiMultiplier() {
        return this.uiMultiplier;
    }

    @NotNull
    public final String getUiSizeMode() {
        return this.uiSizeMode;
    }

    public int hashCode() {
        return Boolean.hashCode(this.touchAssistance) + C3532b.a(g.a(Pk0.g.a(g.a(Double.hashCode(this.fontMultiplier) * 31, 31, this.fontMode), 31, this.uiMultiplier), 31, this.uiSizeMode), 31, this.interfaceAudition);
    }

    @NotNull
    public String toString() {
        double d11 = this.fontMultiplier;
        String str = this.fontMode;
        double d12 = this.uiMultiplier;
        String str2 = this.uiSizeMode;
        boolean z11 = this.interfaceAudition;
        boolean z12 = this.touchAssistance;
        StringBuilder sb2 = new StringBuilder("HealthAccessibilityInfo(fontMultiplier=");
        sb2.append(d11);
        sb2.append(", fontMode=");
        sb2.append(str);
        sb2.append(", uiMultiplier=");
        sb2.append(d12);
        sb2.append(", uiSizeMode=");
        C2880a.c(str2, ", interfaceAudition=", ", touchAssistance=", sb2, z11);
        return a.a(")", sb2, z12);
    }
}
