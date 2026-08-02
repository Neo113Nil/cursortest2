package retrofit2.converter.scalars;

import We.C;
import We.K;
import java.io.IOException;
import retrofit2.Converter;

/* loaded from: classes10.dex */
final class ScalarRequestBodyConverter<T> implements Converter<T, K> {
    static final ScalarRequestBodyConverter<Object> INSTANCE = new ScalarRequestBodyConverter<>();
    private static final C MEDIA_TYPE;

    static {
        C.f33536g.getClass();
        MEDIA_TYPE = C.a.a("text/plain; charset=UTF-8");
    }

    private ScalarRequestBodyConverter() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ K convert(Object obj) throws IOException {
        return convert((ScalarRequestBodyConverter<T>) obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // retrofit2.Converter
    public K convert(T t2) throws IOException {
        return K.create(MEDIA_TYPE, String.valueOf(t2));
    }
}
