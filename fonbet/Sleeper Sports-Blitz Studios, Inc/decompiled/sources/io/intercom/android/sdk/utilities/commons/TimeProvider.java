package io.intercom.android.sdk.utilities.commons;

/* loaded from: classes9.dex */
public interface TimeProvider {
    public static final TimeProvider SYSTEM = new TimeProvider() { // from class: io.intercom.android.sdk.utilities.commons.TimeProvider$$ExternalSyntheticLambda0
        @Override // io.intercom.android.sdk.utilities.commons.TimeProvider
        public final long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    };

    long currentTimeMillis();
}
