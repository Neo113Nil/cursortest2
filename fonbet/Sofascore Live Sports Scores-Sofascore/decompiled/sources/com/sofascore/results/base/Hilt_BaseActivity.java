package com.sofascore.results.base;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.ab0;
import defpackage.fjg;
import defpackage.fz8;
import defpackage.gc4;
import defpackage.loa;
import defpackage.p1f;
import defpackage.qtk;
import defpackage.r01;
import defpackage.su4;
import defpackage.vv8;
import defpackage.z41;
import defpackage.za9;
import defpackage.zc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class Hilt_BaseActivity extends AppCompatActivity implements vv8 {
    public volatile zc i;
    public final Object j = new Object();
    public boolean k = false;

    public Hilt_BaseActivity() {
        addOnContextAvailableListener(new ab0(this, 2));
    }

    @Override // defpackage.uv8
    public final Object f() {
        return p().f();
    }

    @Override // androidx.activity.ComponentActivity, defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        qtk defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        gc4 gc4Var = (gc4) ((su4) fz8.Q(su4.class, this));
        loa a = gc4Var.a();
        z41 z41Var = new z41(21, gc4Var.a, gc4Var.b);
        defaultViewModelProviderFactory.getClass();
        return new za9(a, defaultViewModelProviderFactory, z41Var);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p().b();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fjg fjgVar = p().e;
        if (fjgVar != null) {
            fjgVar.b = null;
        }
    }

    public final zc p() {
        if (this.i == null) {
            synchronized (this.j) {
                try {
                    if (this.i == null) {
                        this.i = new zc(this);
                    }
                } finally {
                }
            }
        }
        return this.i;
    }

    public void q() {
        if (this.k) {
            return;
        }
        this.k = true;
        ((BaseActivity) this).B = (p1f) ((gc4) ((r01) f())).a.M0.get();
    }
}
