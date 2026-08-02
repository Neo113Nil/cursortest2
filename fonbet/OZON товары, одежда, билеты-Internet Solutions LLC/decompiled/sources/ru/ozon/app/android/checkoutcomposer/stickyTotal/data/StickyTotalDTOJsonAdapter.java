package ru.ozon.app.android.checkoutcomposer.stickyTotal.data;

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
import ru.ozon.app.android.checkoutcomposer.stickyTotal.data.StickyTotalDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableBadgeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO$Summary;", "summaryAdapter", "Lru/ozon/uni/atoms/data/deprecated/Button;", "buttonAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyTotalDTOJsonAdapter extends JsonAdapter<StickyTotalDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Button> buttonAdapter;

    @NotNull
    private final JsonAdapter<Badge> nullableBadgeAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<StickyTotalDTO.Summary> summaryAdapter;

    public StickyTotalDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("badgeInfo", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "button", "buttonColor", "disableSeparator", "backgroundColor", "showIsland", "taxAmount", "buttonTextColor");
        M m11 = M.f71699a;
        this.nullableBadgeAdapter = moshi.f(Badge.class, m11, "badgeInfo");
        this.summaryAdapter = moshi.f(StickyTotalDTO.Summary.class, m11, FormPageDTO.Field.FIELD_TYPE_SUMMARY);
        this.buttonAdapter = moshi.f(Button.class, m11, "button");
        this.nullableStringAdapter = moshi.f(String.class, m11, "buttonColor");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "disableSeparator");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "taxAmount");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(StickyTotalDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public StickyTotalDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Badge badge = null;
        StickyTotalDTO.Summary summary = null;
        Button button = null;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        Boolean bool2 = null;
        TextDTO textDTO = null;
        String str3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    badge = this.nullableBadgeAdapter.fromJson(reader);
                    break;
                case 1:
                    summary = this.summaryAdapter.fromJson(reader);
                    if (summary == null) {
                        throw c.q(FormPageDTO.Field.FIELD_TYPE_SUMMARY, FormPageDTO.Field.FIELD_TYPE_SUMMARY, reader);
                    }
                    break;
                case 2:
                    button = this.buttonAdapter.fromJson(reader);
                    if (button == null) {
                        throw c.q("button", "button", reader);
                    }
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 7:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (summary == null) {
            throw c.j(FormPageDTO.Field.FIELD_TYPE_SUMMARY, FormPageDTO.Field.FIELD_TYPE_SUMMARY, reader);
        }
        if (button != null) {
            return new StickyTotalDTO(badge, summary, button, str, bool, str2, bool2, textDTO, str3);
        }
        throw c.j("button", "button", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, StickyTotalDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badgeInfo");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getBadgeInfo());
        writer.w(FormPageDTO.Field.FIELD_TYPE_SUMMARY);
        this.summaryAdapter.mo44toJson(writer, (x) value.getSummary());
        writer.w("button");
        this.buttonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("buttonColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getButtonColor());
        writer.w("disableSeparator");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getDisableSeparator());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("showIsland");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getShowIsland());
        writer.w("taxAmount");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getTaxAmount());
        writer.w("buttonTextColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getButtonTextColor());
        writer.p();
    }
}
