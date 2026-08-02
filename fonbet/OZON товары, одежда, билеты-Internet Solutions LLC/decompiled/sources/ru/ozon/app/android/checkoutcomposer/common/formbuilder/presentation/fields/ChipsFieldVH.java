package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields;

import B0.C2454a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Editable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormConfig;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.ChipsFieldVH;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldAction;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldChipsBinding;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0013\u0018\u0000 )2\u00020\u0001:\u0001)BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e*\b\u0012\u0004\u0012\u00020 0\u001eH\u0002J\"\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&H\u0002J\u0012\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/ChipsFieldVH;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldVH;", "binding", "Lru/ozon/app/android/map/databinding/ItemFormBlockFieldChipsBinding;", "onAction", "Lkotlin/Function1;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "", "onOnboardingShow", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Landroid/view/View;", "formConfig", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "<init>", "(Lru/ozon/app/android/map/databinding/ItemFormBlockFieldChipsBinding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;)V", "chipsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "chipsHorizontalDecorator", "ru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/ChipsFieldVH$chipsHorizontalDecorator$1", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/ChipsFieldVH$chipsHorizontalDecorator$1;", "currentItem", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField;", "textWatcher", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "bind", "item", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "onDetach", "addActions", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField$ChipItemMobile;", "onTagSelected", "field", "chipsWithField", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "showOnBoarding", "onBoarding", "Companion", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChipsFieldVH extends FieldVH {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int LEFT_MARGIN = UiExtKt.toPx(8);

    @NotNull
    private final ItemFormBlockFieldChipsBinding binding;

    @NotNull
    private final AtomsAdapter chipsAdapter;

    @NotNull
    private final ChipsFieldVH$chipsHorizontalDecorator$1 chipsHorizontalDecorator;
    private FormBuilderBlockVO.Field.ChipsField currentItem;

    @NotNull
    private final Function1<FieldAction, Unit> onAction;
    private final Function2<OnBoardingDTO, View, Unit> onOnboardingShow;

    @NotNull
    private final SimpleTextWatcher textWatcher;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/ChipsFieldVH$Companion;", "", "<init>", "()V", "PARAM_POSITION", "", "LEFT_MARGIN", "", "getLEFT_MARGIN", "()I", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getLEFT_MARGIN() {
            return ChipsFieldVH.LEFT_MARGIN;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.ChipsFieldVH$chipsHorizontalDecorator$1, ru.ozon.uni.atoms.af.HorizontalAtomsDecorator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipsFieldVH(@NotNull ItemFormBlockFieldChipsBinding binding, @NotNull Function1<? super FieldAction, Unit> onAction, Function2<? super OnBoardingDTO, ? super View, Unit> function2, @NotNull FormConfig formConfig) {
        super(r0, formConfig);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(formConfig, "formConfig");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.onAction = onAction;
        this.onOnboardingShow = function2;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.chipsAdapter = atomsAdapter;
        ?? r11 = new HorizontalAtomsDecorator() { // from class: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.ChipsFieldVH$chipsHorizontalDecorator$1
            @Override // ru.ozon.uni.atoms.af.CommonAtomDecorator
            public void decorate(Canvas canvas, Rect rect, int i11, boolean z11) {
                HorizontalAtomsDecorator.DefaultImpls.decorate(this, canvas, rect, i11, z11);
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalAtomsDecorator
            public LinearLayout.LayoutParams modifyHorizontalLayoutParams(LinearLayout.LayoutParams lp, AtomDTO data, int position, boolean last) {
                ChipsFieldVH.Companion companion;
                Intrinsics.checkNotNullParameter(lp, "lp");
                Intrinsics.checkNotNullParameter(data, "data");
                if (position != 0) {
                    companion = ChipsFieldVH.Companion;
                    lp.leftMargin = companion.getLEFT_MARGIN();
                }
                return lp;
            }
        };
        this.chipsHorizontalDecorator = r11;
        this.textWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.ChipsFieldVH$textWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                FormBuilderBlockVO.Field.ChipsField chipsField;
                Function1 function1;
                Intrinsics.checkNotNullParameter(s11, "s");
                chipsField = ChipsFieldVH.this.currentItem;
                if (chipsField != null) {
                    function1 = ChipsFieldVH.this.onAction;
                    function1.invoke(new FieldAction.TextChanged(chipsField, s11.toString()));
                }
            }
        };
        binding.chipsHAL.setDecorator(r11);
        binding.chipsHAL.setAdapter(atomsAdapter);
    }

    private final List<TagButtonDTO> addActions(List<FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile> list) {
        TagButtonDTO copy;
        List<FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile chipItemMobile = (FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile) obj;
            TagButtonDTO tagButton = chipItemMobile.getTagButton();
            CommonControlSettings common = chipItemMobile.getTagButton().getCommon();
            copy = tagButton.copy((r34 & 1) != 0 ? tagButton.styleType : null, (r34 & 2) != 0 ? tagButton.size : null, (r34 & 4) != 0 ? tagButton.isSelected : null, (r34 & 8) != 0 ? tagButton.isDisabled : null, (r34 & 16) != 0 ? tagButton.isClosable : null, (r34 & 32) != 0 ? tagButton.icon : null, (r34 & 64) != 0 ? tagButton.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tagButton.indicator : null, (r34 & 256) != 0 ? tagButton.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tagButton.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tagButton.common : CommonControlSettings.copy$default(common == null ? new CommonControlSettings(null, null, null, 7, null) : common, new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, null, C2454a.b("position", String.valueOf(i11)), 6, null), null, null, 6, null), (r34 & 2048) != 0 ? tagButton.closeControlSettings : null, (r34 & 4096) != 0 ? tagButton.context : null, (r34 & 8192) != 0 ? tagButton.isStateChangeDisabled : null, (r34 & 16384) != 0 ? tagButton.image : null, (r34 & 32768) != 0 ? tagButton.round : null);
            arrayList.add(copy);
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onTagSelected(FormBuilderBlockVO.Field.ChipsField field, FormBuilderBlockVO.Field.ChipsField.ChipsWithField chipsWithField, AtomAction action) {
        boolean z11;
        ArrayList arrayList;
        Boolean bool;
        Boolean bool2;
        TagButtonDTO copy;
        String str;
        List<FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile> chipsMobile;
        String str2;
        if (!(action instanceof AtomAction.Click)) {
            return;
        }
        if (chipsWithField != null && (chipsMobile = chipsWithField.getChipsMobile()) != null) {
            Map<String, String> params = ((AtomAction.Click) action).getParams();
            FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile chipItemMobile = (FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile) C7714v.Q((params == null || (str2 = params.get("position")) == null) ? 0 : Integer.parseInt(str2), chipsMobile);
            if (chipItemMobile != null && chipItemMobile.getHasTextField()) {
                z11 = true;
                if (chipsWithField == null) {
                    List<FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile> chipsMobile2 = chipsWithField.getChipsMobile();
                    FormBuilderBlockVO.Field.ChipsField.ChipsWithField.TextField textField = null;
                    if (chipsMobile2 != null) {
                        List<FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile> list = chipsMobile2;
                        arrayList = new ArrayList(C7714v.z(list, 10));
                        int i11 = 0;
                        for (Object obj : list) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                C7714v.O0();
                                throw null;
                            }
                            FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile chipItemMobile2 = (FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile) obj;
                            TagButtonDTO tagButton = chipItemMobile2.getTagButton();
                            Map<String, String> params2 = ((AtomAction.Click) action).getParams();
                            if (params2 == null || (str = params2.get("position")) == null || i11 != Integer.parseInt(str)) {
                                bool = Boolean.FALSE;
                            } else {
                                if (chipItemMobile2.getTagButton().isSelected() != null) {
                                    bool = Boolean.valueOf(!r10.booleanValue());
                                } else {
                                    bool2 = null;
                                    copy = tagButton.copy((r34 & 1) != 0 ? tagButton.styleType : null, (r34 & 2) != 0 ? tagButton.size : null, (r34 & 4) != 0 ? tagButton.isSelected : bool2, (r34 & 8) != 0 ? tagButton.isDisabled : null, (r34 & 16) != 0 ? tagButton.isClosable : null, (r34 & 32) != 0 ? tagButton.icon : null, (r34 & 64) != 0 ? tagButton.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tagButton.indicator : null, (r34 & 256) != 0 ? tagButton.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tagButton.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tagButton.common : null, (r34 & 2048) != 0 ? tagButton.closeControlSettings : null, (r34 & 4096) != 0 ? tagButton.context : null, (r34 & 8192) != 0 ? tagButton.isStateChangeDisabled : null, (r34 & 16384) != 0 ? tagButton.image : null, (r34 & 32768) != 0 ? tagButton.round : null);
                                    arrayList.add(FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile.copy$default(chipItemMobile2, false, copy, 1, null));
                                    i11 = i12;
                                }
                            }
                            bool2 = bool;
                            copy = tagButton.copy((r34 & 1) != 0 ? tagButton.styleType : null, (r34 & 2) != 0 ? tagButton.size : null, (r34 & 4) != 0 ? tagButton.isSelected : bool2, (r34 & 8) != 0 ? tagButton.isDisabled : null, (r34 & 16) != 0 ? tagButton.isClosable : null, (r34 & 32) != 0 ? tagButton.icon : null, (r34 & 64) != 0 ? tagButton.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tagButton.indicator : null, (r34 & 256) != 0 ? tagButton.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tagButton.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tagButton.common : null, (r34 & 2048) != 0 ? tagButton.closeControlSettings : null, (r34 & 4096) != 0 ? tagButton.context : null, (r34 & 8192) != 0 ? tagButton.isStateChangeDisabled : null, (r34 & 16384) != 0 ? tagButton.image : null, (r34 & 32768) != 0 ? tagButton.round : null);
                            arrayList.add(FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile.copy$default(chipItemMobile2, false, copy, 1, null));
                            i11 = i12;
                        }
                    } else {
                        arrayList = null;
                    }
                    if (z11) {
                        textField = chipsWithField.getTextField();
                    } else {
                        FormBuilderBlockVO.Field.ChipsField.ChipsWithField.TextField textField2 = chipsWithField.getTextField();
                        if (textField2 != null) {
                            textField = FormBuilderBlockVO.Field.ChipsField.ChipsWithField.TextField.copy$default(textField2, String.valueOf(this.binding.addressNameEt.getText()), null, 2, null);
                        }
                    }
                    FormBuilderBlockVO.Field.ChipsField.ChipsWithField copy2 = chipsWithField.copy(arrayList, textField, true);
                    if (copy2 != null) {
                        this.onAction.invoke(new FieldAction.ChipSelected(field, copy2));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z11 = false;
        if (chipsWithField == null) {
        }
    }

    private final void showOnBoarding(final OnBoardingDTO onBoarding) {
        final View childAt;
        if (onBoarding == null || (childAt = this.binding.chipsHAL.getChildAt(0)) == null) {
            return;
        }
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.ChipsFieldVH$showOnBoarding$lambda$11$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Function2 function2;
                if (childAt.getMeasuredWidth() <= 0 || childAt.getMeasuredHeight() <= 0) {
                    return;
                }
                childAt.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                function2 = this.onOnboardingShow;
                if (function2 != null) {
                    function2.invoke(onBoarding, childAt);
                }
            }
        });
    }

    @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldVH
    public void bind(@NotNull FormBuilderBlockVO.Field item) {
        List<FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile> chipsMobile;
        String str;
        String value;
        Intrinsics.checkNotNullParameter(item, "item");
        ItemFormBlockFieldChipsBinding itemFormBlockFieldChipsBinding = this.binding;
        FormBuilderBlockVO.Field.ChipsField chipsField = (FormBuilderBlockVO.Field.ChipsField) item;
        this.currentItem = chipsField;
        FormBuilderBlockVO.Field.ChipsField.ChipsWithField chipsWithField = chipsField.getChipsWithField();
        if (chipsWithField == null || (chipsMobile = chipsWithField.getChipsMobile()) == null) {
            return;
        }
        AtomsAdapter atomsAdapter = this.chipsAdapter;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, addActions(chipsMobile));
        this.chipsAdapter.setOnAction(new ChipsFieldVH$bind$1$1(this, item, itemFormBlockFieldChipsBinding));
        Iterator<FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile> it = chipsMobile.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.d(it.next().getTagButton().isSelected(), Boolean.TRUE)) {
                break;
            } else {
                i11++;
            }
        }
        View childAt = itemFormBlockFieldChipsBinding.chipsHAL.getChildAt(i11);
        boolean z11 = true;
        if (childAt != null) {
            childAt.setSelected(true);
        }
        List<FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile> list = chipsMobile;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (FormBuilderBlockVO.Field.ChipsField.ChipsWithField.ChipItemMobile chipItemMobile : list) {
                if (Intrinsics.d(chipItemMobile.getTagButton().isSelected(), Boolean.TRUE) && chipItemMobile.getHasTextField()) {
                    break;
                }
            }
        }
        z11 = false;
        TextInputLayout addressNameTil = itemFormBlockFieldChipsBinding.addressNameTil;
        Intrinsics.checkNotNullExpressionValue(addressNameTil, "addressNameTil");
        addressNameTil.setVisibility(z11 ? 0 : 8);
        if (z11) {
            FormBuilderBlockVO.Field.ChipsField.ChipsWithField.TextField textField = chipsField.getChipsWithField().getTextField();
            TextInputLayout textInputLayout = itemFormBlockFieldChipsBinding.addressNameTil;
            textInputLayout.e0();
            String str2 = "";
            if (textField == null || (str = textField.getPlaceholder()) == null) {
                str = "";
            }
            textInputLayout.d0(str);
            TextInputEditText textInputEditText = itemFormBlockFieldChipsBinding.addressNameEt;
            textInputEditText.removeTextChangedListener(this.textWatcher);
            if (textField != null && (value = textField.getValue()) != null) {
                str2 = value;
            }
            textInputEditText.setText(str2);
            textInputEditText.setSelection(str2.length());
            textInputEditText.addTextChangedListener(this.textWatcher);
            if (chipsField.getChipsWithField().getCanShowKeyboard()) {
                showKeyboardDelayed(textInputEditText);
            }
        }
        showOnBoarding(chipsField.getOnboarding());
    }

    @Override // jk0.j
    public void onDetach() {
        TextInputEditText addressNameEt = this.binding.addressNameEt;
        Intrinsics.checkNotNullExpressionValue(addressNameEt, "addressNameEt");
        removeKeyboardCallbacks(addressNameEt);
        super.onDetach();
    }
}
