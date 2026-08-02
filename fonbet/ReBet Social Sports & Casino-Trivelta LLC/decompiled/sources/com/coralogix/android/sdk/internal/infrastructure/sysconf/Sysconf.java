package com.coralogix.android.sdk.internal.infrastructure.sysconf;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087 ¨\u0006\u0006"}, d2 = {"Lcom/coralogix/android/sdk/internal/infrastructure/sysconf/Sysconf;", "", "<init>", "()V", "getClockTicksPerSecond", "", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Sysconf {

    /* renamed from: a, reason: collision with root package name */
    public static final Sysconf f30176a = new Sysconf();

    static {
        System.loadLibrary("native-lib");
    }

    @JvmStatic
    public static final native int getClockTicksPerSecond();
}
