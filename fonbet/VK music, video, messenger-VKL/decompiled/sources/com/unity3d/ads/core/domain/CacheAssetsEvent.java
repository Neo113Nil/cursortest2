package com.unity3d.ads.core.domain;

import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: CacheAssets.kt */
/* loaded from: classes14.dex */
public abstract class CacheAssetsEvent {

    /* compiled from: CacheAssets.kt */
    public static final class Failure extends CacheAssetsEvent {
        private final String message;

        public Failure(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.message;
            }
            return failure.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final Failure copy(String str) {
            return new Failure(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && epx.f(this.message, ((Failure) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return ho8.a(new StringBuilder("Failure(message="), this.message, ')');
        }
    }

    /* compiled from: CacheAssets.kt */
    public static final class Success extends CacheAssetsEvent {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ CacheAssetsEvent(zcl zclVar) {
        this();
    }

    private CacheAssetsEvent() {
    }
}
