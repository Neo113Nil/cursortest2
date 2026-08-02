package com.vk.search.params.impl.presentation.modal.location.mvi.model;

import com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState;
import xsna.epx;
import xsna.tn;
import xsna.wfg0;
import xsna.xl50;

/* compiled from: LocationSearchPatch.kt */
/* loaded from: classes5.dex */
public interface a extends xl50 {

    /* compiled from: LocationSearchPatch.kt */
    /* renamed from: com.vk.search.params.impl.presentation.modal.location.mvi.model.a$a, reason: collision with other inner class name */
    public static final class C1774a implements a {
        public final wfg0 b;

        public C1774a(wfg0 wfg0Var) {
            this.b = wfg0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1774a) && epx.f(this.b, ((C1774a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CurrentLocationAddressReceived(addressResult=" + this.b + ')';
        }
    }

    /* compiled from: LocationSearchPatch.kt */
    public static final class b implements a {
        public final LocationSearchState.LocationErrorType b;

        public b(LocationSearchState.LocationErrorType locationErrorType) {
            this.b = locationErrorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CurrentLocationFetchFailed(errorType=" + this.b + ')';
        }
    }

    /* compiled from: LocationSearchPatch.kt */
    public static final class c implements a {
        public static final c b = new c();
    }

    /* compiled from: LocationSearchPatch.kt */
    public static final class d implements a {
        public final boolean b;
        public final Boolean c;

        public /* synthetic */ d() {
            this(true, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            Boolean bool = this.c;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ErrorResolvingChanged(isResolving=");
            sb.append(this.b);
            sb.append(", canRetry=");
            return tn.a(sb, this.c, ')');
        }

        public d(boolean z, Boolean bool) {
            this.b = z;
            this.c = bool;
        }
    }

    /* compiled from: LocationSearchPatch.kt */
    public static final class e implements a {
        public final wfg0 b;
        public final LocationSearchState.b c;

        public e(wfg0 wfg0Var, LocationSearchState.b bVar) {
            this.b = wfg0Var;
            this.c = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            wfg0 wfg0Var = this.b;
            return this.c.hashCode() + ((wfg0Var == null ? 0 : wfg0Var.hashCode()) * 31);
        }

        public final String toString() {
            return "Initialized(initialAddressResult=" + this.b + ", initialResultItemSource=" + this.c + ')';
        }
    }

    /* compiled from: LocationSearchPatch.kt */
    public static final class f implements a {
        public final LocationSearchState.b b;

        public f(LocationSearchState.b bVar) {
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ResultItemSourceChanged(resultItemSource=" + this.b + ')';
        }
    }
}
