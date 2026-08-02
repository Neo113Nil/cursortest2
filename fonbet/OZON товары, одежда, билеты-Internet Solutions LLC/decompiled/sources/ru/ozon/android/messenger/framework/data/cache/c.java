package ru.ozon.android.messenger.framework.data.cache;

import Sc.s;
import androidx.collection.C5155y;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.android.messenger.framework.data.remote.models.SocketEventDTO;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.messenger.framework.data.requests.GetChatsRequest;
import ru.ozon.android.messenger.framework.data.requests.GetChatsResponseDTO;
import ru.ozon.android.messenger.utils.i;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* loaded from: classes6.dex */
public final class c implements ru.ozon.android.messenger.framework.data.cache.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.cache.a f87380a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f87381b;

    /* renamed from: c, reason: collision with root package name */
    private String f87382c;

    /* loaded from: classes10.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<ItemDTO> f87383a;

        /* renamed from: b, reason: collision with root package name */
        private final GetChatsResponseDTO.ChatListFirstPageInfoDTO f87384b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<Integer, ItemDTO> f87385c;

        /* renamed from: d, reason: collision with root package name */
        private final Boolean f87386d;

        public a(List<ItemDTO> list, GetChatsResponseDTO.ChatListFirstPageInfoDTO chatListFirstPageInfoDTO, Map<Integer, ItemDTO> map, Boolean bool) {
            this.f87383a = list;
            this.f87384b = chatListFirstPageInfoDTO;
            this.f87385c = map;
            this.f87386d = bool;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, AbstractList abstractList, GetChatsResponseDTO.ChatListFirstPageInfoDTO chatListFirstPageInfoDTO, Map map, int i11) {
            List list = abstractList;
            if ((i11 & 1) != 0) {
                list = aVar.f87383a;
            }
            if ((i11 & 2) != 0) {
                chatListFirstPageInfoDTO = aVar.f87384b;
            }
            if ((i11 & 4) != 0) {
                map = aVar.f87385c;
            }
            return new a(list, chatListFirstPageInfoDTO, map, aVar.f87386d);
        }

        public final Map<Integer, ItemDTO> b() {
            return this.f87385c;
        }

        public final GetChatsResponseDTO.ChatListFirstPageInfoDTO c() {
            return this.f87384b;
        }

        public final Boolean d() {
            return this.f87386d;
        }

        public final List<ItemDTO> e() {
            return this.f87383a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f87383a, aVar.f87383a) && Intrinsics.d(this.f87384b, aVar.f87384b) && Intrinsics.d(this.f87385c, aVar.f87385c) && Intrinsics.d(this.f87386d, aVar.f87386d);
        }

        public final int hashCode() {
            List<ItemDTO> list = this.f87383a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            GetChatsResponseDTO.ChatListFirstPageInfoDTO chatListFirstPageInfoDTO = this.f87384b;
            int hashCode2 = (hashCode + (chatListFirstPageInfoDTO == null ? 0 : chatListFirstPageInfoDTO.hashCode())) * 31;
            Map<Integer, ItemDTO> map = this.f87385c;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Boolean bool = this.f87386d;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "ChatListGroupData(listItems=" + this.f87383a + ", firstPageInfo=" + this.f87384b + ", absoluteItems=" + this.f87385c + ", hasItemsAfterOnBackend=" + this.f87386d + ")";
        }
    }

    public static final class b extends C5155y<String, a> {
        @Override // androidx.collection.C5155y
        public final int sizeOf(String str, a aVar) {
            String key = str;
            a value = aVar;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            List<ItemDTO> e11 = value.e();
            if (e11 != null) {
                return e11.size();
            }
            return 1;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.cache.ChatListInMemoryCache$handleRequest$2", f = "ChatListInMemoryCache.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.cache.c$c, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    static final class C1567c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends GetChatsResponseDTO>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GetChatsRequest f87387d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f87388e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1567c(GetChatsRequest getChatsRequest, c cVar, kotlin.coroutines.d<? super C1567c> dVar) {
            super(2, dVar);
            this.f87387d = getChatsRequest;
            this.f87388e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1567c(this.f87387d, this.f87388e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends GetChatsResponseDTO>> dVar) {
            return ((C1567c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x010e, code lost:
        
            if ((r0 != null ? r0.booleanValue() : false) != false) goto L74;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            ?? r82;
            List K02;
            List<BlockDTO> blocks;
            BlockDTO blockDTO;
            String state;
            JSONObject jSONObject;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            GetChatsRequest getChatsRequest = this.f87387d;
            Integer f7 = getChatsRequest.f();
            boolean z11 = false;
            int intValue = f7 != null ? f7.intValue() : 0;
            Integer e11 = getChatsRequest.e();
            int intValue2 = e11 != null ? e11.intValue() : -1;
            GetChatsRequest.Filter d11 = getChatsRequest.d();
            c cVar = this.f87388e;
            if ((d11 == null || (str = d11.getChatType()) == null) && (str = cVar.f87382c) == null) {
                str = "NO_GROUP";
            }
            a aVar2 = cVar.f87381b.get(str);
            if (aVar2 == null) {
                return i.a.b.f91950c;
            }
            String str2 = cVar.f87382c;
            a aVar3 = str2 != null ? cVar.f87381b.get(str2) : null;
            List<ItemDTO> e12 = aVar2.e();
            if (e12 == null) {
                e12 = K.f71697a;
            }
            GetChatsRequest.Filter d12 = getChatsRequest.d();
            Boolean onlyUnread = d12 != null ? d12.getOnlyUnread() : null;
            if (e12.isEmpty()) {
                K02 = K.f71697a;
            } else {
                if (Intrinsics.d(onlyUnread, Boolean.TRUE)) {
                    r82 = new ArrayList();
                    for (Object obj2 : e12) {
                        Object parsedModel = ((ItemDTO) obj2).getParsedModel();
                        ru.ozon.android.messenger.framework.data.remote.models.items.a aVar4 = parsedModel instanceof ru.ozon.android.messenger.framework.data.remote.models.items.a ? (ru.ozon.android.messenger.framework.data.remote.models.items.a) parsedModel : null;
                        if (aVar4 != null && (blocks = aVar4.getBlocks()) != null && (blockDTO = (BlockDTO) C7714v.M(blocks)) != null && (state = blockDTO.getState()) != null) {
                            try {
                                jSONObject = new JSONObject(state);
                            } catch (Throwable unused) {
                            }
                            if (jSONObject.has("unreadCount") && jSONObject.getDouble("unreadCount") <= 0.0d) {
                            }
                        }
                        r82.add(obj2);
                    }
                } else {
                    r82 = e12;
                }
                K02 = intValue2 == -1 ? r82 : (intValue < 0 || intValue >= r82.size()) ? K.f71697a : C7714v.K0(r82.subList(intValue, r82.size()), intValue2);
            }
            List list = K02;
            if (intValue + intValue2 >= e12.size()) {
                Boolean d13 = aVar2.d();
            }
            z11 = true;
            return new i.b(new GetChatsResponseDTO(list, Boolean.valueOf(z11), aVar2.b(), null, aVar3 != null ? aVar3.c() : null));
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.cache.ChatListInMemoryCache$handleSocketEvent$2", f = "ChatListInMemoryCache.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes10.dex */
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SocketEventDTO f87389d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f87390e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SocketEventDTO socketEventDTO, c cVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f87389d = socketEventDTO;
            this.f87390e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f87389d, this.f87390e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            SocketEventDTO socketEventDTO = this.f87389d;
            boolean z11 = socketEventDTO instanceof SocketEventDTO.AddItem;
            c cVar = this.f87390e;
            if (z11) {
                SocketEventDTO.AddItem addItem = (SocketEventDTO.AddItem) socketEventDTO;
                if (addItem.getModel().getPlace() == ru.ozon.android.messenger.framework.data.remote.models.b.CHATS) {
                    c.h(cVar, addItem);
                    return Unit.f71690a;
                }
            }
            if (z11) {
                SocketEventDTO.AddItem addItem2 = (SocketEventDTO.AddItem) socketEventDTO;
                if (addItem2.getModel().getPlace() == ru.ozon.android.messenger.framework.data.remote.models.b.GROUP) {
                    c.i(cVar, addItem2);
                    return Unit.f71690a;
                }
            }
            if (socketEventDTO instanceof SocketEventDTO.UpdateItem) {
                c.k(cVar, (SocketEventDTO.UpdateItem) socketEventDTO);
            } else if (socketEventDTO instanceof SocketEventDTO.RemoveItem) {
                c.j(cVar, (SocketEventDTO.RemoveItem) socketEventDTO);
            } else if (socketEventDTO instanceof SocketEventDTO.ResetCache) {
                cVar.clearCache();
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.cache.ChatListInMemoryCache$saveResponse$2", f = "ChatListInMemoryCache.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes10.dex */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ GetChatsRequest f87391d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ GetChatsResponseDTO f87392e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f87393f;

        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(Double.valueOf(((ItemDTO) t11).getOrderBy()), Double.valueOf(((ItemDTO) t2).getOrderBy()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(GetChatsRequest getChatsRequest, GetChatsResponseDTO getChatsResponseDTO, c cVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f87391d = getChatsRequest;
            this.f87392e = getChatsResponseDTO;
            this.f87393f = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f87391d, this.f87392e, this.f87393f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super a> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List a11;
            GetChatsResponseDTO.ChatListFirstPageInfoDTO firstPageInfo;
            List<ItemDTO> e11;
            GetChatsResponseDTO.ChatGroupsResponseDTO chatGroups;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            GetChatsRequest getChatsRequest = this.f87391d;
            GetChatsRequest.Filter d11 = getChatsRequest.d();
            String str = null;
            String chatType = d11 != null ? d11.getChatType() : null;
            GetChatsResponseDTO getChatsResponseDTO = this.f87392e;
            if (chatType == null) {
                GetChatsResponseDTO.ChatListFirstPageInfoDTO firstPageInfo2 = getChatsResponseDTO.getFirstPageInfo();
                if (firstPageInfo2 != null && (chatGroups = firstPageInfo2.getChatGroups()) != null) {
                    str = chatGroups.getDefaultItemId();
                }
                if (str == null) {
                    str = "NO_GROUP";
                }
            } else {
                str = chatType;
            }
            c cVar = this.f87393f;
            if (chatType == null) {
                cVar.f87382c = str;
            }
            a aVar2 = cVar.f87381b.get(str);
            ArrayList arrayList = (aVar2 == null || (e11 = aVar2.e()) == null) ? new ArrayList() : C7714v.W0(e11);
            List<ItemDTO> items = getChatsResponseDTO.getItems();
            List I11 = items != null ? C7714v.I(items) : K.f71697a;
            Integer f7 = getChatsRequest.f();
            int intValue = f7 != null ? f7.intValue() : 0;
            if (!I11.isEmpty() || intValue > arrayList.size()) {
                cVar.f87380a.getClass();
                a11 = ru.ozon.android.messenger.framework.data.cache.a.a(arrayList, I11, false);
            } else {
                a11 = C7714v.K0(arrayList, intValue);
            }
            b bVar = cVar.f87381b;
            List I02 = C7714v.I0(new a(), a11);
            if (aVar2 == null || (firstPageInfo = aVar2.c()) == null) {
                firstPageInfo = getChatsResponseDTO.getFirstPageInfo();
            }
            return bVar.put(str, new a(I02, firstPageInfo, getChatsResponseDTO.getAbsoluteItems(), getChatsResponseDTO.getHasItemsAfter()));
        }
    }

    public c(@NotNull ru.ozon.android.messenger.framework.data.cache.a dataMerger) {
        Intrinsics.checkNotNullParameter(dataMerger, "dataMerger");
        this.f87380a = dataMerger;
        this.f87381b = new b(DescriptorProtos$Edition.EDITION_LEGACY_VALUE);
    }

    public static final void h(c cVar, SocketEventDTO.AddItem addItem) {
        cVar.getClass();
        String id2 = addItem.getModel().getId();
        if (id2 == null) {
            id2 = "NO_GROUP";
        }
        b bVar = cVar.f87381b;
        a aVar = bVar.get(id2);
        if (aVar == null) {
            return;
        }
        List<ItemDTO> e11 = aVar.e();
        if (e11 == null) {
            e11 = new ArrayList<>();
        }
        Tc.b builder = C7714v.B();
        boolean z11 = false;
        for (ItemDTO itemDTO : e11) {
            if (!Intrinsics.d(itemDTO.getId(), addItem.getModel().getItem().getId())) {
                builder.add(itemDTO);
            }
            if (itemDTO.getOrderBy() < addItem.getModel().getItem().getOrderBy() && !z11) {
                builder.add(addItem.getModel().getItem());
                z11 = true;
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        bVar.put(id2, a.a(aVar, builder.B(), null, null, 14));
    }

    public static final void i(c cVar, SocketEventDTO.AddItem addItem) {
        List<ItemDTO> list;
        cVar.getClass();
        String id2 = addItem.getModel().getId();
        if (id2 == null) {
            id2 = "NO_GROUP";
        }
        b bVar = cVar.f87381b;
        a aVar = bVar.get(id2);
        if (aVar == null) {
            return;
        }
        GetChatsResponseDTO.ChatListFirstPageInfoDTO c11 = aVar.c();
        GetChatsResponseDTO.ChatGroupsResponseDTO chatGroups = c11 != null ? c11.getChatGroups() : null;
        if (chatGroups == null || (list = chatGroups.getItems()) == null) {
            list = K.f71697a;
        }
        GetChatsResponseDTO.ChatGroupsResponseDTO copy$default = chatGroups != null ? GetChatsResponseDTO.ChatGroupsResponseDTO.copy$default(chatGroups, C7714v.q0(addItem.getModel().getItem(), list), null, 2, null) : null;
        GetChatsResponseDTO.ChatListFirstPageInfoDTO c12 = aVar.c();
        bVar.put(id2, a.a(aVar, null, c12 != null ? GetChatsResponseDTO.ChatListFirstPageInfoDTO.copy$default(c12, copy$default, null, null, null, null, 30, null) : null, null, 13));
    }

    public static final void j(c cVar, SocketEventDTO.RemoveItem removeItem) {
        Object obj;
        a aVar;
        ArrayList arrayList;
        ItemDTO itemDTO;
        List<ItemDTO> e11;
        Object obj2;
        b bVar = cVar.f87381b;
        Map<String, a> snapshot = bVar.snapshot();
        Iterator<T> it = snapshot.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a aVar2 = snapshot.get((String) obj);
            if (aVar2 == null || (e11 = aVar2.e()) == null) {
                itemDTO = null;
            } else {
                Iterator<T> it2 = e11.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (Intrinsics.d(((ItemDTO) obj2).getId(), removeItem.getModel().getId())) {
                            break;
                        }
                    } else {
                        obj2 = null;
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
        if (str == null || (aVar = snapshot.get(str)) == null) {
            return;
        }
        List<ItemDTO> e12 = aVar.e();
        if (e12 != null) {
            arrayList = new ArrayList();
            for (Object obj3 : e12) {
                if (!Intrinsics.d(((ItemDTO) obj3).getId(), removeItem.getModel().getId())) {
                    arrayList.add(obj3);
                }
            }
        } else {
            arrayList = null;
        }
        bVar.put(str, a.a(aVar, arrayList, null, null, 14));
    }

    public static final void k(c cVar, SocketEventDTO.UpdateItem updateItem) {
        Object obj;
        Map map;
        GetChatsResponseDTO.ChatListFirstPageInfoDTO chatListFirstPageInfoDTO;
        GetChatsResponseDTO.ChatGroupsResponseDTO chatGroups;
        List<ItemDTO> items;
        ItemDTO itemDTO;
        List<ItemDTO> e11;
        Object obj2;
        b bVar = cVar.f87381b;
        Map<String, a> snapshot = bVar.snapshot();
        ItemDTO item = updateItem.getModel().getItem();
        Iterator<T> it = snapshot.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a aVar = snapshot.get((String) obj);
            if (aVar == null || (e11 = aVar.e()) == null) {
                itemDTO = null;
            } else {
                Iterator<T> it2 = e11.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (Intrinsics.d(((ItemDTO) obj2).getId(), updateItem.getModel().getItem().getId())) {
                            break;
                        }
                    } else {
                        obj2 = null;
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
        if (str != null) {
            a aVar2 = snapshot.get(str);
            if (aVar2 != null) {
                List<ItemDTO> e12 = aVar2.e();
                bVar.put(str, a.a(aVar2, ru.ozon.android.messenger.utils.b.e(e12 != null ? C7714v.W0(e12) : new ArrayList(), item, new ru.ozon.android.messenger.framework.data.cache.e(item)), null, null, 14));
                return;
            }
            return;
        }
        for (Map.Entry<String, a> entry : snapshot.entrySet()) {
            String key = entry.getKey();
            a value = entry.getValue();
            GetChatsResponseDTO.ChatListFirstPageInfoDTO c11 = value.c();
            ItemDTO header = c11 != null ? c11.getHeader() : null;
            ItemDTO itemDTO2 = Intrinsics.d(header != null ? header.getId() : null, item.getId()) ? item : header;
            GetChatsResponseDTO.ChatListFirstPageInfoDTO c12 = value.c();
            ArrayList e13 = (c12 == null || (chatGroups = c12.getChatGroups()) == null || (items = chatGroups.getItems()) == null) ? null : ru.ozon.android.messenger.utils.b.e(items, item, new ru.ozon.android.messenger.framework.data.cache.d(item));
            Map<Integer, ItemDTO> b11 = value.b();
            if (b11 != null) {
                ArrayList arrayList = new ArrayList(b11.size());
                for (Map.Entry<Integer, ItemDTO> entry2 : b11.entrySet()) {
                    int intValue = entry2.getKey().intValue();
                    ItemDTO value2 = entry2.getValue();
                    Integer valueOf = Integer.valueOf(intValue);
                    if (Intrinsics.d(value2.getId(), item.getId())) {
                        value2 = item;
                    }
                    arrayList.add(new Pair(valueOf, value2));
                }
                map = U.s(arrayList);
            } else {
                map = null;
            }
            GetChatsResponseDTO.ChatListFirstPageInfoDTO c13 = value.c();
            if (c13 != null) {
                GetChatsResponseDTO.ChatGroupsResponseDTO chatGroups2 = value.c().getChatGroups();
                chatListFirstPageInfoDTO = GetChatsResponseDTO.ChatListFirstPageInfoDTO.copy$default(c13, chatGroups2 != null ? GetChatsResponseDTO.ChatGroupsResponseDTO.copy$default(chatGroups2, e13, null, 2, null) : null, itemDTO2, null, null, null, 28, null);
            } else {
                chatListFirstPageInfoDTO = null;
            }
            bVar.put(key, a.a(value, null, chatListFirstPageInfoDTO, map, 9));
        }
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.b
    public final Object a(@NotNull SocketEventDTO socketEventDTO, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(C10720e0.a(), new d(socketEventDTO, this, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.b
    public final Object b(@NotNull GetChatsRequest getChatsRequest, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<GetChatsResponseDTO>> dVar) {
        return C10727i.f(C10720e0.a(), new C1567c(getChatsRequest, this, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.b
    public final Object c(@NotNull GetChatsRequest getChatsRequest, @NotNull GetChatsResponseDTO getChatsResponseDTO, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = C10727i.f(C10720e0.a(), new e(getChatsRequest, getChatsResponseDTO, this, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.b
    public final void clearCache() {
        this.f87381b.evictAll();
    }

    @Override // ru.ozon.android.messenger.framework.data.cache.b
    public final boolean d() {
        return this.f87381b.size() > 0;
    }
}
