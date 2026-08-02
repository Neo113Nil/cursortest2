package com.pgl.ssdk;

import android.content.Context;
import android.content.Intent;
import com.ironsource.Y1;
import defpackage.fn0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class al {
    private static volatile al a;
    private Context b;
    private List<Integer> c = new ArrayList();

    private al(Context context) {
        this.b = null;
        this.b = context;
    }

    public void a() {
        int f = f();
        if (f == -1) {
            return;
        }
        this.c.add(Integer.valueOf(f));
        try {
            int size = this.c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.c.subList(size - 10, size));
                this.c.clear();
                this.c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }

    public int b() {
        Intent f = fn0.f("android.intent.action.BATTERY_CHANGED", this.b, null);
        if (f == null) {
            return 0;
        }
        return f.getIntExtra("plugged", 0);
    }

    public int c() {
        if (fn0.f("android.intent.action.BATTERY_CHANGED", this.b, null) == null) {
            return 0;
        }
        return Math.round(((r3.getIntExtra("level", 0) / r3.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized String d() {
        if (this.c.size() <= 0) {
            return Y1.f;
        }
        return String.valueOf(this.c.get(r0.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.c).toString();
    }

    public int f() {
        int c;
        int i = 0;
        try {
            synchronized (this) {
                i = b();
                c = c();
            }
            return (i * 10000) + c;
        } catch (Exception unused) {
            return i * 10000;
        }
    }

    public static al a(Context context) {
        if (a == null) {
            synchronized (al.class) {
                try {
                    if (a == null) {
                        a = new al(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }
}
