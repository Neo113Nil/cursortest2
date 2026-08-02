package ru.ozon.android.messenger.blocks.chat.old;

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
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.app.android.messenger.databinding.MBlockChatBinding;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

/* loaded from: classes10.dex */
public final class f extends ru.ozon.android.messenger.blocks.chat.common.d<ChatDTO, ru.ozon.android.messenger.blocks.chat.old.c> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockChatBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.chat.old.c, MBlockChatBinding>> f84575c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, ChatDTO> f84576d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f84577e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a AVATAR;
        public static final a MENU_ITEMS;
        public static final a PREVIEW;
        public static final a TITLE;
        public static final a UNREAD_COUNT;

        static {
            a aVar = new a("PREVIEW", 0);
            PREVIEW = aVar;
            a aVar2 = new a(SelectionItemDescriptionDTO.TITLE, 1);
            TITLE = aVar2;
            a aVar3 = new a("UNREAD_COUNT", 2);
            UNREAD_COUNT = aVar3;
            a aVar4 = new a("AVATAR", 3);
            AVATAR = aVar4;
            a aVar5 = new a("MENU_ITEMS", 4);
            MENU_ITEMS = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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

    static final class b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.chat.old.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f84578b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.chat.old.a invoke() {
            return new ru.ozon.android.messenger.blocks.chat.old.a();
        }
    }

    /* synthetic */ class c extends C7735q implements Function1<String, ChatDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final ChatDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (ChatDTO) ((JsonParser) this.receiver).fromJson(p02, ChatDTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MBlockChatBinding, ru.ozon.android.messenger.framework.core.d, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f84579a = new d(2, e.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockChatBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final e invoke(MBlockChatBinding mBlockChatBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockChatBinding p02 = mBlockChatBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new e(p02, p12);
        }
    }

    public f(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84575c = d.f84579a;
        this.f84576d = new c(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f84577e = ru.ozon.android.messenger.utils.f.b(b.f84578b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.chat.old.a) this.f84577e.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ChatDTO> getParser() {
        return this.f84576d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final List getPayloads(g gVar, g gVar2) {
        ru.ozon.android.messenger.blocks.chat.old.c oldItem = (ru.ozon.android.messenger.blocks.chat.old.c) gVar;
        ru.ozon.android.messenger.blocks.chat.old.c newItem = (ru.ozon.android.messenger.blocks.chat.old.c) gVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.l(), newItem.l()) || !Intrinsics.d(oldItem.m(), newItem.m())) {
            arrayList.add(a.TITLE);
        }
        if (!Intrinsics.d(oldItem.k(), newItem.k())) {
            arrayList.add(a.PREVIEW);
        }
        if (!Intrinsics.d(oldItem.d(), newItem.d())) {
            arrayList.add(a.UNREAD_COUNT);
        }
        if (!Intrinsics.d(oldItem.g(), newItem.g()) || oldItem.h() != newItem.h()) {
            arrayList.add(a.AVATAR);
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
    public final Function2<MBlockChatBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.chat.old.c, MBlockChatBinding>> getViewProducer() {
        return this.f84575c;
    }
}
