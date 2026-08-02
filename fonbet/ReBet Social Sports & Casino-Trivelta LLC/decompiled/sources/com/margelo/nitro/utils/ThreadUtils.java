package com.margelo.nitro.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import h8.InterfaceC4488a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC4488a
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/margelo/nitro/utils/ThreadUtils;", "", "<init>", "()V", "Companion", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper());

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/margelo/nitro/utils/ThreadUtils$Companion;", "", "<init>", "()V", "handler", "Landroid/os/Handler;", "getCurrentThreadName", "", "setCurrentThreadName", "", "name", "isOnUIThread", "", "runOnUIThread", "runnable", "Ljava/lang/Runnable;", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @InterfaceC4488a
        @Keep
        @NotNull
        public final String getCurrentThreadName() {
            String name = Thread.currentThread().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }

        @JvmStatic
        @InterfaceC4488a
        @Keep
        public final boolean isOnUIThread() {
            return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
        }

        @JvmStatic
        @InterfaceC4488a
        @Keep
        public final void runOnUIThread(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            ThreadUtils.handler.post(runnable);
        }

        @JvmStatic
        @InterfaceC4488a
        @Keep
        public final void setCurrentThreadName(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Thread.currentThread().setName(name);
        }

        public Companion() {
        }
    }

    @JvmStatic
    @InterfaceC4488a
    @Keep
    @NotNull
    public static final String getCurrentThreadName() {
        return INSTANCE.getCurrentThreadName();
    }

    @JvmStatic
    @InterfaceC4488a
    @Keep
    public static final boolean isOnUIThread() {
        return INSTANCE.isOnUIThread();
    }

    @JvmStatic
    @InterfaceC4488a
    @Keep
    public static final void runOnUIThread(@NotNull Runnable runnable) {
        INSTANCE.runOnUIThread(runnable);
    }

    @JvmStatic
    @InterfaceC4488a
    @Keep
    public static final void setCurrentThreadName(@NotNull String str) {
        INSTANCE.setCurrentThreadName(str);
    }
}
