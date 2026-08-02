package com.my.target.common;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.MyTargetActivity;
import xsna.gzy0;
import xsna.krw;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class MyTargetActivity extends Activity {

    @Nullable
    public static a f;
    public a b;
    public FrameLayout c;
    public b d;
    public WindowInsetsController e;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void a();

        void c();

        boolean d();

        void g(@NonNull MyTargetActivity myTargetActivity, @NonNull Intent intent, @NonNull FrameLayout frameLayout);

        void i(@NonNull MyTargetActivity myTargetActivity);

        void l();

        void m();
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public final class b extends FrameLayout {
        public final View b;
        public final View c;
        public final View d;
        public final View e;

        public b(MyTargetActivity myTargetActivity) {
            super(myTargetActivity, null, 0, 0);
            this.b = new View(getContext());
            this.c = new View(getContext());
            this.d = new View(getContext());
            this.e = new View(getContext());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowInsetsController insetsController;
        super.onAttachedToWindow();
        if (this.b != null) {
            if (getApplicationInfo().targetSdkVersion >= 35 && Build.VERSION.SDK_INT >= 35) {
                getWindow().setNavigationBarContrastEnforced(false);
                insetsController = getWindow().getInsetsController();
                this.e = insetsController;
                b bVar = this.d;
                if (bVar != null) {
                    int argb = Color.argb(204, Color.red(-16777216), Color.green(-16777216), Color.blue(-16777216));
                    bVar.b.setBackground(new ColorDrawable(argb));
                    bVar.e.setBackground(new ColorDrawable(argb));
                    bVar.c.setBackground(new ColorDrawable(argb));
                    bVar.d.setBackground(new ColorDrawable(argb));
                    MyTargetActivity myTargetActivity = MyTargetActivity.this;
                    if (myTargetActivity.e != null) {
                        float red = Color.red(argb);
                        float green = Color.green(argb);
                        float blue = Color.blue(argb);
                        if (16256.25f < (blue * blue * 0.114f) + (green * green * 0.587f) + (red * red * 0.299f)) {
                            myTargetActivity.e.setSystemBarsAppearance(8, 8);
                            myTargetActivity.e.setSystemBarsAppearance(16, 16);
                        } else {
                            myTargetActivity.e.setSystemBarsAppearance(0, 8);
                            myTargetActivity.e.setSystemBarsAppearance(0, 16);
                        }
                    }
                }
            }
            this.b.i(this);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a aVar = this.b;
        if (aVar == null || aVar.d()) {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [xsna.ap50] */
    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        Intent intent = getIntent();
        a aVar = f;
        this.b = aVar;
        f = null;
        if (aVar == null || intent == null) {
            finish();
            return;
        }
        this.c = new FrameLayout(this);
        if (getApplicationInfo().targetSdkVersion >= 35 && Build.VERSION.SDK_INT >= 35) {
            b bVar = new b(this);
            this.d = bVar;
            View view = this.c;
            bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = 0;
            layoutParams.topMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = 0;
            view.setLayoutParams(layoutParams);
            bVar.addView(view);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 48);
            layoutParams2.height = 0;
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            View view2 = bVar.b;
            view2.setLayoutParams(layoutParams2);
            bVar.addView(view2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -1, 5);
            layoutParams3.width = 0;
            View view3 = bVar.c;
            view3.setLayoutParams(layoutParams3);
            bVar.addView(view3);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2, 80);
            layoutParams4.height = 0;
            layoutParams4.leftMargin = 0;
            layoutParams4.rightMargin = 0;
            View view4 = bVar.d;
            view4.setLayoutParams(layoutParams4);
            bVar.addView(view4);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -1, 3);
            layoutParams5.width = 0;
            View view5 = bVar.e;
            view5.setLayoutParams(layoutParams5);
            bVar.addView(view5);
            bVar.setOnApplyWindowInsetsListener(new gzy0(new krw(bVar, view)));
        }
        this.b.g(this, intent, this.c);
        View view6 = this.d;
        if (view6 == null) {
            view6 = this.c;
        }
        setContentView(view6);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, new OnBackInvokedCallback() { // from class: xsna.ap50
                public final void onBackInvoked() {
                    MyTargetActivity myTargetActivity = MyTargetActivity.this;
                    MyTargetActivity.a aVar2 = myTargetActivity.b;
                    if (aVar2 == null || aVar2.d()) {
                        myTargetActivity.finish();
                    }
                }
            });
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.b;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.e = null;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        a aVar = this.b;
        if (aVar != null) {
            aVar.m();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        a aVar = this.b;
        if (aVar != null) {
            aVar.c();
        }
    }
}
