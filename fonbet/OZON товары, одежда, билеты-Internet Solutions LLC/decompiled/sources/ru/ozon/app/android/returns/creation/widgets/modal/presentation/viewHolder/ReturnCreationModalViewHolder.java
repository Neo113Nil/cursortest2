package ru.ozon.app.android.returns.creation.widgets.modal.presentation.viewHolder;

import Vg.d;
import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.callCourier.CallCourierActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationModalBinding;
import ru.ozon.app.android.returns.creation.widgets.modal.presentation.decorator.ReturnCreationModalAtomDecorator;
import ru.ozon.app.android.returns.creation.widgets.modal.presentation.decorator.ReturnCreationModalHorizontalButtonsDecorator;
import ru.ozon.app.android.returns.creation.widgets.modal.presentation.viewObject.ReturnCreationModalVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001e¨\u0006*"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/modal/presentation/viewHolder/ReturnCreationModalViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/widgets/modal/presentation/viewObject/ReturnCreationModalVO;", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationModalBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationModalBinding;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "setImageMargins", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/returns/creation/widgets/modal/presentation/viewObject/ReturnCreationModalVO;Ll20/d;)V", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationModalBinding;", "getBinding", "()Lru/ozon/app/android/returns/creation/databinding/ReturnCreationModalBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "getRefs", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "customActionHandlers", "Ljava/util/Set;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "buttonsAdapter", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationModalViewHolder extends k<ReturnCreationModalVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final ReturnCreationModalBinding binding;

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    @NotNull
    private final Set<Class<? extends CustomActionHandler>> customActionHandlers;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int LARGE_IMAGE_MARGIN = ResourceExtKt.toPx(8);
    private static final int SMALL_IMAGE_MARGINS = ResourceExtKt.toPx(20);
    private static final int SMALL_IMAGE_WIDTH = ResourceExtKt.toPx(123);
    private static final int SMALL_IMAGE_HEIGHT = ResourceExtKt.toPx(123);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/modal/presentation/viewHolder/ReturnCreationModalViewHolder$Companion;", "", "<init>", "()V", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReturnCreationModalViewHolder(@NotNull ReturnCreationModalBinding binding, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        Class[] elements = {ComposerActionWithActionHandler.class, ComposerActionAndRedirectActionHandler.class, CopyTextActionHandler.class, CallCourierActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.customActionHandlers = C7705l.j0(elements);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ReturnCreationModalViewHolder$actionHandler$1(customActionHandlersStoreFactory, this)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter2.setOnAction(buildHandler);
        this.buttonsAdapter = atomsAdapter2;
        VerticalAtomsLayout verticalAtomsLayout = binding.atomsVal;
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setDecorator(new ReturnCreationModalAtomDecorator());
        atomsAdapter.setOnAction(buildHandler);
        HorizontalAtomsLayout horizontalAtomsLayout = binding.buttonsHal;
        horizontalAtomsLayout.setAdapter(atomsAdapter2);
        Context context = horizontalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        horizontalAtomsLayout.setDecorator(new ReturnCreationModalHorizontalButtonsDecorator(context));
    }

    private final void setImageMargins(ImageDTO image) {
        ImageDTO.ImageType imageType = image.getImageType();
        ImageDTO.ImageType imageType2 = ImageDTO.ImageType.FILL;
        boolean z11 = imageType == imageType2 && image.getAspectRatio() != ImageAspectRatio.RATIO_1_1;
        boolean z12 = image.getImageType() == imageType2 && image.getAspectRatio() == ImageAspectRatio.RATIO_1_1;
        Image image2 = this.binding.image;
        Intrinsics.checkNotNullExpressionValue(image2, "image");
        ViewGroup.LayoutParams layoutParams = image2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (z11) {
            int i11 = LARGE_IMAGE_MARGIN;
            layoutParams2.leftMargin = i11;
            layoutParams2.topMargin = i11;
            layoutParams2.rightMargin = i11;
            layoutParams2.bottomMargin = i11;
            layoutParams2.width = -1;
            layoutParams2.height = -2;
        } else if (z12) {
            int i12 = SMALL_IMAGE_MARGINS;
            layoutParams2.leftMargin = i12;
            layoutParams2.topMargin = i12;
            layoutParams2.rightMargin = i12;
            layoutParams2.bottomMargin = i12;
            layoutParams2.width = SMALL_IMAGE_WIDTH;
            layoutParams2.height = SMALL_IMAGE_HEIGHT;
        } else {
            layoutParams2.leftMargin = 0;
            layoutParams2.topMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.bottomMargin = 0;
        }
        image2.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReturnCreationModalVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        int themeColor = ThemeExtKt.themeColor(getContext(), R$attr.textAction);
        ReturnCreationModalBinding returnCreationModalBinding = this.binding;
        Image image = returnCreationModalBinding.image;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        ImageHolderKt.bindOrGone(image, item.getImage(), this.actionHandler);
        ImageDTO image2 = item.getImage();
        if (image2 != null) {
            setImageMargins(image2);
        }
        TextAtomV2View titleTav = returnCreationModalBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bind(titleTav, item.getText(), this.actionHandler);
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context = getContext();
        List<AtomDTO> atoms = item.getAtoms();
        ArrayList arrayList = new ArrayList(C7714v.z(atoms, 10));
        for (Parcelable parcelable : atoms) {
            if (parcelable instanceof TextDTO) {
                TextDTO textDTO = (TextDTO) parcelable;
                parcelable = TextDTO.copy$default(textDTO, OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, textDTO.getText(), null, Integer.valueOf(themeColor), null, null, 13, null), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
            }
            arrayList.add(parcelable);
        }
        atomsAdapter.bind(context, arrayList);
        this.buttonsAdapter.bind(getContext(), item.getHorizontalButtons());
        HorizontalAtomsLayout buttonsHal = returnCreationModalBinding.buttonsHal;
        Intrinsics.checkNotNullExpressionValue(buttonsHal, "buttonsHal");
        ViewExtKt.showOrGone(buttonsHal, Boolean.valueOf(!item.getHorizontalButtons().isEmpty()));
    }
}
