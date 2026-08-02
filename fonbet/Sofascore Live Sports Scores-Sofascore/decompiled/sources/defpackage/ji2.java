package defpackage;

import android.content.res.AssetFileDescriptor;
import androidx.work.impl.WorkDatabase;
import com.appsflyer.sdk_base.util.ContentProviderFetcher;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.session.b;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ji2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ji2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FileInputStream fileInputStream;
        Object lambda$new$0;
        int i = this.a;
        boolean z = true;
        int i2 = 0;
        FileInputStream fileInputStream2 = null;
        fi3 fi3Var = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((li2) obj).d;
            case 1:
                ri3 ri3Var = (ri3) obj;
                synchronized (ri3Var) {
                    try {
                        fileInputStream = ri3Var.a.openFileInput(ri3Var.b);
                    } catch (FileNotFoundException | JSONException unused) {
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        int available = fileInputStream.available();
                        byte[] bArr = new byte[available];
                        fileInputStream.read(bArr, 0, available);
                        fi3Var = fi3.a(new JSONObject(new String(bArr, C.UTF8_NAME)));
                        fileInputStream.close();
                    } catch (FileNotFoundException | JSONException unused2) {
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return fi3Var;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        throw th;
                    }
                }
                return fi3Var;
            case 2:
                lambda$new$0 = ((ContentProviderFetcher) obj).lambda$new$0();
                return lambda$new$0;
            case 3:
                jw3 jw3Var = ((nw3) obj).g;
                jw3Var.getClass();
                hcc.K();
                z41 z41Var = jw3Var.c;
                r18 r18Var = (r18) z41Var.c;
                String str = (String) z41Var.b;
                if (new File((File) r18Var.c, str).exists()) {
                    new File((File) ((r18) z41Var.c).c, str).delete();
                } else if (jw3Var.d() == null || !jw3Var.j.c()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                ((TaskCompletionSource) obj).setResult(null);
                return null;
            case 5:
                WorkDatabase workDatabase = (WorkDatabase) ((dad) obj).b;
                Long a = workDatabase.c().a("next_job_scheduler_id");
                int longValue = a != null ? (int) a.longValue() : 0;
                int i3 = longValue == Integer.MAX_VALUE ? 0 : longValue + 1;
                o4f c = workDatabase.c();
                int i4 = 25;
                gz8.S(c.a, false, true, new ord(i4, c, new n4f("next_job_scheduler_id", Long.valueOf(i3))));
                if (longValue < 0 || longValue > Integer.MAX_VALUE) {
                    o4f c2 = workDatabase.c();
                    gz8.S(c2.a, false, true, new ord(i4, c2, new n4f("next_job_scheduler_id", 1L)));
                } else {
                    i2 = longValue;
                }
                return Integer.valueOf(i2);
            case 6:
                return new nda((JsReplyProxyBoundaryInterface) obj);
            case 7:
                return ulb.e(f6a.I((ByteArrayInputStream) obj), null);
            case 8:
                return ((lxf) obj).b("firebase");
            case 9:
                ng2 ng2Var = (ng2) ((y3g) obj).c;
                ih2 ih2Var = (ih2) ng2Var.e;
                nah nahVar = (nah) ng2Var.b;
                hcc.L();
                try {
                    HashMap d = ih2.d(nahVar);
                    String str2 = ih2Var.b;
                    sx2 sx2Var = new sx2();
                    sx2Var.a = str2;
                    sx2Var.b = d;
                    sx2Var.c = new HashMap();
                    sx2Var.F(Command.HTTP_HEADER_USER_AGENT, "Crashlytics Android SDK/20.1.0");
                    sx2Var.F("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    ih2.c(sx2Var, nahVar);
                    d.toString();
                    yz1 r = sx2Var.r();
                    int i5 = r.b;
                    if (i5 == 200 || i5 == 201 || i5 == 202 || i5 == 203) {
                        return new JSONObject((String) r.c);
                    }
                    return null;
                } catch (IOException | Exception unused3) {
                    return null;
                }
            case 10:
                return (AssetFileDescriptor) obj;
            default:
                return b.a((b) obj);
        }
    }
}
