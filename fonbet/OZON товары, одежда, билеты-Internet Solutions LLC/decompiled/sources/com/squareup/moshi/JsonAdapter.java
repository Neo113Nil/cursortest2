package com.squareup.moshi;

import C.o0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import com.squareup.moshi.n;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.InterfaceC9682h;
import sf.InterfaceC9683i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u001b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0007\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0017J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0018J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u0004\u0018\u00018\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007¢\u0006\u0004\b!\u0010\u001dJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\"\u001a\u00020\fH\u0007¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/squareup/moshi/JsonAdapter;", "T", "", "<init>", "()V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Object;", "Lsf/i;", "source", "(Lsf/i;)Ljava/lang/Object;", "", "string", "(Ljava/lang/String;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "Lsf/h;", "sink", "(Lsf/h;Ljava/lang/Object;)V", "(Ljava/lang/Object;)Ljava/lang/String;", "toJsonValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "fromJsonValue", "serializeNulls", "()Lcom/squareup/moshi/JsonAdapter;", "nullSafe", "nonNull", "lenient", "failOnUnknown", "indent", "(Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;", "", "isLenient", "()Z", "a", "moshi"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class JsonAdapter<T> {

    public interface a {
        JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> set, @NotNull Moshi moshi);
    }

    @NotNull
    public final JsonAdapter<T> failOnUnknown() {
        return new JsonAdapter<T>(this) { // from class: com.squareup.moshi.JsonAdapter$failOnUnknown$1
            final /* synthetic */ JsonAdapter<T> $delegate;

            {
                this.$delegate = this;
            }

            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(@NotNull n reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                boolean c11 = reader.c();
                reader.x(true);
                try {
                    return this.$delegate.fromJson(reader);
                } finally {
                    reader.x(c11);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public boolean isLenient() {
                return this.$delegate.isLenient();
            }

            @Override // com.squareup.moshi.JsonAdapter
            /* renamed from: toJson */
            public void mo44toJson(@NotNull x writer, T value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                this.$delegate.mo44toJson(writer, (x) value);
            }

            @NotNull
            public String toString() {
                return this.$delegate + ".failOnUnknown()";
            }
        };
    }

    public abstract T fromJson(@NotNull n reader) throws IOException;

    public final T fromJson(@NotNull InterfaceC9683i source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source, "source");
        return fromJson(new p(source));
    }

    public final T fromJsonValue(Object value) {
        try {
            return fromJson(new s(value));
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    @NotNull
    public final JsonAdapter<T> indent(@NotNull final String indent) {
        Intrinsics.checkNotNullParameter(indent, "indent");
        return new JsonAdapter<T>(this) { // from class: com.squareup.moshi.JsonAdapter$indent$1
            final /* synthetic */ JsonAdapter<T> $delegate;

            {
                this.$delegate = this;
            }

            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(@NotNull n reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return this.$delegate.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public boolean isLenient() {
                return this.$delegate.isLenient();
            }

            @Override // com.squareup.moshi.JsonAdapter
            /* renamed from: toJson */
            public void mo44toJson(@NotNull x writer, T value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                String q11 = writer.q();
                writer.B(indent);
                try {
                    this.$delegate.mo44toJson(writer, (x) value);
                } finally {
                    writer.B(q11);
                }
            }

            @NotNull
            public String toString() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.$delegate);
                sb2.append(".indent(\"");
                return o0.c(sb2, indent, "\")");
            }
        };
    }

    public boolean isLenient() {
        return false;
    }

    @NotNull
    public final JsonAdapter<T> lenient() {
        return new JsonAdapter<T>(this) { // from class: com.squareup.moshi.JsonAdapter$lenient$1
            final /* synthetic */ JsonAdapter<T> $delegate;

            {
                this.$delegate = this;
            }

            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(@NotNull n reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                boolean j11 = reader.j();
                reader.setLenient(true);
                try {
                    return this.$delegate.fromJson(reader);
                } finally {
                    reader.setLenient(j11);
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public boolean isLenient() {
                return true;
            }

            @Override // com.squareup.moshi.JsonAdapter
            /* renamed from: toJson */
            public void mo44toJson(@NotNull x writer, T value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                boolean t2 = writer.t();
                writer.setLenient(true);
                try {
                    this.$delegate.mo44toJson(writer, (x) value);
                } finally {
                    writer.setLenient(t2);
                }
            }

            @NotNull
            public String toString() {
                return this.$delegate + ".lenient()";
            }
        };
    }

    @NotNull
    public final JsonAdapter<T> nonNull() {
        return this instanceof NonNullJsonAdapter ? this : new NonNullJsonAdapter(this);
    }

    @NotNull
    public final JsonAdapter<T> nullSafe() {
        return this instanceof NullSafeJsonAdapter ? this : new NullSafeJsonAdapter(this);
    }

    @NotNull
    public final JsonAdapter<T> serializeNulls() {
        return new JsonAdapter<T>(this) { // from class: com.squareup.moshi.JsonAdapter$serializeNulls$1
            final /* synthetic */ JsonAdapter<T> $delegate;

            {
                this.$delegate = this;
            }

            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(@NotNull n reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return this.$delegate.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public boolean isLenient() {
                return this.$delegate.isLenient();
            }

            @Override // com.squareup.moshi.JsonAdapter
            /* renamed from: toJson */
            public void mo44toJson(@NotNull x writer, T value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                boolean s11 = writer.s();
                writer.I(true);
                try {
                    this.$delegate.mo44toJson(writer, (x) value);
                } finally {
                    writer.I(s11);
                }
            }

            @NotNull
            public String toString() {
                return this.$delegate + ".serializeNulls()";
            }
        };
    }

    /* renamed from: toJson */
    public abstract void mo44toJson(@NotNull x writer, T value) throws IOException;

    public final void toJson(@NotNull InterfaceC9682h sink, T value) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(sink, "sink");
        mo44toJson((x) new q(sink), (q) value);
    }

    public final Object toJsonValue(T value) {
        w wVar = new w();
        try {
            mo44toJson((x) wVar, (w) value);
            return wVar.o0();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public final T fromJson(@NotNull String string) throws IOException {
        Intrinsics.checkNotNullParameter(string, "string");
        C9681g source = new C9681g();
        source.H0(string);
        Intrinsics.checkNotNullParameter(source, "source");
        p pVar = new p(source);
        T fromJson = fromJson(pVar);
        if (isLenient() || pVar.p() == n.b.END_DOCUMENT) {
            return fromJson;
        }
        throw new k("JSON document was not fully consumed.");
    }

    @NotNull
    public final String toJson(T value) {
        C9681g c9681g = new C9681g();
        try {
            toJson((InterfaceC9682h) c9681g, (C9681g) value);
            return c9681g.G0();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}
