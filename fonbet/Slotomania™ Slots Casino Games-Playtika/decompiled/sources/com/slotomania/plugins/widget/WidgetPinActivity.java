package com.slotomania.plugins.widget;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes8.dex */
public class WidgetPinActivity extends Activity {
    private boolean dialogLaunched = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 26) {
            AppWidgetManager.getInstance(this).requestPinAppWidget(new ComponentName(this, (Class<?>) SlotomaniaWidgetProvider.class), null, null);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.dialogLaunched = true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.dialogLaunched) {
            finish();
        }
    }
}
