package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wr9 extends AsyncTask {
    public final ny9 a;
    public final dy9 b = new dy9();

    public wr9(ny9 ny9Var) {
        this.a = ny9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[Catch: TimeoutException -> 0x004c, ExecutionException -> 0x004e, InterruptedException -> 0x0050, TryCatch #4 {InterruptedException -> 0x0050, ExecutionException -> 0x004e, TimeoutException -> 0x004c, blocks: (B:3:0x0012, B:5:0x001a, B:9:0x0030, B:11:0x0038, B:14:0x0078, B:18:0x0040, B:21:0x0048, B:22:0x0052, B:23:0x0022, B:26:0x002a), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: TimeoutException -> 0x004c, ExecutionException -> 0x004e, InterruptedException -> 0x0050, TRY_LEAVE, TryCatch #4 {InterruptedException -> 0x0050, ExecutionException -> 0x004e, TimeoutException -> 0x004c, blocks: (B:3:0x0012, B:5:0x001a, B:9:0x0030, B:11:0x0038, B:14:0x0078, B:18:0x0040, B:21:0x0048, B:22:0x0052, B:23:0x0022, B:26:0x002a), top: B:2:0x0012 }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        Drawable drawable;
        Drawable drawable2;
        dy9 dy9Var = this.b;
        Map map = (Map) dy9Var.c;
        HashMap hashMap = (HashMap) objArr[0];
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        try {
            String valueOf = String.valueOf(hashMap.get("icon_key"));
            try {
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            if (map.containsKey(valueOf)) {
                drawable = (Drawable) map.get(valueOf);
                if (drawable == null) {
                    String valueOf2 = String.valueOf(hashMap.get("icon_key"));
                    try {
                        if (map.containsKey(valueOf2)) {
                            drawable2 = (Drawable) map.get(valueOf2);
                        }
                    } catch (NullPointerException e2) {
                        e2.printStackTrace();
                    }
                    drawable2 = null;
                } else {
                    Drawable drawable3 = (Drawable) newCachedThreadPool.submit(new v35((URL) hashMap.get("icon_key"), 2)).get(10L, TimeUnit.SECONDS);
                    dy9Var.g(drawable3, String.valueOf(hashMap.get("icon_key")));
                    drawable2 = drawable3;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("icon_key", drawable2);
                return hashMap2;
            }
            drawable = null;
            if (drawable == null) {
            }
            HashMap hashMap22 = new HashMap();
            hashMap22.put("icon_key", drawable2);
            return hashMap22;
        } catch (InterruptedException e3) {
            e = e3;
            e.printStackTrace();
            return null;
        } catch (ExecutionException e4) {
            e = e4;
            e.printStackTrace();
            return null;
        } catch (TimeoutException e5) {
            e = e5;
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        HashMap hashMap = (HashMap) obj;
        super.onPostExecute(hashMap);
        ny9 ny9Var = this.a;
        oy9 oy9Var = ny9Var.b;
        if (hashMap == null) {
            AdError u = yso.u(109, "InMobi SDK failed to download native ad image assets.");
            u.toString();
            oy9Var.u.onFailure(u);
            return;
        }
        Drawable drawable = (Drawable) hashMap.get("icon_key");
        oy9Var.setIcon(new gy9(drawable, ny9Var.a));
        MediationAdLoadCallback mediationAdLoadCallback = oy9Var.u;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new gy9(new ColorDrawable(0), null));
        oy9Var.setImages(arrayList);
        if (drawable != null && mediationAdLoadCallback != null) {
            oy9Var.v.d = (MediationNativeAdCallback) mediationAdLoadCallback.onSuccess(oy9Var);
        } else {
            AdError u2 = yso.u(109, "InMobi SDK failed to download native ad image assets.");
            u2.toString();
            mediationAdLoadCallback.onFailure(u2);
        }
    }
}
