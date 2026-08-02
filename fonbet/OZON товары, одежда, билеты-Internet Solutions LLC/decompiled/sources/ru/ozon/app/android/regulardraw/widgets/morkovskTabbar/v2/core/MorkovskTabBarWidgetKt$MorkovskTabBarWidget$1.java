package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import a1.C4912a;
import a1.c;
import androidx.compose.foundation.layout.a0;
import d00.C6018d;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.regulardraw.ui.FixComposerWidgetBackgroundKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.data.MorkovskTabbarDTO;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.di.MorkovskTabbarComponent;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarVI;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.collapsible.CollapsibleBottomContentWrapperKt;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1 extends AbstractC7737t implements Function1<C6018d<MorkovskTabbarDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<MorkovskTabbarDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18441 extends AbstractC7737t implements Function1<C7244b, MorkovskTabbarDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18441(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final MorkovskTabbarDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (MorkovskTabbarDTO) this.$jsonDeserializer.fromJson(it.b(), MorkovskTabbarDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<MorkovskTabbarDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<MorkovskTabbarDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18441(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<MorkovskTabbarDTO, MorkovskTabbarVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof MorkovskTabbarDTO) && C7714v.b0(null, MorkovskTabbarDTO.Behavior.BEHAVIOR_SCROLLABLE).contains(((MorkovskTabbarDTO) obj).getBehavior()));
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<MorkovskTabbarDTO, d, List<? extends MorkovskTabbarVI>> {
            final /* synthetic */ InterfaceC4008j<MorkovskTabbarComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(InterfaceC4008j<? extends MorkovskTabbarComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<MorkovskTabbarVI> invoke(MorkovskTabbarDTO state, d widgetInfo) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                return AnonymousClass3.invoke$lambda$0(this.$component$delegate).getMapper().invoke(state, widgetInfo);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18453 extends AbstractC7737t implements Function1<k<MorkovskTabbarVI>, Unit> {
            final /* synthetic */ j<MorkovskTabbarDTO, MorkovskTabbarVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<MorkovskTabbarVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<MorkovskTabbarDTO, MorkovskTabbarVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<MorkovskTabbarDTO, MorkovskTabbarVI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<MorkovskTabbarVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<MorkovskTabbarVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        FixComposerWidgetBackgroundKt.FixComposerWidgetBackground(interfaceC3967k, 0);
                        MorkovskTabBarWidgetKt.MorkovskTabbarWidgetContent(content, this.$this_viewMapper.getWidgetComponentStorage(), interfaceC3967k, i11 & 14);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18453(j<MorkovskTabbarDTO, MorkovskTabbarVI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<MorkovskTabbarVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<MorkovskTabbarVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 2057552831, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MorkovskTabbarComponent invoke$lambda$0(InterfaceC4008j<? extends MorkovskTabbarComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<MorkovskTabbarDTO, MorkovskTabbarVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<MorkovskTabbarDTO, MorkovskTabbarVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.i(AnonymousClass1.INSTANCE, new AnonymousClass2(Sc.k.b(new MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$3$component$2(viewMapper))));
            viewMapper.G(new C18453(viewMapper));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<e<MorkovskTabbarDTO, MorkovskTabbarVI>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof MorkovskTabbarDTO) && ((MorkovskTabbarDTO) obj).getBehavior() == MorkovskTabbarDTO.Behavior.BEHAVIOR_STICKY_FIXED);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<MorkovskTabbarDTO, d, List<? extends MorkovskTabbarVI>> {
            final /* synthetic */ InterfaceC4008j<MorkovskTabbarComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(InterfaceC4008j<? extends MorkovskTabbarComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<MorkovskTabbarVI> invoke(MorkovskTabbarDTO state, d widgetInfo) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                return AnonymousClass4.invoke$lambda$0(this.$component$delegate).getMapper().invoke(state, widgetInfo);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$4$3, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<f<MorkovskTabbarVI>, Unit> {
            final /* synthetic */ e<MorkovskTabbarDTO, MorkovskTabbarVI> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<MorkovskTabbarVI>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ e<MorkovskTabbarDTO, MorkovskTabbarVI> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(e<MorkovskTabbarDTO, MorkovskTabbarVI> eVar) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<MorkovskTabbarVI> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<MorkovskTabbarVI> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        MorkovskTabBarWidgetKt.MorkovskTabbarWidgetContent(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), interfaceC3967k, i11 & 14);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(e<MorkovskTabbarDTO, MorkovskTabbarVI> eVar) {
                super(1);
                this.$this_overlayViewMapper = eVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<MorkovskTabbarVI> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<MorkovskTabbarVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1905650957, new AnonymousClass1(this.$this_overlayViewMapper)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MorkovskTabbarComponent invoke$lambda$0(InterfaceC4008j<? extends MorkovskTabbarComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<MorkovskTabbarDTO, MorkovskTabbarVI> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<MorkovskTabbarDTO, MorkovskTabbarVI> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            overlayViewMapper.i(AnonymousClass1.INSTANCE, new AnonymousClass2(Sc.k.b(new MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$4$component$2(overlayViewMapper))));
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass3(overlayViewMapper));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<e<MorkovskTabbarDTO, MorkovskTabbarVI>, Unit> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$5$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof MorkovskTabbarDTO) && ((MorkovskTabbarDTO) obj).getBehavior() == MorkovskTabbarDTO.Behavior.BEHAVIOR_STICKY_COLLAPSIBLE);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$5$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<MorkovskTabbarDTO, l20.d, List<? extends MorkovskTabbarVI>> {
            final /* synthetic */ InterfaceC4008j<MorkovskTabbarComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(InterfaceC4008j<? extends MorkovskTabbarComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<MorkovskTabbarVI> invoke(MorkovskTabbarDTO state, l20.d widgetInfo) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                return AnonymousClass5.invoke$lambda$0(this.$component$delegate).getMapper().invoke(state, widgetInfo);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$5$3, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<f<MorkovskTabbarVI>, Unit> {
            final /* synthetic */ e<MorkovskTabbarDTO, MorkovskTabbarVI> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$5$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<MorkovskTabbarVI>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ e<MorkovskTabbarDTO, MorkovskTabbarVI> $this_overlayViewMapper;

                @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$5$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C18461 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
                    final /* synthetic */ i<MorkovskTabbarVI> $this_content;
                    final /* synthetic */ e<MorkovskTabbarDTO, MorkovskTabbarVI> $this_overlayViewMapper;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C18461(i<MorkovskTabbarVI> iVar, e<MorkovskTabbarDTO, MorkovskTabbarVI> eVar) {
                        super(2);
                        this.$this_content = iVar;
                        this.$this_overlayViewMapper = eVar;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                        invoke(interfaceC3967k, num.intValue());
                        return Unit.f71690a;
                    }

                    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
                        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
                            interfaceC3967k.j();
                        } else {
                            MorkovskTabBarWidgetKt.MorkovskTabbarWidgetContent(this.$this_content, this.$this_overlayViewMapper.getWidgetComponentStorage(), interfaceC3967k, 0);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(e<MorkovskTabbarDTO, MorkovskTabbarVI> eVar) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<MorkovskTabbarVI> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<MorkovskTabbarVI> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        CollapsibleBottomContentWrapperKt.CollapsibleBottomContentWrapper(a0.e(androidx.compose.ui.e.f40358c0, 1.0f), c.c(899038393, new C18461(content, this.$this_overlayViewMapper), interfaceC3967k), interfaceC3967k, 54, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(e<MorkovskTabbarDTO, MorkovskTabbarVI> eVar) {
                super(1);
                this.$this_overlayViewMapper = eVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<MorkovskTabbarVI> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<MorkovskTabbarVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1737098588, new AnonymousClass1(this.$this_overlayViewMapper)));
            }
        }

        AnonymousClass5() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MorkovskTabbarComponent invoke$lambda$0(InterfaceC4008j<? extends MorkovskTabbarComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<MorkovskTabbarDTO, MorkovskTabbarVI> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<MorkovskTabbarDTO, MorkovskTabbarVI> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            overlayViewMapper.i(AnonymousClass1.INSTANCE, new AnonymousClass2(Sc.k.b(new MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$5$component$2(overlayViewMapper))));
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass3(overlayViewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<MorkovskTabbarDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<MorkovskTabbarDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt$MorkovskTabBarWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MorkovskTabbarComponent.INSTANCE.create(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        ComposeWidget.l(AnonymousClass4.INSTANCE);
        ComposeWidget.l(AnonymousClass5.INSTANCE);
    }
}
