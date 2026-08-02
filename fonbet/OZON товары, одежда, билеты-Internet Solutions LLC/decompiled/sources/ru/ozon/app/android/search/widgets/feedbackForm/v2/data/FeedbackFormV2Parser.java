package ru.ozon.app.android.search.widgets.feedbackForm.v2.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.FeedbackFormV2DTO;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.model.CellV2Model;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.model.InputV2ModelKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u000022\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003`\u0005B\u0013\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00110\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2Parser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO;", "dto", "", "appendOptions", "(Ljava/util/List;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO;)V", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO;", "", "containsInputInOptionals", "(Ljava/util/List;)Z", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "cornerRadius", "F", "defaultCornerRadius", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FeedbackFormV2Parser implements Function2<String, String, List<? extends Object>> {
    private final float cornerRadius;
    private final float defaultCornerRadius;

    @NotNull
    private final JsonParser jsonDeserializer;

    public FeedbackFormV2Parser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.cornerRadius = ResourceExtKt.toPxF(16);
    }

    private final void appendOptions(List<Object> list, FeedbackFormV2DTO feedbackFormV2DTO) {
        int i11 = 0;
        for (Object obj : feedbackFormV2DTO.getOptions()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FeedbackFormV2DTO.OptionDTO optionDTO = (FeedbackFormV2DTO.OptionDTO) obj;
            list.add(new CellV2Model(optionDTO.getCell(), optionDTO.getInput(), optionDTO.getType(), i11 == 0, i11 == C7714v.P(feedbackFormV2DTO.getOptions())));
            i11 = i12;
        }
    }

    private final boolean containsInputInOptionals(List<FeedbackFormV2DTO.OptionDTO> list) {
        List<FeedbackFormV2DTO.OptionDTO> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((FeedbackFormV2DTO.OptionDTO) it.next()).getInput() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        FeedbackFormV2DTO.ActionsDTO.SearchCommonControlSettings customAnalytics;
        FeedbackFormV2DTO.ActionsDTO.SearchCommonControlSettings skip;
        CommonControlSettings common;
        if (state == null) {
            return K.f71697a;
        }
        FeedbackFormV2DTO feedbackFormV2DTO = (FeedbackFormV2DTO) this.jsonDeserializer.fromJson(state, FeedbackFormV2DTO.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SpacerModel(this.cornerRadius, this.defaultCornerRadius));
        appendOptions(arrayList, feedbackFormV2DTO);
        arrayList.add(new SpacerModel(this.defaultCornerRadius, this.cornerRadius));
        if (containsInputInOptionals(feedbackFormV2DTO.getOptions())) {
            arrayList.add(InputV2ModelKt.createDefaultInput());
        }
        FeedbackFormV2DTO.ActionsDTO actions = feedbackFormV2DTO.getActions();
        CommonControlSettings commonControlSettings = null;
        ButtonV3DTO submit = actions != null ? actions.getSubmit() : null;
        FeedbackFormV2DTO.ActionsDTO actions2 = feedbackFormV2DTO.getActions();
        Map<String, TokenizedTrackingInfo> trackingInfo = (actions2 == null || (skip = actions2.getSkip()) == null || (common = skip.getCommon()) == null) ? null : common.getTrackingInfo();
        FeedbackFormV2DTO.ActionsDTO actions3 = feedbackFormV2DTO.getActions();
        if (actions3 != null && (customAnalytics = actions3.getCustomAnalytics()) != null) {
            commonControlSettings = customAnalytics.getCommon();
        }
        arrayList.add(new SendButtonModel(submit, trackingInfo, commonControlSettings));
        return arrayList;
    }
}
