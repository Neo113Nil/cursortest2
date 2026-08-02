package ru.ozon.android.messenger.framework.data.requests.common;

import Ak.b;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.requests.common.ActionSuccessOrFailResponseDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO$SuccessMessageDTO;", "nullableSuccessMessageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO$FailMessageDTO;", "nullableFailMessageDTOAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActionSuccessOrFailResponseDTOJsonAdapter extends JsonAdapter<ActionSuccessOrFailResponseDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ActionSuccessOrFailResponseDTO.FailMessageDTO> nullableFailMessageDTOAdapter;

    @NotNull
    private final JsonAdapter<ActionSuccessOrFailResponseDTO.SuccessMessageDTO> nullableSuccessMessageDTOAdapter;

    @NotNull
    private final n.a options;

    public ActionSuccessOrFailResponseDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("successMessage", "failMessage");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<ActionSuccessOrFailResponseDTO.SuccessMessageDTO> f7 = moshi.f(ActionSuccessOrFailResponseDTO.SuccessMessageDTO.class, m11, "successMessage");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableSuccessMessageDTOAdapter = f7;
        JsonAdapter<ActionSuccessOrFailResponseDTO.FailMessageDTO> f11 = moshi.f(ActionSuccessOrFailResponseDTO.FailMessageDTO.class, m11, "failMessage");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableFailMessageDTOAdapter = f11;
    }

    @NotNull
    public String toString() {
        return b.c(52, "GeneratedJsonAdapter(ActionSuccessOrFailResponseDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ActionSuccessOrFailResponseDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ActionSuccessOrFailResponseDTO.SuccessMessageDTO successMessageDTO = null;
        ActionSuccessOrFailResponseDTO.FailMessageDTO failMessageDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                successMessageDTO = this.nullableSuccessMessageDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                failMessageDTO = this.nullableFailMessageDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new ActionSuccessOrFailResponseDTO(successMessageDTO, failMessageDTO);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ActionSuccessOrFailResponseDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("successMessage");
        this.nullableSuccessMessageDTOAdapter.mo44toJson(writer, (x) value_.getSuccessMessage());
        writer.w("failMessage");
        this.nullableFailMessageDTOAdapter.mo44toJson(writer, (x) value_.getFailMessage());
        writer.p();
    }
}
