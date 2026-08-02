package ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.data;

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
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation.PromptSuggestionsVO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/data/PromptSuggestionsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/data/PromptSuggestionsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/data/PromptSuggestionsDTO;Ll20/d;)Ljava/util/List;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromptSuggestionsMapper implements Function2<PromptSuggestionsDTO, d, List<? extends PromptSuggestionsVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PromptSuggestionsVO> invoke(@NotNull PromptSuggestionsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        List<TagButtonDTO> suggestions = state.getSuggestions();
        ArrayList arrayList = new ArrayList(C7714v.z(suggestions, 10));
        Iterator<T> it = suggestions.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TagButtonDTO tagButtonDTO = (TagButtonDTO) it.next();
            Map<String, TokenizedTrackingInfo> trackingInfo = tagButtonDTO.getTrackingInfo();
            if (trackingInfo != null) {
                r6 = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            }
            arrayList.add(new PromptSuggestionsVO.SuggestionButton(tagButtonDTO, r6));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getTrackingInfo();
        return C7714v.a0(new PromptSuggestionsVO(hashCode, title, arrayList, trackingInfo2 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
