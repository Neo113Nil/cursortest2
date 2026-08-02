package h9;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.v0;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.t2;
import androidx.core.view.d0;
import androidx.core.view.f0;
import androidx.core.view.j;
import androidx.core.widget.NestedScrollView;
import b2.e;
import b7.d;
import c1.i;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import e6.k;
import f7.l;
import f7.q;
import io.appmetrica.analytics.impl.C0122e9;
import io.sentry.android.core.w0;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kh.r;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import w7.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class c implements k, t2, j, y7.c, c1.c, w7.a, g5.b, i {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f10428c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10429a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10430b;

    public /* synthetic */ c(int i5, Object obj) {
        this.f10429a = i5;
        this.f10430b = obj;
    }

    public static String A(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean x(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    @Override // y7.c
    public Object a() {
        return ((e) this.f10430b).f2968a;
    }

    @Override // e6.k
    public void accept(Object obj, Object obj2) {
        switch (this.f10429a) {
            case 1:
                ClearRestoreCredentialRequest request = (ClearRestoreCredentialRequest) this.f10430b;
                Intrinsics.checkNotNullParameter(request, "$request");
                a6.e eVar = new a6.e(0, (g) obj2);
                a6.a aVar = (a6.a) ((a6.c) ((a6.g) obj).m());
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
                int i5 = g7.b.f9884a;
                obtain.writeInt(1);
                request.writeToParcel(obtain, 0);
                obtain.writeStrongBinder(eVar);
                aVar.a(obtain, 4);
                return;
            case 2:
                CreateRestoreCredentialRequest request2 = (CreateRestoreCredentialRequest) this.f10430b;
                Intrinsics.checkNotNullParameter(request2, "$request");
                a6.e eVar2 = new a6.e(1, (g) obj2);
                a6.a aVar2 = (a6.a) ((a6.c) ((a6.g) obj).m());
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
                int i10 = g7.b.f9884a;
                if (request2 == null) {
                    obtain2.writeInt(0);
                } else {
                    obtain2.writeInt(1);
                    request2.writeToParcel(obtain2, 0);
                }
                obtain2.writeStrongBinder(eVar2);
                aVar2.a(obtain2, 3);
                return;
            case 3:
                GetRestoreCredentialRequest request3 = (GetRestoreCredentialRequest) this.f10430b;
                Intrinsics.checkNotNullParameter(request3, "$request");
                a6.e eVar3 = new a6.e(2, (g) obj2);
                a6.a aVar3 = (a6.a) ((a6.c) ((a6.g) obj).m());
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
                int i11 = g7.b.f9884a;
                if (request3 == null) {
                    obtain3.writeInt(0);
                } else {
                    obtain3.writeInt(1);
                    request3.writeToParcel(obtain3, 0);
                }
                obtain3.writeStrongBinder(eVar3);
                aVar3.a(obtain3, 2);
                return;
            case 13:
                GetCredentialRequest request4 = (GetCredentialRequest) this.f10430b;
                Intrinsics.checkNotNullParameter(request4, "$request");
                b7.e eVar4 = new b7.e((g) obj2);
                b7.a aVar4 = (b7.a) ((b7.c) ((d) obj).m());
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = l7.a.f19391a;
                obtain4.writeStrongBinder(eVar4);
                if (request4 == null) {
                    obtain4.writeInt(0);
                } else {
                    obtain4.writeInt(1);
                    request4.writeToParcel(obtain4, 0);
                }
                Parcel obtain5 = Parcel.obtain();
                try {
                    aVar4.f3085a.transact(1, obtain4, obtain5, 0);
                    obtain5.readException();
                    return;
                } finally {
                    obtain4.recycle();
                    obtain5.recycle();
                }
            default:
                f7.b bVar = (f7.b) this.f10430b;
                f7.c cVar = new f7.c(bVar, (g) obj2);
                q qVar = (q) ((f7.d) obj).m();
                ApiMetadata a7 = f7.e.a();
                String str = bVar.f9475l;
                Parcel a10 = qVar.a();
                int i13 = l.f9493a;
                a10.writeStrongBinder(cVar);
                a10.writeString(str);
                l.b(a10, a7);
                qVar.e(a10, 2);
                return;
        }
    }

    @Override // c1.c
    public Object b(c1.b bVar) {
        return ((q8.a) this.f10430b).invoke(bVar);
    }

    @Override // androidx.appcompat.widget.t2
    public void c(n nVar, p pVar) {
        h hVar = (h) this.f10430b;
        Handler handler = hVar.f481f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = hVar.f483h;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (nVar == ((androidx.appcompat.view.menu.g) arrayList.get(i5)).f475b) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 == -1) {
            return;
        }
        int i10 = i5 + 1;
        handler.postAtTime(new f(0, this, i10 < arrayList.size() ? (androidx.appcompat.view.menu.g) arrayList.get(i10) : null, pVar, nVar), nVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // androidx.core.view.j
    public boolean d(float f6) {
        if (f6 == 0.0f) {
            return false;
        }
        i();
        ((NestedScrollView) this.f10430b).e((int) f6);
        return true;
    }

    @Override // androidx.core.view.j
    public float e() {
        return -((NestedScrollView) this.f10430b).getVerticalScrollFactorCompat();
    }

    @Override // w7.a
    public Object f(Task task) {
        d7.e eVar = (d7.e) this.f10430b;
        if (task.isSuccessful() || task.j()) {
            return task;
        }
        Exception exception = task.getException();
        if (!(exception instanceof d6.e)) {
            return task;
        }
        int i5 = ((d6.e) exception).f8245a.f4466a;
        if (i5 != 43001 && i5 != 43002 && i5 != 43003 && i5 != 17) {
            return i5 == 43000 ? d5.p(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : i5 != 15 ? task : d5.p(new Exception("The operation to get app set ID timed out. Please try again later."));
        }
        d7.e eVar2 = (d7.e) eVar.f8269c;
        eVar2.getClass();
        g gVar = new g();
        ((ExecutorService) eVar2.f8269c).execute(new g8.a(14, eVar2, gVar));
        return gVar.f24979a;
    }

    @Override // androidx.appcompat.widget.t2
    public void g(n nVar, MenuItem menuItem) {
        ((h) this.f10430b).f481f.removeCallbacksAndMessages(nVar);
    }

    @Override // ff.a
    public Object get() {
        return new v0((Context) ((c4.k) this.f10430b).f3593a, new m8.a(1), new m7.b(1), 13);
    }

    @Override // c1.i
    public hg.g getData() {
        return ((i) this.f10430b).getData();
    }

    @Override // c1.i
    public Object h(Function2 function2, mf.i iVar) {
        return ((i) this.f10430b).h(new g1.b(function2, null, 0), iVar);
    }

    @Override // androidx.core.view.j
    public void i() {
        ((NestedScrollView) this.f10430b).f1424d.abortAnimation();
    }

    public e4.g j() {
        e4.c n9;
        com.android.billingclient.api.i iVar = (com.android.billingclient.api.i) this.f10430b;
        e4.e eVar = (e4.e) iVar.f4030d;
        synchronized (eVar.f8599h) {
            iVar.b(true);
            n9 = eVar.n(((e4.b) iVar.f4028b).f8579a);
        }
        if (n9 != null) {
            return new e4.g(n9);
        }
        return null;
    }

    public synchronized void k() {
        ((SharedPreferences) this.f10430b).edit().clear().commit();
    }

    public boolean l(String str) {
        String u10 = u(str);
        return "1".equals(u10) || Boolean.parseBoolean(u10);
    }

    public Integer m(String str) {
        String u10 = u(str);
        if (TextUtils.isEmpty(u10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(u10));
        } catch (NumberFormatException unused) {
            w0.m("NotificationParams", "Couldn't parse value of " + A(str) + "(" + u10 + ") into an int");
            return null;
        }
    }

    public JSONArray n(String str) {
        String u10 = u(str);
        if (TextUtils.isEmpty(u10)) {
            return null;
        }
        try {
            return new JSONArray(u10);
        } catch (JSONException unused) {
            w0.m("NotificationParams", "Malformed JSON for key " + A(str) + ": " + u10 + ", falling back to default");
            return null;
        }
    }

    public int[] o() {
        JSONArray n9 = n("gcm.n.light_settings");
        if (n9 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (n9.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int parseColor = Color.parseColor(n9.optString(0));
            if (parseColor == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = parseColor;
            iArr[1] = n9.optInt(1);
            iArr[2] = n9.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e7) {
            w0.m("NotificationParams", "LightSettings is invalid: " + n9 + ". " + e7.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            w0.m("NotificationParams", "LightSettings is invalid: " + n9 + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] p(String str) {
        JSONArray n9 = n(str.concat("_loc_args"));
        if (n9 == null) {
            return null;
        }
        int length = n9.length();
        String[] strArr = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            strArr[i5] = n9.optString(i5);
        }
        return strArr;
    }

    public String q(String str) {
        return u(str.concat("_loc_key"));
    }

    public Long r() {
        String u10 = u("gcm.n.event_time");
        if (TextUtils.isEmpty(u10)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(u10));
        } catch (NumberFormatException unused) {
            w0.m("NotificationParams", "Couldn't parse value of " + A("gcm.n.event_time") + "(" + u10 + ") into a long");
            return null;
        }
    }

    public String s(Resources resources, String str, String str2) {
        String u10 = u(str2);
        if (!TextUtils.isEmpty(u10)) {
            return u10;
        }
        String q = q(str2);
        if (TextUtils.isEmpty(q)) {
            return null;
        }
        int identifier = resources.getIdentifier(q, "string", str);
        if (identifier == 0) {
            w0.m("NotificationParams", A(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] p10 = p(str2);
        if (p10 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, p10);
        } catch (MissingFormatArgumentException e7) {
            w0.n("NotificationParams", "Missing format argument for " + A(str2) + ": " + Arrays.toString(p10) + " Default value will be used.", e7);
            return null;
        }
    }

    public Set t() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f10430b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f10430b);
        }
        return unmodifiableSet;
    }

    public String u(String str) {
        Bundle bundle = (Bundle) this.f10430b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public long[] v() {
        JSONArray n9 = n("gcm.n.vibrate_timings");
        if (n9 == null) {
            return null;
        }
        try {
            if (n9.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = n9.length();
            long[] jArr = new long[length];
            for (int i5 = 0; i5 < length; i5++) {
                jArr[i5] = n9.optLong(i5);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            w0.m("NotificationParams", "User defined vibrateTimings is invalid: " + n9 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public void w() {
        View view = (View) this.f10430b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public Bundle y() {
        Bundle bundle = (Bundle) this.f10430b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void z() {
        View view;
        View view2 = (View) this.f10430b;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new d0(0, view));
    }

    public /* synthetic */ c(int i5, boolean z5) {
        this.f10429a = i5;
    }

    public c(b6.p pVar, e6.i iVar) {
        this.f10429a = 23;
        this.f10430b = pVar;
    }

    public c(int i5) {
        this.f10429a = i5;
        switch (i5) {
            case 14:
                this.f10430b = new AtomicInteger(0);
                break;
            case C0122e9.I /* 29 */:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
                jh.e taskRunner = jh.e.f18552l;
                Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
                Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
                kh.d connectionListener = kh.d.f19098a;
                Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
                r delegate = new r(taskRunner);
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                this.f10430b = delegate;
                break;
            default:
                this.f10430b = new HashSet();
                break;
        }
    }

    public c(q8.a produceNewData) {
        this.f10429a = 19;
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f10430b = produceNewData;
    }

    public c(boolean z5) {
        this.f10429a = 27;
        this.f10430b = new AtomicBoolean(z5);
    }

    public c(View view) {
        this.f10429a = 9;
        if (Build.VERSION.SDK_INT >= 30) {
            f0 f0Var = new f0(8, view);
            f0Var.f1315d = view;
            this.f10430b = f0Var;
            return;
        }
        this.f10430b = new c(8, view);
    }

    public c(Context context) {
        boolean isEmpty;
        this.f10429a = 18;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f10430b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                k();
            }
        } catch (IOException e7) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e7.getMessage());
            }
        }
    }

    public c(Bundle bundle) {
        this.f10429a = 17;
        if (bundle != null) {
            this.f10430b = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public c(WindowInsetsController windowInsetsController) {
        this.f10429a = 9;
        f0 f0Var = new f0(8, null);
        f0Var.f1316e = windowInsetsController;
        this.f10430b = f0Var;
    }

    public c(i delegate) {
        this.f10429a = 28;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f10430b = delegate;
    }
}
