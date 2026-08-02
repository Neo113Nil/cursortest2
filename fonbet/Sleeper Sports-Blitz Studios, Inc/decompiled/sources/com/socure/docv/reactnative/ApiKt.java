package com.socure.docv.reactnative;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* compiled from: Api.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"BASE_URL", "", "transaction", "Lcom/socure/docv/reactnative/TransactionService;", "socure-inc_docv-react-native_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApiKt {
    private static final String BASE_URL = "https://service.socure.com/";

    public static final TransactionService transaction() {
        Object create = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).client(new OkHttpBuilder().getBuilder()).build().create(TransactionService.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (TransactionService) create;
    }
}
