package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/MultipleDebounceHandler;", "T", "", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "", "debounce", "Lkotlin/Function1;", "", "onHandle", "<init>", "(Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;JLkotlin/jvm/functions/Function1;)V", "id", "param", "handle", "(JLjava/lang/Object;)V", "clear", "()V", "J", "Lkotlin/jvm/functions/Function1;", "Lxe/M;", "scope", "Lxe/M;", "", "Lxe/B0;", "jobs", "Ljava/util/Map;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MultipleDebounceHandler<T> {
    private final long debounce;

    @NotNull
    private final Map<Long, B0> jobs;

    @NotNull
    private final Function1<T, Unit> onHandle;

    @NotNull
    private final M scope;

    /* JADX WARN: Multi-variable type inference failed */
    public MultipleDebounceHandler(@NotNull CoroutineDispatcherProvider dispatcherProvider, long j11, @NotNull Function1<? super T, Unit> onHandle) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(onHandle, "onHandle");
        this.debounce = j11;
        this.onHandle = onHandle;
        this.scope = N.a(dispatcherProvider.getMainImmediate());
        this.jobs = new LinkedHashMap();
    }

    public final void clear() {
        Iterator<Map.Entry<Long, B0>> it = this.jobs.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().j(null);
        }
        this.jobs.clear();
    }

    public final void handle(long id2, T param) {
        B0 b02 = this.jobs.get(Long.valueOf(id2));
        if (b02 != null) {
            b02.j(null);
        }
        this.jobs.put(Long.valueOf(id2), C10727i.c(this.scope, null, null, new MultipleDebounceHandler$handle$1(this, param, null), 3));
    }
}
