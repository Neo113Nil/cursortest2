package ru.ozon.app.android.session.auth.di;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.auth.core.AuthConfig;
import ru.ozon.app.android.session.auth.presentation.viewMapper.AuthViewMapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/session/auth/di/AuthWidgetModule;", "", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AuthWidgetModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/session/auth/di/AuthWidgetModule$Companion;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/di/Widget;", "authConfig", "Lru/ozon/app/android/session/auth/core/AuthConfig;", "authViewMapper", "Lru/ozon/app/android/session/auth/presentation/viewMapper/AuthViewMapper;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Widget> provideWidget(@NotNull AuthConfig authConfig, @NotNull AuthViewMapper authViewMapper) {
            Intrinsics.checkNotNullParameter(authConfig, "authConfig");
            Intrinsics.checkNotNullParameter(authViewMapper, "authViewMapper");
            List<String> registrations = AuthConfig.INSTANCE.getRegistrations();
            ArrayList arrayList = new ArrayList(C7714v.z(registrations, 10));
            Iterator<T> it = registrations.iterator();
            while (it.hasNext()) {
                arrayList.add(new Widget("csma", (String) it.next(), authConfig, new AuthViewMapper[]{authViewMapper}));
            }
            return C7714v.Y0(arrayList);
        }

        private Companion() {
        }
    }
}
