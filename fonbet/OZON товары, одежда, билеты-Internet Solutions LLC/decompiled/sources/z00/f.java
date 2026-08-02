package z00;

import B90.C2618u;
import De.C2860c;
import Fm.C3051a;
import Kk.C3532b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class f {

    /* loaded from: classes3.dex */
    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f106883a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final boolean f106884b = true;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1984095998;
        }

        @Override // z00.f
        public final boolean isError() {
            return f106884b;
        }

        @NotNull
        public final String toString() {
            return "NoConnection";
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f106885a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1159542924;
        }

        @Override // z00.f
        public final boolean isError() {
            return false;
        }

        @NotNull
        public final String toString() {
            return "NoScreen";
        }
    }

    public static final class c extends f implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final String f106886a;

        /* renamed from: b, reason: collision with root package name */
        private final String f106887b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f106888c;

        /* renamed from: d, reason: collision with root package name */
        private final LinkedHashSet f106889d;

        /* renamed from: e, reason: collision with root package name */
        private final a f106890e;

        /* renamed from: f, reason: collision with root package name */
        private final C2320c f106891f;

        /* renamed from: g, reason: collision with root package name */
        private final Long f106892g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f106893h;

        /* loaded from: classes3.dex */
        public static final class a implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C2314a();

            /* renamed from: a, reason: collision with root package name */
            private final Integer f106894a;

            /* renamed from: b, reason: collision with root package name */
            private final Integer f106895b;

            /* renamed from: c, reason: collision with root package name */
            private final String f106896c;

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            private final List<b> f106897d;

            /* renamed from: z00.f$c$a$a, reason: collision with other inner class name */
            public static final class C2314a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = Bi.b.a(a.class, parcel, arrayList, i11, 1);
                    }
                    return new a(valueOf, valueOf2, readString, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            public static abstract class b implements Parcelable {

                /* renamed from: z00.f$c$a$b$a, reason: collision with other inner class name */
                public static final class C2315a extends b {

                    @NotNull
                    public static final Parcelable.Creator<C2315a> CREATOR = new C2316a();

                    /* renamed from: a, reason: collision with root package name */
                    private final String f106898a;

                    /* renamed from: b, reason: collision with root package name */
                    @NotNull
                    private final EnumC2317b f106899b;

                    /* renamed from: c, reason: collision with root package name */
                    private final Throwable f106900c;

                    /* renamed from: z00.f$c$a$b$a$a, reason: collision with other inner class name */
                    public static final class C2316a implements Parcelable.Creator<C2315a> {
                        @Override // android.os.Parcelable.Creator
                        public final C2315a createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new C2315a(parcel.readString(), EnumC2317b.valueOf(parcel.readString()), (Throwable) parcel.readSerializable());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final C2315a[] newArray(int i11) {
                            return new C2315a[i11];
                        }
                    }

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    /* renamed from: z00.f$c$a$b$a$b, reason: collision with other inner class name */
                    public static final class EnumC2317b {
                        private static final /* synthetic */ Xc.a $ENTRIES;
                        private static final /* synthetic */ EnumC2317b[] $VALUES;
                        public static final EnumC2317b MAP;
                        public static final EnumC2317b PARSE;

                        static {
                            EnumC2317b enumC2317b = new EnumC2317b("PARSE", 0);
                            PARSE = enumC2317b;
                            EnumC2317b enumC2317b2 = new EnumC2317b("MAP", 1);
                            MAP = enumC2317b2;
                            EnumC2317b[] enumC2317bArr = {enumC2317b, enumC2317b2};
                            $VALUES = enumC2317bArr;
                            $ENTRIES = Xc.b.a(enumC2317bArr);
                        }

                        private EnumC2317b() {
                            throw null;
                        }

                        public static EnumC2317b valueOf(String str) {
                            return (EnumC2317b) Enum.valueOf(EnumC2317b.class, str);
                        }

                        public static EnumC2317b[] values() {
                            return (EnumC2317b[]) $VALUES.clone();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2315a(String str, @NotNull EnumC2317b step, Throwable th2) {
                        super(0);
                        Intrinsics.checkNotNullParameter(step, "step");
                        this.f106898a = str;
                        this.f106899b = step;
                        this.f106900c = th2;
                    }

                    @NotNull
                    public final EnumC2317b a() {
                        return this.f106899b;
                    }

                    public final Throwable b() {
                        return this.f106900c;
                    }

                    public final String c() {
                        return this.f106898a;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C2315a)) {
                            return false;
                        }
                        C2315a c2315a = (C2315a) obj;
                        return Intrinsics.d(this.f106898a, c2315a.f106898a) && this.f106899b == c2315a.f106899b && Intrinsics.d(this.f106900c, c2315a.f106900c);
                    }

                    public final int hashCode() {
                        String str = this.f106898a;
                        int hashCode = (this.f106899b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
                        Throwable th2 = this.f106900c;
                        return hashCode + (th2 != null ? th2.hashCode() : 0);
                    }

                    @NotNull
                    public final String toString() {
                        return "PrepareWidget(widgetKey=" + this.f106898a + ", step=" + this.f106899b + ", throwable=" + this.f106900c + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int i11) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.f106898a);
                        dest.writeString(this.f106899b.name());
                        dest.writeSerializable(this.f106900c);
                    }
                }

                /* renamed from: z00.f$c$a$b$b, reason: collision with other inner class name */
                public static final class C2318b extends b {

                    @NotNull
                    public static final Parcelable.Creator<C2318b> CREATOR = new C2319a();

                    /* renamed from: a, reason: collision with root package name */
                    private final String f106901a;

                    /* renamed from: b, reason: collision with root package name */
                    private final boolean f106902b;

                    /* renamed from: z00.f$c$a$b$b$a, reason: collision with other inner class name */
                    public static final class C2319a implements Parcelable.Creator<C2318b> {
                        @Override // android.os.Parcelable.Creator
                        public final C2318b createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new C2318b(parcel.readString(), parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final C2318b[] newArray(int i11) {
                            return new C2318b[i11];
                        }
                    }

                    public C2318b(String str, boolean z11) {
                        super(0);
                        this.f106901a = str;
                        this.f106902b = z11;
                    }

                    public final String a() {
                        return this.f106901a;
                    }

                    public final boolean b() {
                        return this.f106902b;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C2318b)) {
                            return false;
                        }
                        C2318b c2318b = (C2318b) obj;
                        return Intrinsics.d(this.f106901a, c2318b.f106901a) && this.f106902b == c2318b.f106902b;
                    }

                    public final int hashCode() {
                        String str = this.f106901a;
                        return Boolean.hashCode(this.f106902b) + ((str == null ? 0 : str.hashCode()) * 31);
                    }

                    @NotNull
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("UnSupportedWidget(widgetKey=");
                        sb2.append(this.f106901a);
                        sb2.append(", isWidgetSupported=");
                        return Pk0.a.a(")", sb2, this.f106902b);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@NotNull Parcel dest, int i11) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.f106901a);
                        dest.writeInt(this.f106902b ? 1 : 0);
                    }
                }

                public /* synthetic */ b(int i11) {
                    this();
                }

                private b() {
                }
            }

            public a() {
                this(null, 15);
            }

            @NotNull
            public final List<b> a() {
                return this.f106897d;
            }

            public final Integer b() {
                return this.f106894a;
            }

            public final String c() {
                return this.f106896c;
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
                return Intrinsics.d(this.f106894a, aVar.f106894a) && Intrinsics.d(this.f106895b, aVar.f106895b) && Intrinsics.d(this.f106896c, aVar.f106896c) && Intrinsics.d(this.f106897d, aVar.f106897d);
            }

            public final int hashCode() {
                Integer num = this.f106894a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.f106895b;
                int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str = this.f106896c;
                return this.f106897d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ComposerInfo(layoutId=");
                sb2.append(this.f106894a);
                sb2.append(", layoutVersion=");
                sb2.append(this.f106895b);
                sb2.append(", url=");
                sb2.append(this.f106896c);
                sb2.append(", invalidWidgets=");
                return C2618u.h(sb2, this.f106897d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Integer num = this.f106894a;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                Integer num2 = this.f106895b;
                if (num2 == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num2);
                }
                dest.writeString(this.f106896c);
                Iterator c11 = Bi.a.c(this.f106897d, dest);
                while (c11.hasNext()) {
                    dest.writeParcelable((Parcelable) c11.next(), i11);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(Integer num, Integer num2, String str, @NotNull List<? extends b> invalidWidgets) {
                Intrinsics.checkNotNullParameter(invalidWidgets, "invalidWidgets");
                this.f106894a = num;
                this.f106895b = num2;
                this.f106896c = str;
                this.f106897d = invalidWidgets;
            }

            public a(String str, int i11) {
                this(null, null, (i11 & 4) != 0 ? null : str, K.f71697a);
            }
        }

        /* loaded from: classes3.dex */
        public static final class b implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z11 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                }
                return new c(readString, readString2, z11, linkedHashSet, parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C2320c.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        /* renamed from: z00.f$c$c, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C2320c implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<C2320c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final Integer f106903a;

            /* renamed from: b, reason: collision with root package name */
            private final String f106904b;

            /* renamed from: z00.f$c$c$a */
            public static final class a implements Parcelable.Creator<C2320c> {
                @Override // android.os.Parcelable.Creator
                public final C2320c createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new C2320c(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final C2320c[] newArray(int i11) {
                    return new C2320c[i11];
                }
            }

            public C2320c(Integer num, String str) {
                this.f106903a = num;
                this.f106904b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2320c)) {
                    return false;
                }
                C2320c c2320c = (C2320c) obj;
                return Intrinsics.d(this.f106903a, c2320c.f106903a) && Intrinsics.d(this.f106904b, c2320c.f106904b);
            }

            public final int hashCode() {
                Integer num = this.f106903a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.f106904b;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                return "HttpInfo(code=" + this.f106903a + ", message=" + this.f106904b + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Integer num = this.f106903a;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeString(this.f106904b);
            }
        }

        public c() {
            this(null, null, null, null, null, 127);
        }

        public final a a() {
            return this.f106890e;
        }

        public final String b() {
            return this.f106887b;
        }

        public final String c() {
            return this.f106886a;
        }

        public final boolean d() {
            return this.f106888c;
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
            return Intrinsics.d(this.f106886a, cVar.f106886a) && Intrinsics.d(this.f106887b, cVar.f106887b) && this.f106888c == cVar.f106888c && Intrinsics.d(this.f106889d, cVar.f106889d) && Intrinsics.d(this.f106890e, cVar.f106890e) && Intrinsics.d(this.f106891f, cVar.f106891f) && Intrinsics.d(this.f106892g, cVar.f106892g);
        }

        public final int hashCode() {
            String str = this.f106886a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f106887b;
            int a11 = C3532b.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f106888c);
            LinkedHashSet linkedHashSet = this.f106889d;
            int hashCode2 = (a11 + (linkedHashSet == null ? 0 : linkedHashSet.hashCode())) * 31;
            a aVar = this.f106890e;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            C2320c c2320c = this.f106891f;
            int hashCode4 = (hashCode3 + (c2320c == null ? 0 : c2320c.hashCode())) * 31;
            Long l11 = this.f106892g;
            return hashCode4 + (l11 != null ? l11.hashCode() : 0);
        }

        @Override // z00.f
        public final boolean isError() {
            return this.f106893h;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServerIssue(traceId=");
            sb2.append(this.f106886a);
            sb2.append(", requestUrl=");
            sb2.append(this.f106887b);
            sb2.append(", isResponseEmpty=");
            sb2.append(this.f106888c);
            sb2.append(", requiredWidgets=");
            sb2.append(this.f106889d);
            sb2.append(", composerInfo=");
            sb2.append(this.f106890e);
            sb2.append(", httpInfo=");
            sb2.append(this.f106891f);
            sb2.append(", timeStamp=");
            return C3051a.d(sb2, this.f106892g, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106886a);
            dest.writeString(this.f106887b);
            dest.writeInt(this.f106888c ? 1 : 0);
            LinkedHashSet linkedHashSet = this.f106889d;
            if (linkedHashSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(linkedHashSet.size());
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    dest.writeString((String) it.next());
                }
            }
            a aVar = this.f106890e;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                aVar.writeToParcel(dest, i11);
            }
            C2320c c2320c = this.f106891f;
            if (c2320c == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                c2320c.writeToParcel(dest, i11);
            }
            Long l11 = this.f106892g;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
        }

        public /* synthetic */ c(String str, String str2, a aVar, C2320c c2320c, Long l11, int i11) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) == 0, null, (i11 & 16) != 0 ? null : aVar, (i11 & 32) != 0 ? null : c2320c, (i11 & 64) != 0 ? null : l11);
        }

        public c(String str, String str2, boolean z11, LinkedHashSet linkedHashSet, a aVar, C2320c c2320c, Long l11) {
            this.f106886a = str;
            this.f106887b = str2;
            this.f106888c = z11;
            this.f106889d = linkedHashSet;
            this.f106890e = aVar;
            this.f106891f = c2320c;
            this.f106892g = l11;
            this.f106893h = true;
        }
    }

    public abstract boolean isError();
}
