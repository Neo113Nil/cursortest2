package m3;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5547a implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Converter f56357a;

    /* renamed from: m3.a$a, reason: collision with other inner class name */
    public static final class C0811a extends Converter.Factory {

        /* renamed from: m3.a$a$a, reason: collision with other inner class name */
        public static final class C0812a implements ParameterizedType {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Type f56358a;

            public C0812a(Type type) {
                this.f56358a = type;
            }

            @Override // java.lang.reflect.ParameterizedType
            public Type[] getActualTypeArguments() {
                return new Type[]{this.f56358a};
            }

            @Override // java.lang.reflect.ParameterizedType
            public Type getOwnerType() {
                return null;
            }

            @Override // java.lang.reflect.ParameterizedType
            public Type getRawType() {
                return b.class;
            }
        }

        @Override // retrofit2.Converter.Factory
        public Converter responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
            Intrinsics.checkParameterIsNotNull(type, "type");
            Intrinsics.checkParameterIsNotNull(annotations, "annotations");
            Intrinsics.checkParameterIsNotNull(retrofit, "retrofit");
            Converter delegate = retrofit.nextResponseBodyConverter(this, new C0812a(type), annotations);
            Intrinsics.checkExpressionValueIsNotNull(delegate, "delegate");
            return new C5547a(delegate);
        }
    }

    /* renamed from: m3.a$b */
    public static class b {
    }

    public C5547a(Converter delegate) {
        Intrinsics.checkParameterIsNotNull(delegate, "delegate");
        this.f56357a = delegate;
    }

    @Override // retrofit2.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object convert(ResponseBody value) {
        Intrinsics.checkParameterIsNotNull(value, "value");
        android.support.v4.media.session.b.a(this.f56357a.convert(value));
        return null;
    }
}
