package i3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Deprecated
/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7003a {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f65764f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static C7003a f65765g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f65766a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f65767b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f65768c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f65769d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f65770e;

    /* renamed from: i3.a$a, reason: collision with other inner class name */
    final class HandlerC1082a extends Handler {
        HandlerC1082a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C7003a.this.a();
            }
        }
    }

    /* renamed from: i3.a$b */
    /* loaded from: classes8.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f65772a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f65773b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f65772a = intent;
            this.f65773b = arrayList;
        }
    }

    /* renamed from: i3.a$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f65774a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f65775b;

        /* renamed from: c, reason: collision with root package name */
        boolean f65776c;

        /* renamed from: d, reason: collision with root package name */
        boolean f65777d;

        c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f65774a = intentFilter;
            this.f65775b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
            sb2.append("Receiver{");
            sb2.append(this.f65775b);
            sb2.append(" filter=");
            sb2.append(this.f65774a);
            if (this.f65777d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private C7003a(Context context) {
        this.f65766a = context;
        this.f65770e = new HandlerC1082a(context.getMainLooper());
    }

    @NonNull
    public static C7003a b(@NonNull Context context) {
        C7003a c7003a;
        synchronized (f65764f) {
            try {
                if (f65765g == null) {
                    f65765g = new C7003a(context.getApplicationContext());
                }
                c7003a = f65765g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c7003a;
    }

    final void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f65767b) {
                try {
                    size = this.f65769d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f65769d.toArray(bVarArr);
                    this.f65769d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = bVarArr[i11];
                int size2 = bVar.f65773b.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    c cVar = bVar.f65773b.get(i12);
                    if (!cVar.f65777d) {
                        cVar.f65775b.onReceive(this.f65766a, bVar.f65772a);
                    }
                }
            }
        }
    }

    public final void c(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f65767b) {
            try {
                c cVar = new c(broadcastReceiver, intentFilter);
                ArrayList<c> arrayList = this.f65767b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f65767b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                    String action = intentFilter.getAction(i11);
                    ArrayList<c> arrayList2 = this.f65768c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f65768c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(@NonNull Intent intent) {
        ArrayList<c> arrayList;
        synchronized (this.f65767b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f65766a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z11 = (intent.getFlags() & 8) != 0;
                if (z11) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList2 = this.f65768c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z11) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        c cVar = arrayList2.get(i11);
                        if (z11) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f65774a);
                        }
                        if (cVar.f65776c) {
                            if (z11) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int match = cVar.f65774a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z11) {
                                    StringBuilder sb2 = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb2.append("  Filter matched!  match=0x");
                                    sb2.append(Integer.toHexString(match));
                                    Log.v("LocalBroadcastManager", sb2.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(cVar);
                                cVar.f65776c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z11) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                                }
                            }
                        }
                        i11++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                            ((c) arrayList3.get(i12)).f65776c = false;
                        }
                        this.f65769d.add(new b(intent, arrayList3));
                        if (!this.f65770e.hasMessages(1)) {
                            this.f65770e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f65767b) {
            try {
                ArrayList<c> remove = this.f65767b.remove(broadcastReceiver);
                if (remove == null) {
                    return;
                }
                for (int size = remove.size() - 1; size >= 0; size--) {
                    c cVar = remove.get(size);
                    cVar.f65777d = true;
                    for (int i11 = 0; i11 < cVar.f65774a.countActions(); i11++) {
                        String action = cVar.f65774a.getAction(i11);
                        ArrayList<c> arrayList = this.f65768c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f65775b == broadcastReceiver) {
                                    cVar2.f65777d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f65768c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
