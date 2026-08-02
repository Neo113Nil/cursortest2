package ru.ozon.app.android.pdp.widgets.textDescription.core;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.utils.AtomExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.view.shared.ExpandableWidget$ExpandButton;
import ru.ozon.app.android.pdp.widgets.textDescription.data.ShortHeightButton;
import ru.ozon.app.android.pdp.widgets.textDescription.data.TextDescriptionDTO;
import ru.ozon.app.android.pdp.widgets.textDescription.presentation.TextDescriptionVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/textDescription/data/TextDescriptionDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;", "", "widgetId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "widgetContent", "Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;", "toVoButton", "(Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;JLru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;", "", "horizontalPadding", "getMeasuredHeight", "(Lru/ozon/uni/atoms/data/text/TextDTO;Landroid/content/Context;I)I", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/textDescription/data/TextDescriptionDTO;Ll20/d;)Ljava/util/List;", "extractVo$pdp_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/pdp/widgets/textDescription/data/TextDescriptionDTO;Ll20/d;)Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;", "extractVo", "Landroid/content/Context;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextDescriptionMapper implements Function2<TextDescriptionDTO, d, List<? extends TextDescriptionVO>> {

    @NotNull
    private final Context context;

    public TextDescriptionMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final int getMeasuredHeight(TextDTO textDTO, Context context, int i11) {
        return AtomExtKt.getMeasuredHeightWithCustomWidth(textDTO, context, C7714v.b0(Integer.valueOf(i11), Integer.valueOf(i11)));
    }

    private final ExpandableWidget$ExpandButton toVoButton(ShortHeightButton shortHeightButton, long j11, TextDTO textDTO) {
        int px = ResourceExtKt.toPx(shortHeightButton.getShortHeightLimit());
        int measuredHeight = getMeasuredHeight(textDTO, this.context, Dimens.INSTANCE.getDP_16());
        if (measuredHeight <= px) {
            return null;
        }
        Integer valueOf = Integer.valueOf(measuredHeight);
        TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(shortHeightButton.getText(), null, null, null, null, null, null, null, null, null, 1, null, true, 1535, null);
        Icon icon = shortHeightButton.getIcon();
        Map<String, TokenizedTrackingInfo> trackingInfo = shortHeightButton.getTrackingInfo();
        return new ExpandableWidget$ExpandButton(px, valueOf, dsTextAtom$default, icon, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @NotNull
    public final TextDescriptionVO extractVo$pdp_prodGoogleAllVendorsRelease(@NotNull TextDescriptionDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String tabGroupId = state.getTabGroupId();
        TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(state.getText(), null, null, null, null, null, null, null, null, null, null, null, true, 2047, null);
        String backgroundColor = state.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        String str = backgroundColor;
        ShortHeightButton shortHeightButton = state.getShortHeightButton();
        ExpandableWidget$ExpandButton voButton = shortHeightButton != null ? toVoButton(shortHeightButton, hashCode, TextMapperKt.getDsTextAtom(state.getText())) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return new TextDescriptionVO(hashCode, tabGroupId, voButton, false, dsTextAtom$default, str, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, false, 0, 384, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TextDescriptionVO> invoke(@NotNull TextDescriptionDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(extractVo$pdp_prodGoogleAllVendorsRelease(state, widgetInfo));
    }
}
