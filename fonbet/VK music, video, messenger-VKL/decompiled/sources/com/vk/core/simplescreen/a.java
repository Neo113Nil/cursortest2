package com.vk.core.simplescreen;

import android.app.Activity;
import android.app.Dialog;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.vk.core.simplescreen.ScreenContainer;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.em6;

/* compiled from: WindowScreenContainer.java */
/* loaded from: classes17.dex */
public final class a extends Dialog implements ScreenContainer.a {
    public final ScreenContainer b;

    public a(@NonNull Activity activity, boolean z, boolean z2) {
        super(activity, R.style.FullScreenDialogDialog);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.windowAnimations = R.style.PickerDialogNoAnimation;
        layoutParams.softInputMode = 48;
        getWindow().setAttributes(layoutParams);
        if (activity.getResources().getBoolean(R.bool.picker_transparent_status_bar)) {
            getWindow().addFlags(67108864);
        }
        setContentView(LayoutInflater.from(z2 ? new ContextThemeWrapper(activity, dhr0.a.v()) : activity).inflate(R.layout.picker_layout_window_screen_container, (ViewGroup) null));
        ScreenContainer screenContainer = (ScreenContainer) findViewById(R.id.sc_container);
        this.b = screenContainer;
        screenContainer.setOnDismissListener(this);
        final View findViewById = findViewById(R.id.view_top_padding);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.yrx0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ScreenContainer screenContainer2 = com.vk.core.simplescreen.a.this.b;
                int paddingTop = findViewById.getPaddingTop();
                screenContainer2.b = paddingTop;
                if (screenContainer2.getCurrentScreen() != null) {
                    screenContainer2.getCurrentScreen().k(paddingTop);
                }
            }
        });
        if (z) {
            return;
        }
        if (!z2) {
            dhr0.s0(getWindow());
            return;
        }
        int color = activity.getColor(R.color.vk_black);
        getWindow().addFlags(2);
        dhr0.t0(getWindow(), color);
    }

    public final void a() {
        this.b.a();
    }

    public final void b(em6 em6Var) {
        this.b.d(em6Var);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.b.b()) {
            return;
        }
        super.dismiss();
    }

    @Override // com.vk.core.simplescreen.ScreenContainer.a
    public final void onDismiss() {
        super.dismiss();
    }
}
