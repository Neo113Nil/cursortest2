package a1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1908a {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f14970f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static C1908a f14971g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14972a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14973b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f14974c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14975d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Handler f14976e;

    /* renamed from: a1.a$a, reason: collision with other inner class name */
    public class HandlerC0313a extends Handler {
        public HandlerC0313a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C1908a.this.a();
            }
        }
    }

    /* renamed from: a1.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f14978a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f14979b;

        public b(Intent intent, ArrayList arrayList) {
            this.f14978a = intent;
            this.f14979b = arrayList;
        }
    }

    /* renamed from: a1.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final IntentFilter f14980a;

        /* renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f14981b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f14982c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f14983d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f14980a = intentFilter;
            this.f14981b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f14981b);
            sb2.append(" filter=");
            sb2.append(this.f14980a);
            if (this.f14983d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public C1908a(Context context) {
        this.f14972a = context;
        this.f14976e = new HandlerC0313a(context.getMainLooper());
    }

    public static C1908a b(Context context) {
        C1908a c1908a;
        synchronized (f14970f) {
            try {
                if (f14971g == null) {
                    f14971g = new C1908a(context.getApplicationContext());
                }
                c1908a = f14971g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c1908a;
    }

    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f14973b) {
                try {
                    size = this.f14975d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f14975d.toArray(bVarArr);
                    this.f14975d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f14979b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = (c) bVar.f14979b.get(i11);
                    if (!cVar.f14983d) {
                        cVar.f14981b.onReceive(this.f14972a, bVar.f14978a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f14973b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f14973b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f14973b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList arrayList2 = (ArrayList) this.f14974c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f14974c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d(Intent intent) {
        int match;
        synchronized (this.f14973b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f14972a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    intent.toString();
                }
                ArrayList arrayList = (ArrayList) this.f14974c.get(intent.getAction());
                if (arrayList != null) {
                    if (z10) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        c cVar = (c) arrayList.get(i10);
                        if (z10) {
                            Objects.toString(cVar.f14980a);
                        }
                        if (!cVar.f14982c && (match = cVar.f14980a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                            if (z10) {
                                Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(cVar);
                            cVar.f14982c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            ((c) arrayList2.get(i11)).f14982c = false;
                        }
                        this.f14975d.add(new b(intent, arrayList2));
                        if (!this.f14976e.hasMessages(1)) {
                            this.f14976e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f14973b) {
            try {
                ArrayList arrayList = (ArrayList) this.f14973b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) arrayList.get(size);
                    cVar.f14983d = true;
                    for (int i10 = 0; i10 < cVar.f14980a.countActions(); i10++) {
                        String action = cVar.f14980a.getAction(i10);
                        ArrayList arrayList2 = (ArrayList) this.f14974c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList2.get(size2);
                                if (cVar2.f14981b == broadcastReceiver) {
                                    cVar2.f14983d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f14974c.remove(action);
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
