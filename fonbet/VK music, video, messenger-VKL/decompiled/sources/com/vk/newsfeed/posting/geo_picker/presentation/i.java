package com.vk.newsfeed.posting.geo_picker.presentation;

import com.vk.newsfeed.posting.geo_picker.presentation.PlacePickerState;
import com.vk.newsfeed.posting.geo_picker.presentation.model.PickerPlaceDto;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import xsna.epx;
import xsna.vu5;

/* compiled from: PlacePickerSideEffect.kt */
/* loaded from: classes4.dex */
public interface i {

    /* compiled from: PlacePickerSideEffect.kt */
    public interface a extends i {

        /* compiled from: PlacePickerSideEffect.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.i$a$a, reason: collision with other inner class name */
        public static final class C1417a implements a {
            public final PickerTechMetrics a;

            public C1417a(PickerTechMetrics pickerTechMetrics) {
                this.a = pickerTechMetrics;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1417a) && epx.f(this.a, ((C1417a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Close(techMetrics=" + this.a + ')';
            }
        }

        /* compiled from: PlacePickerSideEffect.kt */
        public static final class b implements a {
            public final PickerPlaceDto a;
            public final PickerTechMetrics b;

            public b(PickerPlaceDto pickerPlaceDto, PickerTechMetrics pickerTechMetrics) {
                this.a = pickerPlaceDto;
                this.b = pickerTechMetrics;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "CloseWithResult(place=" + this.a + ", techMetrics=" + this.b + ')';
            }
        }
    }

    /* compiled from: PlacePickerSideEffect.kt */
    public interface b extends i {

        /* compiled from: PlacePickerSideEffect.kt */
        public static final class a implements b {
            public final int a;
            public final int b;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PageLoaded(offset=");
                sb.append(this.a);
                sb.append(", totalCount=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: PlacePickerSideEffect.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.i$b$b, reason: collision with other inner class name */
        public static final class C1418b implements b {
            public static final C1418b a = new C1418b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1418b);
            }

            public final int hashCode() {
                return -211803163;
            }

            public final String toString() {
                return "Reloading";
            }
        }

        /* compiled from: PlacePickerSideEffect.kt */
        public static final class c implements b {
            public final PlacePickerState.LoadingState a;

            public c(PlacePickerState.LoadingState loadingState) {
                this.a = loadingState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "StateChanged(loadingState=" + this.a + ')';
            }
        }
    }
}
