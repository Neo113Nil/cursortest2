package com.blaze.blazesdk.features.videos.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a implements Parcelable, j {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.features.videos.models.ui.a$a, reason: collision with other inner class name */
    public static final class C0011a extends a {

        @NotNull
        public static final Parcelable.Creator<C0011a> CREATOR = new C0012a();
        public final BlazeVideosPlayerStyle a;
        public final BlazeVideosPlayerStyle b;
        public final d c;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.blaze.blazesdk.features.videos.models.ui.a$a$a, reason: collision with other inner class name */
        public static final class C0012a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                Parcelable.Creator<BlazeVideosPlayerStyle> creator = BlazeVideosPlayerStyle.CREATOR;
                return new C0011a(creator.createFromParcel(parcel), creator.createFromParcel(parcel), (d) parcel.readParcelable(C0011a.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C0011a[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0011a(@NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle2, @NotNull d dVar) {
            super(null);
            blazeVideosPlayerStyle.getClass();
            blazeVideosPlayerStyle2.getClass();
            dVar.getClass();
            this.a = blazeVideosPlayerStyle;
            this.b = blazeVideosPlayerStyle2;
            this.c = dVar;
        }

        public static C0011a copy$default(C0011a c0011a, BlazeVideosPlayerStyle blazeVideosPlayerStyle, BlazeVideosPlayerStyle blazeVideosPlayerStyle2, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeVideosPlayerStyle = c0011a.a;
            }
            if ((i & 2) != 0) {
                blazeVideosPlayerStyle2 = c0011a.b;
            }
            if ((i & 4) != 0) {
                dVar = c0011a.c;
            }
            c0011a.getClass();
            blazeVideosPlayerStyle.getClass();
            blazeVideosPlayerStyle2.getClass();
            dVar.getClass();
            return new C0011a(blazeVideosPlayerStyle, blazeVideosPlayerStyle2, dVar);
        }

        @Override // com.blaze.blazesdk.features.videos.models.ui.j
        public final a a(c cVar) {
            cVar.getClass();
            return new C0011a(this.a, this.b, new d.C0014a(cVar));
        }

        @Override // com.blaze.blazesdk.features.videos.models.ui.a
        public final d b() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0011a)) {
                return false;
            }
            C0011a c0011a = (C0011a) obj;
            return Intrinsics.c(this.a, c0011a.a) && Intrinsics.c(this.b, c0011a.b) && Intrinsics.c(this.c, c0011a.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "InlineInteractive(interactivePlayerStyle=" + this.a + ", fullScreenPlayerStyle=" + this.b + ", maximizationState=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.a.writeToParcel(parcel, i);
            this.b.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, i);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends a {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new C0013a();
        public final BlazeVideosPlayerStyle a;
        public final BlazeVideosPlayerStyle b;
        public final d c;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.blaze.blazesdk.features.videos.models.ui.a$b$a, reason: collision with other inner class name */
        public static final class C0013a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                Parcelable.Creator<BlazeVideosPlayerStyle> creator = BlazeVideosPlayerStyle.CREATOR;
                return new b(creator.createFromParcel(parcel), creator.createFromParcel(parcel), (d) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new b[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle2, @NotNull d dVar) {
            super(null);
            blazeVideosPlayerStyle.getClass();
            blazeVideosPlayerStyle2.getClass();
            dVar.getClass();
            this.a = blazeVideosPlayerStyle;
            this.b = blazeVideosPlayerStyle2;
            this.c = dVar;
        }

        public static b copy$default(b bVar, BlazeVideosPlayerStyle blazeVideosPlayerStyle, BlazeVideosPlayerStyle blazeVideosPlayerStyle2, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeVideosPlayerStyle = bVar.a;
            }
            if ((i & 2) != 0) {
                blazeVideosPlayerStyle2 = bVar.b;
            }
            if ((i & 4) != 0) {
                dVar = bVar.c;
            }
            bVar.getClass();
            blazeVideosPlayerStyle.getClass();
            blazeVideosPlayerStyle2.getClass();
            dVar.getClass();
            return new b(blazeVideosPlayerStyle, blazeVideosPlayerStyle2, dVar);
        }

        @Override // com.blaze.blazesdk.features.videos.models.ui.j
        public final a a(c cVar) {
            cVar.getClass();
            return new b(this.a, this.b, new d.C0014a(cVar));
        }

        @Override // com.blaze.blazesdk.features.videos.models.ui.a
        public final d b() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.c(this.a, bVar.a) && Intrinsics.c(this.b, bVar.b) && Intrinsics.c(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "InlinePreview(previewPlayerStyle=" + this.a + ", fullScreenPlayerStyle=" + this.b + ", maximizationState=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.a.writeToParcel(parcel, i);
            this.b.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, i);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class c implements Parcelable {
        public c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class d implements Parcelable {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.blaze.blazesdk.features.videos.models.ui.a$d$a, reason: collision with other inner class name */
        public static final class C0014a extends d {

            @NotNull
            public static final Parcelable.Creator<C0014a> CREATOR = new C0015a();
            public final c a;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            /* renamed from: com.blaze.blazesdk.features.videos.models.ui.a$d$a$a, reason: collision with other inner class name */
            public static final class C0015a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C0014a((c) parcel.readParcelable(C0014a.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new C0014a[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0014a(@NotNull c cVar) {
                super(null);
                cVar.getClass();
                this.a = cVar;
            }

            public static C0014a copy$default(C0014a c0014a, c cVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    cVar = c0014a.a;
                }
                c0014a.getClass();
                cVar.getClass();
                return new C0014a(cVar);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0014a) && Intrinsics.c(this.a, ((C0014a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Maximized(originatedFrom=" + this.a + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.a, i);
            }
        }

        public d(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class e extends a {

        @NotNull
        public static final Parcelable.Creator<e> CREATOR = new C0016a();
        public final BlazeVideosPlayerStyle a;
        public final d b;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.blaze.blazesdk.features.videos.models.ui.a$e$a, reason: collision with other inner class name */
        public static final class C0016a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new e(BlazeVideosPlayerStyle.CREATOR.createFromParcel(parcel), (d) parcel.readParcelable(e.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new e[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull d dVar) {
            super(null);
            blazeVideosPlayerStyle.getClass();
            dVar.getClass();
            this.a = blazeVideosPlayerStyle;
            this.b = dVar;
        }

        public static e copy$default(e eVar, BlazeVideosPlayerStyle blazeVideosPlayerStyle, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeVideosPlayerStyle = eVar.a;
            }
            if ((i & 2) != 0) {
                dVar = eVar.b;
            }
            eVar.getClass();
            blazeVideosPlayerStyle.getClass();
            dVar.getClass();
            return new e(blazeVideosPlayerStyle, dVar);
        }

        @Override // com.blaze.blazesdk.features.videos.models.ui.j
        public final a a(c cVar) {
            cVar.getClass();
            return new e(this.a, new d.C0014a(cVar));
        }

        @Override // com.blaze.blazesdk.features.videos.models.ui.a
        public final d b() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.c(this.a, eVar.a) && Intrinsics.c(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StandaloneFullscreen(fullScreenPlayerStyle=" + this.a + ", maximizationState=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.a.writeToParcel(parcel, i);
            parcel.writeParcelable(this.b, i);
        }
    }

    public a(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract d b();
}
