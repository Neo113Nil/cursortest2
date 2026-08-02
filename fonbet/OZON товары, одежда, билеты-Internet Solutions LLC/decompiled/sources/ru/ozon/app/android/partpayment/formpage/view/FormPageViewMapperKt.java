package ru.ozon.app.android.partpayment.formpage.view;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.partpayment.formpage.data.validation.PassFormDTO;
import ru.ozon.app.android.partpayment.formpage.data.validation.VerifySmsDTO;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.partpayment.formpage.view.vo.PassFormVO;
import ru.ozon.app.android.partpayment.formpage.view.vo.VerifySmsVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0002\u001a\f\u0010\t\u001a\u00020\n*\u00020\u0002H\u0002\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u0002H\u0002\u001a\u000e\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0002\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0002H\u0002\u001a\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u0002H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u0002H\u0002\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0002H\u0002\u001a\u000e\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u0002H\u0002\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\u0002H\u0002\u001a\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u000e\u0010 \u001a\u0004\u0018\u00010!*\u00020\u0002H\u0002\u001a\u000e\u0010\"\u001a\u0004\u0018\u00010#*\u00020\u0002H\u0002\u001a\u000e\u0010$\u001a\u0004\u0018\u00010%*\u00020\u0002H\u0002\u001a\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002\u001a\n\u0010\u0000\u001a\u00020**\u00020+\u001a\n\u0010\u0000\u001a\u00020,*\u00020-¨\u0006."}, d2 = {"toVO", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field;", "context", "Landroid/content/Context;", "mapToText", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Text;", "mapToHidden", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Hidden;", "mapToRange", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Range;", "mapToMask", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Mask;", "mapToRadio", "mapToSelector", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$AddressSelector;", "mapToAddress", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Address;", "mapToLanding", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Landing;", "mapToImage", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Image;", "mapToPicker", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Picker;", "mapToCheckbox", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Checkbox;", "mapToChecker", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Checker;", "mapToSummary", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Summary;", "mapToSeparator", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Separator;", "mapToValidateBtn", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ValidateButton;", "mapToUploadPhotoBtn", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$UploadPhotoButton;", "mapToApproveBtn", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$ApproveButton;", "getKeyboardType", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$KeyboardType;", "keyboardType", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/PassFormVO;", "Lru/ozon/app/android/partpayment/formpage/data/validation/PassFormDTO;", "Lru/ozon/app/android/partpayment/formpage/view/vo/VerifySmsVO;", "Lru/ozon/app/android/partpayment/formpage/data/validation/VerifySmsDTO;", "homecredit_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormPageViewMapperKt {
    private static final FormPageVO.Field.KeyboardType getKeyboardType(String str) {
        FormPageVO.Field.KeyboardType keyboardType;
        if (str != null) {
            String lowerCase = str.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                FormPageVO.Field.KeyboardType[] values = FormPageVO.Field.KeyboardType.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        keyboardType = null;
                        break;
                    }
                    keyboardType = values[i11];
                    String lowerCase2 = keyboardType.name().toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    if (Intrinsics.d(lowerCase2, lowerCase)) {
                        break;
                    }
                    i11++;
                }
                if (keyboardType != null) {
                    return keyboardType;
                }
            }
        }
        return FormPageVO.Field.KeyboardType.DEFAULT;
    }

    private static final FormPageVO.Field.Address mapToAddress(FormPageDTO.Field field) {
        OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(field.getTitle());
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        return new FormPageVO.Field.Address(orEmpty, name, value, displayValue, null);
    }

    private static final FormPageVO.Field.ApproveButton mapToApproveBtn(FormPageDTO.Field field) {
        if (field.getDescription() == null) {
            return null;
        }
        OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(field.getTitle());
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        String str2 = displayValue;
        String deeplink = field.getDeeplink();
        OzonSpannableString description = field.getDescription();
        String errorFoundDeeplink = field.getErrorFoundDeeplink();
        String errorFoundDeeplink2 = field.getErrorFoundDeeplink();
        boolean z11 = !(errorFoundDeeplink2 == null || errorFoundDeeplink2.length() == 0);
        String deeplink2 = field.getDeeplink();
        return new FormPageVO.Field.ApproveButton(orEmpty, str, value, str2, null, deeplink, description, errorFoundDeeplink, z11, !(deeplink2 == null || deeplink2.length() == 0));
    }

    private static final FormPageVO.Field.Checkbox mapToCheckbox(FormPageDTO.Field field) {
        OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(field.getTitle());
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        return new FormPageVO.Field.Checkbox(orEmpty, name, value, displayValue, null);
    }

    private static final FormPageVO.Field.Checker mapToChecker(FormPageDTO.Field field) {
        FormPageVO.Field.Options.Checker checker;
        List<FormPageDTO.Field.Option> options = field.getOptions();
        if (options != null) {
            ArrayList arrayList = new ArrayList();
            for (FormPageDTO.Field.Option option : options) {
                if (option.getImg() == null || option.getValue() == null || option.getDisplayValue() == null) {
                    checker = null;
                } else {
                    String displayValue = option.getDisplayValue();
                    String value = option.getValue();
                    String img = option.getImg();
                    boolean d11 = Intrinsics.d(option.getValue(), field.getValue());
                    String deeplink = option.getDeeplink();
                    checker = new FormPageVO.Field.Options.Checker(displayValue, img, value, d11, !(deeplink == null || deeplink.length() == 0) ? deeplink : null);
                }
                if (checker != null) {
                    arrayList.add(checker);
                }
            }
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null) {
                OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(field.getTitle());
                String name = field.getName();
                if (name == null) {
                    name = "";
                }
                String str = name;
                String value2 = field.getValue();
                String displayValue2 = field.getDisplayValue();
                if (displayValue2 == null) {
                    displayValue2 = field.getValue();
                }
                return new FormPageVO.Field.Checker(orEmpty, str, value2, displayValue2, null, arrayList2);
            }
        }
        return null;
    }

    private static final FormPageVO.Field.Hidden mapToHidden(FormPageDTO.Field field) {
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        return new FormPageVO.Field.Hidden(name, value, displayValue, null);
    }

    private static final FormPageVO.Field.Image mapToImage(FormPageDTO.Field field, Context context) {
        int i11 = (int) (context.getResources().getDisplayMetrics().heightPixels * 0.4d);
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        return new FormPageVO.Field.Image(str, value, displayValue, null, field.getDescription(), i11);
    }

    private static final FormPageVO.Field.Landing mapToLanding(FormPageDTO.Field field) {
        if (field.getLandingOptions() == null) {
            return null;
        }
        OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(field.getTitle());
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        return new FormPageVO.Field.Landing(orEmpty, str, value, displayValue, null, field.getDescription(), new FormPageVO.Field.Landing.LandingOptions(field.getLandingOptions().getImage(), field.getLandingOptions().getMaxValue(), field.getLandingOptions().getMaxValueHint(), field.getLandingOptions().getPeriod(), field.getLandingOptions().getPeriodHint()));
    }

    private static final FormPageVO.Field.Mask mapToMask(FormPageDTO.Field field) {
        if (field.getMaskOptions() == null) {
            return null;
        }
        OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(field.getTitle());
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        String str2 = displayValue;
        String mask = field.getMaskOptions().getMask();
        String autocompleteUrl = field.getMaskOptions().getAutocompleteUrl();
        FormPageDTO.Field.TextOptions textOptions = field.getTextOptions();
        return new FormPageVO.Field.Mask(orEmpty, str, value, str2, null, mask, autocompleteUrl, getKeyboardType(textOptions != null ? textOptions.getKeyboardType() : null), field.getType() + "." + ((Object) field.getTitle()));
    }

    private static final FormPageVO.Field.Picker mapToPicker(FormPageDTO.Field field) {
        List<FormPageDTO.Field.Option> options = field.getOptions();
        if (options != null) {
            ArrayList arrayList = new ArrayList();
            for (FormPageDTO.Field.Option option : options) {
                FormPageVO.Field.Options.Picker picker = (option.getValue() == null || option.getDisplayValue() == null) ? null : new FormPageVO.Field.Options.Picker(option.getValue(), option.getDisplayValue(), Intrinsics.d(option.getValue(), field.getValue()));
                if (picker != null) {
                    arrayList.add(picker);
                }
            }
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null) {
                OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(field.getTitle());
                String name = field.getName();
                if (name == null) {
                    name = "";
                }
                String str = name;
                String value = field.getValue();
                String displayValue = field.getDisplayValue();
                if (displayValue == null) {
                    displayValue = field.getValue();
                }
                return new FormPageVO.Field.Picker(orEmpty, str, value, displayValue, null, arrayList2);
            }
        }
        return null;
    }

    private static final FormPageVO.Field mapToRadio(FormPageDTO.Field field) {
        List<FormPageDTO.Field.Option> options = field.getOptions();
        if (options != null) {
            ArrayList arrayList = new ArrayList();
            for (FormPageDTO.Field.Option option : options) {
                FormPageVO.Field.Options.TitleValue titleValue = (option.getTitle() == null || option.getValue() == null) ? null : new FormPageVO.Field.Options.TitleValue(option.getTitle(), option.getValue());
                if (titleValue != null) {
                    arrayList.add(titleValue);
                }
            }
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null) {
                OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(field.getTitle());
                String name = field.getName();
                if (name == null) {
                    name = "";
                }
                String str = name;
                String value = field.getValue();
                String displayValue = field.getDisplayValue();
                if (displayValue == null) {
                    displayValue = field.getValue();
                }
                return new FormPageVO.Field.Radio(orEmpty, str, value, displayValue, null, arrayList2);
            }
        }
        return null;
    }

    private static final FormPageVO.Field.Range mapToRange(FormPageDTO.Field field) {
        OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(field.getTitle());
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        FormPageDTO.Field.TextOptions textOptions = field.getTextOptions();
        boolean isMultiline = textOptions != null ? textOptions.isMultiline() : false;
        FormPageDTO.Field.TextOptions textOptions2 = field.getTextOptions();
        return new FormPageVO.Field.Range(orEmpty, name, value, displayValue, null, isMultiline, getKeyboardType(textOptions2 != null ? textOptions2.getKeyboardType() : null), field.getDescription(), field.getType() + "." + ((Object) field.getTitle()));
    }

    private static final FormPageVO.Field.AddressSelector mapToSelector(FormPageDTO.Field field) {
        List list;
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        String str2 = displayValue;
        List<FormPageDTO.Field.Option> options = field.getOptions();
        if (options != null) {
            list = new ArrayList();
            for (FormPageDTO.Field.Option option : options) {
                FormPageVO.Field.Options.Address address = (option.getName() == null || option.getToField() == null || option.getFias() == null) ? null : new FormPageVO.Field.Options.Address(option.getName(), option.getToField(), option.getFias(), option.getDescription());
                if (address != null) {
                    list.add(address);
                }
            }
        } else {
            list = K.f71697a;
        }
        List list2 = list;
        OzonSpannableString description = field.getDescription();
        List<FormPageDTO.Field.Option> options2 = field.getOptions();
        return new FormPageVO.Field.AddressSelector(str, value, str2, null, description, list2, (options2 != null ? options2.size() : 0) > 1);
    }

    private static final FormPageVO.Field.Separator mapToSeparator(FormPageDTO.Field field, Context context) {
        if (field.getHeight() == null) {
            return null;
        }
        return new FormPageVO.Field.Separator(null, null, null, null, null, (int) ResourceExtKt.convertDpToPixel(context, field.getHeight().floatValue()), StyleParser.INSTANCE.parseColor(context, field.getBackground()), 31, null);
    }

    private static final FormPageVO.Field.Summary mapToSummary(FormPageDTO.Field field) {
        List list;
        List list2;
        if (field.getSummaryOptions() == null) {
            return null;
        }
        OzonSpannableString title = field.getTitle();
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        String str2 = displayValue;
        String changeDeeplink = field.getSummaryOptions().getChangeDeeplink();
        boolean z11 = true;
        boolean z12 = !(changeDeeplink == null || changeDeeplink.length() == 0);
        String changeDeeplink2 = field.getSummaryOptions().getChangeDeeplink();
        Boolean loader = field.getSummaryOptions().getLoader();
        boolean booleanValue = loader != null ? loader.booleanValue() : false;
        String changeDeeplink3 = field.getSummaryOptions().getChangeDeeplink();
        if (changeDeeplink3 != null && changeDeeplink3.length() != 0) {
            z11 = false;
        }
        String str3 = !z11 ? changeDeeplink3 : null;
        List<FormPageDTO.Field.SummaryOptions.SummaryFields> fields = field.getSummaryOptions().getFields();
        if (fields != null) {
            List<FormPageDTO.Field.SummaryOptions.SummaryFields> list3 = fields;
            list = new ArrayList(C7714v.z(list3, 10));
            for (FormPageDTO.Field.SummaryOptions.SummaryFields summaryFields : list3) {
                list.add(new FormPageVO.Field.Summary.InfoField(summaryFields.getHint(), summaryFields.getValue()));
            }
        } else {
            list = K.f71697a;
        }
        List list4 = list;
        String statusIcon = field.getSummaryOptions().getStatusIcon();
        String description = field.getSummaryOptions().getDescription();
        List<FormPageDTO.Field.SummaryOptions.Button> buttons = field.getSummaryOptions().getButtons();
        if (buttons != null) {
            List<FormPageDTO.Field.SummaryOptions.Button> list5 = buttons;
            list2 = new ArrayList(C7714v.z(list5, 10));
            for (FormPageDTO.Field.SummaryOptions.Button button : list5) {
                list2.add(new FormPageVO.Field.Summary.SummaryButton(button.getTitle(), button.getDeeplink()));
            }
        } else {
            list2 = K.f71697a;
        }
        return new FormPageVO.Field.Summary(title, str, value, str2, null, new FormPageVO.Field.Summary.SummaryOptions(str3, list4, statusIcon, description, list2), z12, changeDeeplink2, booleanValue);
    }

    private static final FormPageVO.Field.Text mapToText(FormPageDTO.Field field) {
        OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(field.getTitle());
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        FormPageDTO.Field.TextOptions textOptions = field.getTextOptions();
        boolean isMultiline = textOptions != null ? textOptions.isMultiline() : false;
        FormPageDTO.Field.TextOptions textOptions2 = field.getTextOptions();
        return new FormPageVO.Field.Text(orEmpty, name, value, displayValue, null, isMultiline, getKeyboardType(textOptions2 != null ? textOptions2.getKeyboardType() : null), field.getType() + "." + ((Object) field.getTitle()));
    }

    private static final FormPageVO.Field.UploadPhotoButton mapToUploadPhotoBtn(FormPageDTO.Field field) {
        if (field.getUploadUrl() == null) {
            return null;
        }
        OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(field.getTitle());
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        String str2 = displayValue;
        String uploadUrl = field.getUploadUrl();
        OzonSpannableString description = field.getDescription();
        String borderRatio = field.getBorderRatio();
        boolean uploadFromGallery = field.getUploadFromGallery();
        Boolean returnBack = field.getReturnBack();
        return new FormPageVO.Field.UploadPhotoButton(orEmpty, str, value, str2, null, uploadUrl, description, borderRatio, uploadFromGallery, returnBack != null ? returnBack.booleanValue() : false);
    }

    private static final FormPageVO.Field.ValidateButton mapToValidateBtn(FormPageDTO.Field field) {
        if (field.getValidationURL() == null) {
            return null;
        }
        OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(field.getTitle());
        String name = field.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        String value = field.getValue();
        String displayValue = field.getDisplayValue();
        if (displayValue == null) {
            displayValue = field.getValue();
        }
        String str2 = displayValue;
        String validationURL = field.getValidationURL();
        OzonSpannableString description = field.getDescription();
        String fullDescription = field.getFullDescription();
        Boolean returnBack = field.getReturnBack();
        return new FormPageVO.Field.ValidateButton(orEmpty, str, value, str2, null, validationURL, description, fullDescription, returnBack != null ? returnBack.booleanValue() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormPageVO.Field toVO(FormPageDTO.Field field, Context context) {
        String lowerCase = field.getType().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1857640538:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_SUMMARY)) {
                    return mapToSummary(field);
                }
                return null;
            case -1217487446:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_HIDDEN)) {
                    return mapToHidden(field);
                }
                return null;
            case -1147692044:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_ADDRESS)) {
                    return mapToAddress(field);
                }
                return null;
            case -988477298:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_PICKER)) {
                    return mapToPicker(field);
                }
                return null;
            case -311439523:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_UPLOAD_PHOTO_BUTTON)) {
                    return mapToUploadPhotoBtn(field);
                }
                return null;
            case -89864581:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_VALIDATE_BUTTON)) {
                    return mapToValidateBtn(field);
                }
                return null;
            case -52151785:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_LANDING)) {
                    return mapToLanding(field);
                }
                return null;
            case 3344108:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_MASK)) {
                    return mapToMask(field);
                }
                return null;
            case 3556653:
                if (lowerCase.equals("text")) {
                    return mapToText(field);
                }
                return null;
            case 100313435:
                if (lowerCase.equals("image")) {
                    return mapToImage(field, context);
                }
                return null;
            case 108270587:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_RADIO)) {
                    return mapToRadio(field);
                }
                return null;
            case 108280125:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_RANGE)) {
                    return mapToRange(field);
                }
                return null;
            case 549583783:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_ADDRESS_SELECTOR)) {
                    return mapToSelector(field);
                }
                return null;
            case 678969444:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_APPROVE_BUTTON)) {
                    return mapToApproveBtn(field);
                }
                return null;
            case 742313909:
                if (lowerCase.equals(FormPageDTO.Field.FIELD_TYPE_CHECKER)) {
                    return mapToChecker(field);
                }
                return null;
            case 1536891843:
                if (lowerCase.equals("checkbox")) {
                    return mapToCheckbox(field);
                }
                return null;
            case 1732829925:
                if (lowerCase.equals("separator")) {
                    return mapToSeparator(field, context);
                }
                return null;
            default:
                return null;
        }
    }

    @NotNull
    public static final PassFormVO toVO(@NotNull PassFormDTO passFormDTO) {
        Intrinsics.checkNotNullParameter(passFormDTO, "<this>");
        String deeplink = passFormDTO.getDeeplink();
        LinkedHashMap linkedHashMap = null;
        if (deeplink == null || deeplink.length() == 0) {
            deeplink = null;
        }
        String message = passFormDTO.getMessage();
        List<PassFormDTO.ErrorField> fields = passFormDTO.getFields();
        if (fields != null) {
            List<PassFormDTO.ErrorField> list = fields;
            int h11 = U.h(C7714v.z(list, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(h11);
            for (PassFormDTO.ErrorField errorField : list) {
                Pair pair = new Pair(errorField.getName(), errorField.getMessage());
                linkedHashMap2.put(pair.e(), pair.f());
            }
            linkedHashMap = linkedHashMap2;
        }
        return new PassFormVO(deeplink, message, linkedHashMap);
    }

    @NotNull
    public static final VerifySmsVO toVO(@NotNull VerifySmsDTO verifySmsDTO) {
        Intrinsics.checkNotNullParameter(verifySmsDTO, "<this>");
        String deeplink = verifySmsDTO.getDeeplink();
        LinkedHashMap linkedHashMap = null;
        if (deeplink == null || deeplink.length() == 0) {
            deeplink = null;
        }
        String message = verifySmsDTO.getMessage();
        List<PassFormDTO.ErrorField> fields = verifySmsDTO.getFields();
        if (fields != null) {
            List<PassFormDTO.ErrorField> list = fields;
            int h11 = U.h(C7714v.z(list, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(h11);
            for (PassFormDTO.ErrorField errorField : list) {
                Pair pair = new Pair(errorField.getName(), errorField.getMessage());
                linkedHashMap2.put(pair.e(), pair.f());
            }
            linkedHashMap = linkedHashMap2;
        }
        return new VerifySmsVO(deeplink, message, linkedHashMap, verifySmsDTO.isCompleted());
    }
}
