package com.squareup.moshi.adapters;

import Fj.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/squareup/moshi/adapters/PolymorphicJsonAdapterFactory$buildFallbackJsonAdapter$1", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "moshi-adapters"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class PolymorphicJsonAdapterFactory$buildFallbackJsonAdapter$1 extends JsonAdapter<Object> {
    final /* synthetic */ Object $defaultValue;
    final /* synthetic */ PolymorphicJsonAdapterFactory<Object> this$0;

    PolymorphicJsonAdapterFactory$buildFallbackJsonAdapter$1(Object obj, PolymorphicJsonAdapterFactory<Object> polymorphicJsonAdapterFactory) {
        this.$defaultValue = obj;
        this.this$0 = polymorphicJsonAdapterFactory;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Object fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.skipValue();
        return this.$defaultValue;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo44toJson(@NotNull x writer, Object value) {
        List list;
        Intrinsics.checkNotNullParameter(writer, "writer");
        StringBuilder sb2 = new StringBuilder("Expected one of ");
        list = ((PolymorphicJsonAdapterFactory) this.this$0).f60386c;
        sb2.append(list);
        sb2.append(" but found ");
        sb2.append(value);
        sb2.append(", a ");
        throw new IllegalArgumentException(c.c(sb2, value != null ? value.getClass() : null, ". Register this subtype."));
    }
}
