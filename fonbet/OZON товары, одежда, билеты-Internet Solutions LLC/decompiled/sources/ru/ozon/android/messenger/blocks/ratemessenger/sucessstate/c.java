package ru.ozon.android.messenger.blocks.ratemessenger.sucessstate;

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
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

/* loaded from: classes10.dex */
public abstract class c implements Parcelable {

    public static final class a extends c {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C1521a();

        /* renamed from: a, reason: collision with root package name */
        private final String f86162a;

        /* renamed from: ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.c$a$a, reason: collision with other inner class name */
        public static final class C1521a implements Parcelable.Creator<a> {
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

        public a(String str) {
            super(0);
            this.f86162a = str;
        }

        public final String a() {
            return this.f86162a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f86162a, ((a) obj).f86162a);
        }

        public final int hashCode() {
            String str = this.f86162a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Error(message="), this.f86162a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86162a);
        }
    }

    public static final class b extends c {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f86163a;

        /* renamed from: b, reason: collision with root package name */
        private final String f86164b;

        /* renamed from: c, reason: collision with root package name */
        private final String f86165c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ButtonV3Atom.LargeButton f86166d;

        /* renamed from: e, reason: collision with root package name */
        private final Map<String, MessengerTrackingInfo> f86167e;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                ButtonV3Atom.LargeButton largeButton = (ButtonV3Atom.LargeButton) parcel.readParcelable(b.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashMap2.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new b(readString, readString2, readString3, largeButton, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String title, String str, String str2, @NotNull ButtonV3Atom.LargeButton button, Map<String, MessengerTrackingInfo> map) {
            super(0);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(button, "button");
            this.f86163a = title;
            this.f86164b = str;
            this.f86165c = str2;
            this.f86166d = button;
            this.f86167e = map;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton a() {
            return this.f86166d;
        }

        public final String b() {
            return this.f86164b;
        }

        public final String c() {
            return this.f86165c;
        }

        public final Map<String, MessengerTrackingInfo> d() {
            return this.f86167e;
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
            return Intrinsics.d(this.f86163a, bVar.f86163a) && Intrinsics.d(this.f86164b, bVar.f86164b) && Intrinsics.d(this.f86165c, bVar.f86165c) && Intrinsics.d(this.f86166d, bVar.f86166d) && Intrinsics.d(this.f86167e, bVar.f86167e);
        }

        @NotNull
        public final String getTitle() {
            return this.f86163a;
        }

        public final int hashCode() {
            int hashCode = this.f86163a.hashCode() * 31;
            String str = this.f86164b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f86165c;
            int a11 = Tl.b.a(this.f86166d, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            Map<String, MessengerTrackingInfo> map = this.f86167e;
            return a11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(title=");
            sb2.append(this.f86163a);
            sb2.append(", description=");
            sb2.append(this.f86164b);
            sb2.append(", imageUrl=");
            sb2.append(this.f86165c);
            sb2.append(", button=");
            sb2.append(this.f86166d);
            sb2.append(", trackingInfo=");
            return P.f(sb2, this.f86167e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86163a);
            dest.writeString(this.f86164b);
            dest.writeString(this.f86165c);
            dest.writeParcelable(this.f86166d, i11);
            Map<String, MessengerTrackingInfo> map = this.f86167e;
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

    public /* synthetic */ c(int i11) {
        this();
    }

    private c() {
    }
}
