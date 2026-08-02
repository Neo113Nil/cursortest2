package ru.ozon.app.android.search.widgets.feedbackForm.v1.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.FeedbackFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO_ActionsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$ActionsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$ActionsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$ActionsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$ActionsDTO$SearchCommonControlSettings;", "nullableSearchCommonControlSettingsAdapter", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackFormDTO_ActionsDTOJsonAdapter extends JsonAdapter<FeedbackFormDTO.ActionsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<FeedbackFormDTO.ActionsDTO.SearchCommonControlSettings> nullableSearchCommonControlSettingsAdapter;

    @NotNull
    private final n.a options;

    public FeedbackFormDTO_ActionsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("submit", "skip", "customAnalytics");
        M m11 = M.f71699a;
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "submit");
        this.nullableSearchCommonControlSettingsAdapter = moshi.f(FeedbackFormDTO.ActionsDTO.SearchCommonControlSettings.class, m11, "skip");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(FeedbackFormDTO.ActionsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FeedbackFormDTO.ActionsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ButtonV3DTO buttonV3DTO = null;
        FeedbackFormDTO.ActionsDTO.SearchCommonControlSettings searchCommonControlSettings = null;
        FeedbackFormDTO.ActionsDTO.SearchCommonControlSettings searchCommonControlSettings2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                if (buttonV3DTO == null) {
                    throw c.q("submit", "submit", reader);
                }
            } else if (v11 == 1) {
                searchCommonControlSettings = this.nullableSearchCommonControlSettingsAdapter.fromJson(reader);
            } else if (v11 == 2) {
                searchCommonControlSettings2 = this.nullableSearchCommonControlSettingsAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (buttonV3DTO != null) {
            return new FeedbackFormDTO.ActionsDTO(buttonV3DTO, searchCommonControlSettings, searchCommonControlSettings2);
        }
        throw c.j("submit", "submit", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FeedbackFormDTO.ActionsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("submit");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getSubmit());
        writer.w("skip");
        this.nullableSearchCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getSkip());
        writer.w("customAnalytics");
        this.nullableSearchCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCustomAnalytics());
        writer.p();
    }
}
