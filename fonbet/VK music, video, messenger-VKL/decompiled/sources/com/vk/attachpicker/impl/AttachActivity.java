package com.vk.attachpicker.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Window;
import com.vk.attachpicker.c;
import com.vk.attachpicker.impl.a;
import com.vk.attachpicker.impl.location.LocationFragment;
import com.vk.documents.api.di.DocumentsComponent;
import com.vk.gallerypicker.di.GalleryPickerComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.pushes.PushAwareActivity;
import com.vk.superapp.di.SuperAppServicesComponent;
import com.vkontakte.android.R;
import java.util.HashMap;
import xsna.cuz;
import xsna.dhr0;
import xsna.fpf0;
import xsna.gdr0;
import xsna.h2d0;
import xsna.m7m;
import xsna.mhy;
import xsna.ozl;
import xsna.rok;
import xsna.sok;
import xsna.tb0;
import xsna.tok;
import xsna.tvv;

/* compiled from: AttachActivity.kt */
/* loaded from: classes15.dex */
public final class AttachActivity extends PushAwareActivity implements LocationFragment.a, tvv, rok, h2d0, a.l {
    public final sok v = new sok(this);
    public a w;

    @Override // com.vk.attachpicker.impl.a.l
    public final void Bm() {
        super.finish();
    }

    @Override // com.vkontakte.android.VKActivity, xsna.aeg0
    public final void Li(tb0 tb0Var) {
        a aVar = this.w;
        if (aVar != null) {
            aVar.Li(tb0Var);
        }
    }

    @Override // com.vk.attachpicker.impl.location.LocationFragment.a
    public final void N() {
        a aVar = this.w;
        if (aVar != null) {
            aVar.N();
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity
    public final void O1(Configuration configuration) {
        super.O1(configuration);
        a aVar = this.w;
        if (aVar != null) {
            aVar.e(configuration.orientation);
            aVar.n(aVar.Z);
        }
    }

    @Override // xsna.rok
    public final tok R() {
        return this.v;
    }

    public final boolean T1() {
        a aVar = this.w;
        return (aVar == null || aVar.W == 0) ? false : true;
    }

    @Override // xsna.j34
    public final void V2(Intent intent) {
        a aVar = this.w;
        if (aVar != null) {
            aVar.l(intent);
        }
    }

    @Override // com.vk.attachpicker.b.InterfaceC0381b
    public final com.vk.attachpicker.b Yd() {
        c cVar;
        a aVar = this.w;
        return (aVar == null || (cVar = aVar.b) == null) ? new c() : cVar;
    }

    @Override // android.app.Activity
    public final void finish() {
        a aVar = this.w;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // xsna.tvv
    public final boolean isIdle() {
        a aVar = this.w;
        return aVar != null && aVar.isIdle();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @ozl
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        a aVar = this.w;
        if (aVar != null) {
            aVar.g(i, i2, intent);
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    @ozl
    public final void onBackPressed() {
        a aVar = this.w;
        if (aVar == null || !aVar.h()) {
            super.onBackPressed();
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Window window;
        setTheme(dhr0.C().b ? R.style.AttachTransparentMilkTheme : R.style.AttachTransparentMilkDarkTheme);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        mhy.h(this);
        a aVar = new a(this, ((DocumentsComponent) m7m.a(this).mo408a(fpf0.a(DocumentsComponent.class))).P0(), ((GalleryPickerComponent) m7m.a(this).mo408a(fpf0.a(GalleryPickerComponent.class))).b2(), ((SuperAppServicesComponent) m7m.a(this).mo408a(fpf0.a(SuperAppServicesComponent.class))).nd(), (PhotosComponent) m7m.a(this).a(fpf0.a(PhotosComponent.class)));
        setContentView(aVar.i((gdr0) getSystemService("layout_inflater"), null, bundle, getWindow()));
        this.w = aVar;
        if (!aVar.I || (window = getWindow()) == null) {
            return;
        }
        window.addFlags(8192);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.w;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @ozl
    public final void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        a aVar = this.w;
        if (aVar != null) {
            aVar.n(aVar.Z);
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        a aVar = this.w;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        a aVar = this.w;
        if (aVar != null) {
            bundle.putFloat("SLIDE_OFFSET", aVar.Z);
            bundle.putInt("BOTTOM_SHEET_STATE", aVar.j.N);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        a aVar = this.w;
        if (aVar != null) {
            cuz.a(aVar.d0.kn()).d(aVar.m0);
        }
    }

    @Override // xsna.h2d0
    public final void qm(HashMap hashMap) {
        a aVar = this.w;
        if (aVar != null) {
            aVar.qm(hashMap);
        }
    }

    @Override // com.vk.attachpicker.impl.a.l
    public final Bundle requireArguments() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getExtras();
        }
        return null;
    }

    @Override // xsna.d1m0
    public final void rh() {
        a aVar = this.w;
        if (aVar != null) {
            aVar.m.setCurrentItem(aVar.K, false);
        }
    }

    public final String toString() {
        return "AttachActivity";
    }

    @Override // com.vkontakte.android.VKActivity, xsna.aeg0
    public final void yk(tb0 tb0Var) {
        a aVar = this.w;
        if (aVar != null) {
            aVar.yk(tb0Var);
        }
    }

    @Override // com.vk.attachpicker.impl.a.l
    public final Activity kn() {
        return this;
    }
}
