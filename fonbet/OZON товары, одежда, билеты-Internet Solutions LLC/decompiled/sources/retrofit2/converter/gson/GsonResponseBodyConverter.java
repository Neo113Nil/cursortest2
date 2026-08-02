package retrofit2.converter.gson;

import We.M;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.j;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import retrofit2.Converter;

/* loaded from: classes6.dex */
final class GsonResponseBodyConverter<T> implements Converter<M, T> {
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    GsonResponseBodyConverter(Gson gson, TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.Converter
    public T convert(M m11) throws IOException {
        JsonReader h11 = this.gson.h(m11.charStream());
        try {
            T read = this.adapter.read(h11);
            if (h11.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new j("JSON document was not fully consumed.");
        } finally {
            m11.close();
        }
    }
}
