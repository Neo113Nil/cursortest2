package com.vk.ecomm.onlinebooking.impl.common;

import xsna.epx;
import xsna.ho8;

/* compiled from: BookingError.kt */
/* loaded from: classes18.dex */
public abstract class BookingError extends Exception {

    /* compiled from: BookingError.kt */
    public static final class MasterIsNotAvailable extends BookingError {
        private final String masterName;

        public MasterIsNotAvailable(String str) {
            super(0);
            this.masterName = str;
        }

        public final String d() {
            return this.masterName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MasterIsNotAvailable) && epx.f(this.masterName, ((MasterIsNotAvailable) obj).masterName);
        }

        public final int hashCode() {
            return this.masterName.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return ho8.a(new StringBuilder("MasterIsNotAvailable(masterName="), this.masterName, ')');
        }
    }

    /* compiled from: BookingError.kt */
    public static final class RecordCancellationException extends BookingError {
        static {
            new RecordCancellationException();
        }

        private RecordCancellationException() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RecordCancellationException);
        }

        public final int hashCode() {
            return -1926925854;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "RecordCancellationException";
        }
    }

    /* compiled from: BookingError.kt */
    public static final class ServiceIsNotAvailableForRebooking extends BookingError {
        public static final ServiceIsNotAvailableForRebooking b = new ServiceIsNotAvailableForRebooking();

        private ServiceIsNotAvailableForRebooking() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ServiceIsNotAvailableForRebooking);
        }

        public final int hashCode() {
            return -1531233255;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "ServiceIsNotAvailableForRebooking";
        }
    }

    public /* synthetic */ BookingError(int i) {
        this();
    }

    private BookingError() {
    }
}
