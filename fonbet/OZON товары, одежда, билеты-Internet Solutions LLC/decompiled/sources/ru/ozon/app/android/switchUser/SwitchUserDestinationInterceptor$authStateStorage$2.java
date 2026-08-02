package ru.ozon.app.android.switchUser;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SwitchUserDestinationInterceptor$authStateStorage$2 extends AbstractC7737t implements Function0<AuthStateStorage> {
    final /* synthetic */ SwitchUserDestinationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchUserDestinationInterceptor$authStateStorage$2(SwitchUserDestinationInterceptor switchUserDestinationInterceptor) {
        super(0);
        this.this$0 = switchUserDestinationInterceptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AuthStateStorage invoke() {
        Context context;
        context = this.this$0.context;
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        return ((StorageComponentApi) dependencyStorage.b(StorageComponentApi.class)).getAuthStateStorage();
    }
}
