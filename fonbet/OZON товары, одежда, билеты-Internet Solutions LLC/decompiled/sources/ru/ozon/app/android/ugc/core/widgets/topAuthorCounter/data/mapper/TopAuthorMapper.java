package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.mapper;

import WZ.t;
import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.CounterDTO;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorCounterDTO;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorDTO;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorPaddings;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopContainerDTO;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/mapper/TopAuthorMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorCounterDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "info", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorCounterDTO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopAuthorMapper implements Function2<TopAuthorCounterDTO, d, List<? extends TopAuthorWidgetViewState.TopAuthor>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TopAuthorWidgetViewState.TopAuthor> invoke(@NotNull TopAuthorCounterDTO state, @NotNull d info) {
        List<TopAuthorDTO.TopAuthorContent> list;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        TopContainerDTO topContainer = state.getTopContainer();
        TopAuthorDTO author = state.getAuthor();
        if (author == null || (list = author.getContent()) == null) {
            list = K.f71697a;
        }
        List<TopAuthorDTO.TopAuthorContent> list2 = list;
        TopAuthorDTO author2 = state.getAuthor();
        AtomAction atomAction = null;
        TopAuthorPaddings paddings = author2 != null ? author2.getPaddings() : null;
        CounterDTO counter = state.getCounter();
        String backgroundColor = counter != null ? counter.getBackgroundColor() : null;
        CounterDTO counter2 = state.getCounter();
        String topGradientColor = counter2 != null ? counter2.getTopGradientColor() : null;
        Map<String, TokenizedTrackingInfo> tracking = state.getTracking();
        t b11 = tracking != null ? x.b(tracking, Long.valueOf(hashCode), null) : null;
        TopAuthorDTO author3 = state.getAuthor();
        if (author3 != null && (action = author3.getAction()) != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, state.getAuthor().getTracking());
        }
        return C7714v.a0(new TopAuthorWidgetViewState.TopAuthor(hashCode, topContainer, list2, paddings, backgroundColor, topGradientColor, b11, atomAction));
    }
}
