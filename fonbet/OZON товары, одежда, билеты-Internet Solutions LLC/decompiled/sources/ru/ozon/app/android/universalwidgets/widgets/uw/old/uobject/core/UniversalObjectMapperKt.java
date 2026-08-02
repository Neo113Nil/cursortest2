package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.core;

import WZ.t;
import android.content.Context;
import androidx.core.content.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ads.common.pixel.data.PixelDTO;
import ru.ozon.app.android.ads.data.pixel.presentation.PixelKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.OpenNestedPageExtKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data.UniversalWidgetDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.TextAlign;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.UWDeeplink;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a=\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"\u001a'\u0010$\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010%\u001a?\u0010,\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO;", "toOIDesignTypeVo", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "designType", "", "stateId", "", "parentVoId", "", "needMargins", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "itemsToOIDesignTypeVo", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO;Ljava/lang/String;Ljava/lang/Long;Z)Ljava/util/List;", "align", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/TextAlign;", "parseTextAlign", "(Ljava/lang/String;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/TextAlign;", "Landroid/content/Context;", "context", "textColor", "", "parseTextColor", "(Landroid/content/Context;Ljava/lang/String;)I", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO$OptionsDTO;", "options", "", "calculateRatio", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO$OptionsDTO;)Ljava/lang/Float;", "itemIndex", "columnCount", "isItemAtTopRow", "(II)Z", "itemsCount", "isItemAtBottomRow", "(III)Z", "index", "id", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type;", "type", "needTopMargin", "needBottomMargin", "createEmptyObject", "(IJLru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type;Ljava/lang/String;ZZ)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectMapperKt {
    public static final Float calculateRatio(UniversalWidgetDTO.DesignTypeDTO.OptionsDTO optionsDTO) {
        if (optionsDTO == null || optionsDTO.getHeight() == null || optionsDTO.getWidth() == null) {
            return null;
        }
        return Float.valueOf(optionsDTO.getHeight().intValue() / optionsDTO.getWidth().intValue());
    }

    private static final ObjectItemVO createEmptyObject(int i11, long j11, ObjectItemVO.DesignTypeVO.Type type, String str, boolean z11, boolean z12) {
        return new ObjectItemVO(i11, null, type, j11, null, "", null, null, null, null, null, null, str, 0, null, null, null, null, z11, z12);
    }

    private static final boolean isItemAtBottomRow(int i11, int i12, int i13) {
        if (i12 == 0) {
            return true;
        }
        int i14 = i13 % i12;
        if (i14 != 0) {
            i12 = i14;
        }
        return i11 >= i13 - i12;
    }

    private static final boolean isItemAtTopRow(int i11, int i12) {
        return i11 < i12 || i12 == 0;
    }

    @NotNull
    public static final List<ObjectItemVO> itemsToOIDesignTypeVo(@NotNull UniversalWidgetDTO universalWidgetDTO, @NotNull ObjectItemVO.DesignTypeVO designType, @NotNull String stateId, Long l11, boolean z11) {
        Iterator it;
        t tVar;
        long j11;
        boolean z12;
        UniversalWidgetDTO universalWidgetDTO2 = universalWidgetDTO;
        Intrinsics.checkNotNullParameter(universalWidgetDTO2, "<this>");
        Intrinsics.checkNotNullParameter(designType, "designType");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        if (universalWidgetDTO2.getItems() == null) {
            return K.f71697a;
        }
        List<UniversalWidgetDTO.ItemDTO> items = universalWidgetDTO2.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = items.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i12 = i11 + 1;
            ArrayList arrayList2 = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            UniversalWidgetDTO.ItemDTO itemDTO = (UniversalWidgetDTO.ItemDTO) next;
            Long id2 = itemDTO.getId();
            long longValue = id2 != null ? id2.longValue() : itemDTO.hashCode();
            boolean z13 = isItemAtTopRow(i11, designType.getType().getColumnCount()) && universalWidgetDTO2.getIsStubHeader();
            boolean z14 = isItemAtBottomRow(i11, designType.getType().getColumnCount(), universalWidgetDTO2.getItems().size()) && universalWidgetDTO2.getIsStubFooter();
            String type = itemDTO.getType();
            ObjectItemVO.DesignTypeVO.Type type2 = designType.getType();
            long j12 = longValue;
            Long id3 = itemDTO.getId();
            String image = itemDTO.getImage();
            boolean z15 = z13;
            String link = itemDTO.getLink();
            UWDeeplink uWDeeplink = OpenNestedPageExtKt.toUWDeeplink(itemDTO.getDeeplink());
            String title = itemDTO.getTitle();
            String subtitle = itemDTO.getSubtitle();
            String algorithm = itemDTO.getAlgorithm();
            String advId = itemDTO.getAdvId();
            if (advId == null) {
                advId = itemDTO.getAdvert();
            }
            BadgeDTO adBadge = itemDTO.getAdBadge();
            Boolean isImageBackgroundHidden = itemDTO.isImageBackgroundHidden();
            Map<String, TokenizedTrackingInfo> trackingInfo = itemDTO.getTrackingInfo();
            if (trackingInfo != null) {
                it = it2;
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(l11 != null ? l11.longValue() : j12), null, 2, null);
            } else {
                it = it2;
                tVar = null;
            }
            List<PixelDTO> pixel = itemDTO.getPixel();
            if (pixel != null) {
                List<PixelDTO> list = pixel;
                arrayList2 = new ArrayList(C7714v.z(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(PixelKt.toVO((PixelDTO) it3.next()));
                }
            }
            if (z15 && z11) {
                j11 = j12;
                z12 = true;
            } else {
                j11 = j12;
                z12 = false;
            }
            ArrayList arrayList3 = arrayList;
            arrayList3.add(new ObjectItemVO(i11, type, type2, j11, id3, image, link, uWDeeplink, title, subtitle, algorithm, advId, stateId, i11, adBadge, isImageBackgroundHidden, tVar, arrayList2, z12, z14 && z11));
            universalWidgetDTO2 = universalWidgetDTO;
            arrayList = arrayList3;
            i11 = i12;
            it2 = it;
        }
        ArrayList arrayList4 = arrayList;
        if (designType.getType() == ObjectItemVO.DesignTypeVO.Type.NAVI_2_G && arrayList4.size() % designType.getType().getColumnCount() != 0) {
            if (z11) {
                int size = arrayList4.size();
                arrayList4.add(createEmptyObject(universalWidgetDTO.getItems().size(), -((ObjectItemVO) C7714v.X(arrayList4)).getId(), designType.getType(), stateId, isItemAtTopRow(size, designType.getType().getColumnCount()) && universalWidgetDTO.getIsStubHeader(), isItemAtBottomRow(size, designType.getType().getColumnCount(), universalWidgetDTO.getItems().size() + 1) && universalWidgetDTO.getIsStubFooter()));
                return arrayList4;
            }
            arrayList4.add(createEmptyObject(universalWidgetDTO.getItems().size(), -((ObjectItemVO) C7714v.X(arrayList4)).getId(), designType.getType(), stateId, false, false));
        }
        return arrayList4;
    }

    @NotNull
    public static final TextAlign parseTextAlign(String str) {
        if (!Intrinsics.d(str, "left") && Intrinsics.d(str, RichContentDTO.ALIGN_CENTER)) {
            return TextAlign.CENTER;
        }
        return TextAlign.LEFT;
    }

    public static final int parseTextColor(@NotNull Context context, String str) {
        Integer parseColor;
        Intrinsics.checkNotNullParameter(context, "context");
        return (str == null || (parseColor = StyleParser.INSTANCE.parseColor(context, str)) == null) ? a.getColor(context, R$color.graphic_primary_on_light) : parseColor.intValue();
    }

    @NotNull
    public static final ObjectItemVO.DesignTypeVO toOIDesignTypeVo(@NotNull UniversalWidgetDTO.DesignTypeDTO designTypeDTO) {
        Boolean itemsAreFaded;
        Intrinsics.checkNotNullParameter(designTypeDTO, "<this>");
        ObjectItemVO.DesignTypeVO.Type fromString = ObjectItemVO.DesignTypeVO.Type.INSTANCE.fromString(designTypeDTO.getType());
        UniversalWidgetDTO.DesignTypeDTO.OptionsDTO options = designTypeDTO.getOptions();
        return new ObjectItemVO.DesignTypeVO(fromString, (options == null || (itemsAreFaded = options.getItemsAreFaded()) == null) ? false : itemsAreFaded.booleanValue());
    }
}
