package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm;

import Ek.a;
import S0.InterfaceC3967k;
import WZ.l;
import a1.C4912a;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.w;
import d00.C6018d;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.travel.actionhandler.travelResultActionV2.TravelResultActionV2Handler;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.data.B2bFormDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.data.B2bFormMapperKt;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.di.B2bFormComponent;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation.B2bFormContentKt;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation.B2bFormStickyContentKt;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation.B2bFormVI;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class B2bFormWidgetKt$B2bFormWidget$1 extends AbstractC7737t implements Function1<C6018d<B2bFormDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<B2bFormDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "state", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C18991 extends AbstractC7737t implements Function1<C7244b, B2bFormDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18991(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final B2bFormDTO invoke(C7244b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return (B2bFormDTO) this.$jsonDeserializer.fromJson(state.b(), B2bFormDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<B2bFormDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<B2bFormDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18991(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<e<B2bFormDTO, B2bFormVI>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                B2bFormDTO.ButtonSectionDTO buttonSection;
                B2bFormDTO b2bFormDTO = obj instanceof B2bFormDTO ? (B2bFormDTO) obj : null;
                boolean z11 = false;
                if (b2bFormDTO != null && (buttonSection = b2bFormDTO.getButtonSection()) != null && buttonSection.isSticky()) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C19002 extends AbstractC7737t implements Function2<B2bFormDTO, d, B2bFormVI> {
            public static final C19002 INSTANCE = new C19002();

            C19002() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final B2bFormVI invoke(B2bFormDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return B2bFormMapperKt.toVI(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$2$3, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<f<B2bFormVI>, Unit> {
            final /* synthetic */ B2bFormComponent $component;
            final /* synthetic */ e<B2bFormDTO, B2bFormVI> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<B2bFormVI>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ B2bFormComponent $component;
                final /* synthetic */ e<B2bFormDTO, B2bFormVI> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(e<B2bFormDTO, B2bFormVI> eVar, B2bFormComponent b2bFormComponent) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                    this.$component = b2bFormComponent;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<B2bFormVI> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<B2bFormVI> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Function1 withInputs;
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    B2bFormVI b11 = content.b();
                    Intrinsics.g(b11, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation.B2bFormVI");
                    withInputs = B2bFormWidgetKt.withInputs(WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(TravelResultActionV2Handler.class))), this.$component.getFormStateHolder().getInputValues());
                    B2bFormVI.ButtonSectionVI buttonSection = b11.getButtonSection();
                    if (buttonSection == null) {
                        return;
                    }
                    B2bFormStickyContentKt.B2bFormStickyContent(buttonSection, withInputs, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(e<B2bFormDTO, B2bFormVI> eVar, B2bFormComponent b2bFormComponent) {
                super(1);
                this.$this_overlayViewMapper = eVar;
                this.$component = b2bFormComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<B2bFormVI> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<B2bFormVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1712999208, new AnonymousClass1(this.$this_overlayViewMapper, this.$component)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<B2bFormDTO, B2bFormVI> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<B2bFormDTO, B2bFormVI> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            B2bFormComponent b2bFormComponent = (B2bFormComponent) overlayViewMapper.getWidgetComponentStorage().getComponent(B2bFormComponent.class);
            overlayViewMapper.k(AnonymousClass1.INSTANCE, C19002.INSTANCE);
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass3(overlayViewMapper, b2bFormComponent));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<B2bFormDTO, B2bFormVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<B2bFormDTO, l20.d, B2bFormVI> {
            final /* synthetic */ B2bFormComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(B2bFormComponent b2bFormComponent) {
                super(2);
                this.$component = b2bFormComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final B2bFormVI invoke(B2bFormDTO state, l20.d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                B2bFormVI vi2 = B2bFormMapperKt.toVI(state, info);
                this.$component.getFormStateHolder().updateFromBackend(vi2.getFormBlockList());
                return vi2;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<B2bFormVI>, Unit> {
            final /* synthetic */ B2bFormComponent $component;
            final /* synthetic */ j<B2bFormDTO, B2bFormVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<B2bFormVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ B2bFormComponent $component;
                final /* synthetic */ j<B2bFormDTO, B2bFormVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<B2bFormDTO, B2bFormVI> jVar, B2bFormComponent b2bFormComponent) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = b2bFormComponent;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<B2bFormVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<B2bFormVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Function1 withInputs;
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    Object parent = ((View) interfaceC3967k.m(AndroidCompositionLocals_androidKt.h())).getParent();
                    Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
                    ((View) parent).setBackground(null);
                    withInputs = B2bFormWidgetKt.withInputs(WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(TravelResultActionV2Handler.class))), this.$component.getFormStateHolder().getInputValues());
                    l lVar = (l) interfaceC3967k.m(b00.f.e());
                    B2bFormVI b11 = content.b();
                    w<String, String> inputValues = this.$component.getFormStateHolder().getInputValues();
                    w<String, DsInputStatus> inputStatuses = this.$component.getFormStateHolder().getInputStatuses();
                    w<String, String> inputErrors = this.$component.getFormStateHolder().getInputErrors();
                    interfaceC3967k.o(-1785737973);
                    boolean F11 = interfaceC3967k.F(this.$component);
                    B2bFormComponent b2bFormComponent = this.$component;
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new B2bFormWidgetKt$B2bFormWidget$1$3$2$1$2$1(b2bFormComponent);
                        interfaceC3967k.x(C11);
                    }
                    Function2 function2 = (Function2) C11;
                    interfaceC3967k.k();
                    interfaceC3967k.o(-1785733252);
                    boolean F12 = interfaceC3967k.F(this.$component);
                    B2bFormComponent b2bFormComponent2 = this.$component;
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new B2bFormWidgetKt$B2bFormWidget$1$3$2$1$3$1(b2bFormComponent2);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    B2bFormContentKt.B2bFormContent(b11, withInputs, lVar, inputValues, inputStatuses, inputErrors, function2, (Function1) C12, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(j<B2bFormDTO, B2bFormVI> jVar, B2bFormComponent b2bFormComponent) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = b2bFormComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<B2bFormVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<B2bFormVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 27002532, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<B2bFormDTO, B2bFormVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<B2bFormDTO, B2bFormVI> jVar) {
            B2bFormComponent b2bFormComponent = (B2bFormComponent) a.c(jVar, "$this$viewMapper", B2bFormComponent.class);
            c.l(jVar, null, new AnonymousClass1(b2bFormComponent), 1, null);
            jVar.G(new AnonymousClass2(jVar, b2bFormComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bFormWidgetKt$B2bFormWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<B2bFormDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<B2bFormDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.l(AnonymousClass2.INSTANCE);
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(B2bFormComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.B2bFormWidgetKt$B2bFormWidget$1$4$1
                    @Override // k20.InterfaceC7469a
                    public final B2bFormComponent component() {
                        return new B2bFormComponent(C7475g.this);
                    }
                });
            }
        });
    }
}
