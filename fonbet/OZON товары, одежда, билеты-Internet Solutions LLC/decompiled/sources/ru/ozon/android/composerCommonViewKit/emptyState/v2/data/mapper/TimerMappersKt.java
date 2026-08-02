package ru.ozon.android.composerCommonViewKit.emptyState.v2.data.mapper;

import Ve.C4598rp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.ActionSignature;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.TimerButtonConfig;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.TimerTextTemplate;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.timers.TemplateParseResult;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.timers.TimerParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"toActionSignature", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/ActionSignature;", "Lru/ozon/uni/atoms/af/AtomAction;", "toTimerConfig", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerButtonConfig;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "index", "", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TimerMappersKt {
    public static final ActionSignature toActionSignature(@NotNull AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "<this>");
        if (atomAction instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) atomAction;
            return new ActionSignature(click.getId(), click.getLink(), click.getParams());
        }
        if (!(atomAction instanceof AtomAction.ComposerAction)) {
            return new ActionSignature(atomAction.getId(), null, null);
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) atomAction;
        return new ActionSignature(composerAction.getId(), composerAction.getActionName(), composerAction.getParams());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TimerButtonConfig toTimerConfig(@NotNull ButtonV3DTO buttonV3DTO, int i11) {
        TimerTextTemplate timerTextTemplate;
        CommonControlSettings common;
        AtomActionDTO action;
        String id2;
        String str;
        int totalSeconds;
        AtomActionDTO action2;
        AtomActionDTO action3;
        Intrinsics.checkNotNullParameter(buttonV3DTO, "<this>");
        TimerParser timerParser = TimerParser.INSTANCE;
        TemplateParseResult parseTimerTemplate$common_view_kit_release = timerParser.parseTimerTemplate$common_view_kit_release(buttonV3DTO.getTitle(), true);
        Map<String, String> map = null;
        TemplateParseResult.Parsed parsed = parseTimerTemplate$common_view_kit_release instanceof TemplateParseResult.Parsed ? (TemplateParseResult.Parsed) parseTimerTemplate$common_view_kit_release : null;
        TimerTextTemplate template = parsed != null ? parsed.getTemplate() : null;
        if (!(parseTimerTemplate$common_view_kit_release instanceof TemplateParseResult.Invalid)) {
            if (template == null) {
                TemplateParseResult parseTimerTemplate$common_view_kit_release2 = timerParser.parseTimerTemplate$common_view_kit_release(buttonV3DTO.getSubtitle(), false);
                if (!(parseTimerTemplate$common_view_kit_release2 instanceof TemplateParseResult.Invalid)) {
                    TemplateParseResult.Parsed parsed2 = parseTimerTemplate$common_view_kit_release2 instanceof TemplateParseResult.Parsed ? (TemplateParseResult.Parsed) parseTimerTemplate$common_view_kit_release2 : null;
                    if (parsed2 != null) {
                        timerTextTemplate = parsed2.getTemplate();
                        if ((template == null || timerTextTemplate != null) && (common = buttonV3DTO.getCommon()) != null && (action = common.getAction()) != null && (id2 = action.getId()) != null) {
                            str = h.K(id2) ? id2 : null;
                            if (str != null) {
                                if (template != null) {
                                    totalSeconds = template.getTotalSeconds();
                                } else if (timerTextTemplate != null) {
                                    totalSeconds = timerTextTemplate.getTotalSeconds();
                                }
                                int i12 = totalSeconds;
                                String c11 = C4598rp.c(i11, str, "#");
                                CommonControlSettings common2 = buttonV3DTO.getCommon();
                                String link = (common2 == null || (action3 = common2.getAction()) == null) ? null : action3.getLink();
                                CommonControlSettings common3 = buttonV3DTO.getCommon();
                                if (common3 != null && (action2 = common3.getAction()) != null) {
                                    map = action2.getParams();
                                }
                                return new TimerButtonConfig(c11, str, new ActionSignature(str, link, map), i12, template, timerTextTemplate, Intrinsics.d(buttonV3DTO.isDisabled(), Boolean.TRUE));
                            }
                        }
                    }
                }
            }
            timerTextTemplate = null;
            if (template == null) {
            }
            if (h.K(id2)) {
            }
            if (str != null) {
            }
        }
        return null;
    }
}
