package com.vk.attachpicker.screen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.vk.attachpicker.screen.i;
import com.vk.medianative.MediaImageEncoder;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.photo.editor.PhotoEditorView;
import com.vkontakte.android.R;
import java.io.File;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import xsna.b6l;
import xsna.bdn;
import xsna.cvk;
import xsna.e43;
import xsna.epx;
import xsna.g1h0;
import xsna.ge00;
import xsna.hua;
import xsna.ie00;
import xsna.kjw;
import xsna.ksr;
import xsna.lsr;
import xsna.myc0;
import xsna.p4q;
import xsna.qv20;
import xsna.r4p;
import xsna.s3q0;
import xsna.spj;
import xsna.utk0;
import xsna.wzs;
import xsna.yvj;
import xsna.yzs;
import xsna.z4g;
import xsna.zlw;

/* compiled from: CollageEditorScreen.kt */
@b6l(c = "com.vk.attachpicker.screen.CollageEditorScreen$renderAndFinish$2", f = "CollageEditorScreen.kt", l = {399, 404}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class CollageEditorScreen$renderAndFinish$2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ r4p $stateToSave;
    int label;
    final /* synthetic */ f this$0;

    /* compiled from: CollageEditorScreen.kt */
    @b6l(c = "com.vk.attachpicker.screen.CollageEditorScreen$renderAndFinish$2$2", f = "CollageEditorScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<lsr<? super g1h0>, Throwable, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, spj<? super a> spjVar) {
            super(3, spjVar);
            this.this$0 = fVar;
        }

        @Override // xsna.yzs
        public final Object invoke(lsr<? super g1h0> lsrVar, Throwable th, spj<? super s3q0> spjVar) {
            a aVar = new a(this.this$0, spjVar);
            aVar.L$0 = th;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            com.vk.metrics.eventtracking.b.a.a(th);
            cvk.u(R.string.picker_saving_error, false);
            this.this$0.u = null;
            return s3q0.a;
        }
    }

    /* compiled from: CollageEditorScreen.kt */
    public static final class b<T> implements lsr {
        public final /* synthetic */ f b;
        public final /* synthetic */ r4p c;

        public b(f fVar, r4p r4pVar) {
            this.b = fVar;
            this.c = r4pVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            g1h0 g1h0Var = (g1h0) obj;
            File file = g1h0Var.a;
            MediaStoreEntry mediaStoreEntry = g1h0Var.b;
            Uri uri = g1h0Var.c;
            bdn bdnVar = bdn.a;
            Object k = myc0.k(ie00.a, new com.vk.attachpicker.screen.c(this.b, mediaStoreEntry, this.c, file, uri, null), spjVar);
            return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
        }
    }

    /* compiled from: CollageEditorScreen.kt */
    @b6l(c = "com.vk.attachpicker.screen.CollageEditorScreen$renderAndFinish$2$4", f = "CollageEditorScreen.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f fVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            utk0 utk0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            f fVar = this.this$0;
            PhotoEditorView photoEditorView = fVar.p;
            fVar.q = new i.a((photoEditorView == null || (utk0Var = photoEditorView.L) == null) ? false : ((Boolean) utk0Var.getValue()).booleanValue());
            qv20.b(this.this$0.u);
            this.this$0.u = null;
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollageEditorScreen$renderAndFinish$2(f fVar, r4p r4pVar, spj<? super CollageEditorScreen$renderAndFinish$2> spjVar) {
        super(2, spjVar);
        this.this$0 = fVar;
        this.$stateToSave = r4pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new CollageEditorScreen$renderAndFinish$2(this.this$0, this.$stateToSave, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((CollageEditorScreen$renderAndFinish$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (xsna.myc0.k(r8, r1, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final hua huaVar = new hua(this.this$0.o, true);
            final f fVar = this.this$0;
            final r4p r4pVar = this.$stateToSave;
            FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new ksr<g1h0>() { // from class: com.vk.attachpicker.screen.CollageEditorScreen$renderAndFinish$2$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.attachpicker.screen.CollageEditorScreen$renderAndFinish$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;
                    public final /* synthetic */ f c;
                    public final /* synthetic */ r4p d;

                    @b6l(c = "com.vk.attachpicker.screen.CollageEditorScreen$renderAndFinish$2$invokeSuspend$$inlined$map$1$2", f = "CollageEditorScreen.kt", l = {50}, m = "emit")
                    /* renamed from: com.vk.attachpicker.screen.CollageEditorScreen$renderAndFinish$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(spj spjVar) {
                            super(spjVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(lsr lsrVar, f fVar, r4p r4pVar) {
                        this.b = lsrVar;
                        this.c = fVar;
                        this.d = r4pVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                    @Override // xsna.lsr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, spj spjVar) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        boolean z;
                        MediaStoreImageEntry mediaStoreImageEntry;
                        Object failure;
                        if (spjVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) spjVar;
                            int i2 = anonymousClass1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    kotlin.a.a(obj2);
                                    Bitmap bitmap = (Bitmap) obj;
                                    f fVar = this.c;
                                    zlw zlwVar = fVar.g;
                                    i iVar = fVar.q;
                                    if ((iVar instanceof i.c) && ((!((i.c) iVar).a || epx.f(fVar.h, this.d)) && zlwVar.b == null)) {
                                        Context context = e43.a;
                                        if (context == null) {
                                            context = null;
                                        }
                                        MediaStoreEntry mediaStoreEntry = zlwVar.a;
                                        com.vk.core.files.a.i(context, mediaStoreEntry != null ? mediaStoreEntry.f() : null);
                                    }
                                    File s = com.vk.core.files.a.s();
                                    if (!MediaImageEncoder.INSTANCE.encodeJpegWithoutCompression(bitmap, s)) {
                                        throw new IllegalStateException("Can't render bitmap to jpeg");
                                    }
                                    try {
                                        Context context2 = e43.a;
                                        if (context2 == null) {
                                            context2 = null;
                                        }
                                        kjw.a(context2, Uri.fromFile(new File(zlwVar.a())), Uri.fromFile(s), e43.l("GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef"));
                                    } catch (Throwable th) {
                                        com.vk.metrics.eventtracking.b.a.a(th);
                                    }
                                    try {
                                        z = s.exists();
                                    } catch (SecurityException unused) {
                                        z = false;
                                    }
                                    if (z) {
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        BitmapFactory.decodeFile(s.getAbsolutePath(), options);
                                        int d = new p4q(s.getAbsolutePath()).d(0, "Orientation");
                                        Uri fromFile = Uri.fromFile(s);
                                        int i3 = options.outWidth;
                                        int i4 = options.outHeight;
                                        try {
                                            failure = Long.valueOf(s.lastModified());
                                        } catch (Throwable th2) {
                                            failure = new Result.Failure(th2);
                                        }
                                        if (Result.a(failure) != null) {
                                            failure = -1L;
                                        }
                                        mediaStoreImageEntry = new MediaStoreImageEntry(-1, fromFile, -1L, i3, i4, ((Number) failure).longValue(), z4g.f(s), d);
                                    } else {
                                        mediaStoreImageEntry = null;
                                    }
                                    g1h0 g1h0Var = new g1h0(s, mediaStoreImageEntry, null);
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if (this.b.emit(g1h0Var, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.a.a(obj2);
                                }
                                return s3q0.a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(spjVar);
                        Object obj22 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return s3q0.a;
                    }
                }

                @Override // xsna.ksr
                public final Object collect(lsr<? super g1h0> lsrVar, spj spjVar) {
                    Object collect = hua.this.collect(new AnonymousClass2(lsrVar, fVar, r4pVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            }), new a(fVar, null));
            b bVar = new b(this.this$0, this.$stateToSave);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        bdn bdnVar = bdn.a;
        ge00 ge00Var = ie00.a;
        c cVar = new c(this.this$0, null);
        this.label = 2;
    }
}
