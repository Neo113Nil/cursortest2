package ru.ozon.app.android.widgets.designSystemAtoms.data;

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
import ru.ozon.app.android.widgets.designSystemAtoms.data.DesignSystemAtomsDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO_TestOnlyTextAreaDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$TestOnlyTextAreaDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$TestOnlyTextAreaDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$TestOnlyTextAreaDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Type;", "nullableTypeAdapter", "", "nullableIntAdapter", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$State;", "nullableStateAdapter", "Lru/ozon/app/android/widgets/designSystemAtoms/data/DesignSystemAtomsDTO$Status;", "nullableStatusAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DesignSystemAtomsDTO_TestOnlyTextAreaDTOJsonAdapter extends JsonAdapter<DesignSystemAtomsDTO.TestOnlyTextAreaDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<DesignSystemAtomsDTO.State> nullableStateAdapter;

    @NotNull
    private final JsonAdapter<DesignSystemAtomsDTO.Status> nullableStatusAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<DesignSystemAtomsDTO.Type> nullableTypeAdapter;

    @NotNull
    private final n.a options;

    public DesignSystemAtomsDTO_TestOnlyTextAreaDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("label", AppMeasurementSdk.ConditionalUserProperty.VALUE, "caption", "textAreaType", "rows", "state", "status", "hasScrollBar", "infoAction", "hasBottomBar", "hasCounter", "maxCounter", "currentCounterColor", "captionColor", "isCaptionTagSupported", "captionNumberOfLines", "isDeleteAllButtonAllowed", "context");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "label");
        this.nullableTypeAdapter = moshi.f(DesignSystemAtomsDTO.Type.class, m11, "textAreaType");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "rows");
        this.nullableStateAdapter = moshi.f(DesignSystemAtomsDTO.State.class, m11, "state");
        this.nullableStatusAdapter = moshi.f(DesignSystemAtomsDTO.Status.class, m11, "status");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "hasScrollBar");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "infoAction");
    }

    @NotNull
    public String toString() {
        return b.c(62, "GeneratedJsonAdapter(DesignSystemAtomsDTO.TestOnlyTextAreaDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DesignSystemAtomsDTO.TestOnlyTextAreaDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        DesignSystemAtomsDTO.Type type = null;
        Integer num = null;
        DesignSystemAtomsDTO.State state = null;
        DesignSystemAtomsDTO.Status status = null;
        Boolean bool = null;
        CommonControlSettings commonControlSettings = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num2 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool4 = null;
        Integer num3 = null;
        Boolean bool5 = null;
        String str6 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    type = this.nullableTypeAdapter.fromJson(reader);
                    break;
                case 4:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 5:
                    state = this.nullableStateAdapter.fromJson(reader);
                    break;
                case 6:
                    status = this.nullableStatusAdapter.fromJson(reader);
                    break;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 9:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 10:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 11:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 12:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 13:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 14:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 15:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 16:
                    bool5 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 17:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new DesignSystemAtomsDTO.TestOnlyTextAreaDTO(str, str2, str3, type, num, state, status, bool, commonControlSettings, bool2, bool3, num2, str4, str5, bool4, num3, bool5, str6);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DesignSystemAtomsDTO.TestOnlyTextAreaDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("label");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLabel());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getValue());
        writer.w("caption");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCaption());
        writer.w("textAreaType");
        this.nullableTypeAdapter.mo44toJson(writer, (x) value.getTextAreaType());
        writer.w("rows");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getRows());
        writer.w("state");
        this.nullableStateAdapter.mo44toJson(writer, (x) value.getState());
        writer.w("status");
        this.nullableStatusAdapter.mo44toJson(writer, (x) value.getStatus());
        writer.w("hasScrollBar");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasScrollBar());
        writer.w("infoAction");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getInfoAction());
        writer.w("hasBottomBar");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasBottomBar());
        writer.w("hasCounter");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasCounter());
        writer.w("maxCounter");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxCounter());
        writer.w("currentCounterColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCurrentCounterColor());
        writer.w("captionColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCaptionColor());
        writer.w("isCaptionTagSupported");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isCaptionTagSupported());
        writer.w("captionNumberOfLines");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getCaptionNumberOfLines());
        writer.w("isDeleteAllButtonAllowed");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isDeleteAllButtonAllowed());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getContext());
        writer.p();
    }
}
