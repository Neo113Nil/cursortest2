package y8;

import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.location.Location;
import android.os.Parcel;
import android.text.Editable;
import android.text.Selection;
import androidx.core.view.b0;
import androidx.lifecycle.o;
import cd.n;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.play_billing.i5;
import com.google.android.gms.libs.identity.zzee;
import com.google.android.gms.location.LastLocationRequest;
import com.google.firebase.messaging.q;
import com.logrocket.core.d0;
import com.sports.insider.MyApp;
import e3.k0;
import e3.t;
import e3.u;
import e6.k;
import eb.m;
import eg.b2;
import eg.c0;
import eg.m0;
import eg.y1;
import id.l;
import io.sentry.d4;
import j1.v;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import la.s0;
import la.w;
import m7.i;
import m7.s;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class d implements b0, t1.b, b5.e, c1.c, d0, n2.a, i2.e, kotlin.coroutines.f, x8.a, k {

    /* renamed from: a, reason: collision with root package name */
    public static d f25728a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f25729b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d f25730c = new d();

    public static final db.a a(d dVar) {
        dVar.getClass();
        return (db.a) y3.m(db.a.class, null, 6);
    }

    public static final fa.a c(d dVar) {
        return (fa.a) y3.m(fa.a.class, null, 6);
    }

    public static final m d(d dVar) {
        dVar.getClass();
        return (m) y3.m(m.class, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m(l1.c cVar, Editable editable, int i5, int i10, boolean z5) {
        int min;
        if (editable != null && i5 >= 0 && i10 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z5) {
                    int max = Math.max(i5, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z7 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z7) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z7 = true;
                                    }
                                } else if (!z7) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i10, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z10 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z10) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z10 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i5, 0);
                    min = Math.min(selectionEnd + i10, editable.length());
                }
                v[] vVarArr = (v[]) editable.getSpans(selectionStart, min, v.class);
                if (vVarArr != null && vVarArr.length > 0) {
                    for (v vVar : vVarArr) {
                        int spanStart = editable.getSpanStart(vVar);
                        int spanEnd = editable.getSpanEnd(vVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    cVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    cVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // e6.k
    public void accept(Object obj, Object obj2) {
        w7.g gVar = (w7.g) obj2;
        i iVar = (i) obj;
        LastLocationRequest lastLocationRequest = new LastLocationRequest(LongCompanionObject.MAX_VALUE, 0, false, null);
        if (iVar.y(p7.e.f21527b)) {
            s sVar = (s) iVar.m();
            zzee zzeeVar = new zzee(4, null, new m7.f(gVar), null, null);
            Parcel O = sVar.O();
            int i5 = m7.c.f20451a;
            O.writeInt(1);
            lastLocationRequest.writeToParcel(O, 0);
            O.writeInt(1);
            zzeeVar.writeToParcel(O, 0);
            sVar.P(O, 90);
            return;
        }
        if (iVar.y(p7.e.f21526a)) {
            s sVar2 = (s) iVar.m();
            m7.f fVar = new m7.f(gVar);
            Parcel O2 = sVar2.O();
            int i10 = m7.c.f20451a;
            O2.writeInt(1);
            lastLocationRequest.writeToParcel(O2, 0);
            O2.writeStrongBinder(fVar);
            sVar2.P(O2, 82);
            return;
        }
        s sVar3 = (s) iVar.m();
        Parcel O3 = sVar3.O();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                sVar3.f5343f.transact(7, O3, obtain, 0);
                obtain.readException();
                O3.recycle();
                Location location = (Location) m7.c.a(obtain, Location.CREATOR);
                obtain.recycle();
                gVar.b(location);
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } catch (Throwable th2) {
            O3.recycle();
            throw th2;
        }
    }

    @Override // b5.e
    public Object apply(Object obj) {
        return ((i5) obj).b();
    }

    public Object e(Integer num, mf.i iVar) {
        lg.e eVar = m0.f9201a;
        Object A = c0.A(lg.d.f20063c, new cb.b(this, num, null, 0), iVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:10:0x0023, B:11:0x005a, B:17:0x006c, B:18:0x007d, B:22:0x0072, B:23:0x0078, B:27:0x0032), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(int i5, mf.c cVar) {
        l lVar;
        int i10;
        try {
            if (cVar instanceof l) {
                lVar = (l) cVar;
                int i11 = lVar.f11181c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    lVar.f11181c = i11 - Integer.MIN_VALUE;
                    Object obj = lVar.f11179a;
                    lf.a aVar = lf.a.f20034a;
                    i10 = lVar.f11181c;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        c0.t(MyApp.f6830c, rc.b0.b(), null, new cd.k(i5, 1, new n(), (Continuation) null), 2);
                        lVar.f11181c = 1;
                        obj = ((s0) y3.m(s0.class, null, 6)).f(i5, lVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    int intValue = ((Number) obj).intValue();
                    Object tVar = intValue == 200 ? (intValue == 429 || intValue == 502) ? new t() : new e3.s() : new u();
                    Intrinsics.checkNotNull(tVar);
                    return tVar;
                }
            }
            if (i10 != 0) {
            }
            int intValue2 = ((Number) obj).intValue();
            if (intValue2 == 200) {
            }
            Intrinsics.checkNotNull(tVar);
            return tVar;
        } catch (Exception unused) {
            e3.s sVar = new e3.s();
            Intrinsics.checkNotNull(sVar);
            return sVar;
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.f11179a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = lVar.f11181c;
    }

    @Override // com.logrocket.core.d0
    public void g(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        d4.c(new q(str, 5));
    }

    public Object h(Integer num, mf.i iVar) {
        lg.e eVar = m0.f9201a;
        Object A = c0.A(lg.d.f20063c, new cb.b(this, num, null, 2), iVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(long j, mf.c cVar) {
        jd.b bVar;
        lf.a aVar;
        int i5;
        String str;
        Object b10;
        String str2;
        try {
            if (cVar instanceof jd.b) {
                bVar = (jd.b) cVar;
                int i10 = bVar.f18448e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f18448e = i10 - Integer.MIN_VALUE;
                    Object obj = bVar.f18446c;
                    aVar = lf.a.f20034a;
                    i5 = bVar.f18448e;
                    Continuation continuation = null;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        bVar.f18444a = j;
                        bVar.f18448e = 1;
                        obj = c0.i(new ad.a(this, continuation, 9), bVar);
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str2 = bVar.f18445b;
                            try {
                                h8.b.B(obj);
                                return (String) obj;
                            } catch (y1 unused) {
                                return str2;
                            }
                        }
                        j = bVar.f18444a;
                        h8.b.B(obj);
                    }
                    str = (String) obj;
                    androidx.lifecycle.c cVar2 = new androidx.lifecycle.c(c0.e(MyApp.f6830c, null, new o(this, str, continuation, 19), 3), str, continuation, 24);
                    bVar.f18445b = str;
                    bVar.f18444a = j;
                    bVar.f18448e = 2;
                    b10 = b2.b(j, cVar2, bVar);
                    if (b10 != aVar) {
                        obj = b10;
                        str2 = str;
                        return (String) obj;
                    }
                    return aVar;
                }
            }
            androidx.lifecycle.c cVar22 = new androidx.lifecycle.c(c0.e(MyApp.f6830c, null, new o(this, str, continuation, 19), 3), str, continuation, 24);
            bVar.f18445b = str;
            bVar.f18444a = j;
            bVar.f18448e = 2;
            b10 = b2.b(j, cVar22, bVar);
            if (b10 != aVar) {
            }
            return aVar;
        } catch (y1 unused2) {
            return str;
        }
        bVar = new jd.b(this, cVar);
        Object obj2 = bVar.f18446c;
        aVar = lf.a.f20034a;
        i5 = bVar.f18448e;
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
        str = (String) obj2;
    }

    public Signature[] l(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean n(CharSequence charSequence) {
        return false;
    }

    public Object o(Integer num, mf.i iVar) {
        lg.e eVar = m0.f9201a;
        Object A = c0.A(lg.d.f20063c, new cb.b(this, num, null, 5), iVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(mf.c cVar) {
        cd.i iVar;
        int i5;
        int intValue;
        Object sVar;
        try {
            if (cVar instanceof cd.i) {
                iVar = (cd.i) cVar;
                int i10 = iVar.f3772c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    iVar.f3772c = i10 - Integer.MIN_VALUE;
                    Object obj = iVar.f3770a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = iVar.f3772c;
                    Continuation continuation = null;
                    int i11 = 1;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        new WeakReference(new rc.b0());
                        iVar.f3772c = 1;
                        w wVar = (w) y3.m(w.class, null, 6);
                        wVar.getClass();
                        lg.e eVar = m0.f9201a;
                        obj = c0.A(lg.d.f20063c, new la.u(wVar, continuation, i11), iVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    if (200 <= intValue || intValue >= 300) {
                        if (intValue != 401 && intValue != 403 && intValue != 404 && intValue != 405) {
                            sVar = new e3.s();
                        }
                        ((k0) y3.m(k0.class, null, 6)).a("WorkerMetricEvent");
                        sVar = new e3.s();
                    } else {
                        sVar = new u();
                    }
                    Intrinsics.checkNotNull(sVar);
                    return sVar;
                }
            }
            if (i5 != 0) {
            }
            intValue = ((Number) obj).intValue();
            if (200 <= intValue) {
            }
            if (intValue != 401) {
                sVar = new e3.s();
                Intrinsics.checkNotNull(sVar);
                return sVar;
            }
            ((k0) y3.m(k0.class, null, 6)).a("WorkerMetricEvent");
            sVar = new e3.s();
            Intrinsics.checkNotNull(sVar);
            return sVar;
        } catch (Exception unused) {
            e3.s sVar2 = new e3.s();
            Intrinsics.checkNotNull(sVar2);
            return sVar2;
        }
        iVar = new cd.i(this, cVar);
        Object obj2 = iVar.f3770a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = iVar.f3772c;
        Continuation continuation2 = null;
        int i112 = 1;
    }

    @Override // n2.a
    public void q(t2.a db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.p("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db2.p0(contentValues, new Object[0]);
    }

    @Override // i2.e
    public void i() {
    }

    @Override // c1.c
    public Object b(c1.b bVar) {
        throw bVar;
    }

    @Override // i2.e
    public void k(int i5, Object obj) {
    }

    @Override // androidx.core.view.b0
    public void onScrollLimit(int i5, int i10, int i11, boolean z5) {
    }

    @Override // androidx.core.view.b0
    public void onScrollProgress(int i5, int i10, int i11, int i12) {
    }
}
