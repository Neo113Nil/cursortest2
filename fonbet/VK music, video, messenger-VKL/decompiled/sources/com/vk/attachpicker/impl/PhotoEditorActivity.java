package com.vk.attachpicker.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ironsource.X3;
import com.vk.core.simplescreen.ScreenContainer;
import com.vk.pushes.PushAwareActivity;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import xsna.em6;
import xsna.j34;
import xsna.mhy;
import xsna.rwi;
import xsna.xy9;

/* loaded from: classes15.dex */
public class PhotoEditorActivity extends PushAwareActivity implements ScreenContainer.a, j34 {
    public boolean v;
    public ScreenContainer w;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View b;

        public a(View view) {
            this.b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ScreenContainer screenContainer = PhotoEditorActivity.this.w;
            int paddingTop = this.b.getPaddingTop();
            screenContainer.b = paddingTop;
            if (screenContainer.getCurrentScreen() != null) {
                screenContainer.getCurrentScreen().k(paddingTop);
            }
        }
    }

    @Override // xsna.j34
    public final void V2(Intent intent) {
        if (intent == null) {
            setResult(0);
            finish();
        } else {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        ScreenContainer screenContainer = this.w;
        if (screenContainer != null) {
            screenContainer.getCurrentScreen().f(i, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.w.b()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mhy.h(this);
        this.v = getIntent().getBooleanExtra("force_thumb", false);
        setContentView(R.layout.picker_layout_window_screen_container);
        ScreenContainer screenContainer = (ScreenContainer) findViewById(R.id.sc_container);
        this.w = screenContainer;
        screenContainer.setOnDismissListener(this);
        View findViewById = findViewById(R.id.view_top_padding);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new a(findViewById));
        File file = (File) getIntent().getSerializableExtra(X3.i.b);
        if (file == null) {
            finish();
        } else {
            this.w.d(rwi.d().h().c(this, file, this.v));
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ScreenContainer screenContainer = this.w;
        ArrayList<em6> arrayList = screenContainer.e;
        while (!arrayList.isEmpty()) {
            screenContainer.c((em6) xy9.b(1, arrayList));
        }
        screenContainer.c = null;
    }

    @Override // com.vk.core.simplescreen.ScreenContainer.a
    public final void onDismiss() {
        super.finish();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        em6 currentScreen = this.w.getCurrentScreen();
        if (currentScreen != null) {
            currentScreen.i();
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        em6 currentScreen = this.w.getCurrentScreen();
        if (currentScreen == null || currentScreen.d) {
            return;
        }
        currentScreen.j();
    }
}
