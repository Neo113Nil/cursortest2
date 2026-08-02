package ru.ozon.app.android.initializers.warmer;

import com.squareup.moshi.Moshi;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.warmup.WarmupAdaptersFacade;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/initializers/warmer/MoshiAdapterWarmerImpl;", "Lru/ozon/app/android/initializers/warmer/MoshiAdapterWarmer;", "Lcom/squareup/moshi/Moshi;", "moshi", "Lru/ozon/app/android/warmup/WarmupAdaptersFacade;", "warmupAdaptersFacade", "<init>", "(Lcom/squareup/moshi/Moshi;Lru/ozon/app/android/warmup/WarmupAdaptersFacade;)V", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "warmupConfigurationFlags", "", "warmUpJsonAdapters", "(Ljava/util/Set;)V", "Lcom/squareup/moshi/Moshi;", "Lru/ozon/app/android/warmup/WarmupAdaptersFacade;", "Lxe/M;", "coroutinesScope", "Lxe/M;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MoshiAdapterWarmerImpl implements MoshiAdapterWarmer {

    @NotNull
    private final M coroutinesScope;

    @NotNull
    private final Moshi moshi;

    @NotNull
    private final WarmupAdaptersFacade warmupAdaptersFacade;

    public MoshiAdapterWarmerImpl(@NotNull Moshi moshi, @NotNull WarmupAdaptersFacade warmupAdaptersFacade) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(warmupAdaptersFacade, "warmupAdaptersFacade");
        this.moshi = moshi;
        this.warmupAdaptersFacade = warmupAdaptersFacade;
        this.coroutinesScope = N.a(CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b()).plus(new MoshiAdapterWarmerImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    @Override // ru.ozon.app.android.initializers.warmer.MoshiAdapterWarmer
    public void warmUpJsonAdapters(@NotNull Set<? extends FeatureFlag> warmupConfigurationFlags) {
        Intrinsics.checkNotNullParameter(warmupConfigurationFlags, "warmupConfigurationFlags");
        C10727i.c(this.coroutinesScope, null, null, new MoshiAdapterWarmerImpl$warmUpJsonAdapters$1(C10727i.a(this.coroutinesScope, null, null, new MoshiAdapterWarmerImpl$warmUpJsonAdapters$deferred$1(this, warmupConfigurationFlags, null), 3), null), 3);
    }
}
