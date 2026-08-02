package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.data;

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
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.data.DeliveryWidgetV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO_StateDTO_OzonDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO$OzonDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO$OzonDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$StateDTO$OzonDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$MethodDTO;", "methodDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2DTO$ProgressDTO;", "progressDTOAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "iconAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV2DTO_StateDTO_OzonDTOJsonAdapter extends JsonAdapter<DeliveryWidgetV2DTO.StateDTO.OzonDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Icon> iconAdapter;

    @NotNull
    private final JsonAdapter<DeliveryWidgetV2DTO.MethodDTO> methodDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<DeliveryWidgetV2DTO.ProgressDTO> progressDTOAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public DeliveryWidgetV2DTO_StateDTO_OzonDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("method", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "progress", "statusIcon", "statusIconColor", "statusCircleColor", "infoIcon", "onWidgetClickAction");
        M m11 = M.f71699a;
        this.methodDTOAdapter = moshi.f(DeliveryWidgetV2DTO.MethodDTO.class, m11, "method");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.progressDTOAdapter = moshi.f(DeliveryWidgetV2DTO.ProgressDTO.class, m11, "progress");
        this.stringAdapter = moshi.f(String.class, m11, "statusIcon");
        this.iconAdapter = moshi.f(Icon.class, m11, "infoIcon");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "onWidgetClickAction");
    }

    @NotNull
    public String toString() {
        return b.c(58, "GeneratedJsonAdapter(DeliveryWidgetV2DTO.StateDTO.OzonDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DeliveryWidgetV2DTO.StateDTO.OzonDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        DeliveryWidgetV2DTO.MethodDTO methodDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        DeliveryWidgetV2DTO.ProgressDTO progressDTO = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Icon icon = null;
        AtomActionDTO atomActionDTO = null;
        while (true) {
            DeliveryWidgetV2DTO.MethodDTO methodDTO2 = methodDTO;
            TextDTO textDTO3 = textDTO;
            TextDTO textDTO4 = textDTO2;
            DeliveryWidgetV2DTO.ProgressDTO progressDTO2 = progressDTO;
            if (!reader.hasNext()) {
                String str4 = str;
                reader.endObject();
                if (methodDTO2 == null) {
                    throw c.j("method", "method", reader);
                }
                if (textDTO3 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (textDTO4 == null) {
                    throw c.j("subtitle", "subtitle", reader);
                }
                if (progressDTO2 == null) {
                    throw c.j("progress", "progress", reader);
                }
                if (str4 == null) {
                    throw c.j("statusIcon", "statusIcon", reader);
                }
                if (str2 == null) {
                    throw c.j("statusIconColor", "statusIconColor", reader);
                }
                if (str3 == null) {
                    throw c.j("statusCircleColor", "statusCircleColor", reader);
                }
                if (icon == null) {
                    throw c.j("infoIcon", "infoIcon", reader);
                }
                if (atomActionDTO != null) {
                    return new DeliveryWidgetV2DTO.StateDTO.OzonDTO(methodDTO2, textDTO3, textDTO4, progressDTO2, str4, str2, str3, icon, atomActionDTO);
                }
                throw c.j("onWidgetClickAction", "onWidgetClickAction", reader);
            }
            String str5 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str = str5;
                    methodDTO = methodDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    progressDTO = progressDTO2;
                case 0:
                    methodDTO = this.methodDTOAdapter.fromJson(reader);
                    if (methodDTO == null) {
                        throw c.q("method", "method", reader);
                    }
                    str = str5;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    progressDTO = progressDTO2;
                case 1:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    str = str5;
                    methodDTO = methodDTO2;
                    textDTO2 = textDTO4;
                    progressDTO = progressDTO2;
                case 2:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    str = str5;
                    methodDTO = methodDTO2;
                    textDTO = textDTO3;
                    progressDTO = progressDTO2;
                case 3:
                    progressDTO = this.progressDTOAdapter.fromJson(reader);
                    if (progressDTO == null) {
                        throw c.q("progress", "progress", reader);
                    }
                    str = str5;
                    methodDTO = methodDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                case 4:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("statusIcon", "statusIcon", reader);
                    }
                    methodDTO = methodDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    progressDTO = progressDTO2;
                case 5:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("statusIconColor", "statusIconColor", reader);
                    }
                    str = str5;
                    methodDTO = methodDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    progressDTO = progressDTO2;
                case 6:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("statusCircleColor", "statusCircleColor", reader);
                    }
                    str = str5;
                    methodDTO = methodDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    progressDTO = progressDTO2;
                case 7:
                    icon = this.iconAdapter.fromJson(reader);
                    if (icon == null) {
                        throw c.q("infoIcon", "infoIcon", reader);
                    }
                    str = str5;
                    methodDTO = methodDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    progressDTO = progressDTO2;
                case 8:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("onWidgetClickAction", "onWidgetClickAction", reader);
                    }
                    str = str5;
                    methodDTO = methodDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    progressDTO = progressDTO2;
                default:
                    str = str5;
                    methodDTO = methodDTO2;
                    textDTO = textDTO3;
                    textDTO2 = textDTO4;
                    progressDTO = progressDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DeliveryWidgetV2DTO.StateDTO.OzonDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("method");
        this.methodDTOAdapter.mo44toJson(writer, (x) value.getMethod());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("progress");
        this.progressDTOAdapter.mo44toJson(writer, (x) value.getProgress());
        writer.w("statusIcon");
        this.stringAdapter.mo44toJson(writer, (x) value.getStatusIcon());
        writer.w("statusIconColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getStatusIconColor());
        writer.w("statusCircleColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getStatusCircleColor());
        writer.w("infoIcon");
        this.iconAdapter.mo44toJson(writer, (x) value.getInfoIcon());
        writer.w("onWidgetClickAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getOnWidgetClickAction());
        writer.p();
    }
}
