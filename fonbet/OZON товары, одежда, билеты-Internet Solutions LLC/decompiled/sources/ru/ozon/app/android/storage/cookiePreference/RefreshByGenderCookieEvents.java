package ru.ozon.app.android.storage.cookiePreference;

import Ae.B0;
import Ae.C0;
import Ae.E0;
import Ae.w0;
import He.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;", "", "<init>", "()V", "", "uuid", "", "refreshByGenderCookieChanged", "(Ljava/lang/String;)V", "Lxe/M;", "scope", "Lxe/M;", "LAe/w0;", "_flow", "LAe/w0;", "LAe/B0;", "flow", "LAe/B0;", "getFlow", "()LAe/B0;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RefreshByGenderCookieEvents {

    @NotNull
    private final w0<String> _flow;

    @NotNull
    private final B0<String> flow;

    @NotNull
    private final M scope;

    public RefreshByGenderCookieEvents() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(b.f10879b);
        C0 b11 = E0.b(1, 0, null, 6);
        this._flow = b11;
        this.flow = b11;
    }

    @NotNull
    public final B0<String> getFlow() {
        return this.flow;
    }

    public final void refreshByGenderCookieChanged(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        C10727i.c(this.scope, null, null, new RefreshByGenderCookieEvents$refreshByGenderCookieChanged$1(this, uuid, null), 3);
    }
}
