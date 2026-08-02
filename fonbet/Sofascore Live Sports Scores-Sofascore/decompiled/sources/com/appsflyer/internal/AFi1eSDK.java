package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.duf;
import defpackage.fuf;
import defpackage.lnb;
import defpackage.p2g;
import defpackage.ph0;
import defpackage.rfg;
import defpackage.u2g;
import defpackage.w2g;
import java.util.ConcurrentModificationException;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFi1eSDK {

    @NotNull
    private final Intent d;

    public AFi1eSDK(@NotNull Intent intent) {
        intent.getClass();
        this.d = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0015, B:8:0x0077, B:14:0x007e, B:29:0x006f, B:37:0x000d, B:4:0x0005), top: B:3:0x0005, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> T AFLogger(Function0<? extends T> function0, String str, T t, boolean z) {
        T u2gVar;
        T t2;
        T t3;
        Throwable a;
        synchronized (this.d) {
            try {
                p2g p2gVar = w2g.b;
                u2gVar = function0.invoke();
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            fuf fufVar = duf.a;
            KClass[] kClassArr = {fufVar.getOrCreateKotlinClass(ConcurrentModificationException.class), fufVar.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            Throwable a2 = w2g.a(u2gVar);
            if (a2 == null) {
                t3 = t;
            } else {
                try {
                    try {
                        if (!ph0.v(kClassArr, fufVar.getOrCreateKotlinClass(a2.getClass()))) {
                            throw a2;
                        }
                        if (z) {
                            T t4 = t;
                            u2gVar = AFLogger(function0, str, t4, false);
                            t3 = t4;
                        } else {
                            T t5 = t;
                            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, str, a2, false, false, false, false, 72, null);
                            u2gVar = t5;
                            t3 = t5;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        t2 = fufVar;
                        p2g p2gVar3 = w2g.b;
                        u2gVar = new u2g(th);
                        t3 = t2;
                        a = w2g.a(u2gVar);
                        if (a == null) {
                        }
                        return (T) u2gVar;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    t2 = t;
                }
            }
            a = w2g.a(u2gVar);
            if (a == null) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, str, a, false, false, false, false, 72, null);
                u2gVar = t3;
            }
        }
        return (T) u2gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Parcelable Q_(AFi1eSDK aFi1eSDK, String str) {
        return aFi1eSDK.d.getParcelableExtra(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent R_(AFi1eSDK aFi1eSDK, String str, long j) {
        return aFi1eSDK.d.putExtra(str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterClient(AFi1eSDK aFi1eSDK, String str) {
        return aFi1eSDK.d.getStringExtra(str);
    }

    @Nullable
    public final <T extends Parcelable> T O_(@NotNull String str) {
        str.getClass();
        return (T) AFLogger(new s(this, str, 1), lnb.o("Error while trying to read ", str, " extra from intent"), null, true);
    }

    @Nullable
    public final Intent P_(@NotNull String str, long j) {
        str.getClass();
        return (Intent) AFLogger(new rfg(this, str, j, 1), lnb.o("Error while trying to write ", str, " extra to intent"), null, true);
    }

    public final boolean d(@NotNull String str) {
        str.getClass();
        Boolean bool = (Boolean) AFLogger(new s(this, str, 0), lnb.o("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(AFi1eSDK aFi1eSDK, String str) {
        return aFi1eSDK.d.hasExtra(str);
    }

    @Nullable
    public final String AFLogger(@NotNull String str) {
        str.getClass();
        return (String) AFLogger(new s(this, str, 2), lnb.o("Error while trying to read ", str, " extra from intent"), null, true);
    }
}
