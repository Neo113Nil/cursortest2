package ru.ozon.app.android.travel.feature.hotels.shared.shelfCard;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModelKt;
import ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardDTO;
import ru.ozon.app.android.travel.feature.hotels.shared.data.ShelfCardOptions;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aY\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\u0010\r\u001a\u0014\u0010\u0000\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0000\u001a\"\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0011*\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0014*\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0016"}, d2 = {"toVO", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO;", "context", "Landroid/content/Context;", "index", "", "span", "cardsOnScreen", "", "outerMargins", "galleryAspectRatio", "bottomMargin", "(Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO;Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;FLjava/lang/Integer;)Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$Gallery;", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$Gallery;", "cornerRadius", "Lkotlin/Pair;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardDTO$ContentItem;", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardOptionsVO;", "Lru/ozon/app/android/travel/feature/hotels/shared/data/ShelfCardOptions;", "hotels_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShelfCardMapperExtKt {
    @NotNull
    public static final ShelfCardVO toVO(@NotNull ShelfCardDTO shelfCardDTO, @NotNull Context context, int i11, Integer num, Float f7, Integer num2, float f11, Integer num3) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(shelfCardDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(16, context);
        float pxF2 = ResourceExtKt.toPxF(18, context);
        float pxF3 = ResourceExtKt.toPxF(20, context);
        int px = UiExtKt.toPx(10, context);
        int px2 = UiExtKt.toPx(2, context);
        boolean z11 = shelfCardDTO.getTheme() == ShelfCardDTO.Theme.THEME_BORDER;
        int i12 = z11 ? px : 0;
        int i13 = z11 ? px : 0;
        int i14 = z11 ? px2 : 0;
        int i15 = z11 ? px2 : 0;
        int px3 = num2 != null ? UiExtKt.toPx(num2.intValue(), context) : 0;
        int intValue = num != null ? num.intValue() : 1;
        int i16 = intValue == 1 ? 0 : px3 / 2;
        if (!z11) {
            pxF2 = pxF;
        }
        List<ShelfCardDTO.ContentItem> contentList = shelfCardDTO.getContentList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = contentList.iterator();
        while (it.hasNext()) {
            Pair<AtomDTO, Integer> vo = toVO((ShelfCardDTO.ContentItem) it.next(), context);
            if (vo != null) {
                arrayList.add(vo);
            }
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int z12 = C7714v.z(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(z12);
        ArrayList arrayList3 = new ArrayList(z12);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            arrayList2.add(pair.e());
            arrayList3.add(pair.f());
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.a();
        List list2 = (List) pair2.b();
        long hashCode = (C7714v.M(shelfCardDTO.getGallery().getImages()) + "_" + i11).hashCode();
        ShelfCardVO.Gallery vo2 = toVO(shelfCardDTO.getGallery(), pxF2);
        FavoriteProductMoleculeV4 favoriteButton = shelfCardDTO.getFavoriteButton();
        FavoriteProductModel model = favoriteButton != null ? FavoriteProductModelKt.toModel(favoriteButton) : null;
        CommonControlSettings common = shelfCardDTO.getCommon();
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, shelfCardDTO.getCommon().getTrackingInfo());
        CommonControlSettings common2 = shelfCardDTO.getCommon();
        Map<String, TokenizedTrackingInfo> trackingInfo = common2 != null ? common2.getTrackingInfo() : null;
        if (z11) {
            pxF = pxF3;
        }
        return new ShelfCardVO(hashCode, vo2, model, list, list2, atomAction, trackingInfo, new ShelfCardVO.CardSettings(pxF, i16, intValue, Float.valueOf(f11), f7 != null ? Integer.valueOf((int) (((context.getResources().getDisplayMetrics().widthPixels - px3) / f7.floatValue()) - i14)) : null, i15, i14, i13, i12, num3 != null ? UiExtKt.toPx(num3.intValue(), context) : 0));
    }

    public static /* synthetic */ ShelfCardVO toVO$default(ShelfCardDTO shelfCardDTO, Context context, int i11, Integer num, Float f7, Integer num2, float f11, Integer num3, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            f7 = null;
        }
        if ((i12 & 16) != 0) {
            num2 = null;
        }
        if ((i12 & 64) != 0) {
            num3 = null;
        }
        return toVO(shelfCardDTO, context, i11, num, f7, num2, f11, num3);
    }

    @NotNull
    public static final ShelfCardVO.Gallery toVO(@NotNull ShelfCardDTO.Gallery gallery, float f7) {
        Intrinsics.checkNotNullParameter(gallery, "<this>");
        List<String> images = gallery.getImages();
        ArrayList arrayList = new ArrayList(C7714v.z(images, 10));
        Iterator<T> it = images.iterator();
        while (it.hasNext()) {
            arrayList.add(new ShelfCardVO.Image(r2.hashCode(), (String) it.next(), f7));
        }
        return new ShelfCardVO.Gallery(arrayList, gallery.getTopBadges(), gallery.getBottomBadges());
    }

    public static final Pair<AtomDTO, Integer> toVO(@NotNull ShelfCardDTO.ContentItem contentItem, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(contentItem, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Object price = contentItem.getPrice();
        if (price == null && (price = contentItem.getText()) == null) {
            return null;
        }
        Integer gapBefore = contentItem.getGapBefore();
        return new Pair<>(price, Integer.valueOf(gapBefore != null ? UiExtKt.toPx(gapBefore.intValue(), context) : 0));
    }

    @NotNull
    public static final ShelfCardOptionsVO toVO(ShelfCardOptions shelfCardOptions, @NotNull Context context) {
        Integer outerCardsMargins;
        Integer gap;
        Intrinsics.checkNotNullParameter(context, "context");
        Integer num = null;
        Integer valueOf = (shelfCardOptions == null || (gap = shelfCardOptions.getGap()) == null) ? null : Integer.valueOf(UiExtKt.toPx(gap.intValue(), context));
        if (shelfCardOptions != null && (outerCardsMargins = shelfCardOptions.getOuterCardsMargins()) != null) {
            num = Integer.valueOf(UiExtKt.toPx(outerCardsMargins.intValue(), context));
        }
        return new ShelfCardOptionsVO(valueOf, num);
    }
}
