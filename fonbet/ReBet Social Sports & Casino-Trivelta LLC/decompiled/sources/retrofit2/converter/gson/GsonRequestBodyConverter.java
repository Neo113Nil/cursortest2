package retrofit2.converter.gson;

import Jb.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;
import ti.C6478h;

/* loaded from: classes5.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private final TypeAdapter adapter;
    private final Gson gson;

    public GsonRequestBodyConverter(Gson gson, TypeAdapter typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) {
        return convert((GsonRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t10) {
        C6478h c6478h = new C6478h();
        c t11 = this.gson.t(new OutputStreamWriter(c6478h.U1(), StandardCharsets.UTF_8));
        this.adapter.write(t11, t10);
        t11.close();
        return RequestBody.create(MEDIA_TYPE, c6478h.v1());
    }
}
