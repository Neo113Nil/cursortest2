package com.vk.catalog.mvi.block.music.impl.buttons;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b25;
import xsna.b6l;
import xsna.bdn;
import xsna.bpn0;
import xsna.evj;
import xsna.ge00;
import xsna.hx4;
import xsna.ie00;
import xsna.iz2;
import xsna.o25;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yfb;
import xsna.yvj;

/* compiled from: SavePlaylistByFilterButton.kt */
@b6l(c = "com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton$InlineActor$onSaveMyMusicPlaylist$1", f = "SavePlaylistByFilterButton.kt", l = {155, 156, 165}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ SavePlaylistByFilterButton.State $state;
    Object L$0;
    int label;
    final /* synthetic */ SavePlaylistByFilterButton.d this$0;

    /* compiled from: SavePlaylistByFilterButton.kt */
    @b6l(c = "com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton$InlineActor$onSaveMyMusicPlaylist$1$1", f = "SavePlaylistByFilterButton.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ BaseOkResponseDto $response;
        final /* synthetic */ SavePlaylistByFilterButton.State $state;
        int label;
        final /* synthetic */ SavePlaylistByFilterButton.d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SavePlaylistByFilterButton.d dVar, SavePlaylistByFilterButton.State state, BaseOkResponseDto baseOkResponseDto, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = dVar;
            this.$state = state;
            this.$response = baseOkResponseDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$state, this.$response, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.this$0.t(new SavePlaylistByFilterButton.c.a(new BlockId.Simple(this.$state.b), this.$response == BaseOkResponseDto.OK, null));
            return s3q0.a;
        }
    }

    /* compiled from: SavePlaylistByFilterButton.kt */
    @b6l(c = "com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton$InlineActor$onSaveMyMusicPlaylist$1$2", f = "SavePlaylistByFilterButton.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ SavePlaylistByFilterButton.State $state;
        final /* synthetic */ Throwable $t;
        int label;
        final /* synthetic */ SavePlaylistByFilterButton.d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SavePlaylistByFilterButton.d dVar, SavePlaylistByFilterButton.State state, Throwable th, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = dVar;
            this.$state = state;
            this.$t = th;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.this$0, this.$state, this.$t, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.this$0.t(new SavePlaylistByFilterButton.c.a(new BlockId.Simple(this.$state.b), false, this.$t.getMessage()));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SavePlaylistByFilterButton.d dVar, SavePlaylistByFilterButton.State state, spj<? super f> spjVar) {
        super(2, spjVar);
        this.this$0 = dVar;
        this.$state = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new f(this.this$0, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (xsna.myc0.k(r1, r4, r8) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if (xsna.myc0.k(r1, r3, r8) != r0) goto L30;
     */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            bdn bdnVar = bdn.a;
            ge00 ge00Var = ie00.a;
            b bVar = new b(this.this$0, this.$state, th, null);
            this.L$0 = null;
            this.label = 3;
        }
        if (i == 0) {
            kotlin.a.a(obj);
            hx4 hx4Var = (hx4) this.this$0.c.getValue();
            bpn0 bpn0Var = o25.a;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            iz2 A = yfb.A(hx4Var.s(((b25) bpn0Var.getValue()).c(), this.$state.e));
            this.label = 1;
            obj = evj.p(A, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.a.a(obj);
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        bdn bdnVar2 = bdn.a;
        ge00 ge00Var2 = ie00.a;
        a aVar = new a(this.this$0, this.$state, (BaseOkResponseDto) obj, null);
        this.L$0 = null;
        this.label = 2;
    }
}
