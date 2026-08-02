package ru.ozon.app.android.travel.molecules.dto.awardBadge;

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
import ru.ozon.app.android.travel.molecules.dto.awardBadge.AwardBadgeDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeIcon;", "awardBadgeIconAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeText;", "nullableAwardBadgeTextAdapter", "stringAdapter", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeSize;", "awardBadgeSizeAdapter", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AwardBadgeDTOJsonAdapter extends JsonAdapter<AwardBadgeDTO> {

    @NotNull
    private final JsonAdapter<AwardBadgeDTO.AwardBadgeIcon> awardBadgeIconAdapter;

    @NotNull
    private final JsonAdapter<AwardBadgeDTO.AwardBadgeSize> awardBadgeSizeAdapter;

    @NotNull
    private final JsonAdapter<AwardBadgeDTO.AwardBadgeText> nullableAwardBadgeTextAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AwardBadgeDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("icon", "text", "backgroundColor", "size");
        M m11 = M.f71699a;
        this.awardBadgeIconAdapter = moshi.f(AwardBadgeDTO.AwardBadgeIcon.class, m11, "icon");
        this.nullableAwardBadgeTextAdapter = moshi.f(AwardBadgeDTO.AwardBadgeText.class, m11, "text");
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.awardBadgeSizeAdapter = moshi.f(AwardBadgeDTO.AwardBadgeSize.class, m11, "size");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(AwardBadgeDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AwardBadgeDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AwardBadgeDTO.AwardBadgeIcon awardBadgeIcon = null;
        AwardBadgeDTO.AwardBadgeText awardBadgeText = null;
        String str = null;
        AwardBadgeDTO.AwardBadgeSize awardBadgeSize = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                awardBadgeIcon = this.awardBadgeIconAdapter.fromJson(reader);
                if (awardBadgeIcon == null) {
                    throw c.q("icon", "icon", reader);
                }
            } else if (v11 == 1) {
                awardBadgeText = this.nullableAwardBadgeTextAdapter.fromJson(reader);
            } else if (v11 == 2) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("backgroundColor", "backgroundColor", reader);
                }
            } else if (v11 == 3 && (awardBadgeSize = this.awardBadgeSizeAdapter.fromJson(reader)) == null) {
                throw c.q("size", "size", reader);
            }
        }
        reader.endObject();
        if (awardBadgeIcon == null) {
            throw c.j("icon", "icon", reader);
        }
        if (str == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        if (awardBadgeSize != null) {
            return new AwardBadgeDTO(awardBadgeIcon, awardBadgeText, str, awardBadgeSize);
        }
        throw c.j("size", "size", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AwardBadgeDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("icon");
        this.awardBadgeIconAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("text");
        this.nullableAwardBadgeTextAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("size");
        this.awardBadgeSizeAdapter.mo44toJson(writer, (x) value.getSize());
        writer.p();
    }
}
