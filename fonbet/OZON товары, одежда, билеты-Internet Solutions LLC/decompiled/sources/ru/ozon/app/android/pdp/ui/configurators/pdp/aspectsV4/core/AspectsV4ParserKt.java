package ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4DTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4ImageSubWidgetObject;
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4SizeSubWidgetObject;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toVariants", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO;", "configurators_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4ParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object toVariants(AspectsV4DTO aspectsV4DTO) {
        if (((AspectsV4DTO.Variant) C7714v.K(aspectsV4DTO.getVariants())).getVariant() instanceof AspectsV4DTO.Variant.VariantType.Image) {
            List<AspectsV4DTO.Variant> variants = aspectsV4DTO.getVariants();
            ArrayList arrayList = new ArrayList(C7714v.z(variants, 10));
            for (AspectsV4DTO.Variant variant : variants) {
                AspectsV4DTO.Variant.VariantType variant2 = variant.getVariant();
                AspectsV4DTO.Variant.VariantType.Image image = variant2 instanceof AspectsV4DTO.Variant.VariantType.Image ? (AspectsV4DTO.Variant.VariantType.Image) variant2 : null;
                if (image == null) {
                    throw new IllegalArgumentException("is not Image AspectType");
                }
                Boolean isSelected = variant.isSelected();
                boolean booleanValue = isSelected != null ? isSelected.booleanValue() : false;
                arrayList.add(new AspectsV4ImageSubWidgetObject.Image(image, variant.getTrackingInfo(), variant.getRefreshDeeplink(), booleanValue, variant.isOutOfStock(), variant.getAction()));
            }
            return new AspectsV4ImageSubWidgetObject(arrayList, aspectsV4DTO.getLayoutType(), aspectsV4DTO.getTrackingInfo(), aspectsV4DTO.getSelectedColor());
        }
        List<AspectsV4DTO.Variant> variants2 = aspectsV4DTO.getVariants();
        ArrayList arrayList2 = new ArrayList(C7714v.z(variants2, 10));
        for (AspectsV4DTO.Variant variant3 : variants2) {
            AspectsV4DTO.Variant.VariantType variant4 = variant3.getVariant();
            AspectsV4DTO.Variant.VariantType.Size size = variant4 instanceof AspectsV4DTO.Variant.VariantType.Size ? (AspectsV4DTO.Variant.VariantType.Size) variant4 : null;
            if (size == null) {
                throw new IllegalArgumentException("is not Size AspectType");
            }
            TextDTO text = size.getText();
            TextDTO subtext = size.getSubtext();
            Boolean isSelected2 = variant3.isSelected();
            arrayList2.add(new AspectsV4SizeSubWidgetObject.Size(text, subtext, variant3.getRefreshDeeplink(), isSelected2 != null ? isSelected2.booleanValue() : false, variant3.isOutOfStock(), variant3.getTrackingInfo()));
        }
        return new AspectsV4SizeSubWidgetObject(arrayList2, aspectsV4DTO.getLayoutType(), aspectsV4DTO.getSelectedColor(), aspectsV4DTO.getTrackingInfo());
    }
}
