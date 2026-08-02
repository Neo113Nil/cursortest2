package ru.ozon.android.messenger.framework.presentation.models.responses;

import B90.C2618u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<q> f91492a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f91493b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f91494c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f91495d;

    /* renamed from: e, reason: collision with root package name */
    private final String f91496e;

    /* renamed from: f, reason: collision with root package name */
    private final a f91497f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final q f91498a;

        /* renamed from: b, reason: collision with root package name */
        private final q f91499b;

        /* renamed from: c, reason: collision with root package name */
        private final q f91500c;

        /* renamed from: d, reason: collision with root package name */
        private final q f91501d;

        public a(q qVar, q qVar2, q qVar3, q qVar4) {
            this.f91498a = qVar;
            this.f91499b = qVar2;
            this.f91500c = qVar3;
            this.f91501d = qVar4;
        }

        public static a a(a aVar, q qVar) {
            q qVar2 = aVar.f91499b;
            q qVar3 = aVar.f91500c;
            q qVar4 = aVar.f91501d;
            aVar.getClass();
            return new a(qVar, qVar2, qVar3, qVar4);
        }

        public final q b() {
            return this.f91498a;
        }

        public final q c() {
            return this.f91500c;
        }

        public final q d() {
            return this.f91499b;
        }

        public final q e() {
            return this.f91501d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f91498a, aVar.f91498a) && Intrinsics.d(this.f91499b, aVar.f91499b) && Intrinsics.d(this.f91500c, aVar.f91500c) && Intrinsics.d(this.f91501d, aVar.f91501d);
        }

        public final int hashCode() {
            q qVar = this.f91498a;
            int hashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
            q qVar2 = this.f91499b;
            int hashCode2 = (hashCode + (qVar2 == null ? 0 : qVar2.hashCode())) * 31;
            q qVar3 = this.f91500c;
            int hashCode3 = (hashCode2 + (qVar3 == null ? 0 : qVar3.hashCode())) * 31;
            q qVar4 = this.f91501d;
            return hashCode3 + (qVar4 != null ? qVar4.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "ChatListFirstPageInfoVO(chatGroups=" + this.f91498a + ", header=" + this.f91499b + ", floatButton=" + this.f91500c + ", popUp=" + this.f91501d + ")";
        }
    }

    public g(@NotNull List chatListBlocks, @NotNull ArrayList noUiItems, Boolean bool, @NotNull LinkedHashMap absoluteItems, String str, a aVar) {
        Intrinsics.checkNotNullParameter(chatListBlocks, "chatListBlocks");
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        Intrinsics.checkNotNullParameter(absoluteItems, "absoluteItems");
        this.f91492a = chatListBlocks;
        this.f91493b = noUiItems;
        this.f91494c = bool;
        this.f91495d = absoluteItems;
        this.f91496e = str;
        this.f91497f = aVar;
    }

    public static g a(g gVar, List list, a aVar, int i11) {
        if ((i11 & 1) != 0) {
            list = gVar.f91492a;
        }
        List chatListBlocks = list;
        ArrayList noUiItems = gVar.f91493b;
        LinkedHashMap absoluteItems = gVar.f91495d;
        if ((i11 & 32) != 0) {
            aVar = gVar.f91497f;
        }
        Intrinsics.checkNotNullParameter(chatListBlocks, "chatListBlocks");
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        Intrinsics.checkNotNullParameter(absoluteItems, "absoluteItems");
        return new g(chatListBlocks, noUiItems, gVar.f91494c, absoluteItems, gVar.f91496e, aVar);
    }

    @NotNull
    public final Map<Integer, q> b() {
        return this.f91495d;
    }

    @NotNull
    public final List<q> c() {
        return this.f91492a;
    }

    public final a d() {
        return this.f91497f;
    }

    public final Boolean e() {
        return this.f91494c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f91492a, gVar.f91492a) && this.f91493b.equals(gVar.f91493b) && Intrinsics.d(this.f91494c, gVar.f91494c) && this.f91495d.equals(gVar.f91495d) && Intrinsics.d(this.f91496e, gVar.f91496e) && Intrinsics.d(this.f91497f, gVar.f91497f);
    }

    @NotNull
    public final List<q> f() {
        return this.f91493b;
    }

    public final int hashCode() {
        int b11 = C2618u.b(this.f91493b, this.f91492a.hashCode() * 31, 31);
        Boolean bool = this.f91494c;
        int hashCode = (this.f91495d.hashCode() + ((b11 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        String str = this.f91496e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f91497f;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "GetChatsResponseVO(chatListBlocks=" + this.f91492a + ", noUiItems=" + this.f91493b + ", hasItemsAfter=" + this.f91494c + ", absoluteItems=" + this.f91495d + ", lastUnreadChatId=" + this.f91496e + ", firstPageInfo=" + this.f91497f + ")";
    }
}
