package com.vk.superapp.api.dto.geo.coder;

import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bkt;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: GeoCodingResponse.kt */
/* loaded from: classes6.dex */
public final class GeoCodingResponseV1 extends bkt {

    @pmi0("request")
    private final a request;

    @pmi0("results")
    private final Results[] results;

    /* compiled from: GeoCodingResponse.kt */
    public static final class Geometry {

        @pmi0("bbox")
        private final List<Float> bbox;

        @pmi0("pin")
        private final List<Float> pin;

        public Geometry(List<Float> list, List<Float> list2) {
            this.bbox = list;
            this.pin = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Geometry)) {
                return false;
            }
            Geometry geometry = (Geometry) obj;
            return epx.f(this.bbox, geometry.bbox) && epx.f(this.pin, geometry.pin);
        }

        public final int hashCode() {
            return this.pin.hashCode() + (this.bbox.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Geometry(bbox=");
            sb.append(this.bbox);
            sb.append(", pin=");
            return ms9.a(')', sb, this.pin);
        }
    }

    /* compiled from: GeoCodingResponse.kt */
    public static final class Results {

        @pmi0(RTCStatsConstants.KEY_ADDRESS)
        private final String address;

        @pmi0("address_details")
        private final AddressDetails addressDetails;

        @pmi0("geometry")
        private final Geometry geometry;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final String kind;

        @pmi0("ref")
        private final String ref;

        @pmi0("weight")
        private final Float weight;

        public Results(String str, AddressDetails addressDetails, Geometry geometry, Float f, String str2, String str3) {
            this.address = str;
            this.addressDetails = addressDetails;
            this.geometry = geometry;
            this.weight = f;
            this.kind = str2;
            this.ref = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Results)) {
                return false;
            }
            Results results = (Results) obj;
            return epx.f(this.address, results.address) && epx.f(this.addressDetails, results.addressDetails) && epx.f(this.geometry, results.geometry) && epx.f(this.weight, results.weight) && epx.f(this.kind, results.kind) && epx.f(this.ref, results.ref);
        }

        public final int hashCode() {
            String str = this.address;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            AddressDetails addressDetails = this.addressDetails;
            int hashCode2 = (hashCode + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31;
            Geometry geometry = this.geometry;
            int hashCode3 = (hashCode2 + (geometry == null ? 0 : geometry.hashCode())) * 31;
            Float f = this.weight;
            int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
            String str2 = this.kind;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.ref;
            return hashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Results(address=");
            sb.append(this.address);
            sb.append(", addressDetails=");
            sb.append(this.addressDetails);
            sb.append(", geometry=");
            sb.append(this.geometry);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", ref=");
            return ho8.a(sb, this.ref, ')');
        }
    }

    /* compiled from: GeoCodingResponse.kt */
    public static abstract class a {

        /* compiled from: GeoCodingResponse.kt */
        /* renamed from: com.vk.superapp.api.dto.geo.coder.GeoCodingResponseV1$a$a, reason: collision with other inner class name */
        public static final class C1862a extends a {
            public final String a;

            public C1862a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1862a) && epx.f(this.a, ((C1862a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Address(address="), this.a, ')');
            }
        }

        /* compiled from: GeoCodingResponse.kt */
        public static final class b extends a {
            public final ArrayList a;

            public b(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return j.b(')', new StringBuilder("Coordinates(coordinates="), this.a);
            }
        }
    }

    public GeoCodingResponseV1(a aVar, Results[] resultsArr) {
        super(null);
        this.request = aVar;
        this.results = resultsArr;
    }

    public final a a() {
        return this.request;
    }

    public final Results[] b() {
        return this.results;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoCodingResponseV1)) {
            return false;
        }
        GeoCodingResponseV1 geoCodingResponseV1 = (GeoCodingResponseV1) obj;
        return epx.f(this.request, geoCodingResponseV1.request) && epx.f(this.results, geoCodingResponseV1.results);
    }

    public final int hashCode() {
        a aVar = this.request;
        return Arrays.hashCode(this.results) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    public final String toString() {
        return "GeoCodingResponseV1(request=" + this.request + ", results=" + Arrays.toString(this.results) + ')';
    }
}
