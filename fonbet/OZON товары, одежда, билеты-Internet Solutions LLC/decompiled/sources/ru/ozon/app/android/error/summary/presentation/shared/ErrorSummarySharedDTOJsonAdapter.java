package ru.ozon.app.android.error.summary.presentation.shared;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummarySharedDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummarySharedDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummarySharedDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummarySharedDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableLongAdapter", "", "nullableIntAdapter", "", "Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryFeatureFlagSharedDTO;", "nullableListOfErrorSummaryFeatureFlagSharedDTOAdapter", "nullableListOfStringAdapter", "Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryExperimentSharedDTO;", "nullableListOfErrorSummaryExperimentSharedDTOAdapter", "Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryInvalidWidgetSharedDTO;", "nullableListOfErrorSummaryInvalidWidgetSharedDTOAdapter", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummarySharedDTOJsonAdapter extends JsonAdapter<ErrorSummarySharedDTO> {

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<ErrorSummaryExperimentSharedDTO>> nullableListOfErrorSummaryExperimentSharedDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ErrorSummaryFeatureFlagSharedDTO>> nullableListOfErrorSummaryFeatureFlagSharedDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ErrorSummaryInvalidWidgetSharedDTO>> nullableListOfErrorSummaryInvalidWidgetSharedDTOAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ErrorSummarySharedDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("platform", "app_version", "commit_hash", "error_date", "trace_id", "user_id", "response_code", "response_message", "page_url", "mesh", "layout_id", "layout_version", "feature_flags", "local_experiments", "experiments", "invalid_widget");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "platform");
        this.nullableStringAdapter = moshi.f(String.class, m11, "errorDate");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "userId");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "responseCode");
        this.nullableListOfErrorSummaryFeatureFlagSharedDTOAdapter = moshi.f(D.e(List.class, ErrorSummaryFeatureFlagSharedDTO.class), m11, "featureFlags");
        this.nullableListOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "localExperiments");
        this.nullableListOfErrorSummaryExperimentSharedDTOAdapter = moshi.f(D.e(List.class, ErrorSummaryExperimentSharedDTO.class), m11, "experiments");
        this.nullableListOfErrorSummaryInvalidWidgetSharedDTOAdapter = moshi.f(D.e(List.class, ErrorSummaryInvalidWidgetSharedDTO.class), m11, "invalidWidget");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(ErrorSummarySharedDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ErrorSummarySharedDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Long l11 = null;
        Integer num = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num2 = null;
        Integer num3 = null;
        List<ErrorSummaryFeatureFlagSharedDTO> list = null;
        List<String> list2 = null;
        List<ErrorSummaryExperimentSharedDTO> list3 = null;
        List<ErrorSummaryInvalidWidgetSharedDTO> list4 = null;
        while (true) {
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            if (!reader.hasNext()) {
                String str12 = str4;
                reader.endObject();
                if (str9 == null) {
                    throw c.j("platform", "platform", reader);
                }
                if (str10 == null) {
                    throw c.j("appVersion", "app_version", reader);
                }
                if (str11 != null) {
                    return new ErrorSummarySharedDTO(str9, str10, str11, str12, str5, l11, num, str6, str7, str8, num2, num3, list, list2, list3, list4);
                }
                throw c.j("commitHash", "commit_hash", reader);
            }
            String str13 = str4;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("platform", "platform", reader);
                    }
                    str4 = str13;
                    str2 = str10;
                    str3 = str11;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("appVersion", "app_version", reader);
                    }
                    str4 = str13;
                    str = str9;
                    str3 = str11;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("commitHash", "commit_hash", reader);
                    }
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 5:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 6:
                    num = this.nullableIntAdapter.fromJson(reader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 9:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 10:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 11:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 12:
                    list = this.nullableListOfErrorSummaryFeatureFlagSharedDTOAdapter.fromJson(reader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 13:
                    list2 = this.nullableListOfStringAdapter.fromJson(reader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 14:
                    list3 = this.nullableListOfErrorSummaryExperimentSharedDTOAdapter.fromJson(reader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 15:
                    list4 = this.nullableListOfErrorSummaryInvalidWidgetSharedDTOAdapter.fromJson(reader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                default:
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ErrorSummarySharedDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("platform");
        this.stringAdapter.mo44toJson(writer, (x) value.getPlatform());
        writer.w("app_version");
        this.stringAdapter.mo44toJson(writer, (x) value.getAppVersion());
        writer.w("commit_hash");
        this.stringAdapter.mo44toJson(writer, (x) value.getCommitHash());
        writer.w("error_date");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getErrorDate());
        writer.w("trace_id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTraceId());
        writer.w("user_id");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getUserId());
        writer.w("response_code");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getResponseCode());
        writer.w("response_message");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getResponseMessage());
        writer.w("page_url");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPageUrl());
        writer.w("mesh");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getMesh());
        writer.w("layout_id");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getLayoutId());
        writer.w("layout_version");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getLayoutVersion());
        writer.w("feature_flags");
        this.nullableListOfErrorSummaryFeatureFlagSharedDTOAdapter.mo44toJson(writer, (x) value.getFeatureFlags());
        writer.w("local_experiments");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getLocalExperiments());
        writer.w("experiments");
        this.nullableListOfErrorSummaryExperimentSharedDTOAdapter.mo44toJson(writer, (x) value.getExperiments());
        writer.w("invalid_widget");
        this.nullableListOfErrorSummaryInvalidWidgetSharedDTOAdapter.mo44toJson(writer, (x) value.getInvalidWidget());
        writer.p();
    }
}
