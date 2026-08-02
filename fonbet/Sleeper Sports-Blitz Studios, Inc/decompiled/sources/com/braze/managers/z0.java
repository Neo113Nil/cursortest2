package com.braze.managers;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class z0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final BrazeConfigurationProvider f618a;
    public final a1 b;

    public z0(Context context, BrazeConfigurationProvider configurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f618a = configurationProvider;
        this.b = new a1(context);
    }

    public static final String a(Integer num, int i) {
        return "Stored push registration ID version code " + num + " does not match live version code " + i + ". Not returning saved registration ID.";
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r0 != r2.intValue()) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized String b() {
        if (this.f618a.isFirebaseCloudMessagingRegistrationEnabled() || this.f618a.isAdmMessagingRegistrationEnabled()) {
            a1 a1Var = this.b;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_REGISTRATION_VERSION_CODE;
            if (a1Var.contains(dataStoreKey)) {
                final int versionCode = this.f618a.getVersionCode();
                final Integer readInt = this.b.readInt(dataStoreKey, Integer.MIN_VALUE);
                if (readInt != null) {
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.z0$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return z0.a(readInt, versionCode);
                    }
                }, 6, (Object) null);
                return null;
            }
        }
        a1 a1Var2 = this.b;
        DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID;
        if (a1Var2.contains(dataStoreKey2)) {
            if (!Intrinsics.areEqual(String.valueOf(722989291), this.b.readString(dataStoreKey2, ""))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.z0$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return z0.a();
                    }
                }, 6, (Object) null);
                return null;
            }
        }
        return this.b.readString(DataStoreKey.PUSH_REGISTRATION_ID_KEY, null);
    }

    public static final String a() {
        return "Device identifier differs from saved device identifier. Returning null token.";
    }

    public final synchronized void a(String str) {
        if (str != null) {
            this.b.writeData(DataStoreKey.PUSH_REGISTRATION_ID_KEY, str);
            this.b.writeData(DataStoreKey.PUSH_REGISTRATION_VERSION_CODE, Integer.valueOf(this.f618a.getVersionCode()));
            this.b.writeData(DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID, String.valueOf(722989291));
        } else {
            throw new NullPointerException("Provided push token is null. Cannot set null push token.");
        }
    }
}
