package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import v0.G;
import v0.InterfaceC10165e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ InterfaceC3978p0<Boolean> $customBufferingOverlay$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $customCenterActionOverlay$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $customControlPanel$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $customGradient$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $customModeButtonInControlPanel$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $customOverlay$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $customPlayPauseInControlPanel$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $customTimeBarInControlPanel$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $customTimeFormatter$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $isCompactControlsToggle$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $isCropScaleToggle$delegate;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC3978p0<Boolean> $isCompactControlsToggle$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC3978p0<Boolean> interfaceC3978p0) {
            super(3);
            this.$isCompactControlsToggle$delegate = interfaceC3978p0;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC10165e, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
            boolean PlayerShowcaseV2Composable$lambda$7;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            PlayerShowcaseV2Composable$lambda$7 = PlayerShowcaseV2ComposableKt.PlayerShowcaseV2Composable$lambda$7(this.$isCompactControlsToggle$delegate);
            interfaceC3967k.o(-1241516042);
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$isCompactControlsToggle$delegate;
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$1$1$1(interfaceC3978p0);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            PlayerShowcaseV2ComposableKt.ToggleRow("Compact Controls", PlayerShowcaseV2Composable$lambda$7, (Function1) C11, interfaceC3967k, 390);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$10, reason: invalid class name */
    static final class AnonymousClass10 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC3978p0<Boolean> $customModeButtonInControlPanel$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(InterfaceC3978p0<Boolean> interfaceC3978p0) {
            super(3);
            this.$customModeButtonInControlPanel$delegate = interfaceC3978p0;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC10165e, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
            boolean PlayerShowcaseV2Composable$lambda$34;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            PlayerShowcaseV2Composable$lambda$34 = PlayerShowcaseV2ComposableKt.PlayerShowcaseV2Composable$lambda$34(this.$customModeButtonInControlPanel$delegate);
            interfaceC3967k.o(-1241484003);
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$customModeButtonInControlPanel$delegate;
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$10$1$1(interfaceC3978p0);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            PlayerShowcaseV2ComposableKt.ToggleRow("CustomModeButtonInControlPanel", PlayerShowcaseV2Composable$lambda$34, (Function1) C11, interfaceC3967k, 390);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$11, reason: invalid class name */
    static final class AnonymousClass11 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC3978p0<Boolean> $customTimeFormatter$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass11(InterfaceC3978p0<Boolean> interfaceC3978p0) {
            super(3);
            this.$customTimeFormatter$delegate = interfaceC3978p0;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC10165e, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
            boolean PlayerShowcaseV2Composable$lambda$37;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            PlayerShowcaseV2Composable$lambda$37 = PlayerShowcaseV2ComposableKt.PlayerShowcaseV2Composable$lambda$37(this.$customTimeFormatter$delegate);
            interfaceC3967k.o(-1241480334);
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$customTimeFormatter$delegate;
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$11$1$1(interfaceC3978p0);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            PlayerShowcaseV2ComposableKt.ToggleRow("CustomTimeFormatter", PlayerShowcaseV2Composable$lambda$37, (Function1) C11, interfaceC3967k, 390);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC3978p0<Boolean> $isCropScaleToggle$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC3978p0<Boolean> interfaceC3978p0) {
            super(3);
            this.$isCropScaleToggle$delegate = interfaceC3978p0;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC10165e, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
            boolean PlayerShowcaseV2Composable$lambda$10;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            PlayerShowcaseV2Composable$lambda$10 = PlayerShowcaseV2ComposableKt.PlayerShowcaseV2Composable$lambda$10(this.$isCropScaleToggle$delegate);
            interfaceC3967k.o(-1241512720);
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$isCropScaleToggle$delegate;
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$2$1$1(interfaceC3978p0);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            PlayerShowcaseV2ComposableKt.ToggleRow("ContentScale Crop", PlayerShowcaseV2Composable$lambda$10, (Function1) C11, interfaceC3967k, 390);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC3978p0<Boolean> $customGradient$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(InterfaceC3978p0<Boolean> interfaceC3978p0) {
            super(3);
            this.$customGradient$delegate = interfaceC3978p0;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC10165e, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
            boolean PlayerShowcaseV2Composable$lambda$13;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            PlayerShowcaseV2Composable$lambda$13 = PlayerShowcaseV2ComposableKt.PlayerShowcaseV2Composable$lambda$13(this.$customGradient$delegate);
            interfaceC3967k.o(-1241509779);
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$customGradient$delegate;
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$3$1$1(interfaceC3978p0);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            PlayerShowcaseV2ComposableKt.ToggleRow("CustomGradient", PlayerShowcaseV2Composable$lambda$13, (Function1) C11, interfaceC3967k, 390);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC3978p0<Boolean> $customOverlay$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(InterfaceC3978p0<Boolean> interfaceC3978p0) {
            super(3);
            this.$customOverlay$delegate = interfaceC3978p0;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC10165e, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
            boolean PlayerShowcaseV2Composable$lambda$16;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            PlayerShowcaseV2Composable$lambda$16 = PlayerShowcaseV2ComposableKt.PlayerShowcaseV2Composable$lambda$16(this.$customOverlay$delegate);
            interfaceC3967k.o(-1241506996);
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$customOverlay$delegate;
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$4$1$1(interfaceC3978p0);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            PlayerShowcaseV2ComposableKt.ToggleRow("CustomOverlay", PlayerShowcaseV2Composable$lambda$16, (Function1) C11, interfaceC3967k, 390);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC3978p0<Boolean> $customCenterActionOverlay$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(InterfaceC3978p0<Boolean> interfaceC3978p0) {
            super(3);
            this.$customCenterActionOverlay$delegate = interfaceC3978p0;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC10165e, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
            boolean PlayerShowcaseV2Composable$lambda$19;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            PlayerShowcaseV2Composable$lambda$19 = PlayerShowcaseV2ComposableKt.PlayerShowcaseV2Composable$lambda$19(this.$customCenterActionOverlay$delegate);
            interfaceC3967k.o(-1241503464);
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$customCenterActionOverlay$delegate;
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$5$1$1(interfaceC3978p0);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            PlayerShowcaseV2ComposableKt.ToggleRow("CustomCenterActionOverlay", PlayerShowcaseV2Composable$lambda$19, (Function1) C11, interfaceC3967k, 390);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$6, reason: invalid class name */
    static final class AnonymousClass6 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC3978p0<Boolean> $customControlPanel$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(InterfaceC3978p0<Boolean> interfaceC3978p0) {
            super(3);
            this.$customControlPanel$delegate = interfaceC3978p0;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC10165e, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
            boolean PlayerShowcaseV2Composable$lambda$22;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            PlayerShowcaseV2Composable$lambda$22 = PlayerShowcaseV2ComposableKt.PlayerShowcaseV2Composable$lambda$22(this.$customControlPanel$delegate);
            interfaceC3967k.o(-1241500015);
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$customControlPanel$delegate;
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$6$1$1(interfaceC3978p0);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            PlayerShowcaseV2ComposableKt.ToggleRow("CustomControlPanel", PlayerShowcaseV2Composable$lambda$22, (Function1) C11, interfaceC3967k, 390);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$7, reason: invalid class name */
    static final class AnonymousClass7 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC3978p0<Boolean> $customBufferingOverlay$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(InterfaceC3978p0<Boolean> interfaceC3978p0) {
            super(3);
            this.$customBufferingOverlay$delegate = interfaceC3978p0;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC10165e, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
            boolean PlayerShowcaseV2Composable$lambda$25;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            PlayerShowcaseV2Composable$lambda$25 = PlayerShowcaseV2ComposableKt.PlayerShowcaseV2Composable$lambda$25(this.$customBufferingOverlay$delegate);
            interfaceC3967k.o(-1241496523);
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$customBufferingOverlay$delegate;
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$7$1$1(interfaceC3978p0);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            PlayerShowcaseV2ComposableKt.ToggleRow("CustomBufferingOverlay", PlayerShowcaseV2Composable$lambda$25, (Function1) C11, interfaceC3967k, 390);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$8, reason: invalid class name */
    static final class AnonymousClass8 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC3978p0<Boolean> $customPlayPauseInControlPanel$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(InterfaceC3978p0<Boolean> interfaceC3978p0) {
            super(3);
            this.$customPlayPauseInControlPanel$delegate = interfaceC3978p0;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC10165e, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
            boolean PlayerShowcaseV2Composable$lambda$28;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            PlayerShowcaseV2Composable$lambda$28 = PlayerShowcaseV2ComposableKt.PlayerShowcaseV2Composable$lambda$28(this.$customPlayPauseInControlPanel$delegate);
            interfaceC3967k.o(-1241492452);
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$customPlayPauseInControlPanel$delegate;
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$8$1$1(interfaceC3978p0);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            PlayerShowcaseV2ComposableKt.ToggleRow("CustomPlayPauseInControlPanel", PlayerShowcaseV2Composable$lambda$28, (Function1) C11, interfaceC3967k, 390);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$9, reason: invalid class name */
    static final class AnonymousClass9 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC3978p0<Boolean> $customTimeBarInControlPanel$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(InterfaceC3978p0<Boolean> interfaceC3978p0) {
            super(3);
            this.$customTimeBarInControlPanel$delegate = interfaceC3978p0;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC10165e, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
            boolean PlayerShowcaseV2Composable$lambda$31;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            PlayerShowcaseV2Composable$lambda$31 = PlayerShowcaseV2ComposableKt.PlayerShowcaseV2Composable$lambda$31(this.$customTimeBarInControlPanel$delegate);
            interfaceC3967k.o(-1241488294);
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$customTimeBarInControlPanel$delegate;
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1$9$1$1(interfaceC3978p0);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            PlayerShowcaseV2ComposableKt.ToggleRow("CustomTimeBarInControlPanel", PlayerShowcaseV2Composable$lambda$31, (Function1) C11, interfaceC3967k, 390);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseV2ComposableKt$PlayerShowcaseV2Composable$2$1$1(InterfaceC3978p0<Boolean> interfaceC3978p0, InterfaceC3978p0<Boolean> interfaceC3978p02, InterfaceC3978p0<Boolean> interfaceC3978p03, InterfaceC3978p0<Boolean> interfaceC3978p04, InterfaceC3978p0<Boolean> interfaceC3978p05, InterfaceC3978p0<Boolean> interfaceC3978p06, InterfaceC3978p0<Boolean> interfaceC3978p07, InterfaceC3978p0<Boolean> interfaceC3978p08, InterfaceC3978p0<Boolean> interfaceC3978p09, InterfaceC3978p0<Boolean> interfaceC3978p010, InterfaceC3978p0<Boolean> interfaceC3978p011) {
        super(1);
        this.$isCompactControlsToggle$delegate = interfaceC3978p0;
        this.$isCropScaleToggle$delegate = interfaceC3978p02;
        this.$customGradient$delegate = interfaceC3978p03;
        this.$customOverlay$delegate = interfaceC3978p04;
        this.$customCenterActionOverlay$delegate = interfaceC3978p05;
        this.$customControlPanel$delegate = interfaceC3978p06;
        this.$customBufferingOverlay$delegate = interfaceC3978p07;
        this.$customPlayPauseInControlPanel$delegate = interfaceC3978p08;
        this.$customTimeBarInControlPanel$delegate = interfaceC3978p09;
        this.$customModeButtonInControlPanel$delegate = interfaceC3978p010;
        this.$customTimeFormatter$delegate = interfaceC3978p011;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        G.e(LazyRow, null, new C4912a(true, 2001158270, new AnonymousClass1(this.$isCompactControlsToggle$delegate)), 3);
        G.e(LazyRow, null, new C4912a(true, 358063669, new AnonymousClass2(this.$isCropScaleToggle$delegate)), 3);
        G.e(LazyRow, null, new C4912a(true, -1847578698, new AnonymousClass3(this.$customGradient$delegate)), 3);
        G.e(LazyRow, null, new C4912a(true, 241746231, new AnonymousClass4(this.$customOverlay$delegate)), 3);
        G.e(LazyRow, null, new C4912a(true, -1963896136, new AnonymousClass5(this.$customCenterActionOverlay$delegate)), 3);
        G.e(LazyRow, null, new C4912a(true, 125428793, new AnonymousClass6(this.$customControlPanel$delegate)), 3);
        G.e(LazyRow, null, new C4912a(true, -2080213574, new AnonymousClass7(this.$customBufferingOverlay$delegate)), 3);
        G.e(LazyRow, null, new C4912a(true, 9111355, new AnonymousClass8(this.$customPlayPauseInControlPanel$delegate)), 3);
        G.e(LazyRow, null, new C4912a(true, 2098436284, new AnonymousClass9(this.$customTimeBarInControlPanel$delegate)), 3);
        G.e(LazyRow, null, new C4912a(true, -107206083, new AnonymousClass10(this.$customModeButtonInControlPanel$delegate)), 3);
        G.e(LazyRow, null, new C4912a(true, -974924169, new AnonymousClass11(this.$customTimeFormatter$delegate)), 3);
    }
}
