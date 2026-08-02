package ru.ozon.app.android.marketing.widgets.actionProgress.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.actionProgress.data.ActionProgressDTO;
import ru.ozon.app.android.marketing.widgets.actionProgress.presentation.ActionProgressVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0012B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/core/ActionProgressMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;Ll20/d;)Ljava/util/List;", "", "stateId", "mapDto", "(Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;J)Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionProgressMapper implements Function2<ActionProgressDTO, d, List<? extends ActionProgressVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/core/ActionProgressMapper$Companion;", "", "<init>", "()V", "PROGRESS_TEXT_MAX_LINES", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public final ActionProgressVO mapDto(@NotNull ActionProgressDTO state, long stateId) {
        Intrinsics.checkNotNullParameter(state, "state");
        ActionProgressVO.Progress progress = new ActionProgressVO.Progress(state.getProgress().getPercent(), state.getProgress().getColorStart(), state.getProgress().getColorEnd(), state.getProgress().getBackgroundColor());
        TextAtom title = state.getTitle();
        TextAtom subtitle = state.getSubtitle();
        TextAtom progressText = state.getProgressText();
        Integer maxLines = state.getProgressText().getMaxLines();
        return new ActionProgressVO(stateId, title, TextAtom.copy$default(progressText, null, null, null, Integer.valueOf(maxLines != null ? maxLines.intValue() : 2), null, null, null, 119, null), progress, subtitle, state.getCurrentMiniWidget());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ActionProgressVO> invoke(@NotNull ActionProgressDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapDto(state, widgetInfo.d().hashCode()));
    }
}
