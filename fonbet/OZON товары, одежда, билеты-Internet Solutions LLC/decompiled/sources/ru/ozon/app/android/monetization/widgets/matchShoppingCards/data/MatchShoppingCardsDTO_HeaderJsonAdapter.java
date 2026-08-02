package ru.ozon.app.android.monetization.widgets.matchShoppingCards.data;

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
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.data.MatchShoppingCardsDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO_HeaderJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Header;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Header;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Header;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "iconButtonV3DTOAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MatchShoppingCardsDTO_HeaderJsonAdapter extends JsonAdapter<MatchShoppingCardsDTO.Header> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BadgeDTO> badgeDTOAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public MatchShoppingCardsDTO_HeaderJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("badge", "deferredBadge", "leftIcon", "rightIcon", "testInfo");
        M m11 = M.f71699a;
        this.badgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "deferredBadge");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "leftIcon");
        this.iconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "rightIcon");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(MatchShoppingCardsDTO.Header)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MatchShoppingCardsDTO.Header fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        BadgeDTO badgeDTO = null;
        Boolean bool = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        IconButtonV3DTO iconButtonV3DTO2 = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                badgeDTO = this.badgeDTOAdapter.fromJson(reader);
                if (badgeDTO == null) {
                    throw c.q("badge", "badge", reader);
                }
            } else if (v11 == 1) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            } else if (v11 == 2) {
                iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                iconButtonV3DTO2 = this.iconButtonV3DTOAdapter.fromJson(reader);
                if (iconButtonV3DTO2 == null) {
                    throw c.q("rightIcon", "rightIcon", reader);
                }
            } else if (v11 == 4) {
                testInfo = this.nullableTestInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (badgeDTO == null) {
            throw c.j("badge", "badge", reader);
        }
        if (iconButtonV3DTO2 != null) {
            return new MatchShoppingCardsDTO.Header(badgeDTO, bool, iconButtonV3DTO, iconButtonV3DTO2, testInfo);
        }
        throw c.j("rightIcon", "rightIcon", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MatchShoppingCardsDTO.Header value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badge");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("deferredBadge");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getDeferredBadge());
        writer.w("leftIcon");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getLeftIcon());
        writer.w("rightIcon");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getRightIcon());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.p();
    }
}
