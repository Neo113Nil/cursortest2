package ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.compose;

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
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.domain.flags.ShellNavTitleComposeWidgetEnabled;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.core.ShellNavTitleViewMapper;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.data.ShellNavTitleDTO;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.di.ShellNavTitleWidgetComponent;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.ShellNavTitleVO;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/data/ShellNavTitleDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ShellNavTitleComposeWidgetKt$ShellNavTitleComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<ShellNavTitleDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/data/ShellNavTitleDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.compose.ShellNavTitleComposeWidgetKt$ShellNavTitleComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<ShellNavTitleDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/data/ShellNavTitleDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/data/ShellNavTitleDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.compose.ShellNavTitleComposeWidgetKt$ShellNavTitleComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C18811 extends AbstractC7737t implements Function1<C7244b, ShellNavTitleDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18811(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ShellNavTitleDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (ShellNavTitleDTO) this.$jsonDeserializer.fromJson(it.b(), ShellNavTitleDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<ShellNavTitleDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<ShellNavTitleDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18811(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/data/ShellNavTitleDTO;", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/presentation/ShellNavTitleVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.compose.ShellNavTitleComposeWidgetKt$ShellNavTitleComposeWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<j<ShellNavTitleDTO, ShellNavTitleVO>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.compose.ShellNavTitleComposeWidgetKt$ShellNavTitleComposeWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ ShellNavTitleWidgetComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ShellNavTitleWidgetComponent shellNavTitleWidgetComponent) {
                super(1);
                this.$component = shellNavTitleWidgetComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof ShellNavTitleDTO) && this.$component.getFeatureChecker().isEnabled(ShellNavTitleComposeWidgetEnabled.INSTANCE));
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/data/ShellNavTitleDTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/presentation/ShellNavTitleVO;", "invoke", "(Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/data/ShellNavTitleDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.compose.ShellNavTitleComposeWidgetKt$ShellNavTitleComposeWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<ShellNavTitleDTO, d, List<? extends ShellNavTitleVO>> {
            final /* synthetic */ ShellNavTitleWidgetComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ShellNavTitleWidgetComponent shellNavTitleWidgetComponent) {
                super(2);
                this.$component = shellNavTitleWidgetComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<ShellNavTitleVO> invoke(ShellNavTitleDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/presentation/ShellNavTitleVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.compose.ShellNavTitleComposeWidgetKt$ShellNavTitleComposeWidget$1$4$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<ShellNavTitleVO>, Unit> {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            AnonymousClass3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<ShellNavTitleVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<ShellNavTitleVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(ComposableSingletons$ShellNavTitleComposeWidgetKt.INSTANCE.m1055getLambda1$storefront_prodGoogleAllVendorsRelease());
            }
        }

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<ShellNavTitleDTO, ShellNavTitleVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<ShellNavTitleDTO, ShellNavTitleVO> jVar) {
            ShellNavTitleWidgetComponent shellNavTitleWidgetComponent = (ShellNavTitleWidgetComponent) a.c(jVar, "$this$viewMapper", ShellNavTitleWidgetComponent.class);
            jVar.i(new AnonymousClass1(shellNavTitleWidgetComponent), new AnonymousClass2(shellNavTitleWidgetComponent));
            jVar.G(AnonymousClass3.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShellNavTitleComposeWidgetKt$ShellNavTitleComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<ShellNavTitleDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<ShellNavTitleDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.compose.ShellNavTitleComposeWidgetKt$ShellNavTitleComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ShellNavTitleWidgetComponent.INSTANCE.create(it);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.compose.ShellNavTitleComposeWidgetKt$ShellNavTitleComposeWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new ShellNavTitleViewMapper((ShellNavTitleWidgetComponent) it.getComponent(ShellNavTitleWidgetComponent.class));
            }
        });
        ComposeWidget.p(AnonymousClass4.INSTANCE);
    }
}
