package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.NetworkType;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class C implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k fromModel(@NotNull RequestConfig requestConfig) {
        k kVar = new k();
        String type = requestConfig.getType();
        Charset charset = Charsets.UTF_8;
        kVar.f11878a = type.getBytes(charset);
        j jVar = new j();
        jVar.f11877a = B.f11827a[requestConfig.getPreconditions().getNetworkType().ordinal()] != 1 ? 0 : 1;
        kVar.f11879b = jVar;
        kVar.f11880c = requestConfig.getUrl().getBytes(charset);
        Map<String, List<String>> headers = requestConfig.getHeaders();
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            i iVar = new i();
            iVar.f11874a = key.getBytes(Charsets.UTF_8);
            int size = value.size();
            byte[][] bArr = new byte[size][];
            for (int i5 = 0; i5 < size; i5++) {
                bArr[i5] = value.get(i5).getBytes(Charsets.UTF_8);
            }
            iVar.f11875b = bArr;
            arrayList.add(iVar);
        }
        Object[] array = arrayList.toArray(new i[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        kVar.f11881d = (i[]) array;
        kVar.f11882e = requestConfig.getResendIntervalForValidResponse();
        kVar.f11883f = requestConfig.getResendIntervalForInvalidResponse();
        kVar.f11884g = CollectionsKt.V(requestConfig.getValidResponseCodes());
        kVar.f11885h = requestConfig.getReportEventEnabled();
        String reportUrl = requestConfig.getReportUrl();
        if (reportUrl == null) {
            reportUrl = "";
        }
        kVar.f11886i = reportUrl;
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r4 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RequestConfig toModel(@NotNull k kVar) {
        NetworkType networkType;
        byte[] bArr = kVar.f11878a;
        Charset charset = Charsets.UTF_8;
        String str = new String(bArr, charset);
        j jVar = kVar.f11879b;
        if (jVar != null) {
            if (jVar.f11877a == 1) {
                networkType = NetworkType.CELL;
            } else {
                networkType = NetworkType.ANY;
            }
        }
        networkType = NetworkType.ANY;
        Preconditions preconditions = new Preconditions(networkType);
        String str2 = new String(kVar.f11880c, charset);
        i[] iVarArr = kVar.f11881d;
        int a7 = m0.a(iVarArr.length);
        if (a7 < 16) {
            a7 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
        for (i iVar : iVarArr) {
            String str3 = new String(iVar.f11874a, Charsets.UTF_8);
            byte[][] bArr2 = iVar.f11875b;
            ArrayList arrayList = new ArrayList(bArr2.length);
            for (byte[] bArr3 : bArr2) {
                arrayList.add(new String(bArr3, Charsets.UTF_8));
            }
            linkedHashMap.put(str3, arrayList);
        }
        long j = kVar.f11882e;
        long j6 = kVar.f11883f;
        List y5 = kotlin.collections.p.y(kVar.f11884g);
        boolean z5 = kVar.f11885h;
        String str4 = kVar.f11886i;
        if (str4.length() <= 0) {
            str4 = null;
        }
        return new RequestConfig(str, str2, preconditions, linkedHashMap, j, j6, y5, z5, str4);
    }
}
