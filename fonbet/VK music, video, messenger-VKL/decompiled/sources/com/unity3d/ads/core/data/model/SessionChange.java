package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import xsna.epx;
import xsna.zcl;

/* compiled from: SessionChange.kt */
/* loaded from: classes14.dex */
public abstract class SessionChange {

    /* compiled from: SessionChange.kt */
    public static final class PrivacyFsmChange extends SessionChange {
        private final ByteString value;

        public PrivacyFsmChange(ByteString byteString) {
            super(null);
            this.value = byteString;
        }

        public static /* synthetic */ PrivacyFsmChange copy$default(PrivacyFsmChange privacyFsmChange, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = privacyFsmChange.value;
            }
            return privacyFsmChange.copy(byteString);
        }

        public final ByteString component1() {
            return this.value;
        }

        public final PrivacyFsmChange copy(ByteString byteString) {
            return new PrivacyFsmChange(byteString);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrivacyFsmChange) && epx.f(this.value, ((PrivacyFsmChange) obj).value);
        }

        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "PrivacyFsmChange(value=" + this.value + ')';
        }
    }

    /* compiled from: SessionChange.kt */
    public static final class UserConsentChange extends SessionChange {
        private final ByteString value;

        public UserConsentChange(ByteString byteString) {
            super(null);
            this.value = byteString;
        }

        public static /* synthetic */ UserConsentChange copy$default(UserConsentChange userConsentChange, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = userConsentChange.value;
            }
            return userConsentChange.copy(byteString);
        }

        public final ByteString component1() {
            return this.value;
        }

        public final UserConsentChange copy(ByteString byteString) {
            return new UserConsentChange(byteString);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserConsentChange) && epx.f(this.value, ((UserConsentChange) obj).value);
        }

        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "UserConsentChange(value=" + this.value + ')';
        }
    }

    public /* synthetic */ SessionChange(zcl zclVar) {
        this();
    }

    private SessionChange() {
    }
}
