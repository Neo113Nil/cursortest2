package ru.ozon.android.messenger.blocks.chat.sx;

import Sc.r;
import Sc.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MBlockChatBinding;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

/* loaded from: classes10.dex */
public final class g extends ru.ozon.android.messenger.blocks.chat.common.d<SxChatDTO, ru.ozon.android.messenger.blocks.chat.sx.b> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final JsonParser f84646c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockChatBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.chat.sx.b, MBlockChatBinding>> f84647d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<String, SxChatDTO> f84648e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f84649f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CONVERSATION_ID;
        public static final a DISPLAY_TYPE;
        public static final a MENU_ITEMS;
        public static final a PREVIEW;
        public static final a PREVIEW_BADGES;
        public static final a TITLE;
        public static final a UNREAD_COUNT;

        static {
            a aVar = new a("PREVIEW", 0);
            PREVIEW = aVar;
            a aVar2 = new a(SelectionItemDescriptionDTO.TITLE, 1);
            TITLE = aVar2;
            a aVar3 = new a("UNREAD_COUNT", 2);
            UNREAD_COUNT = aVar3;
            a aVar4 = new a("DISPLAY_TYPE", 3);
            DISPLAY_TYPE = aVar4;
            a aVar5 = new a("PREVIEW_BADGES", 4);
            PREVIEW_BADGES = aVar5;
            a aVar6 = new a("CONVERSATION_ID", 5);
            CONVERSATION_ID = aVar6;
            a aVar7 = new a("MENU_ITEMS", 6);
            MENU_ITEMS = aVar7;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
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

    static final class b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.chat.sx.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f84650b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.chat.sx.a invoke() {
            return new ru.ozon.android.messenger.blocks.chat.sx.a();
        }
    }

    /* synthetic */ class c extends C7735q implements Function1<String, SxChatDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final SxChatDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (SxChatDTO) ((JsonParser) this.receiver).fromJson(p02, SxChatDTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MBlockChatBinding, ru.ozon.android.messenger.framework.core.d, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f84651a = new d(2, e.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockChatBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final e invoke(MBlockChatBinding mBlockChatBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockChatBinding p02 = mBlockChatBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new e(p02, p12);
        }
    }

    public g(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84646c = deserializer;
        this.f84647d = d.f84651a;
        this.f84648e = new c(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f84649f = ru.ozon.android.messenger.utils.f.b(b.f84650b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final boolean canMap(Object obj) {
        Object a11;
        if (!(obj instanceof BlockDTO)) {
            return false;
        }
        try {
            r.Companion companion = r.INSTANCE;
            a11 = (SxChatDTO) this.f84646c.fromJson(((BlockDTO) obj).getState(), SxChatDTO.class);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        return !(a11 instanceof r.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.chat.sx.a) this.f84649f.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, SxChatDTO> getParser() {
        return this.f84648e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final List getPayloads(ru.ozon.android.messenger.framework.presentation.models.g gVar, ru.ozon.android.messenger.framework.presentation.models.g gVar2) {
        ru.ozon.android.messenger.blocks.chat.sx.b oldItem = (ru.ozon.android.messenger.blocks.chat.sx.b) gVar;
        ru.ozon.android.messenger.blocks.chat.sx.b newItem = (ru.ozon.android.messenger.blocks.chat.sx.b) gVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.m(), newItem.m()) || !Intrinsics.d(oldItem.n(), newItem.n())) {
            arrayList.add(a.TITLE);
        }
        if (!Intrinsics.d(oldItem.k(), newItem.k())) {
            arrayList.add(a.PREVIEW);
        }
        if (!Intrinsics.d(oldItem.d(), newItem.d())) {
            arrayList.add(a.UNREAD_COUNT);
        }
        if (oldItem.j() != newItem.j()) {
            arrayList.add(a.DISPLAY_TYPE);
        }
        if (!Intrinsics.d(oldItem.l(), newItem.l())) {
            arrayList.add(a.PREVIEW_BADGES);
        }
        if (!Intrinsics.d(oldItem.h(), newItem.h())) {
            arrayList.add(a.CONVERSATION_ID);
        }
        if (!Intrinsics.d(oldItem.c(), newItem.c())) {
            arrayList.add(a.MENU_ITEMS);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockChatBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.chat.sx.b, MBlockChatBinding>> getViewProducer() {
        return this.f84647d;
    }
}
