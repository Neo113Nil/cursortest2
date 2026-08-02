package com.coralogix.android.sdk.networking;

import R5.a;
import com.google.crypto.tink.integration.android.b;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/coralogix/android/sdk/networking/CxNetAutoAttach;", "", "<init>", "()V", "attach", "Lokhttp3/OkHttpClient$Builder;", b.f37029b, "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCxNetAutoAttach.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CxNetAutoAttach.kt\ncom/coralogix/android/sdk/networking/CxNetAutoAttach\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n1755#2,3:14\n*S KotlinDebug\n*F\n+ 1 CxNetAutoAttach.kt\ncom/coralogix/android/sdk/networking/CxNetAutoAttach\n*L\n9#1:14,3\n*E\n"})
/* loaded from: classes2.dex */
public final class CxNetAutoAttach {

    /* renamed from: a, reason: collision with root package name */
    public static final CxNetAutoAttach f30177a = new CxNetAutoAttach();

    @JvmStatic
    @NotNull
    public static final OkHttpClient.Builder attach(@NotNull OkHttpClient.Builder b10) {
        Intrinsics.checkNotNullParameter(b10, "b");
        List<Interceptor> interceptors = b10.interceptors();
        if (!(interceptors instanceof Collection) || !interceptors.isEmpty()) {
            for (Interceptor interceptor : interceptors) {
                if ((interceptor instanceof a) || (interceptor instanceof CoralogixOkHttpInterceptor)) {
                    return b10;
                }
            }
        }
        return b10.addInterceptor(new a());
    }
}
