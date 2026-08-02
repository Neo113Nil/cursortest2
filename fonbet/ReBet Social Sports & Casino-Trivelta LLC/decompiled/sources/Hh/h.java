package Hh;

import Gh.l;
import Hh.d;
import android.content.Context;
import io.radar.sdk.C4589c;
import io.radar.sdk.L0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h implements d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f4967f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static int f4968g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4969a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4970b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4971c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f4972d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingDeque f4973e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements Hh.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f4974a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f4975b;

        public b(List list, h hVar) {
            this.f4974a = list;
            this.f4975b = hVar;
        }

        @Override // Hh.b
        public void a(boolean z10) {
            if (z10) {
                return;
            }
            if (this.f4975b.f4970b) {
                this.f4975b.r(this.f4974a);
                this.f4975b.p();
                return;
            }
            CollectionsKt.reverse(this.f4974a);
            List list = this.f4974a;
            h hVar = this.f4975b;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!hVar.f4973e.offerFirst((l) it.next())) {
                    hVar.p();
                }
            }
        }

        @Override // Hh.b
        public List get() {
            return this.f4974a;
        }
    }

    public h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4969a = context;
        this.f4971c = new Object();
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f4972d = newScheduledThreadPool;
        this.f4973e = new LinkedBlockingDeque();
        this.f4970b = L0.f49705a.s(l()).j();
        File file = new File(l().getFilesDir(), "radar_logs");
        if (!file.exists()) {
            file.mkdir();
        }
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: Hh.f
            @Override // java.lang.Runnable
            public final void run() {
                h.g(h.this);
            }
        }, 2L, 2L, TimeUnit.SECONDS);
    }

    public static final void g(h this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    public static final int n(File file, File file2) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file1.name");
        Long longOrNull = StringsKt.toLongOrNull(StringsKt.replace$default(name, "_", "", false, 4, (Object) null));
        long longValue = longOrNull != null ? longOrNull.longValue() : 0L;
        String name2 = file2.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "file2.name");
        Long longOrNull2 = StringsKt.toLongOrNull(StringsKt.replace$default(name2, "_", "", false, 4, (Object) null));
        return Intrinsics.compare(longValue, longOrNull2 != null ? longOrNull2.longValue() : 0L);
    }

    @Override // Hh.d
    public void a() {
        synchronized (this.f4971c) {
            try {
                if (this.f4970b && this.f4973e.size() > 0) {
                    r(this.f4973e);
                    this.f4973e.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Hh.d
    public void b(C4589c.EnumC4599k level, C4589c.EnumC4600l enumC4600l, String message, Date createdAt) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        synchronized (this.f4971c) {
            try {
                this.f4973e.put(new l(level, message, enumC4600l, createdAt));
                if (this.f4970b) {
                    if (this.f4973e.size() > 200) {
                        a();
                    }
                } else if (this.f4973e.size() > 500) {
                    p();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Hh.d
    public void c(boolean z10) {
        this.f4970b = z10;
    }

    @Override // Hh.d
    public Hh.b d() {
        File file;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f4971c) {
            try {
                if (this.f4970b) {
                    a();
                    p();
                    q().drainTo(arrayList);
                    File[] m10 = m();
                    int min = Integer.min(arrayList.size(), m10 != null ? m10.length : 0);
                    for (int i10 = 0; i10 < min; i10++) {
                        if (m10 != null && (file = m10[i10]) != null) {
                            file.delete();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    this.f4973e.drainTo(arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new b(arrayList, this);
    }

    public Context l() {
        return this.f4969a;
    }

    public final File[] m() {
        return new c(l()).b("radar_logs", new Comparator() { // from class: Hh.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int n10;
                n10 = h.n((File) obj, (File) obj2);
                return n10;
            }
        });
    }

    public final boolean o(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public final void p() {
        File file;
        if (!this.f4970b) {
            this.f4973e.drainTo(new ArrayList(), 250);
            d.a.a(this, C4589c.EnumC4599k.DEBUG, null, "----- purged oldest logs -----", null, 8, null);
            return;
        }
        File[] m10 = m();
        if (m10 == null || m10.length == 0) {
            return;
        }
        boolean z10 = false;
        while (true) {
            if ((m10 != null ? m10.length : 0) <= 500) {
                return;
            }
            int min = Integer.min(250, m10 != null ? m10.length : 0);
            for (int i10 = 0; i10 < min; i10++) {
                if (m10 != null && (file = m10[i10]) != null) {
                    file.delete();
                }
            }
            if (!z10) {
                r(CollectionsKt.listOf(new l(C4589c.EnumC4599k.DEBUG, "----- purged oldest logs -----", null, null, 8, null)));
                z10 = true;
            }
            m10 = m();
        }
    }

    public final LinkedBlockingDeque q() {
        File[] m10 = m();
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        if (m10 != null && m10.length != 0) {
            Iterator it = ArrayIteratorKt.iterator(m10);
            while (it.hasNext()) {
                File file = (File) it.next();
                c cVar = new c(l());
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "file.name");
                String a10 = cVar.a("radar_logs", name);
                if (a10 == null || a10.length() == 0 || !o(a10)) {
                    file.delete();
                } else {
                    l a11 = l.f4147e.a(new JSONObject(a10));
                    if (a11 != null) {
                        linkedBlockingDeque.add(a11);
                    }
                }
            }
        }
        return linkedBlockingDeque;
    }

    public final void r(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            int i10 = f4968g;
            f4968g = i10 + 1;
            String format = String.format("%04d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            String str = (lVar.b().getTime() / 1000) + '_' + format;
            c cVar = new c(l());
            String jSONObject = lVar.c().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "log.toJson().toString()");
            cVar.c("radar_logs", str, jSONObject);
        }
    }
}
