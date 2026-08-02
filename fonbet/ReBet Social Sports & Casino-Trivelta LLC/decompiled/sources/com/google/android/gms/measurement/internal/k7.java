package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class k7 {

    /* renamed from: a, reason: collision with root package name */
    public zzhs f34087a;

    /* renamed from: b, reason: collision with root package name */
    public Long f34088b;

    /* renamed from: c, reason: collision with root package name */
    public long f34089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3238e f34090d;

    public /* synthetic */ k7(C3238e c3238e, byte[] bArr) {
        Objects.requireNonNull(c3238e);
        this.f34090d = c3238e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f1, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d1  */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzhs a(String str, zzhs zzhsVar) {
        Cursor cursor;
        Pair pair;
        Object obj;
        String zzd = zzhsVar.zzd();
        List zza = zzhsVar.zza();
        C3238e c3238e = this.f34090d;
        S6 s62 = c3238e.f34418b;
        s62.K0();
        Long l10 = (Long) X6.u(zzhsVar, "_eid");
        if (l10 != null) {
            if (zzd.equals("_ep")) {
                AbstractC3191o.m(l10);
                s62.K0();
                String str2 = (String) X6.u(zzhsVar, "_en");
                ?? r72 = 0;
                if (TextUtils.isEmpty(str2)) {
                    c3238e.f33578a.a().p().b("Extra parameter without an event name. eventId", l10);
                    return null;
                }
                if (this.f34087a == null || this.f34088b == null || l10.longValue() != this.f34088b.longValue()) {
                    C3357t F02 = s62.F0();
                    F02.h();
                    F02.j();
                    try {
                        try {
                            cursor = F02.u0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                            try {
                            } catch (SQLiteException e10) {
                                e = e10;
                                F02.f33578a.a().o().b("Error selecting main event", e);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r72 = s62;
                            if (r72 != 0) {
                                r72.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e11) {
                        e = e11;
                        cursor = null;
                    } catch (Throwable th3) {
                        th = th3;
                        if (r72 != 0) {
                        }
                        throw th;
                    }
                    if (cursor.moveToFirst()) {
                        try {
                            pair = Pair.create((zzhs) ((zzhr) X6.W(zzhs.zzk(), cursor.getBlob(0))).zzbc(), Long.valueOf(cursor.getLong(1)));
                            cursor.close();
                        } catch (IOException e12) {
                            F02.f33578a.a().o().d("Failed to merge main event. appId, eventId", C3392x2.x(str), l10, e12);
                        }
                        if (pair != null || (obj = pair.first) == null) {
                            this.f34090d.f33578a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                            return null;
                        }
                        this.f34087a = (zzhs) obj;
                        this.f34089c = ((Long) pair.second).longValue();
                        this.f34090d.f34418b.K0();
                        this.f34088b = (Long) X6.u(this.f34087a, "_eid");
                    } else {
                        F02.f33578a.a().w().a("Main event not found");
                    }
                    cursor.close();
                    pair = null;
                    if (pair != null) {
                    }
                    this.f34090d.f33578a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                    return null;
                }
                long j10 = this.f34089c - 1;
                this.f34089c = j10;
                if (j10 <= 0) {
                    C3357t F03 = this.f34090d.f34418b.F0();
                    F03.h();
                    F03.f33578a.a().w().b("Clearing complex main event info. appId", str);
                    try {
                        F03.u0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        F03.f33578a.a().o().b("Error clearing complex main event", e13);
                    }
                } else {
                    this.f34090d.f34418b.F0().F(str, l10, this.f34089c, this.f34087a);
                }
                ArrayList arrayList = new ArrayList();
                for (zzhw zzhwVar : this.f34087a.zza()) {
                    this.f34090d.f34418b.K0();
                    if (X6.r(zzhsVar, zzhwVar.zzb()) == null) {
                        arrayList.add(zzhwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f34090d.f33578a.a().p().b("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(zza);
                    zza = arrayList;
                }
                zzd = str2;
            } else {
                this.f34088b = l10;
                this.f34087a = zzhsVar;
                s62.K0();
                long longValue = ((Long) X6.v(zzhsVar, "_epc", 0L)).longValue();
                this.f34089c = longValue;
                if (longValue <= 0) {
                    c3238e.f33578a.a().p().b("Complex event with zero extra param count. eventName", zzd);
                } else {
                    s62.F0().F(str, (Long) AbstractC3191o.m(l10), this.f34089c, zzhsVar);
                }
            }
        }
        zzhr zzhrVar = (zzhr) zzhsVar.zzcl();
        zzhrVar.zzl(zzd);
        zzhrVar.zzi();
        zzhrVar.zzh(zza);
        return (zzhs) zzhrVar.zzbc();
    }
}
