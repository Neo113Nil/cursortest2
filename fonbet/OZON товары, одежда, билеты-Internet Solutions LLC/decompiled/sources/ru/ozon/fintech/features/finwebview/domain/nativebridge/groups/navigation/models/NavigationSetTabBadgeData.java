package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models;

import C.o0;
import Kk.C3532b;
import Nh.a;
import Ve.C4636t5;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/navigation/models/NavigationSetTabBadgeData;", "", "tab", "", "enabled", "", "color", "text", "iconUrl", "iconBackgroundUrl", "animationType", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTab", "()Ljava/lang/String;", "getEnabled", "()Z", "getColor", "getText", "getIconUrl", "getIconBackgroundUrl", "getAnimationType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NavigationSetTabBadgeData {
    private final String animationType;
    private final String color;
    private final boolean enabled;
    private final String iconBackgroundUrl;
    private final String iconUrl;

    @NotNull
    private final String tab;
    private final String text;

    public NavigationSetTabBadgeData(@i(name = "tab") @NotNull String tab, @i(name = "enabled") boolean z11, @i(name = "color") String str, @i(name = "text") String str2, @i(name = "icon_url") String str3, @i(name = "icon_background_url") String str4, @i(name = "animation_type") String str5) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.tab = tab;
        this.enabled = z11;
        this.color = str;
        this.text = str2;
        this.iconUrl = str3;
        this.iconBackgroundUrl = str4;
        this.animationType = str5;
    }

    public static /* synthetic */ NavigationSetTabBadgeData copy$default(NavigationSetTabBadgeData navigationSetTabBadgeData, String str, boolean z11, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navigationSetTabBadgeData.tab;
        }
        if ((i11 & 2) != 0) {
            z11 = navigationSetTabBadgeData.enabled;
        }
        if ((i11 & 4) != 0) {
            str2 = navigationSetTabBadgeData.color;
        }
        if ((i11 & 8) != 0) {
            str3 = navigationSetTabBadgeData.text;
        }
        if ((i11 & 16) != 0) {
            str4 = navigationSetTabBadgeData.iconUrl;
        }
        if ((i11 & 32) != 0) {
            str5 = navigationSetTabBadgeData.iconBackgroundUrl;
        }
        if ((i11 & 64) != 0) {
            str6 = navigationSetTabBadgeData.animationType;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return navigationSetTabBadgeData.copy(str, z11, str10, str3, str9, str7, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTab() {
        return this.tab;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconBackgroundUrl() {
        return this.iconBackgroundUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAnimationType() {
        return this.animationType;
    }

    @NotNull
    public final NavigationSetTabBadgeData copy(@i(name = "tab") @NotNull String tab, @i(name = "enabled") boolean enabled, @i(name = "color") String color, @i(name = "text") String text, @i(name = "icon_url") String iconUrl, @i(name = "icon_background_url") String iconBackgroundUrl, @i(name = "animation_type") String animationType) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        return new NavigationSetTabBadgeData(tab, enabled, color, text, iconUrl, iconBackgroundUrl, animationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationSetTabBadgeData)) {
            return false;
        }
        NavigationSetTabBadgeData navigationSetTabBadgeData = (NavigationSetTabBadgeData) other;
        return Intrinsics.d(this.tab, navigationSetTabBadgeData.tab) && this.enabled == navigationSetTabBadgeData.enabled && Intrinsics.d(this.color, navigationSetTabBadgeData.color) && Intrinsics.d(this.text, navigationSetTabBadgeData.text) && Intrinsics.d(this.iconUrl, navigationSetTabBadgeData.iconUrl) && Intrinsics.d(this.iconBackgroundUrl, navigationSetTabBadgeData.iconBackgroundUrl) && Intrinsics.d(this.animationType, navigationSetTabBadgeData.animationType);
    }

    public final String getAnimationType() {
        return this.animationType;
    }

    public final String getColor() {
        return this.color;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getIconBackgroundUrl() {
        return this.iconBackgroundUrl;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getTab() {
        return this.tab;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.tab.hashCode() * 31, 31, this.enabled);
        String str = this.color;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconBackgroundUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.animationType;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.tab;
        boolean z11 = this.enabled;
        String str2 = this.color;
        String str3 = this.text;
        String str4 = this.iconUrl;
        String str5 = this.iconBackgroundUrl;
        String str6 = this.animationType;
        StringBuilder b11 = C4636t5.b("NavigationSetTabBadgeData(tab=", str, ", enabled=", ", color=", z11);
        a.h(b11, str2, ", text=", str3, ", iconUrl=");
        a.h(b11, str4, ", iconBackgroundUrl=", str5, ", animationType=");
        return o0.c(b11, str6, ")");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ NavigationSetTabBadgeData(java.lang.String r9, boolean r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 2
            if (r0 == 0) goto L5
            r10 = 0
        L5:
            r2 = r10
            r10 = r16 & 16
            r0 = 0
            if (r10 == 0) goto Ld
            r5 = r0
            goto Le
        Ld:
            r5 = r13
        Le:
            r10 = r16 & 32
            if (r10 == 0) goto L14
            r6 = r0
            goto L15
        L14:
            r6 = r14
        L15:
            r10 = r16 & 64
            if (r10 == 0) goto L1f
            r7 = r0
            r1 = r9
            r3 = r11
            r4 = r12
            r0 = r8
            goto L24
        L1f:
            r7 = r15
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
        L24:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models.NavigationSetTabBadgeData.<init>(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
