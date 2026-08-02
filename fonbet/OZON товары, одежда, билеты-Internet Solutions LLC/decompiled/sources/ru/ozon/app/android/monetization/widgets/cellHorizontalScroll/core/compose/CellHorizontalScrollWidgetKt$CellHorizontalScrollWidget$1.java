package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import Tg.b;
import Vg.e;
import WZ.l;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.CellHorizontalScrollConfig;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.CellHorizontalScrollViewMapper;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.SingleCellHorizontalScrollViewMapper;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.data.CellHorizontalScrollDTO;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.di.CellHorizontalScrollComponent;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.compose.CellHorizontalScrollComposableKt;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.compose.SingleCellHorizontalScrollComposableKt;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.multiCell.CellHorizontalScrollVI;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.singleCell.SingleCellHorizontalScrollVI;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/data/CellHorizontalScrollDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1 extends AbstractC7737t implements Function1<C6018d<CellHorizontalScrollDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/data/CellHorizontalScrollDTO;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/multiCell/CellHorizontalScrollVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<j<CellHorizontalScrollDTO, CellHorizontalScrollVI>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ InterfaceC4008j<CellHorizontalScrollComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(InterfaceC4008j<? extends CellHorizontalScrollComponent> interfaceC4008j) {
                super(1);
                this.$component$delegate = interfaceC4008j;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
            
                if (ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1.AnonymousClass4.invoke$lambda$0(r2.$component$delegate).getFeatureChecker().isEnabled(ru.ozon.app.android.monetization.flags.CellHorizontalScrollComposeFlag.INSTANCE) != false) goto L10;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(Object obj) {
                boolean z11;
                if (obj instanceof CellHorizontalScrollDTO) {
                    z11 = true;
                    if (((CellHorizontalScrollDTO) obj).getCells().size() > 1) {
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/data/CellHorizontalScrollDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/multiCell/CellHorizontalScrollVI;", "invoke", "(Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/data/CellHorizontalScrollDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<CellHorizontalScrollDTO, d, List<? extends CellHorizontalScrollVI>> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<CellHorizontalScrollVI> invoke(CellHorizontalScrollDTO state, d widgetInfo) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                long hashCode = widgetInfo.d().hashCode();
                List<CellDTO> cells = state.getCells();
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return C7714v.a0(new CellHorizontalScrollVI(hashCode, cells, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, state.getTestInfo(), null, 16, null));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/multiCell/CellHorizontalScrollVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$4$3, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<CellHorizontalScrollVI>, Unit> {
            final /* synthetic */ j<CellHorizontalScrollDTO, CellHorizontalScrollVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/multiCell/CellHorizontalScrollVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<CellHorizontalScrollVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<CellHorizontalScrollDTO, CellHorizontalScrollVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<CellHorizontalScrollDTO, CellHorizontalScrollVI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<CellHorizontalScrollVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<CellHorizontalScrollVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
                    h hVar = (h) interfaceC3967k.m(f.f());
                    interfaceC3967k.o(577460334);
                    boolean z11 = (i11 & 14) == 4;
                    Object C11 = interfaceC3967k.C();
                    if (z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$4$3$1$actionHandler$1$1(content);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Function1<b, Unit> b11 = new e.a(c4911f, hVar, (Function0) C11, ((CellHorizontalScrollComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(CellHorizontalScrollComponent.class)).getActionHandlerComponentApi()).b();
                    l lVar = (l) interfaceC3967k.m(f.e());
                    CellHorizontalScrollVI b12 = content.b();
                    interfaceC3967k.o(577475561);
                    boolean F11 = interfaceC3967k.F(lVar);
                    Object C12 = interfaceC3967k.C();
                    if (F11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$4$3$1$1$1(lVar);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    CellHorizontalScrollComposableKt.CellHorizontalScrollComposable(b12, (Function2) C12, b11, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<CellHorizontalScrollDTO, CellHorizontalScrollVI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<CellHorizontalScrollVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<CellHorizontalScrollVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1817396073, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CellHorizontalScrollComponent invoke$lambda$0(InterfaceC4008j<? extends CellHorizontalScrollComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<CellHorizontalScrollDTO, CellHorizontalScrollVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<CellHorizontalScrollDTO, CellHorizontalScrollVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.i(new AnonymousClass1(Sc.k.b(new CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$4$component$2(viewMapper))), AnonymousClass2.INSTANCE);
            viewMapper.G(new AnonymousClass3(viewMapper));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/data/CellHorizontalScrollDTO;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/singleCell/SingleCellHorizontalScrollVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<j<CellHorizontalScrollDTO, SingleCellHorizontalScrollVI>, Unit> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$5$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ InterfaceC4008j<CellHorizontalScrollComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(InterfaceC4008j<? extends CellHorizontalScrollComponent> interfaceC4008j) {
                super(1);
                this.$component$delegate = interfaceC4008j;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
            
                if (ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1.AnonymousClass5.invoke$lambda$0(r2.$component$delegate).getFeatureChecker().isEnabled(ru.ozon.app.android.monetization.flags.CellHorizontalScrollComposeFlag.INSTANCE) != false) goto L10;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(Object obj) {
                boolean z11;
                if (obj instanceof CellHorizontalScrollDTO) {
                    z11 = true;
                    if (((CellHorizontalScrollDTO) obj).getCells().size() == 1) {
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/data/CellHorizontalScrollDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/singleCell/SingleCellHorizontalScrollVI;", "invoke", "(Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/data/CellHorizontalScrollDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$5$2, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<CellHorizontalScrollDTO, d, List<? extends SingleCellHorizontalScrollVI>> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<SingleCellHorizontalScrollVI> invoke(CellHorizontalScrollDTO state, d widgetInfo) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                long hashCode = widgetInfo.d().hashCode();
                CellDTO cellDTO = (CellDTO) C7714v.K(state.getCells());
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return C7714v.a0(new SingleCellHorizontalScrollVI(hashCode, cellDTO, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, state.getTestInfo()));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/singleCell/SingleCellHorizontalScrollVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$5$3, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<SingleCellHorizontalScrollVI>, Unit> {
            final /* synthetic */ j<CellHorizontalScrollDTO, SingleCellHorizontalScrollVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/singleCell/SingleCellHorizontalScrollVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$5$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<SingleCellHorizontalScrollVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<CellHorizontalScrollDTO, SingleCellHorizontalScrollVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<CellHorizontalScrollDTO, SingleCellHorizontalScrollVI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<SingleCellHorizontalScrollVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<SingleCellHorizontalScrollVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
                    h hVar = (h) interfaceC3967k.m(f.f());
                    interfaceC3967k.o(577520142);
                    boolean z11 = (i11 & 14) == 4;
                    Object C11 = interfaceC3967k.C();
                    if (z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$5$3$1$actionHandler$1$1(content);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Function1<b, Unit> b11 = new e.a(c4911f, hVar, (Function0) C11, ((CellHorizontalScrollComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(CellHorizontalScrollComponent.class)).getActionHandlerComponentApi()).b();
                    l lVar = (l) interfaceC3967k.m(f.e());
                    SingleCellHorizontalScrollVI b12 = content.b();
                    interfaceC3967k.o(577535561);
                    boolean F11 = interfaceC3967k.F(lVar);
                    Object C12 = interfaceC3967k.C();
                    if (F11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$5$3$1$1$1(lVar);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    SingleCellHorizontalScrollComposableKt.SingleCellHorizontalScrollComposable(b12, (Function2) C12, b11, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<CellHorizontalScrollDTO, SingleCellHorizontalScrollVI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<SingleCellHorizontalScrollVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<SingleCellHorizontalScrollVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 316031232, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass5() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CellHorizontalScrollComponent invoke$lambda$0(InterfaceC4008j<? extends CellHorizontalScrollComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<CellHorizontalScrollDTO, SingleCellHorizontalScrollVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<CellHorizontalScrollDTO, SingleCellHorizontalScrollVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.i(new AnonymousClass1(Sc.k.b(new CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$5$component$2(viewMapper))), AnonymousClass2.INSTANCE);
            viewMapper.G(new AnonymousClass3(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<CellHorizontalScrollDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<CellHorizontalScrollDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        final JsonParser jsonParser = this.$jsonDeserializer;
        ComposeWidget.o(new C6018d.a() { // from class: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$invoke$$inlined$rawConfig$1
            @Override // d00.C6018d.a
            public final InterfaceC7243a<? extends Object> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new CellHorizontalScrollConfig(JsonParser.this);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new CellHorizontalScrollViewMapper((CellHorizontalScrollComponent) it.getComponent(CellHorizontalScrollComponent.class));
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$invoke$$inlined$rawViewMapper$2
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new SingleCellHorizontalScrollViewMapper((CellHorizontalScrollComponent) it.getComponent(CellHorizontalScrollComponent.class));
            }
        });
        ComposeWidget.p(AnonymousClass4.INSTANCE);
        ComposeWidget.p(AnonymousClass5.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt$CellHorizontalScrollWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CellHorizontalScrollComponent.INSTANCE.create(it);
            }
        });
    }
}
