package ru.ozon.app.android.returns.creation.widgets.orders.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/orders/data/PaginationDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/widgets/orders/data/PaginationDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/creation/widgets/orders/data/PaginationDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/creation/widgets/orders/data/PaginationDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaginationDTOJsonAdapter extends JsonAdapter<PaginationDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;
    private volatile Constructor<PaginationDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final n.a options;

    public PaginationDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("previous", "next", "scrollKey");
        M m11 = M.f71699a;
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "previous");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "scrollKey");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(PaginationDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PaginationDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ButtonV3DTO buttonV3DTO = null;
        ButtonV3DTO buttonV3DTO2 = null;
        Integer num = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                if (buttonV3DTO == null) {
                    throw c.q("previous", "previous", reader);
                }
            } else if (v11 == 1) {
                buttonV3DTO2 = this.buttonV3DTOAdapter.fromJson(reader);
                if (buttonV3DTO2 == null) {
                    throw c.q("next", "next", reader);
                }
            } else if (v11 == 2) {
                num = this.nullableIntAdapter.fromJson(reader);
                i11 = -5;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            if (buttonV3DTO == null) {
                throw c.j("previous", "previous", reader);
            }
            if (buttonV3DTO2 != null) {
                return new PaginationDTO(buttonV3DTO, buttonV3DTO2, num);
            }
            throw c.j("next", "next", reader);
        }
        Constructor<PaginationDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PaginationDTO.class.getDeclaredConstructor(ButtonV3DTO.class, ButtonV3DTO.class, Integer.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (buttonV3DTO == null) {
            throw c.j("previous", "previous", reader);
        }
        if (buttonV3DTO2 == null) {
            throw c.j("next", "next", reader);
        }
        PaginationDTO newInstance = constructor.newInstance(buttonV3DTO, buttonV3DTO2, num, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PaginationDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("previous");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getPrevious());
        writer.w("next");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getNext());
        writer.w("scrollKey");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getScrollKey());
        writer.p();
    }
}
