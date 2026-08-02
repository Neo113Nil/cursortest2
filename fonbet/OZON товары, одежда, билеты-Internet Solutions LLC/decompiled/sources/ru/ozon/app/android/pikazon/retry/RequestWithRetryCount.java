package ru.ozon.app.android.pikazon.retry;

import Am.C2438a;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.ConnectivityManager;
import androidx.core.content.a;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bumptech.glide.m;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l6.InterfaceC7882e;
import org.jetbrains.annotations.NotNull;
import rj.b;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.retry.OnConnectionRestored;
import ru.ozon.app.android.pikazon.retry.domain.OnConnectionRestoredExtKt;
import ru.ozon.app.android.pikazon.retry.utils.RetriesLogKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0019B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pikazon/retry/RequestWithRetryCount;", "T", "", "Lkotlin/Function1;", "Ll6/e;", "request", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/retry/LostConnectionListener;", "getListener", "(Landroid/content/Context;)Lru/ozon/app/android/pikazon/retry/LostConnectionListener;", "createListener", "Lcom/bumptech/glide/m;", "addLostConnectionListener", "(Lcom/bumptech/glide/m;Landroid/content/Context;)Lcom/bumptech/glide/m;", "", "cancel", "()V", "Lkotlin/jvm/functions/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/pikazon/retry/LostConnectionListener;", "realRequest", "Ll6/e;", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RequestWithRetryCount<T> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private LostConnectionListener<T> listener;
    private final InterfaceC7882e realRequest;

    @NotNull
    private final Function1<RequestWithRetryCount<T>, InterfaceC7882e> request;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pikazon/retry/RequestWithRetryCount$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/lifecycle/J;", "findLifecycleOwner", "(Landroid/content/Context;)Landroidx/lifecycle/J;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final J findLifecycleOwner(@NotNull Context context) {
            ProcessLifecycleOwner processLifecycleOwner;
            Intrinsics.checkNotNullParameter(context, "context");
            if (context instanceof J) {
                return (J) context;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    Context baseContext = contextWrapper.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
                    return findLifecycleOwner(baseContext);
                }
            }
            int i11 = ProcessLifecycleOwner.f43231j;
            processLifecycleOwner = ProcessLifecycleOwner.f43230i;
            return processLifecycleOwner;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequestWithRetryCount(@NotNull Function1<? super RequestWithRetryCount<T>, ? extends InterfaceC7882e> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.realRequest = (InterfaceC7882e) request.invoke(this);
    }

    private final LostConnectionListener<T> createListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(applicationContext, "<this>");
        ConnectivityManager connectivityManager = (ConnectivityManager) a.getSystemService(applicationContext.getApplicationContext(), ConnectivityManager.class);
        if (connectivityManager == null) {
            return null;
        }
        return new LostConnectionListener<>(b.f83580f.a(connectivityManager), Companion.findLifecycleOwner(context), new RequestWithRetryCount$createListener$1(this));
    }

    private final LostConnectionListener<T> getListener(Context context) {
        LostConnectionListener<T> lostConnectionListener = this.listener;
        if (lostConnectionListener != null) {
            return lostConnectionListener;
        }
        LostConnectionListener<T> createListener = createListener(context);
        this.listener = createListener;
        return createListener;
    }

    @NotNull
    public final m<T> addLostConnectionListener(@NotNull m<T> mVar, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        OnConnectionRestored onConnectionRestored = Pikazon.INSTANCE.getInstance().getOnConnectionRestored();
        if (!(onConnectionRestored instanceof OnConnectionRestored.Retry)) {
            RetriesLogKt.retriesLog("onConnectionRestored strategy is not `Retry`. No LostConnectionListener added to request");
            return mVar;
        }
        LostConnectionListener<T> listener = getListener(context);
        if (listener == null) {
            RetriesLogKt.retriesLog("onConnectionRestored strategy is `Retry`. Can't create LostConnectionListener - network status tracker required but it is null. No LostConnectionListener added to request");
            return mVar;
        }
        int retryCount = listener.getRetryCount();
        OnConnectionRestored.Retry retry = (OnConnectionRestored.Retry) onConnectionRestored;
        int count = retry.getCount();
        if (OnConnectionRestoredExtKt.canRetry(retry, retryCount)) {
            StringBuilder a11 = C2438a.a("onConnectionRestored strategy is `Retry`. Max retry count: ", count, ". Current retry count: ", ". Add ", retryCount);
            a11.append(listener);
            a11.append(" to request");
            RetriesLogKt.retriesLog(a11.toString());
            m<T> addListener = mVar.addListener(listener);
            Intrinsics.checkNotNullExpressionValue(addListener, "addListener(...)");
            return addListener;
        }
        RetriesLogKt.retriesLog("onConnectionRestored strategy is `Retry`. Max retry count: " + count + ". Current retry count: " + retryCount + ". No LostConnectionListener added to request");
        return mVar;
    }

    public final void cancel() {
        InterfaceC7882e interfaceC7882e = this.realRequest;
        if (interfaceC7882e != null) {
            interfaceC7882e.clear();
        }
    }
}
