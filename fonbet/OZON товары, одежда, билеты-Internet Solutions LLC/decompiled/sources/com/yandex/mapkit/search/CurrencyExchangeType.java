package com.yandex.mapkit.search;

import com.yandex.mapkit.Money;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class CurrencyExchangeType implements Serializable {
    private Money buy;
    private boolean buy__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;
    private Money sell;
    private boolean sell__is_initialized;

    public CurrencyExchangeType() {
        this.name__is_initialized = false;
        this.buy__is_initialized = false;
        this.sell__is_initialized = false;
    }

    private native Money getBuy__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::CurrencyExchangeType";
    }

    private native Money getSell__Native();

    private native NativeObject init(String str, Money money, Money money2);

    public synchronized Money getBuy() {
        try {
            if (!this.buy__is_initialized) {
                this.buy = getBuy__Native();
                this.buy__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.buy;
    }

    public synchronized String getName() {
        try {
            if (!this.name__is_initialized) {
                this.name = getName__Native();
                this.name__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.name;
    }

    public synchronized Money getSell() {
        try {
            if (!this.sell__is_initialized) {
                this.sell = getSell__Native();
                this.sell__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.sell;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getName(), true);
            archive.add((Archive) getBuy(), true, (Class<Archive>) Money.class);
            archive.add((Archive) getSell(), true, (Class<Archive>) Money.class);
            return;
        }
        this.name = archive.add(this.name, true);
        this.name__is_initialized = true;
        this.buy = (Money) archive.add((Archive) this.buy, true, (Class<Archive>) Money.class);
        this.buy__is_initialized = true;
        Money money = (Money) archive.add((Archive) this.sell, true, (Class<Archive>) Money.class);
        this.sell = money;
        this.sell__is_initialized = true;
        this.nativeObject = init(this.name, this.buy, money);
    }

    public CurrencyExchangeType(String str, Money money, Money money2) {
        this.name__is_initialized = false;
        this.buy__is_initialized = false;
        this.sell__is_initialized = false;
        this.nativeObject = init(str, money, money2);
        this.name = str;
        this.name__is_initialized = true;
        this.buy = money;
        this.buy__is_initialized = true;
        this.sell = money2;
        this.sell__is_initialized = true;
    }

    private CurrencyExchangeType(NativeObject nativeObject) {
        this.name__is_initialized = false;
        this.buy__is_initialized = false;
        this.sell__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
