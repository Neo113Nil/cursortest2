package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation;

import Ek.a;
import S0.InterfaceC3967k;
import a1.C4912a;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
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
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.data.TravelCarriageSelectV4DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.data.TravelCarriageSelectV4MapperKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.di.TravelCarriageSelectV4Component;
import ru.ozon.app.android.travel.utils.listtracking.compose.ListTrackingComposeViewMapperSpecKt;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TravelCarriageSelectV4WidgetKt$travelCarriageSelectV4Widget$1 extends AbstractC7737t implements Function1<C6018d<TravelCarriageSelectV4DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation.TravelCarriageSelectV4WidgetKt$travelCarriageSelectV4Widget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<TravelCarriageSelectV4DTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation.TravelCarriageSelectV4WidgetKt$travelCarriageSelectV4Widget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C19311 extends AbstractC7737t implements Function1<C7244b, TravelCarriageSelectV4DTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19311(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final TravelCarriageSelectV4DTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (TravelCarriageSelectV4DTO) this.$jsonDeserializer.fromJson(it.b(), TravelCarriageSelectV4DTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<TravelCarriageSelectV4DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<TravelCarriageSelectV4DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19311(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation.TravelCarriageSelectV4WidgetKt$travelCarriageSelectV4Widget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<TravelCarriageSelectV4DTO, TravelCarriageSelectV4VI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI;", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/data/TravelCarriageSelectV4DTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation.TravelCarriageSelectV4WidgetKt$travelCarriageSelectV4Widget$1$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<TravelCarriageSelectV4DTO, d, List<? extends TravelCarriageSelectV4VI>> {
            final /* synthetic */ TravelCarriageSelectV4Component $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TravelCarriageSelectV4Component travelCarriageSelectV4Component) {
                super(2);
                this.$component = travelCarriageSelectV4Component;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<TravelCarriageSelectV4VI> invoke(TravelCarriageSelectV4DTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                List<TravelCarriageSelectV4DTO.Carriage> carriages = state.getCarriages();
                TravelCarriageSelectV4Component travelCarriageSelectV4Component = this.$component;
                ArrayList arrayList = new ArrayList(C7714v.z(carriages, 10));
                Iterator<T> it = carriages.iterator();
                while (it.hasNext()) {
                    arrayList.add(TravelCarriageSelectV4MapperKt.toVI((TravelCarriageSelectV4DTO.Carriage) it.next(), info, travelCarriageSelectV4Component.getContext()));
                }
                return arrayList;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation.TravelCarriageSelectV4WidgetKt$travelCarriageSelectV4Widget$1$3$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<TravelCarriageSelectV4VI>, Unit> {
            final /* synthetic */ TravelCarriageSelectV4Component $component;
            final /* synthetic */ j<TravelCarriageSelectV4DTO, TravelCarriageSelectV4VI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation.TravelCarriageSelectV4WidgetKt$travelCarriageSelectV4Widget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<TravelCarriageSelectV4VI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ TravelCarriageSelectV4Component $component;
                final /* synthetic */ j<TravelCarriageSelectV4DTO, TravelCarriageSelectV4VI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<TravelCarriageSelectV4DTO, TravelCarriageSelectV4VI> jVar, TravelCarriageSelectV4Component travelCarriageSelectV4Component) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = travelCarriageSelectV4Component;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<TravelCarriageSelectV4VI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<TravelCarriageSelectV4VI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        TravelCarriageSelectV4ContentKt.TravelCarriageSelectV4Content(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(TravelResultActionV2Handler.class))), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(j<TravelCarriageSelectV4DTO, TravelCarriageSelectV4VI> jVar, TravelCarriageSelectV4Component travelCarriageSelectV4Component) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = travelCarriageSelectV4Component;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<TravelCarriageSelectV4VI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<TravelCarriageSelectV4VI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -655600503, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<TravelCarriageSelectV4DTO, TravelCarriageSelectV4VI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<TravelCarriageSelectV4DTO, TravelCarriageSelectV4VI> jVar) {
            TravelCarriageSelectV4Component travelCarriageSelectV4Component = (TravelCarriageSelectV4Component) a.c(jVar, "$this$viewMapper", TravelCarriageSelectV4Component.class);
            c.j(jVar, null, new AnonymousClass1(travelCarriageSelectV4Component), 1, null);
            jVar.G(new AnonymousClass2(jVar, travelCarriageSelectV4Component));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelCarriageSelectV4WidgetKt$travelCarriageSelectV4Widget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<TravelCarriageSelectV4DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<TravelCarriageSelectV4DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation.TravelCarriageSelectV4WidgetKt$travelCarriageSelectV4Widget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(TravelCarriageSelectV4Component.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation.TravelCarriageSelectV4WidgetKt$travelCarriageSelectV4Widget$1$2$1
                    @Override // k20.InterfaceC7469a
                    public final TravelCarriageSelectV4Component component() {
                        return new TravelCarriageSelectV4Component(C7475g.this);
                    }
                });
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        ComposeWidget.l(ListTrackingComposeViewMapperSpecKt.listTrackingComposeViewMapperSpec());
    }
}
