package ru.ozon.android.messenger.blocks.replymessageblock;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MViewReplyMessageBlockBinding;

/* loaded from: classes10.dex */
public final class b extends ru.ozon.android.messenger.framework.core.viewmapper.a<ReplyMessageBlockDTO, ru.ozon.android.messenger.blocks.replymessageblock.a, MViewReplyMessageBlockBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f86363a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, ReplyMessageBlockDTO> f86364b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<ReplyMessageBlockDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.replymessageblock.a>> f86365c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MViewReplyMessageBlockBinding> f86366d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<MViewReplyMessageBlockBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.replymessageblock.a, MViewReplyMessageBlockBinding>> f86367e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f86368f;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MViewReplyMessageBlockBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f86369a = new a(3, MViewReplyMessageBlockBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MViewReplyMessageBlockBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MViewReplyMessageBlockBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MViewReplyMessageBlockBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.replymessageblock.b$b, reason: collision with other inner class name */
    static final class C1529b extends AbstractC7737t implements Function2<ReplyMessageBlockDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.replymessageblock.a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1529b f86370b = new C1529b(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends ru.ozon.android.messenger.blocks.replymessageblock.a> invoke(ReplyMessageBlockDTO replyMessageBlockDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            ReplyMessageBlockDTO state = replyMessageBlockDTO;
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            return C7714v.a0(new ru.ozon.android.messenger.blocks.replymessageblock.a(blockId, state));
        }
    }

    static final class c extends AbstractC7737t implements Function1<String, ReplyMessageBlockDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86371b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JsonParser jsonParser) {
            super(1);
            this.f86371b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ReplyMessageBlockDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (ReplyMessageBlockDTO) this.f86371b.fromJson(state, ReplyMessageBlockDTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MViewReplyMessageBlockBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.replymessageblock.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f86372a = new d(2, ru.ozon.android.messenger.blocks.replymessageblock.c.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MViewReplyMessageBlockBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.replymessageblock.c invoke(MViewReplyMessageBlockBinding mViewReplyMessageBlockBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MViewReplyMessageBlockBinding p02 = mViewReplyMessageBlockBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.replymessageblock.c(p02, p12);
        }
    }

    public b(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86363a = K.f71697a;
        this.f86364b = new c(deserializer);
        this.f86365c = C1529b.f86370b;
        this.f86366d = a.f86369a;
        this.f86367e = d.f86372a;
        this.f86368f = new a.AbstractC1563a.b(28, 0, 0, null, null);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f86368f;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MViewReplyMessageBlockBinding> getInflate() {
        return this.f86366d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<ReplyMessageBlockDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.replymessageblock.a>> getMapper() {
        return this.f86365c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ReplyMessageBlockDTO> getParser() {
        return this.f86364b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return this.f86363a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MViewReplyMessageBlockBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.replymessageblock.a, MViewReplyMessageBlockBinding>> getViewProducer() {
        return this.f86367e;
    }
}
