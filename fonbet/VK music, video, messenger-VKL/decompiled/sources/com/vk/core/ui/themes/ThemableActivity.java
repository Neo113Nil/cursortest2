package com.vk.core.ui.themes;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.core.activity.BaseActivity;
import com.vk.core.ui.themes.ThemableActivity;
import xsna.dhr0;
import xsna.e7b0;
import xsna.f7i;
import xsna.gdr0;
import xsna.gz80;
import xsna.lpj;
import xsna.ndp0;
import xsna.rok;
import xsna.s3q0;
import xsna.too0;
import xsna.vhr0;
import xsna.zzs;

/* compiled from: ThemableActivity.kt */
/* loaded from: classes.dex */
public class ThemableActivity extends BaseActivity implements too0 {
    public static final /* synthetic */ int k = 0;
    public gdr0 g;
    public lpj h;
    public final ThemableActivity i = this;
    public final f7i j = new f7i(this);

    @Override // xsna.too0
    public void Ng() {
        Trace.beginSection(ndp0.f("ThemableActivity.changeTheme"));
        try {
            this.j.a();
            lpj lpjVar = this.h;
            if (lpjVar != null) {
                e7b0.a(lpjVar);
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // com.vk.core.activity.BaseActivity
    public void O1(Configuration configuration) {
        Trace.beginSection(ndp0.f("ThemableActivity.onOverriddenConfigurationChanged"));
        try {
            dhr0.a.k(this);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    public boolean Q1() {
        return this instanceof PhotoVideoAttachActivity;
    }

    @Override // android.app.Activity
    public final LayoutInflater getLayoutInflater() {
        return (gdr0) getSystemService("layout_inflater");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        ThemableActivity themableActivity;
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.g == null) {
            if (Q1()) {
                lpj lpjVar = new lpj(this, dhr0.C().c);
                this.h = lpjVar;
                themableActivity = lpjVar;
            } else {
                themableActivity = this;
            }
            this.g = new gdr0(LayoutInflater.from(getBaseContext()), themableActivity);
        }
        gdr0 gdr0Var = this.g;
        if (gdr0Var == null) {
            return null;
        }
        return gdr0Var;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Trace.beginSection(ndp0.f("ThemableActivity.onCreate"));
        try {
            gdr0 gdr0Var = this.g;
            gdr0 gdr0Var2 = null;
            if (gdr0Var == null) {
                gdr0Var = null;
            }
            gdr0 gdr0Var3 = this.g;
            if (gdr0Var3 != null) {
                gdr0Var2 = gdr0Var3;
            }
            gdr0Var.setFactory2(new vhr0(gdr0Var2, new zzs() { // from class: xsna.uoo0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Context context = (Context) obj3;
                    int i = ThemableActivity.k;
                    return ThemableActivity.this.getDelegate().g(context, (View) obj, (String) obj2, (AttributeSet) obj4);
                }
            }));
            if (!(this instanceof rok)) {
                dhr0.a.k(this);
            }
            super.onCreate(bundle);
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Trace.beginSection(ndp0.f("ThemableActivity.onResume"));
        try {
            super.onResume();
            dhr0.j(dhr0.a, this);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        f7i f7iVar = this.j;
        if (f7iVar.e) {
            return;
        }
        f7iVar.c = Integer.valueOf(i);
        f7iVar.d = true;
        if (gz80.a(34)) {
            dhr0.a.getClass();
            if (i == dhr0.u().c || i == dhr0.z().c) {
                return;
            }
            f7iVar.b.add(Integer.valueOf(i));
        }
    }
}
