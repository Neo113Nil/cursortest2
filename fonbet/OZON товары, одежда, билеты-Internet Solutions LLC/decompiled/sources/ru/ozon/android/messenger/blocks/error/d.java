package ru.ozon.android.messenger.blocks.error;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.utils.f;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.app.android.messenger.databinding.MBlockDisplayErrorBinding;

/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.core.viewmapper.a<ErrorDTO, ru.ozon.android.messenger.blocks.error.b, MBlockDisplayErrorBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, ErrorDTO> f85151a = c.f85158b;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f85152b = f.b(b.f85157b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockDisplayErrorBinding> f85153c = a.f85156a;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockDisplayErrorBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.error.b, MBlockDisplayErrorBinding>> f85154d = C1496d.f85159a;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f85155e = new a.AbstractC1563a.b(31, null, null, null, null);

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockDisplayErrorBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f85156a = new a(3, MBlockDisplayErrorBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockDisplayErrorBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockDisplayErrorBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockDisplayErrorBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.error.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f85157b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.error.a invoke() {
            return new ru.ozon.android.messenger.blocks.error.a();
        }
    }

    static final class c extends AbstractC7737t implements Function1<String, ErrorDTO> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f85158b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final ErrorDTO invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            return new ErrorDTO(R$string.messenger_error_state_parsing);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.error.d$d, reason: collision with other inner class name */
    /* synthetic */ class C1496d extends C7735q implements Function2<MBlockDisplayErrorBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.error.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1496d f85159a = new C1496d(2, ru.ozon.android.messenger.blocks.error.c.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockDisplayErrorBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.error.c invoke(MBlockDisplayErrorBinding mBlockDisplayErrorBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockDisplayErrorBinding binding = mBlockDisplayErrorBinding;
            ru.ozon.android.messenger.framework.core.d references = dVar;
            Intrinsics.checkNotNullParameter(binding, "p0");
            Intrinsics.checkNotNullParameter(references, "p1");
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(references, "references");
            return new ru.ozon.android.messenger.blocks.error.c(binding, references);
        }
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f85155e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockDisplayErrorBinding> getInflate() {
        return this.f85153c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.error.a) this.f85152b.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ErrorDTO> getParser() {
        return this.f85151a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockDisplayErrorBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.error.b, MBlockDisplayErrorBinding>> getViewProducer() {
        return this.f85154d;
    }
}
