package ru.ozon.android.messenger.blocks.chatGroups;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.chat.common.UnreadCountIndicatorDTO;
import ru.ozon.android.messenger.blocks.chat.common.m;
import ru.ozon.android.messenger.blocks.chat.common.n;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MBlockChatGroupBinding;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.core.viewmapper.a<ChatGroupDTO, ru.ozon.android.messenger.blocks.chatGroups.a, MBlockChatGroupBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockChatGroupBinding> f84681a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<ru.ozon.android.messenger.blocks.chatGroups.c> f84682b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f84683c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, ChatGroupDTO> f84684d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<ChatGroupDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.chatGroups.a>> f84685e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CHECKED;
        public static final a UNREAD_COUNT;

        static {
            a aVar = new a("UNREAD_COUNT", 0);
            UNREAD_COUNT = aVar;
            a aVar2 = new a("CHECKED", 1);
            CHECKED = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* synthetic */ class b extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockChatGroupBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f84686a = new b(3, MBlockChatGroupBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockChatGroupBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockChatGroupBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockChatGroupBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class c extends AbstractC7737t implements Function2<ChatGroupDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.chatGroups.a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f84687b = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends ru.ozon.android.messenger.blocks.chatGroups.a> invoke(ChatGroupDTO chatGroupDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            m mVar;
            ChatGroupDTO dto = chatGroupDTO;
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(dto, "dto");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            String name = dto.getName();
            String chatType = dto.getChatType();
            UnreadCountIndicatorDTO unreadCountIndicator = dto.getUnreadCountIndicator();
            if (unreadCountIndicator != null) {
                Intrinsics.checkNotNullParameter(unreadCountIndicator, "<this>");
                mVar = new m(unreadCountIndicator.getValue(), n.ACTIVE);
            } else {
                Integer unreadCount = dto.getUnreadCount();
                mVar = unreadCount != null ? new m(unreadCount.intValue(), n.ACTIVE) : null;
            }
            IconDTO groupIcon = dto.getGroupIcon();
            Boolean hasSearch = dto.getHasSearch();
            return C7714v.a0(new ru.ozon.android.messenger.blocks.chatGroups.a(blockId, name, chatType, mVar, false, true, groupIcon, hasSearch != null ? hasSearch.booleanValue() : false, false, dto.getTrackingInfo(), UUID.randomUUID().toString()));
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.chatGroups.d$d, reason: collision with other inner class name */
    /* synthetic */ class C1480d extends C7735q implements Function1<String, ChatGroupDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final ChatGroupDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (ChatGroupDTO) ((JsonParser) this.receiver).fromJson(p02, ChatGroupDTO.class);
        }
    }

    /* synthetic */ class e extends C7735q implements Function2<MBlockChatGroupBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.chatGroups.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f84688a = new e(2, ru.ozon.android.messenger.blocks.chatGroups.c.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockChatGroupBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.chatGroups.c invoke(MBlockChatGroupBinding mBlockChatGroupBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockChatGroupBinding p02 = mBlockChatGroupBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.chatGroups.c(p02, p12);
        }
    }

    public d(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84681a = b.f84686a;
        this.f84682b = e.f84688a;
        this.f84683c = a.AbstractC1563a.C1564a.f87356a;
        this.f84684d = new C1480d(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f84685e = c.f84687b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f84683c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockChatGroupBinding> getInflate() {
        return this.f84681a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<ChatGroupDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.chatGroups.a>> getMapper() {
        return this.f84685e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ChatGroupDTO> getParser() {
        return this.f84684d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final List getPayloads(ru.ozon.android.messenger.blocks.chatGroups.a aVar, ru.ozon.android.messenger.blocks.chatGroups.a aVar2) {
        ru.ozon.android.messenger.blocks.chatGroups.a oldItem = aVar;
        ru.ozon.android.messenger.blocks.chatGroups.a newItem = aVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.f(), newItem.f())) {
            arrayList.add(a.UNREAD_COUNT);
        }
        if (oldItem.g() != newItem.g()) {
            arrayList.add(a.CHECKED);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockChatGroupBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.chatGroups.a, MBlockChatGroupBinding>> getViewProducer() {
        return (Function2) this.f84682b;
    }
}
