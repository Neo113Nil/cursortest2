package ru.ozon.android.messenger.blocks.order;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.utils.e;
import ru.ozon.android.messenger.utils.f;
import ru.ozon.app.android.messenger.databinding.MBlockOrderBinding;

/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.core.viewmapper.a<OrderDTO, ru.ozon.android.messenger.blocks.order.b, MBlockOrderBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockOrderBinding> f85971a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockOrderBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.order.b, MBlockOrderBinding>> f85972b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f85973c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, OrderDTO> f85974d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f85975e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockOrderBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f85976a = new a(3, MBlockOrderBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockOrderBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockOrderBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockOrderBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.order.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f85977b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.order.a invoke() {
            return new ru.ozon.android.messenger.blocks.order.a();
        }
    }

    static final class c extends AbstractC7737t implements Function1<String, OrderDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85978b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JsonParser jsonParser) {
            super(1);
            this.f85978b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final OrderDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (OrderDTO) this.f85978b.fromJson(state, OrderDTO.class);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.order.d$d, reason: collision with other inner class name */
    /* synthetic */ class C1515d extends C7735q implements Function2<MBlockOrderBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.order.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1515d f85979a = new C1515d(2, ru.ozon.android.messenger.blocks.order.c.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockOrderBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.order.c invoke(MBlockOrderBinding mBlockOrderBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockOrderBinding p02 = mBlockOrderBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.order.c(p02, p12);
        }
    }

    public d(@NotNull JsonParser deserializer) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85971a = a.f85976a;
        this.f85972b = C1515d.f85979a;
        i11 = e.f91908e;
        Integer valueOf = Integer.valueOf(i11);
        i12 = e.f91908e;
        this.f85973c = new a.AbstractC1563a.b(24, valueOf, Integer.valueOf(i12), null, null);
        this.f85974d = new c(deserializer);
        this.f85975e = f.b(b.f85977b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f85973c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockOrderBinding> getInflate() {
        return this.f85971a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<OrderDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.order.b>> getMapper() {
        return (Function2) this.f85975e.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, OrderDTO> getParser() {
        return this.f85974d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockOrderBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.order.b, MBlockOrderBinding>> getViewProducer() {
        return this.f85972b;
    }
}
