package ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.data;

import Ak.b;
import C.o0;
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
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/updateCellSelectionFormMobile/data/SelectionFormCellDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/actionHandlers/ugc/updateCellSelectionFormMobile/data/SelectionFormCellDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/actionHandlers/ugc/updateCellSelectionFormMobile/data/SelectionFormCellDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/actionHandlers/ugc/updateCellSelectionFormMobile/data/SelectionFormCellDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "nullableStringAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectionFormCellDTOJsonAdapter extends JsonAdapter<SelectionFormCellDTO> {

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;
    private volatile Constructor<SelectionFormCellDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SelectionFormCellDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("uploadKey", "cell", "uploadValue", "backgroundColor", "leftPadding", "rightPadding");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "uploadKey");
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "cell");
        this.nullableStringAdapter = moshi.f(String.class, m11, "uploadValue");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "leftPadding");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SelectionFormCellDTO fromJson(@NotNull n reader) {
        CellDTO cellDTO = null;
        Integer a11 = o0.a(reader, "reader", 0);
        Integer num = a11;
        String str = null;
        String str2 = null;
        int i11 = -1;
        String str3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("uploadKey", "uploadKey", reader);
                    }
                    break;
                case 1:
                    cellDTO = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO == null) {
                        throw c.q("cell", "cell", reader);
                    }
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("leftPadding", "leftPadding", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("rightPadding", "rightPadding", reader);
                    }
                    i11 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -49) {
            if (str == null) {
                throw c.j("uploadKey", "uploadKey", reader);
            }
            if (cellDTO != null) {
                return new SelectionFormCellDTO(str, cellDTO, str3, str2, a11.intValue(), num.intValue());
            }
            throw c.j("cell", "cell", reader);
        }
        Constructor<SelectionFormCellDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = SelectionFormCellDTO.class.getDeclaredConstructor(String.class, CellDTO.class, String.class, String.class, cls2, cls2, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j("uploadKey", "uploadKey", reader);
        }
        if (cellDTO == null) {
            throw c.j("cell", "cell", reader);
        }
        String str4 = str2;
        SelectionFormCellDTO newInstance = constructor.newInstance(str, cellDTO, str3, str4, a11, num, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(SelectionFormCellDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SelectionFormCellDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("uploadKey");
        this.stringAdapter.mo44toJson(writer, (x) value.getUploadKey());
        writer.w("cell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getCell());
        writer.w("uploadValue");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getUploadValue());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("leftPadding");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getLeftPadding()));
        writer.w("rightPadding");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getRightPadding()));
        writer.p();
    }
}
