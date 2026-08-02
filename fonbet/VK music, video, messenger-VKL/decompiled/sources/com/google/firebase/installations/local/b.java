package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallation;

/* compiled from: PersistedInstallationEntry.java */
/* loaded from: classes.dex */
public abstract class b {
    public static final /* synthetic */ int a = 0;

    /* compiled from: PersistedInstallationEntry.java */
    public static abstract class a {
    }

    static {
        PersistedInstallation.RegistrationStatus registrationStatus = PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
        if (registrationStatus == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        new com.google.firebase.installations.local.a(null, registrationStatus, null, null, 0L, 0L, null);
    }

    @Nullable
    public abstract String a();

    public abstract long b();

    @Nullable
    public abstract String c();

    @Nullable
    public abstract String d();

    @Nullable
    public abstract String e();

    @NonNull
    public abstract PersistedInstallation.RegistrationStatus f();

    public abstract long g();
}
