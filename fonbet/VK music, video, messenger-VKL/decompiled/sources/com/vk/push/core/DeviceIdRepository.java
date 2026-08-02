package com.vk.push.core;

import xsna.epx;
import xsna.ho8;
import xsna.ksr;
import xsna.spj;

/* compiled from: DeviceIdRepository.kt */
/* loaded from: classes.dex */
public interface DeviceIdRepository {

    /* compiled from: DeviceIdRepository.kt */
    /* loaded from: classes5.dex */
    public static final class DeviceIdError {
        public final Throwable a;
        public final String b;

        public DeviceIdError(Throwable th, String str) {
            this.a = th;
            this.b = str;
        }

        public static /* synthetic */ DeviceIdError copy$default(DeviceIdError deviceIdError, Throwable th, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                th = deviceIdError.a;
            }
            if ((i & 2) != 0) {
                str = deviceIdError.b;
            }
            return deviceIdError.copy(th, str);
        }

        public final Throwable component1() {
            return this.a;
        }

        public final String component2() {
            return this.b;
        }

        public final DeviceIdError copy(Throwable th, String str) {
            return new DeviceIdError(th, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceIdError)) {
                return false;
            }
            DeviceIdError deviceIdError = (DeviceIdError) obj;
            return epx.f(this.a, deviceIdError.a) && epx.f(this.b, deviceIdError.b);
        }

        public final Throwable getException() {
            return this.a;
        }

        public final String getMessage() {
            return this.b;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DeviceIdError(exception=");
            sb.append(this.a);
            sb.append(", message=");
            return ho8.a(sb, this.b, ')');
        }
    }

    Object getDeviceId(spj<? super String> spjVar);

    String getDeviceIdBlocking();

    ksr<DeviceIdError> getErrorsFlow();
}
