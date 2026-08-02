package com.squareup.moshi.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/squareup/moshi/internal/NullSafeJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "delegate", "<init>", "(Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonAdapter;", "getDelegate", "()Lcom/squareup/moshi/JsonAdapter;", "moshi"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NullSafeJsonAdapter<T> extends JsonAdapter<T> {

    @NotNull
    private final JsonAdapter<T> delegate;

    public NullSafeJsonAdapter(@NotNull JsonAdapter<T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.p() != n.b.NULL) {
            return this.delegate.fromJson(reader);
        }
        reader.m();
        return null;
    }

    @NotNull
    public final JsonAdapter<T> getDelegate() {
        return this.delegate;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo44toJson(@NotNull x writer, T value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            writer.x();
        } else {
            this.delegate.mo44toJson(writer, (x) value);
        }
    }

    @NotNull
    public String toString() {
        return this.delegate + ".nullSafe()";
    }
}
