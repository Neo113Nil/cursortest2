package ru.ozon.app.android.analytics.performance;

import Qj0.I;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/analytics/performance/MessengerPerformanceTrackerInterceptor;", "LQj0/I;", "<init>", "()V", "LQj0/I$b;", "pages", "()LQj0/I$b;", "LQj0/I$a;", "chain", "", "intercept", "(LQj0/I$a;)Z", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessengerPerformanceTrackerInterceptor extends I {
    @Override // Qj0.I
    public boolean intercept(@NotNull I.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return true;
    }

    @Override // Qj0.I
    @NotNull
    public I.b pages() {
        String[] elements = {"communications_chats", "communications_chat_detail"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new I.b(C7705l.j0(elements));
    }
}
