package com.vk.id.onetap.compose.button.auth;

import Sc.s;
import Wc.a;
import com.vk.id.onetap.compose.button.CommonKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8008p;
import m0.InterfaceC8002m;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt$SmallButtonAnimation$1$1", f = "VKIDButtonSmall.kt", l = {130, 131}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class VKIDButtonSmallKt$SmallButtonAnimation$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C7980b<Float, C8008p> $animatedOffsetXUserIcon;
    final /* synthetic */ C7980b<Float, C8008p> $animatedOffsetXVkIcon;
    final /* synthetic */ long $size;
    final /* synthetic */ VKIDSmallButtonState $state;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt$SmallButtonAnimation$1$1$1", f = "VKIDButtonSmall.kt", l = {117}, m = "invokeSuspend")
    /* renamed from: com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt$SmallButtonAnimation$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ C7980b<Float, C8008p> $animatedOffsetXUserIcon;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C7980b<Float, C8008p> c7980b, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$animatedOffsetXUserIcon = c7980b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$animatedOffsetXUserIcon, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                C7980b<Float, C8008p> c7980b = this.$animatedOffsetXUserIcon;
                Float f7 = new Float(0.0f);
                InterfaceC8002m<Float> easeInOutAnimation = CommonKt.getEaseInOutAnimation();
                this.label = 1;
                if (C7980b.f(c7980b, f7, easeInOutAnimation, null, this, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt$SmallButtonAnimation$1$1$2", f = "VKIDButtonSmall.kt", l = {123}, m = "invokeSuspend")
    /* renamed from: com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt$SmallButtonAnimation$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ C7980b<Float, C8008p> $animatedOffsetXVkIcon;
        final /* synthetic */ long $size;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(C7980b<Float, C8008p> c7980b, long j11, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$animatedOffsetXVkIcon = c7980b;
            this.$size = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$animatedOffsetXVkIcon, this.$size, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                C7980b<Float, C8008p> c7980b = this.$animatedOffsetXVkIcon;
                Float f7 = new Float(-((int) (this.$size >> 32)));
                InterfaceC8002m<Float> easeInOutAnimation = CommonKt.getEaseInOutAnimation();
                this.label = 1;
                if (C7980b.f(c7980b, f7, easeInOutAnimation, null, this, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKIDButtonSmallKt$SmallButtonAnimation$1$1(VKIDSmallButtonState vKIDSmallButtonState, C7980b<Float, C8008p> c7980b, long j11, C7980b<Float, C8008p> c7980b2, d<? super VKIDButtonSmallKt$SmallButtonAnimation$1$1> dVar) {
        super(2, dVar);
        this.$state = vKIDSmallButtonState;
        this.$animatedOffsetXUserIcon = c7980b;
        this.$size = j11;
        this.$animatedOffsetXVkIcon = c7980b2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        VKIDButtonSmallKt$SmallButtonAnimation$1$1 vKIDButtonSmallKt$SmallButtonAnimation$1$1 = new VKIDButtonSmallKt$SmallButtonAnimation$1$1(this.$state, this.$animatedOffsetXUserIcon, this.$size, this.$animatedOffsetXVkIcon, dVar);
        vKIDButtonSmallKt$SmallButtonAnimation$1$1.L$0 = obj;
        return vKIDButtonSmallKt$SmallButtonAnimation$1$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        if (r7.m(r1, r6) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r7.m(r4, r6) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            if (this.$state.getUserIconLoaded$onetap_compose_release()) {
                C10727i.c(m11, null, null, new AnonymousClass1(this.$animatedOffsetXUserIcon, null), 3);
                C10727i.c(m11, null, null, new AnonymousClass2(this.$animatedOffsetXVkIcon, this.$size, null), 3);
                return Unit.f71690a;
            }
            C7980b<Float, C8008p> c7980b = this.$animatedOffsetXUserIcon;
            Float f7 = new Float((int) (this.$size >> 32));
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            C7980b<Float, C8008p> c7980b2 = this.$animatedOffsetXVkIcon;
            Float f11 = new Float(0.0f);
            this.label = 2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VKIDButtonSmallKt$SmallButtonAnimation$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
