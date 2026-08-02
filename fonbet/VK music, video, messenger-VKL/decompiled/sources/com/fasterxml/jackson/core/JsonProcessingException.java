package com.fasterxml.jackson.core;

/* loaded from: classes12.dex */
public class JsonProcessingException extends JacksonException {
    private static final long serialVersionUID = 123;
    protected JsonLocation _location;

    public JsonProcessingException(String str, JsonLocation jsonLocation, NumberFormatException numberFormatException) {
        super(str, numberFormatException);
        this._location = jsonLocation;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        JsonLocation jsonLocation = this._location;
        if (jsonLocation == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (jsonLocation != null) {
            sb.append("\n at ");
            sb.append(jsonLocation.toString());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
