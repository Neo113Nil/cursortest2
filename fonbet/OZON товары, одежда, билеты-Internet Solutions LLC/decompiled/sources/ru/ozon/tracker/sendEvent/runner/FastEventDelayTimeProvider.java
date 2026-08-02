package ru.ozon.tracker.sendEvent.runner;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Jj0.a;
import Sc.InterfaceC4008j;
import bk0.C5682b;
import fi0.x;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolLibsApi;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ve.EnumC10311b;
import xe.M;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/tracker/sendEvent/runner/FastEventDelayTimeProvider;", "Lru/ozon/tracker/sendEvent/runner/DelayTimeProvider;", "Lxe/M;", "scope", "Lfi0/x;", "settings", "<init>", "(Lxe/M;Lfi0/x;)V", "", "startObserving", "()V", "", "getDelayTimeFromAbTool", "()I", "Lkotlin/time/b;", "get-UwyO8pc", "()J", "get", "Lxe/M;", "Lfi0/x;", "Lru/ozon/app/android/abtool/AbToolLibsApi;", "abToolApi$delegate", "LSc/j;", "getAbToolApi", "()Lru/ozon/app/android/abtool/AbToolLibsApi;", "abToolApi", "Ljava/util/concurrent/atomic/AtomicInteger;", "cache", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isObservingStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FastEventDelayTimeProvider implements DelayTimeProvider {

    /* renamed from: abToolApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j abToolApi;

    @NotNull
    private final AtomicInteger cache;

    @NotNull
    private final AtomicBoolean isObservingStarted;

    @NotNull
    private final M scope;

    @NotNull
    private final x settings;

    public FastEventDelayTimeProvider(@NotNull M scope, @NotNull x settings) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.scope = scope;
        this.settings = settings;
        this.abToolApi = C5682b.a(new FastEventDelayTimeProvider$abToolApi$2(this));
        this.cache = new AtomicInteger(getDelayTimeFromAbTool());
        this.isObservingStarted = new AtomicBoolean(false);
    }

    private final AbToolLibsApi getAbToolApi() {
        return (AbToolLibsApi) this.abToolApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDelayTimeFromAbTool() {
        AbToolLibsApi abToolApi = getAbToolApi();
        if (abToolApi != null) {
            return abToolApi.getInt(a.a().getName(), a.a().getServiceName(), AbToolNamespace.PLATFORM_MOBILE);
        }
        Object defaultValue = a.a().getDefaultValue();
        Intrinsics.g(defaultValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) defaultValue).intValue();
    }

    private final void startObserving() {
        AbToolLibsApi abToolApi = getAbToolApi();
        if (abToolApi == null || !this.isObservingStarted.compareAndSet(false, true)) {
            return;
        }
        C2399j.C(new C(new C2408n0(abToolApi.getRemoteFetchingStatus(AbToolNamespace.PLATFORM_MOBILE), new FastEventDelayTimeProvider$startObserving$1(this, null)), new FastEventDelayTimeProvider$startObserving$2(this, null)), this.scope);
    }

    @Override // ru.ozon.tracker.sendEvent.runner.DelayTimeProvider
    /* renamed from: get-UwyO8pc */
    public long mo1670getUwyO8pc() {
        startObserving();
        b.Companion companion = b.INSTANCE;
        return c.g(this.cache.get(), EnumC10311b.MILLISECONDS);
    }
}
