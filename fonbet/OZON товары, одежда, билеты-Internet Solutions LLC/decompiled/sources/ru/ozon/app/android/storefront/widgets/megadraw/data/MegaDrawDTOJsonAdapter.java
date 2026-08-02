package ru.ozon.app.android.storefront.widgets.megadraw.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megadraw/data/MegaDrawDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/megadraw/data/MegaDrawDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/widgets/megadraw/data/MegaDrawDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/widgets/megadraw/data/MegaDrawDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "nullableHeaderDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "Lru/ozon/app/android/storefront/widgets/megadraw/data/CountBlockDTO;", "countBlockDTOAdapter", "Lru/ozon/app/android/storefront/widgets/megadraw/data/PrizesBlockDTO;", "prizesBlockDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MegaDrawDTOJsonAdapter extends JsonAdapter<MegaDrawDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;
    private volatile Constructor<MegaDrawDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CountBlockDTO> countBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<HeaderDTO> nullableHeaderDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PrizesBlockDTO> prizesBlockDTOAdapter;

    public MegaDrawDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "action", "countBlock", "prizesBlock", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableHeaderDTOAdapter = moshi.f(HeaderDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.countBlockDTOAdapter = moshi.f(CountBlockDTO.class, m11, "countBlock");
        this.prizesBlockDTOAdapter = moshi.f(PrizesBlockDTO.class, m11, "prizesBlock");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(MegaDrawDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MegaDrawDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        HeaderDTO headerDTO = null;
        AtomActionDTO atomActionDTO = null;
        CountBlockDTO countBlockDTO = null;
        PrizesBlockDTO prizesBlockDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                headerDTO = this.nullableHeaderDTOAdapter.fromJson(reader);
                i11 = -2;
            } else if (v11 == 1) {
                atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                if (atomActionDTO == null) {
                    throw c.q("action", "action", reader);
                }
            } else if (v11 == 2) {
                countBlockDTO = this.countBlockDTOAdapter.fromJson(reader);
                if (countBlockDTO == null) {
                    throw c.q("countBlock", "countBlock", reader);
                }
            } else if (v11 == 3) {
                prizesBlockDTO = this.prizesBlockDTOAdapter.fromJson(reader);
                if (prizesBlockDTO == null) {
                    throw c.q("prizesBlock", "prizesBlock", reader);
                }
            } else if (v11 == 4) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -2) {
            Map<String, TokenizedTrackingInfo> map2 = map;
            PrizesBlockDTO prizesBlockDTO2 = prizesBlockDTO;
            CountBlockDTO countBlockDTO2 = countBlockDTO;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            HeaderDTO headerDTO2 = headerDTO;
            if (atomActionDTO2 == null) {
                throw c.j("action", "action", reader);
            }
            if (countBlockDTO2 == null) {
                throw c.j("countBlock", "countBlock", reader);
            }
            if (prizesBlockDTO2 != null) {
                return new MegaDrawDTO(headerDTO2, atomActionDTO2, countBlockDTO2, prizesBlockDTO2, map2);
            }
            throw c.j("prizesBlock", "prizesBlock", reader);
        }
        Map<String, TokenizedTrackingInfo> map3 = map;
        PrizesBlockDTO prizesBlockDTO3 = prizesBlockDTO;
        CountBlockDTO countBlockDTO3 = countBlockDTO;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        HeaderDTO headerDTO3 = headerDTO;
        Constructor<MegaDrawDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MegaDrawDTO.class.getDeclaredConstructor(HeaderDTO.class, AtomActionDTO.class, CountBlockDTO.class, PrizesBlockDTO.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (atomActionDTO3 == null) {
            throw c.j("action", "action", reader);
        }
        if (countBlockDTO3 == null) {
            throw c.j("countBlock", "countBlock", reader);
        }
        if (prizesBlockDTO3 == null) {
            throw c.j("prizesBlock", "prizesBlock", reader);
        }
        MegaDrawDTO newInstance = constructor.newInstance(headerDTO3, atomActionDTO3, countBlockDTO3, prizesBlockDTO3, map3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MegaDrawDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableHeaderDTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("action");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("countBlock");
        this.countBlockDTOAdapter.mo44toJson(writer, (x) value.getCountBlock());
        writer.w("prizesBlock");
        this.prizesBlockDTOAdapter.mo44toJson(writer, (x) value.getPrizesBlock());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
