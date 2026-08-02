package com.vk.photoviewer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.imagepipeline.request.ImageRequest;
import com.vk.bridges.ImageViewer;
import com.vk.photoviewer.PhotoViewer;
import xsna.fnw;
import xsna.gzs;
import xsna.obh;
import xsna.s3q0;

/* compiled from: CallbackAdapter.kt */
/* loaded from: classes3.dex */
public class b<T> implements PhotoViewer.b {
    public final PhotoViewer.a b;
    public final PhotoViewer.b c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.vk.photoviewer.PhotoViewer$b] */
    public b(PhotoViewer.a aVar) {
        this.b = aVar;
        a aVar2 = new a();
        a aVar3 = aVar instanceof PhotoViewer.b ? (PhotoViewer.b) aVar : null;
        this.c = aVar3 != null ? aVar3 : aVar2;
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final void A() {
        this.c.A();
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public void C(int i) {
        this.c.C(i);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public View D(PhotoViewerLayout photoViewerLayout) {
        return null;
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final View G(fnw fnwVar, obh obhVar) {
        return this.c.G(fnwVar, obhVar);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final void H(PhotoViewer photoViewer) {
        this.c.H(photoViewer);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final String I(PhotoViewer.g gVar) {
        return this.c.I(gVar);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final boolean J() {
        return this.c.J();
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final ImageRequest K(PhotoViewer.g gVar) {
        return this.c.K(gVar);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final float[] L() {
        return this.c.L();
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final boolean N() {
        return true;
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final boolean O() {
        return this.c.O();
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public void P(boolean z) {
        this.c.P(z);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final Rect a() {
        return null;
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final void b(int i) {
        this.c.b(i);
    }

    @Override // com.vk.photoviewer.PhotoViewer.a
    public final View c(int i) {
        return this.b.c(i);
    }

    @Override // com.vk.photoviewer.PhotoViewer.a
    public final Rect d(int i) {
        return this.b.d(i);
    }

    @Override // com.vk.photoviewer.PhotoViewer.a
    public void e(int i) {
        this.b.e(i);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final Integer f() {
        return this.c.f();
    }

    @Override // com.vk.photoviewer.PhotoViewer.a
    public final Rect g() {
        return this.b.g();
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public boolean h() {
        return true;
    }

    @Override // com.vk.photoviewer.PhotoViewer.a
    public void j(PhotoViewer photoViewer) {
        this.b.j(photoViewer);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final WindowManager.LayoutParams k() {
        return this.c.k();
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final boolean l() {
        return this.c.l();
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final String m(int i, int i2) {
        return this.c.m(i, i2);
    }

    @Override // com.vk.photoviewer.PhotoViewer.a
    public void onDismiss() {
        this.b.onDismiss();
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final String p(int i, int i2) {
        return this.c.p(i, i2);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final void q(PhotoViewer.g gVar) {
        this.c.q(gVar);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final float[] r(int i) {
        return this.c.r(i);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final boolean v() {
        return this.c.v();
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final ImageRequest x(Context context, String str, PhotoViewer.g gVar) {
        return this.c.x(context, str, gVar);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public final void y(int i, ViewGroup viewGroup) {
        this.c.y(i, viewGroup);
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public int z() {
        return this.c.z();
    }

    /* compiled from: CallbackAdapter.kt */
    public static final class a implements PhotoViewer.b {
        @Override // com.vk.photoviewer.PhotoViewer.b
        public final View B(fnw fnwVar, int i) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final View D(PhotoViewerLayout photoViewerLayout) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final View E(ViewGroup viewGroup, int i, gzs<s3q0> gzsVar) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final int F(int i) {
            return 0;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean J() {
            return true;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final ImageRequest K(PhotoViewer.g gVar) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final float[] L() {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean N() {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean O() {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final Rect a() {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final View c(int i) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final Integer f() {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final Rect g() {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean h() {
            return true;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final WindowManager.LayoutParams k() {
            RectF rectF = PhotoViewer.U;
            return PhotoViewer.c.a();
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean l() {
            return true;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final String p(int i, int i2) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final float[] r(int i) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final View s(ViewGroup viewGroup) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean t(int i) {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean u(int i) {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean v() {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean w(PhotoViewer.g gVar, int i, MenuItem menuItem, View view) {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final int z() {
            return 0;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void A() {
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final void onDismiss() {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void C(int i) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void H(PhotoViewer photoViewer) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void P(boolean z) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void b(int i) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final void e(int i) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void i(int i) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final void j(PhotoViewer photoViewer) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void M(ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void n(int i, PhotoViewer.q qVar) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void y(int i, ViewGroup viewGroup) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void o(PhotoViewer.g gVar, int i, Menu menu) {
        }
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public void i(int i) {
    }

    @Override // com.vk.photoviewer.PhotoViewer.b
    public void M(ImageViewer.SwipeDirection swipeDirection, boolean z) {
    }
}
