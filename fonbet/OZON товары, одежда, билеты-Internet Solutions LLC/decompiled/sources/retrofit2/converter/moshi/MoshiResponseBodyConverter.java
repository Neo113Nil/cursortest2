package retrofit2.converter.moshi;

import We.M;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.k;
import com.squareup.moshi.n;
import com.squareup.moshi.p;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import sf.C9684j;
import sf.InterfaceC9683i;

/* loaded from: classes6.dex */
final class MoshiResponseBodyConverter<T> implements Converter<M, T> {
    private static final C9684j UTF8_BOM;
    private final JsonAdapter<T> adapter;

    static {
        C9684j c9684j = C9684j.f98719d;
        UTF8_BOM = C9684j.a.b("EFBBBF");
    }

    MoshiResponseBodyConverter(JsonAdapter<T> jsonAdapter) {
        this.adapter = jsonAdapter;
    }

    @Override // retrofit2.Converter
    public T convert(M m11) throws IOException {
        InterfaceC9683i source = m11.source();
        try {
            if (source.w1(0L, UTF8_BOM)) {
                source.skip(r1.g());
            }
            Intrinsics.checkNotNullParameter(source, "source");
            p pVar = new p(source);
            T fromJson = this.adapter.fromJson(pVar);
            if (pVar.p() != n.b.END_DOCUMENT) {
                throw new k("JSON document was not fully consumed.");
            }
            m11.close();
            return fromJson;
        } catch (Throwable th2) {
            m11.close();
            throw th2;
        }
    }
}
