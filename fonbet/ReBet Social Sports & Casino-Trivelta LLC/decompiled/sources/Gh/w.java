package Gh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4192b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final s[][] f4193a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            s[][] sVarArr = new s[jSONArray.length()][];
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
                s[] sVarArr2 = new s[jSONArray2.length()];
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    sVarArr2[i11] = s.f4181d.a(jSONArray2.getJSONObject(i11));
                }
                sVarArr[i10] = sVarArr2;
            }
            return new w(sVarArr);
        }

        public a() {
        }
    }

    public w(s[][] sVarArr) {
        this.f4193a = sVarArr;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        s[][] sVarArr = this.f4193a;
        if (sVarArr != null) {
            int length = sVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                s[] sVarArr2 = sVarArr[i10];
                int i12 = i11 + 1;
                JSONArray jSONArray2 = new JSONArray();
                if (sVarArr2 != null) {
                    int length2 = sVarArr2.length;
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < length2) {
                        s sVar = sVarArr2[i13];
                        int i15 = i14 + 1;
                        jSONArray2.put(i14, sVar != null ? sVar.b() : null);
                        i13++;
                        i14 = i15;
                    }
                }
                jSONArray.put(i11, jSONArray2);
                i10++;
                i11 = i12;
            }
        }
        return jSONArray;
    }
}
