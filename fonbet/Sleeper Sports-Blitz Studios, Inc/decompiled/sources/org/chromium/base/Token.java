package org.chromium.base;

import android.os.Bundle;
import com.google.errorprone.annotations.DoNotMock;
import internal.org.jni_zero.JNINamespace;

@DoNotMock("This is a simple value object.")
@JNINamespace("base::android")
/* loaded from: classes10.dex */
public final class Token extends TokenBase {
    private static final String KEY_HIGH = "high";
    private static final String KEY_LOW = "low";

    public interface Natives {
        Token createRandom();
    }

    public static Token createRandom() {
        return TokenJni.get().createRandom();
    }

    public Token(long high, long low) {
        super(high, low);
    }

    public boolean isZero() {
        return this.mHigh == 0 && this.mLow == 0;
    }

    public long getHigh() {
        return this.mHigh;
    }

    public long getLow() {
        return this.mLow;
    }

    public String toString() {
        return String.format("%016X%016X", Long.valueOf(this.mHigh), Long.valueOf(this.mLow));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong("high", getHigh());
        bundle.putLong("low", getLow());
        return bundle;
    }

    public static Token maybeCreateFromBundle(Bundle bundle) {
        if (bundle != null && bundle.containsKey("high") && bundle.containsKey("low")) {
            return new Token(bundle.getLong("high"), bundle.getLong("low"));
        }
        return null;
    }
}
