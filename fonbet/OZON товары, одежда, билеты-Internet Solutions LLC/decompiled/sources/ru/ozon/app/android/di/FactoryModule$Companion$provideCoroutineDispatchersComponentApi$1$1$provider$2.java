package ru.ozon.app.android.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProviderImpl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProviderImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FactoryModule$Companion$provideCoroutineDispatchersComponentApi$1$1$provider$2 extends AbstractC7737t implements Function0<CoroutineDispatcherProviderImpl> {
    public static final FactoryModule$Companion$provideCoroutineDispatchersComponentApi$1$1$provider$2 INSTANCE = new FactoryModule$Companion$provideCoroutineDispatchersComponentApi$1$1$provider$2();

    FactoryModule$Companion$provideCoroutineDispatchersComponentApi$1$1$provider$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CoroutineDispatcherProviderImpl invoke() {
        return new CoroutineDispatcherProviderImpl();
    }
}
