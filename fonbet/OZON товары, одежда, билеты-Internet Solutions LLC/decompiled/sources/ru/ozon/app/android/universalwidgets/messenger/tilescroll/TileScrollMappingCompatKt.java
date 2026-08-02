package ru.ozon.app.android.universalwidgets.messenger.tilescroll;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsDataModel;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.model.TileScrollBlockVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileAdultImageModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileModelImage;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\b*\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u000eH\u0000¨\u0006\u000f"}, d2 = {"toTileScrollModel", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage$Ratio;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage$Ratio;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileAdultImageModel;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel;", "toMessengerTrackingInfo", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "mapToPdpOffline", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsDataModel$Base;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollMappingCompatKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage.Ratio.values().length];
            try {
                iArr[TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage.Ratio.RATIO_1_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage.Ratio.RATIO_3_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final PdpOfflineScreenWidgetsDataModel.Base mapToPdpOffline(@NotNull TileScrollBlockVO.TileVO tileVO) {
        AtomDTO atomDTO;
        Object obj;
        Intrinsics.checkNotNullParameter(tileVO, "<this>");
        String url = tileVO.getImageComponent().getImageModel().getImage().getUrl();
        List<TileContentItem> stateInfo = tileVO.getStateInfo();
        OzonSpannableString ozonSpannableString = null;
        if (stateInfo != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : stateInfo) {
                if (obj2 instanceof TileContentItem.Atom) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TileContentItem.Atom) it.next()).getAtom());
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((AtomDTO) obj) instanceof PriceDTO) {
                    break;
                }
            }
            atomDTO = (AtomDTO) obj;
        } else {
            atomDTO = null;
        }
        PriceDTO priceDTO = atomDTO instanceof PriceDTO ? (PriceDTO) atomDTO : null;
        List<TileContentItem> stateInfo2 = tileVO.getStateInfo();
        if (stateInfo2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : stateInfo2) {
                if (obj3 instanceof TileContentItem.Atom) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                AtomDTO atom = ((TileContentItem.Atom) it3.next()).getAtom();
                TextDTO textDTO = atom instanceof TextDTO ? (TextDTO) atom : null;
                if (textDTO != null) {
                    arrayList4.add(textDTO);
                }
            }
            TextDTO textDTO2 = (TextDTO) C7714v.Z(arrayList4);
            if (textDTO2 != null) {
                ozonSpannableString = textDTO2.getText();
            }
        }
        return new PdpOfflineScreenWidgetsDataModel.Base(url, priceDTO, ozonSpannableString);
    }

    @NotNull
    public static final MessengerTrackingInfo toMessengerTrackingInfo(@NotNull TokenizedTrackingInfo tokenizedTrackingInfo, String str) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(tokenizedTrackingInfo, "<this>");
        if (str == null) {
            str = tokenizedTrackingInfo.getActionType();
        }
        String str2 = str;
        String key = tokenizedTrackingInfo.getKey();
        String sliceKey = tokenizedTrackingInfo.getSliceKey();
        List<TokenizedTrackingInfo> nested = tokenizedTrackingInfo.getNested();
        if (nested != null) {
            List<TokenizedTrackingInfo> list = nested;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(toMessengerTrackingInfo$default((TokenizedTrackingInfo) it.next(), null, 1, null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new MessengerTrackingInfo(str2, key, 0L, sliceKey, arrayList, 4, null);
    }

    public static /* synthetic */ MessengerTrackingInfo toMessengerTrackingInfo$default(TokenizedTrackingInfo tokenizedTrackingInfo, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return toMessengerTrackingInfo(tokenizedTrackingInfo, str);
    }

    @NotNull
    public static final SmallTileModelImage.Ratio toTileScrollModel(@NotNull TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage.Ratio ratio) {
        Intrinsics.checkNotNullParameter(ratio, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[ratio.ordinal()];
        if (i11 == 1) {
            return SmallTileModelImage.Ratio.RATIO_1_1;
        }
        if (i11 == 2) {
            return SmallTileModelImage.Ratio.RATIO_3_4;
        }
        throw new o();
    }

    @NotNull
    public static final SmallTileModelImage toTileScrollModel(@NotNull TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel.SmallTileModelImage smallTileModelImage) {
        Intrinsics.checkNotNullParameter(smallTileModelImage, "<this>");
        return new SmallTileModelImage(-1L, smallTileModelImage.getUrl(), toTileScrollModel(smallTileModelImage.getRatio()), smallTileModelImage.getWidthImage(), smallTileModelImage.getHeightImage(), smallTileModelImage.getEnableParanja(), smallTileModelImage.getIsCompactFavoriteIcon(), smallTileModelImage.getScaleType());
    }

    @NotNull
    public static final SmallTileAdultImageModel toTileScrollModel(@NotNull TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel smallTileAdultImageModel) {
        Intrinsics.checkNotNullParameter(smallTileAdultImageModel, "<this>");
        return new SmallTileAdultImageModel(toTileScrollModel(smallTileAdultImageModel.getImage()), smallTileAdultImageModel.getBlurMolecule());
    }
}
