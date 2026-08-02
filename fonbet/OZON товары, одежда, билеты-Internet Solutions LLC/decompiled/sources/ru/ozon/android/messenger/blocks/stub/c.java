package ru.ozon.android.messenger.blocks.stub;

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
import ru.ozon.app.android.messenger.databinding.MBlockStubBinding;

/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.core.viewmapper.a<StubDTO, ru.ozon.android.messenger.blocks.stub.a, MBlockStubBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<StubDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.stub.a>> f86476a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockStubBinding> f86477b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockStubBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.stub.a, MBlockStubBinding>> f86478c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, StubDTO> f86479d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f86480e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockStubBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f86481a = new a(3, MBlockStubBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockStubBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockStubBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockStubBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function2<StubDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.stub.a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f86482b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends ru.ozon.android.messenger.blocks.stub.a> invoke(StubDTO stubDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(stubDTO, "<unused var>");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            return C7714v.a0(new ru.ozon.android.messenger.blocks.stub.a(blockId));
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.stub.c$c, reason: collision with other inner class name */
    static final class C1532c extends AbstractC7737t implements Function1<String, StubDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86483b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1532c(JsonParser jsonParser) {
            super(1);
            this.f86483b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final StubDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (StubDTO) this.f86483b.fromJson(state, StubDTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MBlockStubBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.stub.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f86484a = new d(2, ru.ozon.android.messenger.blocks.stub.b.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockStubBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.stub.b invoke(MBlockStubBinding mBlockStubBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockStubBinding binding = mBlockStubBinding;
            ru.ozon.android.messenger.framework.core.d references = dVar;
            Intrinsics.checkNotNullParameter(binding, "p0");
            Intrinsics.checkNotNullParameter(references, "p1");
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(references, "references");
            return new ru.ozon.android.messenger.blocks.stub.b(binding, references);
        }
    }

    public c(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86476a = b.f86482b;
        this.f86477b = a.f86481a;
        this.f86478c = d.f86484a;
        this.f86479d = new C1532c(deserializer);
        this.f86480e = a.AbstractC1563a.C1564a.f87356a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f86480e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockStubBinding> getInflate() {
        return this.f86477b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<StubDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.stub.a>> getMapper() {
        return this.f86476a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, StubDTO> getParser() {
        return this.f86479d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockStubBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.stub.a, MBlockStubBinding>> getViewProducer() {
        return this.f86478c;
    }
}
