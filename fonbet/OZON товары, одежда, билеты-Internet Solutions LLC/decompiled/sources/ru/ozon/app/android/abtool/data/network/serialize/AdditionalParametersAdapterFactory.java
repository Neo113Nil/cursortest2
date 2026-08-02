package ru.ozon.app.android.abtool.data.network.serialize;

import Ep.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.network.ConfigsRequest;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/abtool/data/network/serialize/AdditionalParametersAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$a;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/squareup/moshi/JsonAdapter;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/Moshi;)Lcom/squareup/moshi/JsonAdapter;", "ConfigsRequestMoshiAdapter", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdditionalParametersAdapterFactory implements JsonAdapter.a {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/abtool/data/network/serialize/AdditionalParametersAdapterFactory$ConfigsRequestMoshiAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/abtool/data/network/ConfigsRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "delegate", "<init>", "(Lcom/squareup/moshi/Moshi;Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/abtool/data/network/ConfigsRequest;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/abtool/data/network/ConfigsRequest;)V", "Lcom/squareup/moshi/Moshi;", "Lcom/squareup/moshi/JsonAdapter;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConfigsRequestMoshiAdapter extends JsonAdapter<ConfigsRequest> {

        @NotNull
        private final JsonAdapter<ConfigsRequest> delegate;

        @NotNull
        private final Moshi moshi;

        public ConfigsRequestMoshiAdapter(@NotNull Moshi moshi, @NotNull JsonAdapter<ConfigsRequest> delegate) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.moshi = moshi;
            this.delegate = delegate;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public ConfigsRequest fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return this.delegate.fromJson(reader);
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo44toJson(@NotNull x writer, ConfigsRequest value) {
            Map<String, Object> additionalParams;
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.j();
            int d11 = writer.d();
            this.delegate.mo44toJson(writer, (x) value);
            writer.o(d11);
            if (value != null && (additionalParams = value.getAdditionalParams()) != null) {
                JsonAdapter c11 = this.moshi.c(Map.class);
                int d12 = writer.d();
                c11.mo44toJson(writer, (x) additionalParams);
                writer.o(d12);
            }
            writer.p();
        }
    }

    @Override // com.squareup.moshi.JsonAdapter.a
    public JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        Class b11 = a.b(annotations, "annotations", moshi, "moshi", type);
        Intrinsics.checkNotNullExpressionValue(b11, "getRawType(...)");
        if (b11 != ConfigsRequest.class) {
            return null;
        }
        return new ConfigsRequestMoshiAdapter(moshi, moshi.h(this, ConfigsRequest.class, annotations));
    }
}
