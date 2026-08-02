package ru.ozon.app.android.storefront.widgets.helpCert.data;

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
import ru.ozon.app.android.storefront.widgets.helpCert.data.HelpCertDTO;
import ru.ozon.app.android.storefront.widgets.helpCert.ui.HelpCertVO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u000e\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u000e\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/helpCert/data/HelpCertMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/helpCert/data/HelpCertDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/helpCert/ui/HelpCertVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "horizontalMargin", "map", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Lru/ozon/uni/atoms/data/text/TextDTO;", "vo", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/helpCert/data/HelpCertDTO;Ll20/d;)Ljava/util/List;", "", "stateId", "(Lru/ozon/app/android/storefront/widgets/helpCert/data/HelpCertDTO;Ljava/lang/String;)Lru/ozon/app/android/storefront/widgets/helpCert/ui/HelpCertVO;", "Landroid/content/Context;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HelpCertMapper implements Function2<HelpCertDTO, d, List<? extends HelpCertVO>> {

    @NotNull
    private final Context context;

    public HelpCertMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final HelpCertVO map(@NotNull HelpCertDTO helpCertDTO, String str) {
        CommonCellSettings.LayoutPadding layoutPadding;
        Intrinsics.checkNotNullParameter(helpCertDTO, "<this>");
        long hashCode = str != null ? str.hashCode() : 0;
        HelpCertDTO.Settings settings = helpCertDTO.getSettings();
        if (settings == null || (layoutPadding = settings.getHorizontalOffset()) == null) {
            layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        }
        CellDTO map = map(helpCertDTO.getCell(), layoutPadding);
        ButtonV3DTO button = helpCertDTO.getButton();
        TextDTO description = helpCertDTO.getDescription();
        TextDTO map2 = description != null ? map(description, layoutPadding) : null;
        int dimensionPixelSize = this.context.getResources().getDimensionPixelSize(layoutPadding.getCellLayoutPadding());
        Map<String, TokenizedTrackingInfo> trackingInfo = helpCertDTO.getTrackingInfo();
        return new HelpCertVO(hashCode, map, button, map2, dimensionPixelSize, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HelpCertVO> invoke(@NotNull HelpCertDTO vo, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(map(vo, widgetInfo.d()));
    }

    private final CellDTO map(CellDTO cellDTO, CommonCellSettings.LayoutPadding layoutPadding) {
        CellDTO.Settings settings = cellDTO.getSettings();
        if (settings == null) {
            return CellDTO.copy$default(cellDTO, null, new CellDTO.Settings(null, null, layoutPadding, layoutPadding, null, null, null, null, null, null, null, 2035, null), null, null, null, 29, null);
        }
        return (layoutPadding == settings.getLeftPadding() && layoutPadding == settings.getRightPadding()) ? cellDTO : CellDTO.copy$default(cellDTO, null, CellDTO.Settings.copy$default(settings, null, null, layoutPadding, layoutPadding, null, null, null, null, null, null, null, 2035, null), null, null, null, 29, null);
    }

    private final TextDTO map(TextDTO textDTO, CommonCellSettings.LayoutPadding layoutPadding) {
        TextDTO copy$default = (layoutPadding == textDTO.getLeftPadding() && layoutPadding == textDTO.getRightPadding()) ? textDTO : TextDTO.copy$default(textDTO, null, null, layoutPadding, layoutPadding, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524275, null);
        copy$default.setTagSupported(OzonSpannableStringKt.hasClickableSpan(copy$default.getText()));
        return copy$default;
    }
}
