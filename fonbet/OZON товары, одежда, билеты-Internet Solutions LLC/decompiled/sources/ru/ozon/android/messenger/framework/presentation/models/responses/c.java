package ru.ozon.android.messenger.framework.presentation.models.responses;

import C.J;
import C.o0;
import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.DataButtonDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

/* loaded from: classes10.dex */
public abstract class c implements Parcelable {

    public static final class a extends c {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C1708a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f91462a;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.models.responses.c$a$a, reason: collision with other inner class name */
        public static final class C1708a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String message) {
            super(0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f91462a = message;
        }

        @NotNull
        public final String a() {
            return this.f91462a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f91462a, ((a) obj).f91462a);
        }

        public final int hashCode() {
            return this.f91462a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Error(message="), this.f91462a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91462a);
        }
    }

    public static final class b extends c {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new C1711c();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1710b f91463a;

        public static final class a implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C1709a();

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f91464a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f91465b;

            /* renamed from: ru.ozon.android.messenger.framework.presentation.models.responses.c$b$a$a, reason: collision with other inner class name */
            public static final class C1709a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new a(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            public a(@NotNull String lottie, @NotNull String backgroundLottie) {
                Intrinsics.checkNotNullParameter(lottie, "lottie");
                Intrinsics.checkNotNullParameter(backgroundLottie, "backgroundLottie");
                this.f91464a = lottie;
                this.f91465b = backgroundLottie;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.d(this.f91464a, aVar.f91464a) && Intrinsics.d(this.f91465b, aVar.f91465b);
            }

            public final int hashCode() {
                return this.f91465b.hashCode() + (this.f91464a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AppAnimationVO(lottie=");
                sb2.append(this.f91464a);
                sb2.append(", backgroundLottie=");
                return o0.c(sb2, this.f91465b, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f91464a);
                dest.writeString(this.f91465b);
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.presentation.models.responses.c$b$b, reason: collision with other inner class name */
        public static final class C1710b implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<C1710b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final TextAtom f91466a;

            /* renamed from: b, reason: collision with root package name */
            private final TextAtom f91467b;

            /* renamed from: c, reason: collision with root package name */
            private final String f91468c;

            /* renamed from: d, reason: collision with root package name */
            private final a f91469d;

            /* renamed from: e, reason: collision with root package name */
            private final DataButtonDTO f91470e;

            /* renamed from: f, reason: collision with root package name */
            private final Map<String, MessengerTrackingInfo> f91471f;

            /* renamed from: ru.ozon.android.messenger.framework.presentation.models.responses.c$b$b$a */
            public static final class a implements Parcelable.Creator<C1710b> {
                @Override // android.os.Parcelable.Creator
                public final C1710b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    TextAtom textAtom = (TextAtom) parcel.readParcelable(C1710b.class.getClassLoader());
                    TextAtom textAtom2 = (TextAtom) parcel.readParcelable(C1710b.class.getClassLoader());
                    String readString = parcel.readString();
                    LinkedHashMap linkedHashMap = null;
                    a createFromParcel = parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel);
                    DataButtonDTO dataButtonDTO = (DataButtonDTO) parcel.readParcelable(C1710b.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        int readInt = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(readInt);
                        for (int i11 = 0; i11 != readInt; i11++) {
                            linkedHashMap.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                        }
                    }
                    return new C1710b(textAtom, textAtom2, readString, createFromParcel, dataButtonDTO, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final C1710b[] newArray(int i11) {
                    return new C1710b[i11];
                }
            }

            public C1710b(TextAtom textAtom, TextAtom textAtom2, String str, a aVar, DataButtonDTO dataButtonDTO, Map<String, MessengerTrackingInfo> map) {
                this.f91466a = textAtom;
                this.f91467b = textAtom2;
                this.f91468c = str;
                this.f91469d = aVar;
                this.f91470e = dataButtonDTO;
                this.f91471f = map;
            }

            public final a a() {
                return this.f91469d;
            }

            public final DataButtonDTO b() {
                return this.f91470e;
            }

            public final String c() {
                return this.f91468c;
            }

            public final TextAtom d() {
                return this.f91467b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final TextAtom e() {
                return this.f91466a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1710b)) {
                    return false;
                }
                C1710b c1710b = (C1710b) obj;
                return Intrinsics.d(this.f91466a, c1710b.f91466a) && Intrinsics.d(this.f91467b, c1710b.f91467b) && Intrinsics.d(this.f91468c, c1710b.f91468c) && Intrinsics.d(this.f91469d, c1710b.f91469d) && Intrinsics.d(this.f91470e, c1710b.f91470e) && Intrinsics.d(this.f91471f, c1710b.f91471f);
            }

            public final int hashCode() {
                TextAtom textAtom = this.f91466a;
                int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
                TextAtom textAtom2 = this.f91467b;
                int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
                String str = this.f91468c;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                a aVar = this.f91469d;
                int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                DataButtonDTO dataButtonDTO = this.f91470e;
                int hashCode5 = (hashCode4 + (dataButtonDTO == null ? 0 : dataButtonDTO.hashCode())) * 31;
                Map<String, MessengerTrackingInfo> map = this.f91471f;
                return hashCode5 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("CouponModalVO(title=");
                sb2.append(this.f91466a);
                sb2.append(", subtitle=");
                sb2.append(this.f91467b);
                sb2.append(", imageUrl=");
                sb2.append(this.f91468c);
                sb2.append(", animations=");
                sb2.append(this.f91469d);
                sb2.append(", button=");
                sb2.append(this.f91470e);
                sb2.append(", trackingInfo=");
                return P.f(sb2, this.f91471f, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f91466a, i11);
                dest.writeParcelable(this.f91467b, i11);
                dest.writeString(this.f91468c);
                a aVar = this.f91469d;
                if (aVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    aVar.writeToParcel(dest, i11);
                }
                dest.writeParcelable(this.f91470e, i11);
                Map<String, MessengerTrackingInfo> map = this.f91471f;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    ((MessengerTrackingInfo) entry.getValue()).writeToParcel(dest, i11);
                }
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.presentation.models.responses.c$b$c, reason: collision with other inner class name */
        public static final class C1711c implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(C1710b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C1710b modal) {
            super(0);
            Intrinsics.checkNotNullParameter(modal, "modal");
            this.f91463a = modal;
        }

        @NotNull
        public final C1710b a() {
            return this.f91463a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f91463a, ((b) obj).f91463a);
        }

        public final int hashCode() {
            return this.f91463a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(modal=" + this.f91463a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f91463a.writeToParcel(dest, i11);
        }
    }

    public /* synthetic */ c(int i11) {
        this();
    }

    private c() {
    }
}
