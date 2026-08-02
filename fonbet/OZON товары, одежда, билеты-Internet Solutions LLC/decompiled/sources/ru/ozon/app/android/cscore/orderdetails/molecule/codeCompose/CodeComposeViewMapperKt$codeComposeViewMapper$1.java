package ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import Tg.b;
import WZ.l;
import a1.C4912a;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import fd.InterfaceC6512o;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CodeComposeViewMapperKt$codeComposeViewMapper$1 extends AbstractC7737t implements Function1<j<Object, CodeComposeVI>, Unit> {
    public static final CodeComposeViewMapperKt$codeComposeViewMapper$1 INSTANCE = new CodeComposeViewMapperKt$codeComposeViewMapper$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose.CodeComposeViewMapperKt$codeComposeViewMapper$1$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof CodeComposeDTO);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "state", "Ll20/d;", "info", "Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI;", "invoke", "(Ljava/lang/Object;Ll20/d;)Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose.CodeComposeViewMapperKt$codeComposeViewMapper$1$2, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, CodeComposeVI> {
        final /* synthetic */ InterfaceC4008j<CodeComposeComponent> $component$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(InterfaceC4008j<? extends CodeComposeComponent> interfaceC4008j) {
            super(2);
            this.$component$delegate = interfaceC4008j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final CodeComposeVI invoke(Object state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            return CodeComposeViewMapperKt$codeComposeViewMapper$1.invoke$lambda$0(this.$component$delegate).getMapper().map((CodeComposeDTO) state, info);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose.CodeComposeViewMapperKt$codeComposeViewMapper$1$3, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<CodeComposeVI>, Unit> {
        final /* synthetic */ InterfaceC4008j<CodeComposeComponent> $component$delegate;
        final /* synthetic */ C7475g $widgetComponentStorage;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose.CodeComposeViewMapperKt$codeComposeViewMapper$1$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<CodeComposeVI>, g.a, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ InterfaceC4008j<CodeComposeComponent> $component$delegate;
            final /* synthetic */ C7475g $widgetComponentStorage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(C7475g c7475g, InterfaceC4008j<? extends CodeComposeComponent> interfaceC4008j) {
                super(4);
                this.$widgetComponentStorage = c7475g;
                this.$component$delegate = interfaceC4008j;
            }

            @Override // fd.InterfaceC6512o
            public /* bridge */ /* synthetic */ Unit invoke(i<CodeComposeVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, aVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<CodeComposeVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                Intrinsics.checkNotNullParameter(content, "$this$content");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i11 & 6) == 0) {
                    i11 |= interfaceC3967k.n(content) ? 4 : 2;
                }
                if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                    return;
                }
                int i12 = i11 & 14;
                Function1<b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$widgetComponentStorage, null, null, null, interfaceC3967k, i12, 14), CodeComposeViewMapperKt$codeComposeViewMapper$1.invoke$lambda$0(this.$component$delegate).getCustomActionHandlersStoreFactory().create(CopyTextActionHandler.class, ComposerActionWithActionHandler.class)));
                l lVar = (l) interfaceC3967k.m(f.e());
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                interfaceC3967k.o(1230908935);
                boolean F11 = (i12 == 4) | interfaceC3967k.F(lVar);
                Object C11 = interfaceC3967k.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new CodeComposeViewMapperKt$codeComposeViewMapper$1$3$1$1$1(content, lVar);
                    interfaceC3967k.x(C11);
                }
                interfaceC3967k.k();
                e3.i.a(aVar, null, (Function0) C11, interfaceC3967k, 6);
                CodeComposableKt.CodeComposable(content.b(), m470buildHandlerimpl, interfaceC3967k, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(C7475g c7475g, InterfaceC4008j<? extends CodeComposeComponent> interfaceC4008j) {
            super(1);
            this.$widgetComponentStorage = c7475g;
            this.$component$delegate = interfaceC4008j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k<CodeComposeVI> kVar) {
            invoke2(kVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(k<CodeComposeVI> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, 310786834, new AnonymousClass1(this.$widgetComponentStorage, this.$component$delegate)));
        }
    }

    CodeComposeViewMapperKt$codeComposeViewMapper$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CodeComposeComponent invoke$lambda$0(InterfaceC4008j<? extends CodeComposeComponent> interfaceC4008j) {
        return interfaceC4008j.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j<Object, CodeComposeVI> jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j<Object, CodeComposeVI> viewMapper) {
        Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
        C7475g widgetComponentStorage = viewMapper.getWidgetComponentStorage();
        InterfaceC4008j b11 = Sc.k.b(new CodeComposeViewMapperKt$codeComposeViewMapper$1$component$2(widgetComponentStorage));
        viewMapper.k(AnonymousClass1.INSTANCE, new AnonymousClass2(b11));
        viewMapper.G(new AnonymousClass3(widgetComponentStorage, b11));
    }
}
