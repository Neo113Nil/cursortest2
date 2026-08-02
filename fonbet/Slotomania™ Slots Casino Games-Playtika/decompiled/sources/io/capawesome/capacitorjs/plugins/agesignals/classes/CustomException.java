package io.capawesome.capacitorjs.plugins.agesignals.classes;

/* loaded from: classes5.dex */
public class CustomException extends Exception {
    private final String code;

    public CustomException(String str, String str2) {
        super(str2);
        this.code = str;
    }

    public String getCode() {
        return this.code;
    }
}
