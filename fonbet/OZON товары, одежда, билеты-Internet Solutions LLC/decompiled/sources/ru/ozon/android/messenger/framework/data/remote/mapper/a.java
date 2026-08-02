package ru.ozon.android.messenger.framework.data.remote.mapper;

import Sc.r;
import com.squareup.moshi.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.T;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.data.b;
import ru.ozon.android.messenger.framework.data.m;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.AuthorDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.BlockContainerModelDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.MessageModelDTO;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.presentation.models.C9515b;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.framework.presentation.models.t;
import ru.ozon.android.messenger.framework.presentation.models.u;
import ru.ozon.android.messenger.framework.presentation.models.z;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f87786a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f87787b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.logger.b f87788c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final m f87789d;

    /* renamed from: ru.ozon.android.messenger.framework.data.remote.mapper.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1576a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87790a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f87791b;

        static {
            int[] iArr = new int[MessageModelDTO.a.values().length];
            try {
                iArr[MessageModelDTO.a.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageModelDTO.a.AVATAR_MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageModelDTO.a.WIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageModelDTO.a.EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f87790a = iArr;
            int[] iArr2 = new int[MessageModelDTO.b.values().length];
            try {
                iArr2[MessageModelDTO.b.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MessageModelDTO.b.READ.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f87791b = iArr2;
        }
    }

    public a(@NotNull ru.ozon.android.messenger.framework.data.b blockStore, @NotNull e parsingErrorBlockFactory, ru.ozon.android.messenger.framework.logger.b bVar, @NotNull m logger) {
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        Intrinsics.checkNotNullParameter(parsingErrorBlockFactory, "parsingErrorBlockFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f87786a = blockStore;
        this.f87787b = parsingErrorBlockFactory;
        this.f87788c = bVar;
        this.f87789d = logger;
    }

    private static t a(MessageModelDTO.a aVar) {
        int i11 = aVar == null ? -1 : C1576a.f87790a[aVar.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? t.b.f91548a : t.b.f91548a : t.d.f91550a : new t.a(true) : t.c.f91549a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void d(BlockDTO blockDTO, Throwable th2, ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g> dVar) {
        List list;
        String str;
        ru.ozon.android.messenger.framework.core.viewmapper.e viewMapperType;
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c11 = this.f87786a.c(ru.ozon.android.messenger.framework.data.remote.models.blocks.a.a(blockDTO));
        if (c11 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = c11.iterator();
            while (it.hasNext()) {
                C7714v.p(C7705l.e0(((ru.ozon.android.messenger.framework.core.viewmapper.d) it.next()).getSupportedVersions()), arrayList);
            }
            List C11 = C7714v.C(arrayList);
            if (C11 != null) {
                list = C7714v.H0(C11);
                if (list == null) {
                    list = K.f71697a;
                }
                if (dVar != null) {
                    str = Nk.a.b("Unable to find viewMapper for ", ru.ozon.android.messenger.framework.data.remote.models.blocks.a.a(blockDTO));
                } else if (list.contains(Long.valueOf(blockDTO.getVersion()))) {
                    str = "Parsing failed";
                } else {
                    str = "Block version " + blockDTO.getVersion() + " is unsupported. Supported versions: " + C7714v.V(list, null, null, null, null, 63);
                }
                String str2 = str;
                Lm0.a.f17149a.w(th2, Sh.b.c("Unable to parse ", ru.ozon.android.messenger.framework.data.remote.models.blocks.a.a(blockDTO), ". ", str2), new Object[0]);
                boolean z11 = false;
                String name = blockDTO.getName();
                String a11 = ru.ozon.android.messenger.framework.data.remote.models.blocks.a.a(blockDTO);
                long version = blockDTO.getVersion();
                if (dVar != null) {
                    z11 = true;
                }
                Pair pair = new Pair("viewMapperFound", Boolean.valueOf(z11));
                Pair pair2 = new Pair("supportedVersions", C7714v.V(list, ", ", "[", "]", null, 56));
                Pair pair3 = new Pair("isVersionSupported", Boolean.valueOf(list.contains(Long.valueOf(blockDTO.getVersion()))));
                if (dVar != null || (viewMapperType = dVar.getViewMapperType()) == null || (r1 = viewMapperType.toString()) == null) {
                    String str3 = "null";
                }
                this.f87789d.d(name, a11, version, th2, str2, U.j(pair, pair2, pair3, new Pair("viewMapperType", str3)));
            }
        }
        list = null;
        if (list == null) {
        }
        if (dVar != null) {
        }
        String str22 = str;
        Lm0.a.f17149a.w(th2, Sh.b.c("Unable to parse ", ru.ozon.android.messenger.framework.data.remote.models.blocks.a.a(blockDTO), ". ", str22), new Object[0]);
        boolean z112 = false;
        String name2 = blockDTO.getName();
        String a112 = ru.ozon.android.messenger.framework.data.remote.models.blocks.a.a(blockDTO);
        long version2 = blockDTO.getVersion();
        if (dVar != null) {
        }
        Pair pair4 = new Pair("viewMapperFound", Boolean.valueOf(z112));
        Pair pair22 = new Pair("supportedVersions", C7714v.V(list, ", ", "[", "]", null, 56));
        Pair pair32 = new Pair("isVersionSupported", Boolean.valueOf(list.contains(Long.valueOf(blockDTO.getVersion()))));
        if (dVar != null) {
        }
        String str32 = "null";
        this.f87789d.d(name2, a112, version2, th2, str22, U.j(pair4, pair22, pair32, new Pair("viewMapperType", str32)));
    }

    private final void g(BlockDTO blockDTO, Throwable th2) {
        Object obj;
        ru.ozon.android.messenger.framework.logger.b bVar = this.f87788c;
        if (bVar != null) {
            List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c11 = this.f87786a.c(ru.ozon.android.messenger.framework.data.remote.models.blocks.a.a(blockDTO));
            if (c11 == null) {
                bVar.log("Block is " + blockDTO + " unsupported");
            } else {
                Iterator<T> it = c11.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (C7705l.l(((ru.ozon.android.messenger.framework.core.viewmapper.d) obj).getSupportedVersions(), blockDTO.getVersion())) {
                            break;
                        }
                    }
                }
                if (obj == null) {
                    c11 = null;
                }
                if (c11 == null) {
                    bVar.log("Block version is " + blockDTO.getVersion() + " unsupported. (Block = " + blockDTO + ")");
                }
            }
            if (th2 instanceof k) {
                bVar.log(th2);
            }
        }
    }

    private static s h(MessageModelDTO messageModelDTO, String str, double d11) {
        String localId = messageModelDTO.getLocalId();
        t a11 = a(messageModelDTO.getLayout());
        AuthorDTO author = messageModelDTO.getAuthor();
        C9515b c9515b = author != null ? new C9515b(author.getId(), author.getName(), author.getAvatarIcon(), author.getIcons()) : null;
        DateTime createdAt = messageModelDTO.getCreatedAt();
        DateTime updatedAt = messageModelDTO.getUpdatedAt();
        boolean d12 = messageModelDTO.isMine() ? true : Intrinsics.d(messageModelDTO.isRead(), Boolean.TRUE);
        boolean isMine = messageModelDTO.isMine();
        int size = messageModelDTO.getBlocks().size();
        MessageModelDTO.b status = messageModelDTO.getStatus();
        int i11 = status == null ? -1 : C1576a.f87791b[status.ordinal()];
        return new s(str, localId, a11, c9515b, createdAt, updatedAt, d11, d12, isMine, false, false, size, i11 != 1 ? i11 != 2 ? z.d.f91566a : z.e.f91567a : z.f.f91568a, messageModelDTO.getContextMenu(), (p.b) null, (Map) messageModelDTO.getTrackingInfo(), messageModelDTO.getUpdateStatusLabel(), 35840);
    }

    @NotNull
    public final q b(@NotNull f.b block, Object obj, @NotNull String id2) {
        Object obj2;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(id2, "id");
        String a11 = b.a.a("internal", block.b());
        ru.ozon.android.messenger.framework.data.b bVar = this.f87786a;
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c11 = bVar.c(a11);
        if (c11 == null) {
            throw new IllegalArgumentException(Nk.a.b("Unable to found view mappers for block ", block.b()));
        }
        int a12 = bVar.a(c11);
        Iterator<T> it = c11.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((ru.ozon.android.messenger.framework.core.viewmapper.d) obj2).canMap(obj)) {
                break;
            }
        }
        ru.ozon.android.messenger.framework.core.viewmapper.d dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj2;
        if (dVar == null) {
            throw new IllegalArgumentException(Nk.a.b("Unable to found view mappers for block ", block.b()));
        }
        Function2 mapper = dVar.getMapper();
        List list = mapper != null ? (List) mapper.invoke(obj, ru.ozon.android.messenger.framework.presentation.models.h.a(id2)) : null;
        if (list == null) {
            list = K.f71697a;
        }
        return new q(C7714v.a0(new u((ru.ozon.android.messenger.framework.presentation.models.g) C7714v.K(list), a12, dVar.getViewMapperType())), new p(id2, 1, 0.0d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r3 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c(@NotNull BlockDTO blockDTO) {
        Object obj;
        Intrinsics.checkNotNullParameter(blockDTO, "blockDTO");
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c11 = this.f87786a.c(ru.ozon.android.messenger.framework.data.remote.models.blocks.a.a(blockDTO));
        if (c11 != null) {
            Iterator<T> it = c11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7705l.l(((ru.ozon.android.messenger.framework.core.viewmapper.d) obj).getSupportedVersions(), blockDTO.getVersion())) {
                    break;
                }
            }
        }
        c11 = null;
        if (c11 == null) {
            Lm0.a.f17149a.w("Unable to found view mapper for block " + blockDTO, new Object[0]);
        }
        return c11;
    }

    public final u e(@NotNull BlockDTO blockDTO, @NotNull String itemId) {
        Object obj;
        Object a11;
        List<? extends ru.ozon.android.messenger.framework.presentation.models.g> invoke;
        ru.ozon.android.messenger.framework.presentation.models.g gVar;
        Intrinsics.checkNotNullParameter(blockDTO, "blockDTO");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c11 = c(blockDTO);
        if (c11 != null) {
            Iterator<T> it = c11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ru.ozon.android.messenger.framework.core.viewmapper.d) obj).canMap(blockDTO)) {
                    break;
                }
            }
            ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g> dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj;
            if (dVar != null) {
                try {
                    r.Companion companion = r.INSTANCE;
                    Object invoke2 = dVar.getParser().invoke(blockDTO.getState());
                    Function2<?, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.framework.presentation.models.g>> mapper = dVar.getMapper();
                    a11 = (mapper == null || (invoke = mapper.invoke(invoke2, ru.ozon.android.messenger.framework.presentation.models.h.a(itemId))) == null || (gVar = (ru.ozon.android.messenger.framework.presentation.models.g) C7714v.M(invoke)) == null) ? null : new u(gVar, this.f87786a.a(c11), dVar.getViewMapperType(), new ru.ozon.android.messenger.framework.presentation.models.d(0, blockDTO.getName()));
                } catch (Throwable th2) {
                    r.Companion companion2 = r.INSTANCE;
                    a11 = Sc.s.a(th2);
                }
                Throwable b11 = r.b(a11);
                if (b11 != null) {
                    d(blockDTO, b11, dVar);
                    g(blockDTO, b11);
                }
                return (u) (a11 instanceof r.b ? null : a11);
            }
        }
        return null;
    }

    public final q f(String str, ItemDTO itemDTO) {
        Object obj;
        MessageModelDTO messageModelDTO;
        p h11;
        ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g> dVar;
        String str2;
        Object obj2;
        u uVar;
        Object obj3;
        List list;
        List m11;
        if (itemDTO == null) {
            return null;
        }
        if (!(itemDTO.getParsedModel() instanceof ru.ozon.android.messenger.framework.data.remote.models.items.a)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Object parsedModel = itemDTO.getParsedModel();
        ru.ozon.android.messenger.framework.data.remote.models.items.a aVar = (ru.ozon.android.messenger.framework.data.remote.models.items.a) parsedModel;
        List<BlockDTO> blocks = aVar.getBlocks();
        if (blocks == null) {
            blocks = K.f71697a;
        }
        String str3 = (str == null || (m11 = kotlin.text.h.m(str, new String[]{"/"}, 0, 6)) == null) ? null : (String) C7714v.X(m11);
        p.b bVar = Intrinsics.d(str3, "itemsBefore") ? p.b.FIRST : Intrinsics.d(str3, "itemsAfter") ? p.b.LAST : p.b.DEFAULT;
        try {
            if (aVar instanceof BlockContainerModelDTO) {
                List<BlockDTO> blocks2 = ((BlockContainerModelDTO) itemDTO.getParsedModel()).getBlocks();
                if (blocks2 == null) {
                    blocks2 = K.f71697a;
                }
                List<BlockDTO> list2 = blocks2;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.d(((BlockDTO) it.next()).getName(), "isTypingBlock")) {
                            String id2 = itemDTO.getId();
                            double orderBy = itemDTO.getOrderBy();
                            t a11 = a(MessageModelDTO.a.MESSAGE);
                            DateTime dateTime = new DateTime();
                            DateTime dateTime2 = new DateTime();
                            List<BlockDTO> blocks3 = ((BlockContainerModelDTO) parsedModel).getBlocks();
                            h11 = new s(id2, id2, a11, (C9515b) null, dateTime, dateTime2, orderBy, true, false, false, false, blocks3 != null ? blocks3.size() : 0, (z) z.d.f91566a, (ContextMenuDTO) null, bVar, (Map) null, (String) null, 3072);
                        }
                    }
                }
                h11 = new p(itemDTO.getId(), blocks.size(), itemDTO.getOrderBy(), bVar);
            } else {
                if (!(aVar instanceof MessageModelDTO)) {
                    throw new IllegalStateException("Unknown item model type");
                }
                Iterator<T> it2 = ((MessageModelDTO) parsedModel).getBlocks().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.d(((BlockDTO) obj).getName(), f.a.AI_DIVIDER.b())) {
                        break;
                    }
                }
                if (((BlockDTO) obj) == null || (messageModelDTO = MessageModelDTO.copy$default((MessageModelDTO) parsedModel, null, null, null, null, null, false, null, null, null, null, null, null, 4063, null)) == null) {
                    messageModelDTO = (MessageModelDTO) parsedModel;
                }
                h11 = h(messageModelDTO, itemDTO.getId(), itemDTO.getOrderBy());
            }
            try {
                if (blocks.isEmpty()) {
                    throw new IllegalStateException("No blocks provided in item");
                }
                List<BlockDTO> list3 = blocks;
                ArrayList arrayList = new ArrayList(C7714v.z(list3, 10));
                int i11 = 0;
                for (Object obj4 : list3) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    BlockDTO blockDTO = (BlockDTO) obj4;
                    List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c11 = c(blockDTO);
                    if (c11 != null) {
                        Iterator<T> it3 = c11.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it3.next();
                            if (((ru.ozon.android.messenger.framework.core.viewmapper.d) obj3).canMap(blockDTO)) {
                                break;
                            }
                        }
                        ru.ozon.android.messenger.framework.core.viewmapper.d dVar2 = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj3;
                        if (dVar2 != null) {
                            Object invoke = dVar2.getParser().invoke(blockDTO.getState());
                            Function2 mapper = dVar2.getMapper();
                            if (mapper != null && (list = (List) mapper.invoke(invoke, ru.ozon.android.messenger.framework.presentation.models.h.a(h11.getId()))) != null) {
                                uVar = new u((ru.ozon.android.messenger.framework.presentation.models.g) C7714v.K(list), this.f87786a.a(c11), dVar2.getViewMapperType(), new ru.ozon.android.messenger.framework.presentation.models.d(i11, blockDTO.getName()));
                                arrayList.add(uVar);
                                i11 = i12;
                            }
                        }
                    }
                    uVar = null;
                    arrayList.add(uVar);
                    i11 = i12;
                }
                ArrayList I11 = C7714v.I(arrayList);
                if (I11.isEmpty()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                return new q(I11, h11);
            } catch (Throwable th2) {
                BlockDTO blockDTO2 = (BlockDTO) C7714v.K(blocks);
                List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c12 = c(blockDTO2);
                if (c12 != null) {
                    Iterator<T> it4 = c12.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it4.next();
                        if (((ru.ozon.android.messenger.framework.core.viewmapper.d) obj2).canMap(blockDTO2)) {
                            break;
                        }
                    }
                    dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj2;
                } else {
                    dVar = null;
                }
                d(blockDTO2, th2, dVar);
                if (dVar == null) {
                    str2 = Nk.a.b("Reason: Unable to find viewMapper for ", ru.ozon.android.messenger.framework.data.remote.models.blocks.a.a(blockDTO2));
                } else {
                    Intrinsics.checkNotNullParameter(T.f71792a, "<this>");
                    str2 = "";
                }
                Lm0.a.f17149a.w(th2, Sh.b.c("Unable to parse ", ru.ozon.android.messenger.framework.data.remote.models.blocks.a.a(blockDTO2), ". ", str2), new Object[0]);
                g(blockDTO2, th2);
                ru.ozon.android.messenger.framework.data.remote.models.items.b type = itemDTO.getType();
                ru.ozon.android.messenger.framework.data.remote.models.items.b bVar2 = ru.ozon.android.messenger.framework.data.remote.models.items.b.MESSAGE;
                e eVar = this.f87787b;
                if (type == bVar2) {
                    return eVar.b(s.d((s) h11, null, null, null, 0.0d, false, false, 1, null, 258047));
                }
                if (Intrinsics.d(dVar != null ? dVar.getViewMapperType() : null, e.b.f87375a)) {
                    return eVar.a(new p(h11.getId(), 1, h11.c()));
                }
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
