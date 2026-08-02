package ru.ozon.app.android.storage.auth;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.limb.OzonIdStorageDependencies;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/limb/OzonIdStorageDependencies;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AuthTokenDataSourceImpl$ozonIdStorageDependencies$2 extends AbstractC7737t implements Function0<OzonIdStorageDependencies> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthTokenDataSourceImpl$ozonIdStorageDependencies$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OzonIdStorageDependencies invoke() {
        Context context = this.$context;
        if (OzonIdStorageDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OzonIdStorageDependencies is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, OzonIdStorageDependencies.class).getDependencyStorage();
        if (OzonIdStorageDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OzonIdStorageDependencies is not DiComponent");
        }
        return (OzonIdStorageDependencies) dependencyStorage.b(OzonIdStorageDependencies.class);
    }
}
