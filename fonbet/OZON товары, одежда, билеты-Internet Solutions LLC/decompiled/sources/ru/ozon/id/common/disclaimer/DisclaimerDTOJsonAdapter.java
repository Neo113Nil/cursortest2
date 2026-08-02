package ru.ozon.id.common.disclaimer;

import Ak.b;
import Y9.c;
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
import ru.ozon.id.common.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/id/common/disclaimer/DisclaimerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/common/disclaimer/DisclaimerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/common/disclaimer/DisclaimerDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/common/disclaimer/DisclaimerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/id/common/disclaimer/DisclaimerDTO$DisclaimerBodyDTO;", "disclaimerBodyDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "nullableStringAdapter", "", "Lru/ozon/id/common/disclaimer/DisclaimerDTO$DisclaimerButtonDTO;", "nullableListOfDisclaimerButtonDTOAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisclaimerDTOJsonAdapter extends JsonAdapter<DisclaimerDTO> {

    @NotNull
    private final JsonAdapter<DisclaimerDTO.DisclaimerBodyDTO> disclaimerBodyDTOAdapter;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<List<DisclaimerDTO.DisclaimerButtonDTO>> nullableListOfDisclaimerButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public DisclaimerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("body", "icon", "backgroundColor", "buttons");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<DisclaimerDTO.DisclaimerBodyDTO> f7 = moshi.f(DisclaimerDTO.DisclaimerBodyDTO.class, m11, "body");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.disclaimerBodyDTOAdapter = f7;
        JsonAdapter<Icon> f11 = moshi.f(Icon.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableIconAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<List<DisclaimerDTO.DisclaimerButtonDTO>> f13 = moshi.f(D.e(List.class, DisclaimerDTO.DisclaimerButtonDTO.class), m11, "buttons");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfDisclaimerButtonDTOAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(DisclaimerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DisclaimerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        DisclaimerDTO.DisclaimerBodyDTO disclaimerBodyDTO = null;
        Icon icon = null;
        String str = null;
        List<DisclaimerDTO.DisclaimerButtonDTO> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                disclaimerBodyDTO = this.disclaimerBodyDTOAdapter.fromJson(reader);
                if (disclaimerBodyDTO == null) {
                    throw c.q("body", "body", reader);
                }
            } else if (v11 == 1) {
                icon = this.nullableIconAdapter.fromJson(reader);
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 3) {
                list = this.nullableListOfDisclaimerButtonDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (disclaimerBodyDTO != null) {
            return new DisclaimerDTO(disclaimerBodyDTO, icon, str, list);
        }
        throw c.j("body", "body", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DisclaimerDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("body");
        this.disclaimerBodyDTOAdapter.mo44toJson(writer, (x) value_.getBody());
        writer.w("icon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("buttons");
        this.nullableListOfDisclaimerButtonDTOAdapter.mo44toJson(writer, (x) value_.getButtons());
        writer.p();
    }
}
