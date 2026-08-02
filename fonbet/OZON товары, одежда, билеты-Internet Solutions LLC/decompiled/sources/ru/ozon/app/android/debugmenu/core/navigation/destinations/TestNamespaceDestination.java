package ru.ozon.app.android.debugmenu.core.navigation.destinations;

import EZ.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.debugmenu.core.navigation.navigators.TestNamespaceNavigationHandler;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007R&\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/debugmenu/core/navigation/destinations/TestNamespaceDestination;", "LpZ/f;", "", "isTest", "<init>", "(Z)V", "Z", "()Z", "Lkotlin/reflect/d;", "LEZ/a;", "navigator", "Lkotlin/reflect/d;", "getNavigator", "()Lkotlin/reflect/d;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TestNamespaceDestination extends f {
    private final boolean isTest;

    @NotNull
    private final d<? extends a<?>> navigator = N.b(TestNamespaceNavigationHandler.class);

    public TestNamespaceDestination(boolean z11) {
        this.isTest = z11;
    }

    @Override // pZ.f
    @NotNull
    public d<? extends a<?>> getNavigator() {
        return this.navigator;
    }

    /* renamed from: isTest, reason: from getter */
    public final boolean getIsTest() {
        return this.isTest;
    }
}
