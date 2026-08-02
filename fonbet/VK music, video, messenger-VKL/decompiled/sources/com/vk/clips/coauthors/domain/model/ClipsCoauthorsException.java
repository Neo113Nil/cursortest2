package com.vk.clips.coauthors.domain.model;

/* compiled from: ClipsCoauthorsException.kt */
/* loaded from: classes16.dex */
public abstract class ClipsCoauthorsException extends Exception {

    /* compiled from: ClipsCoauthorsException.kt */
    public static final class CoauthorsEmptyResponseException extends ClipsCoauthorsException {
        public CoauthorsEmptyResponseException() {
            super(0);
        }
    }

    /* compiled from: ClipsCoauthorsException.kt */
    public static final class CoauthorsNetworkException extends ClipsCoauthorsException {
        public CoauthorsNetworkException() {
            super(0);
        }
    }

    public /* synthetic */ ClipsCoauthorsException(int i) {
        this();
    }

    private ClipsCoauthorsException() {
    }
}
