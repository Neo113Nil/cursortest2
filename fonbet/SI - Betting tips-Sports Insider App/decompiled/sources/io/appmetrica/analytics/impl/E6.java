package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class E6 implements DataSendingRestrictionController {

    /* renamed from: a, reason: collision with root package name */
    public final C6 f12186a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f12187b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f12188c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f12189d = new HashSet();

    public E6(@NonNull C6 c62) {
        this.f12186a = c62;
        this.f12187b = ((D6) c62).a();
    }

    public final synchronized void a(Boolean bool) {
        try {
            if (!lo.a(bool)) {
                if (this.f12187b == null) {
                }
            }
            boolean equals = Boolean.FALSE.equals(bool);
            this.f12187b = Boolean.valueOf(equals);
            ((D6) this.f12186a).f12124a.c(equals).b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Boolean bool) {
        if (this.f12187b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.f12187b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter(@NonNull String str) {
        boolean z5;
        if (!this.f12188c.contains(str)) {
            z5 = Boolean.TRUE.equals(this.f12187b);
        }
        return z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f12187b;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool == null ? this.f12189d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(@NonNull String str, Boolean bool) {
        try {
            if (!lo.a(bool)) {
                if (!this.f12189d.contains(str) && !this.f12188c.contains(str)) {
                }
            }
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.f12189d.add(str);
                this.f12188c.remove(str);
            } else {
                this.f12188c.add(str);
                this.f12189d.remove(str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
