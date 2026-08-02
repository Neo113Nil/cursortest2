package com.reactnativecommunity.blurview;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ThemedReactContext;
import com.reactnativecommunity.blurview.b;

/* loaded from: classes4.dex */
public abstract class b {

    public class a extends Hg.c {

        /* renamed from: d, reason: collision with root package name */
        public boolean f41279d;

        /* renamed from: e, reason: collision with root package name */
        public int f41280e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ThemedReactContext f41281f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ThemedReactContext themedReactContext) {
            super(context);
            this.f41281f = themedReactContext;
            this.f41279d = false;
            this.f41280e = 0;
            j();
        }

        public final void i() {
            int i10;
            if (this.f41279d || (i10 = this.f41280e) >= 3) {
                return;
            }
            this.f41280e = i10 + 1;
            postDelayed(new Runnable() { // from class: com.reactnativecommunity.blurview.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.this.j();
                }
            }, 32L);
        }

        public final void j() {
            if (this.f41279d) {
                return;
            }
            Activity currentActivity = this.f41281f.getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed() || currentActivity.getWindow() == null) {
                Log.w("BlurView", "setupBlurIfPossible: activity not ready (null/finishing/destroyed/window-null), deferring");
                i();
                return;
            }
            View decorView = currentActivity.getWindow().getDecorView();
            View findViewById = decorView.findViewById(R.id.content);
            if (findViewById instanceof ViewGroup) {
                f((ViewGroup) findViewById).d(decorView.getBackground()).g(10.0f);
                this.f41279d = true;
            } else {
                Log.w("BlurView", "setupBlurIfPossible: content view missing or not ViewGroup, deferring");
                i();
            }
        }

        @Override // Hg.c, android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            j();
        }
    }

    public static Hg.c a(ThemedReactContext themedReactContext) {
        return new a(themedReactContext, themedReactContext);
    }

    public static void b(Hg.c cVar, boolean z10) {
        cVar.b(z10);
        cVar.invalidate();
    }

    public static void c(Hg.c cVar, boolean z10) {
        cVar.c(z10);
    }

    public static void d(Hg.c cVar, int i10) {
        cVar.e(i10);
        cVar.invalidate();
    }

    public static void e(Hg.c cVar, int i10) {
        cVar.d(i10);
        cVar.invalidate();
    }
}
