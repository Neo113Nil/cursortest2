package ru.ozon.app.android.fresh.chat.widgets.promptStatus.data;

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
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptStatus/data/PromptStatusDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/data/PromptStatusDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/chat/widgets/promptStatus/data/PromptStatusDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/chat/widgets/promptStatus/data/PromptStatusDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "listOfTextDTOAdapter", "", "longAdapter", "nullableIconDTOAdapter", "textDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromptStatusDTOJsonAdapter extends JsonAdapter<PromptStatusDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TextDTO>> listOfTextDTOAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public PromptStatusDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("loadingIcon", "loadingTitles", "textSwitchingTime", "errorIcon", "errorTitle", "refreshButton", "checkStatusAction", "trackingInfo");
        M m11 = M.f71699a;
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "loadingIcon");
        this.listOfTextDTOAdapter = moshi.f(D.e(List.class, TextDTO.class), m11, "loadingTitles");
        this.longAdapter = moshi.f(Long.TYPE, m11, "textSwitchingTime");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "errorIcon");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "errorTitle");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "refreshButton");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "checkStatusAction");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(PromptStatusDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PromptStatusDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        IconDTO iconDTO = null;
        List<TextDTO> list = null;
        IconDTO iconDTO2 = null;
        TextDTO textDTO = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("loadingIcon", "loadingIcon", reader);
                    }
                    break;
                case 1:
                    list = this.listOfTextDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("loadingTitles", "loadingTitles", reader);
                    }
                    break;
                case 2:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("textSwitchingTime", "textSwitchingTime", reader);
                    }
                    break;
                case 3:
                    iconDTO2 = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("errorTitle", "errorTitle", reader);
                    }
                    break;
                case 5:
                    iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 6:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (iconDTO == null) {
            throw c.j("loadingIcon", "loadingIcon", reader);
        }
        if (list == null) {
            throw c.j("loadingTitles", "loadingTitles", reader);
        }
        if (l11 == null) {
            throw c.j("textSwitchingTime", "textSwitchingTime", reader);
        }
        long longValue = l11.longValue();
        if (textDTO != null) {
            return new PromptStatusDTO(iconDTO, list, longValue, iconDTO2, textDTO, iconButtonV3DTO, atomActionDTO, map);
        }
        throw c.j("errorTitle", "errorTitle", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PromptStatusDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("loadingIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getLoadingIcon());
        writer.w("loadingTitles");
        this.listOfTextDTOAdapter.mo44toJson(writer, (x) value.getLoadingTitles());
        writer.w("textSwitchingTime");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getTextSwitchingTime()));
        writer.w("errorIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getErrorIcon());
        writer.w("errorTitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getErrorTitle());
        writer.w("refreshButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getRefreshButton());
        writer.w("checkStatusAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getCheckStatusAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
