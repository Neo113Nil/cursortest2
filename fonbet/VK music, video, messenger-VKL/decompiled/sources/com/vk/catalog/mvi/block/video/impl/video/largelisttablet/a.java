package com.vk.catalog.mvi.block.video.impl.video.largelisttablet;

import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;
import com.vk.dto.common.VideoFile;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ape0;
import xsna.b2a;
import xsna.b6l;
import xsna.epx;
import xsna.ksr;
import xsna.lsr;
import xsna.m7a;
import xsna.s3q0;
import xsna.spj;
import xsna.sxm0;
import xsna.wzs;
import xsna.y4a;
import xsna.yvj;

/* compiled from: VideoLargeListTabletView.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView$InlineActor$1", f = "VideoLargeListTabletView.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ m7a $catalogInteractor;
    int label;
    final /* synthetic */ VideoLargeListTabletView.b this$0;

    /* compiled from: VideoLargeListTabletView.kt */
    /* renamed from: com.vk.catalog.mvi.block.video.impl.video.largelisttablet.a$a, reason: collision with other inner class name */
    public static final class C0470a<T> implements lsr {
        public final /* synthetic */ VideoLargeListTabletView.b b;

        public C0470a(VideoLargeListTabletView.b bVar) {
            this.b = bVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            y4a y4aVar = (y4a) obj;
            if (y4aVar instanceof sxm0) {
                VideoLargeListTabletView.b bVar = this.b;
                sxm0 sxm0Var = (sxm0) y4aVar;
                if (epx.f(((VideoLargeListTabletView.State) ((b2a) bVar.b.b).getCurrentState()).e.I0(), sxm0Var.b)) {
                    VideoFile videoFile = ((VideoLargeListTabletView.State) ((b2a) bVar.b.b).getCurrentState()).e;
                    videoFile.k3(sxm0Var.c);
                    bVar.m(new ape0(videoFile, 28));
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m7a m7aVar, VideoLargeListTabletView.b bVar, spj<? super a> spjVar) {
        super(2, spjVar);
        this.$catalogInteractor = m7aVar;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new a(this.$catalogInteractor, this.this$0, spjVar);
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
            ksr<y4a> b = this.$catalogInteractor.b();
            C0470a c0470a = new C0470a(this.this$0);
            this.label = 1;
            if (b.collect(c0470a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
