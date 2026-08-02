package ru.ozon.app.android.network.gnc;

import We.B;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8922e;
import pf0.EnumC8923f;
import pf0.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"LWe/B;", "Lpf0/e;", "toNetworkInterceptor", "(LWe/B;)Lpf0/e;", "toAppInterceptor", "network_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtentionsKt {
    @NotNull
    public static final AbstractC8922e toAppInterceptor(@NotNull final B b11) {
        Intrinsics.checkNotNullParameter(b11, "<this>");
        return new AbstractC8922e(b11) { // from class: ru.ozon.app.android.network.gnc.ExtentionsKt$toAppInterceptor$1
            private final B interceptor;
            private final String key;
            private final j ozonNetworkDevToolsLevel = j.PROD_BUILDS_ALL_USERS;
            private final EnumC8923f type = EnumC8923f.AppInterceptor;

            {
                this.interceptor = b11;
                this.key = b11.getClass().getName();
            }

            @Override // pf0.AbstractC8922e
            public B getInterceptor() {
                return this.interceptor;
            }

            @Override // pf0.AbstractC8922e
            public String getKey() {
                return this.key;
            }

            @Override // pf0.AbstractC8922e
            public j getOzonNetworkDevToolsLevel() {
                return this.ozonNetworkDevToolsLevel;
            }

            @Override // pf0.AbstractC8922e
            public EnumC8923f getType() {
                return this.type;
            }
        };
    }

    @NotNull
    public static final AbstractC8922e toNetworkInterceptor(@NotNull final B b11) {
        Intrinsics.checkNotNullParameter(b11, "<this>");
        return new AbstractC8922e(b11) { // from class: ru.ozon.app.android.network.gnc.ExtentionsKt$toNetworkInterceptor$1
            private final B interceptor;
            private final String key;
            private final j ozonNetworkDevToolsLevel = j.PROD_BUILDS_ALL_USERS;
            private final EnumC8923f type = EnumC8923f.NetworkInterceptor;

            {
                this.interceptor = b11;
                this.key = b11.getClass().getName();
            }

            @Override // pf0.AbstractC8922e
            public B getInterceptor() {
                return this.interceptor;
            }

            @Override // pf0.AbstractC8922e
            public String getKey() {
                return this.key;
            }

            @Override // pf0.AbstractC8922e
            public j getOzonNetworkDevToolsLevel() {
                return this.ozonNetworkDevToolsLevel;
            }

            @Override // pf0.AbstractC8922e
            public EnumC8923f getType() {
                return this.type;
            }
        };
    }
}
