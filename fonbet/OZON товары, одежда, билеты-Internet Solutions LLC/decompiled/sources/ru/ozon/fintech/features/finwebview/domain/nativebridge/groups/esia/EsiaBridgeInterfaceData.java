package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.esia;

import C.o0;
import G.g;
import androidx.annotation.Keep;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/esia/EsiaBridgeInterfaceData;", "", "params", "", "", "state", "code", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getParams", "()Ljava/util/Map;", "getState", "()Ljava/lang/String;", "getCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EsiaBridgeInterfaceData {

    @NotNull
    private final String code;

    @NotNull
    private final Map<String, String> params;

    @NotNull
    private final String state;

    public EsiaBridgeInterfaceData(@NotNull Map<String, String> params, @NotNull String state, @NotNull String code) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(code, "code");
        this.params = params;
        this.state = state;
        this.code = code;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EsiaBridgeInterfaceData copy$default(EsiaBridgeInterfaceData esiaBridgeInterfaceData, Map map, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = esiaBridgeInterfaceData.params;
        }
        if ((i11 & 2) != 0) {
            str = esiaBridgeInterfaceData.state;
        }
        if ((i11 & 4) != 0) {
            str2 = esiaBridgeInterfaceData.code;
        }
        return esiaBridgeInterfaceData.copy(map, str, str2);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.params;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final EsiaBridgeInterfaceData copy(@NotNull Map<String, String> params, @NotNull String state, @NotNull String code) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(code, "code");
        return new EsiaBridgeInterfaceData(params, state, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EsiaBridgeInterfaceData)) {
            return false;
        }
        EsiaBridgeInterfaceData esiaBridgeInterfaceData = (EsiaBridgeInterfaceData) other;
        return Intrinsics.d(this.params, esiaBridgeInterfaceData.params) && Intrinsics.d(this.state, esiaBridgeInterfaceData.state) && Intrinsics.d(this.code, esiaBridgeInterfaceData.code);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final Map<String, String> getParams() {
        return this.params;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return this.code.hashCode() + g.a(this.params.hashCode() * 31, 31, this.state);
    }

    @NotNull
    public String toString() {
        Map<String, String> map = this.params;
        String str = this.state;
        String str2 = this.code;
        StringBuilder sb2 = new StringBuilder("EsiaBridgeInterfaceData(params=");
        sb2.append(map);
        sb2.append(", state=");
        sb2.append(str);
        sb2.append(", code=");
        return o0.c(sb2, str2, ")");
    }
}
