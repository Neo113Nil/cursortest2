package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button;

import Ih.a;
import S0.InterfaceC3967k;
import S0.Q;
import Tg.b;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.di.ReturnCreationPhotoPickerPerImageTypeComponent;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.PickerViewModel;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/button/ButtonVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ButtonViewMapperKt$buttonViewMapper$1 extends AbstractC7737t implements Function1<e<Object, ButtonVI>, Unit> {
    public static final ButtonViewMapperKt$buttonViewMapper$1 INSTANCE = new ButtonViewMapperKt$buttonViewMapper$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button.ButtonViewMapperKt$buttonViewMapper$1$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ButtonModel);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "state", "Ll20/d;", "info", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/button/ButtonVI;", "invoke", "(Ljava/lang/Object;Ll20/d;)Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/button/ButtonVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button.ButtonViewMapperKt$buttonViewMapper$1$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, ButtonVI> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final ButtonVI invoke(Object state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            ButtonModel buttonModel = (ButtonModel) state;
            return new ButtonVI(a.a("button_", info.d()), buttonModel.getContinueButton(), buttonModel.getMinCounts(), buttonModel.getNotifications());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/button/ButtonVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button.ButtonViewMapperKt$buttonViewMapper$1$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<f<ButtonVI>, Unit> {
        final /* synthetic */ ReturnCreationPhotoPickerPerImageTypeComponent $component;
        final /* synthetic */ e<Object, ButtonVI> $this_overlayViewMapper;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/button/ButtonVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button.ButtonViewMapperKt$buttonViewMapper$1$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<ButtonVI>, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ ReturnCreationPhotoPickerPerImageTypeComponent $component;
            final /* synthetic */ e<Object, ButtonVI> $this_overlayViewMapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(e<Object, ButtonVI> eVar, ReturnCreationPhotoPickerPerImageTypeComponent returnCreationPhotoPickerPerImageTypeComponent) {
                super(3);
                this.$this_overlayViewMapper = eVar;
                this.$component = returnCreationPhotoPickerPerImageTypeComponent;
            }

            @Override // fd.InterfaceC6511n
            public /* bridge */ /* synthetic */ Unit invoke(i<ButtonVI> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<ButtonVI> content, InterfaceC3967k interfaceC3967k, int i11) {
                int i12;
                Object buttonViewMapperKt$buttonViewMapper$1$3$1$1$1;
                int i13;
                PickerViewModel pickerViewModel;
                C4911f c4911f;
                Intrinsics.checkNotNullParameter(content, "$this$content");
                if ((i11 & 6) == 0) {
                    i12 = i11 | (interfaceC3967k.n(content) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i12 & 19) == 18 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                    return;
                }
                h hVar = (h) interfaceC3967k.m(b00.f.f());
                final ReturnCreationPhotoPickerPerImageTypeComponent returnCreationPhotoPickerPerImageTypeComponent = this.$component;
                PickerViewModel pickerViewModel2 = (PickerViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button.ButtonViewMapperKt$buttonViewMapper$1$3$1$invoke$$inlined$viewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        PickerViewModel viewModel = ReturnCreationPhotoPickerPerImageTypeComponent.this.getViewModel();
                        Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return viewModel;
                    }
                }).a(PickerViewModel.class);
                InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(b00.f.c());
                C4911f c4911f2 = (C4911f) interfaceC3967k.m(b00.f.d());
                Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
                int i14 = i12 & 14;
                Function1<b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i14, 14), this.$component.getCustomActionHandlersStoreFactory().create(ComposerActionAndRedirectActionHandler.class)));
                Unit unit = Unit.f71690a;
                interfaceC3967k.o(-1394376619);
                boolean F11 = interfaceC3967k.F(pickerViewModel2) | interfaceC3967k.F(c4911f2) | (i14 == 4) | interfaceC3967k.n(m470buildHandlerimpl);
                Object C11 = interfaceC3967k.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    i13 = 0;
                    pickerViewModel = pickerViewModel2;
                    c4911f = c4911f2;
                    buttonViewMapperKt$buttonViewMapper$1$3$1$1$1 = new ButtonViewMapperKt$buttonViewMapper$1$3$1$1$1(pickerViewModel, c4911f, content, m470buildHandlerimpl, null);
                    interfaceC3967k.x(buttonViewMapperKt$buttonViewMapper$1$3$1$1$1);
                } else {
                    i13 = 0;
                    pickerViewModel = pickerViewModel2;
                    buttonViewMapperKt$buttonViewMapper$1$3$1$1$1 = C11;
                    c4911f = c4911f2;
                }
                interfaceC3967k.k();
                Q.e(interfaceC3967k, unit, (Function2) buttonViewMapperKt$buttonViewMapper$1$3$1$1$1);
                ButtonV3DTO button = content.b().getButton();
                interfaceC3967k.o(-1394367420);
                int i15 = (interfaceC3967k.F(pickerViewModel) ? 1 : 0) | (i14 != 4 ? i13 : 1) | (interfaceC3967k.F(c4911f) ? 1 : 0) | (interfaceC3967k.n(m470buildHandlerimpl) ? 1 : 0) | (interfaceC3967k.F(context) ? 1 : 0) | (interfaceC3967k.F(interfaceC7851b) ? 1 : 0);
                Object C12 = interfaceC3967k.C();
                if (i15 != 0 || C12 == InterfaceC3967k.a.a()) {
                    Object buttonViewMapperKt$buttonViewMapper$1$3$1$2$1 = new ButtonViewMapperKt$buttonViewMapper$1$3$1$2$1(pickerViewModel, content, c4911f, m470buildHandlerimpl, context, interfaceC7851b);
                    interfaceC3967k.x(buttonViewMapperKt$buttonViewMapper$1$3$1$2$1);
                    C12 = buttonViewMapperKt$buttonViewMapper$1$3$1$2$1;
                }
                interfaceC3967k.k();
                ButtonComposableKt.ButtonComposable(button, (Function1) C12, interfaceC3967k, i13);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(e<Object, ButtonVI> eVar, ReturnCreationPhotoPickerPerImageTypeComponent returnCreationPhotoPickerPerImageTypeComponent) {
            super(1);
            this.$this_overlayViewMapper = eVar;
            this.$component = returnCreationPhotoPickerPerImageTypeComponent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f<ButtonVI> fVar) {
            invoke2(fVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(f<ButtonVI> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, 1825720467, new AnonymousClass1(this.$this_overlayViewMapper, this.$component)));
        }
    }

    ButtonViewMapperKt$buttonViewMapper$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(e<Object, ButtonVI> eVar) {
        invoke2(eVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(e<Object, ButtonVI> overlayViewMapper) {
        Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
        ReturnCreationPhotoPickerPerImageTypeComponent returnCreationPhotoPickerPerImageTypeComponent = (ReturnCreationPhotoPickerPerImageTypeComponent) overlayViewMapper.getWidgetComponentStorage().getComponent(ReturnCreationPhotoPickerPerImageTypeComponent.class);
        overlayViewMapper.k(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
        overlayViewMapper.s(d.a.f94674b, new AnonymousClass3(overlayViewMapper, returnCreationPhotoPickerPerImageTypeComponent));
    }
}
