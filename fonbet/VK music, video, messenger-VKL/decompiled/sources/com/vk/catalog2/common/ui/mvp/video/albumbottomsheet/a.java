package com.vk.catalog2.common.ui.mvp.video.albumbottomsheet;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a0u;
import xsna.b6l;
import xsna.gzg0;
import xsna.k6r0;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: VideoCatalogAlbumBottomSheetRedesign.kt */
@b6l(c = "com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign$toggleSubscriptionRequest$2", f = "VideoCatalogAlbumBottomSheetRedesign.kt", l = {272}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class a extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
    final /* synthetic */ boolean $shouldSubscribe;
    int label;
    final /* synthetic */ VideoCatalogAlbumBottomSheetRedesign this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(VideoCatalogAlbumBottomSheetRedesign videoCatalogAlbumBottomSheetRedesign, boolean z, spj<? super a> spjVar) {
        super(2, spjVar);
        this.this$0 = videoCatalogAlbumBottomSheetRedesign;
        this.$shouldSubscribe = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new a(this.this$0, this.$shouldSubscribe, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
        return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        VideoCatalogAlbumBottomSheetRedesign.a aVar = this.this$0.a;
        VideoAlbum videoAlbum = aVar.a;
        UserId userId = videoAlbum.c;
        int i2 = videoAlbum.b;
        String str = aVar.c;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        UiTracker uiTracker = UiTracker.a;
        a0u a0uVar = new a0u(userId, i2, str2, UiTracker.d(), this.$shouldSubscribe, 32);
        this.label = 1;
        gzg0 gzg0Var = new gzg0(s7s0.c(this));
        try {
            int i3 = k6r0.a;
            gzg0Var.resumeWith(a0uVar.f(null));
        } catch (VKApiExecutionException e) {
            if (e.V()) {
                int i4 = k6r0.a;
                throw null;
            }
            gzg0Var.resumeWith(new Result.Failure(e));
        }
        Object a = gzg0Var.a();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
