package com.yandex.mapkit.search;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class Address implements Serializable {
    private String additionalInfo;
    private boolean additionalInfo__is_initialized;
    private List<Component> components;
    private boolean components__is_initialized;
    private String countryCode;
    private boolean countryCode__is_initialized;
    private String formattedAddress;
    private boolean formattedAddress__is_initialized;
    private NativeObject nativeObject;
    private String postalCode;
    private boolean postalCode__is_initialized;

    public Address() {
        this.formattedAddress__is_initialized = false;
        this.additionalInfo__is_initialized = false;
        this.postalCode__is_initialized = false;
        this.countryCode__is_initialized = false;
        this.components__is_initialized = false;
    }

    private native String getAdditionalInfo__Native();

    private native List<Component> getComponents__Native();

    private native String getCountryCode__Native();

    private native String getFormattedAddress__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Address";
    }

    private native String getPostalCode__Native();

    private native NativeObject init(String str, String str2, String str3, String str4, List<Component> list);

    public synchronized String getAdditionalInfo() {
        try {
            if (!this.additionalInfo__is_initialized) {
                this.additionalInfo = getAdditionalInfo__Native();
                this.additionalInfo__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.additionalInfo;
    }

    @NonNull
    public synchronized List<Component> getComponents() {
        try {
            if (!this.components__is_initialized) {
                this.components = getComponents__Native();
                this.components__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.components;
    }

    public synchronized String getCountryCode() {
        try {
            if (!this.countryCode__is_initialized) {
                this.countryCode = getCountryCode__Native();
                this.countryCode__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.countryCode;
    }

    @NonNull
    public synchronized String getFormattedAddress() {
        try {
            if (!this.formattedAddress__is_initialized) {
                this.formattedAddress = getFormattedAddress__Native();
                this.formattedAddress__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.formattedAddress;
    }

    public synchronized String getPostalCode() {
        try {
            if (!this.postalCode__is_initialized) {
                this.postalCode = getPostalCode__Native();
                this.postalCode__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.postalCode;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getFormattedAddress(), false);
            archive.add(getAdditionalInfo(), true);
            archive.add(getPostalCode(), true);
            archive.add(getCountryCode(), true);
            C2616s.f(Component.class, archive, getComponents(), false);
            return;
        }
        this.formattedAddress = archive.add(this.formattedAddress, false);
        this.formattedAddress__is_initialized = true;
        this.additionalInfo = archive.add(this.additionalInfo, true);
        this.additionalInfo__is_initialized = true;
        this.postalCode = archive.add(this.postalCode, true);
        this.postalCode__is_initialized = true;
        this.countryCode = archive.add(this.countryCode, true);
        this.countryCode__is_initialized = true;
        List<Component> d11 = G.d(Component.class, archive, this.components, false);
        this.components = d11;
        this.components__is_initialized = true;
        this.nativeObject = init(this.formattedAddress, this.additionalInfo, this.postalCode, this.countryCode, d11);
    }

    public static class Component implements Serializable {
        private List<Kind> kinds;
        private boolean kinds__is_initialized;
        private String name;
        private boolean name__is_initialized;
        private NativeObject nativeObject;

        public enum Kind {
            UNKNOWN,
            COUNTRY,
            REGION,
            PROVINCE,
            AREA,
            LOCALITY,
            DISTRICT,
            STREET,
            HOUSE,
            ENTRANCE,
            LEVEL,
            APARTMENT,
            ROUTE,
            STATION,
            METRO_STATION,
            RAILWAY_STATION,
            VEGETATION,
            HYDRO,
            AIRPORT,
            OTHER
        }

        public Component() {
            this.name__is_initialized = false;
            this.kinds__is_initialized = false;
        }

        private native List<Kind> getKinds__Native();

        private native String getName__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::Address::Component";
        }

        private native NativeObject init(String str, List<Kind> list);

        @NonNull
        public synchronized List<Kind> getKinds() {
            try {
                if (!this.kinds__is_initialized) {
                    this.kinds = getKinds__Native();
                    this.kinds__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.kinds;
        }

        @NonNull
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

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add(getName(), false);
                archive.add((List) getKinds(), false, (ArchivingHandler) new EnumHandler(Kind.class));
                return;
            }
            this.name = archive.add(this.name, false);
            this.name__is_initialized = true;
            List<Kind> add = archive.add((List) this.kinds, false, (ArchivingHandler) new EnumHandler(Kind.class));
            this.kinds = add;
            this.kinds__is_initialized = true;
            this.nativeObject = init(this.name, add);
        }

        public Component(@NonNull String str, @NonNull List<Kind> list) {
            this.name__is_initialized = false;
            this.kinds__is_initialized = false;
            if (str == null) {
                throw new IllegalArgumentException("Required field \"name\" cannot be null");
            }
            if (list != null) {
                this.nativeObject = init(str, list);
                this.name = str;
                this.name__is_initialized = true;
                this.kinds = list;
                this.kinds__is_initialized = true;
                return;
            }
            throw new IllegalArgumentException("Required field \"kinds\" cannot be null");
        }

        private Component(NativeObject nativeObject) {
            this.name__is_initialized = false;
            this.kinds__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public Address(@NonNull String str, String str2, String str3, String str4, @NonNull List<Component> list) {
        this.formattedAddress__is_initialized = false;
        this.additionalInfo__is_initialized = false;
        this.postalCode__is_initialized = false;
        this.countryCode__is_initialized = false;
        this.components__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"formattedAddress\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(str, str2, str3, str4, list);
            this.formattedAddress = str;
            this.formattedAddress__is_initialized = true;
            this.additionalInfo = str2;
            this.additionalInfo__is_initialized = true;
            this.postalCode = str3;
            this.postalCode__is_initialized = true;
            this.countryCode = str4;
            this.countryCode__is_initialized = true;
            this.components = list;
            this.components__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"components\" cannot be null");
    }

    private Address(NativeObject nativeObject) {
        this.formattedAddress__is_initialized = false;
        this.additionalInfo__is_initialized = false;
        this.postalCode__is_initialized = false;
        this.countryCode__is_initialized = false;
        this.components__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
