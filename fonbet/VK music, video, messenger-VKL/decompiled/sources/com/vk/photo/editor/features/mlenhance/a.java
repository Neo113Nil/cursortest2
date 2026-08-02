package com.vk.photo.editor.features.mlenhance;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.j;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.mlenhance.MlEnhanceDelegate;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bdn;
import xsna.d0u0;
import xsna.ge00;
import xsna.ie00;
import xsna.myc0;
import xsna.qg1;
import xsna.s3q0;
import xsna.spj;
import xsna.v3p;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;

/* compiled from: HelpViewController.kt */
/* loaded from: classes4.dex */
public final class a {
    public final v3p a;
    public final ViewGroup b;
    public final MlEnhanceDelegate c;
    public final j d;
    public boolean e;
    public View f;
    public ViewGroup g;
    public boolean h;

    /* compiled from: HelpViewController.kt */
    @b6l(c = "com.vk.photo.editor.features.mlenhance.HelpViewController$loadImage$1$1", f = "HelpViewController.kt", l = {120, Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend")
    /* renamed from: com.vk.photo.editor.features.mlenhance.a$a, reason: collision with other inner class name */
    public static final class C1462a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ WeakReference<ImageView> $imageView;
        final /* synthetic */ MlEnhanceDelegate.OnboardingResource $pic;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* compiled from: HelpViewController.kt */
        @b6l(c = "com.vk.photo.editor.features.mlenhance.HelpViewController$loadImage$1$1$1$1$1", f = "HelpViewController.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.vk.photo.editor.features.mlenhance.a$a$a, reason: collision with other inner class name */
        public static final class C1463a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ Bitmap $bitmap;
            final /* synthetic */ WeakReference<ImageView> $imageView;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1463a(WeakReference<ImageView> weakReference, Bitmap bitmap, spj<? super C1463a> spjVar) {
                super(2, spjVar);
                this.$imageView = weakReference;
                this.$bitmap = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C1463a(this.$imageView, this.$bitmap, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C1463a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                ImageView imageView = this.$imageView.get();
                if (imageView == null) {
                    return null;
                }
                imageView.setImageBitmap(this.$bitmap);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1462a(MlEnhanceDelegate.OnboardingResource onboardingResource, WeakReference<ImageView> weakReference, spj<? super C1462a> spjVar) {
            super(2, spjVar);
            this.$pic = onboardingResource;
            this.$imageView = weakReference;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            C1462a c1462a = a.this.new C1462a(this.$pic, this.$imageView, spjVar);
            c1462a.L$0 = obj;
            return c1462a;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((C1462a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        
            if (r9 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            WeakReference<ImageView> weakReference;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.a.a(obj);
                a aVar = a.this;
                MlEnhanceDelegate.OnboardingResource onboardingResource = this.$pic;
                WeakReference<ImageView> weakReference2 = this.$imageView;
                MlEnhanceDelegate mlEnhanceDelegate = aVar.c;
                this.L$0 = null;
                this.L$1 = weakReference2;
                this.L$2 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = mlEnhanceDelegate.e(onboardingResource, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = 0;
                weakReference = weakReference2;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                i = this.I$0;
                weakReference = (WeakReference) this.L$1;
                kotlin.a.a(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                bdn bdnVar = bdn.a;
                ge00 ge00Var = ie00.a;
                C1463a c1463a = new C1463a(weakReference, bitmap, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 2;
                obj = myc0.k(ge00Var, c1463a, this);
            }
            return s3q0.a;
        }
    }

    public a(v3p v3pVar, FrameLayout frameLayout, MlEnhanceDelegate mlEnhanceDelegate, j jVar) {
        this.a = v3pVar;
        this.b = frameLayout;
        this.c = mlEnhanceDelegate;
        this.d = jVar;
    }

    public final void a(boolean z) {
        View view;
        ViewGroup viewGroup;
        if (!this.e || this.h || (view = this.f) == null || (viewGroup = this.g) == null) {
            return;
        }
        ViewGroup viewGroup2 = this.b;
        if (z) {
            this.h = true;
            viewGroup.animate().translationY(viewGroup2.getHeight()).setDuration(250L).start();
            d0u0.a(view.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).setStartDelay(300L), new qg1(12, this, view)).start();
        } else {
            viewGroup2.removeView(view);
        }
        this.e = false;
    }

    public final void b(int i, MlEnhanceDelegate.OnboardingResource onboardingResource) {
        View view = this.f;
        WeakReference weakReference = new WeakReference(view != null ? (ImageView) view.findViewById(i) : null);
        bdn bdnVar = bdn.a;
        myc0.h(this.d, wgl.c, null, new C1462a(onboardingResource, weakReference, null), 2);
    }
}
