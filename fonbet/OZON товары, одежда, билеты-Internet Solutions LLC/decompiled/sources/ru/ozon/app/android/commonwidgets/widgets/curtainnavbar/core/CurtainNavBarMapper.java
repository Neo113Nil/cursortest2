package ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.core;

import androidx.recyclerview.widget.m;
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
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.data.CurtainNavBarDTO;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/core/CurtainNavBarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO;Ll20/d;)Ljava/util/List;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurtainNavBarMapper implements Function2<CurtainNavBarDTO, d, List<? extends CurtainNavBarVO>> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO$ActionLeft$TextAction] */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CurtainNavBarVO> invoke(@NotNull CurtainNavBarDTO dto, @NotNull d widgetInfo) {
        CurtainNavBarVO.ActionLeft.IconAction iconAction;
        CurtainNavBarVO.CurtainBar small;
        String subtext;
        String subtext2;
        String text;
        String str;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        String text2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String style = dto.getStyle();
        CurtainNavBarVO.ActionRight actionRight = null;
        if (Intrinsics.d(style, "small") || Intrinsics.d(style, "STYLE_TYPE_SMALL")) {
            CurtainNavBarDTO.Title title = dto.getTitle();
            String str2 = (title == null || (text = title.getText()) == null) ? "" : text;
            CurtainNavBarDTO.Title title2 = dto.getTitle();
            String textColor = title2 != null ? title2.getTextColor() : null;
            CurtainNavBarDTO.Title title3 = dto.getTitle();
            boolean z11 = (title3 == null || (subtext2 = title3.getSubtext()) == null) ? false : !h.K(subtext2);
            CurtainNavBarDTO.Title title4 = dto.getTitle();
            String str3 = (title4 == null || (subtext = title4.getSubtext()) == null) ? "" : subtext;
            CurtainNavBarDTO.Title title5 = dto.getTitle();
            String subtextColor = title5 != null ? title5.getSubtextColor() : null;
            CurtainNavBarDTO.ActionLeft actionLeft = dto.getActionLeft();
            if (actionLeft == null) {
                iconAction = null;
            } else if (actionLeft.getIcon() != null) {
                String actionId = actionLeft.getActionId();
                String icon = actionLeft.getIcon();
                String deeplink = actionLeft.getDeeplink();
                Map<String, Object> postParams = actionLeft.getPostParams();
                String parentDeeplink = actionLeft.getParentDeeplink();
                Map<String, TokenizedTrackingInfo> trackingInfo2 = actionLeft.getTrackingInfo();
                iconAction = new CurtainNavBarVO.ActionLeft.IconAction(actionId, icon, null, deeplink, false, false, postParams, parentDeeplink, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null) : null, 52, null);
            } else {
                String actionId2 = actionLeft.getActionId();
                String text3 = actionLeft.getText();
                String str4 = text3 == null ? "" : text3;
                String deeplink2 = actionLeft.getDeeplink();
                Map<String, Object> postParams2 = actionLeft.getPostParams();
                String parentDeeplink2 = actionLeft.getParentDeeplink();
                Map<String, TokenizedTrackingInfo> trackingInfo3 = actionLeft.getTrackingInfo();
                iconAction = new CurtainNavBarVO.ActionLeft.TextAction(actionId2, null, str4, deeplink2, false, false, postParams2, parentDeeplink2, trackingInfo3 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo3, Long.valueOf(hashCode), null, 2, null) : null, 50, null);
            }
            CurtainNavBarDTO.ActionRight actionRight2 = dto.getActionRight();
            if (actionRight2 != null) {
                if (actionRight2.getIcon() != null) {
                    String actionId3 = actionRight2.getActionId();
                    String icon2 = actionRight2.getIcon();
                    String deeplink3 = actionRight2.getDeeplink();
                    Map<String, Object> postParams3 = actionRight2.getPostParams();
                    String parentDeeplink3 = actionRight2.getParentDeeplink();
                    Map<String, TokenizedTrackingInfo> trackingInfo4 = actionRight2.getTrackingInfo();
                    actionRight = new CurtainNavBarVO.ActionRight.IconAction(actionId3, icon2, null, null, deeplink3, false, false, false, postParams3, parentDeeplink3, trackingInfo4 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo4, Long.valueOf(hashCode), null, 2, null) : null, 236, null);
                } else {
                    String actionId4 = actionRight2.getActionId();
                    String text4 = actionRight2.getText();
                    String str5 = text4 == null ? "" : text4;
                    String deeplink4 = actionRight2.getDeeplink();
                    Map<String, Object> postParams4 = actionRight2.getPostParams();
                    String parentDeeplink4 = actionRight2.getParentDeeplink();
                    Map<String, TokenizedTrackingInfo> trackingInfo5 = actionRight2.getTrackingInfo();
                    actionRight = new CurtainNavBarVO.ActionRight.TextAction(actionId4, null, null, str5, deeplink4, false, false, false, postParams4, parentDeeplink4, trackingInfo5 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo5, Long.valueOf(hashCode), null, 2, null) : null, 230, null);
                }
            }
            small = new CurtainNavBarVO.CurtainBar.Small(0, z11, str3, subtextColor, str2, textColor, iconAction, actionRight, dto.getLeftButton(), dto.getRightButton(), 1, null);
        } else {
            CurtainNavBarDTO.Title title6 = dto.getTitle();
            String str6 = (title6 == null || (text2 = title6.getText()) == null) ? "" : text2;
            CurtainNavBarDTO.Title title7 = dto.getTitle();
            String textColor2 = title7 != null ? title7.getTextColor() : null;
            int i11 = R$drawable.ic_m_cross;
            CurtainNavBarDTO.ActionRight actionRight3 = dto.getActionRight();
            if (actionRight3 == null || (str = actionRight3.getActionId()) == null) {
                str = "dismiss";
            }
            String str7 = str;
            CurtainNavBarDTO.ActionRight actionRight4 = dto.getActionRight();
            CurtainNavBarVO.ActionRight.DrawableAction drawableAction = new CurtainNavBarVO.ActionRight.DrawableAction(str7, null, i11, null, null, false, false, false, null, null, (actionRight4 == null || (trackingInfo = actionRight4.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null), m.e.DEFAULT_SWIPE_ANIMATION_DURATION, null);
            CurtainNavBarDTO.Title title8 = dto.getTitle();
            small = new CurtainNavBarVO.CurtainBar.Large(0, str6, textColor2, null, drawableAction, false, null, title8 != null ? title8.getSubtextColor() : null, 105, null);
        }
        return C7714v.a0(new CurtainNavBarVO(hashCode, small));
    }
}
