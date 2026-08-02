package ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.core;

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
import l20.d;
import ru.ozon.android.composerCommonViewKit.compose.util.ParserKt;
import ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.data.DisclaimerV2DTO;
import ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.di.CommonDisclaimerV2Component;
import ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.presentation.CommonDisclaimerV2Kt;
import ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.presentation.CommonDisclaimerV2V0;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/DisclaimerV2DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CommonDisclaimerV2ConfigKt$commonDisclaimerV2Widget$1 extends AbstractC7737t implements Function1<C6018d<DisclaimerV2DTO>, Unit> {
    final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;
    final /* synthetic */ JsonParser $deserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/DisclaimerV2DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.core.CommonDisclaimerV2ConfigKt$commonDisclaimerV2Widget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<DisclaimerV2DTO>, Unit> {
        final /* synthetic */ JsonParser $deserializer;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.core.CommonDisclaimerV2ConfigKt$commonDisclaimerV2Widget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes10.dex */
        /* synthetic */ class C14361 extends C7735q implements Function1<C7244b, DisclaimerV2DTO> {
            C14361(Object obj) {
                super(1, obj, ParserKt.class, "defaultParse", "defaultParse(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/composer/widget/config/WidgetParsedState;)Ljava/lang/Object;", 1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisclaimerV2DTO invoke(C7244b p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                JsonParser jsonParser = (JsonParser) this.receiver;
                String b11 = p02.b();
                if (b11 != null) {
                    return (DisclaimerV2DTO) jsonParser.fromJson(b11, DisclaimerV2DTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$deserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<DisclaimerV2DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<DisclaimerV2DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C14361(this.$deserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/DisclaimerV2DTO;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/presentation/CommonDisclaimerV2V0;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.core.CommonDisclaimerV2ConfigKt$commonDisclaimerV2Widget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<DisclaimerV2DTO, CommonDisclaimerV2V0>, Unit> {
        final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.core.CommonDisclaimerV2ConfigKt$commonDisclaimerV2Widget$1$3$1, reason: invalid class name */
        /* loaded from: classes10.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DisclaimerV2DTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/DisclaimerV2DTO;", "state", "Ll20/d;", "info", "Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/presentation/CommonDisclaimerV2V0;", "invoke", "(Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/DisclaimerV2DTO;Ll20/d;)Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/presentation/CommonDisclaimerV2V0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.core.CommonDisclaimerV2ConfigKt$commonDisclaimerV2Widget$1$3$2, reason: invalid class name */
        /* loaded from: classes10.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<DisclaimerV2DTO, d, CommonDisclaimerV2V0> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final CommonDisclaimerV2V0 invoke(DisclaimerV2DTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return CommonDisclaimerV2MapperKt.toVo(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/presentation/CommonDisclaimerV2V0;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.core.CommonDisclaimerV2ConfigKt$commonDisclaimerV2Widget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes10.dex */
        static final class C14373 extends AbstractC7737t implements Function1<k<CommonDisclaimerV2V0>, Unit> {
            final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;
            final /* synthetic */ j<DisclaimerV2DTO, CommonDisclaimerV2V0> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/presentation/CommonDisclaimerV2V0;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.core.CommonDisclaimerV2ConfigKt$commonDisclaimerV2Widget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<CommonDisclaimerV2V0>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;
                final /* synthetic */ j<DisclaimerV2DTO, CommonDisclaimerV2V0> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(j<DisclaimerV2DTO, CommonDisclaimerV2V0> jVar, Function1<? super C7475g, ? extends c> function1) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$customActionHandlersStore = function1;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<CommonDisclaimerV2V0> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<CommonDisclaimerV2V0> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
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
                    interfaceC3967k.o(1436912959);
                    boolean z11 = (i11 & 14) == 4;
                    Object C11 = interfaceC3967k.C();
                    if (z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new CommonDisclaimerV2ConfigKt$commonDisclaimerV2Widget$1$3$3$1$actionHandler$1$1(content);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    e.a aVar = new e.a(c4911f, hVar, (Function0) C11, ((CommonDisclaimerV2Component) this.$this_viewMapper.getWidgetComponentStorage().getComponent(CommonDisclaimerV2Component.class)).getActionHandlerComponentApi());
                    Function1<C7475g, c> function1 = this.$customActionHandlersStore;
                    j<DisclaimerV2DTO, CommonDisclaimerV2V0> jVar = this.$this_viewMapper;
                    if (function1 != null) {
                        aVar.c(function1.invoke(jVar.getWidgetComponentStorage()));
                    }
                    CommonDisclaimerV2Kt.DisclaimerV2(content.b(), aVar.b(), interfaceC3967k, DisclaimerDTO.$stable);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C14373(j<DisclaimerV2DTO, CommonDisclaimerV2V0> jVar, Function1<? super C7475g, ? extends c> function1) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$customActionHandlersStore = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<CommonDisclaimerV2V0> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<CommonDisclaimerV2V0> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 305448010, new AnonymousClass1(this.$this_viewMapper, this.$customActionHandlersStore)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function1<? super C7475g, ? extends c> function1) {
            super(1);
            this.$customActionHandlersStore = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<DisclaimerV2DTO, CommonDisclaimerV2V0> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<DisclaimerV2DTO, CommonDisclaimerV2V0> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.k(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
            viewMapper.G(new C14373(viewMapper, this.$customActionHandlersStore));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommonDisclaimerV2ConfigKt$commonDisclaimerV2Widget$1(JsonParser jsonParser, Function1<? super C7475g, ? extends c> function1) {
        super(1);
        this.$deserializer = jsonParser;
        this.$customActionHandlersStore = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<DisclaimerV2DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<DisclaimerV2DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$deserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.core.CommonDisclaimerV2ConfigKt$commonDisclaimerV2Widget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CommonDisclaimerV2Component.INSTANCE.invoke(it);
            }
        });
        ComposeWidget.p(new AnonymousClass3(this.$customActionHandlersStore));
    }
}
