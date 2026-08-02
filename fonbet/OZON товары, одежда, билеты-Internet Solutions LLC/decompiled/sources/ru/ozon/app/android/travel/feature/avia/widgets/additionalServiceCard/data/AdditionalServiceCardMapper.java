package ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.data.AdditionalServiceCardDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.presentation.AdditionalServiceCardVO;
import ru.ozon.app.android.travel.molecules.extensions.TextAtomExtensionsKt;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTOWrapper;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "toVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/presentation/AdditionalServiceCardVO$State;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTOWrapper;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Landroid/content/Context;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalServiceCardMapper implements Function2<AdditionalServiceCardDTOWrapper, d, List<? extends AdditionalServiceCardVO>>, AsyncWidgetStateMapper<AdditionalServiceCardDTO, AdditionalServiceCardVO.State> {

    @NotNull
    private final Context context;

    public AdditionalServiceCardMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final AdditionalServiceCardVO.State toVO(AdditionalServiceCardDTO additionalServiceCardDTO) {
        if (additionalServiceCardDTO.getEmptyState() != null) {
            return new AdditionalServiceCardVO.State.EmptyState(MapperExtKt.toVO(additionalServiceCardDTO.getEmptyState()));
        }
        TextAtom title = additionalServiceCardDTO.getTitle();
        TextAtom subtitle = additionalServiceCardDTO.getSubtitle();
        boolean z11 = !additionalServiceCardDTO.getDetails().isEmpty();
        List<AdditionalServiceCardDTO.DetailDTO> details = additionalServiceCardDTO.getDetails();
        ArrayList arrayList = new ArrayList(C7714v.z(details, 10));
        for (AdditionalServiceCardDTO.DetailDTO detailDTO : details) {
            arrayList.add(TextAtomExtensionsKt.compound(detailDTO.getTitle(), detailDTO.getContent(), " ", new E() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.data.AdditionalServiceCardMapper$toVO$2$1
                @Override // kotlin.jvm.internal.E, kotlin.reflect.o
                public Object get(Object obj) {
                    return ((TextAtom) obj).getText();
                }
            }));
        }
        Price price = additionalServiceCardDTO.getPrice();
        TextAtom priceSubtitle = additionalServiceCardDTO.getPriceSubtitle();
        String imageURL = additionalServiceCardDTO.getImageURL();
        StyleParser styleParser = StyleParser.INSTANCE;
        return new AdditionalServiceCardVO.State.AdditionalServiceCardState(title, subtitle, z11, arrayList, price, priceSubtitle, imageURL, styleParser.parseColor(this.context, additionalServiceCardDTO.getBackgroundImageColor(), UniColors.BG_SECONDARY.getResId()), AtomActionMapperKt.toAtomAction(additionalServiceCardDTO.getServiceAction(), additionalServiceCardDTO.getTrackingInfo()), additionalServiceCardDTO.getDisclosureIcon().getImage(), styleParser.parseColor(this.context, additionalServiceCardDTO.getDisclosureIcon().getTintColor()), additionalServiceCardDTO.getTrackingInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AdditionalServiceCardVO> invoke(@NotNull AdditionalServiceCardDTOWrapper state, @NotNull d widgetInfo) {
        List<AdditionalServiceCardVO> a02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        if (state.getDto() != null) {
            return C7714v.a0(new AdditionalServiceCardVO(hashCode, toVO(state.getDto())));
        }
        String a11 = widgetInfo.c().a();
        return (a11 == null || (a02 = C7714v.a0(new AdditionalServiceCardVO(hashCode, new AdditionalServiceCardVO.State.PlaceholderState(a11)))) == null) ? K.f71697a : a02;
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public AdditionalServiceCardVO.State mapAsyncState(@NotNull AdditionalServiceCardDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return toVO(state);
    }
}
