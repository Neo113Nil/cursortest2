package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.view;

import Bi.b;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.R$id;
import ru.ozon.app.android.cml.delivery.common.ext.OzonTextInputLayoutExtKt;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonSettings;
import ru.ozon.uni.core.R$style;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 72\u00020\u0001:\u00017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00103\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/view/ParticipantPhoneView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "openKeyboard", "()V", "closeKeyboard", "showPhone", "hidePhoneAndErrorMessage", "", "message", "bindErrorMessage", "(Ljava/lang/String;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTv", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroid/view/View;", "countryCodeContainer", "Landroid/view/View;", "getCountryCodeContainer", "()Landroid/view/View;", "Landroidx/appcompat/widget/AppCompatImageView;", "countryFlagIv", "Landroidx/appcompat/widget/AppCompatImageView;", "getCountryFlagIv", "()Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/appcompat/widget/AppCompatTextView;", "countryCodeTv", "Landroidx/appcompat/widget/AppCompatTextView;", "getCountryCodeTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "phoneInputLayout", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "getPhoneInputLayout", "()Lru/ozon/uni/android/cell/text/TextFieldCellView;", "Lru/ozon/uni/android/cell/CellView;", "phoneCell", "Lru/ozon/uni/android/cell/CellView;", "getPhoneCell", "()Lru/ozon/uni/android/cell/CellView;", "Landroidx/recyclerview/widget/RecyclerView;", "contactsRv", "Landroidx/recyclerview/widget/RecyclerView;", "getContactsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParticipantPhoneView extends ConstraintLayout {

    @NotNull
    private final RecyclerView contactsRv;

    @NotNull
    private final View countryCodeContainer;

    @NotNull
    private final AppCompatTextView countryCodeTv;

    @NotNull
    private final AppCompatImageView countryFlagIv;

    @NotNull
    private final CellView phoneCell;

    @NotNull
    private final TextFieldCellView phoneInputLayout;

    @NotNull
    private final TextAtomV2View titleTv;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int dp2 = ResourceExtKt.toPx(2);
    private static final int dp6 = ResourceExtKt.toPx(6);
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp12 = ResourceExtKt.toPx(12);
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int dp18 = ResourceExtKt.toPx(18);
    private static final int dp24 = ResourceExtKt.toPx(24);
    private static final int countryCodeContainerWidth = ResourceExtKt.toPx(62);
    private static final int countryCodeContainerHeight = ResourceExtKt.toPx(56);
    private static final int countryFlagIvSize = ResourceExtKt.toPx(24);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/view/ParticipantPhoneView$Companion;", "", "<init>", "()V", "", "PHONE_ERROR_LABEL", "Ljava/lang/String;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ParticipantPhoneView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bindErrorMessage(String message) {
        TextFieldCellView textFieldCellView = this.phoneInputLayout;
        textFieldCellView.setMainAddonSettings(MainAddonSettings.copy$default(textFieldCellView.getMainAddonSettings(), null, null, null, null, null, 0, 0, new LayoutPadding.zero(), null, null, 895, null));
        if (message == null || message.length() == 0) {
            textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
            Context context = textFieldCellView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, UniColors.TEXT_SECONDARY.getResId()), 0.0f, 2, null);
            textFieldCellView.getAddonView().setContentDescription("");
            textFieldCellView.setLabelText("");
            textFieldCellView.getAddonView().setVisibility(8);
            return;
        }
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
        Context context2 = textFieldCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context2, UniColors.TEXT_NEGATIVE.getResId()), 0.0f, 2, null);
        textFieldCellView.getAddonView().setContentDescription("phoneErrorLabel");
        textFieldCellView.setLabelText(message);
        textFieldCellView.getAddonView().setVisibility(0);
    }

    public final void closeKeyboard() {
        AppCompatEditText editText = OzonTextInputLayoutExtKt.getEditText(this.phoneInputLayout.getMainView());
        editText.clearFocus();
        KeyboardUtilsKt.hideKeyboard(editText);
    }

    @NotNull
    public final RecyclerView getContactsRv() {
        return this.contactsRv;
    }

    @NotNull
    public final AppCompatTextView getCountryCodeTv() {
        return this.countryCodeTv;
    }

    @NotNull
    public final AppCompatImageView getCountryFlagIv() {
        return this.countryFlagIv;
    }

    @NotNull
    public final CellView getPhoneCell() {
        return this.phoneCell;
    }

    @NotNull
    public final TextFieldCellView getPhoneInputLayout() {
        return this.phoneInputLayout;
    }

    @NotNull
    public final TextAtomV2View getTitleTv() {
        return this.titleTv;
    }

    public final void hidePhoneAndErrorMessage() {
        this.phoneCell.setVisibility(8);
        bindErrorMessage(null);
    }

    public final void openKeyboard() {
        AppCompatEditText editText = OzonTextInputLayoutExtKt.getEditText(this.phoneInputLayout.getMainView());
        editText.requestFocus();
        KeyboardUtilsKt.showKeyboard(editText);
    }

    public final void showPhone() {
        this.phoneCell.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParticipantPhoneView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.participantPhone_titleTv, 0, -2);
        int i12 = dp16;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = i12;
        ((ViewGroup.MarginLayoutParams) d11).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) d11).rightMargin = i12;
        d11.f41636i = 0;
        d11.f41656t = 0;
        d11.f41658v = 0;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.titleTv = textAtomV2View;
        View view = new View(context);
        view.setId(R$id.participantPhone_countryCodeContainer);
        ConstraintLayout.b bVar = new ConstraintLayout.b(countryCodeContainerWidth, countryCodeContainerHeight);
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i12;
        int i13 = R$id.participantPhone_phoneInputLayout;
        bVar.f41636i = i13;
        bVar.f41656t = 0;
        bVar.f41642l = i13;
        bVar.f41599F = 0.0f;
        view.setLayoutParams(bVar);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int i14 = dp12;
        gradientDrawable.setCornerRadius(i14);
        gradientDrawable.setColor(ResourceExtKt.color(context, R$color.bg_primary));
        view.setBackground(gradientDrawable);
        addView(view);
        this.countryCodeContainer = view;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.participantPhone_countryFlagIv);
        int i15 = countryFlagIvSize;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(i15, i15);
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar2).leftMargin = dp6;
        int i16 = R$id.participantPhone_countryCodeContainer;
        bVar2.f41636i = i16;
        bVar2.f41656t = i16;
        bVar2.f41642l = i16;
        appCompatImageView.setLayoutParams(bVar2);
        addView(appCompatImageView);
        this.countryFlagIv = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.participantPhone_countryCodeTv);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        int i17 = dp18;
        ((ViewGroup.MarginLayoutParams) bVar3).topMargin = i17;
        ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = i17;
        ((ViewGroup.MarginLayoutParams) bVar3).leftMargin = dp2;
        ((ViewGroup.MarginLayoutParams) bVar3).rightMargin = i14;
        int i18 = R$id.participantPhone_countryCodeContainer;
        bVar3.f41636i = i18;
        bVar3.f41655s = R$id.participantPhone_countryFlagIv;
        bVar3.f41658v = i18;
        bVar3.f41642l = i18;
        appCompatTextView.setLayoutParams(bVar3);
        appCompatTextView.setTextAppearance(R$style.OzonTextAppearance_Body_500medium);
        addView(appCompatTextView);
        this.countryCodeTv = appCompatTextView;
        TextFieldCellView textFieldCellView = new TextFieldCellView(context, null, 0, 0, null, false, 62, null);
        textFieldCellView.setId(R$id.participantPhone_phoneInputLayout);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, -2);
        ((ViewGroup.MarginLayoutParams) bVar4).topMargin = dp24;
        int i19 = dp8;
        ((ViewGroup.MarginLayoutParams) bVar4).leftMargin = i19;
        ((ViewGroup.MarginLayoutParams) bVar4).rightMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = i19;
        bVar4.f41662z = i12;
        bVar4.f41638j = R$id.participantPhone_titleTv;
        bVar4.f41655s = R$id.participantPhone_countryCodeContainer;
        bVar4.f41640k = R$id.participantPhone_phoneCell;
        bVar4.f41658v = 0;
        textFieldCellView.setLayoutParams(bVar4);
        addView(textFieldCellView);
        this.phoneInputLayout = textFieldCellView;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(R$id.participantPhone_phoneCell);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(0, -2);
        ((ViewGroup.MarginLayoutParams) bVar5).topMargin = i19;
        ((ViewGroup.MarginLayoutParams) bVar5).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar5).rightMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar5).bottomMargin = i12;
        bVar5.f41638j = R$id.participantPhone_phoneInputLayout;
        bVar5.f41656t = 0;
        bVar5.f41658v = 0;
        cellView.setLayoutParams(bVar5);
        addView(cellView);
        this.phoneCell = cellView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.participantPhone_contactsRv);
        ConstraintLayout.b bVar6 = new ConstraintLayout.b(0, 0);
        ((ViewGroup.MarginLayoutParams) bVar6).topMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar6).bottomMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar6).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar6).rightMargin = i12;
        bVar6.f41638j = R$id.participantPhone_phoneCell;
        bVar6.f41656t = 0;
        bVar6.f41658v = 0;
        bVar6.f41642l = 0;
        recyclerView.setLayoutParams(bVar6);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        addView(recyclerView);
        this.contactsRv = recyclerView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }
}
