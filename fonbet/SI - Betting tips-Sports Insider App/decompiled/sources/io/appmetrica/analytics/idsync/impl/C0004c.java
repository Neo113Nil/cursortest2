package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.idsync.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004c implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final C0006e f11847a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11848b = "id_sync";

    /* renamed from: c, reason: collision with root package name */
    public final String f11849c = "id_sync";

    /* renamed from: d, reason: collision with root package name */
    public final String f11850d = "launch_delay_seconds";

    /* renamed from: e, reason: collision with root package name */
    public final String f11851e = "requests";

    /* renamed from: f, reason: collision with root package name */
    public final String f11852f = "type";

    /* renamed from: g, reason: collision with root package name */
    public final String f11853g = "url";

    /* renamed from: h, reason: collision with root package name */
    public final String f11854h = "headers";

    /* renamed from: i, reason: collision with root package name */
    public final String f11855i = "resend_interval_for_valid_response";
    public final String j = "resend_interval_for_invalid_response";

    /* renamed from: k, reason: collision with root package name */
    public final String f11856k = "valid_response_codes";

    /* renamed from: l, reason: collision with root package name */
    public final String f11857l = "preconditions";

    /* renamed from: m, reason: collision with root package name */
    public final String f11858m = "network";

    /* renamed from: n, reason: collision with root package name */
    public final String f11859n = "cell";

    /* renamed from: o, reason: collision with root package name */
    public final String f11860o = "report_event_enabled";

    /* renamed from: p, reason: collision with root package name */
    public final String f11861p = "report_url";

    public C0004c(@NotNull C0006e c0006e) {
        this.f11847a = c0006e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig parse(@NotNull JSONObject jSONObject) {
        k[] kVarArr;
        JSONArray jSONArray;
        i[] iVarArr;
        JSONArray jSONArray2;
        byte[][] bArr;
        int[] iArr;
        int[] iArr2;
        int i5;
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f11849c);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        m mVar = new m();
        mVar.f11893a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.f11848b, mVar.f11893a);
        l lVar = new l();
        lVar.f11888a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject, this.f11850d, lVar.f11888a);
        JSONArray optJSONArray = optJSONObject.optJSONArray(this.f11851e);
        int i10 = 0;
        if (optJSONArray == null) {
            kVarArr = new k[0];
        } else {
            int length = optJSONArray.length();
            k[] kVarArr2 = new k[length];
            int i11 = 0;
            while (i11 < length) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                k kVar = new k();
                if (optJSONObject2 == null) {
                    jSONArray = optJSONArray;
                    i5 = i10;
                } else {
                    String optString = optJSONObject2.optString(this.f11852f);
                    Charset charset = Charsets.UTF_8;
                    kVar.f11878a = optString.getBytes(charset);
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject(this.f11857l);
                    j jVar = new j();
                    if (optJSONObject3 != null && Intrinsics.areEqual(optJSONObject3.optString(this.f11858m), this.f11859n)) {
                        jVar.f11877a = 1;
                    }
                    kVar.f11879b = jVar;
                    kVar.f11880c = optJSONObject2.optString(this.f11853g).getBytes(charset);
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject(this.f11854h);
                    if (optJSONObject4 == null) {
                        iVarArr = new i[i10];
                        jSONArray = optJSONArray;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> keys = optJSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            i iVar = new i();
                            iVar.f11874a = next.getBytes(Charsets.UTF_8);
                            JSONArray optJSONArray2 = optJSONObject4.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                bArr = new byte[i10][];
                                jSONArray2 = optJSONArray;
                            } else {
                                int length2 = optJSONArray2.length();
                                byte[][] bArr2 = new byte[length2][];
                                jSONArray2 = optJSONArray;
                                int i12 = 0;
                                while (i12 < length2) {
                                    byte[][] bArr3 = bArr2;
                                    int i13 = i12;
                                    bArr3[i13] = optJSONArray2.optString(i12).getBytes(Charsets.UTF_8);
                                    i12 = i13 + 1;
                                    bArr2 = bArr3;
                                }
                                bArr = bArr2;
                            }
                            iVar.f11875b = bArr;
                            arrayList.add(iVar);
                            optJSONArray = jSONArray2;
                            i10 = 0;
                        }
                        jSONArray = optJSONArray;
                        Object[] array = arrayList.toArray(new i[i10]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        iVarArr = (i[]) array;
                    }
                    kVar.f11881d = iVarArr;
                    kVar.f11882e = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.f11855i, kVar.f11882e);
                    kVar.f11883f = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject2, this.j, kVar.f11883f);
                    JSONArray optJSONArray3 = optJSONObject2.optJSONArray(this.f11856k);
                    if (optJSONArray3 == null) {
                        iArr = new int[0];
                    } else {
                        int length3 = optJSONArray3.length();
                        int[] iArr3 = new int[length3];
                        for (int i14 = 0; i14 < length3; i14++) {
                            iArr3[i14] = optJSONArray3.optInt(i14);
                        }
                        iArr = iArr3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i15 : iArr) {
                        if (i15 != 0) {
                            arrayList2.add(Integer.valueOf(i15));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        iArr2 = CollectionsKt.V(arrayList2);
                        i5 = 0;
                    } else {
                        i5 = 0;
                        iArr2 = new int[]{200};
                    }
                    kVar.f11884g = iArr2;
                    kVar.f11885h = optJSONObject2.optBoolean(this.f11860o, kVar.f11885h);
                    kVar.f11886i = optJSONObject2.optString(this.f11861p);
                }
                kVarArr2[i11] = kVar;
                i11++;
                i10 = i5;
                optJSONArray = jSONArray;
            }
            kVarArr = kVarArr2;
        }
        lVar.f11889b = kVarArr;
        mVar.f11894b = lVar;
        return this.f11847a.toModel(mVar);
    }

    @Nullable
    public final IdSyncConfig b(@NotNull JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (IdSyncConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
