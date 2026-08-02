package ru.ozon.android.messenger.blocks.loading;

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
import ru.ozon.app.android.messenger.databinding.MBlockLoadingBinding;

/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.core.viewmapper.a<LoadingDTO, ru.ozon.android.messenger.blocks.loading.a, MBlockLoadingBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<LoadingDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.loading.a>> f85682a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockLoadingBinding> f85683b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockLoadingBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.loading.a, MBlockLoadingBinding>> f85684c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, LoadingDTO> f85685d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f85686e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockLoadingBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f85687a = new a(3, MBlockLoadingBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockLoadingBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockLoadingBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockLoadingBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function2<LoadingDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.loading.a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f85688b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends ru.ozon.android.messenger.blocks.loading.a> invoke(LoadingDTO loadingDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(loadingDTO, "<unused var>");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            return C7714v.a0(new ru.ozon.android.messenger.blocks.loading.a(blockId));
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.loading.c$c, reason: collision with other inner class name */
    static final class C1508c extends AbstractC7737t implements Function1<String, LoadingDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85689b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1508c(JsonParser jsonParser) {
            super(1);
            this.f85689b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final LoadingDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (LoadingDTO) this.f85689b.fromJson(state, LoadingDTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MBlockLoadingBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.loading.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f85690a = new d(2, ru.ozon.android.messenger.blocks.loading.b.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockLoadingBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.loading.b invoke(MBlockLoadingBinding mBlockLoadingBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockLoadingBinding binding = mBlockLoadingBinding;
            ru.ozon.android.messenger.framework.core.d references = dVar;
            Intrinsics.checkNotNullParameter(binding, "p0");
            Intrinsics.checkNotNullParameter(references, "p1");
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(references, "references");
            return new ru.ozon.android.messenger.blocks.loading.b(binding, references);
        }
    }

    public c(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85682a = b.f85688b;
        this.f85683b = a.f85687a;
        this.f85684c = d.f85690a;
        this.f85685d = new C1508c(deserializer);
        this.f85686e = a.AbstractC1563a.C1564a.f87356a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f85686e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockLoadingBinding> getInflate() {
        return this.f85683b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<LoadingDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.loading.a>> getMapper() {
        return this.f85682a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, LoadingDTO> getParser() {
        return this.f85685d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockLoadingBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.loading.a, MBlockLoadingBinding>> getViewProducer() {
        return this.f85684c;
    }
}
