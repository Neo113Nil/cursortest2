package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzghq {
    public long a;
    public long b;
    public long c;
    public long d;
    public double e;
    public double f;
    public double g;
    public float h;
    public float i;
    public float j;
    public float k;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a++;
            this.g = 0.0d;
            this.e = motionEvent.getRawX();
            this.f = motionEvent.getRawY();
            this.h = motionEvent.getX();
            this.i = motionEvent.getY();
            this.j = motionEvent.getRawX();
            this.k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.c++;
            this.g = Math.hypot(motionEvent.getRawX() - this.e, motionEvent.getRawY() - this.f) + this.g;
            this.e = motionEvent.getRawX();
            this.f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.d++;
            return;
        }
        this.b += motionEvent.getHistorySize() + 1;
        this.g = Math.hypot(motionEvent.getRawX() - this.e, motionEvent.getRawY() - this.f) + this.g;
        this.e = motionEvent.getRawX();
        this.f = motionEvent.getRawY();
    }
}
