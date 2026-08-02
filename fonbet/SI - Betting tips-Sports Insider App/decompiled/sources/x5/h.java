package x5;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.e0;
import androidx.lifecycle.y;
import c4.k;
import c4.l;
import c4.p;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.sports.insider.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.android.core.w0;
import j$.util.DesugarCollections;
import j1.n;
import j1.u;
import j1.v;
import j1.x;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.n0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements b3.a, n {

    /* renamed from: c, reason: collision with root package name */
    public static h f25408c;

    /* renamed from: a, reason: collision with root package name */
    public Object f25409a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25410b;

    public /* synthetic */ h(Object obj, Object obj2) {
        this.f25409a = obj2;
        this.f25410b = obj;
    }

    public static y d(q4.h hVar) {
        s4.b bVar = hVar.f21978c;
        Object context = bVar instanceof s4.a ? ((s4.a) bVar).f22622b.getContext() : hVar.f21976a;
        while (!(context instanceof e0)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((e0) context).getLifecycle();
    }

    public static boolean i(q4.h hVar, Bitmap.Config config) {
        if (!s6.a.o(config)) {
            return true;
        }
        if (!((Boolean) p.e(hVar, q4.j.f22004f)).booleanValue()) {
            return false;
        }
        s4.b bVar = hVar.f21978c;
        if (!(bVar instanceof s4.a)) {
            return true;
        }
        ImageView imageView = ((s4.a) bVar).f22622b;
        return !imageView.isAttachedToWindow() || imageView.isHardwareAccelerated();
    }

    public static synchronized h o(Context context) {
        h q;
        synchronized (h.class) {
            q = q(context.getApplicationContext());
        }
        return q;
    }

    public static synchronized h q(Context context) {
        synchronized (h.class) {
            h hVar = f25408c;
            if (hVar != null) {
                return hVar;
            }
            h hVar2 = new h(context, 0);
            f25408c = hVar2;
            return hVar2;
        }
    }

    @Override // j1.n
    public boolean a(CharSequence charSequence, int i5, int i10, u uVar) {
        if ((uVar.f18239c & 4) > 0) {
            return true;
        }
        if (((x) this.f25409a) == null) {
            this.f25409a = new x(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((io.sentry.hints.j) this.f25410b).getClass();
        ((x) this.f25409a).setSpan(new v(uVar), i5, i10, 33);
        return true;
    }

    @Override // j1.n
    public Object b() {
        return (x) this.f25409a;
    }

    public boolean c() {
        synchronized (this) {
            if (((AtomicBoolean) this.f25410b).get()) {
                return false;
            }
            ((AtomicInteger) this.f25409a).incrementAndGet();
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory e(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f25410b) == null) {
            Context context = (Context) this.f25409a;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                w0.m("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                w0.m("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    w0.m("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        w0.m("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(StringUtils.COMMA, -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.f25410b = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f25410b = map;
        }
        String str4 = (String) ((Map) this.f25410b).get(str);
        if (str4 != null) {
            try {
                return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e7) {
                w0.n("BackendRegistry", "Class " + str4 + " is not found.", e7);
            } catch (IllegalAccessException e9) {
                w0.n("BackendRegistry", "Could not instantiate " + str4 + ".", e9);
            } catch (InstantiationException e10) {
                w0.n("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            } catch (NoSuchMethodException e11) {
                w0.n("BackendRegistry", "Could not instantiate ".concat(str4), e11);
            } catch (InvocationTargetException e12) {
                w0.n("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            }
        }
        return null;
    }

    public File f() {
        if (((File) this.f25409a) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f25409a) == null) {
                        h8.g gVar = (h8.g) this.f25410b;
                        gVar.a();
                        this.f25409a = new File(gVar.f10401a.getFilesDir(), "PersistedInstallation." + ((h8.g) this.f25410b).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f25409a;
    }

    public String g(String str) {
        String str2 = (String) this.f25410b;
        Resources resources = (Resources) this.f25409a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // b3.a
    public View getRoot() {
        return (FrameLayout) this.f25409a;
    }

    public void h(c9.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f3707a);
            jSONObject.put("Status", v.f.d(bVar.f3708b));
            jSONObject.put("AuthToken", bVar.f3709c);
            jSONObject.put("RefreshToken", bVar.f3710d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f3712f);
            jSONObject.put("ExpiresInSecs", bVar.f3711e);
            jSONObject.put("FisError", bVar.f3713g);
            h8.g gVar = (h8.g) this.f25410b;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f10401a.getFilesDir());
            FileOutputStream i5 = a.a.i(new FileOutputStream(createTempFile), createTempFile);
            i5.write(jSONObject.toString().getBytes("UTF-8"));
            i5.close();
            if (createTempFile.renameTo(f())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 q4.n, still in use, count: 3, list:
          (r1v0 q4.n) from 0x0086: MOVE (r18v0 q4.n) = (r1v0 q4.n) (LINE:135)
          (r1v0 q4.n) from 0x007b: MOVE (r18v3 q4.n) = (r1v0 q4.n) (LINE:124)
          (r1v0 q4.n) from 0x006c: MOVE (r18v5 q4.n) = (r1v0 q4.n) (LINE:109)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public q4.n j(q4.h r20, r4.i r21) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.h.j(q4.h, r4.i):q4.n");
    }

    public c9.b k() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            File f6 = f();
            FileInputStream m6 = y4.a.m(new FileInputStream(f6), f6);
            while (true) {
                try {
                    int read = m6.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            m6.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i5 = c9.b.f3706h;
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        int i10 = v.f.e(5)[optInt];
        if (i10 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b11 = (byte) (((byte) (b10 | 2)) | 1);
        if (b11 == 3 && i10 != 0) {
            return new c9.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 == 0) {
            sb2.append(" registrationStatus");
        }
        if ((b11 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b11 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
    }

    public void l() {
        synchronized (this) {
            ((AtomicInteger) this.f25409a).decrementAndGet();
            if (((AtomicInteger) this.f25409a).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            Unit unit = Unit.f19194a;
        }
    }

    public q4.n m(q4.n nVar) {
        l lVar;
        boolean z5;
        l lVar2 = nVar.j;
        k kVar = q4.j.f22000b;
        if (!s6.a.o((Bitmap.Config) p.f(nVar, kVar)) || ((v4.f) this.f25410b).b()) {
            lVar = lVar2;
            z5 = false;
        } else {
            lVar2.getClass();
            LinkedHashMap j = n0.j(lVar2.f3595a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                j.put(kVar, config);
            } else {
                j.remove(kVar);
            }
            l lVar3 = new l(ci.c.b0(j));
            z5 = true;
            lVar = lVar3;
        }
        return z5 ? new q4.n(nVar.f22007a, nVar.f22008b, nVar.f22009c, nVar.f22010d, nVar.f22011e, nVar.f22012f, nVar.f22013g, nVar.f22014h, nVar.f22015i, lVar) : nVar;
    }

    public void n(boolean z5, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = (Map) this.f25409a;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = (Map) this.f25410b;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z5 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).s0(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z5 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((w7.g) entry2.getKey()).c(new d6.e(status));
            }
        }
    }

    public synchronized void p() {
        a aVar = (a) this.f25409a;
        ReentrantLock reentrantLock = aVar.f25390a;
        reentrantLock.lock();
        try {
            aVar.f25391b.edit().clear().apply();
            reentrantLock.unlock();
            this.f25410b = null;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, boolean z5) {
        this.f25409a = obj;
        this.f25410b = obj2;
    }

    public h(Context context, int i5) {
        String e7;
        switch (i5) {
            case 6:
                this.f25410b = null;
                this.f25409a = context;
                break;
            case 7:
                g6.v.h(context);
                Resources resources = context.getResources();
                this.f25409a = resources;
                this.f25410b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                a a7 = a.a(context);
                this.f25409a = a7;
                this.f25410b = a7.b();
                String e9 = a7.e("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(e9) && (e7 = a7.e(a.f("googleSignInOptions", e9))) != null) {
                    try {
                        GoogleSignInOptions.c(e7);
                        break;
                    } catch (JSONException unused) {
                        return;
                    }
                }
                break;
        }
    }

    public h(int i5) {
        switch (i5) {
            case 4:
                this.f25409a = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.f25410b = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.f25409a = Choreographer.getInstance();
                this.f25410b = Looper.myLooper();
                break;
        }
    }
}
