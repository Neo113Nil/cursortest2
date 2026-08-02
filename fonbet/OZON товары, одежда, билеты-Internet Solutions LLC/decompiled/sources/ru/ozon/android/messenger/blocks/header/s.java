package ru.ozon.android.messenger.blocks.header;

import C.o0;
import Kk.C3532b;
import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.header.ChatHeaderDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class s implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85321a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextDTO f85322b;

    /* renamed from: c, reason: collision with root package name */
    private final List<TextDTO> f85323c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomAction f85324d;

    /* renamed from: e, reason: collision with root package name */
    private final IconDTO f85325e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f85326f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f85327g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<ButtonV3Atom.SmallButtonWithIcon> f85328h;

    /* renamed from: i, reason: collision with root package name */
    private final String f85329i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f85330j;

    /* renamed from: k, reason: collision with root package name */
    private final ChatHeaderDTO.a f85331k;

    /* renamed from: l, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f85332l;

    /* renamed from: m, reason: collision with root package name */
    private final Icon f85333m;

    /* renamed from: n, reason: collision with root package name */
    private final String f85334n;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Icon f85335a;

        /* renamed from: b, reason: collision with root package name */
        private final b f85336b;

        public a(@NotNull Icon icon, b bVar) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.f85335a = icon;
            this.f85336b = bVar;
        }

        @NotNull
        public final Icon a() {
            return this.f85335a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f85335a, aVar.f85335a) && Intrinsics.d(this.f85336b, aVar.f85336b);
        }

        public final int hashCode() {
            int hashCode = this.f85335a.hashCode() * 31;
            b bVar = this.f85336b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "IconItemVO(icon=" + this.f85335a + ", tooltip=" + this.f85336b + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f85337a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f85338b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<String, MessengerTrackingInfo> f85339c;

        public b(String str, @NotNull String description, Map<String, MessengerTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f85337a = str;
            this.f85338b = description;
            this.f85339c = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f85337a, bVar.f85337a) && Intrinsics.d(this.f85338b, bVar.f85338b) && Intrinsics.d(this.f85339c, bVar.f85339c);
        }

        public final int hashCode() {
            String str = this.f85337a;
            int a11 = G.g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f85338b);
            Map<String, MessengerTrackingInfo> map = this.f85339c;
            return a11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IconTooltipItemVO(title=");
            sb2.append(this.f85337a);
            sb2.append(", description=");
            sb2.append(this.f85338b);
            sb2.append(", trackingInfo=");
            return P.f(sb2, this.f85339c, ")");
        }
    }

    public s(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull TextDTO titleAtom, List<TextDTO> list, AtomAction atomAction, IconDTO iconDTO, @NotNull String backgroundColor, @NotNull List<a> titleIcons, @NotNull List<ButtonV3Atom.SmallButtonWithIcon> buttons, String str, boolean z11, ChatHeaderDTO.a aVar, Map<String, MessengerTrackingInfo> map, Icon icon, String str2) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(titleIcons, "titleIcons");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f85321a = blockId;
        this.f85322b = titleAtom;
        this.f85323c = list;
        this.f85324d = atomAction;
        this.f85325e = iconDTO;
        this.f85326f = backgroundColor;
        this.f85327g = titleIcons;
        this.f85328h = buttons;
        this.f85329i = str;
        this.f85330j = z11;
        this.f85331k = aVar;
        this.f85332l = map;
        this.f85333m = icon;
        this.f85334n = str2;
    }

    public final AtomAction a() {
        return this.f85324d;
    }

    public final IconDTO b() {
        return this.f85325e;
    }

    public final boolean c() {
        return this.f85330j;
    }

    @NotNull
    public final String d() {
        return this.f85326f;
    }

    @NotNull
    public final List<ButtonV3Atom.SmallButtonWithIcon> e() {
        return this.f85328h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f85321a, sVar.f85321a) && Intrinsics.d(this.f85322b, sVar.f85322b) && Intrinsics.d(this.f85323c, sVar.f85323c) && Intrinsics.d(this.f85324d, sVar.f85324d) && Intrinsics.d(this.f85325e, sVar.f85325e) && Intrinsics.d(this.f85326f, sVar.f85326f) && Intrinsics.d(this.f85327g, sVar.f85327g) && Intrinsics.d(this.f85328h, sVar.f85328h) && Intrinsics.d(this.f85329i, sVar.f85329i) && this.f85330j == sVar.f85330j && this.f85331k == sVar.f85331k && Intrinsics.d(this.f85332l, sVar.f85332l) && Intrinsics.d(this.f85333m, sVar.f85333m) && Intrinsics.d(this.f85334n, sVar.f85334n);
    }

    public final ChatHeaderDTO.a f() {
        return this.f85331k;
    }

    public final Icon g() {
        return this.f85333m;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85321a;
    }

    public final String h() {
        return this.f85334n;
    }

    public final int hashCode() {
        int a11 = Ns.b.a(this.f85322b, this.f85321a.hashCode() * 31, 31);
        List<TextDTO> list = this.f85323c;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        AtomAction atomAction = this.f85324d;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        IconDTO iconDTO = this.f85325e;
        int b11 = G.g.b(H00.a.c(G.g.a((hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.f85326f), 31, this.f85327g), 31, this.f85328h);
        String str = this.f85329i;
        int a12 = C3532b.a((b11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f85330j);
        ChatHeaderDTO.a aVar = this.f85331k;
        int hashCode3 = (a12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.f85332l;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Icon icon = this.f85333m;
        int hashCode5 = (hashCode4 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str2 = this.f85334n;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final List<TextDTO> i() {
        return this.f85323c;
    }

    @NotNull
    public final TextDTO j() {
        return this.f85322b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<ru.ozon.android.messenger.blocks.header.s$a>] */
    @NotNull
    public final List<a> k() {
        return this.f85327g;
    }

    public final Map<String, MessengerTrackingInfo> l() {
        return this.f85332l;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatHeaderVO(blockId=");
        sb2.append(this.f85321a);
        sb2.append(", titleAtom=");
        sb2.append(this.f85322b);
        sb2.append(", subtitles=");
        sb2.append(this.f85323c);
        sb2.append(", action=");
        sb2.append(this.f85324d);
        sb2.append(", avatarIcon=");
        sb2.append(this.f85325e);
        sb2.append(", backgroundColor=");
        sb2.append(this.f85326f);
        sb2.append(", titleIcons=");
        sb2.append(this.f85327g);
        sb2.append(", buttons=");
        sb2.append(this.f85328h);
        sb2.append(", animation=");
        sb2.append(this.f85329i);
        sb2.append(", backButtonEnabled=");
        sb2.append(this.f85330j);
        sb2.append(", onlineStatus=");
        sb2.append(this.f85331k);
        sb2.append(", trackingInfo=");
        sb2.append(this.f85332l);
        sb2.append(", statusIcon=");
        sb2.append(this.f85333m);
        sb2.append(", statusIconUrl=");
        return o0.c(sb2, this.f85334n, ")");
    }
}
