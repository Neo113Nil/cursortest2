package ru.ozon.android.messenger.blocks.dangerousText;

import Kk.C3532b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class e implements ru.ozon.android.messenger.framework.presentation.models.g, Parcelable, ru.ozon.android.messenger.framework.presentation.models.j {

    @NotNull
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84993a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f84994b;

    /* renamed from: c, reason: collision with root package name */
    private final IconDTO f84995c;

    /* renamed from: d, reason: collision with root package name */
    private final TextDTO f84996d;

    /* renamed from: e, reason: collision with root package name */
    private final ButtonV3DTO f84997e;

    /* renamed from: f, reason: collision with root package name */
    private String f84998f;

    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new e(ru.ozon.android.messenger.framework.presentation.models.c.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (IconDTO) parcel.readParcelable(e.class.getClassLoader()), (TextDTO) parcel.readParcelable(e.class.getClassLoader()), (ButtonV3DTO) parcel.readParcelable(e.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i11) {
            return new e[i11];
        }
    }

    public e(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, boolean z11, IconDTO iconDTO, TextDTO textDTO, ButtonV3DTO buttonV3DTO, String str) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f84993a = blockId;
        this.f84994b = z11;
        this.f84995c = iconDTO;
        this.f84996d = textDTO;
        this.f84997e = buttonV3DTO;
        this.f84998f = str;
    }

    public final ButtonV3DTO a() {
        return this.f84997e;
    }

    public final boolean b() {
        return this.f84994b;
    }

    public final IconDTO c() {
        return this.f84995c;
    }

    public final TextDTO d() {
        return this.f84996d;
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
        return Intrinsics.d(this.f84993a, eVar.f84993a) && this.f84994b == eVar.f84994b && Intrinsics.d(this.f84995c, eVar.f84995c) && Intrinsics.d(this.f84996d, eVar.f84996d) && Intrinsics.d(this.f84997e, eVar.f84997e) && Intrinsics.d(this.f84998f, eVar.f84998f);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84993a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final String getSendTime() {
        return this.f84998f;
    }

    public final int hashCode() {
        int a11 = C3532b.a(this.f84993a.hashCode() * 31, 31, this.f84994b);
        IconDTO iconDTO = this.f84995c;
        int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        TextDTO textDTO = this.f84996d;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.f84997e;
        int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        String str = this.f84998f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final void setSendTime(String str) {
        this.f84998f = str;
    }

    @NotNull
    public final String toString() {
        return "DangerousTextVO(blockId=" + this.f84993a + ", hasSeparator=" + this.f84994b + ", icon=" + this.f84995c + ", text=" + this.f84996d + ", button=" + this.f84997e + ", sendTime=" + this.f84998f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84993a.writeToParcel(dest, i11);
        dest.writeInt(this.f84994b ? 1 : 0);
        dest.writeParcelable(this.f84995c, i11);
        dest.writeParcelable(this.f84996d, i11);
        dest.writeParcelable(this.f84997e, i11);
        dest.writeString(this.f84998f);
    }
}
