package ru.ozon.android.messenger.blocks.messageimage;

import B0.C2454a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.j;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
public final class c implements g, Parcelable, j {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85734a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f85735b;

    /* renamed from: c, reason: collision with root package name */
    private final String f85736c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f85737d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f85738e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f85739f;

    /* renamed from: g, reason: collision with root package name */
    private final int f85740g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomActionDTO f85741h;

    /* renamed from: i, reason: collision with root package name */
    private String f85742i;

    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new c(ru.ozon.android.messenger.framework.presentation.models.c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt(), (AtomActionDTO) parcel.readParcelable(c.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public c(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull String url, String str, @NotNull String mime, Integer num, Integer num2, int i11, AtomActionDTO atomActionDTO, String str2) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(mime, "mime");
        this.f85734a = blockId;
        this.f85735b = url;
        this.f85736c = str;
        this.f85737d = mime;
        this.f85738e = num;
        this.f85739f = num2;
        this.f85740g = i11;
        this.f85741h = atomActionDTO;
        this.f85742i = str2;
    }

    public static c a(c cVar, String url, String str, String str2, int i11) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar.f85734a;
        String mime = cVar.f85737d;
        Integer num = cVar.f85738e;
        Integer num2 = cVar.f85739f;
        int i12 = cVar.f85740g;
        AtomActionDTO atomActionDTO = cVar.f85741h;
        if ((i11 & 256) != 0) {
            str2 = cVar.f85742i;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(mime, "mime");
        return new c(blockId, url, str, mime, num, num2, i12, atomActionDTO, str2);
    }

    public final AtomActionDTO b() {
        return this.f85741h;
    }

    public final String c() {
        return this.f85736c;
    }

    @NotNull
    public final String d() {
        return this.f85737d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String e() {
        return this.f85735b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f85734a, cVar.f85734a) && Intrinsics.d(this.f85735b, cVar.f85735b) && Intrinsics.d(this.f85736c, cVar.f85736c) && Intrinsics.d(this.f85737d, cVar.f85737d) && Intrinsics.d(this.f85738e, cVar.f85738e) && Intrinsics.d(this.f85739f, cVar.f85739f) && this.f85740g == cVar.f85740g && Intrinsics.d(this.f85741h, cVar.f85741h) && Intrinsics.d(this.f85742i, cVar.f85742i);
    }

    public final boolean f() {
        return Intrinsics.d(this.f85737d, "image/gif");
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85734a;
    }

    public final Integer getHeight() {
        return this.f85739f;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final String getSendTime() {
        return this.f85742i;
    }

    public final Integer getWidth() {
        return this.f85738e;
    }

    public final int hashCode() {
        int a11 = G.g.a(this.f85734a.hashCode() * 31, 31, this.f85735b);
        String str = this.f85736c;
        int a12 = G.g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f85737d);
        Integer num = this.f85738e;
        int hashCode = (a12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f85739f;
        int a13 = C2454a.a(this.f85740g, (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        AtomActionDTO atomActionDTO = this.f85741h;
        int hashCode2 = (a13 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str2 = this.f85742i;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final void setSendTime(String str) {
        this.f85742i = str;
    }

    @NotNull
    public final String toString() {
        return "ImageVO(blockId=" + this.f85734a + ", url=" + this.f85735b + ", localUrl=" + this.f85736c + ", mime=" + this.f85737d + ", width=" + this.f85738e + ", height=" + this.f85739f + ", blurRadius=" + this.f85740g + ", action=" + this.f85741h + ", sendTime=" + this.f85742i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f85734a.writeToParcel(dest, i11);
        dest.writeString(this.f85735b);
        dest.writeString(this.f85736c);
        dest.writeString(this.f85737d);
        Integer num = this.f85738e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        Integer num2 = this.f85739f;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num2);
        }
        dest.writeInt(this.f85740g);
        dest.writeParcelable(this.f85741h, i11);
        dest.writeString(this.f85742i);
    }
}
