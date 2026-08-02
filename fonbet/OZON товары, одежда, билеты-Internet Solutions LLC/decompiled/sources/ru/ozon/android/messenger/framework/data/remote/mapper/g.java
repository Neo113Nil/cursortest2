package ru.ozon.android.messenger.framework.data.remote.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.cell.a;
import ru.ozon.android.messenger.blocks.curtain.CurtainModalDataDTO;
import ru.ozon.android.messenger.blocks.curtain.CurtainModalResponseDTO;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.messenger.framework.data.requests.AddFastAnswerResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.EditChatMessageResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.GetChatsResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.GetMessagesResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ReplyChatMessageResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.SearchResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.SendMessagesResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.StartOrGetChatResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.UpdateMessageResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.common.ActionSuccessOrFailResponseDTO;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.r;
import ru.ozon.android.messenger.framework.presentation.models.responses.g;
import ru.ozon.android.messenger.framework.presentation.models.responses.k;
import ru.ozon.android.messenger.framework.presentation.models.responses.l;
import ru.ozon.android.messenger.framework.presentation.models.responses.m;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.android.messenger.utils.n;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.mapper.a f87803a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.cell.a f87804b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f87805c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f87806d;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87807a;

        static {
            int[] iArr = new int[ru.ozon.android.messenger.framework.data.remote.models.items.b.values().length];
            try {
                iArr[ru.ozon.android.messenger.framework.data.remote.models.items.b.BLOCK_CONTAINER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f87807a = iArr;
        }
    }

    /* synthetic */ class b extends C7719a implements Function1<ItemDTO, q> {
        @Override // kotlin.jvm.functions.Function1
        public final q invoke(ItemDTO itemDTO) {
            return ((ru.ozon.android.messenger.framework.data.remote.mapper.a) this.receiver).f(null, itemDTO);
        }
    }

    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            return Vc.a.b(Double.valueOf(((q) t2).c().c()), Double.valueOf(((q) t11).c().c()));
        }
    }

    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            return Vc.a.b(Double.valueOf(((q) t2).c().c()), Double.valueOf(((q) t11).c().c()));
        }
    }

    public g(@NotNull ru.ozon.android.messenger.framework.data.remote.mapper.a blocksItemMapper, @NotNull ru.ozon.android.messenger.blocks.cell.a cellFactory) {
        Intrinsics.checkNotNullParameter(blocksItemMapper, "blocksItemMapper");
        Intrinsics.checkNotNullParameter(cellFactory, "cellFactory");
        this.f87803a = blocksItemMapper;
        this.f87804b = cellFactory;
        this.f87806d = P4.f.b("toString(...)");
    }

    private final LinkedHashMap a(List list) {
        if (list == null) {
            list = K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q f7 = this.f87803a.f(null, (ItemDTO) it.next());
            if (f7 != null) {
                arrayList.add(f7);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            ru.ozon.android.messenger.framework.core.viewmapper.e d11 = ((q) next).d();
            Object obj = linkedHashMap.get(d11);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(d11, obj);
            }
            ((List) obj).add(next);
        }
        return linkedHashMap;
    }

    public static ru.ozon.android.messenger.framework.presentation.models.responses.e d(AddFastAnswerResponseDTO addFastAnswerResponseDTO) {
        ActionSuccessOrFailResponseDTO actionResponse;
        String str = null;
        if (addFastAnswerResponseDTO == null || (actionResponse = addFastAnswerResponseDTO.getActionResponse()) == null) {
            return null;
        }
        boolean z11 = actionResponse.getSuccessMessage() == null;
        ActionSuccessOrFailResponseDTO.FailMessageDTO failMessage = actionResponse.getFailMessage();
        String title = failMessage != null ? failMessage.getTitle() : null;
        if (!z11) {
            title = null;
        }
        if (title == null) {
            ActionSuccessOrFailResponseDTO.SuccessMessageDTO successMessage = actionResponse.getSuccessMessage();
            title = successMessage != null ? successMessage.getTitle() : null;
        }
        ActionSuccessOrFailResponseDTO.FailMessageDTO failMessage2 = actionResponse.getFailMessage();
        String subtitle = failMessage2 != null ? failMessage2.getSubtitle() : null;
        if (!z11) {
            subtitle = null;
        }
        if (subtitle == null) {
            ActionSuccessOrFailResponseDTO.SuccessMessageDTO successMessage2 = actionResponse.getSuccessMessage();
            if (successMessage2 != null) {
                str = successMessage2.getSubtitle();
            }
        } else {
            str = subtitle;
        }
        return new ru.ozon.android.messenger.framework.presentation.models.responses.e(title, str, z11);
    }

    public static ru.ozon.android.messenger.blocks.curtain.c k(CurtainModalResponseDTO curtainModalResponseDTO) {
        if (curtainModalResponseDTO == null) {
            return null;
        }
        CurtainModalDataDTO data = curtainModalResponseDTO.getData();
        String obj = data.getTitle().getText().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        return new ru.ozon.android.messenger.blocks.curtain.c(ru.ozon.android.messenger.framework.presentation.models.h.a(obj), data.getTitle(), data.getImage(), data.getMessage(), data.getButtons(), data.getBackgroundColor(), data.getTrackingInfo());
    }

    public final q b(EditChatMessageResponseDTO editChatMessageResponseDTO) {
        ItemDTO footerModeMeta;
        ItemDTO data;
        q f7;
        ru.ozon.android.messenger.framework.data.remote.mapper.a aVar = this.f87803a;
        if (editChatMessageResponseDTO != null && (data = editChatMessageResponseDTO.getData()) != null && (f7 = aVar.f(null, data)) != null) {
            return f7;
        }
        if (editChatMessageResponseDTO == null || (footerModeMeta = editChatMessageResponseDTO.getFooterModeMeta()) == null) {
            return null;
        }
        return aVar.f(null, footerModeMeta);
    }

    public final q c(ReplyChatMessageResponseDTO replyChatMessageResponseDTO) {
        ItemDTO footerModeMeta;
        ItemDTO data;
        q f7;
        ru.ozon.android.messenger.framework.data.remote.mapper.a aVar = this.f87803a;
        if (replyChatMessageResponseDTO != null && (data = replyChatMessageResponseDTO.getData()) != null && (f7 = aVar.f(null, data)) != null) {
            return f7;
        }
        if (replyChatMessageResponseDTO == null || (footerModeMeta = replyChatMessageResponseDTO.getFooterModeMeta()) == null) {
            return null;
        }
        return aVar.f(null, footerModeMeta);
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.responses.g e(@NotNull GetChatsResponseDTO responseDTO) {
        Intrinsics.checkNotNullParameter(responseDTO, "responseDTO");
        LinkedHashMap a11 = a(responseDTO.getItems());
        Collection collection = (List) a11.get(e.b.f87375a);
        if (collection == null) {
            collection = K.f71697a;
        }
        ArrayList W02 = C7714v.W0(collection);
        Collection collection2 = (List) a11.get(e.a.f87374a);
        if (collection2 == null) {
            collection2 = K.f71697a;
        }
        ArrayList W03 = C7714v.W0(collection2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g.a aVar = null;
        if (this.f87805c == null) {
            GetChatsResponseDTO.ChatListFirstPageInfoDTO firstPageInfo = responseDTO.getFirstPageInfo();
            this.f87805c = firstPageInfo != null ? firstPageInfo.getShowOnlyUnreadFilter() : null;
        }
        if (Intrinsics.d(this.f87805c, Boolean.TRUE)) {
            linkedHashMap.put(0, this.f87804b.a(a.EnumC1474a.HIDE_READ, this.f87806d));
        }
        Map<Integer, ItemDTO> absoluteItems = responseDTO.getAbsoluteItems();
        if (absoluteItems == null) {
            absoluteItems = U.c();
        }
        Iterator it = ru.ozon.android.messenger.utils.b.d(absoluteItems, new b(1, this.f87803a, ru.ozon.android.messenger.framework.data.remote.mapper.a.class, "mapItem", "mapItem(Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Ljava/lang/String;)Lru/ozon/android/messenger/framework/presentation/models/ItemVO;", 0)).entrySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Integer.valueOf(linkedHashMap.size()), ((Map.Entry) it.next()).getValue());
        }
        Boolean hasItemsAfter = responseDTO.getHasItemsAfter();
        String lastUnreadChatId = responseDTO.getLastUnreadChatId();
        GetChatsResponseDTO.ChatListFirstPageInfoDTO firstPageInfo2 = responseDTO.getFirstPageInfo();
        if (firstPageInfo2 != null) {
            GetChatsResponseDTO.ChatGroupsResponseDTO chatGroups = firstPageInfo2.getChatGroups();
            ru.ozon.android.messenger.framework.data.remote.mapper.a aVar2 = this.f87803a;
            aVar = new g.a(chatGroups != null ? aVar2.b(f.b.CHAT_GROUP_LIST, new ru.ozon.android.messenger.blocks.chatGroups.grouplist.h(chatGroups.getItems(), chatGroups.getDefaultItemId()), n.a()) : null, aVar2.f(null, firstPageInfo2.getHeader()), aVar2.f(null, firstPageInfo2.getFloatButton()), aVar2.f(null, firstPageInfo2.getPopUp()));
        }
        return new ru.ozon.android.messenger.framework.presentation.models.responses.g(W03, W02, hasItemsAfter, linkedHashMap, lastUnreadChatId, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.responses.h f(@NotNull GetMessagesResponseDTO responseDTO, @NotNull List<q> undeliveredMessagesPage) {
        ru.ozon.android.messenger.framework.presentation.models.responses.f fVar;
        ?? r102;
        Intrinsics.checkNotNullParameter(responseDTO, "responseDTO");
        Intrinsics.checkNotNullParameter(undeliveredMessagesPage, "undeliveredMessagesPage");
        LinkedHashMap a11 = a(responseDTO.getItems());
        Collection collection = (List) a11.get(e.a.f87374a);
        if (collection == null) {
            collection = K.f71697a;
        }
        List I02 = C7714v.I0(new c(), C7714v.p0(undeliveredMessagesPage, collection));
        List list = (List) a11.get(e.b.f87375a);
        if (list == null) {
            list = K.f71697a;
        }
        List list2 = list;
        Boolean hasItemsAfter = responseDTO.getHasItemsAfter();
        Boolean hasItemsBefore = responseDTO.getHasItemsBefore();
        GetMessagesResponseDTO.FirstPageInfoDTO firstPageInfo = responseDTO.getFirstPageInfo();
        if (firstPageInfo != null) {
            ItemDTO header = firstPageInfo.getHeader();
            ru.ozon.android.messenger.framework.data.remote.mapper.a aVar = this.f87803a;
            q f7 = header != null ? aVar.f(null, header) : null;
            ItemDTO footer = firstPageInfo.getFooter();
            q f11 = footer != null ? aVar.f(null, footer) : null;
            List<ItemDTO> chatRoomActions = firstPageInfo.getChatRoomActions();
            if (chatRoomActions != null) {
                List<ItemDTO> list3 = chatRoomActions;
                r102 = new ArrayList(C7714v.z(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    r102.add(aVar.f(null, (ItemDTO) it.next()));
                }
            } else {
                r102 = K.f71697a;
            }
            List list4 = r102;
            K k11 = K.f71697a;
            int unreadCount = firstPageInfo.getUnreadCount();
            ItemDTO emptyState = firstPageInfo.getEmptyState();
            q f12 = emptyState != null ? aVar.f(null, emptyState) : null;
            ItemDTO snackbar = firstPageInfo.getSnackbar();
            q f13 = snackbar != null ? aVar.f(null, snackbar) : null;
            List<ItemDTO> itemsBefore = firstPageInfo.getItemsBefore();
            List list5 = itemsBefore != null ? (List) a(itemsBefore).get(e.a.f87374a) : null;
            List<ItemDTO> itemsAfter = firstPageInfo.getItemsAfter();
            fVar = new ru.ozon.android.messenger.framework.presentation.models.responses.f(f7, f11, list4, k11, unreadCount, f12, f13, list5, itemsAfter != null ? (List) a(itemsAfter).get(e.a.f87374a) : null);
        } else {
            fVar = null;
        }
        return new ru.ozon.android.messenger.framework.presentation.models.responses.h(I02, list2, hasItemsAfter, hasItemsBefore, responseDTO.getContext(), fVar, responseDTO.getTrackingInfo());
    }

    @NotNull
    public final k g(@NotNull SearchResponseDTO responseDTO) {
        Intrinsics.checkNotNullParameter(responseDTO, "responseDTO");
        LinkedHashMap a11 = a(responseDTO.getItems());
        Iterable iterable = (List) a11.get(e.a.f87374a);
        List list = (List) a11.get(e.b.f87375a);
        if (iterable == null) {
            iterable = K.f71697a;
        }
        List I02 = C7714v.I0(new d(), iterable);
        if (list == null) {
            list = K.f71697a;
        }
        q qVar = (q) C7714v.M(list);
        Boolean hasItemsAfter = responseDTO.getHasItemsAfter();
        boolean booleanValue = hasItemsAfter != null ? hasItemsAfter.booleanValue() : false;
        String nextPageCursor = responseDTO.getNextPageCursor();
        if (nextPageCursor == null) {
            nextPageCursor = "";
        }
        return new k(I02, qVar, booleanValue, nextPageCursor);
    }

    @NotNull
    public final m h(@NotNull StartOrGetChatResponseDTO responseDTO) {
        List<BlockDTO> blocks;
        Intrinsics.checkNotNullParameter(responseDTO, "responseDTO");
        if (a.f87807a[responseDTO.getItem().getType().ordinal()] != 1) {
            return new m.b(null);
        }
        Object parsedModel = responseDTO.getItem().getParsedModel();
        ru.ozon.android.messenger.framework.data.remote.models.items.a aVar = parsedModel instanceof ru.ozon.android.messenger.framework.data.remote.models.items.a ? (ru.ozon.android.messenger.framework.data.remote.models.items.a) parsedModel : null;
        BlockDTO blockDTO = (aVar == null || (blocks = aVar.getBlocks()) == null) ? null : (BlockDTO) C7714v.K(blocks);
        ru.ozon.android.messenger.framework.data.remote.mapper.a aVar2 = this.f87803a;
        if (blockDTO == null) {
            return Intrinsics.d(responseDTO.getItem().getId(), f.c.ERROR.b()) ? new m.b(aVar2.f(null, responseDTO.getItem())) : new m.a(responseDTO.getItem().getId(), null, responseDTO.getTrackingInfo());
        }
        String name = blockDTO.getName();
        if (Intrinsics.d(name, f.c.EMPTY_STATE.b())) {
            return new m.b(aVar2.f(null, responseDTO.getItem()));
        }
        if (!Intrinsics.d(name, f.c.CHAT.b()) && !Intrinsics.d(name, f.c.SX_CHAT.b())) {
            return new m.b(null);
        }
        q f7 = aVar2.f(null, responseDTO.getItem());
        ru.ozon.android.messenger.framework.presentation.models.g b11 = f7 != null ? r.b(f7) : null;
        ru.ozon.android.messenger.blocks.chat.common.b bVar = b11 instanceof ru.ozon.android.messenger.blocks.chat.common.b ? (ru.ozon.android.messenger.blocks.chat.common.b) b11 : null;
        return bVar == null ? new m.b(null) : new m.a(responseDTO.getItem().getId(), bVar, responseDTO.getTrackingInfo());
    }

    @NotNull
    public final ru.ozon.android.messenger.utils.i<l> i(@NotNull SendMessagesResponseDTO responseDTO) {
        Intrinsics.checkNotNullParameter(responseDTO, "responseDTO");
        q f7 = this.f87803a.f(null, responseDTO.getItem());
        ru.ozon.android.messenger.framework.presentation.models.responses.j jVar = Intrinsics.d(responseDTO.getStatus(), DiscountCodeResponse.RESULT_OK) ? ru.ozon.android.messenger.framework.presentation.models.responses.j.OK : ru.ozon.android.messenger.framework.presentation.models.responses.j.Error;
        if (f7 != null) {
            return new i.b(new l(f7, jVar, responseDTO.getTrackingInfo(), responseDTO.getRetryToken()));
        }
        return new i.a.f("Failed to map response " + responseDTO, null);
    }

    @NotNull
    public final ru.ozon.android.messenger.utils.i<ru.ozon.android.messenger.framework.presentation.models.responses.n> j(@NotNull UpdateMessageResponseDTO responseDTO) {
        Intrinsics.checkNotNullParameter(responseDTO, "responseDTO");
        ru.ozon.android.messenger.framework.presentation.models.responses.j jVar = Intrinsics.d(responseDTO.getStatus(), DiscountCodeResponse.RESULT_OK) ? ru.ozon.android.messenger.framework.presentation.models.responses.j.OK : ru.ozon.android.messenger.framework.presentation.models.responses.j.Error;
        ItemDTO item = responseDTO.getItem();
        q f7 = item != null ? this.f87803a.f(null, item) : null;
        if (f7 != null || responseDTO.getErrorDescription() != null) {
            return new i.b(new ru.ozon.android.messenger.framework.presentation.models.responses.n(f7, jVar, responseDTO.getTrackingInfo(), responseDTO.getRetryToken(), responseDTO.getErrorDescription()));
        }
        return new i.a.f("Failed to map response " + responseDTO, null);
    }
}
