package ru.ozon.app.android.abtool.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import pf0.AbstractC8919b;
import pf0.i;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/abtool/di/ServiceLocator$ozonNetworkConfig$2$1", "invoke", "()Lru/ozon/app/android/abtool/di/ServiceLocator$ozonNetworkConfig$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ServiceLocator$ozonNetworkConfig$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    public static final ServiceLocator$ozonNetworkConfig$2 INSTANCE = new ServiceLocator$ozonNetworkConfig$2();

    ServiceLocator$ozonNetworkConfig$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.abtool.di.ServiceLocator$ozonNetworkConfig$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        return new i() { // from class: ru.ozon.app.android.abtool.di.ServiceLocator$ozonNetworkConfig$2.1
            private final AbstractC8919b consumer = new AbstractC8919b.c() { // from class: ru.ozon.app.android.abtool.di.ServiceLocator$ozonNetworkConfig$2$1$consumer$1
                private final AbstractC8919b.AbstractC1361b name = AbstractC8919b.AbstractC1361b.a.f80503b;
                private final String version = "4.9.2";

                @Override // pf0.AbstractC8919b.c
                public AbstractC8919b.AbstractC1361b getName() {
                    return this.name;
                }

                @Override // pf0.AbstractC8919b.c
                public String getVersion() {
                    return this.version;
                }
            };

            @Override // pf0.i
            public AbstractC8919b getConsumer() {
                return this.consumer;
            }
        };
    }
}
