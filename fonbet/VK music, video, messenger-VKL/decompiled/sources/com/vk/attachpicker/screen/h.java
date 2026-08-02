package com.vk.attachpicker.screen;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.vk.attachpicker.b;
import com.vk.attachpicker.screen.i;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.gallerypicker.configuration.SpoilerConfiguration;
import com.vk.libdelayedjobs.WorkPolicy;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.photo.editor.features.colorgrading.ColorGradingTool;
import com.vk.photo.editor.features.filter.b;
import com.vk.photo.editor.features.markup.text.a;
import com.vk.photo.editor.features.mlenhance.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.n1;
import io.reactivex.rxjava3.internal.operators.observable.o2;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.asu0;
import xsna.b0u0;
import xsna.b60;
import xsna.b6l;
import xsna.bdn;
import xsna.bic;
import xsna.bpn0;
import xsna.bt20;
import xsna.bwt0;
import xsna.c5g;
import xsna.co00;
import xsna.cvk;
import xsna.cwn;
import xsna.cy0;
import xsna.d6l0;
import xsna.dmk0;
import xsna.drm0;
import xsna.e43;
import xsna.ecm;
import xsna.em6;
import xsna.epx;
import xsna.f4;
import xsna.f5p;
import xsna.fg5;
import xsna.fyx;
import xsna.g4p;
import xsna.g5p;
import xsna.g84;
import xsna.gbj;
import xsna.gik;
import xsna.go9;
import xsna.gt20;
import xsna.gzs;
import xsna.h7u0;
import xsna.h7v;
import xsna.hd80;
import xsna.heq0;
import xsna.hg5;
import xsna.hjo;
import xsna.hmk0;
import xsna.hmo0;
import xsna.hpj;
import xsna.i0q0;
import xsna.ie00;
import xsna.ij8;
import xsna.ijo;
import xsna.itg0;
import xsna.iut0;
import xsna.j34;
import xsna.j5g;
import xsna.jad;
import xsna.jik;
import xsna.jio0;
import xsna.jmk0;
import xsna.k6g;
import xsna.krv0;
import xsna.ksk0;
import xsna.l7;
import xsna.l9h;
import xsna.la0;
import xsna.ld7;
import xsna.ler;
import xsna.lht;
import xsna.lsr;
import xsna.m1i;
import xsna.m3g;
import xsna.m4p;
import xsna.m6a0;
import xsna.maj;
import xsna.msy;
import xsna.mxj;
import xsna.myc0;
import xsna.n1i;
import xsna.n3i;
import xsna.n4p;
import xsna.n5i;
import xsna.nh0;
import xsna.nvg;
import xsna.o6a0;
import xsna.ot20;
import xsna.p90;
import xsna.pn00;
import xsna.pp3;
import xsna.py;
import xsna.qiw;
import xsna.qv20;
import xsna.r2g;
import xsna.r4p;
import xsna.rl3;
import xsna.rqu0;
import xsna.rwi;
import xsna.s2o;
import xsna.s3q0;
import xsna.s4p;
import xsna.s6k;
import xsna.s770;
import xsna.s7l0;
import xsna.sf10;
import xsna.spj;
import xsna.t4p;
import xsna.t5s;
import xsna.t7l0;
import xsna.tcn;
import xsna.tp0;
import xsna.ttk0;
import xsna.u080;
import xsna.u3k;
import xsna.u3p;
import xsna.uh;
import xsna.usl;
import xsna.utk0;
import xsna.w3p;
import xsna.w4p;
import xsna.w8i;
import xsna.wio;
import xsna.wo1;
import xsna.wyt0;
import xsna.wzs;
import xsna.xeo0;
import xsna.xmo0;
import xsna.xsl;
import xsna.y1q0;
import xsna.y2g;
import xsna.y4p;
import xsna.ysd;
import xsna.yvj;
import xsna.zlw;
import xsna.zvj;
import xsna.zy60;

/* compiled from: EditorScreenNewImpl.kt */
/* loaded from: classes15.dex */
public final class h extends em6 implements s4p, w8i {
    public androidx.appcompat.app.d A;
    public com.vk.core.view.components.spinner.c B;
    public g84 C;
    public m3g D;
    public final wyt0 E;
    public final hpj F;
    public final qiw G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final bpn0 K;
    public final Object L;
    public final zlw g;
    public final r4p h;
    public final t4p i;
    public final j34 j;
    public final boolean k;
    public final com.vk.core.simplescreen.a l;
    public final String m;
    public final wzs<Integer, Intent, s3q0> n;
    public final s770 o;
    public final SpoilerConfiguration p;
    public final io.reactivex.rxjava3.subjects.f<Bitmap> q;
    public final Object r;
    public final Object s;
    public final Object t;
    public io.reactivex.rxjava3.disposables.c u;
    public final Object v;
    public final ArrayList w;
    public PhotoEditorView x;
    public i y;
    public Integer z;

    /* compiled from: EditorScreenNewImpl.kt */
    public static final class a {
        public static boolean a(g4p g4pVar) {
            String str = g4pVar.a;
            L.e(go9.b("canEdit: uri=", str));
            if (!drm0.D(str, ".gif", false)) {
                float width = g4pVar.getWidth() / g4pVar.getHeight();
                L.e("canEdit: ratio=" + width + " (" + g4pVar.getWidth() + '/' + g4pVar.getHeight() + ')');
                if (0.14285715f <= width && width <= 7.0f && g4pVar.getWidth() >= 128 && g4pVar.getHeight() >= 128) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: EditorScreenNewImpl.kt */
    public static final class b implements u3p {
        public b() {
        }

        @Override // xsna.u3p
        public final void a(g84 g84Var, m3g m3gVar) {
            h hVar = h.this;
            hVar.C = g84Var;
            hVar.D = m3gVar;
            py pyVar = new py(24);
            wzs<Integer, Intent, s3q0> wzsVar = hVar.n;
            if (wzsVar == null) {
                rwi.d().h().d(10666, hVar.d(), pyVar);
            } else {
                rwi.d().h().a(hVar.d(), wzsVar, 10666, pyVar);
            }
        }
    }

    /* compiled from: EditorScreenNewImpl.kt */
    @b6l(c = "com.vk.attachpicker.screen.EditorScreenNewImpl$createView$2$3", f = "EditorScreenNewImpl.kt", l = {380}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ PhotoEditorView $editor;
        int label;
        final /* synthetic */ h this$0;

        /* compiled from: EditorScreenNewImpl.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ h b;

            public a(h hVar) {
                this.b = hVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                Bitmap bitmap;
                ld7 ld7Var = (ld7) obj;
                if (ld7Var != null && (bitmap = ld7Var.a) != null) {
                    this.b.q.onNext(bitmap);
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PhotoEditorView photoEditorView, h hVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$editor = photoEditorView;
            this.this$0 = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$editor, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ttk0<ld7> resultBitmap = this.$editor.getResultBitmap();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (resultBitmap.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: EditorScreenNewImpl.kt */
    @b6l(c = "com.vk.attachpicker.screen.EditorScreenNewImpl$createView$2$4", f = "EditorScreenNewImpl.kt", l = {388}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ PhotoEditorView $editor;
        int label;
        final /* synthetic */ h this$0;

        /* compiled from: EditorScreenNewImpl.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ h b;

            public a(h hVar) {
                this.b = hVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                h hVar = this.b;
                i iVar = hVar.y;
                if (iVar instanceof i.a) {
                    ((i.a) iVar).getClass();
                    hVar.y = new i.a(booleanValue);
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PhotoEditorView photoEditorView, h hVar, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$editor = photoEditorView;
            this.this$0 = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$editor, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                utk0 utk0Var = this.$editor.L;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (utk0Var.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: EditorScreenNewImpl.kt */
    public static final class f implements n4p {
        @Override // xsna.n4p
        public final void a(Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }

        @Override // xsna.n4p
        public final void b(Object... objArr) {
            List asList = Arrays.asList(objArr);
            ArrayList arrayList = new ArrayList(c5g.u(asList, 10));
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            L.G((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Override // xsna.n4p
        public final void d(String str) {
            L.e(str);
        }
    }

    public /* synthetic */ h(zlw zlwVar, r4p r4pVar, t4p t4pVar, j34 j34Var, boolean z, com.vk.core.simplescreen.a aVar, String str, wzs wzsVar, s770 s770Var, SpoilerConfiguration spoilerConfiguration, int i) {
        this(zlwVar, r4pVar, t4pVar, j34Var, z, aVar, str, (i & 128) != 0 ? null : wzsVar, (i & 256) != 0 ? null : s770Var, (i & 512) != 0 ? new SpoilerConfiguration(false, false, false, false, false, null, 63, null) : spoilerConfiguration);
    }

    public static /* synthetic */ void n(h hVar) {
        hVar.m(t4p.a.c.a, new la0(12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.em6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View b(LayoutInflater layoutInflater) {
        boolean z;
        boolean z2;
        boolean z3;
        SpoilerConfiguration spoilerConfiguration;
        View view;
        ?? r1;
        int i;
        r4p r4pVar;
        zlw zlwVar = this.g;
        g4p g4pVar = new g4p(zlwVar.a());
        int i2 = 13;
        if (!a.a(g4pVar)) {
            i0q0.f(new l9h(this, i2));
            return layoutInflater.inflate(R.layout.picker_layout_photo_editor_invalid_image, (ViewGroup) null);
        }
        View inflate = layoutInflater.inflate(R.layout.picker_layout_photo_editor, (ViewGroup) null);
        final PhotoEditorView photoEditorView = (PhotoEditorView) bwt0.p(inflate, R.id.photoEditorView, null, null, 6);
        w3p w3pVar = photoEditorView.c;
        this.x = photoEditorView;
        ?? r8 = this.t;
        photoEditorView.setStatConsumer((o6a0) r8.getValue());
        u080 u080Var = new u080() { // from class: xsna.v4p
            @Override // xsna.u080
            public final bqx0 b(View view2, bqx0 bqx0Var) {
                nen h = bqx0Var.a.h();
                PhotoEditorView.this.setInsets(h4x.c(0, h != null ? h.a.getSafeInsetTop() : wqx0.c(bqx0Var).b, 0, 0));
                return bqx0.b;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(photoEditorView, u080Var);
        bwt0.g(photoEditorView, new maj(photoEditorView, 8));
        Pair pair = new Pair(ijo.a, Boolean.valueOf(((h7v) this.s.getValue()).m(HintId.PHOTO_EDITOR_ZOOM_IN_DRAW_ONBOARDING)));
        ?? r10 = this.J;
        boolean booleanValue = ((Boolean) r10.getValue()).booleanValue();
        ?? r13 = this.L;
        if (booleanValue) {
            ((gt20) r13.getValue()).getClass();
            z = true;
            z3 = 1;
            if (!Preference.j().getBoolean("photo_editor_ml_enhance_onboarding_shown", false)) {
                z2 = true;
                photoEditorView.setOnboardingConfiguration(new hd80(pn00.k(pair, new Pair(bt20.a, Boolean.valueOf(z2))), new tcn(this, 3)));
                com.vk.attachpicker.screen.filters.b bVar = new com.vk.attachpicker.screen.filters.b();
                spoilerConfiguration = this.p;
                if (spoilerConfiguration.b) {
                    view = inflate;
                } else {
                    cwn cwnVar = new cwn(new n1i(this, 4), spoilerConfiguration.e);
                    this.u = s2o.a.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tp0(new s6k(cwnVar, 11), 25));
                    view = inflate;
                    photoEditorView.G(new hmk0.a(spoilerConfiguration.d, spoilerConfiguration.c, cwnVar, new nvg(this, 17)));
                }
                photoEditorView.G(new fg5.a());
                photoEditorView.G(new b.a());
                r1 = this.I;
                if (((Boolean) r1.getValue()).booleanValue()) {
                    photoEditorView.G(new ColorGradingTool.b());
                }
                photoEditorView.G(new r2g.a((b) this.K.getValue()));
                photoEditorView.G(new wio.b(0));
                co00[] co00VarArr = new co00[2];
                xmo0 xmo0Var = xmo0.a;
                co00VarArr[0] = xmo0Var;
                t7l0 t7l0Var = t7l0.a;
                co00VarArr[z3] = t7l0Var;
                photoEditorView.G(new sf10.a(rl3.y0(co00VarArr)));
                photoEditorView.G(new a.c(new xeo0(this.w, 14)));
                photoEditorView.G(new s7l0.a(new d6l0(d(), (o6a0) r8.getValue())));
                photoEditorView.G(new gik.a(0));
                if (((Boolean) r10.getValue()).booleanValue()) {
                    photoEditorView.G(new c.a((gt20) r13.getValue()));
                }
                if (spoilerConfiguration.b) {
                    i = 0;
                } else {
                    i = 0;
                    PhotoEditorView.n(photoEditorView, jmk0.a, new f5p[0]);
                }
                PhotoEditorView.n(photoEditorView, hg5.a, new f5p[i]);
                PhotoEditorView.n(photoEditorView, jik.a, new f5p[i]);
                PhotoEditorView.n(photoEditorView, ler.a, new f5p[i]);
                if (((Boolean) r1.getValue()).booleanValue()) {
                    PhotoEditorView.n(photoEditorView, k6g.a, new f5p[i]);
                }
                if (((Boolean) this.H.getValue()).booleanValue()) {
                    PhotoEditorView.n(photoEditorView, y2g.a, new f5p[i]);
                }
                PhotoEditorView.n(photoEditorView, xmo0Var, new f5p[i]);
                PhotoEditorView.n(photoEditorView, hjo.a, new f5p[i]);
                PhotoEditorView.n(photoEditorView, t7l0Var, new f5p[i]);
                if (((Boolean) r10.getValue()).booleanValue()) {
                    PhotoEditorView.n(photoEditorView, ot20.a, new f5p[i]);
                }
                w3pVar.h.add(new heq0());
                w3pVar.i.add(new heq0());
                c cVar = new c(photoEditorView, this, null);
                hpj hpjVar = this.F;
                myc0.h(hpjVar, null, null, cVar, 3);
                myc0.h(hpjVar, null, null, new d(photoEditorView, this, null), 3);
                photoEditorView.setListener(new e(bVar, photoEditorView));
                f fVar = new f();
                photoEditorView.setLogger(fVar);
                photoEditorView.r(this.E, new rqu0(zlwVar, com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_IMAGE_LOADING_NATIVE_RES), fVar, this.o), bVar, null);
                r4pVar = this.h;
                if (r4pVar == null) {
                    photoEditorView.setImage(r4pVar);
                } else {
                    PhotoEditorView.J(photoEditorView, g4pVar);
                }
                o6a0 o6a0Var = (o6a0) r8.getValue();
                m6a0.b bVar2 = new m6a0.b(this.m);
                o6a0Var.getClass();
                ksk0.a(new wo1(13, bVar2, o6a0Var));
                ?? r12 = this.v;
                ((y1q0) r12.getValue()).b();
                ((y1q0) r12.getValue()).c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_EDITOR), z3);
                return view;
            }
        } else {
            z = true;
        }
        z2 = false;
        z3 = z;
        photoEditorView.setOnboardingConfiguration(new hd80(pn00.k(pair, new Pair(bt20.a, Boolean.valueOf(z2))), new tcn(this, 3)));
        com.vk.attachpicker.screen.filters.b bVar3 = new com.vk.attachpicker.screen.filters.b();
        spoilerConfiguration = this.p;
        if (spoilerConfiguration.b) {
        }
        photoEditorView.G(new fg5.a());
        photoEditorView.G(new b.a());
        r1 = this.I;
        if (((Boolean) r1.getValue()).booleanValue()) {
        }
        photoEditorView.G(new r2g.a((b) this.K.getValue()));
        photoEditorView.G(new wio.b(0));
        co00[] co00VarArr2 = new co00[2];
        xmo0 xmo0Var2 = xmo0.a;
        co00VarArr2[0] = xmo0Var2;
        t7l0 t7l0Var2 = t7l0.a;
        co00VarArr2[z3] = t7l0Var2;
        photoEditorView.G(new sf10.a(rl3.y0(co00VarArr2)));
        photoEditorView.G(new a.c(new xeo0(this.w, 14)));
        photoEditorView.G(new s7l0.a(new d6l0(d(), (o6a0) r8.getValue())));
        photoEditorView.G(new gik.a(0));
        if (((Boolean) r10.getValue()).booleanValue()) {
        }
        if (spoilerConfiguration.b) {
        }
        PhotoEditorView.n(photoEditorView, hg5.a, new f5p[i]);
        PhotoEditorView.n(photoEditorView, jik.a, new f5p[i]);
        PhotoEditorView.n(photoEditorView, ler.a, new f5p[i]);
        if (((Boolean) r1.getValue()).booleanValue()) {
        }
        if (((Boolean) this.H.getValue()).booleanValue()) {
        }
        PhotoEditorView.n(photoEditorView, xmo0Var2, new f5p[i]);
        PhotoEditorView.n(photoEditorView, hjo.a, new f5p[i]);
        PhotoEditorView.n(photoEditorView, t7l0Var2, new f5p[i]);
        if (((Boolean) r10.getValue()).booleanValue()) {
        }
        w3pVar.h.add(new heq0());
        w3pVar.i.add(new heq0());
        c cVar2 = new c(photoEditorView, this, null);
        hpj hpjVar2 = this.F;
        myc0.h(hpjVar2, null, null, cVar2, 3);
        myc0.h(hpjVar2, null, null, new d(photoEditorView, this, null), 3);
        photoEditorView.setListener(new e(bVar3, photoEditorView));
        f fVar2 = new f();
        photoEditorView.setLogger(fVar2);
        photoEditorView.r(this.E, new rqu0(zlwVar, com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_IMAGE_LOADING_NATIVE_RES), fVar2, this.o), bVar3, null);
        r4pVar = this.h;
        if (r4pVar == null) {
        }
        o6a0 o6a0Var2 = (o6a0) r8.getValue();
        m6a0.b bVar22 = new m6a0.b(this.m);
        o6a0Var2.getClass();
        ksk0.a(new wo1(13, bVar22, o6a0Var2));
        ?? r122 = this.v;
        ((y1q0) r122.getValue()).b();
        ((y1q0) r122.getValue()).c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_EDITOR), z3);
        return view;
    }

    @Override // xsna.em6
    public final void c() {
        i iVar = this.y;
        if (iVar instanceof i.b) {
            androidx.appcompat.app.d dVar = this.A;
            if (dVar != null) {
                dVar.dismiss();
            }
            qv20.b(this.B);
            this.A = null;
            this.B = null;
            n(this);
            return;
        }
        if (this.A != null) {
            return;
        }
        if (iVar instanceof i.a) {
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            if (((i.a) iVar).a) {
                PhotoEditorView photoEditorView = this.x;
                if (!epx.f(this.h, photoEditorView != null ? photoEditorView.getEditedImageState() : null)) {
                    int i = h7u0.p;
                    h7u0.a c2 = h7u0.b.c(d());
                    c2.g0(R.string.confirm);
                    c2.U(R.string.picker_editor_exit_confirm);
                    c2.c0(R.string.picker_yes, new w4p(ref$BooleanRef, 0));
                    c2.W(R.string.picker_no, null);
                    c2.a0(new DialogInterface.OnDismissListener() { // from class: xsna.x4p
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            com.vk.attachpicker.screen.h hVar = com.vk.attachpicker.screen.h.this;
                            hVar.A = null;
                            if (ref$BooleanRef.element) {
                                com.vk.attachpicker.screen.h.n(hVar);
                            }
                        }
                    });
                    this.A = c2.m();
                    return;
                }
            }
        }
        n(this);
        this.E.a();
        PhotoEditorView photoEditorView2 = this.x;
        if (photoEditorView2 != null) {
            photoEditorView2.setListener(null);
        }
        zvj.c(this.F, null);
    }

    @Override // xsna.em6
    public final void f(int i, Intent intent) {
        Bundle bundleExtra;
        ArrayList parcelableArrayList;
        if (i == 10666) {
            Uri uri = (intent == null || (bundleExtra = intent.getBundleExtra("result_attachments")) == null || (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) == null) ? null : (Uri) j5g.a0(parcelableArrayList);
            String path = uri != null ? uri.getPath() : null;
            asu0.a.getClass();
            asu0.j().execute(new y4p(uri, path, this, 0));
        }
    }

    @Override // xsna.em6
    public final boolean g() {
        PhotoEditorView photoEditorView = this.x;
        if (photoEditorView != null && photoEditorView.w()) {
            return true;
        }
        c();
        return true;
    }

    @Override // xsna.em6
    public final void h() {
        this.c = true;
        io.reactivex.rxjava3.disposables.c cVar = this.u;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.em6
    public final void i() {
        PhotoEditorView photoEditorView = this.x;
        if (photoEditorView != null) {
            photoEditorView.y();
        }
        this.d = false;
    }

    @Override // xsna.em6
    public final void j() {
        Window window;
        this.d = true;
        PhotoEditorView photoEditorView = this.x;
        if (photoEditorView != null) {
            photoEditorView.z();
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        int color = context.getColor(R.color.vk_black);
        com.vk.core.simplescreen.a aVar = this.l;
        if (aVar == null || (window = aVar.getWindow()) == null) {
            window = d().getWindow();
        }
        if (this.z == null) {
            this.z = window != null ? Integer.valueOf(window.getNavigationBarColor()) : null;
        }
        TypedValue typedValue = krv0.a;
        krv0.s(window, color);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void m(t4p.a aVar, gzs<s3q0> gzsVar) {
        Window window;
        Integer num = this.z;
        if (num != null) {
            int intValue = num.intValue();
            com.vk.core.simplescreen.a aVar2 = this.l;
            if (aVar2 == null || (window = aVar2.getWindow()) == null) {
                Activity d2 = d();
                window = d2 != null ? d2.getWindow() : null;
            }
            TypedValue typedValue = krv0.a;
            krv0.s(window, intValue);
        }
        t4p t4pVar = this.i;
        if (t4pVar != null) {
            t4pVar.a(aVar);
        }
        ((y1q0) this.v.getValue()).a();
        gzsVar.invoke();
        this.G.getClass();
        ((xsl) uh.b.b()).a("PhotoEditorClearImagesJob", new bic(new fyx()), new usl(WorkPolicy.REPLACE, TimeUnit.HOURS.toMillis(12L), 252));
        super.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14, types: [android.os.Parcelable] */
    public final void p(MediaStoreEntry mediaStoreEntry, r4p r4pVar, File file, Uri uri) {
        MediaStoreEntry mediaStoreEntry2;
        Uri f2;
        Parcelable parcelable;
        Object parcelableExtra;
        i iVar = this.y;
        if (iVar instanceof i.c) {
            i.c cVar = (i.c) iVar;
            g5p g5pVar = r4pVar.b.get(jmk0.a);
            dmk0 dmk0Var = g5pVar instanceof dmk0 ? (dmk0) g5pVar : null;
            boolean z = dmk0Var != null ? dmk0Var.a : false;
            boolean z2 = dmk0Var != null ? dmk0Var.b : false;
            t4p.a.f fVar = new t4p.a.f(z, z2);
            boolean z3 = cVar.a;
            r4p r4pVar2 = this.h;
            t4p.a c3718a = (z3 || r4pVar2 == null) ? !z3 ? t4p.a.d.a : (z3 && cVar.b) ? new t4p.a.C3718a(fVar) : (mediaStoreEntry == null || epx.f(r4pVar2, r4pVar)) ? t4p.a.c.a : new t4p.a.b(mediaStoreEntry, r4pVar, fVar) : t4p.a.e.a;
            if (!(c3718a instanceof t4p.a.c)) {
                if (this.k) {
                    Uri fromFile = Uri.fromFile(file);
                    r3 = new Intent();
                    r3.setData(fromFile);
                    q(fromFile);
                } else {
                    Intent a2 = b.a.a(Uri.fromFile(file), false, false);
                    if (uri != null) {
                        a2.putExtra("edited_content_uri", uri);
                    }
                    Activity d2 = d();
                    Intent intent = d2 != null ? d2.getIntent() : null;
                    if (intent != null) {
                        UserId userId = (UserId) intent.getParcelableExtra("owner_id");
                        int intExtra = intent.getIntExtra("post_id", 0);
                        a2.putExtra("owner_id", userId);
                        a2.putExtra("post_id", intExtra);
                        if (intent.hasExtra("original_content_uri")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelableExtra = intent.getParcelableExtra("original_content_uri", Uri.class);
                                parcelable = (Parcelable) parcelableExtra;
                            } else {
                                ?? parcelableExtra2 = intent.getParcelableExtra("original_content_uri");
                                parcelable = (Uri) (parcelableExtra2 instanceof Uri ? parcelableExtra2 : null);
                            }
                            Uri uri2 = (Uri) parcelable;
                            if (uri2 != null) {
                                a2.putExtra("original_content_uri", uri2);
                            }
                        }
                        i iVar2 = this.y;
                        if (iVar2 instanceof i.c) {
                            if (((i.c) iVar2).a) {
                                a2.putExtra("ProcessedImage", Uri.fromFile(file));
                                a2.putExtra("ImageWasChanged", true);
                            } else {
                                zlw zlwVar = this.g;
                                File file2 = zlwVar.b;
                                if ((file2 == null || a2.putExtra("ProcessedImage", Uri.fromFile(file2)) == null) && (mediaStoreEntry2 = zlwVar.a) != null && (f2 = mediaStoreEntry2.f()) != null) {
                                    a2.putExtra("ProcessedImage", f2);
                                }
                            }
                        }
                    }
                    Uri uri3 = (Uri) a2.getParcelableExtra("ProcessedImage");
                    if (uri3 != null) {
                        q(uri3);
                    }
                    q(Uri.fromFile(file));
                    if (z) {
                        a2.putExtra("spoiler_blur_enabled", true);
                    }
                    if (z2) {
                        a2.putExtra("spoiler_donate_enabled", true);
                    }
                    r3 = a2;
                }
            }
            m(c3718a, new cy0(12, r3, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void q(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            o6a0 o6a0Var = (o6a0) this.t.getValue();
            m6a0.a aVar = new m6a0.a(lastPathSegment);
            o6a0Var.getClass();
            ksk0.a(new wo1(13, aVar, o6a0Var));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(zlw zlwVar, r4p r4pVar, t4p t4pVar, j34 j34Var, boolean z, com.vk.core.simplescreen.a aVar, String str, wzs<? super Integer, ? super Intent, s3q0> wzsVar, s770 s770Var, SpoilerConfiguration spoilerConfiguration) {
        this.g = zlwVar;
        this.h = r4pVar;
        this.i = t4pVar;
        this.j = j34Var;
        this.k = z;
        this.l = aVar;
        this.m = str;
        this.n = wzsVar;
        this.o = s770Var;
        this.p = spoilerConfiguration;
        this.q = new io.reactivex.rxjava3.subjects.f<>();
        int i = 7;
        mxj mxjVar = new mxj(this, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r = msy.a(lazyThreadSafetyMode, mxjVar);
        this.s = msy.a(lazyThreadSafetyMode, new gbj(this, i));
        int i2 = 6;
        this.t = msy.a(lazyThreadSafetyMode, new u3k(this, i2));
        int i3 = 15;
        this.v = msy.a(lazyThreadSafetyMode, new nh0(i3));
        t5s[] t5sVarArr = hmo0.c;
        ArrayList arrayList = new ArrayList();
        for (t5s t5sVar : t5sVarArr) {
            if (t5sVar instanceof hmo0.c) {
                arrayList.add(t5sVar);
            }
        }
        int i4 = 10;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hmo0.c cVar = (hmo0.c) it.next();
            arrayList2.add(new jio0.a(cVar.i(), cVar.e, cVar.a(), cVar.d()));
        }
        this.w = arrayList2;
        this.y = new i.a(false);
        this.E = new wyt0();
        bdn bdnVar = bdn.a;
        this.F = zvj.a(ie00.a);
        this.G = new qiw();
        n5i n5iVar = new n5i(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        this.H = msy.a(lazyThreadSafetyMode2, n5iVar);
        this.I = msy.a(lazyThreadSafetyMode2, new f4(i3));
        this.J = msy.a(lazyThreadSafetyMode2, new com.vk.movika.sdk.base.logic.interactor.g(14));
        this.K = new bpn0(new ecm(this, i2));
        this.L = msy.a(lazyThreadSafetyMode2, new m1i(this, i4));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }

    /* compiled from: EditorScreenNewImpl.kt */
    public static final class e implements m4p {
        public final /* synthetic */ com.vk.attachpicker.screen.filters.b b;
        public final /* synthetic */ PhotoEditorView c;

        public e(com.vk.attachpicker.screen.filters.b bVar, PhotoEditorView photoEditorView) {
            this.b = bVar;
            this.c = photoEditorView;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x014d, code lost:
        
            if (r6.equals(r7) == false) goto L31;
         */
        @Override // xsna.m4p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(r4p r4pVar) {
            jmk0 jmk0Var;
            boolean z;
            com.vk.core.view.components.spinner.c cVar;
            h hVar = h.this;
            if (hVar.y instanceof i.c) {
                L.e("VkPhotoEditorLog", "EditorListener::onEditComplete: return cause it's rendering");
                return;
            }
            PhotoEditorView photoEditorView = this.c;
            if (!photoEditorView.o()) {
                L.e("VkPhotoEditorLog", "EditorListener::onEditComplete: cannot render result image");
                return;
            }
            L.e("VkPhotoEditorLog", "EditorListener::onEditComplete: start render");
            zlw zlwVar = hVar.g;
            r4p r4pVar2 = hVar.h;
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = System.currentTimeMillis();
            L.e("VkPhotoEditorLog", "renderAndFinish: start");
            Activity d = hVar.d();
            if (d == null || p90.e(d)) {
                return;
            }
            com.vk.core.view.components.spinner.c e = qv20.e(d, Integer.valueOf(R.string.picker_saving));
            e.setCanceledOnTouchOutside(false);
            hVar.B = e;
            o2 t0 = hVar.q.t0(1L);
            asu0.a.getClass();
            m1 a0 = t0.r0(asu0.i()).a0(asu0.i()).U(new l7(new ysd(ref$LongRef, hVar, r4pVar, 3), 20)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            pp3 pp3Var = new pp3(new ij8(11, hVar, r4pVar), 19);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            itg0.a(d, new a0(new n1(a0.E(pp3Var, lVar, kVar, kVar).F(new b60(new n3i(hVar, 13), 25)), io.reactivex.rxjava3.internal.functions.a.g), new jad(hVar, 1)).subscribe());
            Map<f5p, g5p> map = r4pVar.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<f5p, g5p>> it = map.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                jmk0Var = jmk0.a;
                if (!hasNext) {
                    break;
                }
                Map.Entry<f5p, g5p> next = it.next();
                if (!epx.f(next.getKey(), jmk0Var)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            if (r4pVar2 != null) {
                Map<f5p, g5p> map2 = r4pVar2.b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<f5p, g5p> entry : map2.entrySet()) {
                    if (!epx.f(entry.getKey(), jmk0Var)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (!linkedHashMap.isEmpty()) {
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    if (!((g5p) ((Map.Entry) it2.next()).getValue()).I()) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            boolean a = hVar.y.a();
            hVar.y = new i.c(a, z);
            boolean z2 = !(!a || z || epx.f(r4pVar2, r4pVar)) || zlwVar.b == null;
            if (z2 && (cVar = hVar.B) != null) {
                cVar.show();
            }
            L.e("VkPhotoEditorLog", zy60.c("renderAndFinish: shouldRender=", " onlySpoilerChanged=", z2, z));
            if (z2) {
                photoEditorView.H();
            }
            this.b.h();
            s3q0 s3q0Var = s3q0.a;
            if (z2) {
                return;
            }
            hVar.p(null, r4pVar, zlwVar.b, null);
        }

        @Override // xsna.m4p
        public final void c() {
            h.this.g();
            this.b.h();
        }

        @Override // xsna.m4p
        public final void onLowMemory() {
            i.b bVar = i.b.a;
            h hVar = h.this;
            hVar.y = bVar;
            cvk.u(R.string.photo_editor_finish_due_to_low_memory_error, false);
            hVar.c();
            lht.a.a();
        }

        @Override // xsna.m4p
        public final void b(boolean z) {
        }
    }

    public h(zlw zlwVar, r4p r4pVar, t4p t4pVar, j34 j34Var, boolean z, com.vk.core.simplescreen.a aVar, String str, s770 s770Var) {
        this(zlwVar, r4pVar, t4pVar, j34Var, z, aVar, str, null, s770Var, null, 512);
    }
}
