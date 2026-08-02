package ru.ozon.fintech.features.offline.data.model.main;

import Ds.C2880a;
import G.g;
import Kk.C3532b;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/fintech/features/offline/data/model/main/MainData;", "", "client", "Lru/ozon/fintech/features/offline/data/model/main/ClientData;", "accountData", "Lru/ozon/fintech/features/offline/data/model/main/AccountData;", "supportPhone", "", "isOfflineEnabled", "", "sbpEnabled", "pageLoadedTimeoutMs", "", "<init>", "(Lru/ozon/fintech/features/offline/data/model/main/ClientData;Lru/ozon/fintech/features/offline/data/model/main/AccountData;Ljava/lang/String;ZZJ)V", "getClient", "()Lru/ozon/fintech/features/offline/data/model/main/ClientData;", "getAccountData", "()Lru/ozon/fintech/features/offline/data/model/main/AccountData;", "getSupportPhone", "()Ljava/lang/String;", "()Z", "getSbpEnabled", "getPageLoadedTimeoutMs", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MainData {

    @i(name = "mainAccount")
    @NotNull
    private final AccountData accountData;

    @i(name = "client")
    @NotNull
    private final ClientData client;

    @i(name = "isOfflineEnabled")
    private final boolean isOfflineEnabled;

    @i(name = "pageLoadedTimeoutMs")
    private final long pageLoadedTimeoutMs;

    @i(name = "sbpEnabled")
    private final boolean sbpEnabled;

    @i(name = "supportPhone")
    @NotNull
    private final String supportPhone;

    public MainData(@NotNull ClientData client, @NotNull AccountData accountData, @NotNull String supportPhone, boolean z11, boolean z12, long j11) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(accountData, "accountData");
        Intrinsics.checkNotNullParameter(supportPhone, "supportPhone");
        this.client = client;
        this.accountData = accountData;
        this.supportPhone = supportPhone;
        this.isOfflineEnabled = z11;
        this.sbpEnabled = z12;
        this.pageLoadedTimeoutMs = j11;
    }

    public static /* synthetic */ MainData copy$default(MainData mainData, ClientData clientData, AccountData accountData, String str, boolean z11, boolean z12, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            clientData = mainData.client;
        }
        if ((i11 & 2) != 0) {
            accountData = mainData.accountData;
        }
        if ((i11 & 4) != 0) {
            str = mainData.supportPhone;
        }
        if ((i11 & 8) != 0) {
            z11 = mainData.isOfflineEnabled;
        }
        if ((i11 & 16) != 0) {
            z12 = mainData.sbpEnabled;
        }
        if ((i11 & 32) != 0) {
            j11 = mainData.pageLoadedTimeoutMs;
        }
        long j12 = j11;
        boolean z13 = z12;
        String str2 = str;
        return mainData.copy(clientData, accountData, str2, z11, z13, j12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ClientData getClient() {
        return this.client;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AccountData getAccountData() {
        return this.accountData;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSupportPhone() {
        return this.supportPhone;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsOfflineEnabled() {
        return this.isOfflineEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSbpEnabled() {
        return this.sbpEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final long getPageLoadedTimeoutMs() {
        return this.pageLoadedTimeoutMs;
    }

    @NotNull
    public final MainData copy(@NotNull ClientData client, @NotNull AccountData accountData, @NotNull String supportPhone, boolean isOfflineEnabled, boolean sbpEnabled, long pageLoadedTimeoutMs) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(accountData, "accountData");
        Intrinsics.checkNotNullParameter(supportPhone, "supportPhone");
        return new MainData(client, accountData, supportPhone, isOfflineEnabled, sbpEnabled, pageLoadedTimeoutMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainData)) {
            return false;
        }
        MainData mainData = (MainData) other;
        return Intrinsics.d(this.client, mainData.client) && Intrinsics.d(this.accountData, mainData.accountData) && Intrinsics.d(this.supportPhone, mainData.supportPhone) && this.isOfflineEnabled == mainData.isOfflineEnabled && this.sbpEnabled == mainData.sbpEnabled && this.pageLoadedTimeoutMs == mainData.pageLoadedTimeoutMs;
    }

    @NotNull
    public final AccountData getAccountData() {
        return this.accountData;
    }

    @NotNull
    public final ClientData getClient() {
        return this.client;
    }

    public final long getPageLoadedTimeoutMs() {
        return this.pageLoadedTimeoutMs;
    }

    public final boolean getSbpEnabled() {
        return this.sbpEnabled;
    }

    @NotNull
    public final String getSupportPhone() {
        return this.supportPhone;
    }

    public int hashCode() {
        return Long.hashCode(this.pageLoadedTimeoutMs) + C3532b.a(C3532b.a(g.a((this.accountData.hashCode() + (this.client.hashCode() * 31)) * 31, 31, this.supportPhone), 31, this.isOfflineEnabled), 31, this.sbpEnabled);
    }

    public final boolean isOfflineEnabled() {
        return this.isOfflineEnabled;
    }

    @NotNull
    public String toString() {
        ClientData clientData = this.client;
        AccountData accountData = this.accountData;
        String str = this.supportPhone;
        boolean z11 = this.isOfflineEnabled;
        boolean z12 = this.sbpEnabled;
        long j11 = this.pageLoadedTimeoutMs;
        StringBuilder sb2 = new StringBuilder("MainData(client=");
        sb2.append(clientData);
        sb2.append(", accountData=");
        sb2.append(accountData);
        sb2.append(", supportPhone=");
        C2880a.c(str, ", isOfflineEnabled=", ", sbpEnabled=", sb2, z11);
        sb2.append(z12);
        sb2.append(", pageLoadedTimeoutMs=");
        sb2.append(j11);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ MainData(ClientData clientData, AccountData accountData, String str, boolean z11, boolean z12, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientData, accountData, str, (i11 & 8) != 0 ? false : z11, z12, j11);
    }
}
