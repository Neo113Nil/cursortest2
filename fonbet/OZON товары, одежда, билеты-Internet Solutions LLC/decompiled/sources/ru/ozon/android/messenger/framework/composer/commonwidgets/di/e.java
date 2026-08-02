package ru.ozon.android.messenger.framework.composer.commonwidgets.di;

import Jb.j;
import java.util.Set;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.messenger.framework.composer.commonwidgets.di.b;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.di.C;

/* loaded from: classes10.dex */
public final class e {

    private static final class a implements ru.ozon.android.messenger.framework.composer.commonwidgets.di.b {

        /* renamed from: a, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.composer.di.dependencies.a f86623a;

        /* renamed from: b, reason: collision with root package name */
        private final C f86624b;

        a(ru.ozon.android.messenger.framework.composer.di.dependencies.a aVar, C c11) {
            this.f86623a = aVar;
            this.f86624b = c11;
        }

        @Override // ru.ozon.android.messenger.framework.composer.commonwidgets.di.a
        public final ActionHandlersFactory getActionHandlersFactory() {
            ru.ozon.android.messenger.framework.composer.di.dependencies.a aVar = this.f86623a;
            ru.ozon.android.messenger.framework.composer.navigation.router.c C11 = aVar.C();
            j.c(C11);
            Set<ru.ozon.android.messenger.framework.composer.navigation.deeplinkhandler.a> provideDeeplinkHandlers = aVar.provideDeeplinkHandlers();
            j.c(provideDeeplinkHandlers);
            ru.ozon.android.messenger.framework.composer.navigation.router.a aVar2 = new ru.ozon.android.messenger.framework.composer.navigation.router.a(C11, provideDeeplinkHandlers);
            C9351a E11 = this.f86624b.E();
            ru.ozon.android.messenger.framework.composer.navigation.router.c C12 = aVar.C();
            j.c(C12);
            return new ru.ozon.android.messenger.framework.composer.commonwidgets.c(aVar2, E11, C12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements b.a {
        public final ru.ozon.android.messenger.framework.composer.commonwidgets.di.b a(ru.ozon.android.messenger.framework.composer.di.dependencies.a aVar, C c11) {
            return new a(aVar, c11);
        }
    }

    public static b.a a() {
        return new b();
    }
}
