package v40;

import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.base.adapters.EnumCaseInSensitiveAdapter;
import ru.ozon.fintech.features.cbottombase.common.FinSpannableAdapter;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextFieldV20DTO;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.fintech.ui.utils.Gravity;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.parsing.adapter.AtomDTOAdapterFactory;
import t40.EnumC9751a;
import t40.EnumC9752b;
import t40.EnumC9754d;
import z40.C10982a;

/* renamed from: v40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10225a {
    @NotNull
    public static final Moshi a() {
        Moshi.a aVar = new Moshi.a();
        aVar.c(CbottomElement2.class, new EnumCaseInSensitiveAdapter(CbottomElement2.class, null));
        aVar.c(Gravity.class, new EnumCaseInSensitiveAdapter(Gravity.class, Gravity.START));
        aVar.c(OzonTextInputLayoutModel.State.class, new EnumCaseInSensitiveAdapter(OzonTextInputLayoutModel.State.class, OzonTextInputLayoutModel.State.DEFAULT));
        aVar.c(OzonTextInputLayoutModel.Status.class, new EnumCaseInSensitiveAdapter(OzonTextInputLayoutModel.Status.class, OzonTextInputLayoutModel.Status.NEUTRAL));
        aVar.c(OzonTextInputLayoutModel.KeyboardType.class, new EnumCaseInSensitiveAdapter(OzonTextInputLayoutModel.KeyboardType.class, OzonTextInputLayoutModel.KeyboardType.TEXT));
        aVar.c(OzonTextInputLayoutModel.KeyboardAction.class, new EnumCaseInSensitiveAdapter(OzonTextInputLayoutModel.KeyboardAction.class, OzonTextInputLayoutModel.KeyboardAction.NONE));
        aVar.c(AddonSide.class, new EnumCaseInSensitiveAdapter(AddonSide.class, AddonSide.START));
        aVar.c(TextFieldV20DTO.b.class, new EnumCaseInSensitiveAdapter(TextFieldV20DTO.b.class, TextFieldV20DTO.b.DEFAULT500START));
        aVar.c(CbottomType.class, new EnumCaseInSensitiveAdapter(CbottomType.class, CbottomType.SHEET));
        aVar.c(EnumC9751a.class, new EnumCaseInSensitiveAdapter(EnumC9751a.class, null));
        aVar.c(EnumC9752b.class, new EnumCaseInSensitiveAdapter(EnumC9752b.class, null));
        aVar.c(EnumC9754d.class, new EnumCaseInSensitiveAdapter(EnumC9754d.class, null));
        aVar.c(CommonAtomLabelDTO.TruncatingMode.class, new EnumCaseInSensitiveAdapter(CommonAtomLabelDTO.TruncatingMode.class, null));
        aVar.c(TextDTO.TextAlignment.class, new EnumCaseInSensitiveAdapter(TextDTO.TextAlignment.class, null));
        aVar.c(TextPreset.class, new EnumCaseInSensitiveAdapter(TextPreset.class, null));
        aVar.c(CommonCellSettings.LayoutPadding.class, new EnumCaseInSensitiveAdapter(CommonCellSettings.LayoutPadding.class, null));
        aVar.c(CommonAtomLabelDTO.IconPosition.class, new EnumCaseInSensitiveAdapter(CommonAtomLabelDTO.IconPosition.class, null));
        aVar.c(CommonAtomLabelDTO.IconPosition.class, new EnumCaseInSensitiveAdapter(CommonAtomLabelDTO.IconPosition.class, null));
        aVar.c(ButtonV3DTO.StyleTypes.class, new EnumCaseInSensitiveAdapter(ButtonV3DTO.StyleTypes.class, null));
        aVar.c(ButtonV3DTO.Sizes.class, new EnumCaseInSensitiveAdapter(ButtonV3DTO.Sizes.class, null));
        aVar.c(CheckBoxDTO.CheckBoxSize.class, new EnumCaseInSensitiveAdapter(CheckBoxDTO.CheckBoxSize.class, null));
        aVar.c(CheckBoxDTO.CheckboxStatus.class, new EnumCaseInSensitiveAdapter(CheckBoxDTO.CheckboxStatus.class, null));
        aVar.c(CheckBoxDTO.CheckboxState.class, new EnumCaseInSensitiveAdapter(CheckBoxDTO.CheckboxState.class, null));
        aVar.c(RadioDTO.RadioState.class, new EnumCaseInSensitiveAdapter(RadioDTO.RadioState.class, RadioDTO.RadioState.ENABLED));
        aVar.c(RadioDTO.RadioSize.class, new EnumCaseInSensitiveAdapter(RadioDTO.RadioSize.class, RadioDTO.RadioSize.SIZE_500));
        aVar.c(TextAreaView.Status.class, new EnumCaseInSensitiveAdapter(TextAreaView.Status.class, null));
        aVar.c(TextAreaView.State.class, new EnumCaseInSensitiveAdapter(TextAreaView.State.class, null));
        aVar.c(InputView.State.class, new EnumCaseInSensitiveAdapter(InputView.State.class, InputView.State.DEFAULT));
        aVar.c(InputView.Status.class, new EnumCaseInSensitiveAdapter(InputView.Status.class, InputView.Status.NEUTRAL));
        aVar.c(InputView.Size.class, new EnumCaseInSensitiveAdapter(InputView.Size.class, InputView.Size.SIZE_600));
        aVar.c(InputView.Theme.class, new EnumCaseInSensitiveAdapter(InputView.Theme.class, InputView.Theme.SOLID));
        aVar.c(InputView.LabelPosition.class, new EnumCaseInSensitiveAdapter(InputView.LabelPosition.class, InputView.LabelPosition.OUTSIDE));
        aVar.c(InputView.InputMode.class, new EnumCaseInSensitiveAdapter(InputView.InputMode.class, InputView.InputMode.TEXT));
        aVar.b(new FinSpannableAdapter());
        aVar.a(new AtomDTOAdapterFactory());
        aVar.a(new E40.a());
        aVar.a(new C40.a());
        aVar.a(new C10982a());
        Moshi moshi = new Moshi(aVar);
        Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
        return moshi;
    }
}
