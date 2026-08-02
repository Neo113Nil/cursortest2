package ru.ozon.android.messenger.blocks.recommendations;

import C.o0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.recommendations.RecommendationsDTO;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.databinding.MBlockRecomendationsBinding;

/* loaded from: classes10.dex */
public final class f extends ru.ozon.android.messenger.framework.core.viewmapper.a<RecommendationsDTO, ru.ozon.android.messenger.blocks.recommendations.e, MBlockRecomendationsBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockRecomendationsBinding> f86294a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<ru.ozon.android.messenger.blocks.recommendations.presentation.e> f86295b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<String, RecommendationsDTO> f86296c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f86297d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<d.w.a, ru.ozon.android.messenger.blocks.recommendations.e, ru.ozon.android.messenger.blocks.recommendations.e> f86298e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f86299f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<Class<? extends d.w.a>> f86300g;

    public static final class a implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f86301a;

        public a(@NotNull String itemId) {
            Intrinsics.checkNotNullParameter(itemId, "itemId");
            this.f86301a = itemId;
        }

        @NotNull
        public final String a() {
            return this.f86301a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f86301a, ((a) obj).f86301a);
        }

        public final int hashCode() {
            return this.f86301a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("BlockUpdate(itemId="), this.f86301a, ")");
        }
    }

    /* synthetic */ class b extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockRecomendationsBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f86302a = new b(3, MBlockRecomendationsBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockRecomendationsBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockRecomendationsBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockRecomendationsBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class c extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.recommendations.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f86303b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.recommendations.d invoke() {
            return new ru.ozon.android.messenger.blocks.recommendations.d();
        }
    }

    static final class d extends AbstractC7737t implements Function1<String, RecommendationsDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86304b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(JsonParser jsonParser) {
            super(1);
            this.f86304b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final RecommendationsDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (RecommendationsDTO) this.f86304b.fromJson(state, RecommendationsDTO.class);
        }
    }

    static final class e extends AbstractC7737t implements Function2<d.w.a, ru.ozon.android.messenger.blocks.recommendations.e, ru.ozon.android.messenger.blocks.recommendations.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f86305b = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.recommendations.e invoke(d.w.a aVar, ru.ozon.android.messenger.blocks.recommendations.e eVar) {
            d.w.a update = aVar;
            ru.ozon.android.messenger.blocks.recommendations.e oldVO = eVar;
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(oldVO, "oldVO");
            if ((update instanceof a) && Intrinsics.d(((a) update).a(), ru.ozon.android.messenger.framework.presentation.models.h.b(oldVO))) {
                return ru.ozon.android.messenger.blocks.recommendations.e.a(oldVO);
            }
            return null;
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.recommendations.f$f, reason: collision with other inner class name */
    /* synthetic */ class C1526f extends C7735q implements Function2<MBlockRecomendationsBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.recommendations.presentation.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1526f f86306a = new C1526f(2, ru.ozon.android.messenger.blocks.recommendations.presentation.e.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockRecomendationsBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.recommendations.presentation.e invoke(MBlockRecomendationsBinding mBlockRecomendationsBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockRecomendationsBinding p02 = mBlockRecomendationsBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.recommendations.presentation.e(p02, p12);
        }
    }

    public f(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86294a = b.f86302a;
        this.f86295b = C1526f.f86306a;
        this.f86296c = new d(deserializer);
        this.f86297d = ru.ozon.android.messenger.utils.f.b(c.f86303b);
        this.f86298e = e.f86305b;
        this.f86299f = new a.AbstractC1563a.b(23, null, null, Integer.valueOf(R$color.bg_primary), null);
        this.f86300g = C7714v.a0(a.class);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final boolean canMap(Object obj) {
        String state;
        if (obj instanceof ru.ozon.android.messenger.framework.presentation.models.e) {
            ru.ozon.android.messenger.framework.presentation.models.e eVar = (ru.ozon.android.messenger.framework.presentation.models.e) obj;
            return (eVar.b() instanceof ru.ozon.android.messenger.blocks.recommendations.e) && ((ru.ozon.android.messenger.blocks.recommendations.e) eVar.b()).f() == RecommendationsDTO.a.MESSAGE;
        }
        if (obj instanceof BlockDTO) {
            BlockDTO blockDTO = obj != null ? (BlockDTO) obj : null;
            if (blockDTO != null && (state = blockDTO.getState()) != null) {
                try {
                    Object invoke = ((d) this.f86296c).invoke(state);
                    RecommendationsDTO recommendationsDTO = invoke instanceof RecommendationsDTO ? (RecommendationsDTO) invoke : null;
                    if ((recommendationsDTO != null ? recommendationsDTO.getPlace() : null) == RecommendationsDTO.a.MESSAGE) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f86299f;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockRecomendationsBinding> getInflate() {
        return this.f86294a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.recommendations.d) this.f86297d.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, RecommendationsDTO> getParser() {
        return this.f86296c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return this.f86300g;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<d.w.a, ru.ozon.android.messenger.blocks.recommendations.e, ru.ozon.android.messenger.blocks.recommendations.e> getUpdateConsumer() {
        return this.f86298e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockRecomendationsBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.recommendations.e, MBlockRecomendationsBinding>> getViewProducer() {
        return (Function2) this.f86295b;
    }
}
