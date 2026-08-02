package ru.ozon.id.nativeauth.data.models;

import C.J;
import C.o0;
import G.g;
import T7.P;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.common.disclaimer.DisclaimerDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

/* loaded from: classes3.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f97224a;

    /* renamed from: b, reason: collision with root package name */
    private final OzonSpannableString f97225b;

    /* renamed from: c, reason: collision with root package name */
    private final EntryDTO.InputDTO f97226c;

    /* renamed from: d, reason: collision with root package name */
    private final EntryDTO.SubmitButtonDTO f97227d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f97228e;

    /* renamed from: f, reason: collision with root package name */
    private final d f97229f;

    /* renamed from: g, reason: collision with root package name */
    private final DisclaimerDTO f97230g;

    /* renamed from: h, reason: collision with root package name */
    private final EntryDTO.TermsOfUse f97231h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final EntryDTO.TranslationLexemes.ValidationLexemes f97232i;

    /* renamed from: j, reason: collision with root package name */
    private final EntryDTO.FeatureFlags f97233j;

    /* renamed from: k, reason: collision with root package name */
    private final String f97234k;

    /* renamed from: l, reason: collision with root package name */
    private final c f97235l;

    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            OzonSpannableString ozonSpannableString;
            ArrayList arrayList;
            int i11 = 0;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                ozonSpannableString = null;
            } else {
                String readString2 = parcel.readString();
                if (readString2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(h.A0(OzonHtmlParser.INSTANCE.parseHtml(readString2, 63), '\n'));
            }
            EntryDTO.InputDTO createFromParcel = parcel.readInt() == 0 ? null : EntryDTO.InputDTO.CREATOR.createFromParcel(parcel);
            EntryDTO.SubmitButtonDTO createFromParcel2 = parcel.readInt() == 0 ? null : EntryDTO.SubmitButtonDTO.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (i11 != readInt) {
                    i11 = Bi.b.a(b.class, parcel, arrayList, i11, 1);
                }
            }
            return new b(readString, ozonSpannableString, createFromParcel, createFromParcel2, arrayList, parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DisclaimerDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EntryDTO.TermsOfUse.CREATOR.createFromParcel(parcel), EntryDTO.TranslationLexemes.ValidationLexemes.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EntryDTO.FeatureFlags.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    /* renamed from: ru.ozon.id.nativeauth.data.models.b$b, reason: collision with other inner class name */
    public interface InterfaceC2133b extends Parcelable {

        /* renamed from: ru.ozon.id.nativeauth.data.models.b$b$a */
        public static final class a implements InterfaceC2133b {

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C2134a();

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f97236a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f97237b;

            /* renamed from: c, reason: collision with root package name */
            private final Map<String, Object> f97238c;

            /* renamed from: ru.ozon.id.nativeauth.data.models.b$b$a$a, reason: collision with other inner class name */
            public static final class C2134a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        for (int i11 = 0; i11 != readInt; i11++) {
                            linkedHashMap2.put(parcel.readString(), parcel.readValue(a.class.getClassLoader()));
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new a(readString, readString2, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            public a(@NotNull String title, @NotNull String action, Map<String, ? extends Object> map) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(action, "action");
                this.f97236a = title;
                this.f97237b = action;
                this.f97238c = map;
            }

            @NotNull
            public final String a() {
                return this.f97237b;
            }

            public final Map<String, Object> b() {
                return this.f97238c;
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
                return Intrinsics.d(this.f97236a, aVar.f97236a) && Intrinsics.d(this.f97237b, aVar.f97237b) && Intrinsics.d(this.f97238c, aVar.f97238c);
            }

            @Override // ru.ozon.id.nativeauth.data.models.b.InterfaceC2133b
            @NotNull
            public final String getTitle() {
                return this.f97236a;
            }

            public final int hashCode() {
                int a11 = g.a(this.f97236a.hashCode() * 31, 31, this.f97237b);
                Map<String, Object> map = this.f97238c;
                return a11 + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Action(title=");
                sb2.append(this.f97236a);
                sb2.append(", action=");
                sb2.append(this.f97237b);
                sb2.append(", data=");
                return P.f(sb2, this.f97238c, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f97236a);
                dest.writeString(this.f97237b);
                Map<String, Object> map = this.f97238c;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeValue(entry.getValue());
                }
            }
        }

        /* renamed from: ru.ozon.id.nativeauth.data.models.b$b$b, reason: collision with other inner class name */
        public static final class C2135b implements InterfaceC2133b {

            @NotNull
            public static final Parcelable.Creator<C2135b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f97239a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f97240b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f97241c;

            /* renamed from: ru.ozon.id.nativeauth.data.models.b$b$b$a */
            public static final class a implements Parcelable.Creator<C2135b> {
                @Override // android.os.Parcelable.Creator
                public final C2135b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new C2135b(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final C2135b[] newArray(int i11) {
                    return new C2135b[i11];
                }
            }

            public C2135b(@NotNull String title, @NotNull String action, @NotNull String challenge) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                this.f97239a = title;
                this.f97240b = action;
                this.f97241c = challenge;
            }

            @NotNull
            public final String a() {
                return this.f97240b;
            }

            @NotNull
            public final String b() {
                return this.f97241c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2135b)) {
                    return false;
                }
                C2135b c2135b = (C2135b) obj;
                return Intrinsics.d(this.f97239a, c2135b.f97239a) && Intrinsics.d(this.f97240b, c2135b.f97240b) && Intrinsics.d(this.f97241c, c2135b.f97241c);
            }

            @Override // ru.ozon.id.nativeauth.data.models.b.InterfaceC2133b
            @NotNull
            public final String getTitle() {
                return this.f97239a;
            }

            public final int hashCode() {
                return this.f97241c.hashCode() + g.a(this.f97239a.hashCode() * 31, 31, this.f97240b);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Biometry(title=");
                sb2.append(this.f97239a);
                sb2.append(", action=");
                sb2.append(this.f97240b);
                sb2.append(", challenge=");
                return o0.c(sb2, this.f97241c, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f97239a);
                dest.writeString(this.f97240b);
                dest.writeString(this.f97241c);
            }
        }

        /* renamed from: ru.ozon.id.nativeauth.data.models.b$b$c */
        public static final class c implements InterfaceC2133b {

            @NotNull
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f97242a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f97243b;

            /* renamed from: c, reason: collision with root package name */
            private final String f97244c;

            /* renamed from: ru.ozon.id.nativeauth.data.models.b$b$c$a */
            public static final class a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                public final c createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new c(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final c[] newArray(int i11) {
                    return new c[i11];
                }
            }

            public c(@NotNull String title, @NotNull String deeplink, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f97242a = title;
                this.f97243b = deeplink;
                this.f97244c = str;
            }

            @NotNull
            public final String a() {
                return this.f97243b;
            }

            public final String b() {
                return this.f97244c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.d(this.f97242a, cVar.f97242a) && Intrinsics.d(this.f97243b, cVar.f97243b) && Intrinsics.d(this.f97244c, cVar.f97244c);
            }

            @Override // ru.ozon.id.nativeauth.data.models.b.InterfaceC2133b
            @NotNull
            public final String getTitle() {
                return this.f97242a;
            }

            public final int hashCode() {
                int a11 = g.a(this.f97242a.hashCode() * 31, 31, this.f97243b);
                String str = this.f97244c;
                return a11 + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Deeplink(title=");
                sb2.append(this.f97242a);
                sb2.append(", deeplink=");
                sb2.append(this.f97243b);
                sb2.append(", trackClickAction=");
                return o0.c(sb2, this.f97244c, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f97242a);
                dest.writeString(this.f97243b);
                dest.writeString(this.f97244c);
            }
        }

        /* renamed from: ru.ozon.id.nativeauth.data.models.b$b$d */
        public static final class d implements InterfaceC2133b {

            @NotNull
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f97245a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f97246b;

            /* renamed from: ru.ozon.id.nativeauth.data.models.b$b$d$a */
            public static final class a implements Parcelable.Creator<d> {
                @Override // android.os.Parcelable.Creator
                public final d createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new d(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final d[] newArray(int i11) {
                    return new d[i11];
                }
            }

            public d(@NotNull String title, @NotNull String deeplink) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f97245a = title;
                this.f97246b = deeplink;
            }

            @NotNull
            public final String a() {
                return this.f97246b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.d(this.f97245a, dVar.f97245a) && Intrinsics.d(this.f97246b, dVar.f97246b);
            }

            @Override // ru.ozon.id.nativeauth.data.models.b.InterfaceC2133b
            @NotNull
            public final String getTitle() {
                return this.f97245a;
            }

            public final int hashCode() {
                return this.f97246b.hashCode() + (this.f97245a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Reload(title=");
                sb2.append(this.f97245a);
                sb2.append(", deeplink=");
                return o0.c(sb2, this.f97246b, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f97245a);
                dest.writeString(this.f97246b);
            }
        }

        @NotNull
        String getTitle();
    }

    public static final class c implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f97247a;

        /* renamed from: b, reason: collision with root package name */
        private final EntryDTO.b f97248b;

        /* renamed from: c, reason: collision with root package name */
        private final String f97249c;

        /* renamed from: d, reason: collision with root package name */
        private final String f97250d;

        /* renamed from: e, reason: collision with root package name */
        private final String f97251e;

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new c(parcel.readInt(), parcel.readInt() == 0 ? null : EntryDTO.b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        public c(int i11, EntryDTO.b bVar, String str, String str2, String str3) {
            this.f97247a = i11;
            this.f97248b = bVar;
            this.f97249c = str;
            this.f97250d = str2;
            this.f97251e = str3;
        }

        public final String a() {
            return this.f97250d;
        }

        public final String b() {
            return this.f97249c;
        }

        public final String c() {
            return this.f97251e;
        }

        public final int d() {
            return this.f97247a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final EntryDTO.b e() {
            return this.f97248b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f97247a == cVar.f97247a && this.f97248b == cVar.f97248b && Intrinsics.d(this.f97249c, cVar.f97249c) && Intrinsics.d(this.f97250d, cVar.f97250d) && Intrinsics.d(this.f97251e, cVar.f97251e);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f97247a) * 31;
            EntryDTO.b bVar = this.f97248b;
            int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.f97249c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f97250d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f97251e;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SocialButtonVO(title=");
            sb2.append(this.f97247a);
            sb2.append(", type=");
            sb2.append(this.f97248b);
            sb2.append(", logo=");
            sb2.append(this.f97249c);
            sb2.append(", authUriAction=");
            sb2.append(this.f97250d);
            sb2.append(", redirectUriAction=");
            return o0.c(sb2, this.f97251e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f97247a);
            EntryDTO.b bVar = this.f97248b;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeString(this.f97249c);
            dest.writeString(this.f97250d);
            dest.writeString(this.f97251e);
        }
    }

    public static final class d implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f97252a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList f97253b;

        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = Ak.b.b(c.CREATOR, parcel, arrayList, i11, 1);
                }
                return new d(readString, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        public d(String str, @NotNull ArrayList buttons) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.f97252a = str;
            this.f97253b = buttons;
        }

        @NotNull
        public final List<c> a() {
            return this.f97253b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.d(this.f97252a, dVar.f97252a) && this.f97253b.equals(dVar.f97253b);
        }

        public final String getTitle() {
            return this.f97252a;
        }

        public final int hashCode() {
            String str = this.f97252a;
            return this.f97253b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SocialLoginVO(title=");
            sb2.append(this.f97252a);
            sb2.append(", buttons=");
            return Om.a(")", sb2, this.f97253b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97252a);
            ArrayList arrayList = this.f97253b;
            dest.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).writeToParcel(dest, i11);
            }
        }
    }

    public b(@NotNull String title, OzonSpannableString ozonSpannableString, EntryDTO.InputDTO inputDTO, EntryDTO.SubmitButtonDTO submitButtonDTO, ArrayList arrayList, d dVar, DisclaimerDTO disclaimerDTO, EntryDTO.TermsOfUse termsOfUse, @NotNull EntryDTO.TranslationLexemes.ValidationLexemes validationLexemes, EntryDTO.FeatureFlags featureFlags, String str, c cVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(validationLexemes, "validationLexemes");
        this.f97224a = title;
        this.f97225b = ozonSpannableString;
        this.f97226c = inputDTO;
        this.f97227d = submitButtonDTO;
        this.f97228e = arrayList;
        this.f97229f = dVar;
        this.f97230g = disclaimerDTO;
        this.f97231h = termsOfUse;
        this.f97232i = validationLexemes;
        this.f97233j = featureFlags;
        this.f97234k = str;
        this.f97235l = cVar;
    }

    public static b a(b bVar, ArrayList arrayList) {
        String title = bVar.f97224a;
        Intrinsics.checkNotNullParameter(title, "title");
        EntryDTO.TranslationLexemes.ValidationLexemes validationLexemes = bVar.f97232i;
        Intrinsics.checkNotNullParameter(validationLexemes, "validationLexemes");
        return new b(title, bVar.f97225b, bVar.f97226c, bVar.f97227d, arrayList, bVar.f97229f, bVar.f97230g, bVar.f97231h, validationLexemes, bVar.f97233j, bVar.f97234k, bVar.f97235l);
    }

    public final DisclaimerDTO b() {
        return this.f97230g;
    }

    public final EntryDTO.FeatureFlags c() {
        return this.f97233j;
    }

    public final List<InterfaceC2133b> d() {
        return this.f97228e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final EntryDTO.InputDTO e() {
        return this.f97226c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f97224a, bVar.f97224a) && Intrinsics.d(this.f97225b, bVar.f97225b) && Intrinsics.d(this.f97226c, bVar.f97226c) && Intrinsics.d(this.f97227d, bVar.f97227d) && Intrinsics.d(this.f97228e, bVar.f97228e) && Intrinsics.d(this.f97229f, bVar.f97229f) && Intrinsics.d(this.f97230g, bVar.f97230g) && Intrinsics.d(this.f97231h, bVar.f97231h) && Intrinsics.d(this.f97232i, bVar.f97232i) && Intrinsics.d(this.f97233j, bVar.f97233j) && Intrinsics.d(this.f97234k, bVar.f97234k) && Intrinsics.d(this.f97235l, bVar.f97235l);
    }

    public final d f() {
        return this.f97229f;
    }

    public final EntryDTO.SubmitButtonDTO g() {
        return this.f97227d;
    }

    @NotNull
    public final String getTitle() {
        return this.f97224a;
    }

    public final OzonSpannableString h() {
        return this.f97225b;
    }

    public final int hashCode() {
        int hashCode = this.f97224a.hashCode() * 31;
        OzonSpannableString ozonSpannableString = this.f97225b;
        int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        EntryDTO.InputDTO inputDTO = this.f97226c;
        int hashCode3 = (hashCode2 + (inputDTO == null ? 0 : inputDTO.hashCode())) * 31;
        EntryDTO.SubmitButtonDTO submitButtonDTO = this.f97227d;
        int hashCode4 = (hashCode3 + (submitButtonDTO == null ? 0 : submitButtonDTO.hashCode())) * 31;
        ArrayList arrayList = this.f97228e;
        int hashCode5 = (hashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        d dVar = this.f97229f;
        int hashCode6 = (hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        DisclaimerDTO disclaimerDTO = this.f97230g;
        int hashCode7 = (hashCode6 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        EntryDTO.TermsOfUse termsOfUse = this.f97231h;
        int hashCode8 = (this.f97232i.hashCode() + ((hashCode7 + (termsOfUse == null ? 0 : termsOfUse.hashCode())) * 31)) * 31;
        EntryDTO.FeatureFlags featureFlags = this.f97233j;
        int hashCode9 = (hashCode8 + (featureFlags == null ? 0 : featureFlags.hashCode())) * 31;
        String str = this.f97234k;
        int hashCode10 = (hashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.f97235l;
        return hashCode10 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final EntryDTO.TermsOfUse i() {
        return this.f97231h;
    }

    @NotNull
    public final EntryDTO.TranslationLexemes.ValidationLexemes j() {
        return this.f97232i;
    }

    public final c k() {
        return this.f97235l;
    }

    @NotNull
    public final String toString() {
        return "EntryVO(title=" + this.f97224a + ", subtitle=" + ((Object) this.f97225b) + ", input=" + this.f97226c + ", submitButton=" + this.f97227d + ", hintButtons=" + this.f97228e + ", socialLogin=" + this.f97229f + ", disclaimer=" + this.f97230g + ", termsOfUseText=" + this.f97231h + ", validationLexemes=" + this.f97232i + ", featureFlags=" + this.f97233j + ", error=" + this.f97234k + ", vkIdOneTapButton=" + this.f97235l + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.f97224a);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        OzonSpannableString ozonSpannableString = this.f97225b;
        if (ozonSpannableString == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(Html.toHtml(ozonSpannableString, 1));
        }
        EntryDTO.InputDTO inputDTO = this.f97226c;
        if (inputDTO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputDTO.writeToParcel(parcel, i11);
        }
        EntryDTO.SubmitButtonDTO submitButtonDTO = this.f97227d;
        if (submitButtonDTO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            submitButtonDTO.writeToParcel(parcel, i11);
        }
        ArrayList arrayList = this.f97228e;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i11);
            }
        }
        d dVar = this.f97229f;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i11);
        }
        DisclaimerDTO disclaimerDTO = this.f97230g;
        if (disclaimerDTO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            disclaimerDTO.writeToParcel(parcel, i11);
        }
        EntryDTO.TermsOfUse termsOfUse = this.f97231h;
        if (termsOfUse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            termsOfUse.writeToParcel(parcel, i11);
        }
        this.f97232i.writeToParcel(parcel, i11);
        EntryDTO.FeatureFlags featureFlags = this.f97233j;
        if (featureFlags == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            featureFlags.writeToParcel(parcel, i11);
        }
        parcel.writeString(this.f97234k);
        c cVar = this.f97235l;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i11);
        }
    }
}
