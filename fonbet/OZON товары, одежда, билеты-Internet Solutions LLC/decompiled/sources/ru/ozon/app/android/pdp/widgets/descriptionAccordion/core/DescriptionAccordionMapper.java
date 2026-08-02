package ru.ozon.app.android.pdp.widgets.descriptionAccordion.core;

import WZ.t;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
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
import ru.ozon.app.android.pdp.utils.AtomExtKt;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.AccordionDimens;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.data.DescriptionAccordionDTO;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.presentation.DescriptionAccordionVO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u00020\u0007B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/data/DescriptionAccordionDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/AccordionDimens;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/descriptionAccordion/data/DescriptionAccordionDTO;Ll20/d;)Ljava/util/List;", "extractVo$pdp_prodGoogleAllVendorsRelease", "extractVo", "Landroid/content/Context;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DescriptionAccordionMapper implements Function2<DescriptionAccordionDTO, d, List<? extends DescriptionAccordionVO>>, AccordionDimens {

    @NotNull
    private final Context context;

    public DescriptionAccordionMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final List<DescriptionAccordionVO> extractVo$pdp_prodGoogleAllVendorsRelease(@NotNull DescriptionAccordionDTO state, @NotNull d widgetInfo) {
        TextDTO dsTextAtom$default;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<DescriptionAccordionDTO.Block> blocks = state.getBlocks();
        ArrayList arrayList = new ArrayList(C7714v.z(blocks, 10));
        int i11 = 0;
        for (Object obj : blocks) {
            int i12 = i11 + 1;
            Integer num = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            DescriptionAccordionDTO.Block block = (DescriptionAccordionDTO.Block) obj;
            TextAtom subtitle = block.getSubtitle();
            OzonSpannableString text = subtitle != null ? subtitle.getText() : null;
            boolean z11 = text == null || h.K(text);
            boolean z12 = !z11;
            long j11 = hashCode + i11;
            TextDTO dsTextAtom$default2 = TextMapperKt.dsTextAtom$default(block.getTitle(), null, null, null, null, null, null, null, null, null, 1, null, true, 1535, null);
            TextAtom subtitle2 = block.getSubtitle();
            TextDTO dsTextAtom$default3 = subtitle2 != null ? TextMapperKt.dsTextAtom$default(subtitle2, null, null, null, null, null, null, null, null, null, null, null, true, 2047, null) : null;
            String backgroundColor = state.getBackgroundColor();
            if (backgroundColor == null) {
                backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
            }
            String str = backgroundColor;
            Boolean showSeparator = block.getShowSeparator();
            boolean booleanValue = showSeparator != null ? showSeparator.booleanValue() : false;
            Map<String, TokenizedTrackingInfo> trackingInfo = block.getTrackingInfo();
            t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
            String tabGroupId = state.getTabGroupId();
            boolean z13 = Intrinsics.d(block.isDisclosureOpen(), Boolean.TRUE) && !z11;
            String disclosureTintColor = block.getDisclosureTintColor();
            if (disclosureTintColor == null) {
                disclosureTintColor = UniColors.GRAPHIC_NEUTRAL.getToken();
            }
            DescriptionAccordionVO.Icon icon = new DescriptionAccordionVO.Icon(z13, disclosureTintColor, z12);
            TextAtom subtitle3 = block.getSubtitle();
            if (subtitle3 != null && (dsTextAtom$default = TextMapperKt.dsTextAtom$default(subtitle3, null, null, null, null, null, null, null, null, null, null, null, true, 2047, null)) != null) {
                num = Integer.valueOf(AtomExtKt.getMeasuredHeightWithCustomWidth(dsTextAtom$default, this.context, C7714v.b0(Integer.valueOf(getDp40()), Integer.valueOf(getDp16()))));
            }
            arrayList.add(new DescriptionAccordionVO(j11, dsTextAtom$default2, dsTextAtom$default3, icon, str, booleanValue, tokenizedEvent$default, tabGroupId, num, false, UserVerificationMethods.USER_VERIFY_NONE, null));
            i11 = i12;
        }
        return arrayList;
    }

    public int getDp16() {
        return AccordionDimens.DefaultImpls.getDp16(this);
    }

    public int getDp40() {
        return AccordionDimens.DefaultImpls.getDp40(this);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DescriptionAccordionVO> invoke(@NotNull DescriptionAccordionDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return extractVo$pdp_prodGoogleAllVendorsRelease(state, widgetInfo);
    }
}
