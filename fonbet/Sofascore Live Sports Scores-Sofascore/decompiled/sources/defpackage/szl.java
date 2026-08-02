package defpackage;

import com.blaze.blazesdk.features.shared.models.shared_models.CTAEnhancementsDto;
import com.blaze.blazesdk.features.shared.models.shared_models.CtaDto;
import com.blaze.blazesdk.features.shared.models.shared_models.CtaTypeDto;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLinkActionHandleType;
import com.blaze.blazesdk.features.shared.models.ui_shared.f;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class szl {
    public static final i a(CtaDto ctaDto) {
        String str;
        String str2;
        String str3;
        f fVar;
        String str4;
        String str5;
        String str6;
        CTAEnhancementsDto enhancements;
        String url;
        CtaTypeDto type;
        BlazeLinkActionHandleType typeFromString = BlazeLinkActionHandleType.b.typeFromString((ctaDto == null || (type = ctaDto.getType()) == null) ? null : type.getValue());
        if (typeFromString == null) {
            typeFromString = BlazeLinkActionHandleType.UNKNOWN;
        }
        String str7 = "";
        if (ctaDto == null || (str = ctaDto.getText()) == null) {
            str = "";
        }
        if (ctaDto != null && (url = ctaDto.getUrl()) != null) {
            str7 = url;
        }
        if (ctaDto == null || (str2 = ctaDto.getBackgroundColor()) == null) {
            str2 = "#FFFFFF";
        }
        if (ctaDto == null || (str3 = ctaDto.getTextColor()) == null) {
            str3 = "#000000";
        }
        if (ctaDto == null || (enhancements = ctaDto.getEnhancements()) == null) {
            String str8 = str3;
            fVar = null;
            str4 = str;
            str5 = str2;
            str6 = str8;
        } else {
            CTAEnhancementsDto.AnimationType animationType = enhancements.getAnimationType();
            s6m valueOf = animationType != null ? s6m.valueOf(animationType.name()) : null;
            Boolean hasSwipeUp = enhancements.getHasSwipeUp();
            f fVar2 = new f(valueOf, hasSwipeUp != null ? hasSwipeUp.booleanValue() : false);
            str4 = str;
            str5 = str2;
            str6 = str3;
            fVar = fVar2;
        }
        return new i(typeFromString, str4, str7, str5, str6, fVar);
    }
}
