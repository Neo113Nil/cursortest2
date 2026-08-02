package ru.ozon.android.messenger.blocks.recommendations;

import T7.P;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.blocks.recommendations.RecommendationsDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.j;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class e implements g, j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f86268a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextDTO f86269b;

    /* renamed from: c, reason: collision with root package name */
    private final TextDTO f86270c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f86271d;

    /* renamed from: e, reason: collision with root package name */
    private final BadgeDTO f86272e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f86273f;

    /* renamed from: g, reason: collision with root package name */
    private final b f86274g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomActionDTO f86275h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f86276i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f86277j;

    /* renamed from: k, reason: collision with root package name */
    private final Boolean f86278k;

    /* renamed from: l, reason: collision with root package name */
    private String f86279l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final RecommendationsDTO.a f86280m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final BadgeDTO f86281a;

        /* renamed from: b, reason: collision with root package name */
        private final DateTime f86282b;

        public a(@NotNull BadgeDTO badge, DateTime dateTime) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.f86281a = badge;
            this.f86282b = dateTime;
        }

        @NotNull
        public final BadgeDTO a() {
            return this.f86281a;
        }

        public final DateTime b() {
            return this.f86282b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f86281a, aVar.f86281a) && Intrinsics.d(this.f86282b, aVar.f86282b);
        }

        public final int hashCode() {
            int hashCode = this.f86281a.hashCode() * 31;
            DateTime dateTime = this.f86282b;
            return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
        }

        @NotNull
        public final String toString() {
            return "BadgeVO(badge=" + this.f86281a + ", expirationDate=" + this.f86282b + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f86283a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final TextDTO f86284b;

        /* renamed from: c, reason: collision with root package name */
        private final UncontainedButtonDTO f86285c;

        static {
            int i11 = UncontainedButtonDTO.$stable;
        }

        public b(String str, @NotNull TextDTO description, UncontainedButtonDTO uncontainedButtonDTO) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f86283a = str;
            this.f86284b = description;
            this.f86285c = uncontainedButtonDTO;
        }

        public final UncontainedButtonDTO a() {
            return this.f86285c;
        }

        @NotNull
        public final TextDTO b() {
            return this.f86284b;
        }

        public final String c() {
            return this.f86283a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f86283a, bVar.f86283a) && Intrinsics.d(this.f86284b, bVar.f86284b) && Intrinsics.d(this.f86285c, bVar.f86285c);
        }

        public final int hashCode() {
            String str = this.f86283a;
            int a11 = Ns.b.a(this.f86284b, (str == null ? 0 : str.hashCode()) * 31, 31);
            UncontainedButtonDTO uncontainedButtonDTO = this.f86285c;
            return a11 + (uncontainedButtonDTO != null ? uncontainedButtonDTO.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "ErrorVO(imageUrl=" + this.f86283a + ", description=" + this.f86284b + ", button=" + this.f86285c + ")";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f86286a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final TextDTO f86287b;

        /* renamed from: c, reason: collision with root package name */
        private final PriceDTO f86288c;

        /* renamed from: d, reason: collision with root package name */
        private final Boolean f86289d;

        /* renamed from: e, reason: collision with root package name */
        private final IconDTO f86290e;

        /* renamed from: f, reason: collision with root package name */
        private final IconButtonDTO f86291f;

        /* renamed from: g, reason: collision with root package name */
        private final AtomActionDTO f86292g;

        /* renamed from: h, reason: collision with root package name */
        private final Map<String, MessengerTrackingInfo> f86293h;

        public c(@NotNull String imageUrl, @NotNull TextDTO title, PriceDTO priceDTO, Boolean bool, IconDTO iconDTO, IconButtonDTO iconButtonDTO, AtomActionDTO atomActionDTO, Map<String, MessengerTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f86286a = imageUrl;
            this.f86287b = title;
            this.f86288c = priceDTO;
            this.f86289d = bool;
            this.f86290e = iconDTO;
            this.f86291f = iconButtonDTO;
            this.f86292g = atomActionDTO;
            this.f86293h = map;
        }

        public final AtomActionDTO a() {
            return this.f86292g;
        }

        public final IconButtonDTO b() {
            return this.f86291f;
        }

        public final IconDTO c() {
            return this.f86290e;
        }

        @NotNull
        public final String d() {
            return this.f86286a;
        }

        public final PriceDTO e() {
            return this.f86288c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f86286a, cVar.f86286a) && Intrinsics.d(this.f86287b, cVar.f86287b) && Intrinsics.d(this.f86288c, cVar.f86288c) && Intrinsics.d(this.f86289d, cVar.f86289d) && Intrinsics.d(this.f86290e, cVar.f86290e) && Intrinsics.d(this.f86291f, cVar.f86291f) && Intrinsics.d(this.f86292g, cVar.f86292g) && Intrinsics.d(this.f86293h, cVar.f86293h);
        }

        @NotNull
        public final TextDTO f() {
            return this.f86287b;
        }

        public final int hashCode() {
            int a11 = Ns.b.a(this.f86287b, this.f86286a.hashCode() * 31, 31);
            PriceDTO priceDTO = this.f86288c;
            int hashCode = (a11 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            Boolean bool = this.f86289d;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            IconDTO iconDTO = this.f86290e;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            IconButtonDTO iconButtonDTO = this.f86291f;
            int hashCode4 = (hashCode3 + (iconButtonDTO == null ? 0 : iconButtonDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.f86292g;
            int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, MessengerTrackingInfo> map = this.f86293h;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProductVO(imageUrl=");
            sb2.append(this.f86286a);
            sb2.append(", title=");
            sb2.append(this.f86287b);
            sb2.append(", price=");
            sb2.append(this.f86288c);
            sb2.append(", isAdult=");
            sb2.append(this.f86289d);
            sb2.append(", icon=");
            sb2.append(this.f86290e);
            sb2.append(", button=");
            sb2.append(this.f86291f);
            sb2.append(", action=");
            sb2.append(this.f86292g);
            sb2.append(", trackingInfo=");
            return P.f(sb2, this.f86293h, ")");
        }
    }

    public e(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull TextDTO title, TextDTO textDTO, ArrayList arrayList, BadgeDTO badgeDTO, ArrayList arrayList2, b bVar, AtomActionDTO atomActionDTO, Map map, Map map2, Boolean bool, String str, @NotNull RecommendationsDTO.a place) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(place, "place");
        this.f86268a = blockId;
        this.f86269b = title;
        this.f86270c = textDTO;
        this.f86271d = arrayList;
        this.f86272e = badgeDTO;
        this.f86273f = arrayList2;
        this.f86274g = bVar;
        this.f86275h = atomActionDTO;
        this.f86276i = map;
        this.f86277j = map2;
        this.f86278k = bool;
        this.f86279l = str;
        this.f86280m = place;
    }

    public static e a(e eVar) {
        Boolean bool = Boolean.TRUE;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = eVar.f86268a;
        TextDTO title = eVar.f86269b;
        TextDTO textDTO = eVar.f86270c;
        ArrayList arrayList = eVar.f86271d;
        BadgeDTO badgeDTO = eVar.f86272e;
        ArrayList arrayList2 = eVar.f86273f;
        b bVar = eVar.f86274g;
        AtomActionDTO atomActionDTO = eVar.f86275h;
        Map<String, String> map = eVar.f86276i;
        Map<String, MessengerTrackingInfo> map2 = eVar.f86277j;
        String str = eVar.f86279l;
        RecommendationsDTO.a place = eVar.f86280m;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(place, "place");
        return new e(blockId, title, textDTO, arrayList, badgeDTO, arrayList2, bVar, atomActionDTO, map, map2, bool, str, place);
    }

    public final List<a> b() {
        return this.f86271d;
    }

    public final BadgeDTO c() {
        return this.f86272e;
    }

    public final b d() {
        return this.f86274g;
    }

    public final Boolean e() {
        return this.f86278k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f86268a, eVar.f86268a) && Intrinsics.d(this.f86269b, eVar.f86269b) && Intrinsics.d(this.f86270c, eVar.f86270c) && Intrinsics.d(this.f86271d, eVar.f86271d) && Intrinsics.d(this.f86272e, eVar.f86272e) && Intrinsics.d(this.f86273f, eVar.f86273f) && Intrinsics.d(this.f86274g, eVar.f86274g) && Intrinsics.d(this.f86275h, eVar.f86275h) && Intrinsics.d(this.f86276i, eVar.f86276i) && Intrinsics.d(this.f86277j, eVar.f86277j) && Intrinsics.d(this.f86278k, eVar.f86278k) && Intrinsics.d(this.f86279l, eVar.f86279l) && this.f86280m == eVar.f86280m;
    }

    @NotNull
    public final RecommendationsDTO.a f() {
        return this.f86280m;
    }

    public final List<c> g() {
        return this.f86273f;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f86268a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final String getSendTime() {
        return this.f86279l;
    }

    public final TextDTO h() {
        return this.f86270c;
    }

    public final int hashCode() {
        int a11 = Ns.b.a(this.f86269b, this.f86268a.hashCode() * 31, 31);
        TextDTO textDTO = this.f86270c;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        ArrayList arrayList = this.f86271d;
        int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        BadgeDTO badgeDTO = this.f86272e;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        ArrayList arrayList2 = this.f86273f;
        int hashCode4 = (hashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        b bVar = this.f86274g;
        int hashCode5 = (hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.f86275h;
        int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, String> map = this.f86276i;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map2 = this.f86277j;
        int hashCode8 = (hashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool = this.f86278k;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f86279l;
        return this.f86280m.hashCode() + ((hashCode9 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public final TextDTO i() {
        return this.f86269b;
    }

    public final Map<String, MessengerTrackingInfo> j() {
        return this.f86277j;
    }

    public final AtomActionDTO k() {
        return this.f86275h;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final void setSendTime(String str) {
        this.f86279l = str;
    }

    @NotNull
    public final String toString() {
        String str = this.f86279l;
        StringBuilder sb2 = new StringBuilder("RecommendationsVO(blockId=");
        sb2.append(this.f86268a);
        sb2.append(", title=");
        sb2.append(this.f86269b);
        sb2.append(", subtitle=");
        sb2.append(this.f86270c);
        sb2.append(", badges=");
        sb2.append(this.f86271d);
        sb2.append(", buttonBadge=");
        sb2.append(this.f86272e);
        sb2.append(", products=");
        sb2.append(this.f86273f);
        sb2.append(", error=");
        sb2.append(this.f86274g);
        sb2.append(", updateBlockAction=");
        sb2.append(this.f86275h);
        sb2.append(", lexemes=");
        sb2.append(this.f86276i);
        sb2.append(", trackingInfo=");
        sb2.append(this.f86277j);
        sb2.append(", needUpdate=");
        HY.b.c(this.f86278k, ", sendTime=", str, ", place=", sb2);
        sb2.append(this.f86280m);
        sb2.append(")");
        return sb2.toString();
    }
}
