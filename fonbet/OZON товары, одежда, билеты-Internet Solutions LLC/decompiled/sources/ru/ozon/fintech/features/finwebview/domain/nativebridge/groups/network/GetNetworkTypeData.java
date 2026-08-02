package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.network;

import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/network/GetNetworkTypeData;", "", "isVpn", "", "type", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getType", "()Ljava/lang/String;", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetNetworkTypeData {

    @i(name = "VPN_enabled")
    private final boolean isVpn;

    @i(name = "connection_type")
    private final String type;

    public GetNetworkTypeData(boolean z11, String str) {
        this.isVpn = z11;
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }

    /* renamed from: isVpn, reason: from getter */
    public final boolean getIsVpn() {
        return this.isVpn;
    }

    public /* synthetic */ GetNetworkTypeData(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : str);
    }
}
