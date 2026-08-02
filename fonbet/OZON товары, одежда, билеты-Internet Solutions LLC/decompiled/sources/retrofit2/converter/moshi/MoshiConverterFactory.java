package retrofit2.converter.moshi;

import We.K;
import We.M;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.m;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes6.dex */
public final class MoshiConverterFactory extends Converter.Factory {
    private final boolean failOnUnknown;
    private final boolean lenient;
    private final Moshi moshi;
    private final boolean serializeNulls;

    private MoshiConverterFactory(Moshi moshi, boolean z11, boolean z12, boolean z13) {
        this.moshi = moshi;
        this.lenient = z11;
        this.failOnUnknown = z12;
        this.serializeNulls = z13;
    }

    public static MoshiConverterFactory create() {
        return create(new Moshi(new Moshi.a()));
    }

    private static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(m.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    public MoshiConverterFactory asLenient() {
        return new MoshiConverterFactory(this.moshi, true, this.failOnUnknown, this.serializeNulls);
    }

    public MoshiConverterFactory failOnUnknown() {
        return new MoshiConverterFactory(this.moshi, this.lenient, true, this.serializeNulls);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, K> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        JsonAdapter e11 = this.moshi.e(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            e11 = e11.lenient();
        }
        if (this.failOnUnknown) {
            e11 = e11.failOnUnknown();
        }
        if (this.serializeNulls) {
            e11 = e11.serializeNulls();
        }
        return new MoshiRequestBodyConverter(e11);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<M, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        JsonAdapter e11 = this.moshi.e(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            e11 = e11.lenient();
        }
        if (this.failOnUnknown) {
            e11 = e11.failOnUnknown();
        }
        if (this.serializeNulls) {
            e11 = e11.serializeNulls();
        }
        return new MoshiResponseBodyConverter(e11);
    }

    public MoshiConverterFactory withNullSerialization() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, true);
    }

    public static MoshiConverterFactory create(Moshi moshi) {
        if (moshi != null) {
            return new MoshiConverterFactory(moshi, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }
}
