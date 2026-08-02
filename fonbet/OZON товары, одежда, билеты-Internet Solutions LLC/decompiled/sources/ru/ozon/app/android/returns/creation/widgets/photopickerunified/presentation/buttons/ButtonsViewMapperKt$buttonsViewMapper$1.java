package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons;

import Ih.a;
import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import Tg.b;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import e3.C6285b;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.PickerViewModel;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.ReturnCreationPhotoPickerUnifiedComponent;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.data.ButtonsModel;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/presentation/buttons/ButtonsVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ButtonsViewMapperKt$buttonsViewMapper$1 extends AbstractC7737t implements Function1<e<Object, ButtonsVI>, Unit> {
    public static final ButtonsViewMapperKt$buttonsViewMapper$1 INSTANCE = new ButtonsViewMapperKt$buttonsViewMapper$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons.ButtonsViewMapperKt$buttonsViewMapper$1$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ButtonsModel);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "state", "Ll20/d;", "info", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/presentation/buttons/ButtonsVI;", "invoke", "(Ljava/lang/Object;Ll20/d;)Lru/ozon/app/android/returns/creation/widgets/photopickerunified/presentation/buttons/ButtonsVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons.ButtonsViewMapperKt$buttonsViewMapper$1$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, ButtonsVI> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final ButtonsVI invoke(Object state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            ButtonsModel buttonsModel = (ButtonsModel) state;
            return new ButtonsVI(a.a("buttons_", info.d()), buttonsModel.getContinueButton(), buttonsModel.getAddPhotoButton(), buttonsModel.getAddMorePhotoButton(), buttonsModel.getUploadImageAction(), buttonsModel.getSettings(), buttonsModel.getNotifications(), buttonsModel.getPhotosScrollKey());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/presentation/buttons/ButtonsVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons.ButtonsViewMapperKt$buttonsViewMapper$1$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<f<ButtonsVI>, Unit> {
        final /* synthetic */ ReturnCreationPhotoPickerUnifiedComponent $component;
        final /* synthetic */ e<Object, ButtonsVI> $this_overlayViewMapper;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/presentation/buttons/ButtonsVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons.ButtonsViewMapperKt$buttonsViewMapper$1$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<ButtonsVI>, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ ReturnCreationPhotoPickerUnifiedComponent $component;
            final /* synthetic */ e<Object, ButtonsVI> $this_overlayViewMapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(e<Object, ButtonsVI> eVar, ReturnCreationPhotoPickerUnifiedComponent returnCreationPhotoPickerUnifiedComponent) {
                super(3);
                this.$this_overlayViewMapper = eVar;
                this.$component = returnCreationPhotoPickerUnifiedComponent;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final List<PhotoItem> invoke$lambda$2(A1<? extends List<PhotoItem>> a12) {
                return a12.getValue();
            }

            @Override // fd.InterfaceC6511n
            public /* bridge */ /* synthetic */ Unit invoke(i<ButtonsVI> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<ButtonsVI> content, InterfaceC3967k interfaceC3967k, int i11) {
                int i12;
                Object buttonsViewMapperKt$buttonsViewMapper$1$3$1$1$1;
                C4911f c4911f;
                i<ButtonsVI> iVar;
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
                View view = (View) interfaceC3967k.m(AndroidCompositionLocals_androidKt.h());
                InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(b00.f.c());
                int i13 = i12 & 14;
                Function1<b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i13, 14), this.$component.getCustomActionHandlersStoreFactory().create(ComposerActionAndRedirectActionHandler.class)));
                h hVar = (h) interfaceC3967k.m(b00.f.f());
                final ReturnCreationPhotoPickerUnifiedComponent returnCreationPhotoPickerUnifiedComponent = this.$component;
                PickerViewModel pickerViewModel = (PickerViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons.ButtonsViewMapperKt$buttonsViewMapper$1$3$1$invoke$$inlined$viewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        PickerViewModel viewModel = ReturnCreationPhotoPickerUnifiedComponent.this.getViewModel();
                        Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return viewModel;
                    }
                }).a(PickerViewModel.class);
                C4911f c4911f2 = (C4911f) interfaceC3967k.m(b00.f.d());
                Unit unit = Unit.f71690a;
                interfaceC3967k.o(-1480723931);
                boolean F11 = interfaceC3967k.F(pickerViewModel) | interfaceC3967k.F(c4911f2) | (i13 == 4) | interfaceC3967k.n(m470buildHandlerimpl);
                Object C11 = interfaceC3967k.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    buttonsViewMapperKt$buttonsViewMapper$1$3$1$1$1 = new ButtonsViewMapperKt$buttonsViewMapper$1$3$1$1$1(pickerViewModel, c4911f2, content, m470buildHandlerimpl, null);
                    c4911f = c4911f2;
                    iVar = content;
                    interfaceC3967k.x(buttonsViewMapperKt$buttonsViewMapper$1$3$1$1$1);
                } else {
                    buttonsViewMapperKt$buttonsViewMapper$1$3$1$1$1 = C11;
                    c4911f = c4911f2;
                    iVar = content;
                }
                interfaceC3967k.k();
                Q.e(interfaceC3967k, unit, (Function2) buttonsViewMapperKt$buttonsViewMapper$1$3$1$1$1);
                InterfaceC3978p0 a11 = C6285b.a(pickerViewModel.observeMedia(), K.f71697a, interfaceC3967k, 48);
                ButtonV3DTO buttonV3DTO = null;
                ButtonV3DTO continueButton = !invoke$lambda$2(a11).isEmpty() ? iVar.b().getContinueButton() : null;
                if (invoke$lambda$2(a11).isEmpty()) {
                    buttonV3DTO = iVar.b().getAddPhotoButton();
                } else if (invoke$lambda$2(a11).size() < iVar.b().getSettings().getMaxCount() && (buttonV3DTO = iVar.b().getAddMorePhotoButton()) == null) {
                    buttonV3DTO = iVar.b().getAddPhotoButton();
                }
                interfaceC3967k.o(-1480696841);
                boolean F12 = interfaceC3967k.F(pickerViewModel) | (i13 == 4) | interfaceC3967k.F(c4911f) | interfaceC3967k.n(m470buildHandlerimpl);
                Object C12 = interfaceC3967k.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new ButtonsViewMapperKt$buttonsViewMapper$1$3$1$2$1(pickerViewModel, iVar, c4911f, m470buildHandlerimpl);
                    interfaceC3967k.x(C12);
                }
                Function1 function1 = (Function1) C12;
                interfaceC3967k.k();
                interfaceC3967k.o(-1480663480);
                boolean F13 = interfaceC3967k.F(this.$component) | (i13 == 4) | interfaceC3967k.n(a11) | interfaceC3967k.F(pickerViewModel) | interfaceC3967k.F(interfaceC7851b) | interfaceC3967k.F(view);
                ReturnCreationPhotoPickerUnifiedComponent returnCreationPhotoPickerUnifiedComponent2 = this.$component;
                Object C13 = interfaceC3967k.C();
                if (F13 || C13 == InterfaceC3967k.a.a()) {
                    Object buttonsViewMapperKt$buttonsViewMapper$1$3$1$3$1 = new ButtonsViewMapperKt$buttonsViewMapper$1$3$1$3$1(returnCreationPhotoPickerUnifiedComponent2, iVar, a11, pickerViewModel, interfaceC7851b, view);
                    interfaceC3967k.x(buttonsViewMapperKt$buttonsViewMapper$1$3$1$3$1);
                    C13 = buttonsViewMapperKt$buttonsViewMapper$1$3$1$3$1;
                }
                interfaceC3967k.k();
                ButtonsComposableKt.ButtonsComposable(continueButton, buttonV3DTO, function1, (Function1) C13, interfaceC3967k, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(e<Object, ButtonsVI> eVar, ReturnCreationPhotoPickerUnifiedComponent returnCreationPhotoPickerUnifiedComponent) {
            super(1);
            this.$this_overlayViewMapper = eVar;
            this.$component = returnCreationPhotoPickerUnifiedComponent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f<ButtonsVI> fVar) {
            invoke2(fVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(f<ButtonsVI> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, -1374992132, new AnonymousClass1(this.$this_overlayViewMapper, this.$component)));
        }
    }

    ButtonsViewMapperKt$buttonsViewMapper$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(e<Object, ButtonsVI> eVar) {
        invoke2(eVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(e<Object, ButtonsVI> overlayViewMapper) {
        Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
        ReturnCreationPhotoPickerUnifiedComponent returnCreationPhotoPickerUnifiedComponent = (ReturnCreationPhotoPickerUnifiedComponent) overlayViewMapper.getWidgetComponentStorage().getComponent(ReturnCreationPhotoPickerUnifiedComponent.class);
        overlayViewMapper.k(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
        overlayViewMapper.s(d.a.f94674b, new AnonymousClass3(overlayViewMapper, returnCreationPhotoPickerUnifiedComponent));
    }
}
