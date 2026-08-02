package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models;

import D3.g;
import N3.C3660k;
import androidx.annotation.Keep;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/navigation/models/GoTabData;", "", "tabId", "", "loadUrl", "replace", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTabId", "()Ljava/lang/String;", "getLoadUrl", "getReplace", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/navigation/models/GoTabData;", "equals", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GoTabData {
    private final String loadUrl;
    private final Boolean replace;
    private final String tabId;

    public GoTabData(String str, String str2, Boolean bool) {
        this.tabId = str;
        this.loadUrl = str2;
        this.replace = bool;
    }

    public static /* synthetic */ GoTabData copy$default(GoTabData goTabData, String str, String str2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = goTabData.tabId;
        }
        if ((i11 & 2) != 0) {
            str2 = goTabData.loadUrl;
        }
        if ((i11 & 4) != 0) {
            bool = goTabData.replace;
        }
        return goTabData.copy(str, str2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTabId() {
        return this.tabId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLoadUrl() {
        return this.loadUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getReplace() {
        return this.replace;
    }

    @NotNull
    public final GoTabData copy(String tabId, String loadUrl, Boolean replace) {
        return new GoTabData(tabId, loadUrl, replace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoTabData)) {
            return false;
        }
        GoTabData goTabData = (GoTabData) other;
        return Intrinsics.d(this.tabId, goTabData.tabId) && Intrinsics.d(this.loadUrl, goTabData.loadUrl) && Intrinsics.d(this.replace, goTabData.replace);
    }

    public final String getLoadUrl() {
        return this.loadUrl;
    }

    public final Boolean getReplace() {
        return this.replace;
    }

    public final String getTabId() {
        return this.tabId;
    }

    public int hashCode() {
        String str = this.tabId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loadUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.replace;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.tabId;
        String str2 = this.loadUrl;
        return g.d(C3660k.d("GoTabData(tabId=", str, ", loadUrl=", str2, ", replace="), this.replace, ")");
    }
}
