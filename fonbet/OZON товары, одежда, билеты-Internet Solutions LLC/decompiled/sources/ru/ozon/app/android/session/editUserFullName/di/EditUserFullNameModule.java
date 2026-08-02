package ru.ozon.app.android.session.editUserFullName.di;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.editUserFullName.core.EditUserFullNameConfig;
import ru.ozon.app.android.session.editUserFullName.core.EditUserFullNameViewMapper;
import ru.ozon.app.android.session.editUserFullName.data.EditUserFullNameApi;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/di/EditUserFullNameModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/di/Widget;", "editUserFullNameConfig", "Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameConfig;", "editUserFullNameViewMapper", "Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameViewMapper;", "provideEditUserFullNameApi", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameApi;", "retrofit", "Lretrofit2/Retrofit;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EditUserFullNameModule {

    @NotNull
    public static final EditUserFullNameModule INSTANCE = new EditUserFullNameModule();

    private EditUserFullNameModule() {
    }

    @NotNull
    public static final EditUserFullNameApi provideEditUserFullNameApi(@NotNull Retrofit retrofit) {
        return (EditUserFullNameApi) C4598rp.b(retrofit, "retrofit", EditUserFullNameApi.class, "create(...)");
    }

    @NotNull
    public static final Widget provideWidget(@NotNull EditUserFullNameConfig editUserFullNameConfig, @NotNull EditUserFullNameViewMapper editUserFullNameViewMapper) {
        Intrinsics.checkNotNullParameter(editUserFullNameConfig, "editUserFullNameConfig");
        Intrinsics.checkNotNullParameter(editUserFullNameViewMapper, "editUserFullNameViewMapper");
        return new Widget("csma", "editUserFullName", editUserFullNameConfig, new EditUserFullNameViewMapper[]{editUserFullNameViewMapper});
    }
}
