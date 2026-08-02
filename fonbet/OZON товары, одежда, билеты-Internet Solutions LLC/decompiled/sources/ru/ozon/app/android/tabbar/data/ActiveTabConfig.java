package ru.ozon.app.android.tabbar.data;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/tabbar/data/ActiveTabConfig;", "", "titleColor", "", "iconColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitleColor", "()Ljava/lang/String;", "getIconColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ActiveTabConfig {
    private final String iconColor;
    private final String titleColor;

    public ActiveTabConfig(String str, String str2) {
        this.titleColor = str;
        this.iconColor = str2;
    }

    public static /* synthetic */ ActiveTabConfig copy$default(ActiveTabConfig activeTabConfig, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = activeTabConfig.titleColor;
        }
        if ((i11 & 2) != 0) {
            str2 = activeTabConfig.iconColor;
        }
        return activeTabConfig.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitleColor() {
        return this.titleColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    @NotNull
    public final ActiveTabConfig copy(String titleColor, String iconColor) {
        return new ActiveTabConfig(titleColor, iconColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveTabConfig)) {
            return false;
        }
        ActiveTabConfig activeTabConfig = (ActiveTabConfig) other;
        return Intrinsics.d(this.titleColor, activeTabConfig.titleColor) && Intrinsics.d(this.iconColor, activeTabConfig.iconColor);
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        String str = this.titleColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconColor;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return e.a("ActiveTabConfig(titleColor=", this.titleColor, ", iconColor=", this.iconColor, ")");
    }
}
