package retrofit2.converter.moshi;

import We.C;
import We.K;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.q;
import com.squareup.moshi.x;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import sf.C9681g;

/* loaded from: classes6.dex */
final class MoshiRequestBodyConverter<T> implements Converter<T, K> {
    private static final C MEDIA_TYPE;
    private final JsonAdapter<T> adapter;

    static {
        C.f33536g.getClass();
        MEDIA_TYPE = C.a.a("application/json; charset=UTF-8");
    }

    MoshiRequestBodyConverter(JsonAdapter<T> jsonAdapter) {
        this.adapter = jsonAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ K convert(Object obj) throws IOException {
        return convert((MoshiRequestBodyConverter<T>) obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // retrofit2.Converter
    public K convert(T t2) throws IOException {
        C9681g sink = new C9681g();
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.adapter.mo44toJson((x) new q(sink), (q) t2);
        return K.create(MEDIA_TYPE, sink.v0());
    }
}
