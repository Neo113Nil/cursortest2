package ru.ozon.app.android.fresh.navigation.tab;

import NZ.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/navigation/tab/FreshTabFragmentFactory;", "LNZ/e;", "<init>", "()V", "", "deeplink", "Lru/ozon/app/android/fresh/navigation/tab/FreshTabFragment;", "create", "(Ljava/lang/String;)Lru/ozon/app/android/fresh/navigation/tab/FreshTabFragment;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTabFragmentFactory implements e {
    @Override // NZ.e
    @NotNull
    public FreshTabFragment create(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return FreshTabFragment.INSTANCE.newInstance(deeplink);
    }
}
