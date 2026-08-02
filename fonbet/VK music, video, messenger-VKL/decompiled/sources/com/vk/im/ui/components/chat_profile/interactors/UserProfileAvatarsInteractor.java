package com.vk.im.ui.components.chat_profile.interactors;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.l0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import xsna.arb0;
import xsna.cl30;
import xsna.he40;
import xsna.if1;
import xsna.iwg0;
import xsna.jp5;
import xsna.kwg0;
import xsna.lw30;
import xsna.o7y;
import xsna.rsg0;
import xsna.sxl0;
import xsna.ut30;
import xsna.vea0;

/* compiled from: UserProfileAvatarsInteractor.kt */
/* loaded from: classes2.dex */
public final class UserProfileAvatarsInteractor {
    public final Context a;
    public final ImageViewer b;
    public VKList<Photo> c;

    /* compiled from: UserProfileAvatarsInteractor.kt */
    public static final class NoAvatarsException extends Exception {
    }

    public UserProfileAvatarsInteractor(Context context, ImageViewer imageViewer) {
        this.a = context;
        this.b = imageViewer;
    }

    public static l0 a(UserProfileAvatarsInteractor userProfileAvatarsInteractor, UserId userId) {
        UserId userId2;
        q E;
        VKList<Photo> vKList = userProfileAvatarsInteractor.c;
        if (vKList != null) {
            E = q.T(vKList);
            userId2 = userId;
        } else {
            userId2 = userId;
            m1 y0 = rsg0.y0(new vea0(userId2, -6, 0, 10, true), null, null, 3);
            lw30 lw30Var = new lw30(new sxl0(userProfileAvatarsInteractor, 5), 17);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            E = y0.E(lw30Var, lVar, kVar, kVar);
        }
        return new l0(E, new he40(new jp5(26, userId2, userProfileAvatarsInteractor), 14));
    }

    /* compiled from: UserProfileAvatarsInteractor.kt */
    public static final class a implements ImageViewer.a {
        public final UserId a;
        public int b;
        public int c;
        public ImageViewer.c<Photo> d;
        public final b e = new b();
        public boolean f;

        public a(UserId userId, int i, int i2) {
            this.a = userId;
            this.b = i;
            this.c = i2;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return Integer.valueOf(this.c);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
            int i = this.b;
            if (i >= this.c || this.f) {
                return;
            }
            b0 G = new c0(rsg0.y0(new vea0(this.a, -6, i, 20, true), null, null, 3), new cl30(new arb0(this, 27), 15), io.reactivex.rxjava3.internal.functions.a.c).G(new if1(this, 3));
            o7y o7yVar = new o7y(new ut30(this, 29), 21);
            int i2 = kwg0.a;
            this.e.b(G.subscribe(o7yVar, new iwg0()));
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            this.e.dispose();
            this.d = null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.ControlsOptions u() {
            return new ImageViewer.ControlsOptions(true, true, null, 252);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
