package ru.ozon.app.android.cart.controls.v3.presentation;

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
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO_SelectAllJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO$SelectAll;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO$SelectAll;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO$SelectAll;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/af/AtomAction;", "atomActionAdapter", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "nullableCheckBoxDTOAdapter", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ControlsV3VO_SelectAllJsonAdapter extends JsonAdapter<ControlsV3VO.SelectAll> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomAction> atomActionAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CheckBoxDTO> nullableCheckBoxDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ControlsV3VO_SelectAllJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "isSelected", "action", "checkbox");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isSelected");
        this.atomActionAdapter = moshi.f(AtomAction.class, m11, "action");
        this.nullableCheckBoxDTOAdapter = moshi.f(CheckBoxDTO.class, m11, "checkbox");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(ControlsV3VO.SelectAll)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ControlsV3VO.SelectAll fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        Boolean bool = null;
        AtomAction atomAction = null;
        CheckBoxDTO checkBoxDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                }
            } else if (v11 == 1) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            } else if (v11 == 2) {
                atomAction = this.atomActionAdapter.fromJson(reader);
                if (atomAction == null) {
                    throw c.q("action", "action", reader);
                }
            } else if (v11 == 3) {
                checkBoxDTO = this.nullableCheckBoxDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
        }
        if (atomAction != null) {
            return new ControlsV3VO.SelectAll(str, bool, atomAction, checkBoxDTO);
        }
        throw c.j("action", "action", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ControlsV3VO.SelectAll value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("isSelected");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isSelected());
        writer.w("action");
        this.atomActionAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("checkbox");
        this.nullableCheckBoxDTOAdapter.mo44toJson(writer, (x) value.getCheckbox());
        writer.p();
    }
}
