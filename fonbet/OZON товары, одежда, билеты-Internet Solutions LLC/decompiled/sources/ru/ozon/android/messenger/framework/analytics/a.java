package ru.ozon.android.messenger.framework.analytics;

import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.ActionType;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: ru.ozon.android.messenger.framework.analytics.a$a, reason: collision with other inner class name */
    static final class C1536a extends AbstractC7737t implements Function1<String, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1536a f86573b = new C1536a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String type = str;
            Intrinsics.checkNotNullParameter(type, "type");
            return Boolean.valueOf(Intrinsics.d(type, ActionType.CLOSE.INSTANCE.getType()));
        }
    }

    @NotNull
    public static final Map<String, MessengerTrackingInfo> a(Map<String, MessengerTrackingInfo> map) {
        Map<String, MessengerTrackingInfo> a11;
        return (map == null || (a11 = new b(C1536a.f86573b).a(map)) == null) ? U.c() : a11;
    }
}
