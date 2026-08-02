package ru.ozon.android.messenger.blocks.paginationerror;

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
import kotlin.reflect.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MBlockPaginationErrorBinding;

/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.core.viewmapper.a<PaginationErrorDTO, ru.ozon.android.messenger.blocks.paginationerror.a, MBlockPaginationErrorBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<PaginationErrorDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.paginationerror.a>> f86026a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockPaginationErrorBinding> f86027b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final h<ru.ozon.android.messenger.blocks.paginationerror.b> f86028c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, PaginationErrorDTO> f86029d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f86030e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockPaginationErrorBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f86031a = new a(3, MBlockPaginationErrorBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockPaginationErrorBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockPaginationErrorBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockPaginationErrorBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function2<PaginationErrorDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.paginationerror.a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f86032b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends ru.ozon.android.messenger.blocks.paginationerror.a> invoke(PaginationErrorDTO paginationErrorDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            PaginationErrorDTO state = paginationErrorDTO;
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            return C7714v.a0(new ru.ozon.android.messenger.blocks.paginationerror.a(blockId, state.getType()));
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.paginationerror.c$c, reason: collision with other inner class name */
    static final class C1516c extends AbstractC7737t implements Function1<String, PaginationErrorDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86033b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1516c(JsonParser jsonParser) {
            super(1);
            this.f86033b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final PaginationErrorDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (PaginationErrorDTO) this.f86033b.fromJson(state, PaginationErrorDTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MBlockPaginationErrorBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.paginationerror.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f86034a = new d(2, ru.ozon.android.messenger.blocks.paginationerror.b.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockPaginationErrorBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.paginationerror.b invoke(MBlockPaginationErrorBinding mBlockPaginationErrorBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockPaginationErrorBinding p02 = mBlockPaginationErrorBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.paginationerror.b(p02, p12);
        }
    }

    public c(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86026a = b.f86032b;
        this.f86027b = a.f86031a;
        this.f86028c = d.f86034a;
        this.f86029d = new C1516c(deserializer);
        this.f86030e = a.AbstractC1563a.C1564a.f87356a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f86030e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockPaginationErrorBinding> getInflate() {
        return this.f86027b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<PaginationErrorDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.paginationerror.a>> getMapper() {
        return this.f86026a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, PaginationErrorDTO> getParser() {
        return this.f86029d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockPaginationErrorBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.paginationerror.a, MBlockPaginationErrorBinding>> getViewProducer() {
        return (Function2) this.f86028c;
    }
}
