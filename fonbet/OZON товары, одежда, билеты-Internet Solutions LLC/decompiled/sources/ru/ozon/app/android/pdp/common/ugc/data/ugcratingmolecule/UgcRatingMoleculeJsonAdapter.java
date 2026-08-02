package ru.ozon.app.android.pdp.common.ugc.data.ugcratingmolecule;

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
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMoleculeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "ratingDTOAdapter", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "nullableNotificationDTOAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UgcRatingMoleculeJsonAdapter extends JsonAdapter<UgcRatingMolecule> {

    @NotNull
    private final JsonAdapter<NotificationDTO> nullableNotificationDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<RatingDTO> ratingDTOAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public UgcRatingMoleculeJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("sku", "rating", "editErrorNotification");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "sku");
        this.ratingDTOAdapter = moshi.f(RatingDTO.class, m11, "rating");
        this.nullableNotificationDTOAdapter = moshi.f(NotificationDTO.class, m11, "editErrorNotification");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(UgcRatingMolecule)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UgcRatingMolecule fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        RatingDTO ratingDTO = null;
        NotificationDTO notificationDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("sku", "sku", reader);
                }
            } else if (v11 == 1) {
                ratingDTO = this.ratingDTOAdapter.fromJson(reader);
                if (ratingDTO == null) {
                    throw c.q("rating", "rating", reader);
                }
            } else if (v11 == 2) {
                notificationDTO = this.nullableNotificationDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("sku", "sku", reader);
        }
        if (ratingDTO != null) {
            return new UgcRatingMolecule(str, ratingDTO, notificationDTO);
        }
        throw c.j("rating", "rating", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UgcRatingMolecule value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("sku");
        this.stringAdapter.mo44toJson(writer, (x) value.getSku());
        writer.w("rating");
        this.ratingDTOAdapter.mo44toJson(writer, (x) value.getRating());
        writer.w("editErrorNotification");
        this.nullableNotificationDTOAdapter.mo44toJson(writer, (x) value.getEditErrorNotification());
        writer.p();
    }
}
