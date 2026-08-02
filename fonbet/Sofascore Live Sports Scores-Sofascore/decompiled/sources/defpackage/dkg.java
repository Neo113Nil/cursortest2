package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.ironsource.C4094gc;
import com.ironsource.C4427z5;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import kotlin.text.Regex;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class dkg {
    public static final /* synthetic */ int j = 0;
    public final ArrayList a;
    public final jod b;
    public final SimpleDateFormat c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public bkg i;

    public dkg(String str) {
        jod W = hkg.W();
        this.a = new ArrayList();
        this.b = W;
        this.d = str;
        this.e = 10000;
        this.f = 1000;
        this.g = 100;
        this.h = 100;
        this.i = bkg.NONE;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        this.c = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public final ckg a(String str, bkg bkgVar, String str2, String str3, List list) {
        if (bkgVar.a < this.i.a) {
            return null;
        }
        int ordinal = bkgVar.ordinal();
        int i = 0;
        int i2 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? 0 : this.h : this.g : this.f : this.e;
        if (i2 == 0 || new Random().nextInt(Integer.MAX_VALUE) % i2 != 0) {
            return null;
        }
        String format = this.c.format(new Date());
        int ordinal2 = bkgVar.ordinal();
        if (ordinal2 == 0) {
            i = this.e;
        } else if (ordinal2 == 1) {
            i = this.f;
        } else if (ordinal2 == 2) {
            i = this.g;
        } else if (ordinal2 == 3) {
            i = this.h;
        }
        ckg ckgVar = new ckg();
        ckgVar.a = format;
        ckgVar.b = str;
        ckgVar.c = bkgVar;
        ckgVar.d = i;
        ckgVar.e = str2;
        ckgVar.f = list;
        try {
            ckgVar.g = new URL(str3);
        } catch (MalformedURLException unused) {
        }
        return ckgVar;
    }

    public final void b(ckg ckgVar, List list) {
        synchronized (this.a) {
            try {
                JSONObject t = sha.t(ckgVar, list);
                if (t != null) {
                    this.a.add(t);
                    d();
                } else {
                    fjg.c().f(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final qzf c(ArrayList arrayList) {
        zdc zdcVar;
        pzf pzfVar = new pzf();
        pzfVar.f(this.d);
        pzfVar.a("Content-Type", C4427z5.M);
        pzfVar.a("Accept", C4427z5.M);
        Regex regex = zdc.e;
        try {
            zdcVar = bea.v("application/json; charset=utf-8");
        } catch (IllegalArgumentException unused) {
            zdcVar = null;
        }
        pzfVar.e(C4094gc.b, yzf.create(zdcVar, arrayList.toString()));
        return new qzf(pzfVar);
    }

    public final void d() {
        synchronized (this.a) {
            try {
                if (this.a.size() <= 0) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.a);
                this.a.clear();
                qzf c = c(arrayList);
                jod jodVar = this.b;
                jodVar.getClass();
                FirebasePerfOkHttpClient.enqueue(new pof(jodVar, c), new y3g(this, arrayList, false, 6));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
