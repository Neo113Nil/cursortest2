package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.mapper;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.CounterDTO;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorCounterDTO;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorPaddings;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/mapper/TopAuthorCounterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorCounterDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "info", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorCounterDTO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopAuthorCounterMapper implements Function2<TopAuthorCounterDTO, d, List<? extends TopAuthorWidgetViewState.Counter>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TopAuthorWidgetViewState.Counter> invoke(@NotNull TopAuthorCounterDTO state, @NotNull d info) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        CounterDTO counter = state.getCounter();
        CounterDTO counter2 = state.getCounter();
        TopAuthorPaddings paddings = counter2 != null ? counter2.getPaddings() : null;
        CounterDTO counter3 = state.getCounter();
        String backgroundColor = counter3 != null ? counter3.getBackgroundColor() : null;
        CounterDTO counter4 = state.getCounter();
        String topGradientColor = counter4 != null ? counter4.getTopGradientColor() : null;
        CounterDTO counter5 = state.getCounter();
        AtomAction atomAction = (counter5 == null || (action = counter5.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, state.getCounter().getTracking());
        Map<String, TokenizedTrackingInfo> tracking = state.getTracking();
        return C7714v.a0(new TopAuthorWidgetViewState.Counter(hashCode, counter, paddings, backgroundColor, topGradientColor, tracking != null ? x.b(tracking, Long.valueOf(hashCode), null) : null, atomAction));
    }
}
