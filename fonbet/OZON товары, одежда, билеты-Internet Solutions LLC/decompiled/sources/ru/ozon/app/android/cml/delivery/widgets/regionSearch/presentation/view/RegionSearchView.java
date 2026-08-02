package ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.R$drawable;
import ru.ozon.app.android.cml.delivery.common.ext.CommonControlSettingsExtKt;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.cml.delivery.common.ext.OzonTextInputLayoutExtKt;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation.RegionSearchVO;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.data.TextInputStyle;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\b\u0010\u0015\u001a\u00020\u0011H\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/view/RegionSearchView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "searchField", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "getSearchField", "()Lru/ozon/uni/android/input/textinput/ui/OzonTextInputLayout;", "titleTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "item", "Lru/ozon/app/android/cml/delivery/widgets/regionSearch/presentation/RegionSearchVO;", "closeKeyboard", "openKeyboard", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RegionSearchView extends LinearLayout {

    @NotNull
    private final OzonTextInputLayout searchField;

    @NotNull
    private final TextAtomV2View titleTv;

    public /* synthetic */ RegionSearchView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openKeyboard() {
        AppCompatEditText editText = OzonTextInputLayoutExtKt.getEditText(this.searchField);
        editText.requestFocus();
        KeyboardUtilsKt.showKeyboard(editText);
    }

    public final void bind(@NotNull RegionSearchVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setContentDescription(CommonControlSettingsExtKt.getAutomatizationId(item.getInput().getCommon()));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        getBackground().setTint(styleParser.parseColor(context, item.getBackgroundColor(), R$color.layer_floor_1));
        TextHolderKt.bind$default(this.titleTv, item.getTitle(), null, 2, null);
        OzonTextInputLayout ozonTextInputLayout = this.searchField;
        ozonTextInputLayout.setLabelText(item.getInput().getLabel());
        AppCompatEditText editText = OzonTextInputLayoutExtKt.getEditText(ozonTextInputLayout);
        if (!editText.isLaidOut() || editText.isLayoutRequested()) {
            editText.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation.view.RegionSearchView$bind$lambda$5$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    RegionSearchView.this.openKeyboard();
                }
            });
        } else {
            openKeyboard();
        }
    }

    public final void closeKeyboard() {
        AppCompatEditText editText = OzonTextInputLayoutExtKt.getEditText(this.searchField);
        editText.clearFocus();
        KeyboardUtilsKt.hideKeyboard(editText);
    }

    @NotNull
    public final OzonTextInputLayout getSearchField() {
        return this.searchField;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionSearchView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        OzonTextInputLayout ozonTextInputLayout = new OzonTextInputLayout(context, null, 0, 6, null);
        ozonTextInputLayout.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.topMargin = dimens.getDp24();
        layoutParams.leftMargin = dimens.getDp16();
        layoutParams.rightMargin = dimens.getDp16();
        layoutParams.bottomMargin = dimens.getDp16();
        ozonTextInputLayout.setLayoutParams(layoutParams);
        ozonTextInputLayout.setStyle(TextInputStyle.INSTANCE.createInput600Style());
        ozonTextInputLayout.setKeyboardType(OzonTextInputLayoutModel.KeyboardType.TEXT);
        ozonTextInputLayout.setKeyboardAction(OzonTextInputLayoutModel.KeyboardAction.DONE);
        ozonTextInputLayout.setState(OzonTextInputLayoutModel.State.ACTIVE);
        ozonTextInputLayout.canReset(true);
        this.searchField = ozonTextInputLayout;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dimens.getDp16();
        layoutParams2.leftMargin = dimens.getDp16();
        layoutParams2.rightMargin = dimens.getDp16();
        textAtomV2View.setLayoutParams(layoutParams2);
        this.titleTv = textAtomV2View;
        addView(textAtomV2View);
        addView(ozonTextInputLayout);
        setBackgroundResource(R$drawable.bg_region_search);
        setOrientation(1);
    }
}
