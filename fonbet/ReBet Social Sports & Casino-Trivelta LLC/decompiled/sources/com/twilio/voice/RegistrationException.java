package com.twilio.voice;

/* loaded from: classes4.dex */
public class RegistrationException extends VoiceException {
    public static final int EXCEPTION_REGISTRATION_ERROR = 31301;
    public static final int EXCEPTION_UNSUPPORTED_CANCEL_MESSAGE_ERROR = 31302;
    static final RegistrationException UnsupportedCancelMessageException = new RegistrationException(EXCEPTION_UNSUPPORTED_CANCEL_MESSAGE_ERROR, "Unsupported Cancel Message Error", "This version of the SDK no longer supports processing cancel push notification messages. You must register via Voice.register(...) on Android or [TwilioVoice registerWithAccessToken:deviceToken:completion:] on iOS with this version of the SDK to stop receiving cancel push notification messages. Cancellations are now handled internally and reported to you on behalf of the SDK.");
    public static final int EXCEPTION_CONFLICT = 31409;
    static final RegistrationException ConflictException = new RegistrationException(EXCEPTION_CONFLICT, "Conflict", "The request could not be processed because of a conflict in the current state of the resource. Another request may be in progress.");
    public static final int EXCEPTION_TOO_MANY_REQUEST = 31429;
    static final RegistrationException TooManyRequestException = new RegistrationException(EXCEPTION_TOO_MANY_REQUEST, "Too Many Requests", "Too many requests were sent in a given amount of time.");
    public static final int EXCEPTION_UPGRADE_REQUIRED = 31426;
    static final RegistrationException UpgradeRequiredException = new RegistrationException(EXCEPTION_UPGRADE_REQUIRED, "Upgrade Required", "The client should switch to a different protocol.");

    public RegistrationException(int i10, String str, String str2) {
        super(i10, str, str2);
    }
}
