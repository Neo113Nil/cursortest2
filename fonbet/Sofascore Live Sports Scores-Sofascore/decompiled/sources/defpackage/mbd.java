package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import com.facebook.internal.d;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzce;
import com.google.android.gms.internal.cast.zzj;
import com.google.android.gms.internal.cast.zzl;
import com.google.android.gms.internal.cast.zzm;
import com.google.android.gms.internal.cast.zzn;
import com.google.android.gms.internal.cast.zzw;
import com.google.android.gms.internal.cast.zzx;
import com.google.android.gms.internal.cast.zzy;
import com.google.android.gms.internal.measurement.zzafc;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mbd implements OnSuccessListener, cj0 {
    public static mbd f;
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public mbd(Bitmap bitmap) {
        this.a = 3;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.b = 16;
        ArrayList arrayList2 = new ArrayList();
        this.e = arrayList2;
        if (bitmap.isRecycled()) {
            a70.p("Bitmap is not valid");
            throw null;
        }
        arrayList2.add(g7h.g);
        this.c = bitmap;
        arrayList.add(uti.d);
        arrayList.add(uti.e);
        arrayList.add(uti.f);
        arrayList.add(uti.g);
        arrayList.add(uti.h);
        arrayList.add(uti.i);
    }

    public static synchronized mbd b(Context context) {
        mbd mbdVar;
        synchronized (mbd.class) {
            mbdVar = f;
            if (mbdVar == null) {
                mbdVar = new mbd(context);
                f = mbdVar;
            }
        }
        return mbdVar;
    }

    public g7h a() {
        ArrayList arrayList;
        g7h g7hVar;
        ArrayList arrayList2 = (ArrayList) this.e;
        Bitmap bitmap = (Bitmap) this.c;
        int height = bitmap.getHeight() * bitmap.getWidth();
        double sqrt = height > 12544 ? Math.sqrt(12544.0d / height) : -1.0d;
        int i = 0;
        Bitmap createScaledBitmap = sqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * sqrt), (int) Math.ceil(bitmap.getHeight() * sqrt), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        p03 p03Var = new p03(iArr, this.b, arrayList2.isEmpty() ? null : (h7e[]) arrayList2.toArray(new h7e[arrayList2.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList3 = (ArrayList) p03Var.d;
        ArrayList arrayList4 = (ArrayList) this.d;
        g7h g7hVar2 = new g7h(arrayList3, arrayList4);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) g7hVar2.d;
        int size = arrayList4.size();
        int i2 = 0;
        while (i2 < size) {
            uti utiVar = (uti) arrayList4.get(i2);
            float[] fArr = utiVar.c;
            float[] fArr2 = utiVar.a;
            int length = fArr.length;
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f3 = 0.0f;
            for (int i3 = i; i3 < length; i3++) {
                float f4 = fArr[i3];
                if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f3 += f4;
                }
            }
            if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int length2 = fArr.length;
                for (int i4 = i; i4 < length2; i4++) {
                    float f5 = fArr[i4];
                    if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        fArr[i4] = f5 / f3;
                    }
                }
            }
            dh0 dh0Var = (dh0) g7hVar2.c;
            List list = (List) g7hVar2.b;
            int size2 = list.size();
            int i5 = i;
            float f6 = 0.0f;
            i7e i7eVar = null;
            while (i5 < size2) {
                i7e i7eVar2 = (i7e) list.get(i5);
                float[] b = i7eVar2.b();
                float f7 = b[1];
                float f8 = f2;
                float[] fArr3 = utiVar.b;
                if (f7 >= fArr2[i5] && f7 <= fArr2[2]) {
                    float f9 = b[2];
                    if (f9 >= fArr3[i5] && f9 <= fArr3[2] && !sparseBooleanArray.get(i7eVar2.d)) {
                        float[] b2 = i7eVar2.b();
                        arrayList = arrayList4;
                        i7e i7eVar3 = (i7e) g7hVar2.e;
                        int i6 = i7eVar3 != null ? i7eVar3.e : 1;
                        g7hVar = g7hVar2;
                        float[] fArr4 = utiVar.c;
                        float f10 = fArr4[i5];
                        float abs = f10 > f8 ? (1.0f - Math.abs(b2[1] - fArr2[1])) * f10 : f8;
                        float f11 = fArr4[1];
                        float abs2 = f11 > f8 ? (1.0f - Math.abs(b2[2] - fArr3[1])) * f11 : f8;
                        float f12 = fArr4[2];
                        float f13 = abs + abs2 + (f12 > f8 ? (i7eVar2.e / i6) * f12 : f8);
                        if (i7eVar == null || f13 > f6) {
                            i7eVar = i7eVar2;
                            f6 = f13;
                        }
                        i5++;
                        f2 = f8;
                        arrayList4 = arrayList;
                        g7hVar2 = g7hVar;
                    }
                }
                arrayList = arrayList4;
                g7hVar = g7hVar2;
                i5++;
                f2 = f8;
                arrayList4 = arrayList;
                g7hVar2 = g7hVar;
            }
            ArrayList arrayList5 = arrayList4;
            g7h g7hVar3 = g7hVar2;
            if (i7eVar != null) {
                sparseBooleanArray.append(i7eVar.d, true);
            }
            dh0Var.put(utiVar, i7eVar);
            i2++;
            i = i5;
            arrayList4 = arrayList5;
            g7hVar2 = g7hVar3;
        }
        g7h g7hVar4 = g7hVar2;
        sparseBooleanArray.clear();
        return g7hVar4;
    }

    public int c() {
        int i;
        synchronized (this.e) {
            i = this.b;
        }
        return i;
    }

    @Override // defpackage.cj0
    public ddb call() {
        zzafc zzafcVar = (zzafc) this.d;
        int i = this.b;
        ArrayList arrayList = (ArrayList) this.e;
        ru9 a0 = hkg.a0(zzafcVar);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) hkg.P((Future) arrayList.get(i2))).booleanValue()) {
                throw null;
            }
        }
        return a0;
    }

    public String d() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.d)[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean c = Intrinsics.c(serialDescriptor.getKind(), nii.g);
                int[] iArr = (int[]) this.e;
                if (!c) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.e(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append(U3.j.d);
                    sb.append(((int[]) this.e)[i2]);
                    sb.append(U3.j.e);
                }
            } else if (obj == zic.d) {
                sb.append("[<debug info disabled>]");
            } else if (obj != uxf.t) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public void e() {
        int i = this.b * 2;
        this.d = Arrays.copyOf((Object[]) this.d, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        mh0.j(0, 0, (int[]) this.e, iArr, 14);
        this.e = iArr;
    }

    public void f(int i) {
        synchronized (this.e) {
            try {
                if (this.b == i) {
                    return;
                }
                this.b = i;
                Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    qn4 qn4Var = (qn4) weakReference.get();
                    if (qn4Var != null) {
                        qn4Var.a(i);
                    } else {
                        ((CopyOnWriteArrayList) this.d).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSuccess(Object obj) {
        zzj zzjVar = (zzj) this.c;
        String str = (String) this.d;
        int i = this.b;
        SharedPreferences sharedPreferences = (SharedPreferences) this.e;
        Bundle bundle = (Bundle) obj;
        SessionManager sessionManager = zzjVar.b;
        Preconditions.i(sessionManager);
        zzce zzceVar = zzjVar.c;
        if (i != 3) {
            if (i == 2) {
                i = 2;
            }
            if (i != 1 || i == 2) {
                zzn zznVar = new zzn(sharedPreferences, zzjVar, zzjVar.d, bundle, str);
                sessionManager.a(new zzl(zznVar));
                if (zzceVar == null) {
                    zzm zzmVar = new zzm(zznVar);
                    zzce.i.a("register callback = %s", zzmVar);
                    Preconditions.e("Must be called from the main thread.");
                    zzceVar.b.add(zzmVar);
                    return;
                }
                return;
            }
            return;
        }
        zzy zzyVar = new zzy(zzjVar, zzjVar.d, str);
        sessionManager.a(new zzw(zzyVar));
        if (zzceVar != null) {
            zzx zzxVar = new zzx(zzyVar);
            zzce.i.a("register callback = %s", zzxVar);
            Preconditions.e("Must be called from the main thread.");
            zzceVar.b.add(zzxVar);
        }
        if (i != 1) {
        }
        zzn zznVar2 = new zzn(sharedPreferences, zzjVar, zzjVar.d, bundle, str);
        sessionManager.a(new zzl(zznVar2));
        if (zzceVar == null) {
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return d();
            default:
                return super.toString();
        }
    }

    public mbd(r50 r50Var, r50 r50Var2, r50 r50Var3, int i) {
        this.a = 1;
        this.c = r50Var;
        this.d = r50Var2;
        this.e = r50Var3;
        this.b = i;
    }

    public mbd(gfa gfaVar) {
        this.a = 2;
        this.c = gfaVar;
        this.d = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.e = iArr;
        this.b = -1;
    }

    public mbd(Context context) {
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.b = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        lik.C(context, new d(this, 5), intentFilter);
    }

    public mbd(int i, a62 a62Var, z88 z88Var, CoroutineContext coroutineContext) {
        this.a = 4;
        this.c = z88Var;
        this.b = i;
        this.d = a62Var;
        this.e = coroutineContext;
    }

    public /* synthetic */ mbd(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }
}
