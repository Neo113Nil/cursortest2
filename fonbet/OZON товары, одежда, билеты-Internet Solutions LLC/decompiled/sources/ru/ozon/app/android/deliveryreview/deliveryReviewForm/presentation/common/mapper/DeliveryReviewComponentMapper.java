package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.mapper;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.BulletListAtom;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.DeliveryReviewFormDTO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\tH\u0004J\f\u0010\u0004\u001a\u00020\n*\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0007H\u0002¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/mapper/DeliveryReviewComponentMapper;", "", "<init>", "()V", "toVO", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component;", "disabled", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO$ComponentValidation;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Component$ComponentValidation;", "getElement", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class DeliveryReviewComponentMapper {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryReviewFormDTO.Form.Component.ComponentType.values().length];
            try {
                iArr[DeliveryReviewFormDTO.Form.Component.ComponentType.CHECKBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeliveryReviewFormDTO.Form.Component.ComponentType.RADIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeliveryReviewFormDTO.Form.Component.ComponentType.CAROUSEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeliveryReviewFormDTO.Form.Component.ComponentType.GALLERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeliveryReviewFormDTO.Form.Component.ComponentType.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeliveryReviewFormDTO.Form.Component.ComponentType.LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DeliveryReviewFormDTO.Form.Component.ComponentType.TEXTAREA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DeliveryReviewFormDTO.Form.Component.ComponentType.TOGGLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DeliveryReviewFormDTO.Form.Component.ComponentType.UPLOAD_PHOTOS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final ElementVO getElement(DeliveryReviewFormDTO.Form.Component component) {
        DeliveryReviewFormDTO.Form.Component.ComponentType type = component.getType();
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                DeliveryReviewFormDTO.Form.Component.Checkbox checkbox = component.getCheckbox();
                if (checkbox == null) {
                    return null;
                }
                String text = checkbox.getText();
                Boolean isSelected = checkbox.isSelected();
                return new ElementVO.Checkbox(text, isSelected != null ? isSelected.booleanValue() : false, checkbox.getInformers());
            case 2:
                DeliveryReviewFormDTO.Form.Component.Radio radio = component.getRadio();
                if (radio == null) {
                    return null;
                }
                String text2 = radio.getText();
                Boolean isSelected2 = radio.isSelected();
                return new ElementVO.Radio(text2, isSelected2 != null ? isSelected2.booleanValue() : false);
            case 3:
                DeliveryReviewFormDTO.Form.Component.Carousel carousel = component.getCarousel();
                if (carousel == null) {
                    return null;
                }
                String title = carousel.getTitle();
                List<DeliveryReviewFormDTO.Form.Component.Carousel.Item> list = carousel.getList();
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                for (DeliveryReviewFormDTO.Form.Component.Carousel.Item item : list) {
                    String id2 = item.getId();
                    if (id2 == null) {
                        id2 = "";
                    }
                    String image = item.getImage();
                    String text3 = item.getText();
                    Boolean isSelected3 = item.isSelected();
                    arrayList.add(new ElementVO.Carousel.Item(id2, image, text3, isSelected3 != null ? isSelected3.booleanValue() : false));
                }
                Boolean multiple = carousel.getMultiple();
                return new ElementVO.Carousel(title, arrayList, multiple != null ? multiple.booleanValue() : false);
            case 4:
                ButtonV3Atom.LargeBorderlessButton gallery = component.getGallery();
                if (gallery != null) {
                    return new ElementVO.Gallery(gallery);
                }
                return null;
            case 5:
                TextAtom text4 = component.getText();
                if (text4 != null) {
                    return new ElementVO.Atom(text4);
                }
                return null;
            case 6:
                BulletListAtom list2 = component.getList();
                if (list2 != null) {
                    return new ElementVO.Atom(list2);
                }
                return null;
            case 7:
                DeliveryReviewFormDTO.Form.Component.Textarea textarea = component.getTextarea();
                if (textarea != null) {
                    return new ElementVO.Textarea(textarea.getTitle(), textarea.getHint(), textarea.getValue(), textarea.getHeader());
                }
                return null;
            case 8:
                DeliveryReviewFormDTO.Form.Component.Toggle toggle = component.getToggle();
                if (toggle == null) {
                    return null;
                }
                String text5 = toggle.getText();
                Boolean isSelected4 = toggle.isSelected();
                return new ElementVO.Toggle(text5, isSelected4 != null ? isSelected4.booleanValue() : false, null, 4, null);
            case 9:
                DeliveryReviewFormDTO.Form.Component.UploadPhotos uploadPhotos = component.getUploadPhotos();
                if (uploadPhotos != null) {
                    return new ElementVO.UploadPhotos(uploadPhotos.getTitle(), uploadPhotos.getLimit(), uploadPhotos.getValues());
                }
                return null;
            default:
                return null;
        }
    }

    @NotNull
    protected final List<ComponentVO> toVO(@NotNull List<DeliveryReviewFormDTO.Form.Component> list, boolean z11) {
        boolean z12;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (DeliveryReviewFormDTO.Form.Component component : list) {
            ElementVO element = getElement(component);
            ComponentVO componentVO = null;
            if (element != null) {
                String id2 = component.getId();
                DeliveryReviewFormDTO.Form.Component.ComponentValidation validate = component.getValidate();
                ComponentVO.ComponentValidation vo = validate != null ? toVO(validate) : null;
                Boolean hidden = component.getHidden();
                z12 = z11;
                componentVO = new ComponentVO(id2, vo, hidden != null ? hidden.booleanValue() : false, component.getControllingComponentId(), component.getSelectControllingComponentId(), element, z12);
            } else {
                z12 = z11;
            }
            if (componentVO != null) {
                arrayList.add(componentVO);
            }
            z11 = z12;
        }
        return arrayList;
    }

    private final ComponentVO.ComponentValidation toVO(DeliveryReviewFormDTO.Form.Component.ComponentValidation componentValidation) {
        return ComponentVO.ComponentValidation.valueOf(componentValidation.name());
    }
}
