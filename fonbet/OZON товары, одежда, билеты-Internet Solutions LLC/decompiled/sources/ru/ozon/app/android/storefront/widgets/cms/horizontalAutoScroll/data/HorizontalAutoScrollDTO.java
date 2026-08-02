package ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.data;

import Nh.a;
import T7.P;
import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.Dp;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.HorizontalAutoScrollVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003*\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020\u0004H\u0002J\u0012\u0010!\u001a\u00020\"*\b\u0012\u0004\u0012\u00020\u001e0\u0003H\u0002J\f\u0010#\u001a\u00020\"*\u00020$H\u0002J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JU\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\"HÖ\u0001J\t\u0010/\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u00060"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/data/HorizontalAutoScrollDTO;", "", "imageLinks", "", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "imageColor", "widgetBackgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getImageLinks", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getImageColor", "()Ljava/lang/String;", "getWidgetBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "map", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO;", "widgetId", "", "context", "Landroid/content/Context;", "createListForInfiniteScroll", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO$ImageItem;", "list", "tintColorToken", "calculateWidth", "", "bitmapWidth", "Landroid/graphics/Bitmap;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HorizontalAutoScrollDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final String imageColor;

    @NotNull
    private final List<String> imageLinks;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final String widgetBackgroundColor;

    public HorizontalAutoScrollDTO(@NotNull List<String> imageLinks, AtomActionDTO atomActionDTO, String str, String str2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(imageLinks, "imageLinks");
        this.imageLinks = imageLinks;
        this.action = atomActionDTO;
        this.imageColor = str;
        this.widgetBackgroundColor = str2;
        this.trackingInfo = map;
    }

    private final int bitmapWidth(Bitmap bitmap) {
        return (int) (UiExtKt.toPx(bitmap.getWidth()) * (Dp.INSTANCE.getDp14() / UiExtKt.toPxF(bitmap.getHeight())));
    }

    private final int calculateWidth(List<HorizontalAutoScrollVO.ImageItem> list) {
        float f7 = 0.0f;
        while (list.iterator().hasNext()) {
            f7 += ((HorizontalAutoScrollVO.ImageItem) r0.next()).getWidth();
        }
        return (Dp.INSTANCE.getDp12() * (list.size() + 1)) + ((int) f7);
    }

    public static /* synthetic */ HorizontalAutoScrollDTO copy$default(HorizontalAutoScrollDTO horizontalAutoScrollDTO, List list, AtomActionDTO atomActionDTO, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = horizontalAutoScrollDTO.imageLinks;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = horizontalAutoScrollDTO.action;
        }
        if ((i11 & 4) != 0) {
            str = horizontalAutoScrollDTO.imageColor;
        }
        if ((i11 & 8) != 0) {
            str2 = horizontalAutoScrollDTO.widgetBackgroundColor;
        }
        if ((i11 & 16) != 0) {
            map = horizontalAutoScrollDTO.trackingInfo;
        }
        Map map2 = map;
        String str3 = str;
        return horizontalAutoScrollDTO.copy(list, atomActionDTO, str3, str2, map2);
    }

    private final List<HorizontalAutoScrollVO.ImageItem> createListForInfiniteScroll(Context context, List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            Bitmap bitmap = (Bitmap) ContextExtKt.loadAsBitmap$default(context, str2, null, 2, null).get();
            Intrinsics.f(bitmap);
            arrayList.add(new HorizontalAutoScrollVO.ImageItem(str2, bitmap, bitmapWidth(bitmap), str));
        }
        do {
            C7714v.p(arrayList, arrayList);
        } while (calculateWidth(arrayList) < context.getResources().getDisplayMetrics().widthPixels);
        do {
            C7714v.p(arrayList, arrayList);
        } while (arrayList.size() < 100);
        return arrayList;
    }

    @NotNull
    public final List<String> component1() {
        return this.imageLinks;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageColor() {
        return this.imageColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final HorizontalAutoScrollDTO copy(@NotNull List<String> imageLinks, AtomActionDTO action, String imageColor, String widgetBackgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(imageLinks, "imageLinks");
        return new HorizontalAutoScrollDTO(imageLinks, action, imageColor, widgetBackgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalAutoScrollDTO)) {
            return false;
        }
        HorizontalAutoScrollDTO horizontalAutoScrollDTO = (HorizontalAutoScrollDTO) other;
        return Intrinsics.d(this.imageLinks, horizontalAutoScrollDTO.imageLinks) && Intrinsics.d(this.action, horizontalAutoScrollDTO.action) && Intrinsics.d(this.imageColor, horizontalAutoScrollDTO.imageColor) && Intrinsics.d(this.widgetBackgroundColor, horizontalAutoScrollDTO.widgetBackgroundColor) && Intrinsics.d(this.trackingInfo, horizontalAutoScrollDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getImageColor() {
        return this.imageColor;
    }

    @NotNull
    public final List<String> getImageLinks() {
        return this.imageLinks;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    public int hashCode() {
        int hashCode = this.imageLinks.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.imageColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.widgetBackgroundColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final HorizontalAutoScrollVO map(long widgetId, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<String> list = this.imageLinks;
        String str = this.imageColor;
        if (str == null) {
            str = UniColors.GRAPHIC_KEY.getToken();
        }
        List<HorizontalAutoScrollVO.ImageItem> createListForInfiniteScroll = createListForInfiniteScroll(context, list, str);
        String str2 = this.widgetBackgroundColor;
        if (str2 == null) {
            str2 = UniColors.LAYER_FLOOR_1.getToken();
        }
        String str3 = str2;
        AtomActionDTO atomActionDTO = this.action;
        AtomAction atomAction = atomActionDTO != null ? AtomActionMapperKt.toAtomAction(atomActionDTO, this.trackingInfo) : null;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return new HorizontalAutoScrollVO(widgetId, createListForInfiniteScroll, str3, atomAction, map != null ? TrackingInfoMapperKt.toTokenizedEvent$default(map, Long.valueOf(widgetId), null, 2, null) : null, null, 32, null);
    }

    @NotNull
    public String toString() {
        List<String> list = this.imageLinks;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.imageColor;
        String str2 = this.widgetBackgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("HorizontalAutoScrollDTO(imageLinks=");
        sb2.append(list);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", imageColor=");
        a.h(sb2, str, ", widgetBackgroundColor=", str2, ", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
