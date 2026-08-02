package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetPersonalCard.kt */
/* loaded from: classes6.dex */
public final class GetPersonalCard$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetPersonalCard$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetPersonalCard$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPersonalCard$Response)) {
            return false;
        }
        GetPersonalCard$Response getPersonalCard$Response = (GetPersonalCard$Response) obj;
        return epx.f(this.type, getPersonalCard$Response.type) && epx.f(this.data, getPersonalCard$Response.data) && epx.f(this.requestId, getPersonalCard$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    /* compiled from: GetPersonalCard.kt */
    public static final class Data {

        @pmi0(RTCStatsConstants.KEY_ADDRESS)
        private final Address address;

        @pmi0("email")
        private final String email;

        @pmi0("phone")
        private final String phone;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        /* compiled from: GetPersonalCard.kt */
        public static final class Address {

            @pmi0("city")
            private final City city;

            @pmi0("country")
            private final Country country;

            @pmi0("postal_code")
            private final String postalCode;

            @pmi0("specified_address")
            private final String specifiedAddress;

            /* compiled from: GetPersonalCard.kt */
            public static final class City {

                @pmi0("id")
                private final Integer id;

                @pmi0("name")
                private final String name;

                /* JADX WARN: Multi-variable type inference failed */
                public City() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof City)) {
                        return false;
                    }
                    City city = (City) obj;
                    return epx.f(this.id, city.id) && epx.f(this.name, city.name);
                }

                public final int hashCode() {
                    Integer num = this.id;
                    int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                    String str = this.name;
                    return hashCode + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("City(id=");
                    sb.append(this.id);
                    sb.append(", name=");
                    return ho8.a(sb, this.name, ')');
                }

                public City(Integer num, String str) {
                    this.id = num;
                    this.name = str;
                }

                public /* synthetic */ City(Integer num, String str, int i, zcl zclVar) {
                    this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
                }
            }

            /* compiled from: GetPersonalCard.kt */
            public static final class Country {

                @pmi0("id")
                private final Integer id;

                @pmi0("name")
                private final String name;

                /* JADX WARN: Multi-variable type inference failed */
                public Country() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Country)) {
                        return false;
                    }
                    Country country = (Country) obj;
                    return epx.f(this.id, country.id) && epx.f(this.name, country.name);
                }

                public final int hashCode() {
                    Integer num = this.id;
                    int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                    String str = this.name;
                    return hashCode + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Country(id=");
                    sb.append(this.id);
                    sb.append(", name=");
                    return ho8.a(sb, this.name, ')');
                }

                public Country(Integer num, String str) {
                    this.id = num;
                    this.name = str;
                }

                public /* synthetic */ Country(Integer num, String str, int i, zcl zclVar) {
                    this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
                }
            }

            public Address() {
                this(null, null, null, null, 15, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Address)) {
                    return false;
                }
                Address address = (Address) obj;
                return epx.f(this.country, address.country) && epx.f(this.city, address.city) && epx.f(this.specifiedAddress, address.specifiedAddress) && epx.f(this.postalCode, address.postalCode);
            }

            public final int hashCode() {
                Country country = this.country;
                int hashCode = (country == null ? 0 : country.hashCode()) * 31;
                City city = this.city;
                int hashCode2 = (hashCode + (city == null ? 0 : city.hashCode())) * 31;
                String str = this.specifiedAddress;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.postalCode;
                return hashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Address(country=");
                sb.append(this.country);
                sb.append(", city=");
                sb.append(this.city);
                sb.append(", specifiedAddress=");
                sb.append(this.specifiedAddress);
                sb.append(", postalCode=");
                return ho8.a(sb, this.postalCode, ')');
            }

            public Address(Country country, City city, String str, String str2) {
                this.country = country;
                this.city = city;
                this.specifiedAddress = str;
                this.postalCode = str2;
            }

            public /* synthetic */ Address(Country country, City city, String str, String str2, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : country, (i & 2) != 0 ? null : city, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
            }
        }

        public Data(String str, String str2, Address address, String str3) {
            this.phone = str;
            this.email = str2;
            this.address = address;
            this.requestId = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.phone, data.phone) && epx.f(this.email, data.email) && epx.f(this.address, data.address) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            String str = this.phone;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.email;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Address address = this.address;
            int hashCode3 = (hashCode2 + (address == null ? 0 : address.hashCode())) * 31;
            String str3 = this.requestId;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(phone=");
            sb.append(this.phone);
            sb.append(", email=");
            sb.append(this.email);
            sb.append(", address=");
            sb.append(this.address);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(String str, String str2, Address address, String str3, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : address, str3);
        }
    }

    public /* synthetic */ GetPersonalCard$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetPersonalCardResult" : str, data, str2);
    }
}
