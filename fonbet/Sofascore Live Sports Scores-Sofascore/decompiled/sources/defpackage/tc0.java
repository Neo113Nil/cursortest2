package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.cast.zzbx;
import com.google.android.gms.internal.cast.zzcn;
import com.google.android.gms.internal.cast.zzfu;
import com.google.android.gms.internal.cast.zzj;
import com.google.android.gms.internal.cast.zzqr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.iab.omid.library.smartadserver1.adsession.AdSession;
import com.iab.omid.library.smartadserver1.adsession.FriendlyObstructionPurpose;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public tc0(lum lumVar, sem semVar, int i) {
        this.a = 5;
        this.d = lumVar;
        this.c = semVar;
        this.b = i;
        SystemClock.elapsedRealtime();
    }

    private final void a() {
        Task task;
        zzj zzjVar = (zzj) this.c;
        zzqr zzqrVar = (zzqr) this.d;
        int i = this.b;
        zzcn zzcnVar = zzjVar.i;
        if (zzcnVar == null) {
            return;
        }
        synchronized (zzcnVar) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            zzfu zzfuVar = zzcnVar.a;
            TaskApiCall.Builder a = TaskApiCall.a();
            a.a = new ewm(zzfuVar, 24);
            a.d = 4501;
            zzfuVar.h(0, a.a()).addOnSuccessListener(new ewm(taskCompletionSource, 10)).addOnFailureListener(new fjn(taskCompletionSource, 4));
            zzcnVar.c.postDelayed(new j4n(1, taskCompletionSource), zzcnVar.b * 1000);
            task = taskCompletionSource.getTask();
        }
        task.addOnSuccessListener(new b10(zzjVar, zzqrVar, i, 23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #2 {all -> 0x0143, blocks: (B:96:0x0139, B:98:0x013d), top: B:95:0x0139 }] */
    /* JADX WARN: Type inference failed for: r1v14, types: [lum] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        Cursor cursor;
        jtm jtmVar;
        ?? r4 = 1;
        switch (this.a) {
            case 0:
                ((TextView) this.c).setTypeface((Typeface) this.d, this.b);
                return;
            case 1:
                ((BottomSheetBehavior) this.d).P((View) this.c, this.b, false);
                return;
            case 2:
                ((aa4) this.d).b.onNavigationEvent(this.b, (Bundle) this.c);
                return;
            case 3:
                zba zbaVar = (zba) this.c;
                u uVar = zbaVar.e;
                eca ecaVar = (eca) this.d;
                RecyclerView recyclerView = ecaVar.r;
                if (recyclerView == null || !recyclerView.isAttachedToWindow() || zbaVar.k || uVar.getAbsoluteAdapterPosition() == -1) {
                    return;
                }
                m itemAnimator = ecaVar.r.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.f()) {
                    ArrayList arrayList = ecaVar.p;
                    int size = arrayList.size();
                    while (r2 < size) {
                        if (((zba) arrayList.get(r2)).l) {
                            r2++;
                        }
                    }
                    ecaVar.m.t(uVar, this.b);
                    return;
                }
                ecaVar.r.post(this);
                return;
            case 4:
                synchronized (((rjg) this.d)) {
                    int i = this.b;
                    if (i == 1) {
                        str = "VIDEO_CONTROLS";
                    } else if (i == 2) {
                        str = "CLOSE_AD";
                    } else if (i == 3) {
                        str = "NOT_VISIBLE";
                    } else {
                        if (i != 4) {
                            throw null;
                        }
                        str = NativeAdContent.ViewTag.OTHER;
                    }
                    FriendlyObstructionPurpose valueOf = FriendlyObstructionPurpose.valueOf(str);
                    try {
                        AdSession adSession = ((rjg) this.d).a;
                        if (adSession != null) {
                            adSession.addFriendlyObstruction((View) this.c, valueOf, null);
                        }
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        fjg c = fjg.c();
                        e.getMessage();
                        c.f(1);
                    }
                }
                return;
            case 5:
                SystemClock.elapsedRealtime();
                ?? r1 = (lum) this.d;
                iwm iwmVar = r1.c;
                sem semVar = (sem) this.c;
                int i2 = this.b;
                ArrayList arrayList2 = new ArrayList();
                try {
                    SQLiteDatabase readableDatabase = semVar.getReadableDatabase();
                    int g = r1.g();
                    cursor = readableDatabase.query(r1.c.oo(), null, null, null, null, null, "priority DESC, create_time DESC", i2 + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + g);
                    if (cursor != null) {
                        try {
                            if (!cursor.moveToFirst()) {
                                try {
                                    cursor.close();
                                    return;
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            r2 = cursor.getCount() >= g ? 1 : 0;
                            try {
                                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("data");
                                int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("data_id");
                                int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
                                int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("upload_retry_count");
                                do {
                                    String string = cursor.getString(columnIndexOrThrow2);
                                    synchronized (r1.d) {
                                        try {
                                            if (!r1.d.contains(string)) {
                                                r1.d.add(string);
                                                byte[] blob = cursor.getBlob(columnIndexOrThrow);
                                                eem oo = r1.b.b.oo();
                                                if (oo != null) {
                                                    blob = oo.sf(blob);
                                                    jtm jtmVar2 = r1.j;
                                                    if (jtmVar2 != null) {
                                                        jtmVar2.b(blob != null ? 7 : 8, 1);
                                                    }
                                                }
                                                itm pcc = r1.c.pcc(string, blob, cursor.getInt(columnIndexOrThrow3), cursor.getInt(columnIndexOrThrow4));
                                                if (pcc == null) {
                                                    synchronized (r1.d) {
                                                        r1.d.remove(string);
                                                    }
                                                } else {
                                                    arrayList2.add(pcc);
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                } while (cursor.moveToNext());
                                r4 = r2;
                            } catch (Throwable unused2) {
                                try {
                                    jtmVar = r1.j;
                                    if (jtmVar != null) {
                                    }
                                    if (cursor != null) {
                                    }
                                    r4 = r2;
                                    if (arrayList2.isEmpty()) {
                                    }
                                } catch (Throwable th) {
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Exception unused3) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable unused4) {
                            r2 = 1;
                            jtmVar = r1.j;
                            if (jtmVar != null) {
                                jtmVar.b(10005, 1);
                            }
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused5) {
                                }
                            }
                            r4 = r2;
                            if (arrayList2.isEmpty()) {
                            }
                        }
                    }
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception unused6) {
                        }
                    }
                } catch (Throwable unused7) {
                    cursor = null;
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                r1.d(arrayList2, r4, null);
                return;
            case 6:
                zzbx zzbxVar = (zzbx) this.c;
                ibc ibcVar = (ibc) this.d;
                int i3 = this.b;
                synchronized (zzbxVar.c) {
                    zzbxVar.Z1(ibcVar, i3);
                }
                return;
            case 7:
                Iterator it = ((CopyOnWriteArraySet) this.c).iterator();
                while (it.hasNext()) {
                    zzeb zzebVar = (zzeb) this.d;
                    int i4 = this.b;
                    e3o e3oVar = (e3o) it.next();
                    if (!e3oVar.d) {
                        if (i4 != -1) {
                            e3oVar.b.a(i4);
                        }
                        e3oVar.c = true;
                        zzebVar.mo13zza(e3oVar.a);
                    }
                }
                return;
            case 8:
                a();
                return;
            default:
                ((klo) this.c).s(this.b, (ddb) this.d);
                return;
        }
    }

    public /* synthetic */ tc0(Object obj, int i, Object obj2, int i2, boolean z) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ tc0(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public /* synthetic */ tc0(Object obj, Object obj2, int i, int i2, boolean z) {
        this.a = i2;
        this.d = obj;
        this.c = obj2;
        this.b = i;
    }

    public /* synthetic */ tc0(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }
}
