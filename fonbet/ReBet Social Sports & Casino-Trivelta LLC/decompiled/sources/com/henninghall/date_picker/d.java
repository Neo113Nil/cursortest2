package com.henninghall.date_picker;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final n f38478a;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$henninghall$date_picker$models$Mode;

        static {
            int[] iArr = new int[Rb.b.values().length];
            $SwitchMap$com$henninghall$date_picker$models$Mode = iArr;
            try {
                iArr[Rb.b.datetime.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$henninghall$date_picker$models$Mode[Rb.b.time.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$henninghall$date_picker$models$Mode[Rb.b.date.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(n nVar) {
        this.f38478a = nVar;
    }

    public String a() {
        Calendar t10 = this.f38478a.t();
        return t10 != null ? o.b(t10) : this.f38478a.s();
    }

    public ArrayList b() {
        ArrayList c10 = c();
        ArrayList e10 = e();
        ArrayList arrayList = new ArrayList();
        Iterator it = c10.iterator();
        while (it.hasNext()) {
            Rb.c cVar = (Rb.c) it.next();
            if (e10.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public final ArrayList c() {
        String replaceAll = h.c(this.f38478a.u()).replaceAll("\\('(.+?)'\\)", "\\${$1}").replaceAll("'.+?'", "").replaceAll("\\$\\{(.+?)\\}", "('$1')");
        ArrayList arrayList = new ArrayList(Arrays.asList(Rb.c.values()));
        ArrayList arrayList2 = new ArrayList();
        Rb.c cVar = Rb.c.DAY;
        arrayList.remove(cVar);
        arrayList2.add(cVar);
        for (char c10 : replaceAll.toCharArray()) {
            try {
                Rb.c h10 = o.h(c10);
                if (arrayList.contains(h10)) {
                    arrayList.remove(h10);
                    arrayList2.add(h10);
                }
            } catch (Exception unused) {
            }
        }
        Rb.c cVar2 = Rb.c.AM_PM;
        if (arrayList.contains(cVar2)) {
            arrayList.remove(cVar2);
            arrayList2.add(cVar2);
        }
        if (!arrayList.isEmpty()) {
            Log.e(NativeRNDatePickerSpec.NAME, arrayList.size() + " wheel types cannot be ordered. Wheel type 0: " + arrayList.get(0));
        }
        return arrayList2;
    }

    public int d() {
        return l.f38581a;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Rb.b z10 = this.f38478a.z();
        int i10 = a.$SwitchMap$com$henninghall$date_picker$models$Mode[z10.ordinal()];
        if (i10 == 1) {
            arrayList.add(Rb.c.DAY);
            arrayList.add(Rb.c.HOUR);
            arrayList.add(Rb.c.MINUTE);
        } else if (i10 == 2) {
            arrayList.add(Rb.c.HOUR);
            arrayList.add(Rb.c.MINUTE);
        } else if (i10 == 3) {
            arrayList.add(Rb.c.YEAR);
            arrayList.add(Rb.c.MONTH);
            arrayList.add(Rb.c.DATE);
        }
        if ((z10 == Rb.b.time || z10 == Rb.b.datetime) && this.f38478a.f38606o.g()) {
            arrayList.add(Rb.c.AM_PM);
        }
        return arrayList;
    }

    public boolean f() {
        return this.f38478a.z() == Rb.b.time && !g();
    }

    public boolean g() {
        return this.f38478a.r() == Rb.a.locale ? h.h(this.f38478a.u()) : o.c();
    }
}
