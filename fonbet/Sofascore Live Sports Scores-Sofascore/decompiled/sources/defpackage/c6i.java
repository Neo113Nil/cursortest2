package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c6i {
    public static final /* synthetic */ c6i[] d;
    public static final /* synthetic */ kp5 e;
    public final b6i a;
    public final a6i b;
    public final List c;

    static {
        b6i b6iVar = b6i.c;
        a6i a6iVar = a6i.Driver;
        c6i c6iVar = new c6i("PracticeDriver", 0, b6iVar, a6iVar, b.j(Integer.valueOf(Sdk.SDKError.Reason.TPAT_ERROR_VALUE), Integer.valueOf(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), Integer.valueOf(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)));
        b6i b6iVar2 = b6i.d;
        c6i c6iVar2 = new c6i("QualifyingDriver", 1, b6iVar2, a6iVar, b.j(105, Integer.valueOf(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), Integer.valueOf(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), Integer.valueOf(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE)));
        a6i a6iVar2 = a6i.Team;
        c6i c6iVar3 = new c6i("QualifyingTeam", 2, b6iVar2, a6iVar2, a.c(113));
        b6i b6iVar3 = b6i.e;
        c6i c6iVar4 = new c6i("RaceDriver", 3, b6iVar3, a6iVar, b.j(101, 129));
        c6i c6iVar5 = new c6i("RaceTeam", 4, b6iVar3, a6iVar2, b.j(102, Integer.valueOf(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), 112));
        c6i c6iVar6 = new c6i("RaceOther", 5, b6iVar3, a6i.Other, b.j(107, 106));
        b6i b6iVar4 = b6i.f;
        c6i[] c6iVarArr = {c6iVar, c6iVar2, c6iVar3, c6iVar4, c6iVar5, c6iVar6, new c6i("SeasonDriver", 6, b6iVar4, a6iVar, a.c(Integer.valueOf(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE))), new c6i("SeasonTeam", 7, b6iVar4, a6iVar2, a.c(Integer.valueOf(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)))};
        d = c6iVarArr;
        e = new kp5(c6iVarArr);
    }

    public c6i(String str, int i, b6i b6iVar, a6i a6iVar, List list) {
        this.a = b6iVar;
        this.b = a6iVar;
        this.c = list;
    }

    public static c6i valueOf(String str) {
        return (c6i) Enum.valueOf(c6i.class, str);
    }

    public static c6i[] values() {
        return (c6i[]) d.clone();
    }
}
