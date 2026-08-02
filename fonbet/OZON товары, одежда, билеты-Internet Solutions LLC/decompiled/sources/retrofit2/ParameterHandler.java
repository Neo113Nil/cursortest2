package retrofit2;

import B0.A0;
import C.C2702w;
import C.o0;
import We.D;
import We.K;
import We.z;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
abstract class ParameterHandler<T> {

    static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, K> converter;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f83348p;

        Body(Method method, int i11, Converter<T, K> converter) {
            this.method = method;
            this.f83348p = i11;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t2) {
            if (t2 == null) {
                throw Utils.parameterError(this.method, this.f83348p, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                requestBuilder.setBody(this.converter.convert(t2));
            } catch (IOException e11) {
                throw Utils.parameterError(this.method, e11, this.f83348p, C2702w.c(t2, "Unable to convert ", " to RequestBody"), new Object[0]);
            }
        }
    }

    /* loaded from: classes10.dex */
    static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Field(String str, Converter<T, String> converter, boolean z11) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z11;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t2) throws IOException {
            String convert;
            if (t2 == null || (convert = this.valueConverter.convert(t2)) == null) {
                return;
            }
            requestBuilder.addFormField(this.name, convert, this.encoded);
        }
    }

    /* loaded from: classes10.dex */
    static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f83349p;
        private final Converter<T, String> valueConverter;

        FieldMap(Method method, int i11, Converter<T, String> converter, boolean z11) {
            this.method = method;
            this.f83349p = i11;
            this.valueConverter = converter;
            this.encoded = z11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f83349p, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f83349p, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f83349p, A0.b("Field map contained null value for key '", key, "'."), new Object[0]);
                }
                String convert = this.valueConverter.convert(value);
                if (convert == null) {
                    throw Utils.parameterError(this.method, this.f83349p, "Field map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addFormField(key, convert, this.encoded);
            }
        }
    }

    /* loaded from: classes10.dex */
    static final class Header<T> extends ParameterHandler<T> {
        private final String name;
        private final Converter<T, String> valueConverter;

        Header(String str, Converter<T, String> converter) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t2) throws IOException {
            String convert;
            if (t2 == null || (convert = this.valueConverter.convert(t2)) == null) {
                return;
            }
            requestBuilder.addHeader(this.name, convert);
        }
    }

    /* loaded from: classes10.dex */
    static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f83350p;
        private final Converter<T, String> valueConverter;

        HeaderMap(Method method, int i11, Converter<T, String> converter) {
            this.method = method;
            this.f83350p = i11;
            this.valueConverter = converter;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f83350p, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f83350p, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f83350p, A0.b("Header map contained null value for key '", key, "'."), new Object[0]);
                }
                requestBuilder.addHeader(key, this.valueConverter.convert(value));
            }
        }
    }

    /* loaded from: classes10.dex */
    static final class Headers extends ParameterHandler<z> {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f83351p;

        Headers(Method method, int i11) {
            this.method = method;
            this.f83351p = i11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, z zVar) {
            if (zVar == null) {
                throw Utils.parameterError(this.method, this.f83351p, "Headers parameter must not be null.", new Object[0]);
            }
            requestBuilder.addHeaders(zVar);
        }
    }

    /* loaded from: classes10.dex */
    static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, K> converter;
        private final z headers;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f83352p;

        Part(Method method, int i11, z zVar, Converter<T, K> converter) {
            this.method = method;
            this.f83352p = i11;
            this.headers = zVar;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t2) {
            if (t2 == null) {
                return;
            }
            try {
                requestBuilder.addPart(this.headers, this.converter.convert(t2));
            } catch (IOException e11) {
                throw Utils.parameterError(this.method, this.f83352p, C2702w.c(t2, "Unable to convert ", " to RequestBody"), e11);
            }
        }
    }

    /* loaded from: classes10.dex */
    static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f83353p;
        private final String transferEncoding;
        private final Converter<T, K> valueConverter;

        PartMap(Method method, int i11, Converter<T, K> converter, String str) {
            this.method = method;
            this.f83353p = i11;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f83353p, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f83353p, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f83353p, A0.b("Part map contained null value for key '", key, "'."), new Object[0]);
                }
                String[] strArr = {"Content-Disposition", A0.b("form-data; name=\"", key, "\""), "Content-Transfer-Encoding", this.transferEncoding};
                z.f33821b.getClass();
                requestBuilder.addPart(z.b.f(strArr), this.valueConverter.convert(value));
            }
        }
    }

    /* loaded from: classes10.dex */
    static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;

        /* renamed from: p, reason: collision with root package name */
        private final int f83354p;
        private final Converter<T, String> valueConverter;

        Path(Method method, int i11, String str, Converter<T, String> converter, boolean z11) {
            this.method = method;
            this.f83354p = i11;
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z11;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t2) throws IOException {
            if (t2 == null) {
                throw Utils.parameterError(this.method, this.f83354p, o0.c(new StringBuilder("Path parameter \""), this.name, "\" value must not be null."), new Object[0]);
            }
            requestBuilder.addPathParam(this.name, this.valueConverter.convert(t2), this.encoded);
        }
    }

    static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Query(String str, Converter<T, String> converter, boolean z11) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z11;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t2) throws IOException {
            String convert;
            if (t2 == null || (convert = this.valueConverter.convert(t2)) == null) {
                return;
            }
            requestBuilder.addQueryParam(this.name, convert, this.encoded);
        }
    }

    /* loaded from: classes10.dex */
    static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f83355p;
        private final Converter<T, String> valueConverter;

        QueryMap(Method method, int i11, Converter<T, String> converter, boolean z11) {
            this.method = method;
            this.f83355p = i11;
            this.valueConverter = converter;
            this.encoded = z11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f83355p, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f83355p, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f83355p, A0.b("Query map contained null value for key '", key, "'."), new Object[0]);
                }
                String convert = this.valueConverter.convert(value);
                if (convert == null) {
                    throw Utils.parameterError(this.method, this.f83355p, "Query map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addQueryParam(key, convert, this.encoded);
            }
        }
    }

    /* loaded from: classes10.dex */
    static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        QueryName(Converter<T, String> converter, boolean z11) {
            this.nameConverter = converter;
            this.encoded = z11;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t2) throws IOException {
            if (t2 == null) {
                return;
            }
            requestBuilder.addQueryParam(this.nameConverter.convert(t2), null, this.encoded);
        }
    }

    /* loaded from: classes10.dex */
    static final class RawPart extends ParameterHandler<D.c> {
        static final RawPart INSTANCE = new RawPart();

        private RawPart() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, D.c cVar) {
            if (cVar != null) {
                requestBuilder.addPart(cVar);
            }
        }
    }

    static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f83356p;

        RelativeUrl(Method method, int i11) {
            this.method = method;
            this.f83356p = i11;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, Object obj) {
            if (obj == null) {
                throw Utils.parameterError(this.method, this.f83356p, "@Url parameter is null.", new Object[0]);
            }
            requestBuilder.setRelativeUrl(obj);
        }
    }

    /* loaded from: classes10.dex */
    static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        Tag(Class<T> cls) {
            this.cls = cls;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t2) {
            requestBuilder.addTag(this.cls, t2);
        }
    }

    ParameterHandler() {
    }

    abstract void apply(RequestBuilder requestBuilder, T t2) throws IOException;

    final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.ParameterHandler
            void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i11 = 0; i11 < length; i11++) {
                    ParameterHandler.this.apply(requestBuilder, Array.get(obj, i11));
                }
            }
        };
    }

    final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, Iterable<T> iterable) throws IOException {
                if (iterable == null) {
                    return;
                }
                Iterator<T> it = iterable.iterator();
                while (it.hasNext()) {
                    ParameterHandler.this.apply(requestBuilder, it.next());
                }
            }
        };
    }
}
