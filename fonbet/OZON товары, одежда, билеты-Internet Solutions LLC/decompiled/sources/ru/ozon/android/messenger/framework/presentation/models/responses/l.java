package ru.ozon.android.messenger.framework.presentation.models.responses;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q f91516a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f91517b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f91518c;

    /* renamed from: d, reason: collision with root package name */
    private final String f91519d;

    public l(@NotNull q message, @NotNull j status, Map<String, MessengerTrackingInfo> map, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f91516a = message;
        this.f91517b = status;
        this.f91518c = map;
        this.f91519d = str;
    }

    @NotNull
    public final q a() {
        return this.f91516a;
    }

    public final String b() {
        return this.f91519d;
    }

    @NotNull
    public final j c() {
        return this.f91517b;
    }

    public final Map<String, MessengerTrackingInfo> d() {
        return this.f91518c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f91516a, lVar.f91516a) && this.f91517b == lVar.f91517b && Intrinsics.d(this.f91518c, lVar.f91518c) && Intrinsics.d(this.f91519d, lVar.f91519d);
    }

    public final int hashCode() {
        int hashCode = (this.f91517b.hashCode() + (this.f91516a.hashCode() * 31)) * 31;
        Map<String, MessengerTrackingInfo> map = this.f91518c;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f91519d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SendMessageResponseVO(message=" + this.f91516a + ", status=" + this.f91517b + ", trackingInfo=" + this.f91518c + ", retryToken=" + this.f91519d + ")";
    }
}
