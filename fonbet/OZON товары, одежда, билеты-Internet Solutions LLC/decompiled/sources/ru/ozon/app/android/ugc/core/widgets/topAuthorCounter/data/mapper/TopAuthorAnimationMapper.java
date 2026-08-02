package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.mapper;

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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/mapper/TopAuthorAnimationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorCounterDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthorWithAnimation;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "info", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorCounterDTO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopAuthorAnimationMapper implements Function2<TopAuthorCounterDTO, d, List<? extends TopAuthorWidgetViewState.TopAuthorWithAnimation>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TopAuthorWidgetViewState.TopAuthorWithAnimation> invoke(@NotNull TopAuthorCounterDTO state, @NotNull d info) {
        AtomAction atomAction;
        List<TopAuthorDTO.TopAuthorContent> content;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        CounterDTO counter = state.getCounter();
        if (counter == null) {
            return K.f71697a;
        }
        TopAuthorPaddings paddings = state.getCounter().getPaddings();
        String backgroundColor = state.getCounter().getBackgroundColor();
        String topGradientColor = state.getCounter().getTopGradientColor();
        AtomActionDTO action = state.getCounter().getAction();
        if (action != null) {
            TopAuthorDTO author = state.getAuthor();
            atomAction = AtomActionMapperKt.toAtomAction(action, author != null ? author.getTracking() : null);
        } else {
            atomAction = null;
        }
        TopAuthorWidgetViewState.Counter counter2 = new TopAuthorWidgetViewState.Counter(hashCode, counter, paddings, backgroundColor, topGradientColor, null, atomAction);
        TopContainerDTO topContainer = state.getTopContainer();
        TopAuthorDTO author2 = state.getAuthor();
        if (author2 == null || (content = author2.getContent()) == null) {
            return K.f71697a;
        }
        TopAuthorPaddings paddings2 = state.getAuthor().getPaddings();
        String backgroundColor2 = state.getAuthor().getBackgroundColor();
        String topGradientColor2 = state.getAuthor().getTopGradientColor();
        AtomActionDTO action2 = state.getAuthor().getAction();
        TopAuthorWidgetViewState.TopAuthor topAuthor = new TopAuthorWidgetViewState.TopAuthor(hashCode, topContainer, content, paddings2, backgroundColor2, topGradientColor2, null, action2 != null ? AtomActionMapperKt.toAtomAction(action2, state.getAuthor().getTracking()) : null);
        TopAuthorPaddings paddings3 = state.getCounter().getPaddings();
        String backgroundColor3 = state.getCounter().getBackgroundColor();
        String topGradientColor3 = state.getCounter().getTopGradientColor();
        Map<String, TokenizedTrackingInfo> tracking = state.getTracking();
        return C7714v.a0(new TopAuthorWidgetViewState.TopAuthorWithAnimation(hashCode, counter2, topAuthor, paddings3, backgroundColor3, topGradientColor3, tracking != null ? x.b(tracking, Long.valueOf(hashCode), null) : null, null));
    }
}
