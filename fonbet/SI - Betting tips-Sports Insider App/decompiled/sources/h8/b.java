package h8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.SQLException;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.a3;
import androidx.appcompat.widget.c1;
import com.android.billingclient.api.m;
import com.google.android.gms.internal.measurement.w4;
import com.sports.insider.MyApp;
import com.sports.insider.data.repository.room.news.NewsTable;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import eg.c0;
import eg.g0;
import eg.m0;
import gf.p;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.h4;
import io.sentry.protocol.b0;
import io.sentry.protocol.d0;
import io.sentry.protocol.u;
import io.sentry.t4;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k2.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q4.r;
import v9.n;
import v9.o;
import v9.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b implements androidx.core.widget.h {
    public static boolean A(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i5 = 0; i5 < bArr2.length; i5++) {
                if (bArr[i5] == bArr2[i5]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void B(Object obj) {
        if (obj instanceof p) {
            throw ((p) obj).f10030a;
        }
    }

    public static final void C(int i5, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i5);
        if (str != null) {
            sb2.append(", message: ".concat(str));
        }
        throw new SQLException(sb2.toString());
    }

    public static void D(t4 t4Var, b6 b6Var) {
        m mVar = t4Var.f17095t;
        ArrayList arrayList = mVar == null ? null : mVar.f4046a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b0 b0Var = ((u) it.next()).f16919e;
                if (b0Var != null) {
                    E(b0Var, t4Var, b6Var, "Truncated exception stack frames of event %s");
                }
            }
        }
        m mVar2 = t4Var.f17094s;
        ArrayList arrayList2 = mVar2 != null ? mVar2.f4046a : null;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                b0 b0Var2 = ((d0) it2.next()).f16768i;
                if (b0Var2 != null) {
                    E(b0Var2, t4Var, b6Var, "Truncated thread stack frames for event %s");
                }
            }
        }
    }

    public static void E(b0 b0Var, t4 t4Var, b6 b6Var, String str) {
        List list = b0Var.f16749a;
        if (list == null || list.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(list.subList(0, 250));
        arrayList.addAll(list.subList(list.size() - 250, list.size()));
        b0Var.f16749a = arrayList;
        b6Var.getLogger().h(b5.DEBUG, str, t4Var.f16455a);
    }

    public static void F(Parcel parcel, int i5, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int V = V(parcel, i5);
        parcel.writeBundle(bundle);
        W(parcel, V);
    }

    public static void G(Parcel parcel, int i5, byte[] bArr, boolean z5) {
        if (bArr == null) {
            if (z5) {
                U(parcel, i5, 0);
            }
        } else {
            int V = V(parcel, i5);
            parcel.writeByteArray(bArr);
            W(parcel, V);
        }
    }

    public static void H(Parcel parcel, int i5, Double d10) {
        if (d10 == null) {
            return;
        }
        U(parcel, i5, 8);
        parcel.writeDouble(d10.doubleValue());
    }

    public static void I(Parcel parcel, int i5, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int V = V(parcel, i5);
        parcel.writeStrongBinder(iBinder);
        W(parcel, V);
    }

    public static void J(Parcel parcel, int i5, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int V = V(parcel, i5);
        parcel.writeIntArray(iArr);
        W(parcel, V);
    }

    public static void K(Parcel parcel, int i5, Integer num) {
        if (num == null) {
            return;
        }
        U(parcel, i5, 4);
        parcel.writeInt(num.intValue());
    }

    public static void M(Parcel parcel, int i5, Long l6) {
        if (l6 == null) {
            return;
        }
        U(parcel, i5, 8);
        parcel.writeLong(l6.longValue());
    }

    public static void N(Parcel parcel, int i5, Parcelable parcelable, int i10, boolean z5) {
        if (parcelable == null) {
            if (z5) {
                U(parcel, i5, 0);
            }
        } else {
            int V = V(parcel, i5);
            parcelable.writeToParcel(parcel, i10);
            W(parcel, V);
        }
    }

    public static void O(Parcel parcel, int i5, String str, boolean z5) {
        if (str == null) {
            if (z5) {
                U(parcel, i5, 0);
            }
        } else {
            int V = V(parcel, i5);
            parcel.writeString(str);
            W(parcel, V);
        }
    }

    public static void P(Parcel parcel, int i5, List list) {
        if (list == null) {
            return;
        }
        int V = V(parcel, i5);
        parcel.writeStringList(list);
        W(parcel, V);
    }

    public static void Q(Parcel parcel, int i5, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int V = V(parcel, i5);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        W(parcel, V);
    }

    public static void R(Parcel parcel, int i5, List list, boolean z5) {
        if (list == null) {
            if (z5) {
                U(parcel, i5, 0);
                return;
            }
            return;
        }
        int V = V(parcel, i5);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        W(parcel, V);
    }

    public static final Bundle S(String serverClientId) {
        Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", serverClientId);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", null);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    public static String T(w4 w4Var) {
        StringBuilder sb2 = new StringBuilder(w4Var.c());
        for (int i5 = 0; i5 < w4Var.c(); i5++) {
            byte a7 = w4Var.a(i5);
            if (a7 == 34) {
                sb2.append("\\\"");
            } else if (a7 == 39) {
                sb2.append("\\'");
            } else if (a7 != 92) {
                switch (a7) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (a7 < 32 || a7 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a7 >>> 6) & 3) + 48));
                            sb2.append((char) (((a7 >>> 3) & 7) + 48));
                            sb2.append((char) ((a7 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) a7);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void U(Parcel parcel, int i5, int i10) {
        parcel.writeInt(i5 | (i10 << 16));
    }

    public static int V(Parcel parcel, int i5) {
        parcel.writeInt(i5 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void W(Parcel parcel, int i5) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i5 - 4);
        parcel.writeInt(dataPosition - i5);
        parcel.setDataPosition(dataPosition);
    }

    public static int a(HashMap hashMap) {
        Iterator it = hashMap.keySet().iterator();
        int i5 = 4;
        while (it.hasNext()) {
            switch (v9.e.f24490a[((v9.j) it.next()).ordinal()]) {
                case 1:
                    i5 = 2;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    i5 = 1;
                    break;
                case 6:
                case 7:
                    i5 = 3;
                    break;
            }
        }
        return i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static v9.m b(JSONObject jSONObject, boolean z5) {
        int i5;
        int i10;
        ArrayList arrayList;
        String string = jSONObject.getString(CommonUrlParts.UUID);
        JSONObject jSONObject2 = jSONObject.getJSONObject("trigger");
        String string2 = jSONObject.getString("type");
        string2.getClass();
        i5 = 6;
        i10 = 5;
        switch (string2) {
            case "visibleElement":
                break;
            case "customEvent":
                i10 = i5;
                break;
            case "nestedClick":
                i10 = 3;
                break;
            case "networkRequest":
                i10 = 4;
                break;
            case "href":
                i10 = 1;
                break;
            case "message":
                i10 = 2;
                break;
            case "sessionDuration":
                i5 = 7;
                i10 = i5;
                break;
            default:
                i10 = 0;
                break;
        }
        HashMap d10 = d(jSONObject2);
        int a7 = a(d10);
        ArrayList arrayList2 = null;
        if (jSONObject2.has("requestBodyJsonPaths")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("requestBodyJsonPaths");
            arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                arrayList.add(jSONArray.getString(i11));
            }
        } else {
            arrayList = null;
        }
        if (jSONObject2.has("responseBodyJsonPaths")) {
            JSONArray jSONArray2 = jSONObject2.getJSONArray("responseBodyJsonPaths");
            arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                arrayList2.add(jSONArray2.getString(i12));
            }
        }
        if (!z5) {
            return new v9.m(string, d10, a7, i10, arrayList, arrayList2);
        }
        return new v9.a(string, jSONObject.getBoolean("onlyMatchOnce"), d10, i10, a7, jSONObject.getString("nrfHash"));
    }

    public static u.k c(g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        u.k s8 = ci.c.s(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(18, g0Var));
        Intrinsics.checkNotNullExpressionValue(s8, "getFuture { completer ->…      }\n        tag\n    }");
        return s8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static HashMap d(JSONObject jSONObject) {
        int i5;
        v9.j jVar;
        int i10;
        JSONArray jSONArray;
        int i11;
        n nVar;
        HashMap hashMap = new HashMap();
        JSONArray jSONArray2 = jSONObject.getJSONArray("params");
        int i12 = 0;
        int i13 = 0;
        while (i13 < jSONArray2.length()) {
            JSONObject jSONObject2 = jSONArray2.getJSONObject(i13);
            String string = jSONObject2.getString("name");
            String string2 = jSONObject2.getString("operator");
            JSONArray jSONArray3 = jSONObject2.getJSONArray("strings");
            string.getClass();
            int i14 = 5;
            switch (string.hashCode()) {
                case -1992012396:
                    if (string.equals("duration")) {
                        i5 = i12;
                        break;
                    }
                    i5 = -1;
                    break;
                case -1965065515:
                    if (string.equals("clickText")) {
                        i5 = 1;
                        break;
                    }
                    i5 = -1;
                    break;
                case -1422950858:
                    if (string.equals("action")) {
                        i5 = 2;
                        break;
                    }
                    i5 = -1;
                    break;
                case -1077554975:
                    if (string.equals("method")) {
                        i5 = 3;
                        break;
                    }
                    i5 = -1;
                    break;
                case -892481550:
                    if (string.equals(PredictionTable.statusColumn)) {
                        i5 = 4;
                        break;
                    }
                    i5 = -1;
                    break;
                case -873112108:
                    if (string.equals("messageText")) {
                        i5 = 5;
                        break;
                    }
                    i5 = -1;
                    break;
                case 3355:
                    if (string.equals("id")) {
                        i5 = 6;
                        break;
                    }
                    i5 = -1;
                    break;
                case 114586:
                    if (string.equals("tag")) {
                        i5 = 7;
                        break;
                    }
                    i5 = -1;
                    break;
                case 116079:
                    if (string.equals("url")) {
                        i5 = 8;
                        break;
                    }
                    i5 = -1;
                    break;
                case 3211051:
                    if (string.equals("href")) {
                        i5 = 9;
                        break;
                    }
                    i5 = -1;
                    break;
                case 3556653:
                    if (string.equals(NewsTable.TEXT_COLUMN)) {
                        i5 = 10;
                        break;
                    }
                    i5 = -1;
                    break;
                case 94742904:
                    if (string.equals("class")) {
                        i5 = 11;
                        break;
                    }
                    i5 = -1;
                    break;
                case 341730462:
                    if (string.equals("logType")) {
                        i5 = 12;
                        break;
                    }
                    i5 = -1;
                    break;
                case 984174864:
                    if (string.equals("event_name")) {
                        i5 = 13;
                        break;
                    }
                    i5 = -1;
                    break;
                case 1191572447:
                    if (string.equals("selector")) {
                        i5 = 14;
                        break;
                    }
                    i5 = -1;
                    break;
                case 1229723015:
                    if (string.equals("clickSelector")) {
                        i5 = 15;
                        break;
                    }
                    i5 = -1;
                    break;
                case 1302741330:
                    if (string.equals("request_body")) {
                        i5 = 16;
                        break;
                    }
                    i5 = -1;
                    break;
                case 1407598154:
                    if (string.equals("sessionDuration")) {
                        i5 = 17;
                        break;
                    }
                    i5 = -1;
                    break;
                case 1676238560:
                    if (string.equals("response_body")) {
                        i5 = 18;
                        break;
                    }
                    i5 = -1;
                    break;
                default:
                    i5 = -1;
                    break;
            }
            v9.j jVar2 = v9.j.f24513m;
            v9.j jVar3 = v9.j.f24512l;
            v9.j jVar4 = v9.j.j;
            v9.j jVar5 = v9.j.f24514n;
            switch (i5) {
                case 0:
                    jVar = v9.j.f24502a;
                    break;
                case 1:
                    jVar = v9.j.f24515o;
                    break;
                case 2:
                    jVar = v9.j.q;
                    break;
                case 3:
                    jVar = v9.j.f24503b;
                    break;
                case 4:
                    jVar = v9.j.f24506e;
                    break;
                case 5:
                    jVar = v9.j.f24508g;
                    break;
                case 6:
                    jVar = jVar2;
                    break;
                case 7:
                    jVar = v9.j.f24511k;
                    break;
                case 8:
                    jVar = v9.j.f24507f;
                    break;
                case 9:
                    jVar = v9.j.f24517r;
                    break;
                case 10:
                    jVar = v9.j.f24510i;
                    break;
                case 11:
                    jVar = jVar3;
                    break;
                case 12:
                    jVar = v9.j.f24509h;
                    break;
                case 13:
                    jVar = v9.j.f24516p;
                    break;
                case 14:
                    jVar = jVar4;
                    break;
                case 15:
                    jVar = jVar5;
                    break;
                case 16:
                    jVar = v9.j.f24505d;
                    break;
                case 17:
                    jVar = v9.j.f24518s;
                    break;
                case 18:
                    jVar = v9.j.f24504c;
                    break;
                default:
                    jVar = null;
                    break;
            }
            String replaceAll = string2.toLowerCase().replaceAll("_", "");
            replaceAll.getClass();
            switch (replaceAll.hashCode()) {
                case -1554585449:
                    if (replaceAll.equals("startswith")) {
                        i10 = i12;
                        break;
                    }
                    i10 = -1;
                    break;
                case -567445985:
                    if (replaceAll.equals("contains")) {
                        i10 = 1;
                        break;
                    }
                    i10 = -1;
                    break;
                case 3244:
                    if (replaceAll.equals("eq")) {
                        i10 = 2;
                        break;
                    }
                    i10 = -1;
                    break;
                case 3309:
                    if (replaceAll.equals("gt")) {
                        i10 = 3;
                        break;
                    }
                    i10 = -1;
                    break;
                case 3370:
                    if (replaceAll.equals("is")) {
                        i10 = 4;
                        break;
                    }
                    i10 = -1;
                    break;
                case 3464:
                    if (replaceAll.equals("lt")) {
                        i10 = 5;
                        break;
                    }
                    i10 = -1;
                    break;
                case 96748:
                    if (replaceAll.equals("any")) {
                        i10 = 6;
                        break;
                    }
                    i10 = -1;
                    break;
                case 102680:
                    if (replaceAll.equals("gte")) {
                        i10 = 7;
                        break;
                    }
                    i10 = -1;
                    break;
                case 107485:
                    if (replaceAll.equals("lte")) {
                        i10 = 8;
                        break;
                    }
                    i10 = -1;
                    break;
                case 11268610:
                    if (replaceAll.equals("containswholeword")) {
                        i10 = 9;
                        break;
                    }
                    i10 = -1;
                    break;
                case 1744111550:
                    if (replaceAll.equals("endswith")) {
                        i10 = 10;
                        break;
                    }
                    i10 = -1;
                    break;
                default:
                    i10 = -1;
                    break;
            }
            switch (i10) {
                case 0:
                    i14 = 10;
                    break;
                case 1:
                    i14 = 2;
                    break;
                case 2:
                    i14 = 4;
                    break;
                case 3:
                    break;
                case 4:
                    i14 = 7;
                    break;
                case 5:
                    i14 = 8;
                    break;
                case 6:
                    i14 = 1;
                    break;
                case 7:
                    i14 = 6;
                    break;
                case 8:
                    i14 = 9;
                    break;
                case 9:
                    i14 = 3;
                    break;
                case 10:
                    i14 = 11;
                    break;
                default:
                    i14 = i12;
                    break;
            }
            if (jVar == null || i14 == 0) {
                throw new JSONException("Param type or operator type cannot be found");
            }
            if (jVar == jVar5) {
                ArrayList arrayList = new ArrayList();
                int i15 = i12;
                while (i15 < jSONArray3.length()) {
                    String string3 = jSONArray3.getString(i15);
                    ArrayList arrayList2 = new ArrayList();
                    String[] split = string3.replaceAll("\\s*>\\s*", " >").replaceAll("\\s+", " ").split("\\s");
                    int length = split.length;
                    int i16 = i12;
                    while (i16 < length) {
                        String str = split[i16];
                        JSONArray jSONArray4 = jSONArray2;
                        char charAt = str.charAt(i12);
                        o oVar = new o();
                        int i17 = i13;
                        oVar.f24529a = null;
                        oVar.f24530b = null;
                        oVar.f24531c = null;
                        oVar.f24532d = false;
                        if (charAt == '>') {
                            oVar.f24532d = true;
                            str = str.substring(1);
                        }
                        String[] split2 = str.split("(?=((?<!\\\\)\\.|#))");
                        int length2 = split2.length;
                        int i18 = 0;
                        while (i18 < length2) {
                            String[] strArr = split2;
                            String str2 = strArr[i18];
                            int i19 = length2;
                            String[] strArr2 = split;
                            char charAt2 = str2.charAt(0);
                            if (charAt2 == '#') {
                                oVar.f24530b = str2.substring(1).replaceAll("\\\\.", ".");
                            } else if (charAt2 != '.') {
                                oVar.f24529a = str2;
                            } else {
                                oVar.f24531c = str2.substring(1).replaceAll("\\\\.", ".");
                            }
                            i18++;
                            split = strArr2;
                            split2 = strArr;
                            length2 = i19;
                        }
                        arrayList2.add(oVar);
                        i16++;
                        jSONArray2 = jSONArray4;
                        i13 = i17;
                        i12 = 0;
                    }
                    arrayList.add(arrayList2);
                    i15++;
                    i13 = i13;
                    i12 = 0;
                }
                jSONArray = jSONArray2;
                i11 = i13;
                nVar = new n(jVar, i14);
                nVar.f24528d = arrayList;
            } else {
                jSONArray = jSONArray2;
                i11 = i13;
                ArrayList arrayList3 = new ArrayList();
                for (int i20 = 0; i20 < jSONArray3.length(); i20++) {
                    if (jVar == jVar4 || jVar == jVar3 || jVar == jVar2) {
                        arrayList3.add(jSONArray3.getString(i20).replaceAll("\\\\.", "."));
                    } else {
                        arrayList3.add(jSONArray3.getString(i20));
                    }
                }
                nVar = new n(jVar, i14, arrayList3);
            }
            hashMap.put(nVar.f24525a, nVar);
            i13 = i11 + 1;
            jSONArray2 = jSONArray;
            i12 = 0;
        }
        return hashMap;
    }

    public static q e(JSONObject jSONObject, String str, boolean z5) {
        ArrayList arrayList;
        HashMap d10 = d(jSONObject);
        int a7 = a(d10);
        ArrayList arrayList2 = null;
        if (jSONObject.has("requestBodyJsonPaths")) {
            JSONArray jSONArray = jSONObject.getJSONArray("requestBodyJsonPaths");
            arrayList = new ArrayList();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                arrayList.add(jSONArray.getString(i5));
            }
        } else {
            arrayList = null;
        }
        if (jSONObject.has("responseBodyJsonPaths")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("responseBodyJsonPaths");
            arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                arrayList2.add(jSONArray2.getString(i10));
            }
        }
        return new q(str, z5, d10, a7, arrayList, arrayList2);
    }

    public static final void f(int i5, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.charAt(i5) == '-') {
            return;
        }
        StringBuilder r5 = c1.r(i5, "Expected '-' (hyphen) at index ", ", but was '");
        r5.append(str.charAt(i5));
        r5.append('\'');
        throw new IllegalArgumentException(r5.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] g(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            jArr[i5] = iArr[i5];
        }
        return jArr;
    }

    public static final p h(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new p(exception);
    }

    public static final s i(Context context, Class klass, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (StringsKt.H(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (Intrinsics.areEqual(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new s(context, klass, str);
    }

    public static void j(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i5 = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (o8.f fVar : (Set) it2.next()) {
                        for (o8.h hVar : fVar.f21117a.f21104c) {
                            if (hVar.f21124c == 0) {
                                Set<o8.f> set = (Set) hashMap.get(new o8.g(hVar.f21122a, hVar.f21123b == 2));
                                if (set != null) {
                                    for (o8.f fVar2 : set) {
                                        fVar.f21118b.add(fVar2);
                                        fVar2.f21119c.add(fVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    o8.f fVar3 = (o8.f) it4.next();
                    if (fVar3.f21119c.isEmpty()) {
                        hashSet2.add(fVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    o8.f fVar4 = (o8.f) hashSet2.iterator().next();
                    hashSet2.remove(fVar4);
                    i5++;
                    Iterator it5 = fVar4.f21118b.iterator();
                    while (it5.hasNext()) {
                        o8.f fVar5 = (o8.f) it5.next();
                        fVar5.f21119c.remove(fVar4);
                        if (fVar5.f21119c.isEmpty()) {
                            hashSet2.add(fVar5);
                        }
                    }
                }
                if (i5 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    o8.f fVar6 = (o8.f) it6.next();
                    if (!fVar6.f21119c.isEmpty() && !fVar6.f21118b.isEmpty()) {
                        arrayList2.add(fVar6.f21117a);
                    }
                }
                throw new o8.i("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            o8.b bVar = (o8.b) it.next();
            o8.f fVar7 = new o8.f(bVar);
            for (o8.p pVar : bVar.f21103b) {
                boolean z5 = bVar.f21106e == 0;
                o8.g gVar = new o8.g(pVar, !z5);
                if (!hashMap.containsKey(gVar)) {
                    hashMap.put(gVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(gVar);
                if (!set2.isEmpty() && z5) {
                    throw new IllegalArgumentException("Multiple components provide " + pVar + ".");
                }
                set2.add(fVar7);
            }
        }
    }

    public static fh.c k(String str) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        fh.b r5 = fh.c.r();
        String jSONArray2 = jSONArray.toString();
        r5.d();
        fh.c.p((fh.c) r5.f6816b, jSONArray2);
        return (fh.c) r5.a();
    }

    public static final void l(s2.a aVar, String sql) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(sql, "sql");
        s2.c r02 = aVar.r0(sql);
        try {
            r02.n0();
            u6.h.g(r02, null);
        } finally {
        }
    }

    public static final void m(long j, byte[] dst, int i5, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i12 = 7 - i10;
        int i13 = 8 - i11;
        if (i13 > i12) {
            return;
        }
        while (true) {
            int i14 = kotlin.text.d.f19260a[(int) ((j >> (i12 << 3)) & 255)];
            int i15 = i5 + 1;
            dst[i5] = (byte) (i14 >> 8);
            i5 += 2;
            dst[i15] = (byte) i14;
            if (i12 == i13) {
                return;
            } else {
                i12--;
            }
        }
    }

    public static Drawable n(Context context, int i5) {
        return a3.d().f(context, i5);
    }

    public static v9.b o(JSONObject jSONObject) {
        if (jSONObject.has("isErrorState") && jSONObject.getBoolean("isErrorState")) {
            return b(jSONObject, true);
        }
        String string = jSONObject.getString(CommonUrlParts.UUID);
        boolean z5 = jSONObject.getBoolean("onlyMatchOnce");
        JSONObject optJSONObject = jSONObject.optJSONObject("trigger");
        if (optJSONObject != null) {
            return e(optJSONObject, string, z5);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("transaction");
        if (optJSONObject2 == null) {
            return null;
        }
        q e7 = e(optJSONObject2.getJSONObject("startTrigger"), string, z5);
        q e9 = e(optJSONObject2.getJSONObject("endTrigger"), string, z5);
        v9.p pVar = new v9.p();
        pVar.f24469a = string;
        pVar.f24470b = z5;
        pVar.f24533d = e7;
        pVar.f24534e = e9;
        pVar.f24471c = 2;
        return pVar;
    }

    public static final long p(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            return h.b.c(packageManager, packageName, 4096).firstInstallTime;
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new r(ex, null, 18), 2);
            return 0L;
        }
    }

    public static final int q(int i5, Intent intent, String nameKey) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(nameKey, "nameKey");
        return intent.getIntExtra(nameKey, i5);
    }

    public static final long r(int i5, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (bArr[i5 + 7] & 255) | ((bArr[i5] & 255) << 56) | ((bArr[i5 + 1] & 255) << 48) | ((bArr[i5 + 2] & 255) << 40) | ((bArr[i5 + 3] & 255) << 32) | ((bArr[i5 + 4] & 255) << 24) | ((bArr[i5 + 5] & 255) << 16) | ((bArr[i5 + 6] & 255) << 8);
    }

    public static v9.k s(JSONObject jSONObject) {
        String optString = jSONObject.optString(CommonUrlParts.UUID, "");
        int i5 = jSONObject.getInt("samplingRate");
        JSONArray optJSONArray = jSONObject.optJSONArray("rules");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            arrayList.add(b(optJSONArray.getJSONObject(i10), false));
        }
        v9.k kVar = new v9.k();
        kVar.f24520a = optString;
        kVar.f24521b = i5;
        kVar.f24522c = arrayList;
        return kVar;
    }

    public static final long t(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            return h.b.c(packageManager, packageName, 4096).lastUpdateTime;
        } catch (Exception ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new r(ex, null, 18), 2);
            return 0L;
        }
    }

    public static boolean u(t4 t4Var, b6 b6Var) {
        return io.sentry.util.d.a(b6Var.getSerializer(), b6Var.getLogger(), t4Var) <= b6.MAX_EVENT_SIZE_BYTES;
    }

    public static String v(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i5 = 0; i5 < str.length(); i5++) {
            sb2.append(str.charAt(i5));
            if (str2.length() > i5) {
                sb2.append(str2.charAt(i5));
            }
        }
        return sb2.toString();
    }

    public static final void w(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putString(key, null);
    }

    public static final void x(Bundle bundle, String key, Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void y(Bundle bundle, String key, List value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(value, "<this>");
        bundle.putStringArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
    }

    public static void z(h4 h4Var, l1.a aVar, ILogger iLogger) {
        if (h4Var.f16455a != null) {
            aVar.u("event_id");
            aVar.H(iLogger, h4Var.f16455a);
        }
        aVar.u("contexts");
        aVar.H(iLogger, h4Var.f16456b);
        if (h4Var.f16457c != null) {
            aVar.u("sdk");
            aVar.H(iLogger, h4Var.f16457c);
        }
        if (h4Var.f16458d != null) {
            aVar.u("request");
            aVar.H(iLogger, h4Var.f16458d);
        }
        AbstractMap abstractMap = h4Var.f16459e;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            aVar.u("tags");
            aVar.H(iLogger, h4Var.f16459e);
        }
        if (h4Var.f16460f != null) {
            aVar.u("release");
            aVar.K(h4Var.f16460f);
        }
        if (h4Var.f16461g != null) {
            aVar.u("environment");
            aVar.K(h4Var.f16461g);
        }
        if (h4Var.f16462h != null) {
            aVar.u("platform");
            aVar.K(h4Var.f16462h);
        }
        if (h4Var.f16463i != null) {
            aVar.u("user");
            aVar.H(iLogger, h4Var.f16463i);
        }
        if (h4Var.f16464k != null) {
            aVar.u("server_name");
            aVar.K(h4Var.f16464k);
        }
        if (h4Var.f16465l != null) {
            aVar.u("dist");
            aVar.K(h4Var.f16465l);
        }
        List list = h4Var.f16466m;
        if (list != null && !list.isEmpty()) {
            aVar.u("breadcrumbs");
            aVar.H(iLogger, h4Var.f16466m);
        }
        if (h4Var.f16467n != null) {
            aVar.u("debug_meta");
            aVar.H(iLogger, h4Var.f16467n);
        }
        AbstractMap abstractMap2 = h4Var.f16468o;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        aVar.u("extra");
        aVar.H(iLogger, h4Var.f16468o);
    }

    public abstract void L(byte[] bArr, int i5, int i10);
}
