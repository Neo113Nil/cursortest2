package ru.ozon.app.android.geo.addresseditformprompt.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.geo.addresseditformprompt.data.AddressEditFormPromptDTO;
import ru.ozon.app.android.geo.addresseditformprompt.presentation.AddressEditFormPromptVO;
import ru.ozon.app.android.geo.options.data.Options;
import ru.ozon.app.android.geo.options.presentation.MappersKt;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/core/AddressEditFormPromptMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/geo/addresseditformprompt/data/AddressEditFormPromptDTO;", "Ll20/d;", "", "Lru/ozon/app/android/geo/addresseditformprompt/presentation/AddressEditFormPromptVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/geo/addresseditformprompt/data/AddressEditFormPromptDTO;J)Lru/ozon/app/android/geo/addresseditformprompt/presentation/AddressEditFormPromptVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/geo/addresseditformprompt/data/AddressEditFormPromptDTO;Ll20/d;)Ljava/util/List;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditFormPromptMapper implements Function2<AddressEditFormPromptDTO, d, List<? extends AddressEditFormPromptVO>> {
    private final AddressEditFormPromptVO toVo(AddressEditFormPromptDTO addressEditFormPromptDTO, long j11) {
        List<TextAtom> elements = addressEditFormPromptDTO.getElements();
        List<ButtonV3Atom.LargeButton> buttonsApp = addressEditFormPromptDTO.getButtonsApp();
        if (buttonsApp == null) {
            buttonsApp = K.f71697a;
        }
        ArrayList p02 = C7714v.p0(buttonsApp, elements);
        int size = addressEditFormPromptDTO.getElements().size();
        Options openSearchOptions = addressEditFormPromptDTO.getOpenSearchOptions();
        YandexSearchSheetFragment.Data yandexSearchFragmentData = openSearchOptions != null ? MappersKt.toYandexSearchFragmentData(openSearchOptions) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = addressEditFormPromptDTO.getTrackingInfo();
        return new AddressEditFormPromptVO(j11, p02, size, yandexSearchFragmentData, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddressEditFormPromptVO> invoke(@NotNull AddressEditFormPromptDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
