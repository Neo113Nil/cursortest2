package ru.ozon.android.messenger.framework.presentation.common.notification;

import android.content.Context;
import androidx.core.app.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface i {

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f90792a;

        public a(@NotNull Context applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            this.f90792a = applicationContext;
        }

        public final boolean a() {
            Context context = this.f90792a;
            Intrinsics.checkNotNullParameter(context, "context");
            return n.e(context).a();
        }
    }
}
