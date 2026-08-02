package ru.ozon.app.android.deliveryreview.deliveryReviewForm.data;

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
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.DeliveryReviewFormDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO_FormJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Annotations;", "nullableAnnotationsAdapter", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO$Form$Group;", "nullableListOfGroupAdapter", "nullableGroupAdapter", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryReviewFormDTO_FormJsonAdapter extends JsonAdapter<DeliveryReviewFormDTO.Form> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<DeliveryReviewFormDTO.Form.Annotations> nullableAnnotationsAdapter;

    @NotNull
    private final JsonAdapter<DeliveryReviewFormDTO.Form.Group> nullableGroupAdapter;

    @NotNull
    private final JsonAdapter<List<DeliveryReviewFormDTO.Form.Group>> nullableListOfGroupAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public DeliveryReviewFormDTO_FormJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("ratingTitle", "required", "annotations", "groups", "trailingGroup");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "ratingTitle");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "required");
        this.nullableAnnotationsAdapter = moshi.f(DeliveryReviewFormDTO.Form.Annotations.class, m11, "annotations");
        this.nullableListOfGroupAdapter = moshi.f(D.e(List.class, DeliveryReviewFormDTO.Form.Group.class), m11, "groups");
        this.nullableGroupAdapter = moshi.f(DeliveryReviewFormDTO.Form.Group.class, m11, "trailingGroup");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(DeliveryReviewFormDTO.Form)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DeliveryReviewFormDTO.Form fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        DeliveryReviewFormDTO.Form.Annotations annotations = null;
        List<DeliveryReviewFormDTO.Form.Group> list = null;
        DeliveryReviewFormDTO.Form.Group group = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 1) {
                bool = this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw c.q("required", "required", reader);
                }
            } else if (v11 == 2) {
                annotations = this.nullableAnnotationsAdapter.fromJson(reader);
            } else if (v11 == 3) {
                list = this.nullableListOfGroupAdapter.fromJson(reader);
            } else if (v11 == 4) {
                group = this.nullableGroupAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (bool != null) {
            return new DeliveryReviewFormDTO.Form(str, bool.booleanValue(), annotations, list, group);
        }
        throw c.j("required", "required", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DeliveryReviewFormDTO.Form value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("ratingTitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getRatingTitle());
        writer.w("required");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getRequired()));
        writer.w("annotations");
        this.nullableAnnotationsAdapter.mo44toJson(writer, (x) value.getAnnotations());
        writer.w("groups");
        this.nullableListOfGroupAdapter.mo44toJson(writer, (x) value.getGroups());
        writer.w("trailingGroup");
        this.nullableGroupAdapter.mo44toJson(writer, (x) value.getTrailingGroup());
        writer.p();
    }
}
