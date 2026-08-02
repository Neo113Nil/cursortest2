package com.vk.toggle;

import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.internal.ToggleManager;
import com.vk.toggle.internal.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.operators.completable.w;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.arm0;
import xsna.bvq;
import xsna.c5g;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.j5g;
import xsna.ms9;
import xsna.on00;
import xsna.pn00;
import xsna.s3q0;
import xsna.u11;
import xsna.w0p0;
import xsna.xuq;

/* compiled from: FeatureManager.kt */
/* loaded from: classes11.dex */
public final class b extends ToggleManager {
    public static final b A = new b("mmaped_storage");

    /* compiled from: FeatureManager.kt */
    public interface a {
        String getKey();

        boolean h();
    }

    /* compiled from: FeatureManager.kt */
    /* renamed from: com.vk.toggle.b$b, reason: collision with other inner class name */
    public interface InterfaceC1925b {
        j1 a(c cVar, UserId userId);

        w b(a aVar);
    }

    /* compiled from: FeatureManager.kt */
    public static final class c {
        public final int a;
        public final List<d> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(int i, List<? extends d> list) {
            this.a = i;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SupportedToggles(version=");
            sb.append(this.a);
            sb.append(", toggles=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static final void y() {
        b bVar = A;
        synchronized (bVar) {
            int i = 0;
            try {
                bVar.m = 0;
                ReentrantReadWriteLock reentrantReadWriteLock = bVar.w;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    bVar.t(ToggleManager.Sync.NotSynced);
                    s3q0 s3q0Var = s3q0.a;
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    bVar.f.onNext(ToggleManager.Sync.NotSynced);
                    bVar.q.clear();
                    bVar.i.a.clear();
                    bVar.s.clear();
                    bVar.l.clear();
                    io.reactivex.rxjava3.disposables.b bVar2 = bVar.v;
                    if (bVar2 != null) {
                        bVar2.dispose();
                    }
                    InterfaceC1925b interfaceC1925b = bVar.o;
                    if (interfaceC1925b == null) {
                        interfaceC1925b = null;
                    }
                    interfaceC1925b.getClass();
                    Lazy<? extends xuq> lazy = bVar.k;
                    if (lazy == null) {
                        lazy = null;
                    }
                    bVar.h = bVar.g("default_storage", lazy);
                    bvq bvqVar = bVar.n;
                    (bvqVar != null ? bvqVar : null).clear();
                    bVar.t.clear();
                    bVar.k().a.onNext(a.C1930a.a);
                } catch (Throwable th) {
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String z(Map<String, ? extends d> map) {
        Map t = pn00.t(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(t.size()));
        for (Map.Entry entry : t.entrySet()) {
            Object key = entry.getKey();
            d dVar = (d) entry.getValue();
            linkedHashMap.put(key, dVar != null ? w0p0.c(dVar) : JSONObject.NULL);
        }
        ToggleManager.b bVar = this.j;
        if (bVar == null) {
            bVar = null;
        }
        String str = bVar.d;
        if (str.length() == 0) {
            str = "default_storage";
        }
        return new JSONObject(pn00.k(new Pair(X3.a.k, str), new Pair("toggles", linkedHashMap))).toString();
    }

    /* compiled from: FeatureManager.kt */
    public static class d {
        public boolean a;
        public final CharSequence b;
        public CharSequence c;

        public d(CharSequence charSequence, CharSequence charSequence2, boolean z) {
            this.a = z;
            if (charSequence.length() > 30) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{"To long toggle key=" + ((Object) charSequence)});
                }
            }
            this.b = charSequence;
            this.c = charSequence2;
        }

        public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
            if (charSequence == charSequence2) {
                return true;
            }
            if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
                int length = charSequence.length();
                for (int i = 0; i < length; i++) {
                    if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                    }
                }
                return true;
            }
            return false;
        }

        public final Integer b() {
            String str;
            List<String> f = f();
            if (f == null || (str = (String) j5g.a0(f)) == null) {
                return null;
            }
            return arm0.m(10, str);
        }

        public final Long c() {
            String str;
            List<String> f = f();
            if (f == null || (str = (String) j5g.a0(f)) == null) {
                return null;
            }
            return arm0.n(str);
        }

        public final String d() {
            List<String> f = f();
            if (f != null) {
                return (String) j5g.a0(f);
            }
            return null;
        }

        public final void e(Exception exc) {
            L l = L.a;
            l.getClass();
            if (L.c) {
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.LogType logType = L.LogType.e;
                StringBuilder sb = new StringBuilder("Failed parse featureToggle value. Toggle: ");
                sb.append(this);
                sb.append(". message: ");
                String message = exc.getMessage();
                if (message == null) {
                    message = "";
                }
                sb.append(message);
                L.u(l, logType, new Object[]{sb.toString()});
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!getClass().equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && a(this.b, dVar.b) && a(this.c, dVar.c);
        }

        public final List<String> f() {
            Collection collection;
            if (!this.a) {
                return null;
            }
            try {
                List j = new Regex(StringUtils.COMMA).j(0, this.c.toString());
                ArrayList arrayList = new ArrayList(c5g.u(j, 10));
                Iterator it = j.iterator();
                while (it.hasNext()) {
                    arrayList.add(drm0.p0((String) it.next()).toString());
                }
                if (!arrayList.isEmpty()) {
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collection = j5g.H0(arrayList, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = EmptyList.b;
                String[] strArr = (String[]) collection.toArray(new String[0]);
                return e43.l(Arrays.copyOf(strArr, strArr.length));
            } catch (Exception e) {
                e(e);
                return null;
            }
        }

        public final JSONObject g() {
            if (!this.a) {
                return null;
            }
            try {
                return new JSONObject(this.c.toString());
            } catch (JSONException e) {
                e(e);
                return null;
            }
        }

        public final int hashCode() {
            return this.c.hashCode() + u11.c(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "Toggle(key='" + this.b.toString() + "', enable=" + this.a + ", value=" + this.c.toString() + ')';
        }

        public /* synthetic */ d(String str) {
            this(str, "", false);
        }
    }
}
