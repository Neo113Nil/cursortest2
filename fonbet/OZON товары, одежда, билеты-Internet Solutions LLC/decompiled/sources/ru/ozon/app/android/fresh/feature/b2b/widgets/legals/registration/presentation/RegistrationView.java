package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.Space;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationVI;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0016J!\u0010\u001a\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b!\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI;", "fields", "Lkotlin/Function1;", "", "", "openSearchDialog", "bindInputs", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI;", "item", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "showLoader", "()V", "hideLoader", "", "errors", "showErrors", "(Ljava/util/Map;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/InputData;", "getInputData", "(Ljava/lang/String;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/InputData;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/InputFieldView;", "getInput", "(Ljava/lang/String;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/InputFieldView;", "", "inputs", "Ljava/util/Map;", "Lru/ozon/uni/android/cell/CellView;", "requisitesCellView", "Lru/ozon/uni/android/cell/CellView;", "fieldsLL", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/BannerEdoCompactView;", "edoBannerView", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/BannerEdoCompactView;", "Landroid/widget/Space;", "space", "Landroid/widget/Space;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes12.dex */
public final class RegistrationView extends LinearLayout {

    @NotNull
    private final ButtonV3View buttonView;

    @NotNull
    private final BannerEdoCompactView edoBannerView;

    @NotNull
    private final LinearLayout fieldsLL;

    @NotNull
    private final Map<String, InputFieldView> inputs;

    @NotNull
    private final CellView requisitesCellView;

    @NotNull
    private final Space space;
    public static final int $stable = 8;
    private static final int horizontalPadding = UiExtKt.toPx(Paddings.PADDING_500.getPx());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.inputs = new LinkedHashMap();
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        this.requisitesCellView = cellView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        this.fieldsLL = linearLayout;
        BannerEdoCompactView bannerEdoCompactView = new BannerEdoCompactView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i11 = horizontalPadding;
        layoutParams.setMargins(i11, i11, i11, 0);
        bannerEdoCompactView.setLayoutParams(layoutParams);
        this.edoBannerView = bannerEdoCompactView;
        Space space = new Space(context);
        space.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        this.space = space;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i11, 0, i11, Dimens.INSTANCE.getDP_12());
        buttonV3View.setLayoutParams(layoutParams2);
        this.buttonView = buttonV3View;
        setOrientation(1);
        addView(cellView);
        addView(linearLayout);
        addView(bannerEdoCompactView);
        addView(space);
        addView(buttonV3View);
    }

    private final void bindInputs(List<RegistrationVI.FieldVI> fields, Function1<? super String, Unit> openSearchDialog) {
        if (this.inputs.size() == fields.size()) {
            return;
        }
        for (RegistrationVI.FieldVI fieldVI : fields) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InputFieldView inputFieldView = new InputFieldView(context, openSearchDialog);
            RegistrationVI.FieldVI.InputVI input = fieldVI.getInput();
            if (input != null) {
                this.inputs.put(input.getName(), inputFieldView);
            }
            inputFieldView.bind(fieldVI);
            this.fieldsLL.addView(inputFieldView);
        }
    }

    public final void bind(@NotNull RegistrationVI item, @NotNull Function1<? super String, Unit> openSearchDialog, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(openSearchDialog, "openSearchDialog");
        CellHolderKt.bindOrGone$default(this.requisitesCellView, item.getRequisites(), null, 2, null);
        bindInputs(item.getFields(), openSearchDialog);
        this.edoBannerView.bindOrGone(item.getBanner());
        ButtonV3HolderKt.bindOrGone(this.buttonView, item.getButtonV3DTO(), onAction);
    }

    public final InputFieldView getInput(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.inputs.get(name);
    }

    public final InputData getInputData(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        InputFieldView inputFieldView = this.inputs.get(name);
        if (inputFieldView != null) {
            return inputFieldView.getInputData();
        }
        return null;
    }

    public final void hideLoader() {
        this.buttonView.hideLoader();
    }

    public final void showErrors(@NotNull Map<String, String> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        for (Map.Entry<String, String> entry : errors.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            InputFieldView inputFieldView = this.inputs.get(key);
            if (inputFieldView != null) {
                inputFieldView.showError(value);
            }
        }
    }

    public final void showLoader() {
        this.buttonView.showLoader();
    }
}
