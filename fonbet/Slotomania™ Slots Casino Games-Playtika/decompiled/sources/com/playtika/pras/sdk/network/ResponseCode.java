package com.playtika.pras.sdk.network;

/* loaded from: classes8.dex */
public enum ResponseCode {
    RESULT_OK(0),
    RESULT_USER_CANCELED(1),
    RESULT_BILLING_UNAVAILABLE(3),
    RESULT_ITEM_UNAVAILABLE(4),
    RESULT_DEVELOPER_ERROR(5),
    RESULT_ERROR(6),
    RESULT_ITEM_ALREADY_OWNED(7),
    RESULT_ITEM_NOT_OWNED(8),
    RESULT_VERSION_NOT_SUPPORTED(9),
    RESULT_APP_VERSION_NOT_SUPPORTED(10),
    RESULT_INVALID_PIN_FORMAT(11),
    RESULT_PIN_EXISTS(12),
    RESULT_NO_PIN(13),
    RESULT_NO_PAYMENT_METHODS(14),
    RESULT_AMBIGUOUS_CUSTOMERS(15),
    RESULT_PIN_AUTHORIZATION_REQUIRED(16),
    RESULT_INVALID_PIN(17),
    RESULT_TIMEOUT(18),
    RESULT_INVALID_EMAIL(19),
    RESULT_MAINTENANCE_MODE(20),
    RESULT_SERVICE_UNAVAILABLE(21),
    RESULT_USER_BLOCKED(22),
    RESULT_PENDING(24),
    RESULT_WIDGET_LOADING_ERROR(25),
    RESULT_WEBVIEW_ERROR(30),
    RESULT_DOWNGRADE_NOT_SUPPORTED(26),
    RESULT_SHORTER_BILLING_CYCLE_NOT_SUPPORTED(27),
    RESULT_REPLACEMENT_ON_HOLD(28),
    RESULT_SAME_LEVEL_AND_BILLING_CYCLE(29);

    private int code;

    ResponseCode(int i) {
        this.code = i;
    }

    public static ResponseCode fromCode(int i) {
        for (ResponseCode responseCode : values()) {
            if (responseCode.getCode() == i) {
                return responseCode;
            }
        }
        return RESULT_ERROR;
    }

    public int getCode() {
        return this.code;
    }
}
