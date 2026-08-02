package retrofit2.converter.gson;

import We.C;
import We.K;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import retrofit2.Converter;
import sf.C9681g;

/* loaded from: classes6.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, K> {
    private static final C MEDIA_TYPE;
    private static final Charset UTF_8;
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    static {
        C.f33536g.getClass();
        MEDIA_TYPE = C.a.a("application/json; charset=UTF-8");
        UTF_8 = Charset.forName("UTF-8");
    }

    GsonRequestBodyConverter(Gson gson, TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ K convert(Object obj) throws IOException {
        return convert((GsonRequestBodyConverter<T>) obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // retrofit2.Converter
    public K convert(T t2) throws IOException {
        C9681g c9681g = new C9681g();
        JsonWriter i11 = this.gson.i(new OutputStreamWriter(c9681g.r(), UTF_8));
        this.adapter.write(i11, t2);
        i11.close();
        return K.create(MEDIA_TYPE, c9681g.v0());
    }
}
