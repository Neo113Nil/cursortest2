package com.vk.catalog.mvi.block.video.impl.video.list;

import com.vk.catalog.mvi.block.video.impl.video.list.c;
import com.vk.catalog.mvi.block.video.models.VideoCatalogAnalyticsEvent;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.hints.HintId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b2a;
import xsna.b6l;
import xsna.epx;
import xsna.fet0;
import xsna.h7v;
import xsna.ksr;
import xsna.lsr;
import xsna.m7a;
import xsna.s3q0;
import xsna.spj;
import xsna.sxm0;
import xsna.tdk0;
import xsna.u1a;
import xsna.u2k0;
import xsna.vjs0;
import xsna.w1a;
import xsna.wzs;
import xsna.y4a;
import xsna.yvj;

/* compiled from: VideosListView.kt */
/* loaded from: classes16.dex */
public final class b extends u1a<VideosListView$State, c> {
    public final h7v c;

    /* compiled from: VideosListView.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.list.VideosListView$InlineActor$1", f = "VideosListView.kt", l = {247}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ m7a $catalogInteractor;
        int label;
        final /* synthetic */ b this$0;

        /* compiled from: VideosListView.kt */
        /* renamed from: com.vk.catalog.mvi.block.video.impl.video.list.b$a$a, reason: collision with other inner class name */
        public static final class C0472a<T> implements lsr {
            public final /* synthetic */ b b;

            public C0472a(b bVar) {
                this.b = bVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                y4a y4aVar = (y4a) obj;
                if (y4aVar instanceof sxm0) {
                    b bVar = this.b;
                    sxm0 sxm0Var = (sxm0) y4aVar;
                    if (epx.f(((VideosListView$State) ((b2a) bVar.b.b).getCurrentState()).f.I0(), sxm0Var.b)) {
                        VideoFile videoFile = ((VideosListView$State) ((b2a) bVar.b.b).getCurrentState()).f;
                        videoFile.k3(sxm0Var.c);
                        bVar.m(new u2k0(videoFile, 25));
                    }
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m7a m7aVar, b bVar, spj<? super a> spjVar) {
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
                C0472a c0472a = new C0472a(this.this$0);
                this.label = 1;
                if (b.collect(c0472a, this) == coroutineSingletons) {
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

    public b(m7a m7aVar, b2a b2aVar, h7v h7vVar) {
        super(b2aVar);
        this.c = h7vVar;
        w1a.b(this, null, new a(m7aVar, this, null), 3);
    }

    @Override // xsna.u1a
    public final void g(c cVar) {
        DonutVideoUiModel.DescriptionChip descriptionChip;
        c cVar2 = cVar;
        b2a b2aVar = (b2a) this.b.b;
        if (cVar2 instanceof c.C0473c) {
            if (((VideosListView$State) b2aVar.getCurrentState()).k) {
                c.C0473c c0473c = (c.C0473c) cVar2;
                t(new vjs0.c(c0473c.b, ((VideosListView$State) b2aVar.getCurrentState()).f, null, c0473c.c));
                return;
            }
            return;
        }
        if (cVar2 instanceof c.b) {
            t(new fet0.e(((VideosListView$State) b2aVar.getCurrentState()).f, ((VideosListView$State) b2aVar.getCurrentState()).g));
            return;
        }
        if (!(cVar2 instanceof c.a)) {
            if (cVar2 instanceof c.e) {
                c.e eVar = (c.e) cVar2;
                v(new VideoCatalogAnalyticsEvent.a(((VideosListView$State) b2aVar.getCurrentState()).f.r(), eVar.c, eVar.d));
                return;
            } else {
                if (!(cVar2 instanceof c.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.c.b(HintId.VIDEO_PIN_FOLLOWERS.getId());
                m(new tdk0(7));
                return;
            }
        }
        DonutVideoUiModel donutVideoUiModel = ((VideosListView$State) b2aVar.getCurrentState()).j;
        DonutVideoAction donutVideoAction = (donutVideoUiModel == null || (descriptionChip = donutVideoUiModel.c) == null) ? null : descriptionChip.e;
        if (donutVideoAction != null) {
            t(new vjs0.a(((c.a) cVar2).b, donutVideoAction, DonutVideoClickSource.DESCRIPTION));
        } else if (((VideosListView$State) b2aVar.getCurrentState()).k) {
            c.a aVar = (c.a) cVar2;
            t(new vjs0.c(aVar.b, ((VideosListView$State) b2aVar.getCurrentState()).f, null, aVar.c));
        }
    }
}
