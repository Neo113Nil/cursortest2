package ru.ozon.app.android.geo.addresseditunavailable.presentation;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.HorizontalContainer;
import ru.ozon.app.android.atoms.data.deprecated.VerticalContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.app.android.geo.addresseditunavailable.data.AddressEditUnavailableDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.deprecated.Image;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR2\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R2\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00180\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/geo/addresseditunavailable/presentation/AddressEditUnavailableViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/geo/addresseditunavailable/data/AddressEditUnavailableDTO;", "Lru/ozon/app/android/geo/addresseditunavailable/presentation/AddressEditUnavailableVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/geo/addresseditunavailable/data/AddressEditUnavailableDTO;Ljava/lang/String;)Lru/ozon/app/android/geo/addresseditunavailable/presentation/AddressEditUnavailableVO;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditUnavailableViewMapper extends WidgetViewMapper<AddressEditUnavailableDTO, AddressEditUnavailableVO> {

    @NotNull
    private final Function2<AddressEditUnavailableDTO, d, List<AddressEditUnavailableVO>> mapper = new AddressEditUnavailableViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_address_edit_unavailable_items;

    @NotNull
    private final Function2<View, ComposerReferences, k<AddressEditUnavailableVO>> holderProducer = AddressEditUnavailableViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AddressEditUnavailableVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AddressEditUnavailableDTO, d, List<AddressEditUnavailableVO>> getMapper() {
        return this.mapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final AddressEditUnavailableVO toVO(@NotNull AddressEditUnavailableDTO addressEditUnavailableDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(addressEditUnavailableDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        List<AddressEditUnavailableDTO.Split> splits = addressEditUnavailableDTO.getSplits();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = splits.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AddressEditUnavailableDTO.Split split = (AddressEditUnavailableDTO.Split) it.next();
            ArrayList arrayList2 = new ArrayList();
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(split.getTitle());
            String titleColor = split.getTitleColor();
            if (titleColor == null) {
                titleColor = UniColors.TEXT_PRIMARY.getToken();
            }
            arrayList2.add(new CommonText.TextMedium(null, null, ozonSpannableString, null, titleColor, null, null, null, null, null, 1003, null));
            for (AddressEditUnavailableDTO.Split.Product product : split.getProducts()) {
                AddressEditUnavailableDTO.Split.Product.Image image = product.getImage();
                arrayList2.add(new HorizontalContainer(C7714v.b0(new Image(image != null ? image.getImage() : null, null, null, null, null, null, 62, null), new VerticalContainer(product.getElements(), "ATOM_CONTEXT_PRODUCTS_CONTAINER", 0 == true ? 1 : 0, 0 == true ? 1 : 0, 12, null)), "ATOM_CONTEXT_PRODUCTS_CONTAINER", null, null, 12, 0 == true ? 1 : 0));
            }
            C7714v.p(arrayList2, arrayList);
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = addressEditUnavailableDTO.getTrackingInfo();
        return new AddressEditUnavailableVO(hashCode, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }
}
