package retrofit2.converter.gson;

import Jb.a;
import Jb.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes5.dex */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final TypeAdapter adapter;
    private final Gson gson;

    public GsonResponseBodyConverter(Gson gson, TypeAdapter typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) {
        a s10 = this.gson.s(responseBody.charStream());
        try {
            T t10 = (T) this.adapter.read(s10);
            if (s10.Y1() == b.END_DOCUMENT) {
                return t10;
            }
            throw new i("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
