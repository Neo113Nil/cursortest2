package com.vk.editor.di;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoryBackground;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.superapp.api.dto.story.WebStickerType;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.ape0;
import xsna.c7l0;
import xsna.fov;
import xsna.gpj0;
import xsna.hkm0;
import xsna.hrj0;
import xsna.igh;
import xsna.iql0;
import xsna.izs;
import xsna.j5g;
import xsna.j5p;
import xsna.k1m0;
import xsna.k9l0;
import xsna.m1k;
import xsna.mrj0;
import xsna.msj0;
import xsna.npe0;
import xsna.o1m0;
import xsna.psj0;
import xsna.r5m0;
import xsna.rqj0;
import xsna.s3q0;
import xsna.s5m0;
import xsna.spj0;
import xsna.waf0;
import xsna.wz5;
import xsna.xqj0;
import xsna.y3p;

/* compiled from: StoryEditorExtDepsComponentStub.kt */
/* loaded from: classes18.dex */
public final class StoryEditorExtDepsComponentStub implements StoryEditorExtDepsComponent {
    public final y3p a = y3p.a.a.getSTUB();
    public final h b = new h();
    public final e c = new e();
    public final l d = new l();
    public final m e = new m();
    public final a f = new a();
    public final c g = new c();
    public final g h = new g();
    public final f i = new f();
    public final d j = new d();
    public final i k = new i();
    public final j l = new j();
    public final o1m0 m = o1m0.a.getSTUB();
    public final b n = new b();

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class a implements gpj0 {
        public final Owner a = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
        public final String b = "";
        public final ImageList c = new ImageList(null, 1, null);
        public final UserId d = UserId.d;
        public final String e = "";
        public final String f = "";
        public final ObsceneTextFilter g = ObsceneTextFilter.UNAVAILABLE;

        @Override // xsna.gpj0
        public final String a() {
            return null;
        }

        @Override // xsna.gpj0
        public final ObsceneTextFilter b() {
            return this.g;
        }

        @Override // xsna.gpj0
        public final String c() {
            return this.b;
        }

        @Override // xsna.gpj0
        public final boolean d() {
            return false;
        }

        @Override // xsna.gpj0
        public final String e() {
            return this.f;
        }

        @Override // xsna.gpj0
        public final ImageList f() {
            return this.c;
        }

        @Override // xsna.gpj0
        public final String getName() {
            return this.e;
        }

        @Override // xsna.gpj0
        public final UserId getUid() {
            return this.d;
        }

        @Override // xsna.gpj0
        public final Owner s() {
            return this.a;
        }
    }

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class c implements spj0 {
        @Override // xsna.spj0
        public final boolean c(VideoFile videoFile) {
            return false;
        }
    }

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class d implements rqj0 {
        @Override // xsna.rqj0
        public final Group b(UserId userId) {
            return null;
        }
    }

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class f implements hrj0 {
        @Override // xsna.hrj0
        public final boolean a(Context context, String str) {
            return false;
        }
    }

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class i implements msj0 {
        @Override // xsna.msj0
        public final Drawable a(Context context, String str) {
            return new ShapeDrawable(new OvalShape());
        }

        @Override // xsna.msj0
        public final Drawable b(Context context, long j, String str) {
            return new ShapeDrawable(new OvalShape());
        }
    }

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class k {
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final iql0 Cb() {
        return this.n;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final k1m0 Dd() {
        return this.e;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final hkm0 Je() {
        return this.d;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final xqj0 K2() {
        return this.c;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final y3p M0() {
        return this.a;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final rqj0 O() {
        return this.j;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final psj0 R() {
        return this.l;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final msj0 Xd() {
        return this.k;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final gpj0 k7() {
        return this.f;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final o1m0 l6() {
        return this.m;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final hrj0 p() {
        return this.i;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final npe0 r8() {
        return this.b;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final mrj0 w0() {
        return this.h;
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final spj0 x() {
        return this.g;
    }

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class j implements psj0 {
        public final b a = new b();

        /* compiled from: StoryEditorExtDepsComponentStub.kt */
        public static final class b implements s5m0 {
            @Override // xsna.s5m0
            public final boolean a(String str) {
                return true;
            }

            @Override // xsna.s5m0
            public final r5m0 b(String str, String str2, com.vk.stickers.api.styles.a aVar, com.vk.stickers.api.styles.b bVar, c7l0 c7l0Var) {
                return null;
            }
        }

        @Override // xsna.psj0
        public final int a(WebStickerType webStickerType) {
            return 1;
        }

        @Override // xsna.psj0
        public final boolean b() {
            return false;
        }

        @Override // xsna.psj0
        public final int c() {
            return 5000;
        }

        @Override // xsna.psj0
        public final boolean d(WebStickerType webStickerType) {
            return true;
        }

        @Override // xsna.psj0
        public final s5m0 e() {
            return this.a;
        }

        @Override // xsna.psj0
        public final int f() {
            return 1;
        }

        @Override // xsna.psj0
        public final Set<WebStickerType> g(Set<? extends WebStickerType> set, k9l0 k9l0Var) {
            return j5g.R0(set);
        }

        @Override // xsna.psj0
        public final boolean h(StoryCameraMode storyCameraMode) {
            return false;
        }

        @Override // xsna.psj0
        public final fov i(Context context, boolean z, fov.a aVar) {
            return new a(context, aVar);
        }

        /* compiled from: StoryEditorExtDepsComponentStub.kt */
        public static final class a implements fov {
            public final /* synthetic */ Context a;
            public final /* synthetic */ fov.a b;

            public a(Context context, fov.a aVar) {
                this.a = context;
                this.b = aVar;
            }

            @Override // xsna.fov
            public final boolean a0() {
                return false;
            }

            @Override // xsna.fov
            public final void d() {
                getView().setPadding(getView().getPaddingLeft(), 0, getView().getPaddingRight(), getView().getPaddingBottom());
            }

            @Override // xsna.fov
            public final View getView() {
                View view = new View(this.a);
                view.setOnClickListener(new wz5(this.b, 10));
                return view;
            }

            @Override // xsna.fov
            public final void hide() {
                super.setVisible(false);
            }

            @Override // xsna.fov
            public final void setVisible(boolean z) {
                super.setVisible(true);
            }

            @Override // xsna.fov
            public final void show() {
                super.setVisible(true);
            }

            @Override // xsna.fov
            public final void b() {
            }

            @Override // xsna.fov
            public final void a(Set<? extends WebStickerType> set) {
            }

            @Override // xsna.fov
            public final void c(boolean z) {
            }
        }
    }

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class b implements iql0 {
        @Override // xsna.iql0
        public final q<StoryBackground> b() {
            return g0.b;
        }

        @Override // xsna.iql0
        public final q<Map<StoryBackgroundType, List<StoryBackground>>> c() {
            return g0.b;
        }

        @Override // xsna.iql0
        public final void a() {
        }
    }

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class e implements xqj0 {
        @Override // xsna.xqj0
        public final boolean a(igh ighVar) {
            return false;
        }

        @Override // xsna.xqj0
        public final boolean b() {
            return false;
        }

        @Override // xsna.xqj0
        public final boolean c() {
            return false;
        }

        @Override // xsna.xqj0
        public final boolean d(Activity activity, Rect rect) {
            return false;
        }

        @Override // xsna.xqj0
        public final boolean e(Activity activity, Rect rect) {
            return false;
        }

        @Override // xsna.xqj0
        public final boolean g(Activity activity, Rect rect) {
            return false;
        }

        @Override // xsna.xqj0
        public final boolean i(j5p j5pVar) {
            return false;
        }

        @Override // xsna.xqj0
        public final boolean k() {
            return false;
        }

        @Override // xsna.xqj0
        public final void h() {
        }

        @Override // xsna.xqj0
        public final void f(ape0 ape0Var) {
        }

        @Override // xsna.xqj0
        public final void j(waf0 waf0Var) {
        }

        @Override // xsna.xqj0
        public final void l(m1k m1kVar) {
        }
    }

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class h implements npe0 {
        @Override // xsna.npe0
        public final void a() {
        }

        @Override // xsna.npe0
        public final void b() {
        }

        @Override // xsna.npe0
        public final void c() {
        }
    }

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class l implements hkm0 {
        @Override // xsna.hkm0
        public final void b(StoryMultiData storyMultiData) {
        }
    }

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class m implements k1m0 {
        @Override // xsna.k1m0
        public final void a(izs<? super Boolean, s3q0> izsVar) {
        }
    }

    /* compiled from: StoryEditorExtDepsComponentStub.kt */
    public static final class g implements mrj0 {
        @Override // xsna.mrj0
        public final void a(Activity activity, int i, izs<? super Intent, s3q0> izsVar) {
        }
    }
}
