package ru.ozon.app.android.storefront.widgets.navigationSlider.data;

import WZ.t;
import android.content.Context;
import android.graphics.Paint;
import androidx.core.content.res.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderVO;
import ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderWidgetViewHolder;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.html.OzonHtmlParser;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 /2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001/B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000b*\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010 \u001a\u00060\u0003j\u0002`\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010$\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,¨\u00060"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/data/NavigationSliderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/data/NavigationSliderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "columns", "rows", "maxLines", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationSliderSizeInfo;", "buildSizeInfo", "(III)Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationSliderSizeInfo;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;", "computeMinHeight", "(Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;I)I", "", "text", "", "textSize", "maxWidth", "bounds", "parts", "calculateProperTextSize", "(Ljava/lang/String;FFFLjava/util/List;)F", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/navigationSlider/data/NavigationSliderDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "defaultTextSize", "F", "stepTextSize", "minimumTextSize", "Landroid/graphics/Paint;", "textPaint", "Landroid/graphics/Paint;", "dp8", "I", "dp16", "horizontalMargin", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderMapper implements Function2<NavigationSliderDTO, d, List<? extends NavigationSliderVO>> {

    @NotNull
    private final Context context;
    private final float defaultTextSize;
    private final int dp16;
    private final int dp8;
    private final int horizontalMargin;
    private final float minimumTextSize;
    private final float stepTextSize;

    @NotNull
    private final Paint textPaint;
    public static final int $stable = 8;

    public NavigationSliderMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.defaultTextSize = context.getResources().getDimensionPixelSize(R$dimen.text_micro);
        this.stepTextSize = context.getResources().getDimensionPixelSize(R$dimen.text_step);
        this.minimumTextSize = UiExtKt.toSpF(10);
        Paint paint = new Paint();
        paint.setTypeface(g.e(R$font.onest_regular, context));
        this.textPaint = paint;
        this.dp8 = context.getResources().getDimensionPixelSize(R$dimen.margin);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.horizontalMargin = context.getResources().getDimensionPixelSize(R$dimen.default_margin) * 2;
    }

    private final NavigationSliderVO.NavigationSliderSizeInfo buildSizeInfo(int columns, int rows, int maxLines) {
        NavigationSliderWidgetViewHolder.CategoryData categoryData = new NavigationSliderWidgetViewHolder.CategoryData(columns, rows, (this.context.getResources().getDisplayMetrics().widthPixels - this.horizontalMargin) / columns);
        return new NavigationSliderVO.NavigationSliderSizeInfo(categoryData, computeMinHeight(categoryData, maxLines));
    }

    private final float calculateProperTextSize(String text, float textSize, float maxWidth, float bounds, List<String> parts) {
        this.textPaint.setTextSize(textSize);
        float f7 = this.minimumTextSize;
        if (textSize <= f7) {
            return f7;
        }
        return (parts.size() == 1 ? this.textPaint.measureText(text) : this.textPaint.measureText(parts.get(1)) + maxWidth) <= bounds ? textSize : calculateProperTextSize(text, textSize - this.stepTextSize, maxWidth, bounds, parts);
    }

    private final int computeMinHeight(NavigationSliderWidgetViewHolder.CategoryData categoryData, int i11) {
        return categoryData.getRows() * ((i11 * this.dp16) + categoryData.getBgImageSize() + this.dp8);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NavigationSliderVO> invoke(@NotNull NavigationSliderDTO state, @NotNull d widgetInfo) {
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        t tVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        int i15 = 2;
        int i16 = state.isTwoLinesTitle() ? 2 : 1;
        int i17 = (int) (r1.widthPixels / this.context.getResources().getDisplayMetrics().density);
        Iterator<Option> it = state.getOptions().iterator();
        while (true) {
            if (!it.hasNext()) {
                i11 = 4;
                i12 = 5;
                break;
            }
            Option next = it.next();
            if (i17 >= next.getMinScreenSize() && i17 <= next.getMaxScreenSize()) {
                i11 = next.getElementsNum();
                i12 = next.getRowsNum();
                break;
            }
        }
        int i18 = i11;
        int i19 = i12;
        float dimension = this.context.getResources().getDimension(R$dimen.navigation_block_padding) * 2.0f;
        ArrayList W02 = C7714v.W0(state.getItems());
        ArrayList arrayList = new ArrayList();
        float f11 = (this.context.getResources().getDisplayMetrics().widthPixels - dimension) / i18;
        float f12 = Float.MAX_VALUE;
        while (!W02.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int i21 = i19 * i18;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i21 && !W02.isEmpty()) {
                NavigationItemDTO navigationItemDTO = (NavigationItemDTO) W02.remove(i22);
                navigationItemDTO.setTitle(OzonHtmlParser.Companion.parseHtml$default(OzonHtmlParser.INSTANCE, navigationItemDTO.getTitle(), i22, i15, null).toString());
                List<String> m11 = h.m(navigationItemDTO.getTitle(), new String[]{"\n"}, i22, 6);
                int i24 = i23;
                float f13 = h.m(navigationItemDTO.getTitle(), new String[]{" ", "\n"}, i22, 6).size() == 1 ? f11 : i16 * f11;
                if (m11.size() > i16) {
                    m11 = m11.subList(i22, i16);
                    navigationItemDTO.setTitle(C7714v.V(m11, "\n", null, null, null, 62));
                }
                float calculateProperTextSize = calculateProperTextSize(navigationItemDTO.getTitle(), this.defaultTextSize, f11, f13, m11);
                f12 = Math.min(calculateProperTextSize, f12);
                int i25 = i16;
                int i26 = i18;
                String image = navigationItemDTO.getImage();
                ArrayList arrayList3 = arrayList;
                String deeplink = navigationItemDTO.getDeeplink();
                ArrayList arrayList4 = arrayList2;
                String title = navigationItemDTO.getTitle();
                int i27 = i21;
                String backgroundImage = navigationItemDTO.getBackgroundImage();
                boolean isAdult = navigationItemDTO.isAdult();
                Map<String, TokenizedTrackingInfo> trackingInfo = navigationItemDTO.getTrackingInfo();
                if (trackingInfo != null) {
                    i13 = i26;
                    f7 = f11;
                    i14 = 2;
                    tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
                } else {
                    i13 = i26;
                    f7 = f11;
                    i14 = 2;
                    tVar = null;
                }
                arrayList4.add(new NavigationSliderVO.NavigationItem(image, deeplink, title, backgroundImage, isAdult, false, i25, calculateProperTextSize, tVar, 32, null));
                i21 = i27;
                i15 = i14;
                i16 = i25;
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                i23 = i24 + 1;
                i18 = i13;
                f11 = f7;
                i22 = 0;
            }
            ArrayList arrayList5 = arrayList;
            arrayList5.add(arrayList2);
            i15 = i15;
            i16 = i16;
            arrayList = arrayList5;
            f12 = f12;
            i18 = i18;
            f11 = f11;
        }
        int i28 = i16;
        int i29 = i18;
        ArrayList arrayList6 = arrayList;
        ArrayList arrayList7 = new ArrayList(C7714v.z(arrayList6, 10));
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            List list = (List) it2.next();
            ArrayList arrayList8 = new ArrayList(C7714v.z(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList8.add(NavigationSliderVO.NavigationItem.copy$default((NavigationSliderVO.NavigationItem) it3.next(), null, null, null, null, false, false, 0, f12, null, 383, null));
            }
            arrayList7.add(arrayList8);
        }
        return C7714v.a0(new NavigationSliderVO(hashCode, arrayList7, state.getShowAsSlider(), state.getTitle(), i19, i29, 0, 0, buildSizeInfo(i29, i19, i28), 192, null));
    }
}
