package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models;

import V.e;
import androidx.annotation.Keep;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/navigation/models/TabInfoData;", "", "tabId", "", "baseUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTabId", "()Ljava/lang/String;", "getBaseUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TabInfoData {
    private final String baseUrl;
    private final String tabId;

    public TabInfoData(String str, String str2) {
        this.tabId = str;
        this.baseUrl = str2;
    }

    public static /* synthetic */ TabInfoData copy$default(TabInfoData tabInfoData, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tabInfoData.tabId;
        }
        if ((i11 & 2) != 0) {
            str2 = tabInfoData.baseUrl;
        }
        return tabInfoData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTabId() {
        return this.tabId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    public final TabInfoData copy(String tabId, String baseUrl) {
        return new TabInfoData(tabId, baseUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabInfoData)) {
            return false;
        }
        TabInfoData tabInfoData = (TabInfoData) other;
        return Intrinsics.d(this.tabId, tabInfoData.tabId) && Intrinsics.d(this.baseUrl, tabInfoData.baseUrl);
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getTabId() {
        return this.tabId;
    }

    public int hashCode() {
        String str = this.tabId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.baseUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return e.a("TabInfoData(tabId=", this.tabId, ", baseUrl=", this.baseUrl, ")");
    }
}
