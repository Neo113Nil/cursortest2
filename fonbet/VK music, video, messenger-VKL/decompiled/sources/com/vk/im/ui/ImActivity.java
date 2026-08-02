package com.vk.im.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.navigation.ImBottomNavigationComponent;
import com.vk.navigation.ImBottomNavigationComponent$Companion$STUB$1;
import com.vk.navigation.ImNavigationDelegateActivity;
import io.reactivex.rxjava3.disposables.b;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.aeg0;
import xsna.fpf0;
import xsna.m7m;
import xsna.ndp0;
import xsna.s3q0;
import xsna.tb0;
import xsna.ttp0;
import xsna.ww50;

/* compiled from: ImActivity.kt */
/* loaded from: classes2.dex */
public class ImActivity extends ImNavigationDelegateActivity implements aeg0 {
    public final ArrayList o = new ArrayList();
    public final b p = new b();

    @Override // xsna.aeg0
    public final void Li(tb0 tb0Var) {
        this.o.add(tb0Var);
    }

    @Override // com.vk.navigation.ImNavigationDelegateActivity
    public final void R1() {
        Trace.beginSection(ndp0.f("ImActivity.createNavigationDelegate"));
        try {
            ImBottomNavigationComponent$Companion$STUB$1.a kc = ((ImBottomNavigationComponent) m7m.a(this).mo408a(fpf0.a(ImBottomNavigationComponent.class))).kc();
            getIntent().getBooleanExtra("key_top_level", false);
            kc.getClass();
            throw new IllegalStateException("ImBottomNavigationComponent is not expected anywhere except VK Me & Calls.");
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // com.vk.navigation.ImNavigationDelegateActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
        if (ww50Var == null) {
            ww50Var = null;
        }
        FragmentImpl u = ww50Var.u();
        if (u != null) {
            u.Un(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.vk.navigation.ImNavigationDelegateActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Trace.beginSection(ndp0.f("ImActivity.onActivityResult"));
        try {
            super.onActivityResult(i, i2, intent);
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((tb0) it.next()).onActivityResult(i, i2, intent);
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // com.vk.navigation.ImNavigationDelegateActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Trace.beginSection(ndp0.f("ImActivity.onCreate"));
        try {
            super.onCreate(bundle);
            throw null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // com.vk.navigation.ImNavigationDelegateActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Trace.beginSection(ndp0.f("ImActivity.onDestroy"));
        try {
            super.onDestroy();
            this.p.dispose();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.aeg0
    public final void yk(tb0 tb0Var) {
        ttp0.a(this.o).remove(tb0Var);
    }
}
