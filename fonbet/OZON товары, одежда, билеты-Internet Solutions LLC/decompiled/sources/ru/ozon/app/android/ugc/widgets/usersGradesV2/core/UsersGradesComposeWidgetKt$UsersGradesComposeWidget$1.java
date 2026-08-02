package ru.ozon.app.android.ugc.widgets.usersGradesV2.core;

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
import ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.data.UsersGradesV2DTO;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.di.UsersGradesV2Component;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation.ContextQuestionItemVO;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class UsersGradesComposeWidgetKt$UsersGradesComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<Object>, Unit> {
    final /* synthetic */ SeparatorViewMapper $separatorViewMapper;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.usersGradesV2.core.UsersGradesComposeWidgetKt$UsersGradesComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<Object>, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj20/b;", "it", "", "", "invoke", "(Lj20/b;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.widgets.usersGradesV2.core.UsersGradesComposeWidgetKt$UsersGradesComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19641 extends AbstractC7737t implements Function1<C7244b, List<? extends Object>> {
            final /* synthetic */ UsersGradesV2Component $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19641(UsersGradesV2Component usersGradesV2Component) {
                super(1);
                this.$component = usersGradesV2Component;
            }

            @Override // kotlin.jvm.functions.Function1
            public final List<Object> invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.$component.getParser().invoke(it.b());
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<Object> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<Object> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.h(config, null, new C19641((UsersGradesV2Component) config.getWidgetComponentStorage().getComponent(UsersGradesV2Component.class)), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.usersGradesV2.core.UsersGradesComposeWidgetKt$UsersGradesComposeWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<Object, ContextQuestionItemVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.widgets.usersGradesV2.core.UsersGradesComposeWidgetKt$UsersGradesComposeWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19652 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final C19652 INSTANCE = new C19652();

            C19652() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof UsersGradesV2DTO.ContextQuestionItemDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO;", "invoke", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.widgets.usersGradesV2.core.UsersGradesComposeWidgetKt$UsersGradesComposeWidget$1$2$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function2<Object, d, List<? extends ContextQuestionItemVO>> {
            final /* synthetic */ UsersGradesV2Component $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(UsersGradesV2Component usersGradesV2Component) {
                super(2);
                this.$component = usersGradesV2Component;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<ContextQuestionItemVO> invoke(Object state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().invoke((UsersGradesV2DTO.ContextQuestionItemDTO) state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.widgets.usersGradesV2.core.UsersGradesComposeWidgetKt$UsersGradesComposeWidget$1$2$4, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass4 extends AbstractC7737t implements Function1<k<ContextQuestionItemVO>, Unit> {
            public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

            AnonymousClass4() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<ContextQuestionItemVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<ContextQuestionItemVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(ComposableSingletons$UsersGradesComposeWidgetKt.INSTANCE.m1534getLambda1$ugc_prodGoogleAllVendorsRelease());
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, ContextQuestionItemVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, ContextQuestionItemVO> jVar) {
            UsersGradesV2Component usersGradesV2Component = (UsersGradesV2Component) a.c(jVar, "$this$viewMapper", UsersGradesV2Component.class);
            jVar.c().put(UsersGradesQuestionClicked.class, new c.a() { // from class: ru.ozon.app.android.ugc.widgets.usersGradesV2.core.UsersGradesComposeWidgetKt$UsersGradesComposeWidget$1$2$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    ContextQuestionItemVO contextQuestionItemVO = (ContextQuestionItemVO) old;
                    return Intrinsics.d(contextQuestionItemVO, ((UsersGradesQuestionClicked) update).getItem()) ? ContextQuestionItemVO.copy$default(contextQuestionItemVO, 0L, null, null, !contextQuestionItemVO.getIsUnfolded(), null, null, null, 0, 0.0f, 503, null) : contextQuestionItemVO;
                }
            });
            jVar.i(C19652.INSTANCE, new AnonymousClass3(usersGradesV2Component));
            jVar.G(AnonymousClass4.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UsersGradesComposeWidgetKt$UsersGradesComposeWidget$1(SeparatorViewMapper separatorViewMapper) {
        super(1);
        this.$separatorViewMapper = separatorViewMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<Object> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<Object> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(AnonymousClass1.INSTANCE);
        ComposeWidgetExtKt.rawViewMappers(ComposeWidget, this.$separatorViewMapper);
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.widgets.usersGradesV2.core.UsersGradesComposeWidgetKt$UsersGradesComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return UsersGradesV2Component.INSTANCE.create(it);
            }
        });
    }
}
