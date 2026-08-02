package ru.ozon.app.android.navigation.newrouter.destinations.tabs.switchs;

import EZ.a;
import OZ.g;
import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.newrouter.navigators.ClearToRootTabNavigationHandler;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR&\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/navigation/newrouter/destinations/tabs/switchs/ClearToRootTabDestination;", "LOZ/g;", "", "link", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getLink", "()Ljava/lang/String;", "Lkotlin/reflect/d;", "LEZ/a;", "navigator", "Lkotlin/reflect/d;", "getNavigator", "()Lkotlin/reflect/d;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClearToRootTabDestination extends g {
    private final String link;

    @NotNull
    private final d<? extends a<?>> navigator;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearToRootTabDestination() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String getLink() {
        return this.link;
    }

    @Override // pZ.f
    @NotNull
    public d<? extends a<?>> getNavigator() {
        return this.navigator;
    }

    public /* synthetic */ ClearToRootTabDestination(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }

    public ClearToRootTabDestination(String str) {
        this.link = str;
        this.navigator = N.b(ClearToRootTabNavigationHandler.class);
    }
}
