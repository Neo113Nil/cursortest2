package com.vk.photo.editor.features.mlenhance;

import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.mlenhance.MlEnhanceDelegate;
import com.vk.photo.editor.features.mlenhance.b;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b4p;
import xsna.b6l;
import xsna.bdn;
import xsna.d0u0;
import xsna.e4p;
import xsna.f4p;
import xsna.f5p;
import xsna.g5p;
import xsna.g5z;
import xsna.ge00;
import xsna.i4p;
import xsna.ie00;
import xsna.ld7;
import xsna.myc0;
import xsna.o3p;
import xsna.rsz;
import xsna.s3q0;
import xsna.sdr;
import xsna.spj;
import xsna.v3p;
import xsna.wae0;
import xsna.wzs;
import xsna.yok0;
import xsna.yvj;
import xsna.zdl;

/* compiled from: MlEnhanceTool.kt */
/* loaded from: classes4.dex */
public final class d implements MlEnhanceDelegate.a {
    public final /* synthetic */ c a;
    public final /* synthetic */ Map<f5p, g5p> b;
    public final /* synthetic */ Bitmap c;

    /* compiled from: MlEnhanceTool.kt */
    @b6l(c = "com.vk.photo.editor.features.mlenhance.MlEnhanceTool$doEnhance$1$onSuccess$1", f = "MlEnhanceTool.kt", l = {353, 365, 367}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ e4p $enhancedLink;
        final /* synthetic */ Bitmap $originalBitmap;
        final /* synthetic */ Map<f5p, g5p> $restParams;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ c this$0;
        final /* synthetic */ d this$1;

        /* compiled from: MlEnhanceTool.kt */
        @b6l(c = "com.vk.photo.editor.features.mlenhance.MlEnhanceTool$doEnhance$1$onSuccess$1$1", f = "MlEnhanceTool.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.vk.photo.editor.features.mlenhance.d$a$a, reason: collision with other inner class name */
        public static final class C1465a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ Ref$ObjectRef<Bitmap> $enhancedPreviewBitmap;
            final /* synthetic */ Bitmap $originalBitmap;
            int label;
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1465a(c cVar, Ref$ObjectRef<Bitmap> ref$ObjectRef, Bitmap bitmap, spj<? super C1465a> spjVar) {
                super(2, spjVar);
                this.this$0 = cVar;
                this.$enhancedPreviewBitmap = ref$ObjectRef;
                this.$originalBitmap = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C1465a(this.this$0, this.$enhancedPreviewBitmap, this.$originalBitmap, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C1465a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                c cVar = this.this$0;
                if (!cVar.f) {
                    return s3q0.a;
                }
                cVar.c.b().b(b.d.a);
                c cVar2 = this.this$0;
                rsz rszVar = cVar2.j;
                if (rszVar != null) {
                    d0u0.a(rszVar.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L), new sdr(cVar2, this.$enhancedPreviewBitmap, this.$originalBitmap, 2)).start();
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c cVar, e4p e4pVar, d dVar, Map<f5p, ? extends g5p> map, Bitmap bitmap, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = cVar;
            this.$enhancedLink = e4pVar;
            this.this$1 = dVar;
            this.$restParams = map;
            this.$originalBitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$enhancedLink, this.this$1, this.$restParams, this.$originalBitmap, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
        
            if (xsna.qsl.b(800, r12) != r0) goto L37;
         */
        /* JADX WARN: Type inference failed for: r13v11, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r6v2, types: [T, android.graphics.Bitmap] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            o3p c;
            Ref$ObjectRef ref$ObjectRef;
            Ref$ObjectRef ref$ObjectRef2;
            o3p o3pVar;
            o3p o3pVar2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                try {
                    b4p u = this.this$0.c.u();
                    e4p e4pVar = this.$enhancedLink;
                    c = u.c(e4pVar, f4p.a(e4pVar, false));
                    if (c == null) {
                        c = null;
                    }
                    if (c == null) {
                        return s3q0.a;
                    }
                    ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = c.c.a;
                    if (!this.$restParams.isEmpty()) {
                        zdl i2 = this.this$0.c.i();
                        e4p e4pVar2 = this.$enhancedLink;
                        i4p i4pVar = new i4p(e4pVar2, e4pVar2, 4);
                        Map<f5p, g5p> map = this.$restParams;
                        Integer num = new Integer(2560);
                        this.L$0 = c;
                        this.L$1 = ref$ObjectRef;
                        this.label = 1;
                        Object a = i2.a(i4pVar, map, num, this);
                        if (a != coroutineSingletons) {
                            o3p o3pVar3 = c;
                            ref$ObjectRef2 = ref$ObjectRef;
                            obj = a;
                            o3pVar = o3pVar3;
                        }
                        return coroutineSingletons;
                    }
                    this.L$0 = c;
                    this.L$1 = ref$ObjectRef;
                    this.label = 2;
                } catch (Throwable unused) {
                    c cVar = this.this$1.a;
                    v3p v3pVar = cVar.c;
                    v3pVar.o(4000L, v3pVar.x().getString(R.string.editor_ml_enhance_error));
                    cVar.c.c(false);
                    return s3q0.a;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o3pVar2 = (o3p) this.L$0;
                        kotlin.a.a(obj);
                        this.this$0.o = o3pVar2;
                        return s3q0.a;
                    }
                    Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                    o3p o3pVar4 = (o3p) this.L$0;
                    kotlin.a.a(obj);
                    ref$ObjectRef = ref$ObjectRef3;
                    c = o3pVar4;
                    bdn bdnVar = bdn.a;
                    ge00 ge00Var = ie00.a;
                    C1465a c1465a = new C1465a(this.this$0, ref$ObjectRef, this.$originalBitmap, null);
                    this.L$0 = c;
                    this.L$1 = null;
                    this.label = 3;
                    if (myc0.k(ge00Var, c1465a, this) != coroutineSingletons) {
                        o3pVar2 = c;
                        this.this$0.o = o3pVar2;
                        return s3q0.a;
                    }
                    return coroutineSingletons;
                }
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                o3pVar = (o3p) this.L$0;
                kotlin.a.a(obj);
            }
            ld7 ld7Var = obj instanceof ld7 ? (ld7) obj : null;
            if (ld7Var == null) {
                return s3q0.a;
            }
            ref$ObjectRef2.element = ld7Var.a;
            ref$ObjectRef = ref$ObjectRef2;
            c = o3pVar;
            this.L$0 = c;
            this.L$1 = ref$ObjectRef;
            this.label = 2;
        }
    }

    public d(c cVar, HashMap hashMap, Bitmap bitmap) {
        this.a = cVar;
        this.b = hashMap;
        this.c = bitmap;
    }

    @Override // com.vk.photo.editor.features.mlenhance.MlEnhanceDelegate.a
    public final void a(e4p e4pVar) {
        yok0 yok0Var;
        c cVar = this.a;
        if (cVar.f) {
            rsz rszVar = cVar.j;
            if (rszVar != null) {
                wae0 wae0Var = rszVar.f;
                if (wae0Var != null) {
                    wae0Var.b = 1.0f;
                    wae0Var.a.invoke(Float.valueOf(1.0f));
                    yok0 yok0Var2 = wae0Var.c;
                    if (yok0Var2 != null) {
                        yok0Var2.b(null);
                    }
                }
                wae0 wae0Var2 = rszVar.f;
                if (wae0Var2 != null && (yok0Var = wae0Var2.c) != null) {
                    yok0Var.b(null);
                }
                rszVar.e.c();
            }
            myc0.h(g5z.a(cVar.c.w()), bdn.b, null, new a(this.a, e4pVar, this, this.b, this.c, null), 2);
        }
    }

    @Override // com.vk.photo.editor.features.mlenhance.MlEnhanceDelegate.a
    public final void onError() {
        c cVar = this.a;
        v3p v3pVar = cVar.c;
        v3pVar.o(4000L, v3pVar.x().getString(R.string.editor_ml_enhance_error));
        cVar.c.c(false);
    }
}
