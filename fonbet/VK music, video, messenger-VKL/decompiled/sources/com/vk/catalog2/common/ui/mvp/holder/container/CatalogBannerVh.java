package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.movika.sdk.base.logic.interactor.f;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bdn;
import xsna.dzr0;
import xsna.ezr0;
import xsna.gko;
import xsna.hn9;
import xsna.hpj;
import xsna.hqu0;
import xsna.i1a;
import xsna.iah0;
import xsna.ie00;
import xsna.iyx;
import xsna.j5g;
import xsna.myc0;
import xsna.oq;
import xsna.ovj;
import xsna.q3a;
import xsna.qhv0;
import xsna.s3q0;
import xsna.spj;
import xsna.tlo0;
import xsna.tyr0;
import xsna.vlw;
import xsna.vyr0;
import xsna.wga;
import xsna.wx0;
import xsna.wzs;
import xsna.xga;
import xsna.y90;
import xsna.yok0;
import xsna.yvj;
import xsna.z90;
import xsna.zvj;

/* compiled from: CatalogBannerVh.kt */
/* loaded from: classes16.dex */
public final class CatalogBannerVh implements CatalogViewHolder {
    public final wga b;
    public final q3a c;
    public final vyr0 d;
    public final com.vk.libvideo.adfree.api.di.a e;
    public final tyr0 f;
    public final hpj g;
    public VkBanner h;
    public yok0 i;

    /* compiled from: CatalogBannerVh.kt */
    @b6l(c = "com.vk.catalog2.common.ui.mvp.holder.container.CatalogBannerVh$bindData$1$7$1", f = "CatalogBannerVh.kt", l = {125}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* compiled from: CatalogBannerVh.kt */
        @b6l(c = "com.vk.catalog2.common.ui.mvp.holder.container.CatalogBannerVh$bindData$1$7$1$1", f = "CatalogBannerVh.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE}, m = "invokeSuspend")
        /* renamed from: com.vk.catalog2.common.ui.mvp.holder.container.CatalogBannerVh$a$a, reason: collision with other inner class name */
        public static final class C0498a extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends dzr0>>, Object> {
            int label;
            final /* synthetic */ CatalogBannerVh this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0498a(CatalogBannerVh catalogBannerVh, spj<? super C0498a> spjVar) {
                super(2, spjVar);
                this.this$0 = catalogBannerVh;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C0498a(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super Result<? extends dzr0>> spjVar) {
                return ((C0498a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    vyr0 vyr0Var = this.this$0.d;
                    this.label = 1;
                    b = vyr0Var.b(this);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    b = ((Result) obj).d();
                }
                return new Result(b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return CatalogBannerVh.this.new a(this.$context, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ovj b = hqu0.b();
                C0498a c0498a = new C0498a(CatalogBannerVh.this, null);
                this.label = 1;
                obj = myc0.k(b, c0498a, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            Object d = ((Result) obj).d();
            CatalogBannerVh catalogBannerVh = CatalogBannerVh.this;
            Context context = this.$context;
            if (!(d instanceof Result.Failure)) {
                String a = ezr0.a((dzr0) d);
                if (a == null) {
                    return s3q0.a;
                }
                catalogBannerVh.e.b(context, a);
            }
            return s3q0.a;
        }
    }

    public CatalogBannerVh(xga xgaVar, q3a q3aVar, vyr0 vyr0Var, com.vk.libvideo.adfree.api.di.a aVar, tyr0 tyr0Var) {
        this.b = xgaVar;
        this.c = q3aVar;
        this.d = vyr0Var;
        this.e = aVar;
        this.f = tyr0Var;
        bdn bdnVar = bdn.a;
        this.g = zvj.a(ie00.a.U().plus(iyx.a()));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        zvj.c(this.g, null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkBanner vkBanner;
        ArrayList arrayList;
        ImageSize imageSize;
        UIBlockPlaceholder uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
        if (uIBlockPlaceholder == null || (vkBanner = this.h) == null) {
            return;
        }
        this.f.b();
        Context context = vkBanner.getContext();
        vkBanner.m85setSemanticsConfigurationlkKuBUQ(com.vk.core.compose.component.semantics.b.a(null, new y90(5), 3));
        tlo0.h d = oq.d(tlo0.Companion, uIBlockPlaceholder.A);
        String str = uIBlockPlaceholder.D;
        vkBanner.setMiddle(new VkBanner.e(d, null, str != null ? new VkBanner.e.a.b(new tlo0.h(str)) : null, null, null, com.vk.core.compose.component.semantics.b.a(null, new f(5), 3), 58));
        Image image = uIBlockPlaceholder.B;
        vkBanner.setTrailingImage((image == null || (arrayList = image.b) == null || (imageSize = (ImageSize) j5g.a0(arrayList)) == null) ? null : new vlw(imageSize.d.d, qhv0.f.a));
        vkBanner.setAfter(new VkBanner.a.b(new wx0(3, this, uIBlock), null, com.vk.core.compose.component.semantics.b.a(null, new z90(8), 3), new VkBanner.a.b.C0805a(new gko(R.drawable.vk_icon_dismiss_dark_24), null), 2));
        vkBanner.setOnClick(new hn9(2, this, context));
        this.d.c(new i1a(this, uIBlock));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkBanner vkBanner = new VkBanner(layoutInflater.getContext(), null, 6);
        vkBanner.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        float f = 16;
        vkBanner.setPadding(iah0.a(f), iah0.a(12), iah0.a(f), iah0.a(8));
        this.h = vkBanner;
        return vkBanner;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
