package com.inmobi.media;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import defpackage.joa;
import defpackage.lnb;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Bc {
    public final GestureDetectorOnGestureListenerC3889xi a;
    public final String b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public int h;
    public float i;
    public JSONArray j;
    public MotionEvent k;
    public int l;

    public Bc(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        this.a = gestureDetectorOnGestureListenerC3889xi;
        this.b = "Bc";
        this.l = Integer.MAX_VALUE;
        this.g = -1;
        this.h = -1;
    }

    public final void a(MotionEvent motionEvent) {
        float f;
        float f2;
        float f3;
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.b.getClass();
            motionEvent.toString();
            this.g = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.j = new JSONArray();
            JSONArray jSONArray = new JSONArray((Collection) kotlin.collections.b.j(Integer.valueOf(N3.c(motionEvent.getX())), Integer.valueOf(N3.c(motionEvent.getY()))));
            JSONArray jSONArray2 = this.j;
            if (jSONArray2 != null) {
                jSONArray2.put(jSONArray);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            this.b.getClass();
            motionEvent.toString();
            this.g = -1;
            JSONArray jSONArray3 = this.j;
            if (jSONArray3 == null || jSONArray3.length() <= 5) {
                return;
            }
            this.a.a(this);
            this.j = new JSONArray();
            return;
        }
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (actionMasked == 2) {
            JSONArray jSONArray4 = this.j;
            int i = this.g;
            if (i == -1 || this.h == -1) {
                if (i == -1 || jSONArray4 == null || jSONArray4.length() <= 0 || jSONArray4.length() >= 50) {
                    return;
                }
                try {
                    int c = N3.c(motionEvent.getX());
                    int c2 = N3.c(motionEvent.getY());
                    JSONArray jSONArray5 = jSONArray4.getJSONArray(jSONArray4.length() - 1);
                    JSONArray jSONArray6 = new JSONArray((Collection) kotlin.collections.b.j(Integer.valueOf(c), Integer.valueOf(c2)));
                    float f5 = jSONArray5.getInt(0) - jSONArray6.getInt(0);
                    float f6 = jSONArray5.getInt(1) - jSONArray6.getInt(1);
                    if (((int) Math.sqrt((f6 * f6) + (f5 * f5))) > 100) {
                        jSONArray4.put(jSONArray6);
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            int findPointerIndex = motionEvent.findPointerIndex(i);
            int findPointerIndex2 = motionEvent.findPointerIndex(this.h);
            if (findPointerIndex >= 0) {
                f2 = motionEvent.getX(findPointerIndex);
                f = motionEvent.getY(findPointerIndex);
            } else {
                joa joaVar = AbstractC3286aa.a;
                int i2 = this.g;
                int pointerCount = motionEvent.getPointerCount();
                StringBuilder s = lnb.s(i2, findPointerIndex, "Index for mPtrID1=", " is ", " | Pointer count=");
                s.append(pointerCount);
                AbstractC3286aa.a(new Q2(new IllegalArgumentException(s.toString())));
                f = 0.0f;
                f2 = 0.0f;
            }
            if (findPointerIndex2 >= 0) {
                float x = motionEvent.getX(findPointerIndex2);
                f4 = motionEvent.getY(findPointerIndex2);
                f3 = x;
            } else {
                joa joaVar2 = AbstractC3286aa.a;
                int i3 = this.h;
                int pointerCount2 = motionEvent.getPointerCount();
                StringBuilder s2 = lnb.s(i3, findPointerIndex2, "Index for mPtrID1=", " is ", " | Pointer count=");
                s2.append(pointerCount2);
                AbstractC3286aa.a(new Q2(new IllegalArgumentException(s2.toString())));
                f3 = 0.0f;
            }
            float f7 = this.c;
            float degrees = ((float) Math.toDegrees(((float) Math.atan2(this.d - this.f, f7 - this.e)) - ((float) Math.atan2(f4 - f, f3 - f2)))) % 360.0f;
            if (degrees < -180.0f) {
                degrees += 360.0f;
            }
            if (degrees > 180.0f) {
                degrees -= 360.0f;
            }
            this.i = Math.abs(degrees);
            return;
        }
        if (actionMasked == 3) {
            this.b.getClass();
            motionEvent.toString();
            this.g = -1;
            this.h = -1;
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            this.b.getClass();
            motionEvent.toString();
            this.h = -1;
            if (this.i > 30.0f) {
                MotionEvent motionEvent2 = this.k;
                if (motionEvent2 != null) {
                    this.a.b(this, motionEvent2, motionEvent);
                }
                this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float x2 = motionEvent.getX() - motionEvent.getX(1);
            float y = motionEvent.getY() - motionEvent.getY(1);
            if (Math.abs(((int) Math.sqrt((y * y) + (x2 * x2))) - this.l) > 500) {
                MotionEvent motionEvent3 = this.k;
                if (motionEvent3 != null) {
                    this.a.a(this, motionEvent3, motionEvent);
                }
                this.l = Integer.MAX_VALUE;
                return;
            }
            return;
        }
        this.b.getClass();
        motionEvent.toString();
        this.h = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.k = MotionEvent.obtain(motionEvent);
        int findPointerIndex3 = motionEvent.findPointerIndex(this.g);
        int findPointerIndex4 = motionEvent.findPointerIndex(this.h);
        if (findPointerIndex3 >= 0) {
            this.e = motionEvent.getX(findPointerIndex3);
            this.f = motionEvent.getY(findPointerIndex3);
        } else {
            joa joaVar3 = AbstractC3286aa.a;
            int i4 = this.g;
            int pointerCount3 = motionEvent.getPointerCount();
            StringBuilder s3 = lnb.s(i4, findPointerIndex3, "Index for mPtrID1=", " is ", " | Pointer count=");
            s3.append(pointerCount3);
            AbstractC3286aa.a(new Q2(new IllegalArgumentException(s3.toString())));
        }
        if (findPointerIndex4 >= 0) {
            this.c = motionEvent.getX(findPointerIndex4);
            this.d = motionEvent.getY(findPointerIndex4);
        } else {
            joa joaVar4 = AbstractC3286aa.a;
            int i5 = this.h;
            int pointerCount4 = motionEvent.getPointerCount();
            StringBuilder s4 = lnb.s(i5, findPointerIndex4, "Index for mPtrID2=", " is ", " | Pointer count=");
            s4.append(pointerCount4);
            AbstractC3286aa.a(new Q2(new IllegalArgumentException(s4.toString())));
        }
        float f8 = this.e - this.c;
        float f9 = this.f - this.d;
        this.l = (int) Math.sqrt((f9 * f9) + (f8 * f8));
    }
}
