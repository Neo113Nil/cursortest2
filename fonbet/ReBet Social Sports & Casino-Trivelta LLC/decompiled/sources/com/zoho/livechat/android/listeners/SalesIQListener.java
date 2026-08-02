package com.zoho.livechat.android.listeners;

import Bd.b;
import Fd.a;
import androidx.annotation.Keep;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import od.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import we.d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\u0004J#\u0010\r\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001f\u0010 ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006!À\u0006\u0003"}, d2 = {"Lcom/zoho/livechat/android/listeners/SalesIQListener;", "", "", "handleSupportOpen", "()V", "handleSupportClose", "handleOperatorsOnline", "handleOperatorsOffline", "handleIPBlock", "", "triggerName", "Lod/x;", "visitor", "handleTrigger", "(Ljava/lang/String;Lod/x;)V", "", ViewProps.VISIBLE, "handleCustomLauncherVisibility", "(Z)V", "handleBotTrigger", "LFd/a;", "authTokenListener", "onAuthTokenExpired", "(LFd/a;)V", "LBd/b;", "onAuthTokenExpiredAsync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwe/d;", "salesIQError", "onAuthTokenRenewalError", "(Lwe/d;)V", "onVisitorRegistrationFailed", "(Lwe/d;)LBd/b;", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SalesIQListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Keep
        @Deprecated
        public static void handleBotTrigger(@NotNull SalesIQListener salesIQListener) {
            SalesIQListener.super.handleBotTrigger();
        }

        @Keep
        @Deprecated
        public static void handleCustomLauncherVisibility(@NotNull SalesIQListener salesIQListener, boolean z10) {
            SalesIQListener.super.handleCustomLauncherVisibility(z10);
        }

        @Keep
        @Deprecated
        public static void handleIPBlock(@NotNull SalesIQListener salesIQListener) {
            SalesIQListener.super.handleIPBlock();
        }

        @Keep
        @Deprecated
        public static void handleOperatorsOffline(@NotNull SalesIQListener salesIQListener) {
            SalesIQListener.super.handleOperatorsOffline();
        }

        @Keep
        @Deprecated
        public static void handleOperatorsOnline(@NotNull SalesIQListener salesIQListener) {
            SalesIQListener.super.handleOperatorsOnline();
        }

        @Keep
        @Deprecated
        public static void handleSupportClose(@NotNull SalesIQListener salesIQListener) {
            SalesIQListener.super.handleSupportClose();
        }

        @Keep
        @Deprecated
        public static void handleSupportOpen(@NotNull SalesIQListener salesIQListener) {
            SalesIQListener.super.handleSupportOpen();
        }

        @Keep
        @Deprecated
        public static void handleTrigger(@NotNull SalesIQListener salesIQListener, @Nullable String str, @Nullable x xVar) {
            SalesIQListener.super.handleTrigger(str, xVar);
        }

        @Keep
        @Deprecated
        public static void onAuthTokenExpired(@NotNull SalesIQListener salesIQListener, @NotNull a authTokenListener) {
            Intrinsics.checkNotNullParameter(authTokenListener, "authTokenListener");
            SalesIQListener.super.onAuthTokenExpired(authTokenListener);
        }

        @Keep
        @Deprecated
        @Nullable
        public static Object onAuthTokenExpiredAsync(@NotNull SalesIQListener salesIQListener, @NotNull Continuation<? super b> continuation) {
            return SalesIQListener.super.onAuthTokenExpiredAsync(continuation);
        }

        @Keep
        @Deprecated
        public static void onAuthTokenRenewalError(@NotNull SalesIQListener salesIQListener, @NotNull d salesIQError) {
            Intrinsics.checkNotNullParameter(salesIQError, "salesIQError");
            SalesIQListener.super.onAuthTokenRenewalError(salesIQError);
        }

        @Keep
        @Deprecated
        @Nullable
        public static b onVisitorRegistrationFailed(@NotNull SalesIQListener salesIQListener, @NotNull d salesIQError) {
            Intrinsics.checkNotNullParameter(salesIQError, "salesIQError");
            return SalesIQListener.super.onVisitorRegistrationFailed(salesIQError);
        }
    }

    @Keep
    static /* synthetic */ Object onAuthTokenExpiredAsync$suspendImpl(SalesIQListener salesIQListener, Continuation<? super b> continuation) {
        return null;
    }

    @Keep
    default void handleBotTrigger() {
    }

    @Keep
    default void handleCustomLauncherVisibility(boolean visible) {
    }

    @Keep
    default void handleIPBlock() {
    }

    @Keep
    default void handleOperatorsOffline() {
    }

    @Keep
    default void handleOperatorsOnline() {
    }

    @Keep
    default void handleSupportClose() {
    }

    @Keep
    default void handleSupportOpen() {
    }

    @Keep
    default void onAuthTokenExpired(@NotNull a authTokenListener) {
        Intrinsics.checkNotNullParameter(authTokenListener, "authTokenListener");
    }

    @Keep
    @Nullable
    default Object onAuthTokenExpiredAsync(@NotNull Continuation<? super b> continuation) {
        return onAuthTokenExpiredAsync$suspendImpl(this, continuation);
    }

    @Keep
    default void onAuthTokenRenewalError(@NotNull d salesIQError) {
        Intrinsics.checkNotNullParameter(salesIQError, "salesIQError");
    }

    @Keep
    @Nullable
    default b onVisitorRegistrationFailed(@NotNull d salesIQError) {
        Intrinsics.checkNotNullParameter(salesIQError, "salesIQError");
        return null;
    }

    @Keep
    default void handleTrigger(@Nullable String triggerName, @Nullable x visitor) {
    }
}
