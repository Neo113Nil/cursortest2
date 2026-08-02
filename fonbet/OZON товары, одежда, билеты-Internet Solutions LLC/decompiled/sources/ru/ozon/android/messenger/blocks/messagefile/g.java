package ru.ozon.android.messenger.blocks.messagefile;

import We.E;
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
import qj.C9067a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MBlockFileBinding;

/* loaded from: classes10.dex */
public final class g extends ru.ozon.android.messenger.framework.core.viewmapper.a<FileDTO, ru.ozon.android.messenger.blocks.messagefile.c, MBlockFileBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final E f85716a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9067a f85717b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Class<? extends d.w.a>> f85718c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<d.w.a, ru.ozon.android.messenger.blocks.messagefile.c, ru.ozon.android.messenger.blocks.messagefile.c> f85719d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<String, FileDTO> f85720e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f85721f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockFileBinding> f85722g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockFileBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.messagefile.c, MBlockFileBinding>> f85723h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f85724i;

    public static final class a implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f85725a;

        /* renamed from: b, reason: collision with root package name */
        private final String f85726b;

        public a(boolean z11, String str) {
            this.f85725a = z11;
            this.f85726b = str;
        }

        public final String a() {
            return this.f85726b;
        }

        public final boolean b() {
            return this.f85725a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f85725a == aVar.f85725a && Intrinsics.d(this.f85726b, aVar.f85726b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.f85725a) * 31;
            String str = this.f85726b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            return "RequestPermissionUpdate(isPermissionGranted=" + this.f85725a + ", id=" + this.f85726b + ")";
        }
    }

    /* synthetic */ class b extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockFileBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f85727a = new b(3, MBlockFileBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockFileBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockFileBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockFileBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class c extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.messagefile.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f85728b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.messagefile.a invoke() {
            return new ru.ozon.android.messenger.blocks.messagefile.a();
        }
    }

    static final class d extends AbstractC7737t implements Function1<String, FileDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85729b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(JsonParser jsonParser) {
            super(1);
            this.f85729b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final FileDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (FileDTO) this.f85729b.fromJson(state, FileDTO.class);
        }
    }

    static final class e extends AbstractC7737t implements Function2<d.w.a, ru.ozon.android.messenger.blocks.messagefile.c, ru.ozon.android.messenger.blocks.messagefile.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f85730b = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.messagefile.c invoke(d.w.a aVar, ru.ozon.android.messenger.blocks.messagefile.c cVar) {
            d.w.a update = aVar;
            ru.ozon.android.messenger.blocks.messagefile.c oldVO = cVar;
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(oldVO, "oldVO");
            if (!(update instanceof a)) {
                return null;
            }
            a aVar2 = (a) update;
            return Intrinsics.d(aVar2.a(), oldVO.getBlockId().toString()) ? ru.ozon.android.messenger.blocks.messagefile.c.c(oldVO, null, null, aVar2.b(), 447) : oldVO;
        }
    }

    static final class f extends AbstractC7737t implements Function2<MBlockFileBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.messagefile.e> {
        f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.messagefile.e invoke(MBlockFileBinding mBlockFileBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockFileBinding binding = mBlockFileBinding;
            ru.ozon.android.messenger.framework.core.d references = dVar;
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(references, "references");
            g gVar = g.this;
            return new ru.ozon.android.messenger.blocks.messagefile.e(binding, references, gVar.f85716a, gVar.f85717b);
        }
    }

    public g(@NotNull JsonParser deserializer, @NotNull E okHttpClient, @NotNull C9067a networkInfoProvider) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        this.f85716a = okHttpClient;
        this.f85717b = networkInfoProvider;
        this.f85718c = C7714v.a0(a.class);
        this.f85719d = e.f85730b;
        this.f85720e = new d(deserializer);
        this.f85721f = ru.ozon.android.messenger.utils.f.b(c.f85728b);
        this.f85722g = b.f85727a;
        this.f85723h = new f();
        this.f85724i = new a.AbstractC1563a.b(31, null, null, null, null);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f85724i;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockFileBinding> getInflate() {
        return this.f85722g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.messagefile.a) this.f85721f.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, FileDTO> getParser() {
        return this.f85720e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return this.f85718c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<d.w.a, ru.ozon.android.messenger.blocks.messagefile.c, ru.ozon.android.messenger.blocks.messagefile.c> getUpdateConsumer() {
        return this.f85719d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockFileBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.messagefile.c, MBlockFileBinding>> getViewProducer() {
        return this.f85723h;
    }
}
