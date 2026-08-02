package ru.ozon.android.messenger.framework.navigation.action;

import T7.P;
import Ve.C4598rp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

/* loaded from: classes10.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C1639a();

    /* renamed from: a, reason: collision with root package name */
    private final AtomActionDTO f89159a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomAction f89160b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f89161c;

    /* renamed from: d, reason: collision with root package name */
    private final String f89162d;

    /* renamed from: ru.ozon.android.messenger.framework.navigation.action.a$a, reason: collision with other inner class name */
    public static final class C1639a implements Parcelable.Creator<a> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new a((AtomActionDTO) parcel.readParcelable(a.class.getClassLoader()), null, 0 == true ? 1 : 0, 6);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    public static a a(a aVar, AtomActionDTO atomActionDTO) {
        AtomAction atomActionVO = aVar.f89160b;
        Map<String, Object> params = aVar.f89161c;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(atomActionVO, "atomActionVO");
        Intrinsics.checkNotNullParameter(params, "params");
        return new a(atomActionDTO, atomActionVO, params);
    }

    public final AtomActionDTO b() {
        return this.f89159a;
    }

    @NotNull
    public final AtomAction c() {
        return this.f89160b;
    }

    @NotNull
    public final Map<String, Object> d() {
        return this.f89161c;
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
        return Intrinsics.d(this.f89159a, aVar.f89159a) && Intrinsics.d(this.f89160b, aVar.f89160b) && Intrinsics.d(this.f89161c, aVar.f89161c);
    }

    public final String getId() {
        return this.f89162d;
    }

    public final int hashCode() {
        AtomActionDTO atomActionDTO = this.f89159a;
        return this.f89161c.hashCode() + C4598rp.a(this.f89160b, (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AtomActionWrapper(atomActionDTO=");
        sb2.append(this.f89159a);
        sb2.append(", atomActionVO=");
        sb2.append(this.f89160b);
        sb2.append(", params=");
        return P.f(sb2, this.f89161c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89159a, i11);
    }

    public a(AtomActionDTO atomActionDTO, @NotNull AtomAction atomActionVO, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(atomActionVO, "atomActionVO");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f89159a = atomActionDTO;
        this.f89160b = atomActionVO;
        this.f89161c = params;
        this.f89162d = atomActionVO.getId();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a(AtomActionDTO atomActionDTO, AtomAction atomAction, Map map, int i11) {
        this(atomActionDTO, atomAction, (i11 & 4) != 0 ? U.c() : map);
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        atomActionDTO = (i11 & 1) != 0 ? null : atomActionDTO;
        if ((i11 & 2) != 0 && (atomActionDTO == null || (atomAction = AtomActionMapperKt.toAtomAction(atomActionDTO, null)) == null)) {
            atomAction = new AtomAction.InvalidAction(str, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        }
    }
}
