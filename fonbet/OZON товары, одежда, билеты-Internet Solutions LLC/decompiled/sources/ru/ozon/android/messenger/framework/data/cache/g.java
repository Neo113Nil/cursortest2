package ru.ozon.android.messenger.framework.data.cache;

import Sc.o;
import Sc.s;
import androidx.collection.C5155y;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.SocketEventDTO;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.BlockContainerModelDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.messenger.framework.data.requests.GetMessagesResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.b;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.composer.compose.widget.scrollable.m;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* loaded from: classes6.dex */
public final class g implements ru.ozon.android.messenger.framework.data.cache.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.cache.a f87396a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f87397b;

    /* loaded from: classes10.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<ItemDTO> f87398a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final b f87399b;

        /* renamed from: c, reason: collision with root package name */
        private final GetMessagesResponseDTO.FirstPageInfoDTO f87400c;

        public a(List<ItemDTO> list, @NotNull b paginationInfo, GetMessagesResponseDTO.FirstPageInfoDTO firstPageInfoDTO) {
            Intrinsics.checkNotNullParameter(paginationInfo, "paginationInfo");
            this.f87398a = list;
            this.f87399b = paginationInfo;
            this.f87400c = firstPageInfoDTO;
        }

        public static a a(a aVar, List list, GetMessagesResponseDTO.FirstPageInfoDTO firstPageInfoDTO, int i11) {
            if ((i11 & 1) != 0) {
                list = aVar.f87398a;
            }
            b paginationInfo = aVar.f87399b;
            if ((i11 & 4) != 0) {
                firstPageInfoDTO = aVar.f87400c;
            }
            Intrinsics.checkNotNullParameter(paginationInfo, "paginationInfo");
            return new a(list, paginationInfo, firstPageInfoDTO);
        }

        public final GetMessagesResponseDTO.FirstPageInfoDTO b() {
            return this.f87400c;
        }

        public final List<ItemDTO> c() {
            return this.f87398a;
        }

        @NotNull
        public final b d() {
            return this.f87399b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f87398a, aVar.f87398a) && Intrinsics.d(this.f87399b, aVar.f87399b) && Intrinsics.d(this.f87400c, aVar.f87400c);
        }

        public final int hashCode() {
            List<ItemDTO> list = this.f87398a;
            int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.f87399b.hashCode()) * 31;
            GetMessagesResponseDTO.FirstPageInfoDTO firstPageInfoDTO = this.f87400c;
            return hashCode + (firstPageInfoDTO != null ? firstPageInfoDTO.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "ChatRoomData(items=" + this.f87398a + ", paginationInfo=" + this.f87399b + ", firstPageInfo=" + this.f87400c + ")";
        }
    }

    /* loaded from: classes10.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Boolean f87401a;

        /* renamed from: b, reason: collision with root package name */
        private final Boolean f87402b;

        public b() {
            this(null, null);
        }

        public static b a(b bVar, Boolean bool, Boolean bool2, int i11) {
            if ((i11 & 1) != 0) {
                bool = bVar.f87401a;
            }
            if ((i11 & 2) != 0) {
                bool2 = bVar.f87402b;
            }
            return new b(bool, bool2);
        }

        public final Boolean b() {
            return this.f87401a;
        }

        public final Boolean c() {
            return this.f87402b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f87401a, bVar.f87401a) && Intrinsics.d(this.f87402b, bVar.f87402b);
        }

        public final int hashCode() {
            Boolean bool = this.f87401a;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.f87402b;
            return hashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "PaginationInfo(hasItemsAfter=" + this.f87401a + ", hasItemsBefore=" + this.f87402b + ")";
        }

        public b(Boolean bool, Boolean bool2) {
            this.f87401a = bool;
            this.f87402b = bool2;
        }
    }

    /* loaded from: classes10.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87403a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[b.a.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.BACKWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.a.BACK_AND_FORTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f87403a = iArr;
        }
    }

    public static final class d extends C5155y<String, a> {
        @Override // androidx.collection.C5155y
        public final int sizeOf(String str, a aVar) {
            String key = str;
            a value = aVar;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            List<ItemDTO> c11 = value.c();
            if (c11 != null) {
                return c11.size();
            }
            return 1;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.cache.ChatRoomInMemoryCache$handleRequest$2", f = "ChatRoomInMemoryCache.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes10.dex */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends GetMessagesResponseDTO>>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.b f87405e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ru.ozon.android.messenger.framework.data.requests.b bVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f87405e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new e(this.f87405e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends GetMessagesResponseDTO>> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            List list;
            int i12;
            boolean z11 = true;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            d dVar = g.this.f87397b;
            ru.ozon.android.messenger.framework.data.requests.b bVar = this.f87405e;
            a aVar2 = dVar.get(bVar.d());
            if (aVar2 == null) {
                return i.a.b.f91950c;
            }
            int g10 = bVar.f() ? bVar.g() : bVar.g() - 1;
            List<ItemDTO> c11 = aVar2.c();
            List I11 = c11 != null ? C7714v.I(c11) : K.f71697a;
            String h11 = bVar.h();
            b.a e11 = bVar.e();
            boolean f7 = bVar.f();
            if (I11.isEmpty()) {
                list = K.f71697a;
            } else {
                Iterator it = I11.iterator();
                int i13 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    if (Intrinsics.d(((ItemDTO) it.next()).getId(), h11)) {
                        break;
                    }
                    i13++;
                }
                int i14 = c.f87403a[e11.ordinal()];
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            throw new o();
                        }
                        i11 = i13 - g10;
                        if (i11 < 0) {
                            i11 = 0;
                        }
                        i13 += g10;
                        if (i13 >= I11.size()) {
                            i13 = I11.size() - 1;
                        }
                    } else if (i13 != 0 || f7) {
                        if (!f7) {
                            i13--;
                        }
                        i11 = i13 - g10;
                        if (i11 < 0) {
                            i11 = 0;
                        }
                    } else {
                        list = K.f71697a;
                    }
                    list = I11.subList(i11, i13 + 1);
                } else if (i13 != I11.size() - 1 || f7) {
                    if (!f7) {
                        i13++;
                    }
                    int i15 = i13 + g10;
                    if (i15 >= I11.size()) {
                        i15 = I11.size() - 1;
                    }
                    int i16 = i13;
                    i13 = i15;
                    i11 = i16;
                    list = I11.subList(i11, i13 + 1);
                } else {
                    list = K.f71697a;
                }
            }
            List list2 = list;
            b d11 = aVar2.d();
            if (d11 == null) {
                d11 = new b(null, null);
            }
            List<ItemDTO> c12 = aVar2.c();
            if (c12 != null) {
                Iterator<ItemDTO> it2 = c12.iterator();
                int i17 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i12 = -1;
                        break;
                    }
                    ItemDTO next = it2.next();
                    if (Intrinsics.d(next != null ? next.getId() : null, bVar.h())) {
                        i12 = i17;
                        break;
                    }
                    i17++;
                }
                int i18 = c.f87403a[bVar.e().ordinal()];
                if (i18 == 1) {
                    if (bVar.f() && i12 < c12.size() - 1) {
                        i12++;
                    }
                    if (i12 + g10 >= c12.size() - 1 && !Intrinsics.d(d11.b(), Boolean.TRUE)) {
                        z11 = false;
                    }
                    d11 = b.a(d11, Boolean.valueOf(z11), null, 2);
                } else if (i18 == 2) {
                    if (bVar.f() && i12 > 0) {
                        i12--;
                    }
                    d11 = b.a(d11, null, Boolean.valueOf(i12 - g10 > 0 || Intrinsics.d(d11.c(), Boolean.TRUE)), 1);
                } else {
                    if (i18 != 3) {
                        throw new o();
                    }
                    Boolean valueOf = Boolean.valueOf(i12 + g10 < c12.size() - 1 || Intrinsics.d(d11.b(), Boolean.TRUE));
                    if (i12 - g10 <= 0 && !Intrinsics.d(d11.c(), Boolean.TRUE)) {
                        z11 = false;
                    }
                    d11 = new b(valueOf, Boolean.valueOf(z11));
                }
            }
            return new i.b(new GetMessagesResponseDTO(list2, d11.b(), d11.c(), bVar.i() ? aVar2.b() : null, null, null));
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.cache.ChatRoomInMemoryCache$handleSocketEvent$2", f = "ChatRoomInMemoryCache.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes10.dex */
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SocketEventDTO f87406d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f87407e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(SocketEventDTO socketEventDTO, g gVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f87406d = socketEventDTO;
            this.f87407e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f87406d, this.f87407e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            SocketEventDTO socketEventDTO = this.f87406d;
            boolean z11 = socketEventDTO instanceof SocketEventDTO.AddItem;
            g gVar = this.f87407e;
            if (z11) {
                SocketEventDTO.AddItem addItem = (SocketEventDTO.AddItem) socketEventDTO;
                if (addItem.getModel().getPlace() == ru.ozon.android.messenger.framework.data.remote.models.b.MESSAGES) {
                    g.j(gVar, addItem);
                    return Unit.f71690a;
                }
            }
            if (socketEventDTO instanceof SocketEventDTO.UpdateItem) {
                g.l(gVar, (SocketEventDTO.UpdateItem) socketEventDTO);
            } else if (socketEventDTO instanceof SocketEventDTO.RemoveItem) {
                g.k(gVar, (SocketEventDTO.RemoveItem) socketEventDTO);
            } else if (socketEventDTO instanceof SocketEventDTO.ResetCache) {
                gVar.clearCache();
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.data.cache.g$g, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static final class C1568g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            return Vc.a.b(Double.valueOf(((ItemDTO) t2).getOrderBy()), Double.valueOf(((ItemDTO) t11).getOrderBy()));
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.cache.ChatRoomInMemoryCache$saveResponse$2", f = "ChatRoomInMemoryCache.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes10.dex */
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.b f87408d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f87409e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ GetMessagesResponseDTO f87410f;

        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(Double.valueOf(((ItemDTO) t2).getOrderBy()), Double.valueOf(((ItemDTO) t11).getOrderBy()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ru.ozon.android.messenger.framework.data.requests.b bVar, g gVar, GetMessagesResponseDTO getMessagesResponseDTO, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f87408d = bVar;
            this.f87409e = gVar;
            this.f87410f = getMessagesResponseDTO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f87408d, this.f87409e, this.f87410f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super a> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Iterable a11;
            b bVar;
            b a12;
            GetMessagesResponseDTO.FirstPageInfoDTO firstPageInfo;
            List<ItemDTO> c11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            ru.ozon.android.messenger.framework.data.requests.b bVar2 = this.f87408d;
            String d11 = bVar2.d();
            g gVar = this.f87409e;
            a aVar2 = gVar.f87397b.get(d11);
            ArrayList arrayList = (aVar2 == null || (c11 = aVar2.c()) == null) ? new ArrayList() : C7714v.W0(C7714v.I(c11));
            GetMessagesResponseDTO getMessagesResponseDTO = this.f87410f;
            List<ItemDTO> items = getMessagesResponseDTO.getItems();
            List I11 = items != null ? C7714v.I(items) : K.f71697a;
            b.a e11 = bVar2.e();
            Iterator it = arrayList.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (Intrinsics.d(((ItemDTO) it.next()).getId(), bVar2.h())) {
                    break;
                }
                i11++;
            }
            if (!I11.isEmpty() || i11 == -1) {
                gVar.f87396a.getClass();
                a11 = ru.ozon.android.messenger.framework.data.cache.a.a(arrayList, I11, true);
            } else {
                int i12 = c.f87403a[e11.ordinal()];
                if (i12 == 1) {
                    a11 = arrayList.subList(0, i11 + 1);
                } else if (i12 == 2) {
                    a11 = arrayList.subList(i11, arrayList.size());
                } else {
                    if (i12 != 3) {
                        throw new o();
                    }
                    a11 = K.f71697a;
                }
            }
            if (aVar2 == null || (bVar = aVar2.d()) == null) {
                bVar = new b(null, null);
            }
            int i13 = c.f87403a[e11.ordinal()];
            if (i13 == 1) {
                a12 = b.a(bVar, getMessagesResponseDTO.getHasItemsAfter(), null, 2);
            } else if (i13 == 2) {
                a12 = b.a(bVar, null, getMessagesResponseDTO.getHasItemsBefore(), 1);
            } else {
                if (i13 != 3) {
                    throw new o();
                }
                a12 = new b(getMessagesResponseDTO.getHasItemsAfter(), getMessagesResponseDTO.getHasItemsBefore());
            }
            d dVar = gVar.f87397b;
            List I02 = C7714v.I0(new a(), a11);
            if (aVar2 == null || (firstPageInfo = aVar2.b()) == null) {
                firstPageInfo = getMessagesResponseDTO.getFirstPageInfo();
            }
            return dVar.put(d11, new a(I02, a12, firstPageInfo));
        }
    }

    public g(@NotNull ru.ozon.android.messenger.framework.data.cache.a dataMerger) {
        Intrinsics.checkNotNullParameter(dataMerger, "dataMerger");
        this.f87396a = dataMerger;
        this.f87397b = new d(m.f94768d);
    }

    public static final void j(g gVar, SocketEventDTO.AddItem addItem) {
        gVar.getClass();
        String id2 = addItem.getModel().getId();
        if (id2 == null) {
            return;
        }
        Object K11 = C7714v.K(kotlin.text.h.m(id2, new String[]{"/"}, 0, 6));
        d dVar = gVar.f87397b;
        a aVar = dVar.get(K11);
        if (aVar == null) {
            return;
        }
        List<ItemDTO> c11 = aVar.c();
        ArrayList<ItemDTO> I11 = c11 != null ? C7714v.I(c11) : new ArrayList();
        Tc.b builder = C7714v.B();
        for (ItemDTO itemDTO : I11) {
            if (!Intrinsics.d(itemDTO.getId(), addItem.getModel().getItem().getId())) {
                builder.add(itemDTO);
            }
        }
        builder.add(addItem.getModel().getItem());
        Intrinsics.checkNotNullParameter(builder, "builder");
        dVar.put(id2, a.a(aVar, C7714v.I0(new ru.ozon.android.messenger.framework.data.cache.h(), builder.B()), null, 6));
    }

    public static final void k(g gVar, SocketEventDTO.RemoveItem removeItem) {
        Object obj;
        a aVar;
        ArrayList arrayList;
        ItemDTO itemDTO;
        List<ItemDTO> c11;
        Object obj2;
        d dVar = gVar.f87397b;
        Map<String, a> snapshot = dVar.snapshot();
        Iterator<T> it = snapshot.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a aVar2 = snapshot.get((String) obj);
            if (aVar2 == null || (c11 = aVar2.c()) == null) {
                itemDTO = null;
            } else {
                Iterator<T> it2 = c11.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    ItemDTO itemDTO2 = (ItemDTO) obj2;
                    if (Intrinsics.d(itemDTO2 != null ? itemDTO2.getId() : null, removeItem.getModel().getId())) {
                        break;
                    }
                }
                itemDTO = (ItemDTO) obj2;
            }
            if (itemDTO != null) {
                break;
            }
        }
        String str = (String) obj;
        if (str == null || (aVar = dVar.get(str)) == null) {
            return;
        }
        List<ItemDTO> c12 = aVar.c();
        if (c12 != null) {
            arrayList = new ArrayList();
            for (Object obj3 : c12) {
                ItemDTO itemDTO3 = (ItemDTO) obj3;
                if (Intrinsics.d(itemDTO3 != null ? itemDTO3.getId() : null, removeItem.getModel().getId())) {
                    arrayList.add(obj3);
                }
            }
        } else {
            arrayList = null;
        }
        dVar.put(str, a.a(aVar, arrayList, null, 6));
    }

    public static final void l(g gVar, SocketEventDTO.UpdateItem updateItem) {
        Object obj;
        ItemDTO itemDTO;
        ArrayList arrayList;
        Object obj2;
        List<ItemDTO> pinned;
        List<ItemDTO> chatRoomActions;
        ItemDTO itemDTO2;
        List<ItemDTO> c11;
        Object obj3;
        d dVar = gVar.f87397b;
        Map<String, a> snapshot = dVar.snapshot();
        ItemDTO item = updateItem.getModel().getItem();
        Iterator<T> it = snapshot.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a aVar = snapshot.get((String) obj);
            if (aVar == null || (c11 = aVar.c()) == null) {
                itemDTO2 = null;
            } else {
                Iterator<T> it2 = c11.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    ItemDTO itemDTO3 = (ItemDTO) obj3;
                    if (Intrinsics.d(itemDTO3 != null ? itemDTO3.getId() : null, updateItem.getModel().getItem().getId())) {
                        break;
                    }
                }
                itemDTO2 = (ItemDTO) obj3;
            }
            if (itemDTO2 != null) {
                break;
            }
        }
        String str = (String) obj;
        int i11 = 6;
        if (str != null) {
            a aVar2 = dVar.get(str);
            if (aVar2 == null) {
                return;
            }
            List<ItemDTO> c12 = aVar2.c();
            dVar.put(str, a.a(aVar2, ru.ozon.android.messenger.utils.b.e(c12 != null ? C7714v.W0(c12) : new ArrayList(), item, new k(item)), null, 6));
            return;
        }
        for (String str2 : snapshot.keySet()) {
            a aVar3 = dVar.get(str2);
            if (aVar3 != null) {
                List m11 = kotlin.text.h.m(item.getId(), new String[]{"."}, 0, i11);
                String str3 = (String) C7714v.M(m11);
                if (str3 != null) {
                    String str4 = (String) C7714v.Q(1, m11);
                    GetMessagesResponseDTO.FirstPageInfoDTO b11 = aVar3.b();
                    ItemDTO header = b11 != null ? b11.getHeader() : null;
                    if (header == null) {
                        itemDTO = null;
                    } else {
                        if (Intrinsics.d(header.getId(), str3)) {
                            if (str4 == null) {
                                itemDTO = item;
                            } else {
                                Object parsedModel = header.getParsedModel();
                                BlockContainerModelDTO blockContainerModelDTO = parsedModel instanceof BlockContainerModelDTO ? (BlockContainerModelDTO) parsedModel : null;
                                if (blockContainerModelDTO != null) {
                                    Object parsedModel2 = item.getParsedModel();
                                    BlockContainerModelDTO blockContainerModelDTO2 = parsedModel2 instanceof BlockContainerModelDTO ? (BlockContainerModelDTO) parsedModel2 : null;
                                    if (blockContainerModelDTO2 != null) {
                                        List<BlockDTO> blocks = blockContainerModelDTO.getBlocks();
                                        if (blocks != null) {
                                            List<BlockDTO> list = blocks;
                                            arrayList = new ArrayList(C7714v.z(list, 10));
                                            for (BlockDTO blockDTO : list) {
                                                List<BlockDTO> blocks2 = blockContainerModelDTO2.getBlocks();
                                                if (blocks2 != null) {
                                                    Iterator<T> it3 = blocks2.iterator();
                                                    while (true) {
                                                        if (it3.hasNext()) {
                                                            obj2 = it3.next();
                                                            if (Intrinsics.d(((BlockDTO) obj2).getName(), blockDTO.getName())) {
                                                                break;
                                                            }
                                                        } else {
                                                            obj2 = null;
                                                            break;
                                                        }
                                                    }
                                                    BlockDTO blockDTO2 = (BlockDTO) obj2;
                                                    if (blockDTO2 != null) {
                                                        blockDTO = blockDTO2;
                                                    }
                                                }
                                                arrayList.add(blockDTO);
                                            }
                                        } else {
                                            arrayList = null;
                                        }
                                        header = ItemDTO.copy$default(header, null, null, 0, 0.0d, blockContainerModelDTO.copy(arrayList), 15, null);
                                    }
                                }
                            }
                        }
                        itemDTO = header;
                    }
                    GetMessagesResponseDTO.FirstPageInfoDTO b12 = aVar3.b();
                    ItemDTO footer = b12 != null ? b12.getFooter() : null;
                    ItemDTO itemDTO4 = Intrinsics.d(footer != null ? footer.getId() : null, item.getId()) ? item : footer;
                    GetMessagesResponseDTO.FirstPageInfoDTO b13 = aVar3.b();
                    ItemDTO emptyState = b13 != null ? b13.getEmptyState() : null;
                    ItemDTO itemDTO5 = Intrinsics.d(emptyState != null ? emptyState.getId() : null, item.getId()) ? item : emptyState;
                    GetMessagesResponseDTO.FirstPageInfoDTO b14 = aVar3.b();
                    ArrayList e11 = (b14 == null || (chatRoomActions = b14.getChatRoomActions()) == null) ? null : ru.ozon.android.messenger.utils.b.e(chatRoomActions, item, new i(item));
                    GetMessagesResponseDTO.FirstPageInfoDTO b15 = aVar3.b();
                    List e12 = (b15 == null || (pinned = b15.getPinned()) == null) ? K.f71697a : ru.ozon.android.messenger.utils.b.e(pinned, item, new j(item));
                    GetMessagesResponseDTO.FirstPageInfoDTO b16 = aVar3.b();
                    ItemDTO snackbar = b16 != null ? b16.getSnackbar() : null;
                    ItemDTO itemDTO6 = Intrinsics.d(snackbar != null ? snackbar.getId() : null, item.getId()) ? item : snackbar;
                    GetMessagesResponseDTO.FirstPageInfoDTO b17 = aVar3.b();
                    dVar.put(str2, a.a(aVar3, null, b17 != null ? GetMessagesResponseDTO.FirstPageInfoDTO.copy$default(b17, itemDTO, itemDTO4, e11, e12, 0, itemDTO5, itemDTO6, null, null, 400, null) : null, 3));
                }
            }
            i11 = 6;
        }
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.f
    public final Object a(@NotNull SocketEventDTO socketEventDTO, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(C10720e0.a(), new f(socketEventDTO, this, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.f
    public final Object b(@NotNull ru.ozon.android.messenger.framework.data.requests.b bVar, @NotNull GetMessagesResponseDTO getMessagesResponseDTO, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(C10720e0.a(), new h(bVar, this, getMessagesResponseDTO, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.f
    public final void c(@NotNull String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f87397b.remove(chatId);
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.f
    public final void clearCache() {
        this.f87397b.evictAll();
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.f
    public final void d(@NotNull String chatId, @NotNull ItemDTO itemDTO) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(itemDTO, "itemDTO");
        d dVar = this.f87397b;
        a aVar = dVar.get(chatId);
        if (aVar == null) {
            return;
        }
        Tc.b builder = C7714v.B();
        List<ItemDTO> c11 = aVar.c();
        if (c11 != null) {
            for (ItemDTO itemDTO2 : c11) {
                if (itemDTO2 != null) {
                    builder.add(itemDTO2);
                }
            }
        }
        builder.add(itemDTO);
        Intrinsics.checkNotNullParameter(builder, "builder");
        dVar.put(chatId, a.a(aVar, C7714v.I0(new C1568g(), builder.B()), null, 6));
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.f
    public final Object e(@NotNull ru.ozon.android.messenger.framework.data.requests.b bVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<GetMessagesResponseDTO>> dVar) {
        return C10727i.f(C10720e0.a(), new e(bVar, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.f
    public final Unit f(@NotNull String str, @NotNull String str2) {
        ArrayList arrayList;
        d dVar = this.f87397b;
        a aVar = dVar.get(str);
        if (aVar == null) {
            return Unit.f71690a;
        }
        List<ItemDTO> c11 = aVar.c();
        if (c11 != null) {
            arrayList = new ArrayList();
            for (Object obj : c11) {
                ItemDTO itemDTO = (ItemDTO) obj;
                if (!Intrinsics.d(itemDTO != null ? itemDTO.getId() : null, str2)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        dVar.put(str, a.a(aVar, arrayList, null, 6));
        return Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.f
    public final boolean g(@NotNull String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return this.f87397b.get(chatId) != null;
    }
}
