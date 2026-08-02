package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.core;

import Kk.c;
import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.app.android.pdp.ui.compose.time.StableTimeWrappersKt;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.data.EntryBannerDTO;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation.EntryBannerVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n\"\u0004\b\u0000\u0010\t*\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/core/EntryBannerContentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Block", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block;", "toVI", "(Ljava/lang/Object;)Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TitleBadge;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$CustomBadge;", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TitleBadge;)Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$CustomBadge;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TimerText;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text$TimerText;", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO$TimerText;)Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text$TimerText;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/data/EntryBannerDTO;Ll20/d;)Ljava/util/List;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerContentMapper implements Function2<EntryBannerDTO, d, List<? extends EntryBannerVI.Content>> {
    /* JADX WARN: Multi-variable type inference failed */
    private final <Block> EntryBannerVI.Content.Block toVI(Block block) {
        if (block instanceof EntryBannerDTO.TextWithBadge) {
            EntryBannerDTO.TextWithBadge textWithBadge = (EntryBannerDTO.TextWithBadge) block;
            return new EntryBannerVI.Content.Block.Title(new EntryBannerVI.Content.Text.DsText(textWithBadge.getTitle()), toVI(textWithBadge.getTitleBadge()));
        }
        if (block instanceof EntryBannerDTO.TitleTimerWithBadge) {
            EntryBannerDTO.TitleTimerWithBadge titleTimerWithBadge = (EntryBannerDTO.TitleTimerWithBadge) block;
            return new EntryBannerVI.Content.Block.Title(toVI(titleTimerWithBadge.getTimerText()), toVI(titleTimerWithBadge.getTitleBadge()));
        }
        if (block instanceof TextDTO) {
            return new EntryBannerVI.Content.Block.Subtitle(new EntryBannerVI.Content.Text.DsText((TextDTO) block));
        }
        if (block instanceof EntryBannerDTO.TimerText) {
            return new EntryBannerVI.Content.Block.Subtitle(toVI((EntryBannerDTO.TimerText) block));
        }
        if (block instanceof BadgeDTO) {
            return new EntryBannerVI.Content.Block.Badge((BadgeDTO) block);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<EntryBannerVI.Content> invoke(@NotNull EntryBannerDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(widgetInfo.d(), "-content");
        List<Object> blocks = state.getBlocks();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = blocks.iterator();
        while (it.hasNext()) {
            EntryBannerVI.Content.Block vi2 = toVI((EntryBannerContentMapper) it.next());
            if (vi2 != null) {
                arrayList.add(vi2);
            }
        }
        String animationName = state.getAnimationName();
        String backgroundColor = state.getBackgroundColor();
        AtomActionDTO clickAction = state.getClickAction();
        AtomAction atomAction = clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, state.getTrackingInfo()) : null;
        AtomActionDTO widgetViewTrackingAction = state.getWidgetViewTrackingAction();
        AtomAction atomAction2 = widgetViewTrackingAction != null ? AtomActionMapperKt.toAtomAction(widgetViewTrackingAction, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new EntryBannerVI.Content(a11, arrayList, animationName, backgroundColor, atomAction, atomAction2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(a11), null, 2, null) : null));
    }

    private final EntryBannerVI.Content.CustomBadge toVI(EntryBannerDTO.TitleBadge titleBadge) {
        return new EntryBannerVI.Content.CustomBadge(titleBadge.getText(), titleBadge.getIcon(), titleBadge.getBackgroundColor());
    }

    private final EntryBannerVI.Content.Text.TimerText toVI(EntryBannerDTO.TimerText timerText) {
        TextDTO leadingText = timerText.getLeadingText();
        StableDateTime stable = StableTimeWrappersKt.stable(timerText.getExpireDate());
        String trailingText = timerText.getTrailingText();
        AtomActionDTO deadlineAction = timerText.getDeadlineAction();
        return new EntryBannerVI.Content.Text.TimerText(leadingText, stable, trailingText, deadlineAction != null ? AtomActionMapperKt.toAtomAction(deadlineAction, null) : null);
    }
}
