package retrofit2.converter.protobuf;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class ProtoConverterFactory extends Converter.Factory {
    private final ExtensionRegistryLite registry;

    private ProtoConverterFactory(ExtensionRegistryLite extensionRegistryLite) {
        this.registry = extensionRegistryLite;
    }

    public static ProtoConverterFactory create() {
        return new ProtoConverterFactory(null);
    }

    public static ProtoConverterFactory createWithRegistry(ExtensionRegistryLite extensionRegistryLite) {
        return new ProtoConverterFactory(extensionRegistryLite);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if ((type instanceof Class) && MessageLite.class.isAssignableFrom((Class) type)) {
            return new ProtoRequestBodyConverter();
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Parser parser;
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!MessageLite.class.isAssignableFrom(cls)) {
            return null;
        }
        try {
            try {
                parser = (Parser) cls.getDeclaredMethod("parser", null).invoke(null, null);
            } catch (IllegalAccessException | NoSuchFieldException e10) {
                throw new IllegalArgumentException("Found a protobuf message but " + cls.getName() + " had no parser() method or PARSER field.", e10);
            }
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            parser = (Parser) cls.getDeclaredField("PARSER").get(null);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11.getCause());
        }
        return new ProtoResponseBodyConverter(parser, this.registry);
    }
}
