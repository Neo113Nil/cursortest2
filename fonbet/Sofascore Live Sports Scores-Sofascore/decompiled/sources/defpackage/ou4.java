package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.U3;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ou4 implements qh2 {
    public long a;
    public final Object b;
    public Object c;

    public ou4(int i) {
        switch (i) {
            case 1:
                this.b = new Handler(Looper.getMainLooper());
                break;
            default:
                wmk wmkVar = wmk.a;
                this.b = new xmk();
                this.c = new xmk();
                break;
        }
    }

    public static ou4 d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new ou4(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ou4(jSONObject.getString("token"), jSONObject.getString(U3.j.W), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }

    public void a(long j, long j2) {
        ((xmk) this.b).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((xmk) this.c).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public void b() {
        ((Handler) this.b).removeCallbacksAndMessages(null);
    }

    public void c(boolean z, Function0 function0) {
        if (((a8p) this.c) == null) {
            a8p a8pVar = new a8p(12, this, function0);
            this.c = a8pVar;
            if (z) {
                ((Handler) this.b).post(a8pVar);
            }
        }
    }

    public void e(nec necVar, nr9 nr9Var, Map map, long j) {
        c78 c78Var = (c78) this.c;
        long j2 = c78Var.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c78Var.d;
        if (j > j2) {
            Object remove = linkedHashMap.remove(necVar);
            if (remove != null) {
                c78Var.c = c78Var.h() - c78Var.k(necVar, remove);
                c78Var.f(necVar, remove, null);
            }
            ((spf) this.b).e(necVar, nr9Var, map, j);
            return;
        }
        mpf mpfVar = new mpf(nr9Var, map, j);
        Object put = linkedHashMap.put(necVar, mpfVar);
        c78Var.c = c78Var.k(necVar, mpfVar) + c78Var.h();
        if (put != null) {
            c78Var.c = c78Var.h() - c78Var.k(necVar, put);
            c78Var.f(necVar, put, mpfVar);
        }
        c78Var.n(c78Var.b);
    }

    public void f() {
        a8p a8pVar = (a8p) this.c;
        if (a8pVar != null) {
            ((Handler) this.b).post(a8pVar);
        }
    }

    @Override // defpackage.qh2
    public void onFailure(ah2 ah2Var, IOException iOException) {
        ujg ujgVar = (ujg) this.c;
        if (this.a <= 0 || ((iOException instanceof UnknownServiceException) && iOException.getMessage() != null && iOException.getMessage().toLowerCase().startsWith("cleartext"))) {
            fjg c = fjg.c();
            ujg ujgVar2 = ujg.f;
            c.f(1);
        } else {
            fjg c2 = fjg.c();
            ujg ujgVar3 = ujg.f;
            c2.f(1);
            tjg tjgVar = (tjg) this.b;
            synchronized (ujgVar) {
                ((ArrayList) ujgVar.e).add(tjgVar);
            }
        }
    }

    @Override // defpackage.qh2
    public void onResponse(ah2 ah2Var, d2g d2gVar) {
        if (d2gVar.q) {
            fjg c = fjg.c();
            ujg ujgVar = ujg.f;
            c.f(1);
        } else if (d2gVar.d == 404) {
            fjg c2 = fjg.c();
            ujg ujgVar2 = ujg.f;
            c2.f(1);
        } else {
            onFailure(ah2Var, new IOException());
        }
        try {
            d2gVar.close();
        } catch (Exception unused) {
        }
    }

    public ou4(long j, spf spfVar) {
        this.a = j;
        this.b = spfVar;
        this.c = new c78(this, j);
    }

    public ou4(String str, String str2, long j) {
        this.b = str;
        this.c = str2;
        this.a = j;
    }

    public ou4(ujg ujgVar, long j, String str, tjg tjgVar) {
        this.c = ujgVar;
        this.a = j;
        this.b = tjgVar;
    }
}
