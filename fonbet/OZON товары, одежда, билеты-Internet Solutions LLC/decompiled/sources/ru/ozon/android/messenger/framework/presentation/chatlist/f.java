package ru.ozon.android.messenger.framework.presentation.chatlist;

import B90.C2618u;
import C.o0;
import Kk.C3532b;
import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.presentation.chatlist.w;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<ru.ozon.android.messenger.framework.presentation.models.q> f90472a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<ru.ozon.android.messenger.framework.presentation.models.q> f90473b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<Integer, ru.ozon.android.messenger.framework.presentation.models.q> f90474c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final w f90475d;

    /* renamed from: e, reason: collision with root package name */
    private final a f90476e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<ru.ozon.android.messenger.framework.presentation.models.q> f90477f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<ru.ozon.android.messenger.framework.presentation.models.q> f90478g;

    /* renamed from: h, reason: collision with root package name */
    private final String f90479h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f90480i;

    /* renamed from: j, reason: collision with root package name */
    private final ContextMenuDTO f90481j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f90482k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f90483a;

        /* renamed from: b, reason: collision with root package name */
        private final String f90484b;

        /* renamed from: c, reason: collision with root package name */
        private final String f90485c;

        public a(@NotNull Uri deeplink, String str, String str2) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f90483a = deeplink;
            this.f90484b = str;
            this.f90485c = str2;
        }

        public final String a() {
            return this.f90484b;
        }

        @NotNull
        public final Uri b() {
            return this.f90483a;
        }

        public final String c() {
            return this.f90485c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f90483a, aVar.f90483a) && Intrinsics.d(this.f90484b, aVar.f90484b) && Intrinsics.d(this.f90485c, aVar.f90485c);
        }

        public final int hashCode() {
            int hashCode = this.f90483a.hashCode() * 31;
            String str = this.f90484b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f90485c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChatDetailsData(deeplink=");
            sb2.append(this.f90483a);
            sb2.append(", chatId=");
            sb2.append(this.f90484b);
            sb2.append(", firstUnreadMsgId=");
            return o0.c(sb2, this.f90485c, ")");
        }
    }

    public interface b {
        void K();

        void a(v vVar);

        void c0();

        void x();
    }

    public f() {
        this(null, 2047);
    }

    public static f a(f fVar, List list, List list2, Map map, w wVar, a aVar, List list3, List list4, String str, ContextMenuDTO contextMenuDTO, int i11) {
        if ((i11 & 1) != 0) {
            list = fVar.f90472a;
        }
        List sortedItems = list;
        if ((i11 & 2) != 0) {
            list2 = fVar.f90473b;
        }
        List noUiItems = list2;
        if ((i11 & 4) != 0) {
            map = fVar.f90474c;
        }
        Map absoluteItems = map;
        if ((i11 & 8) != 0) {
            wVar = fVar.f90475d;
        }
        w loading = wVar;
        fVar.getClass();
        a aVar2 = (i11 & 32) != 0 ? fVar.f90476e : aVar;
        List noUiItemsToRemove = (i11 & 64) != 0 ? fVar.f90477f : list3;
        List popUpBlocks = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? fVar.f90478g : list4;
        String str2 = (i11 & 256) != 0 ? fVar.f90479h : str;
        boolean z11 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? fVar.f90480i : true;
        ContextMenuDTO contextMenuDTO2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? fVar.f90481j : contextMenuDTO;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(sortedItems, "sortedItems");
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        Intrinsics.checkNotNullParameter(absoluteItems, "absoluteItems");
        Intrinsics.checkNotNullParameter(loading, "loading");
        Intrinsics.checkNotNullParameter(noUiItemsToRemove, "noUiItemsToRemove");
        Intrinsics.checkNotNullParameter(popUpBlocks, "popUpBlocks");
        return new f(sortedItems, noUiItems, absoluteItems, loading, aVar2, noUiItemsToRemove, popUpBlocks, str2, z11, contextMenuDTO2);
    }

    @NotNull
    public final Map<Integer, ru.ozon.android.messenger.framework.presentation.models.q> b() {
        return this.f90474c;
    }

    public final a c() {
        return this.f90476e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.e> d() {
        return (List) this.f90482k.getValue();
    }

    @NotNull
    public final w e() {
        return this.f90475d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f90472a, fVar.f90472a) && Intrinsics.d(this.f90473b, fVar.f90473b) && Intrinsics.d(this.f90474c, fVar.f90474c) && Intrinsics.d(this.f90475d, fVar.f90475d) && Intrinsics.d(this.f90476e, fVar.f90476e) && Intrinsics.d(this.f90477f, fVar.f90477f) && Intrinsics.d(this.f90478g, fVar.f90478g) && Intrinsics.d(this.f90479h, fVar.f90479h) && this.f90480i == fVar.f90480i && Intrinsics.d(this.f90481j, fVar.f90481j);
    }

    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> f() {
        return this.f90473b;
    }

    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> g() {
        return this.f90477f;
    }

    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> h() {
        return this.f90478g;
    }

    public final int hashCode() {
        int a11 = C3532b.a((this.f90475d.hashCode() + D40.c.a(this.f90474c, G.g.b(this.f90472a.hashCode() * 31, 31, this.f90473b), 31)) * 31, 31, false);
        a aVar = this.f90476e;
        int b11 = G.g.b(G.g.b((a11 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f90477f), 31, this.f90478g);
        String str = this.f90479h;
        int a12 = C3532b.a((b11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f90480i);
        ContextMenuDTO contextMenuDTO = this.f90481j;
        return a12 + (contextMenuDTO != null ? contextMenuDTO.hashCode() : 0);
    }

    public final ContextMenuDTO i() {
        return this.f90481j;
    }

    public final String j() {
        return this.f90479h;
    }

    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> k() {
        return this.f90472a;
    }

    public final boolean l() {
        return this.f90480i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatListState(\n   chatBlocks: ");
        sb2.append(this.f90472a);
        sb2.append("\n   noUiBlocks: ");
        sb2.append(this.f90473b);
        sb2.append("\n   absoluteItems: ");
        sb2.append(this.f90474c);
        sb2.append("\n   noUiBlocksToRemove: ");
        sb2.append(this.f90477f);
        sb2.append("\n   loading: ");
        sb2.append(this.f90475d);
        sb2.append("\n   chatDetailsData: ");
        sb2.append(this.f90476e);
        sb2.append("\n   popUpState: ");
        return C2618u.h(sb2, this.f90478g, ")");
    }

    public f(@NotNull List sortedItems, @NotNull List noUiItems, @NotNull Map absoluteItems, @NotNull w loading, a aVar, @NotNull List noUiItemsToRemove, @NotNull List popUpBlocks, String str, boolean z11, ContextMenuDTO contextMenuDTO) {
        Intrinsics.checkNotNullParameter(sortedItems, "sortedItems");
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        Intrinsics.checkNotNullParameter(absoluteItems, "absoluteItems");
        Intrinsics.checkNotNullParameter(loading, "loading");
        Intrinsics.checkNotNullParameter(noUiItemsToRemove, "noUiItemsToRemove");
        Intrinsics.checkNotNullParameter(popUpBlocks, "popUpBlocks");
        this.f90472a = sortedItems;
        this.f90473b = noUiItems;
        this.f90474c = absoluteItems;
        this.f90475d = loading;
        this.f90476e = aVar;
        this.f90477f = noUiItemsToRemove;
        this.f90478g = popUpBlocks;
        this.f90479h = str;
        this.f90480i = z11;
        this.f90481j = contextMenuDTO;
        this.f90482k = ru.ozon.android.messenger.utils.f.b(new h(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(w.a aVar, int i11) {
        this(r1, r1, U.c(), (i11 & 8) != 0 ? new w.a(false) : aVar, null, r1, r1, null, false, null);
        K k11 = K.f71697a;
    }
}
