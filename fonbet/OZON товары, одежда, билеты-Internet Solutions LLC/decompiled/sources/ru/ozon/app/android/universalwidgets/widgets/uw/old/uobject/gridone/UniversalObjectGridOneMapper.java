package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.core.UniversalObjectMapperKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data.UniversalWidgetDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemsVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.TextAlign;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/UniversalObjectGridOneMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalObjectGridOneMapper implements Function2<UniversalWidgetDTO, d, List<? extends ObjectItemsVO>> {

    @NotNull
    private final Context context;

    public UniversalObjectGridOneMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ObjectItemsVO> invoke(@NotNull UniversalWidgetDTO state, @NotNull d widgetInfo) {
        String token;
        CornerRadius cornerRadius;
        Boolean hidePagination;
        Integer span;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        UniversalWidgetDTO.DesignTypeDTO.OptionsDTO options = state.getDesignType().getOptions();
        String style = options != null ? options.getStyle() : null;
        List<ObjectItemVO> itemsToOIDesignTypeVo = UniversalObjectMapperKt.itemsToOIDesignTypeVo(state, UniversalObjectMapperKt.toOIDesignTypeVo(state.getDesignType()), widgetInfo.d(), Long.valueOf(hashCode), false);
        UniversalWidgetDTO.DesignTypeDTO.OptionsDTO options2 = state.getDesignType().getOptions();
        TextAlign parseTextAlign = UniversalObjectMapperKt.parseTextAlign(options2 != null ? options2.getTextAlign() : null);
        Context context = this.context;
        UniversalWidgetDTO.DesignTypeDTO.OptionsDTO options3 = state.getDesignType().getOptions();
        int parseTextColor = UniversalObjectMapperKt.parseTextColor(context, options3 != null ? options3.getTextColor() : null);
        Float calculateRatio = UniversalObjectMapperKt.calculateRatio(state.getDesignType().getOptions());
        float floatValue = calculateRatio != null ? calculateRatio.floatValue() : 1.0f;
        String d11 = widgetInfo.d();
        UniversalWidgetDTO.DesignTypeDTO.OptionsDTO options4 = state.getDesignType().getOptions();
        int intValue = (options4 == null || (span = options4.getSpan()) == null) ? 0 : span.intValue();
        ObjectItemsVO.Paddings paddings = new ObjectItemsVO.Paddings(state.fetchPadding(ObjectItemsVO.Paddings.Position.TOP), state.fetchPadding(ObjectItemsVO.Paddings.Position.BOTTOM), state.fetchPadding(ObjectItemsVO.Paddings.Position.LEFT), state.fetchPadding(ObjectItemsVO.Paddings.Position.RIGHT));
        UniversalWidgetDTO.DesignTypeDTO.OptionsDTO options5 = state.getDesignType().getOptions();
        if (options5 == null || (token = options5.getBackgroundColor()) == null) {
            token = UniColors.BG_SECONDARY.getToken();
        }
        String str = token;
        UniversalWidgetDTO.DesignTypeDTO.OptionsDTO options6 = state.getDesignType().getOptions();
        if (options6 == null || (cornerRadius = options6.getCornerRadius()) == null) {
            cornerRadius = CornerRadius.RADIUS_500;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        UniversalWidgetDTO.DesignTypeDTO.OptionsDTO options7 = state.getDesignType().getOptions();
        return C7714v.a0(new ObjectItemsVO(hashCode, style, itemsToOIDesignTypeVo, parseTextAlign, parseTextColor, floatValue, intValue, d11, null, paddings, str, cornerRadius2, (options7 == null || (hidePagination = options7.getHidePagination()) == null) ? false : hidePagination.booleanValue(), 256, null));
    }
}
