package ru.ozon.app.android.network.serialize.adapter;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.io.IOException;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/network/serialize/adapter/BigDecimalMoshiAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigDecimal;", "<init>", "()V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/math/BigDecimal;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/math/BigDecimal;)V", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BigDecimalMoshiAdapter extends JsonAdapter<BigDecimal> {
    @Override // com.squareup.moshi.JsonAdapter
    @h
    public BigDecimal fromJson(@NotNull n reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        try {
            if (reader.p() != n.b.NULL) {
                return new BigDecimal(reader.nextString());
            }
            reader.m();
            return null;
        } catch (k unused) {
            return null;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    @C
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BigDecimal value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            writer.R("");
        } else {
            writer.R(value.toPlainString());
        }
    }
}
