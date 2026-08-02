package com.vk.mail.auth.contract.result.userblockstatus;

/* compiled from: MailBlockStatusError.kt */
/* loaded from: classes3.dex */
public abstract class MailBlockStatusError extends Throwable {
    private final String message;

    /* compiled from: MailBlockStatusError.kt */
    public static final class CheckAccBlockRequestException extends MailBlockStatusError {
        private final String message;

        public CheckAccBlockRequestException(String str) {
            super(str);
            this.message = str;
        }

        @Override // com.vk.mail.auth.contract.result.userblockstatus.MailBlockStatusError, java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    public MailBlockStatusError(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
