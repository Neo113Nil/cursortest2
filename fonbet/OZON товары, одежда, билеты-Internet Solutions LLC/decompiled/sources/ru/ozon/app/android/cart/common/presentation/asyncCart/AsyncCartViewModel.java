package ru.ozon.app.android.cart.common.presentation.asyncCart;

import Ae.M0;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", ImagesContract.URL, "", "", "params", "", "post", "(Ljava/lang/String;Ljava/util/Map;)V", "Lkotlin/time/b;", "uiDelayTime", "showProcessing-LRDsOJo", "(J)V", "showProcessing", "executePendingRequestsImmediately", "", "enabled", "operationsDebounceDelay", "setAsyncParams-6Au4x4Y", "(ZLkotlin/time/b;)V", "setAsyncParams", "isEnabled", "()Z", "LAe/M0;", "isProcessing", "()LAe/M0;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AsyncCartViewModel extends w0 {
    public abstract void executePendingRequestsImmediately();

    public abstract boolean isEnabled();

    @NotNull
    public abstract M0<Boolean> isProcessing();

    public abstract void post(@NotNull String url, @NotNull Map<String, ? extends Object> params);

    /* renamed from: setAsyncParams-6Au4x4Y, reason: not valid java name */
    public abstract void mo507setAsyncParams6Au4x4Y(boolean enabled, b operationsDebounceDelay);

    /* renamed from: showProcessing-LRDsOJo, reason: not valid java name */
    public abstract void mo508showProcessingLRDsOJo(long uiDelayTime);
}
