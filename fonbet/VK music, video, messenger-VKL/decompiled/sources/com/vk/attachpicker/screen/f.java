package com.vk.attachpicker.screen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.b;
import com.vk.attachpicker.screen.h;
import com.vk.attachpicker.screen.i;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.asu0;
import xsna.b0u0;
import xsna.bdn;
import xsna.bpn0;
import xsna.bwt0;
import xsna.d3t;
import xsna.e43;
import xsna.em6;
import xsna.f5p;
import xsna.g4p;
import xsna.g84;
import xsna.heq0;
import xsna.hg;
import xsna.hpj;
import xsna.i0q0;
import xsna.ie00;
import xsna.iut0;
import xsna.j5g;
import xsna.jg0;
import xsna.krv0;
import xsna.ksk0;
import xsna.l0g;
import xsna.lx5;
import xsna.m3g;
import xsna.m6a0;
import xsna.m84;
import xsna.msy;
import xsna.myc0;
import xsna.n0g;
import xsna.nm8;
import xsna.o0g;
import xsna.o6a0;
import xsna.p0g;
import xsna.p90;
import xsna.qv20;
import xsna.r2g;
import xsna.r4p;
import xsna.rqu0;
import xsna.s4p;
import xsna.t4p;
import xsna.u080;
import xsna.w0b;
import xsna.w3p;
import xsna.wo1;
import xsna.wyt0;
import xsna.y1q0;
import xsna.y2g;
import xsna.zlw;
import xsna.zvj;

/* compiled from: CollageEditorScreen.kt */
/* loaded from: classes15.dex */
public final class f extends em6 implements s4p {
    public final zlw g;
    public final r4p h;
    public final String i;
    public final d3t j;
    public final Object k;
    public final Object l;
    public final wyt0 m;
    public final hpj n;
    public final nm8 o;
    public PhotoEditorView p;
    public i q;
    public Integer r;
    public g84 s;
    public m3g t;
    public com.vk.core.view.components.spinner.c u;
    public final bpn0 v;

    public f(zlw zlwVar, r4p r4pVar, String str, d3t d3tVar) {
        this.g = zlwVar;
        this.h = r4pVar;
        this.i = str;
        this.j = d3tVar;
        jg0 jg0Var = new jg0(7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = msy.a(lazyThreadSafetyMode, jg0Var);
        this.l = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.d(this, 24));
        this.m = new wyt0();
        bdn bdnVar = bdn.a;
        this.n = zvj.a(ie00.a);
        this.o = w0b.a(0, BufferOverflow.DROP_OLDEST, null, 5);
        this.q = new i.a(false);
        this.v = new bpn0(new hg(this, 27));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.em6
    public final View b(LayoutInflater layoutInflater) {
        if (layoutInflater == null) {
            return null;
        }
        zlw zlwVar = this.g;
        g4p g4pVar = new g4p(zlwVar.a());
        if (!h.a.a(g4pVar)) {
            i0q0.f(new com.vk.movika.sdk.base.logic.processor.actions.f(this, 26));
            return layoutInflater.inflate(R.layout.picker_layout_photo_editor_invalid_image, (ViewGroup) null);
        }
        ?? r3 = this.k;
        ((y1q0) r3.getValue()).b();
        ((y1q0) r3.getValue()).c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_EDITOR), true);
        View inflate = layoutInflater.inflate(R.layout.picker_layout_photo_editor, (ViewGroup) null);
        final PhotoEditorView photoEditorView = (PhotoEditorView) bwt0.p(inflate, R.id.photoEditorView, null, null, 6);
        w3p w3pVar = photoEditorView.c;
        this.p = photoEditorView;
        ?? r5 = this.l;
        photoEditorView.setStatConsumer((o6a0) r5.getValue());
        com.vk.attachpicker.screen.filters.b bVar = new com.vk.attachpicker.screen.filters.b();
        u080 u080Var = new u080() { // from class: xsna.m0g
            @Override // xsna.u080
            public final bqx0 b(View view, bqx0 bqx0Var) {
                nen h = bqx0Var.a.h();
                PhotoEditorView.this.setInsets(h4x.c(0, h != null ? h.a.getSafeInsetTop() : wqx0.c(bqx0Var).b, 0, 0));
                return bqx0.b;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(photoEditorView, u080Var);
        bwt0.g(photoEditorView, new com.vk.movika.sdk.base.logic.processor.actions.h(photoEditorView, 27));
        photoEditorView.setListener(new d(bVar, this, photoEditorView));
        o0g o0gVar = new o0g(photoEditorView, this, null);
        hpj hpjVar = this.n;
        myc0.h(hpjVar, null, null, o0gVar, 3);
        myc0.h(hpjVar, null, null, new e(photoEditorView, this, null), 3);
        photoEditorView.G(new r2g.a((n0g) this.v.getValue()));
        y2g y2gVar = y2g.a;
        PhotoEditorView.n(photoEditorView, y2gVar, new f5p[0]);
        w3pVar.h.add(new heq0());
        w3pVar.i.add(new heq0());
        p0g p0gVar = new p0g();
        photoEditorView.setLogger(p0gVar);
        boolean a = com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_IMAGE_LOADING_NATIVE_RES);
        this.j.getClass();
        photoEditorView.r(this.m, new rqu0(zlwVar, a, p0gVar, null), bVar, y2gVar);
        r4p r4pVar = this.h;
        if (r4pVar != null) {
            photoEditorView.setImage(r4pVar);
        } else {
            PhotoEditorView.J(photoEditorView, g4pVar);
        }
        o6a0 o6a0Var = (o6a0) r5.getValue();
        m6a0.b bVar2 = new m6a0.b(this.i);
        o6a0Var.getClass();
        ksk0.a(new wo1(13, bVar2, o6a0Var));
        return inflate;
    }

    @Override // xsna.em6
    public final void f(int i, Intent intent) {
        Bundle bundleExtra;
        ArrayList parcelableArrayList;
        if (i == 10666) {
            Uri uri = (intent == null || (bundleExtra = intent.getBundleExtra("result_attachments")) == null || (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) == null) ? null : (Uri) j5g.a0(parcelableArrayList);
            String path = uri != null ? uri.getPath() : null;
            asu0.a.getClass();
            asu0.j().execute(new l0g(uri, path, this, 0));
        }
    }

    @Override // xsna.em6
    public final boolean g() {
        PhotoEditorView photoEditorView = this.p;
        if (photoEditorView != null && photoEditorView.w()) {
            return true;
        }
        c();
        return true;
    }

    @Override // xsna.em6
    public final void i() {
        PhotoEditorView photoEditorView = this.p;
        if (photoEditorView != null) {
            photoEditorView.y();
        }
        this.d = false;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [T, android.app.Dialog, com.vk.core.view.components.spinner.c] */
    @Override // xsna.em6
    public final void j() {
        Window window;
        int i = 1;
        this.d = true;
        PhotoEditorView photoEditorView = this.p;
        if (photoEditorView != null) {
            photoEditorView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (!p90.e(d())) {
            ?? e = qv20.e(d(), Integer.valueOf(R.string.picker_loading));
            e.create();
            e.setCanceledOnTouchOutside(false);
            e.show();
            ref$ObjectRef.element = e;
        }
        i0q0.d(750L, new lx5(i, this, ref$ObjectRef));
        PhotoEditorView photoEditorView2 = this.p;
        if (photoEditorView2 != null) {
            photoEditorView2.z();
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        int color = context.getColor(R.color.vk_black);
        com.vk.core.simplescreen.a c = this.j.c();
        if (c == null || (window = c.getWindow()) == null) {
            window = d().getWindow();
        }
        if (this.r == null) {
            this.r = window != null ? Integer.valueOf(window.getNavigationBarColor()) : null;
        }
        TypedValue typedValue = krv0.a;
        krv0.s(window, color);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void m(MediaStoreEntry mediaStoreEntry, r4p r4pVar, File file, Uri uri) {
        Intent a;
        Window window;
        i iVar = this.q;
        if (iVar instanceof i.c) {
            boolean z = ((i.c) iVar).a;
            t4p.a bVar = (z || this.h == null) ? !z ? t4p.a.d.a : mediaStoreEntry != null ? new t4p.a.b(mediaStoreEntry, r4pVar, new t4p.a.f(false, false)) : t4p.a.c.a : t4p.a.e.a;
            Window window2 = null;
            if (bVar instanceof t4p.a.c) {
                a = null;
            } else {
                a = b.a.a(Uri.fromFile(file), false, false);
                if (uri != null) {
                    a.putExtra("edited_content_uri", uri);
                }
            }
            m84 m84Var = new m84(6, a, this);
            Integer num = this.r;
            d3t d3tVar = this.j;
            if (num != null) {
                int intValue = num.intValue();
                com.vk.core.simplescreen.a c = d3tVar.c();
                if (c == null || (window = c.getWindow()) == null) {
                    Activity d = d();
                    if (d != null) {
                        window2 = d.getWindow();
                    }
                } else {
                    window2 = window;
                }
                TypedValue typedValue = krv0.a;
                krv0.s(window2, intValue);
            }
            d3tVar.a(bVar);
            ((y1q0) this.k.getValue()).a();
            m84Var.invoke();
            c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }
}
