package ru.ozon.app.android.fresh.chat.widgets.responseActions.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R(\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/responseActions/data/ResponseActionsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/chat/widgets/responseActions/data/ResponseActionsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/chat/widgets/responseActions/data/ResponseActionsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/chat/widgets/responseActions/data/ResponseActionsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableIconButtonV3DTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ResponseActionsDTOJsonAdapter extends JsonAdapter<ResponseActionsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    public ResponseActionsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("likeIconButton", "likeIconButtonTapped", "dislikeIconButton", "dislikeIconButtonTapped", "refreshIconButton", "trackingInfo");
        M m11 = M.f71699a;
        this.iconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "likeIconButton");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "refreshIconButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(ResponseActionsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ResponseActionsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IconButtonV3DTO iconButtonV3DTO = null;
        IconButtonV3DTO iconButtonV3DTO2 = null;
        IconButtonV3DTO iconButtonV3DTO3 = null;
        IconButtonV3DTO iconButtonV3DTO4 = null;
        IconButtonV3DTO iconButtonV3DTO5 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    iconButtonV3DTO = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO == null) {
                        throw c.q("likeIconButton", "likeIconButton", reader);
                    }
                    break;
                case 1:
                    iconButtonV3DTO2 = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO2 == null) {
                        throw c.q("likeIconButtonTapped", "likeIconButtonTapped", reader);
                    }
                    break;
                case 2:
                    iconButtonV3DTO3 = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO3 == null) {
                        throw c.q("dislikeIconButton", "dislikeIconButton", reader);
                    }
                    break;
                case 3:
                    iconButtonV3DTO4 = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO4 == null) {
                        throw c.q("dislikeIconButtonTapped", "dislikeIconButtonTapped", reader);
                    }
                    break;
                case 4:
                    iconButtonV3DTO5 = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (iconButtonV3DTO == null) {
            throw c.j("likeIconButton", "likeIconButton", reader);
        }
        if (iconButtonV3DTO2 == null) {
            throw c.j("likeIconButtonTapped", "likeIconButtonTapped", reader);
        }
        if (iconButtonV3DTO3 == null) {
            throw c.j("dislikeIconButton", "dislikeIconButton", reader);
        }
        if (iconButtonV3DTO4 != null) {
            return new ResponseActionsDTO(iconButtonV3DTO, iconButtonV3DTO2, iconButtonV3DTO3, iconButtonV3DTO4, iconButtonV3DTO5, map);
        }
        throw c.j("dislikeIconButtonTapped", "dislikeIconButtonTapped", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ResponseActionsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("likeIconButton");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getLikeIconButton());
        writer.w("likeIconButtonTapped");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getLikeIconButtonTapped());
        writer.w("dislikeIconButton");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getDislikeIconButton());
        writer.w("dislikeIconButtonTapped");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getDislikeIconButtonTapped());
        writer.w("refreshIconButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getRefreshIconButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
