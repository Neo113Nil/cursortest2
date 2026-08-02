package ru.ozon.app.android.pdp.widgets.tabs.compose;

import A00.a;
import Ek.a;
import d00.C6018d;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.pdp.widgets.tabs.core.PdpSelectedTabChangedUpdateKey;
import ru.ozon.app.android.pdp.widgets.tabs.core.PdpVisibilityTabChangedUpdateKey;
import ru.ozon.app.android.pdp.widgets.tabs.data.PdpTabsDTO;
import ru.ozon.app.android.pdp.widgets.tabs.di.PdpTabsComponent;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsVO;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class PdpTabsComposeWidgetKt$PdpTabsComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<PdpTabsDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.tabs.compose.PdpTabsComposeWidgetKt$PdpTabsComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<PdpTabsDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.tabs.compose.PdpTabsComposeWidgetKt$PdpTabsComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18301 extends AbstractC7737t implements Function1<C7244b, PdpTabsDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18301(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final PdpTabsDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (PdpTabsDTO) this.$jsonDeserializer.fromJson(it.b(), PdpTabsDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<PdpTabsDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<PdpTabsDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18301(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.tabs.compose.PdpTabsComposeWidgetKt$PdpTabsComposeWidget$1$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<PdpTabsDTO, PdpTabsVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.tabs.compose.PdpTabsComposeWidgetKt$PdpTabsComposeWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        static final class C18313 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final C18313 INSTANCE = new C18313();

            C18313() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof PdpTabsDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO;", "invoke", "(Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.tabs.compose.PdpTabsComposeWidgetKt$PdpTabsComposeWidget$1$3$4, reason: invalid class name */
        static final class AnonymousClass4 extends AbstractC7737t implements Function2<PdpTabsDTO, d, List<? extends PdpTabsVO>> {
            final /* synthetic */ PdpTabsComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(PdpTabsComponent pdpTabsComponent) {
                super(2);
                this.$component = pdpTabsComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<PdpTabsVO> invoke(PdpTabsDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.tabs.compose.PdpTabsComposeWidgetKt$PdpTabsComposeWidget$1$3$5, reason: invalid class name */
        static final class AnonymousClass5 extends AbstractC7737t implements Function1<k<PdpTabsVO>, Unit> {
            public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

            AnonymousClass5() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<PdpTabsVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<PdpTabsVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(ComposableSingletons$PdpTabsComposeWidgetKt.INSTANCE.m897getLambda1$pdp_prodGoogleAllVendorsRelease());
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<PdpTabsDTO, PdpTabsVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<PdpTabsDTO, PdpTabsVO> jVar) {
            PdpTabsComponent pdpTabsComponent = (PdpTabsComponent) a.c(jVar, "$this$viewMapper", PdpTabsComponent.class);
            jVar.c().put(PdpSelectedTabChangedUpdateKey.class, new c.a() { // from class: ru.ozon.app.android.pdp.widgets.tabs.compose.PdpTabsComposeWidgetKt$PdpTabsComposeWidget$1$3$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    PdpSelectedTabChangedUpdateKey pdpSelectedTabChangedUpdateKey = (PdpSelectedTabChangedUpdateKey) update;
                    PdpTabsVO pdpTabsVO = (PdpTabsVO) old;
                    Iterator<PdpTabsVO.Tab> it = pdpTabsVO.getTabs().iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        if (Intrinsics.d(it.next().getGroupId(), pdpSelectedTabChangedUpdateKey.getSelectedGroupId())) {
                            break;
                        }
                        i11++;
                    }
                    List<PdpTabsVO.Tab> tabs = pdpTabsVO.getTabs();
                    ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
                    int i12 = 0;
                    for (Object obj : tabs) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        arrayList.add(PdpTabsVO.Tab.copy$default((PdpTabsVO.Tab) obj, null, null, null, false, null, i12 == i11, 0, 95, null));
                        i12 = i13;
                    }
                    return i11 == -1 ? pdpTabsVO : PdpTabsVO.copy$default(pdpTabsVO, 0L, arrayList, null, null, 0, 29, null);
                }
            });
            jVar.c().put(PdpVisibilityTabChangedUpdateKey.class, new c.a() { // from class: ru.ozon.app.android.pdp.widgets.tabs.compose.PdpTabsComposeWidgetKt$PdpTabsComposeWidget$1$3$invoke$$inlined$update$2
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    PdpVisibilityTabChangedUpdateKey pdpVisibilityTabChangedUpdateKey = (PdpVisibilityTabChangedUpdateKey) update;
                    PdpTabsVO pdpTabsVO = (PdpTabsVO) old;
                    List<PdpTabsVO.Tab> tabs = pdpTabsVO.getTabs();
                    ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
                    for (PdpTabsVO.Tab tab : tabs) {
                        if (Intrinsics.d(tab.getGroupId(), pdpVisibilityTabChangedUpdateKey.getTabGroupId())) {
                            tab = PdpTabsVO.Tab.copy$default(tab, null, null, null, pdpVisibilityTabChangedUpdateKey.getIsHidden(), null, false, 0, 119, null);
                        }
                        arrayList.add(tab);
                    }
                    return PdpTabsVO.copy$default(pdpTabsVO, 0L, arrayList, null, null, 0, 29, null);
                }
            });
            jVar.i(C18313.INSTANCE, new AnonymousClass4(pdpTabsComponent));
            jVar.G(AnonymousClass5.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdpTabsComposeWidgetKt$PdpTabsComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<PdpTabsDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<PdpTabsDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.pdp.widgets.tabs.compose.PdpTabsComposeWidgetKt$PdpTabsComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return PdpTabsComponent.INSTANCE.create(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
