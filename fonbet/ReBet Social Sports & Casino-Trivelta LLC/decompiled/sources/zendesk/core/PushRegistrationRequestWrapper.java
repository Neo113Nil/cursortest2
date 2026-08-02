package zendesk.core;

/* loaded from: classes5.dex */
class PushRegistrationRequestWrapper {

    @Gb.c("push_notification_device")
    private PushRegistrationRequest pushRegistrationRequest;

    public PushRegistrationRequestWrapper(PushRegistrationRequest pushRegistrationRequest) {
        this.pushRegistrationRequest = pushRegistrationRequest;
    }

    public PushRegistrationRequest getPushRegistrationRequest() {
        return this.pushRegistrationRequest;
    }
}
