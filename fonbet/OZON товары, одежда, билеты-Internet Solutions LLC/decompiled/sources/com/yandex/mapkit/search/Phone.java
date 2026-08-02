package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Phone implements Serializable {
    private String country;
    private String ext;
    private String formattedNumber;
    private String info;
    private String number;
    private String prefix;
    private PhoneType type;

    public Phone(@NonNull PhoneType phoneType, @NonNull String str, String str2, String str3, String str4, String str5, String str6) {
        if (phoneType == null) {
            throw new IllegalArgumentException("Required field \"type\" cannot be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("Required field \"formattedNumber\" cannot be null");
        }
        this.type = phoneType;
        this.formattedNumber = str;
        this.info = str2;
        this.country = str3;
        this.prefix = str4;
        this.ext = str5;
        this.number = str6;
    }

    public String getCountry() {
        return this.country;
    }

    public String getExt() {
        return this.ext;
    }

    @NonNull
    public String getFormattedNumber() {
        return this.formattedNumber;
    }

    public String getInfo() {
        return this.info;
    }

    public String getNumber() {
        return this.number;
    }

    public String getPrefix() {
        return this.prefix;
    }

    @NonNull
    public PhoneType getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (PhoneType) archive.add((Archive) this.type, false, (Class<Archive>) PhoneType.class);
        this.formattedNumber = archive.add(this.formattedNumber, false);
        this.info = archive.add(this.info, true);
        this.country = archive.add(this.country, true);
        this.prefix = archive.add(this.prefix, true);
        this.ext = archive.add(this.ext, true);
        this.number = archive.add(this.number, true);
    }

    public Phone() {
    }
}
