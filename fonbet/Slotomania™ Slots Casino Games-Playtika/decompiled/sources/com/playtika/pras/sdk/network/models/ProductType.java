package com.playtika.pras.sdk.network.models;

/* loaded from: classes7.dex */
public enum ProductType {
    SUBSCRIPTION("SUBS"),
    INAPP("INAPP");

    private final String type;

    ProductType(String str) {
        this.type = str;
    }

    public static ProductType fromString(String str) {
        for (ProductType productType : values()) {
            if (productType.getType().equals(str)) {
                return productType;
            }
        }
        return null;
    }

    public String getType() {
        return this.type;
    }
}
