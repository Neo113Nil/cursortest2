package ru.ozon.app.android.orders.cml.parcelTimeline.core;

import A00.a;
import Ek.a;
import d00.C6018d;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.orders.cml.parcelTimeline.data.ParcelTimelineDTO;
import ru.ozon.app.android.orders.cml.parcelTimeline.di.ParcelTimelineWidgetComponent;
import ru.ozon.app.android.orders.cml.parcelTimeline.presentation.ParcelTimelineVO;
import ru.ozon.app.android.orders.cml.parcelTimeline.presentation.compose.ParcelTimelineUpdateEvent;
import ru.ozon.app.android.orders.cml.parcelTimeline.presentation.compose.ParcelTimelineUpdateEventKt;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ParcelTimelineComposeWidgetCoreKt$parcelTimelineWidgetFactory$1 extends AbstractC7737t implements Function1<C6018d<ParcelTimelineDTO>, Unit> {
    public static final ParcelTimelineComposeWidgetCoreKt$parcelTimelineWidgetFactory$1 INSTANCE = new ParcelTimelineComposeWidgetCoreKt$parcelTimelineWidgetFactory$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.orders.cml.parcelTimeline.core.ParcelTimelineComposeWidgetCoreKt$parcelTimelineWidgetFactory$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<ParcelTimelineDTO>, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "state", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO;", "invoke-7IyK4Ps", "(Lj20/b;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.orders.cml.parcelTimeline.core.ParcelTimelineComposeWidgetCoreKt$parcelTimelineWidgetFactory$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18051 extends AbstractC7737t implements Function1<C7244b, ParcelTimelineDTO> {
            final /* synthetic */ ParcelTimelineWidgetComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18051(ParcelTimelineWidgetComponent parcelTimelineWidgetComponent) {
                super(1);
                this.$component = parcelTimelineWidgetComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ ParcelTimelineDTO invoke(C7244b c7244b) {
                List<? extends ParcelTimelineDTO.SectionDTO> m849invoke7IyK4Ps = m849invoke7IyK4Ps(c7244b);
                if (m849invoke7IyK4Ps != null) {
                    return ParcelTimelineDTO.m852boximpl(m849invoke7IyK4Ps);
                }
                return null;
            }

            /* renamed from: invoke-7IyK4Ps, reason: not valid java name */
            public final List<? extends ParcelTimelineDTO.SectionDTO> m849invoke7IyK4Ps(C7244b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return this.$component.getParser().m851invokejVYV1xc(state.b());
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<ParcelTimelineDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<ParcelTimelineDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18051((ParcelTimelineWidgetComponent) config.getWidgetComponentStorage().getComponent(ParcelTimelineWidgetComponent.class)), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO;", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.orders.cml.parcelTimeline.core.ParcelTimelineComposeWidgetCoreKt$parcelTimelineWidgetFactory$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<ParcelTimelineDTO, ParcelTimelineVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.orders.cml.parcelTimeline.core.ParcelTimelineComposeWidgetCoreKt$parcelTimelineWidgetFactory$1$2$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof ParcelTimelineDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/orders/cml/parcelTimeline/data/ParcelTimelineDTO;", "state", "Ll20/d;", "info", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;", "invoke-5GYmD6c", "(Ljava/util/List;Ll20/d;)Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.orders.cml.parcelTimeline.core.ParcelTimelineComposeWidgetCoreKt$parcelTimelineWidgetFactory$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18062 extends AbstractC7737t implements Function2<ParcelTimelineDTO, d, ParcelTimelineVO> {
            final /* synthetic */ ParcelTimelineWidgetComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18062(ParcelTimelineWidgetComponent parcelTimelineWidgetComponent) {
                super(2);
                this.$component = parcelTimelineWidgetComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ ParcelTimelineVO invoke(ParcelTimelineDTO parcelTimelineDTO, d dVar) {
                return m850invoke5GYmD6c(parcelTimelineDTO.getSections(), dVar);
            }

            /* renamed from: invoke-5GYmD6c, reason: not valid java name */
            public final ParcelTimelineVO m850invoke5GYmD6c(List<? extends ParcelTimelineDTO.SectionDTO> state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().m862invoke5GYmD6c(state, info.d());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/orders/cml/parcelTimeline/presentation/ParcelTimelineVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.orders.cml.parcelTimeline.core.ParcelTimelineComposeWidgetCoreKt$parcelTimelineWidgetFactory$1$2$4, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass4 extends AbstractC7737t implements Function1<k<ParcelTimelineVO>, Unit> {
            public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

            AnonymousClass4() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<ParcelTimelineVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<ParcelTimelineVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(ComposableSingletons$ParcelTimelineComposeWidgetCoreKt.INSTANCE.m848getLambda1$orders_prodGoogleAllVendorsRelease());
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<ParcelTimelineDTO, ParcelTimelineVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<ParcelTimelineDTO, ParcelTimelineVO> jVar) {
            jVar.k(AnonymousClass1.INSTANCE, new C18062((ParcelTimelineWidgetComponent) a.c(jVar, "$this$viewMapper", ParcelTimelineWidgetComponent.class)));
            jVar.c().put(ParcelTimelineUpdateEvent.class, new c.a() { // from class: ru.ozon.app.android.orders.cml.parcelTimeline.core.ParcelTimelineComposeWidgetCoreKt$parcelTimelineWidgetFactory$1$2$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    return ParcelTimelineUpdateEventKt.updateUiState((ParcelTimelineVO) old, (ParcelTimelineUpdateEvent) update);
                }
            });
            jVar.G(AnonymousClass4.INSTANCE);
        }
    }

    ParcelTimelineComposeWidgetCoreKt$parcelTimelineWidgetFactory$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<ParcelTimelineDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<ParcelTimelineDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(AnonymousClass1.INSTANCE);
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.orders.cml.parcelTimeline.core.ParcelTimelineComposeWidgetCoreKt$parcelTimelineWidgetFactory$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ParcelTimelineWidgetComponent.INSTANCE.create(it);
            }
        });
    }
}
