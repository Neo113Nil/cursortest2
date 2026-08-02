package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.C2195u;
import androidx.lifecycle.InterfaceC2193s;
import androidx.lifecycle.X;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class q extends Dialog implements InterfaceC2193s, H, B2.g {

    /* renamed from: a, reason: collision with root package name */
    public C2195u f16415a;

    /* renamed from: b, reason: collision with root package name */
    public final B2.f f16416b;

    /* renamed from: c, reason: collision with root package name */
    public final OnBackPressedDispatcher f16417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16416b = B2.f.f613c.b(this);
        this.f16417c = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.p
            @Override // java.lang.Runnable
            public final void run() {
                q.d(q.this);
            }
        });
    }

    public static final void d(q qVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final C2195u b() {
        C2195u c2195u = this.f16415a;
        if (c2195u != null) {
            return c2195u;
        }
        C2195u c2195u2 = new C2195u(this);
        this.f16415a = c2195u2;
        return c2195u2;
    }

    public void c() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        X.b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        L.a(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        B2.k.a(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC2193s
    public AbstractC2185j getLifecycle() {
        return b();
    }

    @Override // androidx.activity.H
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f16417c;
    }

    @Override // B2.g
    public androidx.savedstate.a getSavedStateRegistry() {
        return this.f16416b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f16417c.l();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f16417c;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.o(onBackInvokedDispatcher);
        }
        this.f16416b.d(bundle);
        b().i(AbstractC2185j.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f16416b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().i(AbstractC2185j.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().i(AbstractC2185j.a.ON_DESTROY);
        this.f16415a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
