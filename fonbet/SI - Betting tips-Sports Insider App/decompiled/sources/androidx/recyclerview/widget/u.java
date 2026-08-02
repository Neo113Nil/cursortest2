package androidx.recyclerview.widget;

import com.google.android.gms.internal.measurement.d5;
import com.logrocket.core.LogRocketCore;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2561a;

    /* renamed from: b, reason: collision with root package name */
    public int f2562b;

    /* renamed from: c, reason: collision with root package name */
    public int f2563c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2564d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2565e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f2566f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2567g;

    public u(LogRocketCore logRocketCore, com.logrocket.core.f fVar) {
        this.f2564d = new ba.d("http-upload");
        this.f2562b = 0;
        this.f2563c = 0;
        this.f2567g = "";
        this.f2565e = logRocketCore;
        this.f2566f = "https://r.lr-intake.com/i";
        this.f2561a = true;
    }

    public static HttpURLConnection b(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("X-LogRocket-Relay-Version", "2024.9.0");
        httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        return httpURLConnection;
    }

    public static JSONArray e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return new JSONArray(sb2.toString());
            }
            sb2.append(readLine);
        }
    }

    public static v h(ArrayDeque arrayDeque, int i5, boolean z5) {
        v vVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                vVar = null;
                break;
            }
            vVar = (v) it.next();
            if (vVar.f2569a == i5 && vVar.f2571c == z5) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            v vVar2 = (v) it.next();
            if (z5) {
                vVar2.f2570b--;
            } else {
                vVar2.f2570b++;
            }
        }
        return vVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cb, code lost:
    
        if (r9.equals("BLOCK_RECORDING") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.appcompat.widget.a a(HttpURLConnection httpURLConnection) {
        JSONObject jSONObject;
        int responseCode = httpURLConnection.getResponseCode();
        ((ba.d) this.f2564d).a("Upload response: " + responseCode);
        if (responseCode == 0) {
            throw new IOException("Invalid server response code.");
        }
        if (responseCode == 200) {
            return new androidx.appcompat.widget.a(1);
        }
        if (responseCode != 201) {
            if (responseCode == 401) {
                throw new y9.l("licenseExpired");
            }
            if (responseCode == 413) {
                throw new y9.l("payloadTooLarge");
            }
            if (responseCode >= 400 && responseCode < 500) {
                throw new y9.l(androidx.appcompat.widget.c1.i(responseCode, "status-"));
            }
            if (responseCode == 503) {
                throw new y9.l("serverUnavailable");
            }
            if (responseCode >= 500) {
                return new androidx.appcompat.widget.a(2);
            }
            throw new y9.l("invalidPayload");
        }
        try {
            JSONArray e7 = e(httpURLConnection.getInputStream());
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < e7.length(); i5++) {
                JSONObject jSONObject2 = e7.getJSONObject(i5);
                String string = jSONObject2.getString("type");
                int i10 = 9;
                if (!string.contains("FILTERS|")) {
                    if (!string.contains("RECORDING_CONDITIONS|")) {
                        switch (string.hashCode()) {
                            case -2061156587:
                                if (string.equals("SESSIONS_TRIGGERED")) {
                                    i10 = 0;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case -1999765672:
                                if (string.equals("APP_QUOTA_EXCEEDED")) {
                                    i10 = 1;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case -1876616956:
                                if (string.equals("DASHBOARD_URL")) {
                                    i10 = 2;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case -1800638118:
                                if (string.equals("QUOTA_EXCEEDED")) {
                                    i10 = 3;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case -1722513980:
                                if (string.equals("INACTIVITY_TIME_THRESHOLD")) {
                                    i10 = 4;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case -936320344:
                                if (string.equals("PAUSE_RECORDING")) {
                                    i10 = 5;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case -789643084:
                                if (string.equals("EXTRA_QS_PARAMS")) {
                                    i10 = 6;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case -339761376:
                                if (string.equals("SDK_VERSION_BLOCKED")) {
                                    i10 = 7;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case -260469682:
                                if (string.equals("USER_QUOTA_EXCEEDED")) {
                                    i10 = 8;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case -35098497:
                                break;
                            case 243353:
                                if (string.equals("RECORDING_CONDITION_THRESHOLD")) {
                                    i10 = 10;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case 72434327:
                                if (string.equals("MOBILE_QUOTA_EXCEEDED")) {
                                    i10 = 11;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case 956447290:
                                if (string.equals("START_NEW_SESSION")) {
                                    i10 = 12;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case 2058764654:
                                if (string.equals("SUSPEND_RECORDING")) {
                                    i10 = 13;
                                    break;
                                }
                                i10 = -1;
                                break;
                            case 2092111627:
                                if (string.equals("ALLOW_THIRD_PARTY_URLS")) {
                                    i10 = 14;
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
                                i10 = 12;
                                break;
                            case 1:
                                i10 = 3;
                                break;
                            case 2:
                                i10 = 8;
                                break;
                            case 3:
                            case 11:
                                i10 = 1;
                                break;
                            case 4:
                                i10 = 16;
                                break;
                            case 5:
                                i10 = 5;
                                break;
                            case 6:
                                i10 = 14;
                                break;
                            case 7:
                                i10 = 7;
                                break;
                            case 8:
                                i10 = 2;
                                break;
                            case 9:
                                i10 = 4;
                                break;
                            case 10:
                                i10 = 10;
                                break;
                            case 12:
                                i10 = 6;
                                break;
                            case 13:
                                i10 = 13;
                                break;
                            case 14:
                                i10 = 15;
                                break;
                            default:
                                i10 = 0;
                                break;
                        }
                    } else {
                        i10 = 11;
                    }
                }
                if (i10 != 0) {
                    try {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } catch (JSONException unused) {
                        jSONObject = null;
                    }
                    arrayList.add(new y9.j(i10, jSONObject));
                }
            }
            return new androidx.appcompat.widget.a(1, arrayList, true);
        } catch (IOException | JSONException unused2) {
            throw new y9.l("invalidPayload");
        }
    }

    public URL c(com.logrocket.core.f0 f0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) this.f2566f);
        sb2.append("?");
        sb2.append(d5.G("a", f0Var.f6445a));
        sb2.append("&");
        sb2.append(d5.G("r", f0Var.f6446b));
        sb2.append("&");
        sb2.append(d5.G("t", f0Var.f6448d));
        sb2.append("&");
        int i5 = f0Var.f6447c;
        sb2.append(d5.F(i5, "s"));
        sb2.append("&");
        sb2.append(d5.G("rs", String.format("%d,u", Integer.valueOf(i5))));
        sb2.append("&");
        sb2.append(d5.H("ro", true));
        sb2.append("&");
        sb2.append(d5.G("st", "mobile"));
        return new URL(sb2.toString());
    }

    public URL d(y9.b bVar, boolean z5) {
        LogRocketCore logRocketCore = (LogRocketCore) this.f2565e;
        y9.a aVar = bVar.f25740a;
        com.logrocket.core.f0 f0Var = aVar.f25735a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) this.f2566f);
        sb2.append("?");
        sb2.append(d5.G("a", f0Var.f6445a));
        sb2.append("&");
        sb2.append(d5.G("r", f0Var.f6446b));
        sb2.append("&");
        sb2.append(d5.G("t", f0Var.f6448d));
        sb2.append("&");
        sb2.append(d5.F(f0Var.f6447c, "s"));
        sb2.append("&");
        sb2.append(d5.H("ir", true));
        sb2.append("&");
        sb2.append(d5.H("hp", z5));
        sb2.append("&");
        sb2.append(d5.H("ip", this.f2561a));
        sb2.append("&");
        y9.d dVar = aVar.f25739e;
        com.logrocket.core.f0 f0Var2 = aVar.f25735a;
        sb2.append(d5.F(dVar.f25747a, "is"));
        StringBuilder b10 = v.f.b(sb2.toString());
        b10.append((String) this.f2567g);
        StringBuilder b11 = v.f.b(b10.toString());
        StringBuilder sb3 = new StringBuilder();
        String str = aVar.f25737c;
        if (str == null || aVar.f25739e != y9.d.IDENTIFIED) {
            sb3.append("&");
            sb3.append(d5.G("u", f0Var2.f6449e));
        } else {
            sb3.append("&");
            sb3.append(d5.G("u", str));
        }
        b11.append(sb3.toString());
        StringBuilder b12 = v.f.b(b11.toString());
        StringBuilder sb4 = new StringBuilder();
        ArrayList arrayList = logRocketCore.f6464c;
        if (!arrayList.isEmpty()) {
            StringBuilder sb5 = new StringBuilder();
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                sb5.append(arrayList.get(i5));
                if (i5 != arrayList.size() - 1) {
                    sb5.append(StringUtils.COMMA);
                }
            }
            sb4.append("&");
            sb4.append(d5.G("ts", sb5.toString()));
        }
        b12.append(sb4.toString());
        StringBuilder b13 = v.f.b(b12.toString());
        StringBuilder sb6 = new StringBuilder();
        HashMap hashMap = logRocketCore.f6463b;
        if (hashMap.isEmpty()) {
            sb6.append("&");
            sb6.append(d5.G("rs", f0Var2.f6447c + ",u"));
        } else {
            StringBuilder sb7 = new StringBuilder();
            for (Map.Entry entry : hashMap.entrySet()) {
                sb7.append((String) entry.getKey());
                sb7.append(StringUtils.COMMA);
                sb7.append(((Boolean) entry.getValue()).booleanValue() ? "t" : "f");
                sb7.append(";");
            }
            sb7.deleteCharAt(sb7.length() - 1);
            sb6.append("&");
            sb6.append(d5.G("rs", sb7.toString()));
        }
        b13.append(sb6.toString());
        return new URL(b13.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(c cVar) {
        int i5;
        int i10;
        int[] iArr;
        ArrayList arrayList;
        int[] iArr2 = (int[]) this.f2565e;
        ArrayList arrayList2 = (ArrayList) this.f2564d;
        int i11 = this.f2562b;
        d dVar = (d) this.f2567g;
        i iVar = new i(cVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        int i12 = this.f2563c;
        int i13 = 1;
        int size = arrayList2.size() - 1;
        int i14 = i12;
        int i15 = i11;
        while (size >= 0) {
            t tVar = (t) arrayList2.get(size);
            int i16 = tVar.f2554a;
            int i17 = tVar.f2556c;
            int i18 = i16 + i17;
            int i19 = tVar.f2555b;
            int i20 = i19 + i17;
            int i21 = i13;
            while (true) {
                i5 = 0;
                if (i15 <= i18) {
                    break;
                }
                i15--;
                int i22 = iArr2[i15];
                if ((i22 & 12) != 0) {
                    iArr = iArr2;
                    int i23 = i22 >> 4;
                    v h10 = h(arrayDeque, i23, false);
                    if (h10 != null) {
                        int i24 = (i11 - h10.f2570b) - 1;
                        iVar.a(i15, i24);
                        if ((i22 & 4) != 0) {
                            arrayList = arrayList2;
                            iVar.d(i24, i21, dVar.g(i15, i23));
                        } else {
                            arrayList = arrayList2;
                        }
                    } else {
                        arrayList = arrayList2;
                        boolean z5 = i21;
                        arrayDeque.add(new v(i15, (i11 - i15) - (z5 ? 1 : 0), z5));
                    }
                } else {
                    iArr = iArr2;
                    arrayList = arrayList2;
                    iVar.c(i15, i21);
                    i11--;
                }
                arrayList2 = arrayList;
                iArr2 = iArr;
                i21 = 1;
            }
            int[] iArr3 = iArr2;
            ArrayList arrayList3 = arrayList2;
            while (i14 > i20) {
                i14--;
                int i25 = ((int[]) this.f2566f)[i14];
                if ((i25 & 12) != 0) {
                    int i26 = i25 >> 4;
                    v h11 = h(arrayDeque, i26, true);
                    if (h11 == null) {
                        arrayDeque.add(new v(i14, i11 - i15, false));
                        i10 = 0;
                    } else {
                        i10 = 0;
                        iVar.a((i11 - h11.f2570b) - 1, i15);
                        if ((i25 & 4) != 0) {
                            iVar.d(i15, 1, dVar.g(i26, i14));
                        }
                    }
                } else {
                    i10 = i5;
                    iVar.b(i15, 1);
                    i11++;
                }
                i5 = i10;
            }
            int i27 = i19;
            int i28 = i16;
            while (i5 < i17) {
                if ((iArr3[i28] & 15) == 2) {
                    iVar.d(i28, 1, dVar.g(i28, i27));
                }
                i28++;
                i27++;
                i5++;
            }
            size--;
            i14 = i19;
            i15 = i16;
            i13 = 1;
            arrayList2 = arrayList3;
            iArr2 = iArr3;
        }
        iVar.e();
    }

    public androidx.appcompat.widget.a g(com.logrocket.core.f0 f0Var) {
        ba.d dVar = (ba.d) this.f2564d;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = b(c(f0Var));
                androidx.appcompat.widget.a a7 = a(httpURLConnection);
                try {
                    httpURLConnection.disconnect();
                    return a7;
                } catch (Throwable th2) {
                    dVar.e("Failed to terminate uploader connection", th2);
                    return a7;
                }
            } catch (IOException unused) {
                androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(2);
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable th3) {
                        dVar.e("Failed to terminate uploader connection", th3);
                    }
                }
                return aVar;
            }
        } catch (Throwable th4) {
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable th5) {
                    dVar.e("Failed to terminate uploader connection", th5);
                }
            }
            throw th4;
        }
    }

    public androidx.appcompat.widget.a i(y9.b bVar) {
        ba.d dVar = (ba.d) this.f2564d;
        boolean z5 = this.f2562b >= 2;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection b10 = b(d(bVar, z5));
                OutputStream outputStream = b10.getOutputStream();
                if (!z5) {
                    bVar.h(outputStream);
                }
                outputStream.flush();
                androidx.appcompat.widget.a a7 = a(b10);
                if (a7.f676a == 2) {
                    this.f2562b++;
                } else {
                    this.f2562b = 0;
                    if (z5) {
                        a7 = new androidx.appcompat.widget.a(2);
                    }
                }
                if (!z5) {
                    this.f2563c = 0;
                } else if (this.f2563c >= 6) {
                    throw new y9.l("networkFailureHealthProbeSuccessful");
                }
                try {
                    b10.disconnect();
                    return a7;
                } catch (Throwable th2) {
                    dVar.e("Failed to terminate uploader connection", th2);
                    return a7;
                }
            } catch (Throwable th3) {
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable th4) {
                        dVar.e("Failed to terminate uploader connection", th4);
                    }
                }
                throw th3;
            }
        } catch (MalformedURLException e7) {
            dVar.e("Failed to create a valid upload URL", e7);
            throw new y9.l("invalidServer");
        } catch (IOException e9) {
            dVar.e("IO error while uploading data.", e9);
            this.f2562b++;
            int i5 = this.f2563c + 1;
            this.f2563c = i5;
            if (i5 >= 6) {
                throw new y9.l("networkFailureIOError");
            }
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(2);
            if (0 != 0) {
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable th5) {
                    dVar.e("Failed to terminate uploader connection", th5);
                }
            }
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(d dVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z5) {
        int i5;
        t tVar;
        int i10;
        this.f2564d = arrayList;
        this.f2565e = iArr;
        this.f2566f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f2567g = dVar;
        int i11 = dVar.i();
        this.f2562b = i11;
        int h10 = dVar.h();
        this.f2563c = h10;
        this.f2561a = z5;
        t tVar2 = arrayList.isEmpty() ? null : (t) arrayList.get(0);
        if (tVar2 == null || tVar2.f2554a != 0 || tVar2.f2555b != 0) {
            arrayList.add(0, new t(0, 0, 0));
        }
        arrayList.add(new t(i11, h10, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t tVar3 = (t) it.next();
            for (int i12 = 0; i12 < tVar3.f2556c; i12++) {
                int i13 = tVar3.f2554a + i12;
                int i14 = tVar3.f2555b + i12;
                int i15 = dVar.a(i13, i14) ? 1 : 2;
                iArr[i13] = (i14 << 4) | i15;
                iArr2[i14] = (i13 << 4) | i15;
            }
        }
        if (this.f2561a) {
            Iterator it2 = arrayList.iterator();
            int i16 = 0;
            while (it2.hasNext()) {
                t tVar4 = (t) it2.next();
                while (true) {
                    i5 = tVar4.f2554a;
                    if (i16 < i5) {
                        if (iArr[i16] == 0) {
                            int size = arrayList.size();
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                if (i17 < size) {
                                    tVar = (t) arrayList.get(i17);
                                    while (true) {
                                        i10 = tVar.f2555b;
                                        if (i18 < i10) {
                                            if (iArr2[i18] == 0 && dVar.b(i16, i18)) {
                                                int i19 = dVar.a(i16, i18) ? 8 : 4;
                                                iArr[i16] = (i18 << 4) | i19;
                                                iArr2[i18] = i19 | (i16 << 4);
                                            } else {
                                                i18++;
                                            }
                                        }
                                    }
                                }
                                i18 = tVar.f2556c + i10;
                                i17++;
                            }
                        }
                        i16++;
                    }
                }
                i16 = tVar4.f2556c + i5;
            }
        }
    }
}
