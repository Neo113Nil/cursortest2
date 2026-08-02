package ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core;

import A00.a;
import S0.InterfaceC3967k;
import Vg.c;
import Vg.e;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import ru.ozon.android.composerCommonViewKit.compose.util.ParserKt;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.data.CommonPromoBannerDTO;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.di.CommonPromoBannerComponent;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation.CommonPromoBannerKt;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation.CommonPromoBannerVO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CommonPromoBannerConfigKt$commonPromoBannerWidget$1 extends AbstractC7737t implements Function1<C6018d<CommonPromoBannerDTO>, Unit> {
    final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;
    final /* synthetic */ JsonParser $deserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core.CommonPromoBannerConfigKt$commonPromoBannerWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<b<CommonPromoBannerDTO>, Unit> {
        final /* synthetic */ JsonParser $deserializer;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core.CommonPromoBannerConfigKt$commonPromoBannerWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes10.dex */
        /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<C7244b, CommonPromoBannerDTO> {
            AnonymousClass1(Object obj) {
                super(1, obj, ParserKt.class, "defaultParse", "defaultParse(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/composer/widget/config/WidgetParsedState;)Ljava/lang/Object;", 1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CommonPromoBannerDTO invoke(C7244b p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                JsonParser jsonParser = (JsonParser) this.receiver;
                String b11 = p02.b();
                if (b11 != null) {
                    return (CommonPromoBannerDTO) jsonParser.fromJson(b11, CommonPromoBannerDTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(JsonParser jsonParser) {
            super(1);
            this.$deserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<CommonPromoBannerDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<CommonPromoBannerDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new AnonymousClass1(this.$deserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/presentation/CommonPromoBannerVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core.CommonPromoBannerConfigKt$commonPromoBannerWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<CommonPromoBannerDTO, CommonPromoBannerVO>, Unit> {
        final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core.CommonPromoBannerConfigKt$commonPromoBannerWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes10.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof CommonPromoBannerDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;", "state", "Ll20/d;", "info", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/presentation/CommonPromoBannerVO;", "invoke", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;Ll20/d;)Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/presentation/CommonPromoBannerVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core.CommonPromoBannerConfigKt$commonPromoBannerWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes10.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<CommonPromoBannerDTO, d, CommonPromoBannerVO> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final CommonPromoBannerVO invoke(CommonPromoBannerDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return CommonPromoBannerMapperKt.toVo(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/presentation/CommonPromoBannerVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core.CommonPromoBannerConfigKt$commonPromoBannerWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes10.dex */
        static final class C14423 extends AbstractC7737t implements Function1<k<CommonPromoBannerVO>, Unit> {
            final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;
            final /* synthetic */ j<CommonPromoBannerDTO, CommonPromoBannerVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/presentation/CommonPromoBannerVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core.CommonPromoBannerConfigKt$commonPromoBannerWidget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<CommonPromoBannerVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;
                final /* synthetic */ j<CommonPromoBannerDTO, CommonPromoBannerVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(j<CommonPromoBannerDTO, CommonPromoBannerVO> jVar, Function1<? super C7475g, ? extends c> function1) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$customActionHandlersStore = function1;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<CommonPromoBannerVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<CommonPromoBannerVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    CommonPromoBannerConfigKt.InitBackgroundColor(interfaceC3967k, 0);
                    InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
                    Object obj = (CommonPromoBannerVO) content.b();
                    interfaceC3967k.o(-1206910276);
                    boolean n11 = interfaceC3967k.n(obj);
                    Object C11 = interfaceC3967k.C();
                    if (n11 || C11 == InterfaceC3967k.a.a()) {
                        Object b11 = content.b();
                        C11 = b11 instanceof CommonPromoBannerVO ? (CommonPromoBannerVO) b11 : null;
                        interfaceC3967k.x(C11);
                    }
                    CommonPromoBannerVO commonPromoBannerVO = (CommonPromoBannerVO) C11;
                    interfaceC3967k.k();
                    if (commonPromoBannerVO == null) {
                        return;
                    }
                    interfaceC3967k.o(-1206891518);
                    C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
                    h hVar = (h) interfaceC3967k.m(f.f());
                    interfaceC3967k.o(-1206900071);
                    boolean z11 = (i11 & 14) == 4;
                    Object C12 = interfaceC3967k.C();
                    if (z11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new CommonPromoBannerConfigKt$commonPromoBannerWidget$1$3$3$1$actionHandler$1$1(content);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    e.a aVar = new e.a(c4911f, hVar, (Function0) C12, ((CommonPromoBannerComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(CommonPromoBannerComponent.class)).getActionHandlerComponentApi());
                    Function1<C7475g, c> function1 = this.$customActionHandlersStore;
                    j<CommonPromoBannerDTO, CommonPromoBannerVO> jVar = this.$this_viewMapper;
                    if (function1 != null) {
                        aVar.c(function1.invoke(jVar.getWidgetComponentStorage()));
                    }
                    interfaceC3967k.o(-399729079);
                    boolean F11 = interfaceC3967k.F(interfaceC7851b) | interfaceC3967k.F(commonPromoBannerVO);
                    Object C13 = interfaceC3967k.C();
                    if (F11 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new CommonPromoBannerConfigKt$commonPromoBannerWidget$1$3$3$1$actionHandler$2$1$1(interfaceC7851b, commonPromoBannerVO);
                        interfaceC3967k.x(C13);
                    }
                    interfaceC3967k.k();
                    aVar.e((Function1) C13);
                    interfaceC3967k.k();
                    CommonPromoBannerKt.CommonPromoBanner(content.b(), androidx.compose.ui.e.f40358c0, aVar.b(), interfaceC3967k, 48, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C14423(j<CommonPromoBannerDTO, CommonPromoBannerVO> jVar, Function1<? super C7475g, ? extends c> function1) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$customActionHandlersStore = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<CommonPromoBannerVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<CommonPromoBannerVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 809984372, new AnonymousClass1(this.$this_viewMapper, this.$customActionHandlersStore)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function1<? super C7475g, ? extends c> function1) {
            super(1);
            this.$customActionHandlersStore = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<CommonPromoBannerDTO, CommonPromoBannerVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<CommonPromoBannerDTO, CommonPromoBannerVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.k(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
            viewMapper.G(new C14423(viewMapper, this.$customActionHandlersStore));
            viewMapper.c().put(UpdateCommonPromoBanner.class, new c.a() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core.CommonPromoBannerConfigKt$commonPromoBannerWidget$1$3$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    CommonPromoBannerVO commonPromoBannerVO = (CommonPromoBannerVO) old;
                    return ((UpdateCommonPromoBanner) update).getId() == commonPromoBannerVO.getId() ? CommonPromoBannerVO.copy$default(commonPromoBannerVO, 0L, null, null, true, 7, null) : commonPromoBannerVO;
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommonPromoBannerConfigKt$commonPromoBannerWidget$1(JsonParser jsonParser, Function1<? super C7475g, ? extends Vg.c> function1) {
        super(1);
        this.$deserializer = jsonParser;
        this.$customActionHandlersStore = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<CommonPromoBannerDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<CommonPromoBannerDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core.CommonPromoBannerConfigKt$commonPromoBannerWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CommonPromoBannerComponent.INSTANCE.invoke(it);
            }
        });
        ComposeWidget.a(new AnonymousClass2(this.$deserializer));
        ComposeWidget.p(new AnonymousClass3(this.$customActionHandlersStore));
    }
}
