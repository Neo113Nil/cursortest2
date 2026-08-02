package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.data.AvatarAchievementsDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AvatarDTO;", "avatarDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$AchievementDTO;", "nullableListOfAchievementDTOAdapter", "nullableStringAdapter", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO$PaddingsDTO;", "nullablePaddingsDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AvatarAchievementsDTOJsonAdapter extends JsonAdapter<AvatarAchievementsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AvatarAchievementsDTO.AvatarDTO> avatarDTOAdapter;

    @NotNull
    private final JsonAdapter<List<AvatarAchievementsDTO.AchievementDTO>> nullableListOfAchievementDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<AvatarAchievementsDTO.PaddingsDTO> nullablePaddingsDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public AvatarAchievementsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("avatar", "achievements", "backgroundColor", "paddings", "tracking");
        M m11 = M.f71699a;
        this.avatarDTOAdapter = moshi.f(AvatarAchievementsDTO.AvatarDTO.class, m11, "avatar");
        this.nullableListOfAchievementDTOAdapter = moshi.f(D.e(List.class, AvatarAchievementsDTO.AchievementDTO.class), m11, "achievements");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullablePaddingsDTOAdapter = moshi.f(AvatarAchievementsDTO.PaddingsDTO.class, m11, "paddings");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "tracking");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(AvatarAchievementsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AvatarAchievementsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AvatarAchievementsDTO.AvatarDTO avatarDTO = null;
        List<AvatarAchievementsDTO.AchievementDTO> list = null;
        String str = null;
        AvatarAchievementsDTO.PaddingsDTO paddingsDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                avatarDTO = this.avatarDTOAdapter.fromJson(reader);
                if (avatarDTO == null) {
                    throw c.q("avatar", "avatar", reader);
                }
            } else if (v11 == 1) {
                list = this.nullableListOfAchievementDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 3) {
                paddingsDTO = this.nullablePaddingsDTOAdapter.fromJson(reader);
            } else if (v11 == 4) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (avatarDTO != null) {
            return new AvatarAchievementsDTO(avatarDTO, list, str, paddingsDTO, map);
        }
        throw c.j("avatar", "avatar", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AvatarAchievementsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("avatar");
        this.avatarDTOAdapter.mo44toJson(writer, (x) value.getAvatar());
        writer.w("achievements");
        this.nullableListOfAchievementDTOAdapter.mo44toJson(writer, (x) value.getAchievements());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("paddings");
        this.nullablePaddingsDTOAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.w("tracking");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTracking());
        writer.p();
    }
}
