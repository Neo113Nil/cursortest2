package ru.ozon.android.messenger.blocks.notification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.TimerBadge;
import ru.ozon.android.messenger.framework.presentation.models.j;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

/* loaded from: classes10.dex */
public final class b implements ru.ozon.android.messenger.framework.presentation.models.g, j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85899a;

    /* renamed from: b, reason: collision with root package name */
    private final a f85900b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Badge> f85901c;

    /* renamed from: d, reason: collision with root package name */
    private final List<TextAtom> f85902d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f85903e;

    /* renamed from: f, reason: collision with root package name */
    private final TimerBadge f85904f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomAction f85905g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f85906h;

    /* renamed from: i, reason: collision with root package name */
    private String f85907i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f85908a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f85909b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f85910c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f85911d;

        public a(@NotNull String url, Integer num, Integer num2, boolean z11) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f85908a = url;
            this.f85909b = num;
            this.f85910c = num2;
            this.f85911d = z11;
        }

        public final Integer a() {
            return this.f85910c;
        }

        @NotNull
        public final String b() {
            return this.f85908a;
        }

        public final Integer c() {
            return this.f85909b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f85908a, aVar.f85908a) && Intrinsics.d(this.f85909b, aVar.f85909b) && Intrinsics.d(this.f85910c, aVar.f85910c) && this.f85911d == aVar.f85911d;
        }

        public final int hashCode() {
            int hashCode = this.f85908a.hashCode() * 31;
            Integer num = this.f85909b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f85910c;
            return Boolean.hashCode(this.f85911d) + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImageVO(url=");
            sb2.append(this.f85908a);
            sb2.append(", width=");
            sb2.append(this.f85909b);
            sb2.append(", height=");
            sb2.append(this.f85910c);
            sb2.append(", shouldAddShape=");
            return Pk0.a.a(")", sb2, this.f85911d);
        }
    }

    public b() {
        throw null;
    }

    public b(ru.ozon.android.messenger.framework.presentation.models.c blockId, a aVar, List list, List list2, ArrayList arrayList, TimerBadge timerBadge, AtomAction atomAction, Map map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f85899a = blockId;
        this.f85900b = aVar;
        this.f85901c = list;
        this.f85902d = list2;
        this.f85903e = arrayList;
        this.f85904f = timerBadge;
        this.f85905g = atomAction;
        this.f85906h = map;
        this.f85907i = null;
    }

    public final AtomAction a() {
        return this.f85905g;
    }

    public final List<Badge> b() {
        return this.f85901c;
    }

    public final List<ButtonV3Atom> c() {
        return this.f85903e;
    }

    public final List<TextAtom> d() {
        return this.f85902d;
    }

    public final a e() {
        return this.f85900b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f85899a, bVar.f85899a) && Intrinsics.d(this.f85900b, bVar.f85900b) && Intrinsics.d(this.f85901c, bVar.f85901c) && Intrinsics.d(this.f85902d, bVar.f85902d) && Intrinsics.d(this.f85903e, bVar.f85903e) && Intrinsics.d(this.f85904f, bVar.f85904f) && Intrinsics.d(this.f85905g, bVar.f85905g) && Intrinsics.d(this.f85906h, bVar.f85906h) && Intrinsics.d(this.f85907i, bVar.f85907i);
    }

    public final TimerBadge f() {
        return this.f85904f;
    }

    public final Map<String, MessengerTrackingInfo> g() {
        return this.f85906h;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85899a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final String getSendTime() {
        return this.f85907i;
    }

    public final int hashCode() {
        int hashCode = this.f85899a.hashCode() * 31;
        a aVar = this.f85900b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<Badge> list = this.f85901c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<TextAtom> list2 = this.f85902d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ArrayList arrayList = this.f85903e;
        int hashCode5 = (hashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        TimerBadge timerBadge = this.f85904f;
        int hashCode6 = (hashCode5 + (timerBadge == null ? 0 : timerBadge.hashCode())) * 31;
        AtomAction atomAction = this.f85905g;
        int hashCode7 = (hashCode6 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.f85906h;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f85907i;
        return hashCode8 + (str != null ? str.hashCode() : 0);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public final void setSendTime(String str) {
        this.f85907i = str;
    }

    @NotNull
    public final String toString() {
        return "NotificationVO(blockId=" + this.f85899a + ", image=" + this.f85900b + ", badges=" + this.f85901c + ", content=" + this.f85902d + ", buttons=" + this.f85903e + ", timer=" + this.f85904f + ", action=" + this.f85905g + ", trackingInfo=" + this.f85906h + ", sendTime=" + this.f85907i + ")";
    }
}
