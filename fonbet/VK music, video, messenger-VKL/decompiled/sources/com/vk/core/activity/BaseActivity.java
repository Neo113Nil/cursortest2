package com.vk.core.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import java.lang.reflect.Field;
import xsna.ezi;
import xsna.klk0;
import xsna.ndp0;
import xsna.o90;
import xsna.s3q0;

/* compiled from: BaseActivity.kt */
/* loaded from: classes.dex */
public class BaseActivity extends AppCompatActivity {
    public Exception f;

    /* compiled from: BaseActivity.kt */
    /* loaded from: classes17.dex */
    public static final class a extends IllegalArgumentException {
        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Trace.beginSection(ndp0.f("BaseActivity.applyOverrideConfiguration"));
        try {
            super.applyOverrideConfiguration(ezi.a(this, configuration));
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Trace.beginSection(ndp0.f("BaseActivity.attachBaseContext"));
        try {
            super.attachBaseContext(ezi.b(context));
            klk0.a(this);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Trace.beginSection(ndp0.f("BaseActivity.onConfigurationChanged"));
        try {
            Configuration a2 = ezi.a(this, configuration);
            super.onConfigurationChanged(a2);
            O1(a2);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Trace.beginSection(ndp0.f("BaseActivity.onRestoreInstanceState"));
        try {
            try {
                super.onRestoreInstanceState(bundle);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw new a("Can_t_restore_state:".concat(o90.c(this)), th);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Trace.beginSection(ndp0.f("BaseActivity.onResume"));
        try {
            try {
                super.onResume();
            } catch (IllegalArgumentException e) {
                if (Build.VERSION.SDK_INT >= 29) {
                    throw e;
                }
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    Boolean bool = Boolean.TRUE;
                    declaredField.set(this, bool);
                    Field declaredField2 = FragmentActivity.class.getDeclaredField("mResumed");
                    declaredField2.setAccessible(true);
                    declaredField2.set(this, bool);
                } catch (Throwable th) {
                    th.initCause(e);
                    throw th;
                }
            }
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setIntent(Intent intent) {
        super.setIntent(intent);
        this.f = intent == null ? new Exception("Set null intent") : null;
    }

    public void O1(Configuration configuration) {
    }
}
