package ru.ozon.id.nativeauth.data.models;

import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/id/nativeauth/data/models/PkceAuthParamEntryActionDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/PkceAuthParamEntryActionDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/data/models/PkceAuthParamEntryActionDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/data/models/PkceAuthParamEntryActionDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PkceAuthParamEntryActionDTOJsonAdapter extends JsonAdapter<PkceAuthParamEntryActionDTO> {

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public PkceAuthParamEntryActionDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("codeVerifier", "codeChallenge", "codeChallengeMethod", "state", "scopes", "clientId");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<String> f7 = moshi.f(String.class, M.f71699a, "codeVerifier");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(49, "GeneratedJsonAdapter(PkceAuthParamEntryActionDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PkceAuthParamEntryActionDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("codeVerifier", "codeVerifier", reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("codeChallenge", "codeChallenge", reader);
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("codeChallengeMethod", "codeChallengeMethod", reader);
                    }
                    break;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("state", "state", reader);
                    }
                    break;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("scopes", "scopes", reader);
                    }
                    break;
                case 5:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("clientId", "clientId", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("codeVerifier", "codeVerifier", reader);
        }
        if (str2 == null) {
            throw c.j("codeChallenge", "codeChallenge", reader);
        }
        if (str3 == null) {
            throw c.j("codeChallengeMethod", "codeChallengeMethod", reader);
        }
        if (str4 == null) {
            throw c.j("state", "state", reader);
        }
        if (str5 == null) {
            throw c.j("scopes", "scopes", reader);
        }
        if (str6 != null) {
            return new PkceAuthParamEntryActionDTO(str, str2, str3, str4, str5, str6);
        }
        throw c.j("clientId", "clientId", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PkceAuthParamEntryActionDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("codeVerifier");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCodeVerifier());
        writer.w("codeChallenge");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCodeChallenge());
        writer.w("codeChallengeMethod");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCodeChallengeMethod());
        writer.w("state");
        this.stringAdapter.mo44toJson(writer, (x) value_.getState());
        writer.w("scopes");
        this.stringAdapter.mo44toJson(writer, (x) value_.getScopes());
        writer.w("clientId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getClientId());
        writer.p();
    }
}
