package com.vk.search.params.impl.presentation.modal.location.mvi.model;

import com.vk.search.params.api.City;
import xsna.asp;
import xsna.epx;
import xsna.oyz;
import xsna.qoy;
import xsna.wfg0;
import xsna.zrp;

/* compiled from: LocationSearchState.kt */
/* loaded from: classes5.dex */
public final class LocationSearchState implements oyz {
    public final a b;
    public final b c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocationSearchState.kt */
    public static final class LocationErrorType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LocationErrorType[] $VALUES;
        public static final LocationErrorType FETCH_FAILED;
        public static final LocationErrorType PERMISSION_DENIED;
        public static final LocationErrorType SERVICE_DISABLED;

        static {
            LocationErrorType locationErrorType = new LocationErrorType("PERMISSION_DENIED", 0);
            PERMISSION_DENIED = locationErrorType;
            LocationErrorType locationErrorType2 = new LocationErrorType("SERVICE_DISABLED", 1);
            SERVICE_DISABLED = locationErrorType2;
            LocationErrorType locationErrorType3 = new LocationErrorType("FETCH_FAILED", 2);
            FETCH_FAILED = locationErrorType3;
            LocationErrorType[] locationErrorTypeArr = {locationErrorType, locationErrorType2, locationErrorType3};
            $VALUES = locationErrorTypeArr;
            $ENTRIES = new asp(locationErrorTypeArr);
        }

        public LocationErrorType() {
            throw null;
        }

        public static LocationErrorType valueOf(String str) {
            return (LocationErrorType) Enum.valueOf(LocationErrorType.class, str);
        }

        public static LocationErrorType[] values() {
            return (LocationErrorType[]) $VALUES.clone();
        }
    }

    /* compiled from: LocationSearchState.kt */
    public interface a extends oyz {

        /* compiled from: LocationSearchState.kt */
        /* renamed from: com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState$a$a, reason: collision with other inner class name */
        public interface InterfaceC1772a extends a {
            wfg0 k();
        }

        /* compiled from: LocationSearchState.kt */
        public interface b extends a {
            wfg0 B();
        }

        /* compiled from: LocationSearchState.kt */
        public static final class c implements a {
            public static final c b = new c();
        }

        /* compiled from: LocationSearchState.kt */
        public static final class d implements InterfaceC1772a {
            public final LocationErrorType b;
            public final boolean c;
            public final boolean d;
            public final wfg0 e;

            public d(LocationErrorType locationErrorType, boolean z, boolean z2, wfg0 wfg0Var) {
                this.b = locationErrorType;
                this.c = z;
                this.d = z2;
                this.e = wfg0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && epx.f(this.e, dVar.e);
            }

            public final int hashCode() {
                int b = qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
                wfg0 wfg0Var = this.e;
                return b + (wfg0Var == null ? 0 : wfg0Var.hashCode());
            }

            @Override // com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState.a.InterfaceC1772a
            public final wfg0 k() {
                return this.e;
            }

            public final String toString() {
                return "Error(errorType=" + this.b + ", canRetry=" + this.c + ", isResolving=" + this.d + ", fallbackAddressResult=" + this.e + ')';
            }
        }

        /* compiled from: LocationSearchState.kt */
        public static final class e implements b {
            public final wfg0 b;

            public e(wfg0 wfg0Var) {
                this.b = wfg0Var;
            }

            @Override // com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState.a.b
            public final wfg0 B() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Initial(addressResult=" + this.b + ')';
            }
        }

        /* compiled from: LocationSearchState.kt */
        public static final class f implements InterfaceC1772a {
            public final wfg0 b;

            public f() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                wfg0 wfg0Var = this.b;
                if (wfg0Var == null) {
                    return 0;
                }
                return wfg0Var.hashCode();
            }

            @Override // com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState.a.InterfaceC1772a
            public final wfg0 k() {
                return this.b;
            }

            public final String toString() {
                return "Processing(fallbackAddressResult=" + this.b + ')';
            }

            public f(wfg0 wfg0Var) {
                this.b = wfg0Var;
            }
        }

        /* compiled from: LocationSearchState.kt */
        public static final class g implements b {
            public final wfg0 b;

            public g(wfg0 wfg0Var) {
                this.b = wfg0Var;
            }

            @Override // com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState.a.b
            public final wfg0 B() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Success(addressResult=" + this.b + ')';
            }
        }
    }

    /* compiled from: LocationSearchState.kt */
    public interface b {

        /* compiled from: LocationSearchState.kt */
        public static final class a implements b {
            public final City a;

            public a(City city) {
                this.a = city;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                City city = this.a;
                if (city == null) {
                    return 0;
                }
                return city.hashCode();
            }

            public final String toString() {
                return "Database(city=" + this.a + ')';
            }
        }

        /* compiled from: LocationSearchState.kt */
        /* renamed from: com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState$b$b, reason: collision with other inner class name */
        public static final class C1773b implements b {
            public static final C1773b a = new C1773b();
        }
    }

    public LocationSearchState() {
        this(0);
    }

    public static LocationSearchState a(LocationSearchState locationSearchState, a aVar, b bVar, int i) {
        if ((i & 1) != 0) {
            aVar = locationSearchState.b;
        }
        if ((i & 2) != 0) {
            bVar = locationSearchState.c;
        }
        locationSearchState.getClass();
        return new LocationSearchState(aVar, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSearchState)) {
            return false;
        }
        LocationSearchState locationSearchState = (LocationSearchState) obj;
        return epx.f(this.b, locationSearchState.b) && epx.f(this.c, locationSearchState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "LocationSearchState(locationState=" + this.b + ", resultItemSource=" + this.c + ')';
    }

    public LocationSearchState(a aVar, b bVar) {
        this.b = aVar;
        this.c = bVar;
    }

    public /* synthetic */ LocationSearchState(int i) {
        this(a.c.b, new b.a(null));
    }
}
