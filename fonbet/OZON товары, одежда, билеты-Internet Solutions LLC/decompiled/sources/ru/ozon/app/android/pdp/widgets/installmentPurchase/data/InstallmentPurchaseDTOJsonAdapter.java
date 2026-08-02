package ru.ozon.app.android.pdp.widgets.installmentPurchase.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.price.PriceWithTitle;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.data.InstallmentPurchaseDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentPurchaseDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentPurchaseDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentPurchaseDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentPurchaseDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "priceWithTitleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "nullableIntAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "nullableOnBoardingDTOAdapter", "", "nullableBooleanAdapter", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableListOfBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentPurchaseDTO$TitleBlockDTO;", "nullableTitleBlockDTOAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "nullableCommonAtomIconDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentPurchaseDTOJsonAdapter extends JsonAdapter<InstallmentPurchaseDTO> {
    public static final int $stable = 8;
    private volatile Constructor<InstallmentPurchaseDTO> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomIconDTO> nullableCommonAtomIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> nullableListOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OnBoardingDTO> nullableOnBoardingDTOAdapter;

    @NotNull
    private final JsonAdapter<InstallmentPurchaseDTO.TitleBlockDTO> nullableTitleBlockDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceWithTitle> priceWithTitleAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public InstallmentPurchaseDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("price", "action", "animationTimer", "animationTrackingInfo", "trackingInfo", "onboarding", "showTopRounding", "badges", "priceIcon", "titleBlock", "innerBackground", "chevronIcon");
        M m11 = M.f71699a;
        this.priceWithTitleAdapter = moshi.f(PriceWithTitle.class, m11, "price");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "animationTimer");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "animationTrackingInfo");
        this.nullableOnBoardingDTOAdapter = moshi.f(OnBoardingDTO.class, m11, "onboarding");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "showTopRounding");
        this.nullableListOfBadgeDTOAdapter = moshi.f(D.e(List.class, BadgeDTO.class), m11, "badges");
        this.nullableIconAdapter = moshi.f(Icon.class, m11, "priceIcon");
        this.nullableTitleBlockDTOAdapter = moshi.f(InstallmentPurchaseDTO.TitleBlockDTO.class, m11, "titleBlock");
        this.stringAdapter = moshi.f(String.class, m11, "innerBackground");
        this.nullableCommonAtomIconDTOAdapter = moshi.f(CommonAtomIconDTO.class, m11, "chevronIcon");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(InstallmentPurchaseDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public InstallmentPurchaseDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        PriceWithTitle priceWithTitle = null;
        AtomActionDTO atomActionDTO = null;
        Integer num = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        OnBoardingDTO onBoardingDTO = null;
        Boolean bool = null;
        List<BadgeDTO> list = null;
        Icon icon = null;
        InstallmentPurchaseDTO.TitleBlockDTO titleBlockDTO = null;
        String str = null;
        CommonAtomIconDTO commonAtomIconDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    priceWithTitle = this.priceWithTitleAdapter.fromJson(reader);
                    if (priceWithTitle == null) {
                        throw c.q("price", "price", reader);
                    }
                    break;
                case 1:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 3:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 5:
                    onBoardingDTO = this.nullableOnBoardingDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 7:
                    list = this.nullableListOfBadgeDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    break;
                case 9:
                    titleBlockDTO = this.nullableTitleBlockDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("innerBackground", "innerBackground", reader);
                    }
                    i12 = -1025;
                    break;
                case 11:
                    commonAtomIconDTO = this.nullableCommonAtomIconDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i12 == -1025) {
            Icon icon2 = icon;
            List<BadgeDTO> list2 = list;
            Boolean bool2 = bool;
            OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
            Map<String, TokenizedTrackingInfo> map3 = map2;
            Map<String, TokenizedTrackingInfo> map4 = map;
            Integer num2 = num;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            PriceWithTitle priceWithTitle2 = priceWithTitle;
            if (priceWithTitle2 == null) {
                throw c.j("price", "price", reader);
            }
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            return new InstallmentPurchaseDTO(priceWithTitle2, atomActionDTO2, num2, map4, map3, onBoardingDTO2, bool2, list2, icon2, titleBlockDTO, str, commonAtomIconDTO);
        }
        Icon icon3 = icon;
        List<BadgeDTO> list3 = list;
        Boolean bool3 = bool;
        OnBoardingDTO onBoardingDTO3 = onBoardingDTO;
        Map<String, TokenizedTrackingInfo> map5 = map2;
        Map<String, TokenizedTrackingInfo> map6 = map;
        Integer num3 = num;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        PriceWithTitle priceWithTitle3 = priceWithTitle;
        Constructor<InstallmentPurchaseDTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = InstallmentPurchaseDTO.class.getDeclaredConstructor(PriceWithTitle.class, AtomActionDTO.class, Integer.class, Map.class, Map.class, OnBoardingDTO.class, Boolean.class, List.class, Icon.class, InstallmentPurchaseDTO.TitleBlockDTO.class, String.class, CommonAtomIconDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<InstallmentPurchaseDTO> constructor2 = constructor;
        if (priceWithTitle3 == null) {
            throw c.j("price", "price", reader);
        }
        InstallmentPurchaseDTO newInstance = constructor2.newInstance(priceWithTitle3, atomActionDTO3, num3, map6, map5, onBoardingDTO3, bool3, list3, icon3, titleBlockDTO, str, commonAtomIconDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, InstallmentPurchaseDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("price");
        this.priceWithTitleAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("animationTimer");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getAnimationTimer());
        writer.w("animationTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getAnimationTrackingInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("onboarding");
        this.nullableOnBoardingDTOAdapter.mo44toJson(writer, (x) value.getOnboarding());
        writer.w("showTopRounding");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getShowTopRounding());
        writer.w("badges");
        this.nullableListOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w("priceIcon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value.getPriceIcon());
        writer.w("titleBlock");
        this.nullableTitleBlockDTOAdapter.mo44toJson(writer, (x) value.getTitleBlock());
        writer.w("innerBackground");
        this.stringAdapter.mo44toJson(writer, (x) value.getInnerBackground());
        writer.w("chevronIcon");
        this.nullableCommonAtomIconDTOAdapter.mo44toJson(writer, (x) value.getChevronIcon());
        writer.p();
    }
}
