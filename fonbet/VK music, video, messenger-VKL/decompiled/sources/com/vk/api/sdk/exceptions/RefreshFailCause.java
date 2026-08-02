package com.vk.api.sdk.exceptions;

/* compiled from: UnableToRefreshAccessTokenException.kt */
/* loaded from: classes.dex */
public abstract class RefreshFailCause extends Throwable {

    /* compiled from: UnableToRefreshAccessTokenException.kt */
    public static final class EmptyTokenLoggedUser extends RefreshFailCause {
        public EmptyTokenLoggedUser() {
            super(0);
        }
    }

    /* compiled from: UnableToRefreshAccessTokenException.kt */
    public static final class EmptyTokenUnloggedUser extends RefreshFailCause {
        public EmptyTokenUnloggedUser() {
            super(0);
        }
    }

    /* compiled from: UnableToRefreshAccessTokenException.kt */
    /* loaded from: classes15.dex */
    public static final class InvalidToken extends RefreshFailCause {
        public InvalidToken() {
            super(0);
        }
    }

    public /* synthetic */ RefreshFailCause(int i) {
        this();
    }

    private RefreshFailCause() {
    }
}
