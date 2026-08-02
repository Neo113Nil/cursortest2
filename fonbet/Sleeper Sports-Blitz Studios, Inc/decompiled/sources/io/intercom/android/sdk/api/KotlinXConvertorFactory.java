package io.intercom.android.sdk.api;

import com.jakewharton.retrofit2.converter.kotlinx.serialization.KotlinSerializationConverterFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import okhttp3.MediaType;
import retrofit2.Converter;

/* compiled from: KotlinXConvertorFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/api/KotlinXConvertorFactory;", "", "<init>", "()V", "getConvertorFactory", "Lretrofit2/Converter$Factory;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KotlinXConvertorFactory {
    public static final int $stable = 0;
    public static final KotlinXConvertorFactory INSTANCE = new KotlinXConvertorFactory();

    private KotlinXConvertorFactory() {
    }

    public final Converter.Factory getConvertorFactory() {
        return KotlinSerializationConverterFactory.create(JsonKt.Json$default(null, new Function1() { // from class: io.intercom.android.sdk.api.KotlinXConvertorFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit convertorFactory$lambda$0;
                convertorFactory$lambda$0 = KotlinXConvertorFactory.getConvertorFactory$lambda$0((JsonBuilder) obj);
                return convertorFactory$lambda$0;
            }
        }, 1, null), MediaType.INSTANCE.get("application/json"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getConvertorFactory$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setLenient(true);
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }
}
