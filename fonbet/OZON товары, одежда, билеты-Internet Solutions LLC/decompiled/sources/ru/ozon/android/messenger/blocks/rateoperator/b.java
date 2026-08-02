package ru.ozon.android.messenger.blocks.rateoperator;

import B0.C2454a;
import B90.C2618u;
import C.J;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

/* loaded from: classes10.dex */
public final class b implements g, Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f86169a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f86170b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f86171c;

    /* renamed from: d, reason: collision with root package name */
    private final String f86172d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ButtonV3Atom.LargeButton f86173e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final e f86174f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f86175g;

    /* renamed from: h, reason: collision with root package name */
    private final int f86176h;

    /* renamed from: i, reason: collision with root package name */
    private final ru.ozon.android.messenger.blocks.rateoperator.message.c f86177i;

    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ru.ozon.android.messenger.framework.presentation.models.c createFromParcel = ru.ozon.android.messenger.framework.presentation.models.c.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = Ak.b.b(d.CREATOR, parcel, arrayList, i11, 1);
            }
            String readString2 = parcel.readString();
            ButtonV3Atom.LargeButton largeButton = (ButtonV3Atom.LargeButton) parcel.readParcelable(b.class.getClassLoader());
            e createFromParcel2 = e.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    linkedHashMap2.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new b(createFromParcel, readString, arrayList, readString2, largeButton, createFromParcel2, linkedHashMap, parcel.readInt(), (ru.ozon.android.messenger.blocks.rateoperator.message.c) parcel.readParcelable(b.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    public b(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull String title, @NotNull ArrayList rates, String str, @NotNull ButtonV3Atom.LargeButton sendButton, @NotNull e successStateVO, Map map, int i11, ru.ozon.android.messenger.blocks.rateoperator.message.c cVar) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(successStateVO, "successStateVO");
        this.f86169a = blockId;
        this.f86170b = title;
        this.f86171c = rates;
        this.f86172d = str;
        this.f86173e = sendButton;
        this.f86174f = successStateVO;
        this.f86175g = map;
        this.f86176h = i11;
        this.f86177i = cVar;
    }

    public static b a(b bVar, int i11, ru.ozon.android.messenger.blocks.rateoperator.message.c cVar, int i12) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = bVar.f86169a;
        String title = bVar.f86170b;
        ArrayList rates = bVar.f86171c;
        String str = bVar.f86172d;
        ButtonV3Atom.LargeButton sendButton = bVar.f86173e;
        e successStateVO = bVar.f86174f;
        Map<String, MessengerTrackingInfo> map = bVar.f86175g;
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            i11 = bVar.f86176h;
        }
        int i13 = i11;
        if ((i12 & 256) != 0) {
            cVar = bVar.f86177i;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(successStateVO, "successStateVO");
        return new b(blockId, title, rates, str, sendButton, successStateVO, map, i13, cVar);
    }

    public final String b() {
        return this.f86172d;
    }

    @NotNull
    public final List<d> c() {
        return this.f86171c;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton d() {
        return this.f86173e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final e e() {
        return this.f86174f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f86169a, bVar.f86169a) && Intrinsics.d(this.f86170b, bVar.f86170b) && this.f86171c.equals(bVar.f86171c) && Intrinsics.d(this.f86172d, bVar.f86172d) && Intrinsics.d(this.f86173e, bVar.f86173e) && Intrinsics.d(this.f86174f, bVar.f86174f) && Intrinsics.d(this.f86175g, bVar.f86175g) && this.f86176h == bVar.f86176h && Intrinsics.d(this.f86177i, bVar.f86177i);
    }

    public final int f() {
        return this.f86176h;
    }

    public final ru.ozon.android.messenger.blocks.rateoperator.message.c g() {
        return this.f86177i;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f86169a;
    }

    @NotNull
    public final String getTitle() {
        return this.f86170b;
    }

    public final int hashCode() {
        int b11 = C2618u.b(this.f86171c, G.g.a(this.f86169a.hashCode() * 31, 31, this.f86170b), 31);
        String str = this.f86172d;
        int hashCode = (this.f86174f.hashCode() + Tl.b.a(this.f86173e, (b11 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        Map<String, MessengerTrackingInfo> map = this.f86175g;
        int a11 = C2454a.a(this.f86176h, (hashCode + (map == null ? 0 : map.hashCode())) * 31, 31);
        ru.ozon.android.messenger.blocks.rateoperator.message.c cVar = this.f86177i;
        return a11 + (cVar != null ? cVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "RateOperatorVO(blockId=" + this.f86169a + ", title=" + this.f86170b + ", rates=" + this.f86171c + ", commentHint=" + this.f86172d + ", sendButton=" + this.f86173e + ", successStateVO=" + this.f86174f + ", trackingInfo=" + this.f86175g + ", userRating=" + this.f86176h + ", isSuccess=" + this.f86177i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f86169a.writeToParcel(dest, i11);
        dest.writeString(this.f86170b);
        ArrayList arrayList = this.f86171c;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d) it.next()).writeToParcel(dest, i11);
        }
        dest.writeString(this.f86172d);
        dest.writeParcelable(this.f86173e, i11);
        this.f86174f.writeToParcel(dest, i11);
        Map<String, MessengerTrackingInfo> map = this.f86175g;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                ((MessengerTrackingInfo) entry.getValue()).writeToParcel(dest, i11);
            }
        }
        dest.writeInt(this.f86176h);
        dest.writeParcelable(this.f86177i, i11);
    }
}
