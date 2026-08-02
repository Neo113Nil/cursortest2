package com.sofascore.results.helper;

import android.app.backup.BackupAgent;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import com.sofascore.model.Sports;
import com.sofascore.model.database.DbSportOrder;
import defpackage.a0f;
import defpackage.a5f;
import defpackage.bga;
import defpackage.duf;
import defpackage.e6g;
import defpackage.gz8;
import defpackage.gzh;
import defpackage.joa;
import defpackage.ke0;
import defpackage.km5;
import defpackage.n9e;
import defpackage.o84;
import defpackage.oea;
import defpackage.p5c;
import defpackage.ph0;
import defpackage.pph;
import defpackage.qph;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.td4;
import defpackage.u41;
import defpackage.uic;
import defpackage.v5h;
import defpackage.v7a;
import defpackage.vga;
import defpackage.w9g;
import defpackage.wt3;
import defpackage.x2a;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yyh;
import defpackage.zyh;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/helper/SofaBackupAgent;", "Landroid/app/backup/BackupAgent;", "<init>", "()V", "aik", "qph", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SofaBackupAgent extends BackupAgent {
    public static Map b;
    public final joa a = ypa.a(ysa.c, new e6g(this, 23));

    @Override // android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        SharedPreferences d;
        SharedPreferences d2;
        SharedPreferences d3;
        SharedPreferences d4;
        SharedPreferences d5;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext2 = applicationContext.getApplicationContext();
            synchronized (uic.i) {
                d5 = a5f.d(applicationContext2);
                uic.j = d5;
            }
            d5.getClass();
            sharedPreferences = d5;
        }
        rq3 rq3Var = null;
        String string = sharedPreferences.getString("PREF_THEME", null);
        Context applicationContext3 = getApplicationContext();
        applicationContext3.getClass();
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext4 = applicationContext3.getApplicationContext();
            synchronized (uic.i) {
                d4 = a5f.d(applicationContext4);
                uic.j = d4;
            }
            d4.getClass();
            sharedPreferences2 = d4;
        }
        String string2 = sharedPreferences2.getString("STANDINGS_VIEW_MODE_v2", null);
        Context applicationContext5 = getApplicationContext();
        applicationContext5.getClass();
        SharedPreferences sharedPreferences3 = uic.j;
        if (sharedPreferences3 == null) {
            Context applicationContext6 = applicationContext5.getApplicationContext();
            synchronized (uic.i) {
                d3 = a5f.d(applicationContext6);
                uic.j = d3;
            }
            d3.getClass();
            sharedPreferences3 = d3;
        }
        Boolean valueOf = Boolean.valueOf(sharedPreferences3.getBoolean("LINEUPS_VIEW_MODE_LONG", false));
        Context applicationContext7 = getApplicationContext();
        applicationContext7.getClass();
        String B = x2a.B(applicationContext7);
        Set set = o84.a;
        Context applicationContext8 = getApplicationContext();
        applicationContext8.getClass();
        SharedPreferences sharedPreferences4 = uic.j;
        if (sharedPreferences4 == null) {
            Context applicationContext9 = applicationContext8.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext9);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences4 = d2;
        }
        String string3 = sharedPreferences4.getString("PREF_CURRENCY", "EURO");
        Context applicationContext10 = getApplicationContext();
        applicationContext10.getClass();
        String u = v7a.u(applicationContext10);
        u41 u41Var = new u41(2, rq3Var, 14);
        g gVar = g.a;
        Map map = (Map) td4.t0(gVar, u41Var);
        List list = (List) td4.t0(gVar, new w9g(this, rq3Var, 12));
        Context applicationContext11 = getApplicationContext();
        applicationContext11.getClass();
        SharedPreferences sharedPreferences5 = uic.j;
        if (sharedPreferences5 == null) {
            Context applicationContext12 = applicationContext11.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext12);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences5 = d;
        }
        qph qphVar = new qph(string, string2, valueOf, B, string3, u, map, list, sharedPreferences5.getString("PREF_HOME_SCREEN", null));
        bga bgaVar = vga.a;
        p5c p5cVar = bgaVar.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Serializable.class);
        p5cVar.getClass();
        orCreateKotlinClass.getClass();
        KSerializer g = p5cVar.g(orCreateKotlinClass, km5.a);
        if (g == null) {
            g = new a0f(orCreateKotlinClass);
        }
        byte[] bytes = bgaVar.c(g, qphVar).getBytes(Charsets.UTF_8);
        bytes.getClass();
        if (backupDataOutput != null) {
            backupDataOutput.writeEntityHeader("USER_PREFERENCES", bytes.length);
            backupDataOutput.writeEntityData(bytes, bytes.length);
        }
    }

    @Override // android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        SharedPreferences d;
        SharedPreferences d2;
        SharedPreferences d3;
        SharedPreferences d4;
        SharedPreferences d5;
        SharedPreferences d6;
        if (backupDataInput != null) {
            while (backupDataInput.readNextHeader()) {
                if (Intrinsics.c(backupDataInput.getKey(), "USER_PREFERENCES")) {
                    byte[] bArr = new byte[backupDataInput.getDataSize()];
                    int i2 = 0;
                    backupDataInput.readEntityData(bArr, 0, backupDataInput.getDataSize());
                    bga bgaVar = vga.a;
                    String str = new String(bArr, Charsets.UTF_8);
                    p5c p5cVar = bgaVar.b;
                    KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(qph.class);
                    p5cVar.getClass();
                    orCreateKotlinClass.getClass();
                    KSerializer g = p5cVar.g(orCreateKotlinClass, km5.a);
                    if (g == null) {
                        throw new v5h(s9a.E(orCreateKotlinClass));
                    }
                    qph qphVar = (qph) ((Serializable) bgaVar.b(g, str));
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        synchronized (uic.i) {
                            d6 = a5f.d(applicationContext2);
                            uic.j = d6;
                        }
                        d6.getClass();
                        sharedPreferences = d6;
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.getClass();
                    edit.putString("PREF_THEME", qphVar.a);
                    Unit unit = Unit.a;
                    edit.apply();
                    Context applicationContext3 = getApplicationContext();
                    applicationContext3.getClass();
                    SharedPreferences sharedPreferences2 = uic.j;
                    if (sharedPreferences2 == null) {
                        Context applicationContext4 = applicationContext3.getApplicationContext();
                        synchronized (uic.i) {
                            d5 = a5f.d(applicationContext4);
                            uic.j = d5;
                        }
                        d5.getClass();
                        sharedPreferences2 = d5;
                    }
                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                    edit2.getClass();
                    edit2.putString("STANDINGS_VIEW_MODE_v2", qphVar.b);
                    Unit unit2 = Unit.a;
                    edit2.apply();
                    Context applicationContext5 = getApplicationContext();
                    applicationContext5.getClass();
                    SharedPreferences sharedPreferences3 = uic.j;
                    if (sharedPreferences3 == null) {
                        Context applicationContext6 = applicationContext5.getApplicationContext();
                        synchronized (uic.i) {
                            d4 = a5f.d(applicationContext6);
                            uic.j = d4;
                        }
                        d4.getClass();
                        sharedPreferences3 = d4;
                    }
                    SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                    edit3.getClass();
                    edit3.putBoolean("LINEUPS_VIEW_MODE_LONG", qphVar.c.booleanValue());
                    Unit unit3 = Unit.a;
                    edit3.apply();
                    Map map = qphVar.g;
                    if (map != null) {
                        if (!map.isEmpty()) {
                            Collection values = map.values();
                            if (!(values instanceof Collection) || !values.isEmpty()) {
                                Iterator it = values.iterator();
                                while (it.hasNext()) {
                                    if (((Boolean) it.next()).booleanValue()) {
                                        break;
                                    }
                                }
                            }
                        }
                        map = null;
                        if (map != null) {
                            Context applicationContext7 = getApplicationContext();
                            applicationContext7.getClass();
                            n9e.u(applicationContext7, new pph(map, i2));
                        }
                    }
                    ((gzh) this.a.getValue()).getClass();
                    ArrayList l = oea.l(ke0.c, Sports.INSTANCE.getEntries());
                    List list = qphVar.h;
                    if (list != null) {
                        gzh gzhVar = (gzh) this.a.getValue();
                        ArrayList arrayList = new ArrayList(list);
                        gzhVar.getClass();
                        ArrayList arrayList2 = new ArrayList(l);
                        arrayList2.removeAll(arrayList);
                        arrayList.addAll(Math.min(arrayList.size(), 6), arrayList2);
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                break;
                            }
                            String str2 = (String) arrayList.get(i3);
                            if (l.contains(str2)) {
                                arrayList3.add(new DbSportOrder(str2, i3, i3 == 0));
                            }
                            i3++;
                        }
                        zyh zyhVar = gzhVar.a;
                        zyhVar.getClass();
                        gz8.S(zyhVar.a, false, true, new yyh(zyhVar, arrayList3, i2));
                    }
                    Context applicationContext8 = getApplicationContext();
                    applicationContext8.getClass();
                    String str3 = qphVar.d;
                    int hashCode = str3.hashCode();
                    if (hashCode == -2034720975 ? str3.equals("DECIMAL") : !(hashCode == -1009757152 ? !str3.equals("AMERICAN") : !(hashCode == 368001453 && str3.equals("FRACTIONAL")))) {
                        SharedPreferences sharedPreferences4 = uic.j;
                        if (sharedPreferences4 == null) {
                            Context applicationContext9 = applicationContext8.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences4 = a5f.d(applicationContext9);
                                uic.j = sharedPreferences4;
                            }
                            sharedPreferences4.getClass();
                        }
                        SharedPreferences.Editor edit4 = sharedPreferences4.edit();
                        edit4.getClass();
                        edit4.putString("PREF_ODDS", str3);
                        Unit unit4 = Unit.a;
                        edit4.apply();
                        SharedPreferences sharedPreferences5 = uic.j;
                        if (sharedPreferences5 == null) {
                            Context applicationContext10 = applicationContext8.getApplicationContext();
                            synchronized (uic.i) {
                                d3 = a5f.d(applicationContext10);
                                uic.j = d3;
                            }
                            d3.getClass();
                            sharedPreferences5 = d3;
                        }
                        wt3.v(sharedPreferences5, "PREF_ODDS_FIRST_TIME", false);
                    }
                    Set set = o84.a;
                    Context applicationContext11 = getApplicationContext();
                    applicationContext11.getClass();
                    String str4 = qphVar.e;
                    if (str4 != null) {
                        if (!o84.a.contains(str4)) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            SharedPreferences sharedPreferences6 = uic.j;
                            if (sharedPreferences6 == null) {
                                Context applicationContext12 = applicationContext11.getApplicationContext();
                                synchronized (uic.i) {
                                    sharedPreferences6 = a5f.d(applicationContext12);
                                    uic.j = sharedPreferences6;
                                }
                                sharedPreferences6.getClass();
                            }
                            SharedPreferences.Editor edit5 = sharedPreferences6.edit();
                            edit5.getClass();
                            edit5.putString("PREF_CURRENCY", str4);
                            Unit unit5 = Unit.a;
                            edit5.apply();
                            SharedPreferences sharedPreferences7 = uic.j;
                            if (sharedPreferences7 == null) {
                                Context applicationContext13 = applicationContext11.getApplicationContext();
                                synchronized (uic.i) {
                                    d2 = a5f.d(applicationContext13);
                                    uic.j = d2;
                                }
                                d2.getClass();
                                sharedPreferences7 = d2;
                            }
                            wt3.v(sharedPreferences7, "PREF_CURRENCY_FIRST_RUN", false);
                        }
                    }
                    Context applicationContext14 = getApplicationContext();
                    applicationContext14.getClass();
                    String str5 = qphVar.f;
                    if (str5 != null) {
                        String str6 = ph0.a0(new String[]{"METRIC", "IMPERIAL"}).contains(str5) ? str5 : null;
                        if (str6 != null) {
                            SharedPreferences sharedPreferences8 = uic.j;
                            if (sharedPreferences8 == null) {
                                Context applicationContext15 = applicationContext14.getApplicationContext();
                                synchronized (uic.i) {
                                    sharedPreferences8 = a5f.d(applicationContext15);
                                    uic.j = sharedPreferences8;
                                }
                                sharedPreferences8.getClass();
                            }
                            SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                            edit6.getClass();
                            edit6.putString("PREF_MEASUREMENT_UNITS", str6);
                            Unit unit6 = Unit.a;
                            edit6.apply();
                            v7a.G(applicationContext14);
                        }
                    }
                    Context applicationContext16 = getApplicationContext();
                    applicationContext16.getClass();
                    SharedPreferences sharedPreferences9 = uic.j;
                    if (sharedPreferences9 == null) {
                        Context applicationContext17 = applicationContext16.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext17);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences9 = d;
                    }
                    SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                    edit7.getClass();
                    edit7.putString("PREF_HOME_SCREEN", qphVar.i);
                    Unit unit7 = Unit.a;
                    edit7.apply();
                }
            }
        }
    }
}
