package ru.ozon.id.antibot;

import Ak.b;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/ozon/id/antibot/AntibotDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/antibot/AntibotDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/antibot/AntibotDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/antibot/AntibotDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableLongAdapter", "", "nullableBooleanAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AntibotDTOJsonAdapter extends JsonAdapter<AntibotDTO> {

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public AntibotDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("incidentId", "challengeURL", "captchaURL", "captchaTimeoutMs", "errorText", "hideCloseButton", "supportURL", "mf", "mfToken");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "incidentId");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<Long> f11 = moshi.f(Long.class, m11, "captchaTimeoutMs");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableLongAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.class, m11, "hideCloseButton");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableBooleanAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(AntibotDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AntibotDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l11 = null;
        String str4 = null;
        Boolean bool = null;
        String str5 = null;
        Boolean bool2 = null;
        String str6 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new AntibotDTO(str, str2, str3, l11, str4, bool, str5, bool2, str6);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AntibotDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("incidentId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIncidentId());
        writer.w("challengeURL");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getChallengeURL());
        writer.w("captchaURL");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCaptchaURL());
        writer.w("captchaTimeoutMs");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getCaptchaTimeoutMs());
        writer.w("errorText");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getErrorText());
        writer.w("hideCloseButton");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHideCloseButton());
        writer.w("supportURL");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSupportURL());
        writer.w("mf");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getMf());
        writer.w("mfToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getMfToken());
        writer.p();
    }
}
