package ru.ozon.android.messenger.blocks.productshelf;

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
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.databinding.MBlockProductShelfBinding;

/* loaded from: classes10.dex */
public final class j extends ru.ozon.android.messenger.framework.core.viewmapper.a<ProductShelfDTO, i, MBlockProductShelfBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockProductShelfBinding> f86075a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.h<ru.ozon.android.messenger.blocks.productshelf.b> f86076b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f86077c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, ProductShelfDTO> f86078d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f86079e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<Class<? extends d.w.a>> f86080f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function2<d.w.a, i, i> f86081g;

    public static final class a implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f86082a;

        public a(@NotNull String itemId) {
            Intrinsics.checkNotNullParameter(itemId, "itemId");
            this.f86082a = itemId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f86082a, ((a) obj).f86082a);
        }

        public final int hashCode() {
            return this.f86082a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("BlockUpdate(itemId="), this.f86082a, ")");
        }
    }

    /* synthetic */ class b extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockProductShelfBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f86083a = new b(3, MBlockProductShelfBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockProductShelfBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockProductShelfBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockProductShelfBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class c extends AbstractC7737t implements Function0<h> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f86084b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final h invoke() {
            return new h();
        }
    }

    static final class d extends AbstractC7737t implements Function1<String, ProductShelfDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86085b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(JsonParser jsonParser) {
            super(1);
            this.f86085b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ProductShelfDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (ProductShelfDTO) this.f86085b.fromJson(state, ProductShelfDTO.class);
        }
    }

    static final class e extends AbstractC7737t implements Function2<d.w.a, i, i> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f86086b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ru.ozon.android.messenger.framework.navigation.controller.a aVar) {
            super(2);
            this.f86086b = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final i invoke(d.w.a aVar, i iVar) {
            d.w.a update = aVar;
            i oldVO = iVar;
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(oldVO, "oldVO");
            if (!(update instanceof a)) {
                return null;
            }
            this.f86086b.q(ru.ozon.android.messenger.framework.navigation.action.b.c(oldVO.i()));
            return oldVO;
        }
    }

    /* synthetic */ class f extends C7735q implements Function2<MBlockProductShelfBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.productshelf.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f86087a = new f(2, ru.ozon.android.messenger.blocks.productshelf.b.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockProductShelfBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.productshelf.b invoke(MBlockProductShelfBinding mBlockProductShelfBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockProductShelfBinding p02 = mBlockProductShelfBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.productshelf.b(p02, p12);
        }
    }

    public j(@NotNull JsonParser deserializer, @NotNull ru.ozon.android.messenger.framework.navigation.controller.a controller) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f86075a = b.f86083a;
        this.f86076b = f.f86087a;
        this.f86077c = new a.AbstractC1563a.b(7, null, null, Integer.valueOf(R$color.bg_primary), Integer.valueOf(R$color.bg_opaque_action_secondary));
        this.f86078d = new d(deserializer);
        this.f86079e = ru.ozon.android.messenger.utils.f.b(c.f86084b);
        this.f86080f = C7714v.a0(a.class);
        this.f86081g = new e(controller);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f86077c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockProductShelfBinding> getInflate() {
        return this.f86075a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<ProductShelfDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<i>> getMapper() {
        return (Function2) this.f86079e.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ProductShelfDTO> getParser() {
        return this.f86078d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return this.f86080f;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<d.w.a, i, i> getUpdateConsumer() {
        return this.f86081g;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockProductShelfBinding, ru.ozon.android.messenger.framework.core.d, q<i, MBlockProductShelfBinding>> getViewProducer() {
        return (Function2) this.f86076b;
    }
}
