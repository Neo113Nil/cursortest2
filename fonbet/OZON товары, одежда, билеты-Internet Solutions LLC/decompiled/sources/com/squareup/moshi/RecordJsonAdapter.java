package com.squareup.moshi;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/moshi/RecordJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "<init>", "()V", "Lcom/squareup/moshi/n;", "reader", "", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Void;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)Ljava/lang/Void;", "Factory", "a", "moshi"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RecordJsonAdapter<T> extends JsonAdapter<T> {

    /* renamed from: Factory, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: com.squareup.moshi.RecordJsonAdapter$a, reason: from kotlin metadata */
    public static final class Companion implements JsonAdapter.a {
        @Override // com.squareup.moshi.JsonAdapter.a
        public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo44toJson(x xVar, Object obj) {
        toJson(xVar, (x) obj);
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Void fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        throw new AssertionError();
    }

    @NotNull
    public Void toJson(@NotNull x writer, T value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        throw new AssertionError();
    }
}
