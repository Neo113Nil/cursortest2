package ru.ozon.android.messenger.framework.presentation.models.responses;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ImageDTO f91472a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextDTO f91473b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextDTO f91474c;

    /* renamed from: d, reason: collision with root package name */
    private final b f91475d;

    /* renamed from: e, reason: collision with root package name */
    private final DisclaimerDTO f91476e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ButtonV3DTO f91477f;

    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new d((ImageDTO) parcel.readParcelable(d.class.getClassLoader()), (TextDTO) parcel.readParcelable(d.class.getClassLoader()), (TextDTO) parcel.readParcelable(d.class.getClassLoader()), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), (DisclaimerDTO) parcel.readParcelable(d.class.getClassLoader()), (ButtonV3DTO) parcel.readParcelable(d.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i11) {
            return new d[i11];
        }
    }

    public static final class b implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final TextDTO f91478a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f91479b;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b((TextDTO) parcel.readParcelable(b.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(@NotNull TextDTO text, @NotNull String urlToNavigate) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(urlToNavigate, "urlToNavigate");
            this.f91478a = text;
            this.f91479b = urlToNavigate;
        }

        @NotNull
        public final TextDTO a() {
            return this.f91478a;
        }

        @NotNull
        public final String b() {
            return this.f91479b;
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
            return Intrinsics.d(this.f91478a, bVar.f91478a) && Intrinsics.d(this.f91479b, bVar.f91479b);
        }

        public final int hashCode() {
            return this.f91479b.hashCode() + (this.f91478a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Link(text=" + this.f91478a + ", urlToNavigate=" + this.f91479b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91478a, i11);
            dest.writeString(this.f91479b);
        }
    }

    static {
        int i11 = DisclaimerDTO.$stable;
        CREATOR = new a();
    }

    public d(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle, b bVar, DisclaimerDTO disclaimerDTO, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f91472a = image;
        this.f91473b = title;
        this.f91474c = subtitle;
        this.f91475d = bVar;
        this.f91476e = disclaimerDTO;
        this.f91477f = button;
    }

    @NotNull
    public final ButtonV3DTO a() {
        return this.f91477f;
    }

    public final DisclaimerDTO b() {
        return this.f91476e;
    }

    @NotNull
    public final ImageDTO c() {
        return this.f91472a;
    }

    public final b d() {
        return this.f91475d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final TextDTO e() {
        return this.f91474c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f91472a, dVar.f91472a) && Intrinsics.d(this.f91473b, dVar.f91473b) && Intrinsics.d(this.f91474c, dVar.f91474c) && Intrinsics.d(this.f91475d, dVar.f91475d) && Intrinsics.d(this.f91476e, dVar.f91476e) && Intrinsics.d(this.f91477f, dVar.f91477f);
    }

    @NotNull
    public final TextDTO f() {
        return this.f91473b;
    }

    public final int hashCode() {
        int a11 = Ns.b.a(this.f91474c, Ns.b.a(this.f91473b, this.f91472a.hashCode() * 31, 31), 31);
        b bVar = this.f91475d;
        int hashCode = (a11 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        DisclaimerDTO disclaimerDTO = this.f91476e;
        return this.f91477f.hashCode() + ((hashCode + (disclaimerDTO != null ? disclaimerDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ExternalTransitionModalVO(image=" + this.f91472a + ", title=" + this.f91473b + ", subtitle=" + this.f91474c + ", link=" + this.f91475d + ", disclaimer=" + this.f91476e + ", button=" + this.f91477f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91472a, i11);
        dest.writeParcelable(this.f91473b, i11);
        dest.writeParcelable(this.f91474c, i11);
        b bVar = this.f91475d;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bVar.writeToParcel(dest, i11);
        }
        dest.writeParcelable(this.f91476e, i11);
        dest.writeParcelable(this.f91477f, i11);
    }
}
