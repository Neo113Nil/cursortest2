package ru.ozon.app.android.checkoutcomposer.total.models;

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
import ru.ozon.app.android.checkoutcomposer.total.models.TotalDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary;", "nullableSummaryAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$InteractiveActions;", "interactiveActionsAdapter", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$AdditionalInfo;", "additionalInfoAdapter", "Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO;", "nullableStickyTotalDTOAdapter", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$ProgressBar;", "nullableProgressBarAdapter", "", "nullableBooleanAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalDTOJsonAdapter extends JsonAdapter<TotalDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<TotalDTO.AdditionalInfo> additionalInfoAdapter;

    @NotNull
    private final JsonAdapter<TotalDTO.InteractiveActions> interactiveActionsAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<TotalDTO.ProgressBar> nullableProgressBarAdapter;

    @NotNull
    private final JsonAdapter<StickyTotalDTO> nullableStickyTotalDTOAdapter;

    @NotNull
    private final JsonAdapter<TotalDTO.Summary> nullableSummaryAdapter;

    @NotNull
    private final n.a options;

    public TotalDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(FormPageDTO.Field.FIELD_TYPE_SUMMARY, "interactiveActions", "additionalInfo", "sticky", "progressBar", "showVerticalSeparator");
        M m11 = M.f71699a;
        this.nullableSummaryAdapter = moshi.f(TotalDTO.Summary.class, m11, FormPageDTO.Field.FIELD_TYPE_SUMMARY);
        this.interactiveActionsAdapter = moshi.f(TotalDTO.InteractiveActions.class, m11, "interactiveActions");
        this.additionalInfoAdapter = moshi.f(TotalDTO.AdditionalInfo.class, m11, "additionalInfo");
        this.nullableStickyTotalDTOAdapter = moshi.f(StickyTotalDTO.class, m11, "sticky");
        this.nullableProgressBarAdapter = moshi.f(TotalDTO.ProgressBar.class, m11, "progressBar");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "showVerticalSeparator");
    }

    @NotNull
    public String toString() {
        return b.c(30, "GeneratedJsonAdapter(TotalDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TotalDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TotalDTO.Summary summary = null;
        TotalDTO.InteractiveActions interactiveActions = null;
        TotalDTO.AdditionalInfo additionalInfo = null;
        StickyTotalDTO stickyTotalDTO = null;
        TotalDTO.ProgressBar progressBar = null;
        Boolean bool = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    summary = this.nullableSummaryAdapter.fromJson(reader);
                    break;
                case 1:
                    interactiveActions = this.interactiveActionsAdapter.fromJson(reader);
                    if (interactiveActions == null) {
                        throw c.q("interactiveActions", "interactiveActions", reader);
                    }
                    break;
                case 2:
                    additionalInfo = this.additionalInfoAdapter.fromJson(reader);
                    if (additionalInfo == null) {
                        throw c.q("additionalInfo", "additionalInfo", reader);
                    }
                    break;
                case 3:
                    stickyTotalDTO = this.nullableStickyTotalDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    progressBar = this.nullableProgressBarAdapter.fromJson(reader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (interactiveActions == null) {
            throw c.j("interactiveActions", "interactiveActions", reader);
        }
        if (additionalInfo != null) {
            return new TotalDTO(summary, interactiveActions, additionalInfo, stickyTotalDTO, progressBar, bool);
        }
        throw c.j("additionalInfo", "additionalInfo", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TotalDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(FormPageDTO.Field.FIELD_TYPE_SUMMARY);
        this.nullableSummaryAdapter.mo44toJson(writer, (x) value.getSummary());
        writer.w("interactiveActions");
        this.interactiveActionsAdapter.mo44toJson(writer, (x) value.getInteractiveActions());
        writer.w("additionalInfo");
        this.additionalInfoAdapter.mo44toJson(writer, (x) value.getAdditionalInfo());
        writer.w("sticky");
        this.nullableStickyTotalDTOAdapter.mo44toJson(writer, (x) value.getSticky());
        writer.w("progressBar");
        this.nullableProgressBarAdapter.mo44toJson(writer, (x) value.getProgressBar());
        writer.w("showVerticalSeparator");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getShowVerticalSeparator());
        writer.p();
    }
}
