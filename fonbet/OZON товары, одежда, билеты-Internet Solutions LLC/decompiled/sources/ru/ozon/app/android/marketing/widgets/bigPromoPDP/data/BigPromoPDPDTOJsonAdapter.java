package ru.ozon.app.android.marketing.widgets.bigPromoPDP.data;

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
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.data.BigPromoPDPDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R(\u0010,\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020+\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019¨\u0006-"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$AnimatedCounterDTO;", "nullableAnimatedCounterDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$TimerBadgeDTO;", "nullableTimerBadgeDTOAdapter", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$PaddingsDTO;", "nullablePaddingsDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BigPromoPDPDTOJsonAdapter extends JsonAdapter<BigPromoPDPDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BigPromoPDPDTO.AnimatedCounterDTO> nullableAnimatedCounterDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<BigPromoPDPDTO.PaddingsDTO> nullablePaddingsDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final JsonAdapter<BigPromoPDPDTO.TimerBadgeDTO> nullableTimerBadgeDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public BigPromoPDPDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("logo", "counter", SelectionItemFormDTO.TITLE_FIELD_NAME, "stockText", "stockNumber", "chevronIcon", "rightButton", "timerBadge", "paddings", "action", "widgetBackgroundColor", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableImageDTOAdapter = moshi.f(ImageDTO.class, m11, "logo");
        this.nullableAnimatedCounterDTOAdapter = moshi.f(BigPromoPDPDTO.AnimatedCounterDTO.class, m11, "counter");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "stockText");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "chevronIcon");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "rightButton");
        this.nullableTimerBadgeDTOAdapter = moshi.f(BigPromoPDPDTO.TimerBadgeDTO.class, m11, "timerBadge");
        this.nullablePaddingsDTOAdapter = moshi.f(BigPromoPDPDTO.PaddingsDTO.class, m11, "paddings");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableStringAdapter = moshi.f(String.class, m11, "widgetBackgroundColor");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(BigPromoPDPDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BigPromoPDPDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ImageDTO imageDTO = null;
        BigPromoPDPDTO.AnimatedCounterDTO animatedCounterDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        IconDTO iconDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        BigPromoPDPDTO.TimerBadgeDTO timerBadgeDTO = null;
        BigPromoPDPDTO.PaddingsDTO paddingsDTO = null;
        AtomActionDTO atomActionDTO = null;
        String str = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    animatedCounterDTO = this.nullableAnimatedCounterDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 7:
                    timerBadgeDTO = this.nullableTimerBadgeDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    paddingsDTO = this.nullablePaddingsDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textDTO != null) {
            return new BigPromoPDPDTO(imageDTO, animatedCounterDTO, textDTO, textDTO2, textDTO3, iconDTO, buttonV3DTO, timerBadgeDTO, paddingsDTO, atomActionDTO, str, map);
        }
        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BigPromoPDPDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("logo");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value.getLogo());
        writer.w("counter");
        this.nullableAnimatedCounterDTOAdapter.mo44toJson(writer, (x) value.getCounter());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("stockText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getStockText());
        writer.w("stockNumber");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getStockNumber());
        writer.w("chevronIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getChevronIcon());
        writer.w("rightButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getRightButton());
        writer.w("timerBadge");
        this.nullableTimerBadgeDTOAdapter.mo44toJson(writer, (x) value.getTimerBadge());
        writer.w("paddings");
        this.nullablePaddingsDTOAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("widgetBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getWidgetBackgroundColor());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
