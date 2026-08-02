package ru.ozon.android.messenger.framework.presentation.models.responses;

import C.o0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final q f91524a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f91525b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f91526c;

    /* renamed from: d, reason: collision with root package name */
    private final String f91527d;

    /* renamed from: e, reason: collision with root package name */
    private final String f91528e;

    public n(q qVar, @NotNull j status, Map<String, MessengerTrackingInfo> map, String str, String str2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f91524a = qVar;
        this.f91525b = status;
        this.f91526c = map;
        this.f91527d = str;
        this.f91528e = str2;
    }

    public final String a() {
        return this.f91528e;
    }

    public final q b() {
        return this.f91524a;
    }

    public final String c() {
        return this.f91527d;
    }

    @NotNull
    public final j d() {
        return this.f91525b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f91524a, nVar.f91524a) && this.f91525b == nVar.f91525b && Intrinsics.d(this.f91526c, nVar.f91526c) && Intrinsics.d(this.f91527d, nVar.f91527d) && Intrinsics.d(this.f91528e, nVar.f91528e);
    }

    public final int hashCode() {
        q qVar = this.f91524a;
        int hashCode = (this.f91525b.hashCode() + ((qVar == null ? 0 : qVar.hashCode()) * 31)) * 31;
        Map<String, MessengerTrackingInfo> map = this.f91526c;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f91527d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f91528e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateMessageResponseVO(message=");
        sb2.append(this.f91524a);
        sb2.append(", status=");
        sb2.append(this.f91525b);
        sb2.append(", trackingInfo=");
        sb2.append(this.f91526c);
        sb2.append(", retryToken=");
        sb2.append(this.f91527d);
        sb2.append(", errorDescription=");
        return o0.c(sb2, this.f91528e, ")");
    }
}
