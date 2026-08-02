package retrofit2.converter.protobuf;

import com.google.protobuf.MessageLite;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* loaded from: classes5.dex */
final class ProtoRequestBodyConverter<T extends MessageLite> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/x-protobuf");

    @Override // retrofit2.Converter
    public RequestBody convert(T t10) {
        return RequestBody.create(MEDIA_TYPE, t10.toByteArray());
    }
}
