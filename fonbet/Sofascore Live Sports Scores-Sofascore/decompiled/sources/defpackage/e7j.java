package defpackage;

import android.util.Base64;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import com.moloco.sdk.internal.bidtoken.a;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.y;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e7j extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7j(int i, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = i;
        this.s = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        String str = this.s;
        switch (i) {
            case 0:
                return new e7j(0, str, rq3Var);
            default:
                return new e7j(1, str, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((e7j) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        String str;
        BufferedReader bufferedReader;
        List split$default;
        int i = this.r;
        String str2 = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                try {
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str2).openConnection());
                    uRLConnection.getClass();
                    httpURLConnection = (HttpURLConnection) uRLConnection;
                    try {
                        httpURLConnection.setRequestMethod(C4094gc.a);
                        httpURLConnection.setRequestProperty("Nimbus-Sdkv", "2.37.0");
                        httpURLConnection.setConnectTimeout(5000);
                        httpURLConnection.setReadTimeout(5000);
                        int responseCode = httpURLConnection.getResponseCode();
                        if (200 > responseCode || responseCode >= 300) {
                            InputStream errorStream = httpURLConnection.getErrorStream();
                            if (errorStream != null) {
                                bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
                                try {
                                    str = d7a.E(bufferedReader);
                                    bufferedReader.close();
                                } finally {
                                }
                            } else {
                                str = "";
                            }
                            String obj2 = StringsKt.l0("HTTP " + responseCode + ": " + httpURLConnection.getResponseMessage() + ". " + str).toString();
                            obj2.getClass();
                            throw new jz2(obj2);
                        }
                        InputStream inputStream = httpURLConnection.getInputStream();
                        inputStream.getClass();
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                        try {
                            String E = d7a.E(bufferedReader);
                            bufferedReader.close();
                            httpURLConnection.disconnect();
                            return E;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    th = th2;
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = null;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                try {
                    split$default = StringsKt__StringsKt.split$default((String) StringsKt.Y(str2, new char[]{':'}).get(1), new String[]{"."}, false, 0, 6, null);
                    byte[] decode = Base64.decode((String) split$default.get(1), 0);
                    decode.getClass();
                    return new k0(new a(new JSONObject(c.k(decode)).getLong("exp")));
                } catch (Exception e) {
                    return new j0(new y(e.toString(), -1));
                }
        }
    }
}
