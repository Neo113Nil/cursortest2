package com.vk.clips.viewer.impl.feed.item.clip.activities;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.vk.clips.viewer.impl.feed.item.clip.activities.ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: ClipsActivitiesTouchHandler.kt */
/* loaded from: classes17.dex */
public final class a {
    public final float a;
    public final float b;
    public final FunctionReferenceImpl c;
    public final LinkedHashSet d = new LinkedHashSet();

    /* compiled from: ClipsActivitiesTouchHandler.kt */
    /* renamed from: com.vk.clips.viewer.impl.feed.item.clip.activities.a$a, reason: collision with other inner class name */
    public static final class ViewOnTouchListenerC0706a implements View.OnTouchListener {
        public final float b;
        public final float c;
        public final FunctionReferenceImpl d;
        public final int e;
        public float f;
        public float g;
        public float h;
        public float i;
        public boolean j;
        public boolean k;
        public boolean l;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewOnTouchListenerC0706a(View view, float f, float f2, wzs<? super View, ? super b, s3q0> wzsVar) {
            this.b = f;
            this.c = f2;
            this.d = (FunctionReferenceImpl) wzsVar;
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        }

        public final boolean a(View view) {
            return Math.abs(view.getTranslationX()) >= ((float) view.getWidth()) * this.b || Math.abs(view.getTranslationY()) >= ((float) view.getWidth()) * this.c;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            ?? r1 = this.d;
            if (actionMasked == 0) {
                this.f = view.getTranslationX();
                this.g = view.getTranslationY();
                this.h = motionEvent.getRawX();
                this.i = motionEvent.getRawY();
                this.j = true;
                this.k = false;
                this.l = false;
                r1.invoke(view, b.C0708b.a);
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3 && this.j) {
                        this.j = false;
                        if (this.k) {
                            r1.invoke(view, new ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished(ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished.DragResult.RETURNED));
                            return true;
                        }
                        return true;
                    }
                } else if (this.j) {
                    float rawX = motionEvent.getRawX() - this.h;
                    float rawY = motionEvent.getRawY() - this.i;
                    float hypot = (float) Math.hypot(rawX, rawY);
                    if (!this.k && hypot > this.e) {
                        this.k = true;
                        r1.invoke(view, com.vk.clips.viewer.impl.feed.item.clip.activities.b.a);
                    }
                    if (this.k) {
                        view.setTranslationX(this.f + rawX);
                        view.setTranslationY(this.g + rawY);
                        if (!this.l && a(view)) {
                            this.l = true;
                            r1.invoke(view, c.a);
                        }
                    }
                    return true;
                }
            } else if (this.j) {
                this.j = false;
                if (this.k) {
                    r1.invoke(view, new ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished(a(view) ? ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished.DragResult.DISMISSED : ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished.DragResult.RETURNED));
                    return true;
                }
                r1.invoke(view, b.C0707a.a);
                return true;
            }
            return false;
        }
    }

    /* compiled from: ClipsActivitiesTouchHandler.kt */
    public interface b {

        /* compiled from: ClipsActivitiesTouchHandler.kt */
        /* renamed from: com.vk.clips.viewer.impl.feed.item.clip.activities.a$b$a, reason: collision with other inner class name */
        public static final class C0707a implements b {
            public static final C0707a a = new C0707a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0707a);
            }

            public final int hashCode() {
                return 1689543807;
            }

            public final String toString() {
                return "Click";
            }
        }

        /* compiled from: ClipsActivitiesTouchHandler.kt */
        /* renamed from: com.vk.clips.viewer.impl.feed.item.clip.activities.a$b$b, reason: collision with other inner class name */
        public static final class C0708b implements b {
            public static final C0708b a = new C0708b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0708b);
            }

            public final int hashCode() {
                return -1746580789;
            }

            public final String toString() {
                return "Down";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(float f, float f2, wzs<? super View, ? super b, s3q0> wzsVar) {
        this.a = f;
        this.b = f2;
        this.c = (FunctionReferenceImpl) wzsVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    public final void a(View view) {
        Integer valueOf = Integer.valueOf(view.getId());
        LinkedHashSet linkedHashSet = this.d;
        if (linkedHashSet.contains(valueOf)) {
            return;
        }
        linkedHashSet.add(Integer.valueOf(view.getId()));
        view.setOnTouchListener(new ViewOnTouchListenerC0706a(view, this.a, this.b, this.c));
    }
}
