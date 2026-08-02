package com.yandex.mapkit.search;

import com.yandex.mapkit.Money;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class ParkingAttributes implements Serializable {
    private Money firstHourPrice;
    private boolean firstHourPrice__is_initialized;
    private NativeObject nativeObject;
    private String orgURI;
    private boolean orgURI__is_initialized;
    private Integer placesCount;
    private boolean placesCount__is_initialized;

    public ParkingAttributes() {
        this.orgURI__is_initialized = false;
        this.firstHourPrice__is_initialized = false;
        this.placesCount__is_initialized = false;
    }

    private native Money getFirstHourPrice__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::ParkingAttributes";
    }

    private native String getOrgURI__Native();

    private native Integer getPlacesCount__Native();

    private native NativeObject init(String str, Money money, Integer num);

    public synchronized Money getFirstHourPrice() {
        try {
            if (!this.firstHourPrice__is_initialized) {
                this.firstHourPrice = getFirstHourPrice__Native();
                this.firstHourPrice__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.firstHourPrice;
    }

    public synchronized String getOrgURI() {
        try {
            if (!this.orgURI__is_initialized) {
                this.orgURI = getOrgURI__Native();
                this.orgURI__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.orgURI;
    }

    public synchronized Integer getPlacesCount() {
        try {
            if (!this.placesCount__is_initialized) {
                this.placesCount = getPlacesCount__Native();
                this.placesCount__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.placesCount;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getOrgURI(), true);
            archive.add((Archive) getFirstHourPrice(), true, (Class<Archive>) Money.class);
            archive.add(getPlacesCount(), true);
            return;
        }
        this.orgURI = archive.add(this.orgURI, true);
        this.orgURI__is_initialized = true;
        this.firstHourPrice = (Money) archive.add((Archive) this.firstHourPrice, true, (Class<Archive>) Money.class);
        this.firstHourPrice__is_initialized = true;
        Integer add = archive.add(this.placesCount, true);
        this.placesCount = add;
        this.placesCount__is_initialized = true;
        this.nativeObject = init(this.orgURI, this.firstHourPrice, add);
    }

    public ParkingAttributes(String str, Money money, Integer num) {
        this.orgURI__is_initialized = false;
        this.firstHourPrice__is_initialized = false;
        this.placesCount__is_initialized = false;
        this.nativeObject = init(str, money, num);
        this.orgURI = str;
        this.orgURI__is_initialized = true;
        this.firstHourPrice = money;
        this.firstHourPrice__is_initialized = true;
        this.placesCount = num;
        this.placesCount__is_initialized = true;
    }

    private ParkingAttributes(NativeObject nativeObject) {
        this.orgURI__is_initialized = false;
        this.firstHourPrice__is_initialized = false;
        this.placesCount__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
