package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.header.AiHeaderDTO;
import ru.ozon.android.messenger.blocks.ai.header.presentation.a;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
public final class Z {
    @NotNull
    public static final ru.ozon.android.messenger.framework.presentation.models.q a(@NotNull ru.ozon.android.messenger.framework.data.b blockStore, String str, String str2) {
        AiHeaderDTO.TitleSubtitle titleSubtitle;
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        ru.ozon.android.messenger.framework.presentation.models.c a11 = ru.ozon.android.messenger.framework.presentation.models.h.a(ru.ozon.android.messenger.utils.n.a());
        UniTheme uniTheme = UniTheme.INSTANCE;
        String id2 = uniTheme.getColorTokens().getClearLightKey0().getId();
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        if (str != null) {
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(str);
            TextPreset textPreset = TextPreset.PRESET_CUSTOM;
            TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
            titleSubtitle = new AiHeaderDTO.TitleSubtitle(new TextDTO(ozonSpannableString, textAlignment, null, null, null, null, textPreset, uniTheme.getTypographyTokens().getBodyControl500Medium().getId(), uniTheme.getColorTokens().getTextPrimary().getId(), 1, null, null, null, false, null, null, null, null, null, 523324, null), str2 != null ? new TextDTO(OzonSpannableStringKt.toOzonSpannableString(str2), textAlignment, null, null, null, null, textPreset, uniTheme.getTypographyTokens().getCompact300XSmall().getId(), uniTheme.getColorTokens().getTextTertiary().getId(), 1, null, null, null, false, null, null, null, null, null, 523324, null) : null, null);
        } else {
            titleSubtitle = null;
        }
        return ru.ozon.android.messenger.framework.presentation.models.v.d(new ru.ozon.android.messenger.framework.presentation.models.u(new ru.ozon.android.messenger.blocks.ai.header.presentation.a(a11, id2, k11, titleSubtitle, null, C7714v.a0(new a.C1458a(new IconButtonV3DTO(null, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, uniTheme.getIconTokens().getIc_s_cross_filled().getId(), null, uniTheme.getColorTokens().getGraphicSecondary().getId(), uniTheme.getColorTokens().getBgOverlap().getId(), new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.DISMISS, null, null, null, "BEHAVIOR_TYPE_DISMISS", 14, null), null, null, 6, null), null, null, null, null, null, null, 16145, null), null)), CornerRadius.RADIUS_600, null, null), ru.ozon.android.messenger.framework.data.d.g(blockStore, f.a.AI_HEADER), e.b.f87375a), a11.a());
    }

    public static final boolean b(@NotNull ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        ru.ozon.android.messenger.framework.presentation.models.p c11 = qVar.c();
        ru.ozon.android.messenger.framework.presentation.models.s sVar = c11 instanceof ru.ozon.android.messenger.framework.presentation.models.s ? (ru.ozon.android.messenger.framework.presentation.models.s) c11 : null;
        return sVar != null && sVar.p();
    }
}
