package ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.data;

import WZ.t;
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
import ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.data.CellWithTimerDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.presentation.CellWithTimerWrapperVO;
import ru.ozon.app.android.travel.molecules.view.cellWithTimer.CellWithTimerVO;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerFormatter;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/presentation/CellWithTimerWrapperVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "timerFormatter", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerDTO;Ll20/d;)Ljava/util/List;", "", "seconds", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "formattedTimerText", "(J)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Landroid/content/Context;", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellWithTimerMapper implements Function2<CellWithTimerDTO, d, List<? extends CellWithTimerWrapperVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final TimerFormatter timerFormatter;

    public CellWithTimerMapper(@NotNull Context context, @NotNull TimerFormatter timerFormatter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timerFormatter, "timerFormatter");
        this.context = context;
        this.timerFormatter = timerFormatter;
    }

    @NotNull
    public final OzonSpannableString formattedTimerText(long seconds) {
        return OzonSpannableStringKt.toOzonSpannableString(this.timerFormatter.format(seconds));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CellWithTimerWrapperVO> invoke(@NotNull CellWithTimerDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        CellWithTimerDTO.Cell cell = state.getCell();
        TextAtom title = cell.getTitle();
        OzonSpannableString formattedTimerText = formattedTimerText(cell.getSeconds());
        String timerColor = cell.getTimerColor();
        if (timerColor == null) {
            timerColor = UniColors.TEXT_EXPRESS.getToken();
        }
        TextAtom copy$default = TextAtom.copy$default(title, formattedTimerText, null, timerColor, null, null, null, null, 122, null);
        long seconds = cell.getSeconds();
        Map<String, TokenizedTrackingInfo> trackingInfo = cell.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        TextAtom title2 = cell.getTitle();
        TextAtom title3 = cell.getTitle();
        TextAtom subtitle = cell.getSubtitle();
        ImageDTO appImage = cell.getAppImage();
        boolean z11 = cell.getRightIcon() != null;
        Icon rightIcon = cell.getRightIcon();
        String image = rightIcon != null ? rightIcon.getImage() : null;
        Icon rightIcon2 = cell.getRightIcon();
        String tintColor = rightIcon2 != null ? rightIcon2.getTintColor() : null;
        float pxF = ResourceExtKt.toPxF(cell.getBorderRadius(), this.context);
        AtomActionDTO clickAction = cell.getClickAction();
        return C7714v.a0(new CellWithTimerWrapperVO(hashCode, new CellWithTimerVO(title3, copy$default, subtitle, appImage, z11, image, tintColor, pxF, clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, cell.getTrackingInfo()) : null, cell.getBackgroundColor()), title2, seconds, tokenizedEvent$default, false, 32, null));
    }
}
