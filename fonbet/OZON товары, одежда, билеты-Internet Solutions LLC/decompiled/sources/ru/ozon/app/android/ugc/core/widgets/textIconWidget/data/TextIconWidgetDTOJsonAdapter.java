package ru.ozon.app.android.ugc.core.widgets.textIconWidget.data;

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
import ru.ozon.app.android.ugc.core.widgets.textIconWidget.data.TextIconWidgetDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$IconPosition;", "nullableIconPositionAdapter", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$Alignment;", "nullableAlignmentAdapter", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO$LayoutPaddings;", "nullableLayoutPaddingsAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextIconWidgetDTOJsonAdapter extends JsonAdapter<TextIconWidgetDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<TextIconWidgetDTO.Alignment> nullableAlignmentAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<TextIconWidgetDTO.IconPosition> nullableIconPositionAdapter;

    @NotNull
    private final JsonAdapter<TextIconWidgetDTO.LayoutPaddings> nullableLayoutPaddingsAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public TextIconWidgetDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("text", "icon", "action", "iconPosition", "alignment", "paddings", "backgroundColor", "tracking");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "text");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "icon");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableIconPositionAdapter = moshi.f(TextIconWidgetDTO.IconPosition.class, m11, "iconPosition");
        this.nullableAlignmentAdapter = moshi.f(TextIconWidgetDTO.Alignment.class, m11, "alignment");
        this.nullableLayoutPaddingsAdapter = moshi.f(TextIconWidgetDTO.LayoutPaddings.class, m11, "paddings");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "tracking");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(TextIconWidgetDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TextIconWidgetDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        IconDTO iconDTO = null;
        AtomActionDTO atomActionDTO = null;
        TextIconWidgetDTO.IconPosition iconPosition = null;
        TextIconWidgetDTO.Alignment alignment = null;
        TextIconWidgetDTO.LayoutPaddings layoutPaddings = null;
        String str = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 1:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    iconPosition = this.nullableIconPositionAdapter.fromJson(reader);
                    break;
                case 4:
                    alignment = this.nullableAlignmentAdapter.fromJson(reader);
                    break;
                case 5:
                    layoutPaddings = this.nullableLayoutPaddingsAdapter.fromJson(reader);
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textDTO != null) {
            return new TextIconWidgetDTO(textDTO, iconDTO, atomActionDTO, iconPosition, alignment, layoutPaddings, str, map);
        }
        throw c.j("text", "text", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TextIconWidgetDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("icon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("iconPosition");
        this.nullableIconPositionAdapter.mo44toJson(writer, (x) value.getIconPosition());
        writer.w("alignment");
        this.nullableAlignmentAdapter.mo44toJson(writer, (x) value.getAlignment());
        writer.w("paddings");
        this.nullableLayoutPaddingsAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("tracking");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTracking());
        writer.p();
    }
}
