package ru.ozon.android.messenger.blocks.unreadline;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MBlockUnreadLineBinding;

/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.core.viewmapper.a<UnreadDTO, ru.ozon.android.messenger.blocks.unreadline.a, MBlockUnreadLineBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<UnreadDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.unreadline.a>> f86553a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockUnreadLineBinding> f86554b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockUnreadLineBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.unreadline.a, MBlockUnreadLineBinding>> f86555c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, UnreadDTO> f86556d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f86557e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockUnreadLineBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f86558a = new a(3, MBlockUnreadLineBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockUnreadLineBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockUnreadLineBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockUnreadLineBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function2<UnreadDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.unreadline.a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f86559b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends ru.ozon.android.messenger.blocks.unreadline.a> invoke(UnreadDTO unreadDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(unreadDTO, "<unused var>");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            return C7714v.a0(new ru.ozon.android.messenger.blocks.unreadline.a(blockId));
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.unreadline.c$c, reason: collision with other inner class name */
    static final class C1534c extends AbstractC7737t implements Function1<String, UnreadDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86560b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1534c(JsonParser jsonParser) {
            super(1);
            this.f86560b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final UnreadDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (UnreadDTO) this.f86560b.fromJson(state, UnreadDTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MBlockUnreadLineBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.unreadline.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f86561a = new d(2, ru.ozon.android.messenger.blocks.unreadline.b.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockUnreadLineBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.unreadline.b invoke(MBlockUnreadLineBinding mBlockUnreadLineBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockUnreadLineBinding binding = mBlockUnreadLineBinding;
            ru.ozon.android.messenger.framework.core.d references = dVar;
            Intrinsics.checkNotNullParameter(binding, "p0");
            Intrinsics.checkNotNullParameter(references, "p1");
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(references, "references");
            return new ru.ozon.android.messenger.blocks.unreadline.b(binding, references);
        }
    }

    public c(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86553a = b.f86559b;
        this.f86554b = a.f86558a;
        this.f86555c = d.f86561a;
        this.f86556d = new C1534c(deserializer);
        this.f86557e = a.AbstractC1563a.C1564a.f87356a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f86557e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockUnreadLineBinding> getInflate() {
        return this.f86554b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<UnreadDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.unreadline.a>> getMapper() {
        return this.f86553a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, UnreadDTO> getParser() {
        return this.f86556d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockUnreadLineBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.unreadline.a, MBlockUnreadLineBinding>> getViewProducer() {
        return this.f86555c;
    }
}
