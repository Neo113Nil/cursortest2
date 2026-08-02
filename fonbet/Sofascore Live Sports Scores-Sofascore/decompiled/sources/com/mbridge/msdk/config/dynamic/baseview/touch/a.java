package com.mbridge.msdk.config.dynamic.baseview.touch;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private long g;
    private long h;
    private float i;
    private float j;
    private float k;
    private int l;
    private int m;
    private int n;
    private View o;
    private final List<C1238a> p = new ArrayList();
    private int q = 0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.config.dynamic.baseview.touch.a$a, reason: collision with other inner class name */
    public static class C1238a {
        public final int a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final int g;

        public C1238a(int i, float f, float f2, float f3, float f4, float f5, int i2) {
            this.a = i;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = f5;
            this.g = i2;
        }
    }

    private void a(HashMap<String, Object> hashMap) {
        hashMap.put("event_name", "touch");
        hashMap.put("event_time", String.valueOf(System.currentTimeMillis()));
        hashMap.put("down_time", String.valueOf(this.g));
    }

    private void b(HashMap<String, Object> hashMap) {
        ArrayList arrayList = new ArrayList();
        for (C1238a c1238a : this.p) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("x", String.valueOf(c1238a.b));
            hashMap2.put("y", String.valueOf(c1238a.c));
            hashMap2.put("pressure", String.valueOf(c1238a.d));
            hashMap2.put("size", String.valueOf(c1238a.e));
            hashMap2.put("id", Integer.valueOf(c1238a.a));
            arrayList.add(hashMap2);
        }
        hashMap.put("points", arrayList);
    }

    private void c(HashMap<String, Object> hashMap) {
        hashMap.put("down_x", Float.valueOf(this.a));
        hashMap.put("down_y", Float.valueOf(this.b));
        hashMap.put("down_time", Long.valueOf(this.g));
        hashMap.put("up_x", Float.valueOf(this.e));
        hashMap.put("up_y", Float.valueOf(this.f));
        hashMap.put("up_time", Long.valueOf(this.h));
    }

    private void d(HashMap<String, Object> hashMap) {
        View view = this.o;
        if (view != null) {
            hashMap.put("class_name", view.getClass().getSimpleName());
            String b = b(this.o);
            hashMap.put("resource_id", b);
            String a = a(this.o);
            hashMap.put("content_desc", a);
            StringBuilder s = mz1.s(this.o.getClass().getSimpleName(), "#", b, "(", a);
            s.append(")");
            hashMap.put("view_format", s.toString());
        }
    }

    private void g(MotionEvent motionEvent) {
        this.p.clear();
        if (Build.VERSION.SDK_INT < 29) {
            this.q = 1;
            this.p.add(new C1238a(motionEvent.getPointerId(0), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getOrientation(), motionEvent.getToolType(motionEvent.getActionIndex())));
        } else {
            this.q = motionEvent.getPointerCount();
            for (int i = 0; i < this.q; i++) {
                this.p.add(new C1238a(motionEvent.getPointerId(i), motionEvent.getRawX(i), motionEvent.getRawY(i), motionEvent.getPressure(i), motionEvent.getSize(i), motionEvent.getOrientation(i), motionEvent.getToolType(i)));
            }
        }
    }

    private void h(MotionEvent motionEvent) {
        this.i = motionEvent.getPressure();
        this.j = motionEvent.getSize();
        this.k = motionEvent.getOrientation();
        this.l = motionEvent.getToolType(motionEvent.getActionIndex());
    }

    public void e(MotionEvent motionEvent) {
        this.c = a(motionEvent);
        this.d = b(motionEvent);
        h(motionEvent);
        g(motionEvent);
    }

    public void f(MotionEvent motionEvent) {
        this.e = a(motionEvent);
        this.f = b(motionEvent);
        this.h = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        a(hashMap);
        b(hashMap);
        d(hashMap);
        c(hashMap);
        return hashMap;
    }

    private float a(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT >= 29) {
            return motionEvent.getRawX(motionEvent.getActionIndex());
        }
        return motionEvent.getRawX();
    }

    private String a(View view) {
        CharSequence contentDescription = view.getContentDescription();
        return contentDescription != null ? contentDescription.toString() : "";
    }

    public void c(View view) {
        this.o = view;
        this.m = view.getWidth();
        this.n = view.getHeight();
    }

    public void c(MotionEvent motionEvent) {
        g(motionEvent);
    }

    public void c() {
        this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.h = 0L;
        this.g = 0L;
        this.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.l = 0;
        this.n = 0;
        this.m = 0;
        this.o = null;
        this.q = 0;
        this.p.clear();
    }

    public void d(MotionEvent motionEvent) {
        this.a = a(motionEvent);
        this.b = b(motionEvent);
        this.g = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    private float b(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT >= 29) {
            return motionEvent.getRawY(motionEvent.getActionIndex());
        }
        return motionEvent.getRawY();
    }

    private String b(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Exception unused) {
                return String.valueOf(view.getId());
            }
        }
        return "";
    }

    public C1238a b() {
        if (this.p.isEmpty()) {
            return null;
        }
        return this.p.get(0);
    }
}
