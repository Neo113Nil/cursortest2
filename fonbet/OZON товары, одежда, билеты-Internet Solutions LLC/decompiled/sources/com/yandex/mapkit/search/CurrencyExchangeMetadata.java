package com.yandex.mapkit.search;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class CurrencyExchangeMetadata implements BaseMetadata, Serializable {
    private List<CurrencyExchangeType> currencies;
    private boolean currencies__is_initialized;
    private NativeObject nativeObject;

    public CurrencyExchangeMetadata() {
        this.currencies__is_initialized = false;
    }

    private native List<CurrencyExchangeType> getCurrencies__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::CurrencyExchangeMetadata";
    }

    private native NativeObject init(List<CurrencyExchangeType> list);

    @NonNull
    public synchronized List<CurrencyExchangeType> getCurrencies() {
        try {
            if (!this.currencies__is_initialized) {
                this.currencies = getCurrencies__Native();
                this.currencies__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.currencies;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            C2616s.f(CurrencyExchangeType.class, archive, getCurrencies(), false);
            return;
        }
        List<CurrencyExchangeType> d11 = G.d(CurrencyExchangeType.class, archive, this.currencies, false);
        this.currencies = d11;
        this.currencies__is_initialized = true;
        this.nativeObject = init(d11);
    }

    public CurrencyExchangeMetadata(@NonNull List<CurrencyExchangeType> list) {
        this.currencies__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.currencies = list;
            this.currencies__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"currencies\" cannot be null");
    }

    private CurrencyExchangeMetadata(NativeObject nativeObject) {
        this.currencies__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
