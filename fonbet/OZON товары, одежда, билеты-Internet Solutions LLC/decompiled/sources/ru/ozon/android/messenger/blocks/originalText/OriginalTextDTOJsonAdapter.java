package ru.ozon.android.messenger.blocks.originalText;

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
import ru.ozon.android.messenger.blocks.originalText.OriginalTextDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R(\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/android/messenger/blocks/originalText/OriginalTextDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/originalText/OriginalTextDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/originalText/OriginalTextDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/originalText/OriginalTextDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/messenger/blocks/originalText/OriginalTextDTO$OriginalTextButtonDTO;", "originalTextButtonDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "nullableMapOfStringStringAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OriginalTextDTOJsonAdapter extends JsonAdapter<OriginalTextDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OriginalTextDTO.OriginalTextButtonDTO> originalTextButtonDTOAdapter;

    public OriginalTextDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("button", "trackingInfo", "lexemes");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<OriginalTextDTO.OriginalTextButtonDTO> f7 = moshi.f(OriginalTextDTO.OriginalTextButtonDTO.class, m11, "button");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.originalTextButtonDTOAdapter = f7;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f11 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f11;
        JsonAdapter<Map<String, String>> f12 = moshi.f(D.e(Map.class, String.class, String.class), m11, "lexemes");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f12;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(37, "GeneratedJsonAdapter(OriginalTextDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OriginalTextDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        OriginalTextDTO.OriginalTextButtonDTO originalTextButtonDTO = null;
        Map<String, MessengerTrackingInfo> map = null;
        Map<String, String> map2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                originalTextButtonDTO = this.originalTextButtonDTOAdapter.fromJson(reader);
                if (originalTextButtonDTO == null) {
                    throw Y9.c.q("button", "button", reader);
                }
            } else if (v11 == 1) {
                map = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
            } else if (v11 == 2) {
                map2 = this.nullableMapOfStringStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (originalTextButtonDTO != null) {
            return new OriginalTextDTO(originalTextButtonDTO, map, map2);
        }
        throw Y9.c.j("button", "button", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OriginalTextDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("button");
        this.originalTextButtonDTOAdapter.mo44toJson(writer, (x) value_.getButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("lexemes");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value_.getLexemes());
        writer.p();
    }
}
