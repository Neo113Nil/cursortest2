package ru.ozon.id.nativeauth.sso2;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/id/nativeauth/sso2/Sso2DomainsAuthMobileResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/sso2/Sso2DomainsAuthMobileResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/sso2/Sso2DomainsAuthMobileResponse;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/sso2/Sso2DomainsAuthMobileResponse;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableListOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Sso2DomainsAuthMobileResponseJsonAdapter extends JsonAdapter<Sso2DomainsAuthMobileResponse> {
    private volatile Constructor<Sso2DomainsAuthMobileResponse> constructorRef;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final n.a options;

    public Sso2DomainsAuthMobileResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("authActionsRequiredDomains", "authActionsNonRequiredDomains");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        Y9.b e11 = com.squareup.moshi.D.e(List.class, String.class);
        M m11 = M.f71699a;
        JsonAdapter<List<String>> f7 = moshi.f(e11, m11, "authActionsRequiredDomains");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.listOfStringAdapter = f7;
        JsonAdapter<List<String>> f11 = moshi.f(com.squareup.moshi.D.e(List.class, String.class), m11, "authActionsNonRequiredDomains");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfStringAdapter = f11;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(51, "GeneratedJsonAdapter(Sso2DomainsAuthMobileResponse)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Sso2DomainsAuthMobileResponse fromJson(@NotNull com.squareup.moshi.n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<String> list = null;
        List<String> list2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfStringAdapter.fromJson(reader);
                if (list == null) {
                    throw Y9.c.q("authActionsRequiredDomains", "authActionsRequiredDomains", reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                list2 = this.nullableListOfStringAdapter.fromJson(reader);
                i11 &= -3;
            }
        }
        reader.endObject();
        if (i11 == -4) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new Sso2DomainsAuthMobileResponse(list, list2);
        }
        Constructor<Sso2DomainsAuthMobileResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Sso2DomainsAuthMobileResponse.class.getDeclaredConstructor(List.class, List.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Sso2DomainsAuthMobileResponse newInstance = constructor.newInstance(list, list2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull com.squareup.moshi.x writer, Sso2DomainsAuthMobileResponse value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("authActionsRequiredDomains");
        this.listOfStringAdapter.mo44toJson(writer, (com.squareup.moshi.x) value_.getAuthActionsRequiredDomains());
        writer.w("authActionsNonRequiredDomains");
        this.nullableListOfStringAdapter.mo44toJson(writer, (com.squareup.moshi.x) value_.getAuthActionsNonRequiredDomains());
        writer.p();
    }
}
