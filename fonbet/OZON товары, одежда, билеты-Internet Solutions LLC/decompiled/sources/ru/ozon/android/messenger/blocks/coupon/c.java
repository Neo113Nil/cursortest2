package ru.ozon.android.messenger.blocks.coupon;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
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
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.databinding.MBlockCouponBinding;

/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.core.viewmapper.a<CouponDTO, ru.ozon.android.messenger.blocks.coupon.b, MBlockCouponBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockCouponBinding> f84907a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<ru.ozon.android.messenger.blocks.coupon.presentation.c> f84908b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<String, CouponDTO> f84909c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f84910d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f84911e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockCouponBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f84912a = new a(3, MBlockCouponBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockCouponBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockCouponBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockCouponBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.coupon.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f84913b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.coupon.a invoke() {
            return new ru.ozon.android.messenger.blocks.coupon.a();
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.coupon.c$c, reason: collision with other inner class name */
    static final class C1484c extends AbstractC7737t implements Function1<String, CouponDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f84914b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1484c(JsonParser jsonParser) {
            super(1);
            this.f84914b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CouponDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (CouponDTO) this.f84914b.fromJson(state, CouponDTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MBlockCouponBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.coupon.presentation.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f84915a = new d(2, ru.ozon.android.messenger.blocks.coupon.presentation.c.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockCouponBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.coupon.presentation.c invoke(MBlockCouponBinding mBlockCouponBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockCouponBinding p02 = mBlockCouponBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.coupon.presentation.c(p02, p12);
        }
    }

    public c(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84907a = a.f84912a;
        this.f84908b = d.f84915a;
        this.f84909c = new C1484c(deserializer);
        this.f84910d = ru.ozon.android.messenger.utils.f.b(b.f84913b);
        this.f84911e = new a.AbstractC1563a.b(20, 0, 0, Integer.valueOf(R$color.transparent), null);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f84911e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockCouponBinding> getInflate() {
        return this.f84907a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.coupon.a) this.f84910d.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, CouponDTO> getParser() {
        return this.f84909c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockCouponBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.coupon.b, MBlockCouponBinding>> getViewProducer() {
        return (Function2) this.f84908b;
    }
}
