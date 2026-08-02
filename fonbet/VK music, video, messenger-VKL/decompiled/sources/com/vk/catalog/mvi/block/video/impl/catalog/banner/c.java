package com.vk.catalog.mvi.block.video.impl.catalog.banner;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b2a;
import xsna.b6l;
import xsna.dzr0;
import xsna.ezr0;
import xsna.s3q0;
import xsna.spj;
import xsna.vyr0;
import xsna.wzs;
import xsna.yvj;
import xsna.yyr0;

/* compiled from: CatalogBannerView.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView$InlineActor$onAction$1$1", f = "CatalogBannerView.kt", l = {Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ CatalogBannerView.b $action;
    int label;
    final /* synthetic */ CatalogBannerView.d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CatalogBannerView.d dVar, CatalogBannerView.b bVar, spj<? super c> spjVar) {
        super(2, spjVar);
        this.this$0 = dVar;
        this.$action = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c(this.this$0, this.$action, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            vyr0 vyr0Var = this.this$0.c;
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
        final CatalogBannerView.d dVar = this.this$0;
        CatalogBannerView.b bVar = this.$action;
        if (!(b instanceof Result.Failure)) {
            String a = ezr0.a((dzr0) b);
            if (a == null) {
                return s3q0.a;
            }
            dVar.c.c(new yyr0() { // from class: com.vk.catalog.mvi.block.video.impl.catalog.banner.b
                @Override // xsna.yyr0
                public final void a() {
                    CatalogBannerView.d dVar2 = CatalogBannerView.d.this;
                    dVar2.c.c(null);
                    String str = ((CatalogBannerView.State) ((b2a) dVar2.b.b).getCurrentState()).d;
                    if (str != null) {
                        dVar2.a(str);
                    }
                }
            });
            dVar.t(new CatalogBannerView.c.a(new BlockId.Simple(((CatalogBannerView.b.a) bVar).b), a));
        }
        return s3q0.a;
    }
}
