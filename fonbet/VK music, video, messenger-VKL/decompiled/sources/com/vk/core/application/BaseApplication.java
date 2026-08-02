package com.vk.core.application;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Trace;
import xsna.ezi;
import xsna.klk0;
import xsna.ndp0;
import xsna.s3q0;

/* compiled from: BaseApplication.kt */
/* loaded from: classes.dex */
public class BaseApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Trace.beginSection(ndp0.f("BaseApplication.attachBaseContext"));
        try {
            super.attachBaseContext(ezi.b(context));
            klk0.d(this, false);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Trace.beginSection(ndp0.f("BaseApplication.onConfigurationChanged"));
        try {
            super.onConfigurationChanged(ezi.a(this, configuration));
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }
}
