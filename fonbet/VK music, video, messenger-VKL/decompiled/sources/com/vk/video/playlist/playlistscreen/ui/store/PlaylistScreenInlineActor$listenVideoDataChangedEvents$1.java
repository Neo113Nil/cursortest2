package com.vk.video.playlist.playlistscreen.ui.store;

import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenData;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bwr0;
import xsna.cdn;
import xsna.cwr0;
import xsna.fyr0;
import xsna.j2i0;
import xsna.kci;
import xsna.ksr;
import xsna.lsr;
import xsna.nb9;
import xsna.s3q0;
import xsna.spj;
import xsna.vcb0;
import xsna.wjs0;
import xsna.wxr0;
import xsna.wzs;
import xsna.yvj;

/* compiled from: PlaylistScreenInlineActor.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.ui.store.PlaylistScreenInlineActor$listenVideoDataChangedEvents$1", f = "PlaylistScreenInlineActor.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PlaylistScreenInlineActor$listenVideoDataChangedEvents$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ vcb0 $this_listenVideoDataChangedEvents;
    int label;

    /* compiled from: PlaylistScreenInlineActor.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ vcb0 b;

        public a(vcb0 vcb0Var) {
            this.b = vcb0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            Object obj2;
            CatalogSectionState catalogSectionState;
            String str;
            Owner s;
            UserId userId;
            bwr0 bwr0Var = (bwr0) obj;
            UserId userId2 = null;
            VideoFile videoFile = bwr0Var instanceof wxr0 ? ((wxr0) bwr0Var).a : bwr0Var instanceof fyr0 ? ((fyr0) bwr0Var).a : bwr0Var instanceof cwr0 ? ((cwr0) bwr0Var).a : null;
            if (videoFile != null && (s = videoFile.s()) != null && (userId = s.b) != null) {
                userId2 = userId;
            } else if (videoFile != null) {
                userId2 = videoFile.I0();
            }
            if (userId2 != null) {
                vcb0 vcb0Var = this.b;
                PlaylistDataDo j = ((PlaylistScreenState) vcb0Var.b.getCurrentState()).j();
                if (j != null && Math.abs(j.c.b) == Math.abs(userId2.b)) {
                    PlaylistScreenData playlistScreenData = ((PlaylistScreenState) vcb0Var.b.getCurrentState()).f;
                    if (playlistScreenData == null || (catalogSectionState = (CatalogSectionState) playlistScreenData.c.b.getValue()) == null || (str = catalogSectionState.c) == null || (obj2 = vcb0Var.e.a(new j2i0(str), spjVar)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj2 = s3q0.a;
                    }
                    return obj2 == CoroutineSingletons.COROUTINE_SUSPENDED ? obj2 : s3q0.a;
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistScreenInlineActor$listenVideoDataChangedEvents$1(vcb0 vcb0Var, spj<? super PlaylistScreenInlineActor$listenVideoDataChangedEvents$1> spjVar) {
        super(2, spjVar);
        this.$this_listenVideoDataChangedEvents = vcb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new PlaylistScreenInlineActor$listenVideoDataChangedEvents$1(this.$this_listenVideoDataChangedEvents, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((PlaylistScreenInlineActor$listenVideoDataChangedEvents$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final nb9 a2 = cdn.a(wjs0.b);
            ksr e = kci.e(new ksr<bwr0>() { // from class: com.vk.video.playlist.playlistscreen.ui.store.PlaylistScreenInlineActor$listenVideoDataChangedEvents$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.video.playlist.playlistscreen.ui.store.PlaylistScreenInlineActor$listenVideoDataChangedEvents$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;

                    @b6l(c = "com.vk.video.playlist.playlistscreen.ui.store.PlaylistScreenInlineActor$listenVideoDataChangedEvents$1$invokeSuspend$$inlined$filter$1$2", f = "PlaylistScreenInlineActor.kt", l = {50}, m = "emit")
                    /* renamed from: com.vk.video.playlist.playlistscreen.ui.store.PlaylistScreenInlineActor$listenVideoDataChangedEvents$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(lsr lsrVar) {
                        this.b = lsrVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // xsna.lsr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, spj spjVar) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (spjVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) spjVar;
                            int i2 = anonymousClass1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    a.a(obj2);
                                    bwr0 bwr0Var = (bwr0) obj;
                                    if ((bwr0Var instanceof wxr0) || (bwr0Var instanceof fyr0) || (bwr0Var instanceof cwr0)) {
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    a.a(obj2);
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
                public final Object collect(lsr<? super bwr0> lsrVar, spj spjVar) {
                    Object collect = nb9.this.collect(new AnonymousClass2(lsrVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            }, 300L);
            a aVar = new a(this.$this_listenVideoDataChangedEvents);
            this.label = 1;
            if (e.collect(aVar, this) == coroutineSingletons) {
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
