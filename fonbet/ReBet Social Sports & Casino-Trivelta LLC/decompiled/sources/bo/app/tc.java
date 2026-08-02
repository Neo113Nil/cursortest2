package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tc implements p9 {

    /* renamed from: a, reason: collision with root package name */
    public final BrazeConfigurationProvider f26082a;

    /* renamed from: b, reason: collision with root package name */
    public final uc f26083b;

    public tc(Context context, BrazeConfigurationProvider configurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f26082a = configurationProvider;
        this.f26083b = new uc(context);
    }

    public static final String a(Integer num, int i10) {
        return "Stored push registration ID version code " + num + " does not match live version code " + i10 + ". Not returning saved registration ID.";
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        if (r0 != r2.intValue()) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005a A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0001, B:5:0x000a, B:8:0x0050, B:10:0x005a, B:12:0x006f, B:16:0x0082, B:19:0x0016, B:21:0x0020, B:24:0x003b, B:27:0x0035), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized String b() {
        uc ucVar;
        DataStoreKey dataStoreKey;
        try {
            if (!this.f26082a.isFirebaseCloudMessagingRegistrationEnabled()) {
                if (this.f26082a.isAdmMessagingRegistrationEnabled()) {
                }
                ucVar = this.f26083b;
                dataStoreKey = DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID;
                if (ucVar.contains(dataStoreKey)) {
                    if (!Intrinsics.areEqual(String.valueOf(722989291), this.f26083b.readString(dataStoreKey, ""))) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.ib
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return bo.app.tc.a();
                            }
                        }, 6, (Object) null);
                        return null;
                    }
                }
                return this.f26083b.readString(DataStoreKey.PUSH_REGISTRATION_ID_KEY, null);
            }
            uc ucVar2 = this.f26083b;
            DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_REGISTRATION_VERSION_CODE;
            if (ucVar2.contains(dataStoreKey2)) {
                final int versionCode = this.f26082a.getVersionCode();
                final Integer readInt = this.f26083b.readInt(dataStoreKey2, Integer.MIN_VALUE);
                if (readInt != null) {
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.hb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.tc.a(readInt, versionCode);
                    }
                }, 6, (Object) null);
                return null;
            }
            ucVar = this.f26083b;
            dataStoreKey = DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID;
            if (ucVar.contains(dataStoreKey)) {
            }
            return this.f26083b.readString(DataStoreKey.PUSH_REGISTRATION_ID_KEY, null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static final String a() {
        return "Device identifier differs from saved device identifier. Returning null token.";
    }

    public final synchronized void a(String str) {
        if (str != null) {
            this.f26083b.writeData(DataStoreKey.PUSH_REGISTRATION_ID_KEY, str);
            this.f26083b.writeData(DataStoreKey.PUSH_REGISTRATION_VERSION_CODE, Integer.valueOf(this.f26082a.getVersionCode()));
            this.f26083b.writeData(DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID, String.valueOf(722989291));
        } else {
            throw new NullPointerException("Provided push token is null. Cannot set null push token.");
        }
    }
}
