package ru.ozon.android.messenger.blocks.disclaimer.modal;

import C.J;
import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class e implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f85076a;

    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new e(parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i11) {
            return new e[i11];
        }
    }

    public static final class b implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final TextDTO f85077a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f85078b;

        /* renamed from: c, reason: collision with root package name */
        private final ButtonV3DTO f85079c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<String, MessengerTrackingInfo> f85080d;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                TextDTO textDTO = (TextDTO) parcel.readParcelable(b.class.getClassLoader());
                LinkedHashMap linkedHashMap = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = Bi.b.a(b.class, parcel, arrayList, i11, 1);
                    }
                }
                ButtonV3DTO buttonV3DTO = (ButtonV3DTO) parcel.readParcelable(b.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    int readInt2 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt2);
                    for (int i12 = 0; i12 != readInt2; i12++) {
                        linkedHashMap.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                    }
                }
                return new b(textDTO, arrayList, buttonV3DTO, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(TextDTO textDTO, ArrayList arrayList, ButtonV3DTO buttonV3DTO, Map map) {
            this.f85077a = textDTO;
            this.f85078b = arrayList;
            this.f85079c = buttonV3DTO;
            this.f85080d = map;
        }

        public final List<ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c> a() {
            return this.f85078b;
        }

        public final ButtonV3DTO b() {
            return this.f85079c;
        }

        public final TextDTO c() {
            return this.f85077a;
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
            return Intrinsics.d(this.f85077a, bVar.f85077a) && Intrinsics.d(this.f85078b, bVar.f85078b) && Intrinsics.d(this.f85079c, bVar.f85079c) && Intrinsics.d(this.f85080d, bVar.f85080d);
        }

        public final int hashCode() {
            TextDTO textDTO = this.f85077a;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            ArrayList arrayList = this.f85078b;
            int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.f85079c;
            int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            Map<String, MessengerTrackingInfo> map = this.f85080d;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DisclaimerModalVO(title=");
            sb2.append(this.f85077a);
            sb2.append(", disclaimerModalModels=");
            sb2.append(this.f85078b);
            sb2.append(", doneButton=");
            sb2.append(this.f85079c);
            sb2.append(", trackingInfo=");
            return P.f(sb2, this.f85080d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85077a, i11);
            ArrayList arrayList = this.f85078b;
            if (arrayList == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable((Parcelable) it.next(), i11);
                }
            }
            dest.writeParcelable(this.f85079c, i11);
            Map<String, MessengerTrackingInfo> map = this.f85080d;
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

    public e(b bVar) {
        this.f85076a = bVar;
    }

    public final b a() {
        return this.f85076a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f85076a, ((e) obj).f85076a);
    }

    public final int hashCode() {
        b bVar = this.f85076a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DisclaimerModalResponseVO(modal=" + this.f85076a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        b bVar = this.f85076a;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bVar.writeToParcel(dest, i11);
        }
    }
}
