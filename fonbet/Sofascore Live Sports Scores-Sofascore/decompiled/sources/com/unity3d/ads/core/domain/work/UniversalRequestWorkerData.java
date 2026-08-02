package com.unity3d.ads.core.domain.work;

import defpackage.md4;
import defpackage.ww9;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/work/UniversalRequestWorkerData;", "", "", UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID, "<init>", "(Ljava/lang/String;)V", "Lmd4;", "invoke", "()Lmd4;", "Ljava/lang/String;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UniversalRequestWorkerData {

    @NotNull
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";

    @NotNull
    private final String universalRequestId;

    public UniversalRequestWorkerData(@NotNull String str) {
        str.getClass();
        this.universalRequestId = str;
    }

    @NotNull
    public final md4 invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId);
        md4 md4Var = new md4(linkedHashMap);
        ww9.I(md4Var);
        return md4Var;
    }
}
