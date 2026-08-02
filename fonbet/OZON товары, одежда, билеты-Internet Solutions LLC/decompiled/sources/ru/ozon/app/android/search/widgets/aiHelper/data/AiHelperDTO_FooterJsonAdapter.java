package ru.ozon.app.android.search.widgets.aiHelper.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.aiHelper.data.AiHelperDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO_FooterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Footer;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Footer;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Footer;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AiHelperDTO_FooterJsonAdapter extends JsonAdapter<AiHelperDTO.Footer> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final n.a options;

    public AiHelperDTO_FooterJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("likeButton", "dislikeButton", "restartButton", "infoButton");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, M.f71699a, "likeButton");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(AiHelperDTO.Footer)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AiHelperDTO.Footer fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IconButtonV3DTO iconButtonV3DTO = null;
        IconButtonV3DTO iconButtonV3DTO2 = null;
        IconButtonV3DTO iconButtonV3DTO3 = null;
        IconButtonV3DTO iconButtonV3DTO4 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                iconButtonV3DTO2 = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                iconButtonV3DTO3 = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                iconButtonV3DTO4 = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new AiHelperDTO.Footer(iconButtonV3DTO, iconButtonV3DTO2, iconButtonV3DTO3, iconButtonV3DTO4);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AiHelperDTO.Footer value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("likeButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getLikeButton());
        writer.w("dislikeButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getDislikeButton());
        writer.w("restartButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getRestartButton());
        writer.w("infoButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getInfoButton());
        writer.p();
    }
}
