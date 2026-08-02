package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewHolder;

import Bi.k;
import Ci.C2779a;
import LG.a;
import MN.b;
import Sc.o;
import Sc.r;
import Sc.s;
import Vg.d;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.returns.creation.databinding.PhotoPickerButtonsBinding;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.ImageUploadingLogger;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.errors.Error;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewHolder.ButtonsViewHolder;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewObject.ButtonsVO;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020$*\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020$*\u00020$2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020$*\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020'0+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00192\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J#\u00106\u001a\u00020\u00192\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020403H\u0002¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u000208*\u0002082\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020403H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00192\u0006\u0010<\u001a\u000204H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u0002H\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010BR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010CR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010DR\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ER\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010GR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010HR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00190I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewHolder/ButtonsViewHolder;", "Ld20/a;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewObject/ButtonsVO;", "Lru/ozon/app/android/returns/creation/databinding/PhotoPickerButtonsBinding;", "binding", "Ll10/i;", "container", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LBi/k;", "galleryLauncher", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLogger;", "logger", "", "isSelect", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/PhotoPickerButtonsBinding;Ll10/i;Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel;LVg/d;LBi/k;Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLogger;ZLd20/e;)V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action;", "action", "", "observeAction", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action;)V", "Landroid/view/MotionEvent;", "event", "addPhotoClicked", "(Landroid/view/MotionEvent;)Z", "continueClicked", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action$OpenMediaPicker;", "openMediaPicker", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action$OpenMediaPicker;)V", "LCi/k;", "withOnlyImageGalleryFilter", "(LCi/k;)LCi/k;", "", "count", "withMaxCount", "(LCi/k;I)LCi/k;", "", "selectedIds", "withSelectedIds", "(LCi/k;Ljava/util/List;)LCi/k;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$ButtonState;", "state", "observeButtonState", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$ButtonState;)V", "", "", "params", "continueWithPhotos", "(Ljava/util/Map;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "newParams", "withLoadedPhotos", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/uni/atoms/data/AtomActionDTO;", "message", "showError", "(Ljava/lang/String;)V", "item", "bind", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewObject/ButtonsVO;)V", "Lru/ozon/app/android/returns/creation/databinding/PhotoPickerButtonsBinding;", "Ll10/i;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel;", "LVg/d;", "LBi/k;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLogger;", "Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class ButtonsViewHolder extends AbstractC6064a<ButtonsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PhotoPickerButtonsBinding binding;

    @NotNull
    private final i container;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private final k galleryLauncher;
    private final boolean isSelect;

    @NotNull
    private final ImageUploadingLogger logger;

    @NotNull
    private final ButtonsViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewHolder.ButtonsViewHolder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<ButtonsViewModel.Action, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, ButtonsViewHolder.class, "observeAction", "observeAction(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ButtonsViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ButtonsViewModel.Action p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((ButtonsViewHolder) this.receiver).observeAction(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewHolder.ButtonsViewHolder$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends C7735q implements Function1<ButtonsViewModel.ButtonState, Unit> {
        AnonymousClass3(Object obj) {
            super(1, obj, ButtonsViewHolder.class, "observeButtonState", "observeButtonState(Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$ButtonState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ButtonsViewModel.ButtonState buttonState) {
            invoke2(buttonState);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ButtonsViewModel.ButtonState p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((ButtonsViewHolder) this.receiver).observeButtonState(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonsViewHolder(@NotNull PhotoPickerButtonsBinding binding, @NotNull i container, @NotNull ButtonsViewModel viewModel, @NotNull d customActionHandlersStoreFactory, k kVar, @NotNull ImageUploadingLogger logger, boolean z11, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.binding = binding;
        this.container = container;
        this.viewModel = viewModel;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.galleryLauncher = kVar;
        this.logger = logger;
        this.isSelect = z11;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new ButtonsViewHolder$actionHandler$1(this)).buildHandler();
        binding.addPhotoButton.setOnTouchListener(new View.OnTouchListener() { // from class: YG.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$3$lambda$0;
                lambda$3$lambda$0 = ButtonsViewHolder.lambda$3$lambda$0(ButtonsViewHolder.this, view, motionEvent);
                return lambda$3$lambda$0;
            }
        });
        binding.addMorePhotoButton.setOnTouchListener(new a(this, 1));
        binding.continueButton.setOnTouchListener(new b(this, 1));
        viewModel.getAction().observe(container.K().f(), new ButtonsViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2(this)));
        viewModel.getButtonState().observe(container.K().f(), new ButtonsViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass3(this)));
    }

    private final boolean addPhotoClicked(MotionEvent event) {
        if (event.getAction() != 1) {
            return false;
        }
        this.viewModel.addPhoto();
        return false;
    }

    private final boolean continueClicked(MotionEvent event) {
        if (event.getAction() != 1) {
            return false;
        }
        this.viewModel.continueClicked();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void continueWithPhotos(Map<String, String> params) {
        ButtonV3DTO continueButton;
        CommonControlSettings common;
        AtomActionDTO action;
        AtomActionDTO withLoadedPhotos;
        AtomAction atomAction;
        ButtonsVO buttonsVO = (ButtonsVO) getBoundData();
        if (buttonsVO == null || (continueButton = buttonsVO.getContinueButton()) == null || (common = continueButton.getCommon()) == null || (action = common.getAction()) == null || (withLoadedPhotos = withLoadedPhotos(action, params)) == null || (atomAction = AtomActionMapperKt.toAtomAction(withLoadedPhotos, common.getTrackingInfo())) == null) {
            return;
        }
        this.actionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$3$lambda$0(ButtonsViewHolder buttonsViewHolder, View view, MotionEvent motionEvent) {
        Intrinsics.f(motionEvent);
        return buttonsViewHolder.addPhotoClicked(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$3$lambda$1(ButtonsViewHolder buttonsViewHolder, View view, MotionEvent motionEvent) {
        Intrinsics.f(motionEvent);
        return buttonsViewHolder.addPhotoClicked(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$3$lambda$2(ButtonsViewHolder buttonsViewHolder, View view, MotionEvent motionEvent) {
        Intrinsics.f(motionEvent);
        return buttonsViewHolder.continueClicked(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeAction(ButtonsViewModel.Action action) {
        if (action instanceof ButtonsViewModel.Action.Error) {
            showError(((ButtonsViewModel.Action.Error) action).getMessage());
        } else if (action instanceof ButtonsViewModel.Action.OpenMediaPicker) {
            openMediaPicker((ButtonsViewModel.Action.OpenMediaPicker) action);
        } else {
            if (!(action instanceof ButtonsViewModel.Action.Continue)) {
                throw new o();
            }
            continueWithPhotos(((ButtonsViewModel.Action.Continue) action).getParams());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void observeButtonState(ButtonsViewModel.ButtonState state) {
        ButtonV3DTO continueButton;
        ButtonV3DTO copy$default;
        PhotoPickerButtonsBinding photoPickerButtonsBinding = this.binding;
        ButtonsVO buttonsVO = (ButtonsVO) getBoundData();
        if (buttonsVO != null && (continueButton = buttonsVO.getContinueButton()) != null && (copy$default = ButtonV3DTO.copy$default(continueButton, null, null, null, null, null, null, Boolean.valueOf(state.getIsLoading()), null, null, null, null, null, null, null, null, null, null, 131007, null)) != null) {
            ButtonV3HolderKt.bind$default(photoPickerButtonsBinding.continueButton, copy$default, null, 2, null);
        }
        ButtonV3View continueButton2 = photoPickerButtonsBinding.continueButton;
        Intrinsics.checkNotNullExpressionValue(continueButton2, "continueButton");
        ViewExtKt.showOrGone(continueButton2, Boolean.valueOf(state.getCanContinue()));
        ButtonV3View addPhotoButton = photoPickerButtonsBinding.addPhotoButton;
        Intrinsics.checkNotNullExpressionValue(addPhotoButton, "addPhotoButton");
        boolean z11 = false;
        ViewExtKt.showOrGone(addPhotoButton, Boolean.valueOf(!state.getCanContinue() && state.getCanAddPhoto()));
        ButtonV3View addMorePhotoButton = photoPickerButtonsBinding.addMorePhotoButton;
        Intrinsics.checkNotNullExpressionValue(addMorePhotoButton, "addMorePhotoButton");
        if (state.getCanContinue() && state.getCanAddPhoto()) {
            z11 = true;
        }
        ViewExtKt.showOrGone(addMorePhotoButton, Boolean.valueOf(z11));
    }

    private final void openMediaPicker(ButtonsViewModel.Action.OpenMediaPicker action) {
        Object a11;
        try {
            r.Companion companion = r.INSTANCE;
            k kVar = this.galleryLauncher;
            if (kVar != null) {
                kVar.a(withSelectedIds(withMaxCount(withOnlyImageGalleryFilter(Ci.k.a(C2779a.b(), this.isSelect ? R.style.OzonGallerySelectTheme : R.style.OzonGalleryTheme, null, null, null, null, 126)), action.getMaxCount()), action.getSelectedIds()));
                a11 = Unit.f71690a;
            } else {
                a11 = null;
            }
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            this.logger.logError(new Error.Picking(b11.getMessage()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showError(String message) {
        ViewGroup rootView = ContextExtKt.getRootView(this.container.K().a());
        if (rootView != null) {
            NotificationDTO.Alignment alignment = null;
            NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null);
            if (asNotificationLayoutManager$default == null) {
                return;
            }
            CommonAtomIconDTO commonAtomIconDTO = new CommonAtomIconDTO("ic_m_danger_filled", UniColors.GRAPHIC_WARNING_PRIMARY.getToken());
            String token = UniColors.BG_WARNING_SECONDARY_INVERTED.getToken();
            Boolean bool = null;
            String str = null;
            Integer num = null;
            NotificationDTO.RightContent rightContent = null;
            Integer num2 = null;
            Object[] objArr = null == true ? 1 : 0;
            Object[] objArr2 = null == true ? 1 : 0;
            NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, new NotificationDTO(message, str, 0, num, new NotificationDTO.LeftContent(new IconDTO(IconDTO.IconSize.SIZE_500, bool, IconDTO.IconShape.SQUIRCLE, null, commonAtomIconDTO, null, token, null, null, null, null, null, null, null, null, null, 65450, null), alignment, 2, null == true ? 1 : 0), rightContent, num2, objArr, null, objArr2, 970, null == true ? 1 : 0), this.container.K().f(), this.actionHandler).show();
        }
    }

    private final AtomActionDTO withLoadedPhotos(AtomActionDTO atomActionDTO, Map<String, String> map) {
        Tc.d builder = new Tc.d();
        Map<String, String> params = atomActionDTO.getParams();
        if (params != null) {
            builder.putAll(params);
        }
        builder.putAll(map);
        Unit unit = Unit.f71690a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        return AtomActionDTO.copy$default(atomActionDTO, null, null, null, builder.u(), null, 23, null);
    }

    private final Ci.k withMaxCount(Ci.k kVar, int i11) {
        return Ci.k.a(kVar, 0, null, Ci.b.a(kVar.d(), null, null, i11, 1917), null, null, 119);
    }

    private final Ci.k withOnlyImageGalleryFilter(Ci.k kVar) {
        return Ci.k.b(kVar, 0, OnlyImageGalleryFilter.INSTANCE, null, C2779a.a(), 251);
    }

    private final Ci.k withSelectedIds(Ci.k kVar, List<Integer> list) {
        return Ci.k.a(kVar, 0, null, null, list, null, 111);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ButtonsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PhotoPickerButtonsBinding photoPickerButtonsBinding = this.binding;
        this.viewModel.setActionName(item.getUploadImageAction().getLink());
        this.viewModel.setMinMaxCount(item.getMinCount(), item.getMaxCount());
        ButtonV3View continueButton = photoPickerButtonsBinding.continueButton;
        Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
        ButtonV3HolderKt.bind$default(continueButton, item.getContinueButton(), null, 2, null);
        ButtonV3View addPhotoButton = photoPickerButtonsBinding.addPhotoButton;
        Intrinsics.checkNotNullExpressionValue(addPhotoButton, "addPhotoButton");
        ButtonV3HolderKt.bind$default(addPhotoButton, item.getAddPhotoButton(), null, 2, null);
        ButtonV3DTO addMorePhotoButton = item.getAddMorePhotoButton();
        if (addMorePhotoButton != null) {
            ButtonV3View addMorePhotoButton2 = photoPickerButtonsBinding.addMorePhotoButton;
            Intrinsics.checkNotNullExpressionValue(addMorePhotoButton2, "addMorePhotoButton");
            ButtonV3HolderKt.bind$default(addMorePhotoButton2, addMorePhotoButton, null, 2, null);
        }
    }
}
