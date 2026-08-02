package ru.ozon.android.messenger.blocks.chatlistheader;

import C.J;
import De.C2860c;
import Kk.C3532b;
import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chatlistheader.ChatListHeaderDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class f implements g, Parcelable {

    @NotNull
    public static final Parcelable.Creator<f> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84741a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<b> f84742b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f84743c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final c f84744d;

    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ru.ozon.android.messenger.framework.presentation.models.c createFromParcel = ru.ozon.android.messenger.framework.presentation.models.c.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = Bi.b.a(f.class, parcel, arrayList, i11, 1);
            }
            return new f(createFromParcel, arrayList, parcel.readInt() != 0, (c) parcel.readParcelable(f.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i11) {
            return new f[i11];
        }
    }

    public static abstract class b implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final IconDTO f84745a;

        public static final class a extends b {

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C1481a();

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final IconDTO f84746b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final d f84747c;

            /* renamed from: d, reason: collision with root package name */
            private final ru.ozon.android.messenger.framework.navigation.action.a f84748d;

            /* renamed from: e, reason: collision with root package name */
            private final Object f84749e;

            /* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.f$b$a$a, reason: collision with other inner class name */
            public static final class C1481a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    IconDTO iconDTO = (IconDTO) parcel.readParcelable(a.class.getClassLoader());
                    d createFromParcel = d.CREATOR.createFromParcel(parcel);
                    LinkedHashMap linkedHashMap = null;
                    ru.ozon.android.messenger.framework.navigation.action.a createFromParcel2 = parcel.readInt() == 0 ? null : ru.ozon.android.messenger.framework.navigation.action.a.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        int readInt = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        for (int i11 = 0; i11 != readInt; i11++) {
                            linkedHashMap2.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new a(iconDTO, createFromParcel, createFromParcel2, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull IconDTO menuIcon, @NotNull d menuItem, ru.ozon.android.messenger.framework.navigation.action.a aVar, Map<String, MessengerTrackingInfo> map) {
                super(menuIcon);
                Intrinsics.checkNotNullParameter(menuIcon, "menuIcon");
                Intrinsics.checkNotNullParameter(menuItem, "menuItem");
                this.f84746b = menuIcon;
                this.f84747c = menuItem;
                this.f84748d = aVar;
                this.f84749e = map;
            }

            @Override // ru.ozon.android.messenger.blocks.chatlistheader.f.b
            @NotNull
            public final IconDTO a() {
                return this.f84746b;
            }

            public final ru.ozon.android.messenger.framework.navigation.action.a b() {
                return this.f84748d;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo>] */
            public final Map<String, MessengerTrackingInfo> c() {
                return this.f84749e;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f84746b, i11);
                this.f84747c.writeToParcel(dest, i11);
                ru.ozon.android.messenger.framework.navigation.action.a aVar = this.f84748d;
                if (aVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    aVar.writeToParcel(dest, i11);
                }
                ?? r22 = this.f84749e;
                if (r22 == 0) {
                    dest.writeInt(0);
                    return;
                }
                dest.writeInt(1);
                dest.writeInt(r22.size());
                for (Map.Entry entry : r22.entrySet()) {
                    dest.writeString((String) entry.getKey());
                    ((MessengerTrackingInfo) entry.getValue()).writeToParcel(dest, i11);
                }
            }
        }

        /* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.f$b$b, reason: collision with other inner class name */
        public static final class C1482b extends b {

            @NotNull
            public static final Parcelable.Creator<C1482b> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final IconDTO f84750b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final d f84751c;

            /* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.f$b$b$a */
            public static final class a implements Parcelable.Creator<C1482b> {
                @Override // android.os.Parcelable.Creator
                public final C1482b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new C1482b((IconDTO) parcel.readParcelable(C1482b.class.getClassLoader()), d.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final C1482b[] newArray(int i11) {
                    return new C1482b[i11];
                }
            }

            static {
                int i11 = IconTitleSubtitleCellDTO.$stable;
                int i12 = IconDTO.$stable;
                CREATOR = new a();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1482b(@NotNull IconDTO menuIcon, @NotNull d menuItem) {
                super(menuIcon);
                Intrinsics.checkNotNullParameter(menuIcon, "menuIcon");
                Intrinsics.checkNotNullParameter(menuItem, "menuItem");
                this.f84750b = menuIcon;
                this.f84751c = menuItem;
            }

            @Override // ru.ozon.android.messenger.blocks.chatlistheader.f.b
            @NotNull
            public final IconDTO a() {
                return this.f84750b;
            }

            @NotNull
            public final d b() {
                return this.f84751c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f84750b, i11);
                this.f84751c.writeToParcel(dest, i11);
            }
        }

        static {
            int i11 = IconTitleSubtitleCellDTO.$stable;
            int i12 = IconDTO.$stable;
        }

        public b(IconDTO iconDTO) {
            this.f84745a = iconDTO;
        }

        @NotNull
        public IconDTO a() {
            return this.f84745a;
        }
    }

    public interface c extends Parcelable {

        public static final class a implements c, Parcelable {

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C1483a();

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final IconDTO f84752a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final TextDTO f84753b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final TextDTO f84754c;

            /* renamed from: d, reason: collision with root package name */
            private final ButtonV3DTO f84755d;

            /* renamed from: e, reason: collision with root package name */
            private final Long f84756e;

            /* renamed from: f, reason: collision with root package name */
            private final Integer f84757f;

            /* renamed from: g, reason: collision with root package name */
            private final Integer f84758g;

            /* renamed from: h, reason: collision with root package name */
            private final Integer f84759h;

            /* renamed from: i, reason: collision with root package name */
            private final boolean f84760i;

            /* renamed from: j, reason: collision with root package name */
            private final ChatListHeaderDTO.SearchBarDTO.ClearIconDTO f84761j;

            /* renamed from: k, reason: collision with root package name */
            private final Map<String, MessengerTrackingInfo> f84762k;

            /* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.f$c$a$a, reason: collision with other inner class name */
            public static final class C1483a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    IconDTO iconDTO = (IconDTO) parcel.readParcelable(a.class.getClassLoader());
                    TextDTO textDTO = (TextDTO) parcel.readParcelable(a.class.getClassLoader());
                    TextDTO textDTO2 = (TextDTO) parcel.readParcelable(a.class.getClassLoader());
                    ButtonV3DTO buttonV3DTO = (ButtonV3DTO) parcel.readParcelable(a.class.getClassLoader());
                    LinkedHashMap linkedHashMap = null;
                    Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                    Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    boolean z11 = parcel.readInt() != 0;
                    ChatListHeaderDTO.SearchBarDTO.ClearIconDTO createFromParcel = parcel.readInt() == 0 ? null : ChatListHeaderDTO.SearchBarDTO.ClearIconDTO.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        int readInt = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(readInt);
                        for (int i11 = 0; i11 != readInt; i11++) {
                            linkedHashMap.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                        }
                    }
                    return new a(iconDTO, textDTO, textDTO2, buttonV3DTO, valueOf, valueOf2, valueOf3, valueOf4, z11, createFromParcel, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            public a(@NotNull IconDTO leftIcon, @NotNull TextDTO hint, @NotNull TextDTO text, ButtonV3DTO buttonV3DTO, Long l11, Integer num, Integer num2, Integer num3, boolean z11, ChatListHeaderDTO.SearchBarDTO.ClearIconDTO clearIconDTO, Map<String, MessengerTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(text, "text");
                this.f84752a = leftIcon;
                this.f84753b = hint;
                this.f84754c = text;
                this.f84755d = buttonV3DTO;
                this.f84756e = l11;
                this.f84757f = num;
                this.f84758g = num2;
                this.f84759h = num3;
                this.f84760i = z11;
                this.f84761j = clearIconDTO;
                this.f84762k = map;
            }

            public static a a(a aVar, TextDTO textDTO, int i11) {
                IconDTO leftIcon = aVar.f84752a;
                TextDTO hint = aVar.f84753b;
                if ((i11 & 4) != 0) {
                    textDTO = aVar.f84754c;
                }
                TextDTO text = textDTO;
                ButtonV3DTO buttonV3DTO = aVar.f84755d;
                Long l11 = aVar.f84756e;
                Integer num = aVar.f84757f;
                Integer num2 = aVar.f84758g;
                Integer num3 = aVar.f84759h;
                boolean z11 = (i11 & 256) != 0 ? aVar.f84760i : true;
                ChatListHeaderDTO.SearchBarDTO.ClearIconDTO clearIconDTO = aVar.f84761j;
                Map<String, MessengerTrackingInfo> map = aVar.f84762k;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(text, "text");
                return new a(leftIcon, hint, text, buttonV3DTO, l11, num, num2, num3, z11, clearIconDTO, map);
            }

            public final ButtonV3DTO b() {
                return this.f84755d;
            }

            public final ChatListHeaderDTO.SearchBarDTO.ClearIconDTO c() {
                return this.f84761j;
            }

            public final Integer d() {
                return this.f84757f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final Long e() {
                return this.f84756e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.d(this.f84752a, aVar.f84752a) && Intrinsics.d(this.f84753b, aVar.f84753b) && Intrinsics.d(this.f84754c, aVar.f84754c) && Intrinsics.d(this.f84755d, aVar.f84755d) && Intrinsics.d(this.f84756e, aVar.f84756e) && Intrinsics.d(this.f84757f, aVar.f84757f) && Intrinsics.d(this.f84758g, aVar.f84758g) && Intrinsics.d(this.f84759h, aVar.f84759h) && this.f84760i == aVar.f84760i && Intrinsics.d(this.f84761j, aVar.f84761j) && Intrinsics.d(this.f84762k, aVar.f84762k);
            }

            @NotNull
            public final TextDTO f() {
                return this.f84753b;
            }

            @NotNull
            public final IconDTO g() {
                return this.f84752a;
            }

            public final Integer h() {
                return this.f84759h;
            }

            public final int hashCode() {
                int a11 = Ns.b.a(this.f84754c, Ns.b.a(this.f84753b, this.f84752a.hashCode() * 31, 31), 31);
                ButtonV3DTO buttonV3DTO = this.f84755d;
                int hashCode = (a11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
                Long l11 = this.f84756e;
                int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
                Integer num = this.f84757f;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f84758g;
                int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f84759h;
                int a12 = C3532b.a((hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.f84760i);
                ChatListHeaderDTO.SearchBarDTO.ClearIconDTO clearIconDTO = this.f84761j;
                int hashCode5 = (a12 + (clearIconDTO == null ? 0 : clearIconDTO.hashCode())) * 31;
                Map<String, MessengerTrackingInfo> map = this.f84762k;
                return hashCode5 + (map != null ? map.hashCode() : 0);
            }

            public final Integer i() {
                return this.f84758g;
            }

            @NotNull
            public final TextDTO j() {
                return this.f84754c;
            }

            public final Map<String, MessengerTrackingInfo> k() {
                return this.f84762k;
            }

            public final boolean l() {
                return this.f84760i;
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SearchBarVO(leftIcon=");
                sb2.append(this.f84752a);
                sb2.append(", hint=");
                sb2.append(this.f84753b);
                sb2.append(", text=");
                sb2.append(this.f84754c);
                sb2.append(", cancelButton=");
                sb2.append(this.f84755d);
                sb2.append(", debounceMillis=");
                sb2.append(this.f84756e);
                sb2.append(", cornerRadius=");
                sb2.append(this.f84757f);
                sb2.append(", minSearchQueryTextLength=");
                sb2.append(this.f84758g);
                sb2.append(", maxSearchQueryTextLength=");
                sb2.append(this.f84759h);
                sb2.append(", isInputEnabled=");
                sb2.append(this.f84760i);
                sb2.append(", clearIcon=");
                sb2.append(this.f84761j);
                sb2.append(", trackingInfo=");
                return P.f(sb2, this.f84762k, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f84752a, i11);
                dest.writeParcelable(this.f84753b, i11);
                dest.writeParcelable(this.f84754c, i11);
                dest.writeParcelable(this.f84755d, i11);
                Long l11 = this.f84756e;
                if (l11 == null) {
                    dest.writeInt(0);
                } else {
                    C2860c.e(dest, 1, l11);
                }
                Integer num = this.f84757f;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                Integer num2 = this.f84758g;
                if (num2 == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num2);
                }
                Integer num3 = this.f84759h;
                if (num3 == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num3);
                }
                dest.writeInt(this.f84760i ? 1 : 0);
                ChatListHeaderDTO.SearchBarDTO.ClearIconDTO clearIconDTO = this.f84761j;
                if (clearIconDTO == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    clearIconDTO.writeToParcel(dest, i11);
                }
                Map<String, MessengerTrackingInfo> map = this.f84762k;
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

        public static final class b implements c, Parcelable {

            @NotNull
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final TextDTO f84763a;

            public static final class a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                public final b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new b((TextDTO) parcel.readParcelable(b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final b[] newArray(int i11) {
                    return new b[i11];
                }
            }

            public b(@NotNull TextDTO title) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.f84763a = title;
            }

            @NotNull
            public final TextDTO a() {
                return this.f84763a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.d(this.f84763a, ((b) obj).f84763a);
            }

            public final int hashCode() {
                return this.f84763a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "TitleVO(title=" + this.f84763a + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f84763a, i11);
            }
        }
    }

    public static final class d implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<d> CREATOR;

        /* renamed from: a, reason: collision with root package name */
        private final List<IconTitleSubtitleCellDTO> f84764a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f84765b;

        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = Bi.b.a(d.class, parcel, arrayList, i11, 1);
                    }
                }
                return new d(arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        static {
            int i11 = IconTitleSubtitleCellDTO.$stable;
            CREATOR = new a();
        }

        public d(List<IconTitleSubtitleCellDTO> list, Integer num) {
            this.f84764a = list;
            this.f84765b = num;
        }

        public final List<IconTitleSubtitleCellDTO> a() {
            return this.f84764a;
        }

        public final Integer b() {
            return this.f84765b;
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
            return Intrinsics.d(this.f84764a, dVar.f84764a) && Intrinsics.d(this.f84765b, dVar.f84765b);
        }

        public final int hashCode() {
            List<IconTitleSubtitleCellDTO> list = this.f84764a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Integer num = this.f84765b;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "MenuItemVO(actionButtons=" + this.f84764a + ", loadingTtl=" + this.f84765b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<IconTitleSubtitleCellDTO> list = this.f84764a;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator c11 = J.c(dest, 1, list);
                while (c11.hasNext()) {
                    dest.writeParcelable((Parcelable) c11.next(), i11);
                }
            }
            Integer num = this.f84765b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
        }
    }

    static {
        int i11 = IconTitleSubtitleCellDTO.$stable;
        int i12 = IconDTO.$stable;
        CREATOR = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull List<? extends b> headerMenuItems, boolean z11, @NotNull c mainItem) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(headerMenuItems, "headerMenuItems");
        Intrinsics.checkNotNullParameter(mainItem, "mainItem");
        this.f84741a = blockId;
        this.f84742b = headerMenuItems;
        this.f84743c = z11;
        this.f84744d = mainItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f a(f fVar, K k11, c mainItem, int i11) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = fVar.f84741a;
        List headerMenuItems = k11;
        if ((i11 & 2) != 0) {
            headerMenuItems = fVar.f84742b;
        }
        boolean z11 = (i11 & 4) != 0 ? fVar.f84743c : false;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(headerMenuItems, "headerMenuItems");
        Intrinsics.checkNotNullParameter(mainItem, "mainItem");
        return new f(blockId, headerMenuItems, z11, mainItem);
    }

    public final boolean b() {
        return this.f84743c;
    }

    @NotNull
    public final List<b> c() {
        return this.f84742b;
    }

    @NotNull
    public final c d() {
        return this.f84744d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f84741a, fVar.f84741a) && Intrinsics.d(this.f84742b, fVar.f84742b) && this.f84743c == fVar.f84743c && Intrinsics.d(this.f84744d, fVar.f84744d);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84741a;
    }

    public final int hashCode() {
        return this.f84744d.hashCode() + C3532b.a(G.g.b(this.f84741a.hashCode() * 31, 31, this.f84742b), 31, this.f84743c);
    }

    @NotNull
    public final String toString() {
        return "ChatListHeaderVO(blockId=" + this.f84741a + ", headerMenuItems=" + this.f84742b + ", backBtnEnabled=" + this.f84743c + ", mainItem=" + this.f84744d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84741a.writeToParcel(dest, i11);
        Iterator c11 = Bi.a.c(this.f84742b, dest);
        while (c11.hasNext()) {
            dest.writeParcelable((Parcelable) c11.next(), i11);
        }
        dest.writeInt(this.f84743c ? 1 : 0);
        dest.writeParcelable(this.f84744d, i11);
    }
}
