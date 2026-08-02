package ru.ozon.app.android.favorites.buttonStack.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.buttonStack.data.ButtonStackDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableListOfIconButtonV3DTOAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO$StackPaddings;", "nullableStackPaddingsAdapter", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ButtonStackDTOJsonAdapter extends JsonAdapter<ButtonStackDTO> {

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<List<IconButtonV3DTO>> nullableListOfIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonStackDTO.StackPaddings> nullableStackPaddingsAdapter;

    @NotNull
    private final n.a options;

    public ButtonStackDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("leftButton", "rightButton", "additionalButtons", "isSticky", "paddings");
        M m11 = M.f71699a;
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "leftButton");
        this.nullableListOfIconButtonV3DTOAdapter = moshi.f(D.e(List.class, IconButtonV3DTO.class), m11, "additionalButtons");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isSticky");
        this.nullableStackPaddingsAdapter = moshi.f(ButtonStackDTO.StackPaddings.class, m11, "paddings");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(ButtonStackDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonStackDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ButtonV3DTO buttonV3DTO = null;
        ButtonV3DTO buttonV3DTO2 = null;
        List<IconButtonV3DTO> list = null;
        Boolean bool = null;
        ButtonStackDTO.StackPaddings stackPaddings = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                buttonV3DTO2 = this.nullableButtonV3DTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                list = this.nullableListOfIconButtonV3DTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            } else if (v11 == 4) {
                stackPaddings = this.nullableStackPaddingsAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new ButtonStackDTO(buttonV3DTO, buttonV3DTO2, list, bool, stackPaddings);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonStackDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getLeftButton());
        writer.w("rightButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getRightButton());
        writer.w("additionalButtons");
        this.nullableListOfIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getAdditionalButtons());
        writer.w("isSticky");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isSticky());
        writer.w("paddings");
        this.nullableStackPaddingsAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.p();
    }
}
