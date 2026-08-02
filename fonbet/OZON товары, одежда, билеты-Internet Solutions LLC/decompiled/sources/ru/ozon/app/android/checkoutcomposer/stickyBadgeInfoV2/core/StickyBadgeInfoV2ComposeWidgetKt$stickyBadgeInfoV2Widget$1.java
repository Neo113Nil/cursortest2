package ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.core;

import S0.InterfaceC3967k;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import d00.C6018d;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import g3.C6617b;
import hi.InterfaceC6958a;
import j20.C7244b;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.data.StickyBadgeInfoV2DTO;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.data.StickyBadgeInfoV2MapperKt;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.di.StickyBadgeInfoV2Component;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.di.TotalVisibilityViewModelFactory;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.presentation.StickyBadgeInfoV2VO;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.presentation.StickyBadgeInfoV2WidgetKt;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class StickyBadgeInfoV2ComposeWidgetKt$stickyBadgeInfoV2Widget$1 extends AbstractC7737t implements Function1<C6018d<StickyBadgeInfoV2DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.core.StickyBadgeInfoV2ComposeWidgetKt$stickyBadgeInfoV2Widget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<b<StickyBadgeInfoV2DTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.core.StickyBadgeInfoV2ComposeWidgetKt$stickyBadgeInfoV2Widget$1$2$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<C7244b, StickyBadgeInfoV2DTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final StickyBadgeInfoV2DTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (StickyBadgeInfoV2DTO) this.$jsonDeserializer.fromJson(it.b(), StickyBadgeInfoV2DTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<StickyBadgeInfoV2DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<StickyBadgeInfoV2DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new AnonymousClass1(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.core.StickyBadgeInfoV2ComposeWidgetKt$stickyBadgeInfoV2Widget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<e<StickyBadgeInfoV2DTO, StickyBadgeInfoV2VO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO;", "invoke", "(Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/data/StickyBadgeInfoV2DTO;Ll20/d;)Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.core.StickyBadgeInfoV2ComposeWidgetKt$stickyBadgeInfoV2Widget$1$3$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<StickyBadgeInfoV2DTO, d, StickyBadgeInfoV2VO> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final StickyBadgeInfoV2VO invoke(StickyBadgeInfoV2DTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return StickyBadgeInfoV2MapperKt.toVO(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.core.StickyBadgeInfoV2ComposeWidgetKt$stickyBadgeInfoV2Widget$1$3$2, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<f<StickyBadgeInfoV2VO>, Unit> {
            final /* synthetic */ StickyBadgeInfoV2Component $component;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.core.StickyBadgeInfoV2ComposeWidgetKt$stickyBadgeInfoV2Widget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<StickyBadgeInfoV2VO>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ StickyBadgeInfoV2Component $component;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(StickyBadgeInfoV2Component stickyBadgeInfoV2Component) {
                    super(3);
                    this.$component = stickyBadgeInfoV2Component;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<StickyBadgeInfoV2VO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<StickyBadgeInfoV2VO> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    StickyBadgeInfoV2VO b11 = content.b();
                    B0 a11 = ((h) interfaceC3967k.m(b00.f.f())).a();
                    TotalVisibilityViewModelFactory totalVisibilityViewModelFactory = this.$component.getTotalVisibilityViewModelFactory();
                    interfaceC3967k.B(1729797275);
                    w0 a12 = C6617b.a(N.b(TotalVisibilityViewModel.class), a11, null, totalVisibilityViewModelFactory, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    StickyBadgeInfoV2WidgetKt.StickyBadgeInfoV2Widget(b11, (TotalVisibilityViewModel) a12, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(StickyBadgeInfoV2Component stickyBadgeInfoV2Component) {
                super(1);
                this.$component = stickyBadgeInfoV2Component;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<StickyBadgeInfoV2VO> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<StickyBadgeInfoV2VO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1801774122, new AnonymousClass1(this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<StickyBadgeInfoV2DTO, StickyBadgeInfoV2VO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<StickyBadgeInfoV2DTO, StickyBadgeInfoV2VO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            StickyBadgeInfoV2Component stickyBadgeInfoV2Component = (StickyBadgeInfoV2Component) overlayViewMapper.getWidgetComponentStorage().getComponent(StickyBadgeInfoV2Component.class);
            c.l(overlayViewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass2(stickyBadgeInfoV2Component));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyBadgeInfoV2ComposeWidgetKt$stickyBadgeInfoV2Widget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<StickyBadgeInfoV2DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<StickyBadgeInfoV2DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.core.StickyBadgeInfoV2ComposeWidgetKt$stickyBadgeInfoV2Widget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StickyBadgeInfoV2Component.INSTANCE.create();
            }
        });
        ComposeWidget.a(new AnonymousClass2(this.$jsonDeserializer));
        ComposeWidget.l(AnonymousClass3.INSTANCE);
    }
}
