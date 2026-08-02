package ru.ozon.tracker.network;

import Nk.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.C;
import com.squareup.moshi.h;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mi0.InterfaceC8333c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.Namespace;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/tracker/network/NameSpaceAdapter;", "", "", "json", "Lru/ozon/tracker/sendEvent/Namespace;", "fromJson", "(Ljava/lang/String;)Lru/ozon/tracker/sendEvent/Namespace;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "toJson", "(Lru/ozon/tracker/sendEvent/Namespace;)Ljava/lang/String;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NameSpaceAdapter {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC8333c f97770a = null;

    public final void a(InterfaceC8333c interfaceC8333c) {
        this.f97770a = interfaceC8333c;
    }

    @h
    @NotNull
    public final Namespace fromJson(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        if (kotlin.text.h.e0(json, "test_", false)) {
            json = kotlin.text.h.S(json, "test_");
        }
        for (Namespace namespace : Namespace.values()) {
            if (kotlin.text.h.D(namespace.name(), json, true)) {
                return namespace;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @C
    @NotNull
    public final String toJson(@NotNull Namespace value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String lowerCase = value.name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        InterfaceC8333c interfaceC8333c = this.f97770a;
        return (interfaceC8333c == null || !interfaceC8333c.c()) ? lowerCase : a.b("test_", lowerCase);
    }
}
