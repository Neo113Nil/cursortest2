package ru.ozon.id.nativeauth.requestPhoneAccess.data;

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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.nativeauth.requestPhoneAccess.data.RequestPhoneAccessDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$TitleDTO;", "titleDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$PermissionDTO;", "nullableListOfPermissionDTOAdapter", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdButtonDTO;", "ozonIdButtonDTOAdapter", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO$OzonIdTextAtomDTO;", "ozonIdTextAtomDTOAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequestPhoneAccessDTOJsonAdapter extends JsonAdapter<RequestPhoneAccessDTO> {

    @NotNull
    private final JsonAdapter<List<RequestPhoneAccessDTO.PermissionDTO>> nullableListOfPermissionDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<RequestPhoneAccessDTO.OzonIdButtonDTO> ozonIdButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<RequestPhoneAccessDTO.OzonIdTextAtomDTO> ozonIdTextAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<RequestPhoneAccessDTO.TitleDTO> titleDTOAdapter;

    public RequestPhoneAccessDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "permissions", "allowButton", "disallowButton", "help");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<RequestPhoneAccessDTO.TitleDTO> f7 = moshi.f(RequestPhoneAccessDTO.TitleDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.titleDTOAdapter = f7;
        JsonAdapter<List<RequestPhoneAccessDTO.PermissionDTO>> f11 = moshi.f(D.e(List.class, RequestPhoneAccessDTO.PermissionDTO.class), m11, "permissions");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfPermissionDTOAdapter = f11;
        JsonAdapter<RequestPhoneAccessDTO.OzonIdButtonDTO> f12 = moshi.f(RequestPhoneAccessDTO.OzonIdButtonDTO.class, m11, "allowButton");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.ozonIdButtonDTOAdapter = f12;
        JsonAdapter<RequestPhoneAccessDTO.OzonIdTextAtomDTO> f13 = moshi.f(RequestPhoneAccessDTO.OzonIdTextAtomDTO.class, m11, "help");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.ozonIdTextAtomDTOAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(RequestPhoneAccessDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RequestPhoneAccessDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        RequestPhoneAccessDTO.TitleDTO titleDTO = null;
        List<RequestPhoneAccessDTO.PermissionDTO> list = null;
        RequestPhoneAccessDTO.OzonIdButtonDTO ozonIdButtonDTO = null;
        RequestPhoneAccessDTO.OzonIdButtonDTO ozonIdButtonDTO2 = null;
        RequestPhoneAccessDTO.OzonIdTextAtomDTO ozonIdTextAtomDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                titleDTO = this.titleDTOAdapter.fromJson(reader);
                if (titleDTO == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                list = this.nullableListOfPermissionDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                ozonIdButtonDTO = this.ozonIdButtonDTOAdapter.fromJson(reader);
                if (ozonIdButtonDTO == null) {
                    throw c.q("allowButton", "allowButton", reader);
                }
            } else if (v11 == 3) {
                ozonIdButtonDTO2 = this.ozonIdButtonDTOAdapter.fromJson(reader);
                if (ozonIdButtonDTO2 == null) {
                    throw c.q("disallowButton", "disallowButton", reader);
                }
            } else if (v11 == 4 && (ozonIdTextAtomDTO = this.ozonIdTextAtomDTOAdapter.fromJson(reader)) == null) {
                throw c.q("help", "help", reader);
            }
        }
        reader.endObject();
        if (titleDTO == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (ozonIdButtonDTO == null) {
            throw c.j("allowButton", "allowButton", reader);
        }
        if (ozonIdButtonDTO2 == null) {
            throw c.j("disallowButton", "disallowButton", reader);
        }
        if (ozonIdTextAtomDTO != null) {
            return new RequestPhoneAccessDTO(titleDTO, list, ozonIdButtonDTO, ozonIdButtonDTO2, ozonIdTextAtomDTO);
        }
        throw c.j("help", "help", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RequestPhoneAccessDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.titleDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("permissions");
        this.nullableListOfPermissionDTOAdapter.mo44toJson(writer, (x) value_.getPermissions());
        writer.w("allowButton");
        this.ozonIdButtonDTOAdapter.mo44toJson(writer, (x) value_.getAllowButton());
        writer.w("disallowButton");
        this.ozonIdButtonDTOAdapter.mo44toJson(writer, (x) value_.getDisallowButton());
        writer.w("help");
        this.ozonIdTextAtomDTOAdapter.mo44toJson(writer, (x) value_.getHelp());
        writer.p();
    }
}
