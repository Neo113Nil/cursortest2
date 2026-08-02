package ru.ozon.android.messenger.blocks.rateoperator;

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
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.databinding.MBlockRateOperatorMessageBinding;

/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.core.viewmapper.a<RateOperatorDTO, ru.ozon.android.messenger.blocks.rateoperator.b, MBlockRateOperatorMessageBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockRateOperatorMessageBinding> f86233a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<ru.ozon.android.messenger.blocks.rateoperator.message.a> f86234b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Class<a>> f86235c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<d.w.a, ru.ozon.android.messenger.blocks.rateoperator.b, ru.ozon.android.messenger.blocks.rateoperator.b> f86236d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<String, RateOperatorDTO> f86237e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f86238f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f86239g;

    public static final class a implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.blocks.rateoperator.message.c f86240a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f86241b;

        public a(@NotNull ru.ozon.android.messenger.blocks.rateoperator.message.c isSuccess, @NotNull String rateOperatorId) {
            Intrinsics.checkNotNullParameter(isSuccess, "isSuccess");
            Intrinsics.checkNotNullParameter(rateOperatorId, "rateOperatorId");
            this.f86240a = isSuccess;
            this.f86241b = rateOperatorId;
        }

        @NotNull
        public final String a() {
            return this.f86241b;
        }

        @NotNull
        public final ru.ozon.android.messenger.blocks.rateoperator.message.c b() {
            return this.f86240a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f86240a, aVar.f86240a) && Intrinsics.d(this.f86241b, aVar.f86241b);
        }

        public final int hashCode() {
            return this.f86241b.hashCode() + (this.f86240a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "UpdateState(isSuccess=" + this.f86240a + ", rateOperatorId=" + this.f86241b + ")";
        }
    }

    /* synthetic */ class b extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockRateOperatorMessageBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f86242a = new b(3, MBlockRateOperatorMessageBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockRateOperatorMessageBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockRateOperatorMessageBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockRateOperatorMessageBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.rateoperator.c$c, reason: collision with other inner class name */
    static final class C1523c extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.rateoperator.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1523c f86243b = new C1523c(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.rateoperator.a invoke() {
            return new ru.ozon.android.messenger.blocks.rateoperator.a();
        }
    }

    static final class d extends AbstractC7737t implements Function1<String, RateOperatorDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(JsonParser jsonParser) {
            super(1);
            this.f86244b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final RateOperatorDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (RateOperatorDTO) this.f86244b.fromJson(state, RateOperatorDTO.class);
        }
    }

    static final class e extends AbstractC7737t implements Function2<d.w.a, ru.ozon.android.messenger.blocks.rateoperator.b, ru.ozon.android.messenger.blocks.rateoperator.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f86245b = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.rateoperator.b invoke(d.w.a aVar, ru.ozon.android.messenger.blocks.rateoperator.b bVar) {
            d.w.a update = aVar;
            ru.ozon.android.messenger.blocks.rateoperator.b oldVO = bVar;
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(oldVO, "oldVO");
            if (!(update instanceof a)) {
                return null;
            }
            a aVar2 = (a) update;
            if (Intrinsics.d(oldVO.getBlockId().toString(), aVar2.a())) {
                return ru.ozon.android.messenger.blocks.rateoperator.b.a(oldVO, 0, aVar2.b(), 255);
            }
            return null;
        }
    }

    /* synthetic */ class f extends C7735q implements Function2<MBlockRateOperatorMessageBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.rateoperator.message.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f86246a = new f(2, ru.ozon.android.messenger.blocks.rateoperator.message.a.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockRateOperatorMessageBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.rateoperator.message.a invoke(MBlockRateOperatorMessageBinding mBlockRateOperatorMessageBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockRateOperatorMessageBinding p02 = mBlockRateOperatorMessageBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.rateoperator.message.a(p02, p12);
        }
    }

    public c(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86233a = b.f86242a;
        this.f86234b = f.f86246a;
        this.f86235c = C7714v.a0(a.class);
        this.f86236d = e.f86245b;
        this.f86237e = new d(deserializer);
        this.f86238f = ru.ozon.android.messenger.utils.f.b(C1523c.f86243b);
        this.f86239g = new a.AbstractC1563a.b(20, 0, 0, Integer.valueOf(R$color.bg_primary), null);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f86239g;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockRateOperatorMessageBinding> getInflate() {
        return this.f86233a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.rateoperator.a) this.f86238f.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, RateOperatorDTO> getParser() {
        return this.f86237e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<a>> getSupportedUpdateKeys() {
        return this.f86235c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<d.w.a, ru.ozon.android.messenger.blocks.rateoperator.b, ru.ozon.android.messenger.blocks.rateoperator.b> getUpdateConsumer() {
        return this.f86236d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockRateOperatorMessageBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.rateoperator.b, MBlockRateOperatorMessageBinding>> getViewProducer() {
        return (Function2) this.f86234b;
    }
}
