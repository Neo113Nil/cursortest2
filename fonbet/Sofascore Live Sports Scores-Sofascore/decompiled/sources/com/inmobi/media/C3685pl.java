package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.pl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3685pl extends H9 {
    public final Zk b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3685pl(String str, Zk zk, String str2, int i, int i2, int i3) {
        super(str);
        str.getClass();
        zk.getClass();
        this.b = zk;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final Ze a() {
        String str;
        InMobiUserDataTypes inMobiUserDataTypes;
        InMobiUserDataTypes inMobiUserDataTypes2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Objects.toString(C3490i7.a);
        String str2 = (String) AbstractC3551kh.a().get("u-age");
        if (str2 != null) {
        }
        String jSONArray = AbstractC3633nl.b().toString();
        jSONArray.getClass();
        linkedHashMap.put("ufids", jSONArray);
        C3872x1 c3872x1 = Yk.a;
        Boolean bool = c3872x1 != null ? c3872x1.c : null;
        if (bool == null || (str = bool.toString()) == null) {
            str = "true";
        }
        linkedHashMap.put(com.ironsource.L6.s, str);
        linkedHashMap.put("mk-version", AbstractC3450gj.a());
        String str3 = E1.a;
        if (str3 != null) {
        }
        linkedHashMap.put(com.ironsource.L6.d0, AbstractC3424fj.c());
        linkedHashMap.put("ts", String.valueOf(System.currentTimeMillis()));
        String str4 = this.c;
        if (str4 != null) {
        }
        InMobiUserDataModel inMobiUserDataModel = C3490i7.b;
        if (inMobiUserDataModel == null || (inMobiUserDataTypes = inMobiUserDataModel.getEmailId()) == null || (inMobiUserDataTypes.getMd5() == null && inMobiUserDataTypes.getSha1() == null && inMobiUserDataTypes.getSha256() == null)) {
            inMobiUserDataTypes = null;
        }
        if (inMobiUserDataTypes != null) {
        }
        InMobiUserDataModel inMobiUserDataModel2 = C3490i7.b;
        if (inMobiUserDataModel2 == null || (inMobiUserDataTypes2 = inMobiUserDataModel2.getPhoneNumber()) == null || (inMobiUserDataTypes2.getMd5() == null && inMobiUserDataTypes2.getSha1() == null && inMobiUserDataTypes2.getSha256() == null)) {
            inMobiUserDataTypes2 = null;
        }
        if (inMobiUserDataTypes2 != null) {
        }
        InMobiUserDataModel inMobiUserDataModel3 = C3490i7.b;
        HashMap<String, String> extras = inMobiUserDataModel3 != null ? inMobiUserDataModel3.getExtras() : null;
        if (extras != null) {
            linkedHashMap.putAll(extras);
        }
        linkedHashMap.putAll(this.b.a());
        linkedHashMap.putAll(E1.e);
        linkedHashMap.putAll(F5.a.a(false));
        linkedHashMap.putAll(H8.a());
        JSONObject b = AbstractC3386e7.b();
        if (b != null) {
            String jSONObject = b.toString();
            jSONObject.getClass();
            linkedHashMap.put("consentObject", jSONObject);
        }
        String str5 = this.a;
        C3438g7 c3438g7 = new C3438g7(linkedHashMap);
        int i = this.d;
        int i2 = this.e;
        IntRange intRange = AbstractC3446gf.a;
        Vi vi = new Vi(i, i2 * 1000, 0);
        long j = this.f * 1000;
        return new Ze(str5, null, new Ok(j, j, j), c3438g7, vi, 32);
    }
}
