package com.vk.ecomm.market.api.photoviewer.di;

import android.content.Context;
import android.view.View;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.tags.Tag;
import java.util.List;
import xsna.b9u0;
import xsna.d390;
import xsna.dtd0;
import xsna.e390;
import xsna.e9u0;
import xsna.f5z;
import xsna.q530;
import xsna.r0o0;
import xsna.s0o0;
import xsna.tbq;
import xsna.u4h;
import xsna.wlw;

/* compiled from: MarketPhotoviewerComponentStub.kt */
/* loaded from: classes18.dex */
public final class MarketPhotoviewerComponentStub implements MarketPhotoviewerComponent {

    /* compiled from: MarketPhotoviewerComponentStub.kt */
    public static final class b implements s0o0 {
        @Override // xsna.s0o0
        public final r0o0 a(Context context, u4h u4hVar, e9u0 e9u0Var, String str, boolean z) {
            return new com.vk.ecomm.market.api.photoviewer.di.b();
        }
    }

    @Override // com.vk.ecomm.market.api.photoviewer.di.MarketPhotoviewerComponent
    public final e390 G5() {
        return new a();
    }

    @Override // com.vk.ecomm.market.api.photoviewer.di.MarketPhotoviewerComponent
    public final s0o0 O1() {
        return new b();
    }

    /* compiled from: MarketPhotoviewerComponentStub.kt */
    public static final class a implements e390 {
        @Override // xsna.e390
        public final d390 a(Context context, f5z f5zVar) {
            return new C0944a();
        }

        @Override // xsna.e390
        public final dtd0 b(Context context) {
            return new com.vk.ecomm.market.api.photoviewer.di.a();
        }

        @Override // xsna.e390
        public final dtd0 c(Context context, q530 q530Var) {
            return new com.vk.ecomm.market.api.photoviewer.di.a();
        }

        /* compiled from: MarketPhotoviewerComponentStub.kt */
        /* renamed from: com.vk.ecomm.market.api.photoviewer.di.MarketPhotoviewerComponentStub$a$a, reason: collision with other inner class name */
        public static final class C0944a implements d390 {
            public int b;

            @Override // xsna.d390
            public final View a() {
                return null;
            }

            @Override // xsna.d390
            public final View g() {
                return null;
            }

            @Override // xsna.d390
            public final int getCurrentPosition() {
                return this.b;
            }

            @Override // xsna.d390
            public final void h(int i) {
                this.b = i;
            }

            @Override // xsna.d390
            public final void b() {
            }

            @Override // xsna.d390
            public final void c() {
            }

            @Override // xsna.d390
            public final void e() {
            }

            @Override // xsna.d390
            public final void j() {
            }

            @Override // xsna.d390
            public final void m() {
            }

            @Override // xsna.d390
            public final void d(b9u0 b9u0Var) {
            }

            @Override // xsna.d390
            public final void f(List<PhotoTag> list) {
            }

            @Override // xsna.d390
            public final void i(wlw wlwVar) {
            }

            @Override // xsna.d390
            public final void l(tbq tbqVar) {
            }

            @Override // xsna.d390
            public final void k(List<Tag> list, boolean z) {
            }
        }
    }
}
