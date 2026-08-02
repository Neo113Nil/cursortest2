package ru.ozon.app.android.search.widgets.feedbackForm.v1.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.search.widgets.feedbackForm.common.model.SendButtonModel;
import ru.ozon.app.android.search.widgets.feedbackForm.common.model.SpacerModel;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.FeedbackFormDTO;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.model.CellModel;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.model.InputModelKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u000022\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003`\u0005B\u0013\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormParser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO;", "dto", "", "appendOptions", "(Ljava/util/List;Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO;)V", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "cornerRadius", "F", "defaultCornerRadius", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FeedbackFormParser implements Function2<String, String, List<? extends Object>> {
    private final float cornerRadius;
    private final float defaultCornerRadius;

    @NotNull
    private final JsonParser jsonDeserializer;

    public FeedbackFormParser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.cornerRadius = ResourceExtKt.toPxF(16);
    }

    private final void appendOptions(List<Object> list, FeedbackFormDTO feedbackFormDTO) {
        CommonControlSettings common;
        int i11 = 0;
        for (Object obj : feedbackFormDTO.getOptions()) {
            int i12 = i11 + 1;
            Map<String, TokenizedTrackingInfo> map = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FeedbackFormDTO.OptionDTO optionDTO = (FeedbackFormDTO.OptionDTO) obj;
            CellDTO cell = optionDTO.getCell();
            FeedbackFormDTO.OptionDTO.OptionType type = optionDTO.getType();
            FeedbackFormDTO.OptionDTO.InputDTO input = optionDTO.getInput();
            boolean z11 = i11 == 0;
            boolean z12 = i11 == C7714v.P(feedbackFormDTO.getOptions());
            FeedbackFormDTO.ActionsDTO.SearchCommonControlSettings skip = feedbackFormDTO.getActions().getSkip();
            if (skip != null && (common = skip.getCommon()) != null) {
                map = common.getTrackingInfo();
            }
            list.add(new CellModel(cell, input, type, z11, z12, map));
            i11 = i12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        CommonControlSettings common;
        if (state == null) {
            return K.f71697a;
        }
        FeedbackFormDTO feedbackFormDTO = (FeedbackFormDTO) this.jsonDeserializer.fromJson(state, FeedbackFormDTO.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SpacerModel(this.cornerRadius, this.defaultCornerRadius));
        appendOptions(arrayList, feedbackFormDTO);
        arrayList.add(new SpacerModel(this.defaultCornerRadius, this.cornerRadius));
        arrayList.add(InputModelKt.createDefaultInput());
        ButtonV3DTO submit = feedbackFormDTO.getActions().getSubmit();
        FeedbackFormDTO.ActionsDTO.SearchCommonControlSettings skip = feedbackFormDTO.getActions().getSkip();
        Map<String, TokenizedTrackingInfo> trackingInfo = (skip == null || (common = skip.getCommon()) == null) ? null : common.getTrackingInfo();
        FeedbackFormDTO.ActionsDTO.SearchCommonControlSettings customAnalytics = feedbackFormDTO.getActions().getCustomAnalytics();
        arrayList.add(new SendButtonModel(submit, trackingInfo, customAnalytics != null ? customAnalytics.getCommon() : null));
        return arrayList;
    }
}
