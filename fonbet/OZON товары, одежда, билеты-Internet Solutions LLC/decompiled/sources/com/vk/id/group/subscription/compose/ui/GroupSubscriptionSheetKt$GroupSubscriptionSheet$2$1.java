package com.vk.id.group.subscription.compose.ui;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.A1;
import S0.InterfaceC3978p0;
import S0.n1;
import Sc.s;
import androidx.recyclerview.widget.m;
import com.vk.id.VKID;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.tracking.core.CrashReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1", f = "GroupSubscriptionSheet.kt", l = {m.e.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1 extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC3978p0<Boolean> $isSuccess$delegate;
    final /* synthetic */ A1<Function1<VKIDGroupSubscriptionFail, Unit>> $rememberedOnFail$delegate;
    final /* synthetic */ GroupSubscriptionSheetState $state;
    final /* synthetic */ InterfaceC3978p0<Boolean> $wasVisible$delegate;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1$1", f = "GroupSubscriptionSheet.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Throwable, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(th2, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1$2", f = "GroupSubscriptionSheet.kt", l = {201}, m = "invokeSuspend")
    /* renamed from: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ InterfaceC3978p0<Boolean> $isSuccess$delegate;
        final /* synthetic */ A1<Function1<VKIDGroupSubscriptionFail, Unit>> $rememberedOnFail$delegate;
        final /* synthetic */ GroupSubscriptionSheetState $state;
        final /* synthetic */ InterfaceC3978p0<Boolean> $wasVisible$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(GroupSubscriptionSheetState groupSubscriptionSheetState, InterfaceC3978p0<Boolean> interfaceC3978p0, InterfaceC3978p0<Boolean> interfaceC3978p02, A1<? extends Function1<? super VKIDGroupSubscriptionFail, Unit>> a12, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(1, dVar);
            this.$state = groupSubscriptionSheetState;
            this.$isSuccess$delegate = interfaceC3978p0;
            this.$wasVisible$delegate = interfaceC3978p02;
            this.$rememberedOnFail$delegate = a12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.$state, this.$isSuccess$delegate, this.$wasVisible$delegate, this.$rememberedOnFail$delegate, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                final GroupSubscriptionSheetState groupSubscriptionSheetState = this.$state;
                InterfaceC2395h o11 = C2399j.o(n1.m(new Function0() { // from class: com.vk.id.group.subscription.compose.ui.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean isVisible;
                        isVisible = GroupSubscriptionSheetState.this.isVisible();
                        return Boolean.valueOf(isVisible);
                    }
                }));
                final InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$isSuccess$delegate;
                final InterfaceC3978p0<Boolean> interfaceC3978p02 = this.$wasVisible$delegate;
                final A1<Function1<VKIDGroupSubscriptionFail, Unit>> a12 = this.$rememberedOnFail$delegate;
                InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt.GroupSubscriptionSheet.2.1.2.2
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit(((Boolean) obj2).booleanValue(), (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(boolean z11, kotlin.coroutines.d<? super Unit> dVar) {
                        boolean GroupSubscriptionSheet$lambda$20;
                        boolean GroupSubscriptionSheet$lambda$14;
                        Function1 GroupSubscriptionSheet$lambda$12;
                        if (z11) {
                            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$15(interfaceC3978p0, false);
                        }
                        if (!z11) {
                            GroupSubscriptionSheet$lambda$20 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$20(interfaceC3978p02);
                            if (GroupSubscriptionSheet$lambda$20) {
                                GroupSubscriptionSheet$lambda$14 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$14(interfaceC3978p0);
                                if (!GroupSubscriptionSheet$lambda$14) {
                                    GroupSubscriptionSheet$lambda$12 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$12(a12);
                                    GroupSubscriptionSheet$lambda$12.invoke(new VKIDGroupSubscriptionFail.Dismiss());
                                }
                            }
                        }
                        GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$21(interfaceC3978p02, z11);
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (o11.collect(interfaceC2397i, this) == aVar) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1(GroupSubscriptionSheetState groupSubscriptionSheetState, InterfaceC3978p0<Boolean> interfaceC3978p0, InterfaceC3978p0<Boolean> interfaceC3978p02, A1<? extends Function1<? super VKIDGroupSubscriptionFail, Unit>> a12, kotlin.coroutines.d<? super GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1> dVar) {
        super(2, dVar);
        this.$state = groupSubscriptionSheetState;
        this.$isSuccess$delegate = interfaceC3978p0;
        this.$wasVisible$delegate = interfaceC3978p02;
        this.$rememberedOnFail$delegate = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1(this.$state, this.$isSuccess$delegate, this.$wasVisible$delegate, this.$rememberedOnFail$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            CrashReporter crashReporter = VKID.INSTANCE.getInstance().getCrashReporter();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$state, this.$isSuccess$delegate, this.$wasVisible$delegate, this.$rememberedOnFail$delegate, null);
            this.label = 1;
            if (crashReporter.runReportingCrashesSuspend(anonymousClass1, anonymousClass2, this) == aVar) {
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
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
