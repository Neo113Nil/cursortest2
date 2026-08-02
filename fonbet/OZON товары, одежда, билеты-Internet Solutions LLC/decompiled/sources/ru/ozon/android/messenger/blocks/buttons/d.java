package ru.ozon.android.messenger.blocks.buttons;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.ArrayList;
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
import ru.ozon.app.android.messenger.databinding.MBlockButtonsBinding;

/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.core.viewmapper.a<ChatButtonsDTO, ru.ozon.android.messenger.blocks.buttons.f, MBlockButtonsBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Class<? extends d.w.a>> f84406a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<d.w.a, ru.ozon.android.messenger.blocks.buttons.f, ru.ozon.android.messenger.blocks.buttons.f> f84407b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockButtonsBinding> f84408c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final h<ru.ozon.android.messenger.blocks.buttons.presentation.e> f84409d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<String, ChatButtonsDTO> f84410e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f84411f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f84412g;

    public static final class a implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f84413a;

        public a(boolean z11) {
            this.f84413a = z11;
        }

        public final boolean a() {
            return this.f84413a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b BUTTONS_CHANGED;
        public static final b STATE_CHANGED;

        static {
            b bVar = new b("STATE_CHANGED", 0);
            STATE_CHANGED = bVar;
            b bVar2 = new b("BUTTONS_CHANGED", 1);
            BUTTONS_CHANGED = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* synthetic */ class c extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockButtonsBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f84414a = new c(3, MBlockButtonsBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockButtonsBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockButtonsBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockButtonsBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.buttons.d$d, reason: collision with other inner class name */
    static final class C1472d extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.buttons.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1472d f84415b = new C1472d(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.buttons.c invoke() {
            return new ru.ozon.android.messenger.blocks.buttons.c();
        }
    }

    static final class e extends AbstractC7737t implements Function1<String, ChatButtonsDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f84416b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(JsonParser jsonParser) {
            super(1);
            this.f84416b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatButtonsDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (ChatButtonsDTO) this.f84416b.fromJson(state, ChatButtonsDTO.class);
        }
    }

    static final class f extends AbstractC7737t implements Function2<d.w.a, ru.ozon.android.messenger.blocks.buttons.f, ru.ozon.android.messenger.blocks.buttons.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f84417b = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.buttons.f invoke(d.w.a aVar, ru.ozon.android.messenger.blocks.buttons.f fVar) {
            d.w.a update = aVar;
            ru.ozon.android.messenger.blocks.buttons.f oldVO = fVar;
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(oldVO, "oldVO");
            return !(update instanceof a) ? oldVO : ru.ozon.android.messenger.blocks.buttons.f.a(oldVO, ((a) update).a());
        }
    }

    /* synthetic */ class g extends C7735q implements Function2<MBlockButtonsBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.buttons.presentation.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f84418a = new g(2, ru.ozon.android.messenger.blocks.buttons.presentation.e.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockButtonsBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.buttons.presentation.e invoke(MBlockButtonsBinding mBlockButtonsBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockButtonsBinding p02 = mBlockButtonsBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.buttons.presentation.e(p02, p12);
        }
    }

    public d(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84406a = C7714v.a0(a.class);
        this.f84407b = f.f84417b;
        this.f84408c = c.f84414a;
        this.f84409d = g.f84418a;
        this.f84410e = new e(deserializer);
        this.f84411f = ru.ozon.android.messenger.utils.f.b(C1472d.f84415b);
        this.f84412g = new a.AbstractC1563a.b(28, 0, 0, null, null);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f84412g;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockButtonsBinding> getInflate() {
        return this.f84408c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.buttons.c) this.f84411f.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ChatButtonsDTO> getParser() {
        return this.f84410e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final List getPayloads(ru.ozon.android.messenger.blocks.buttons.f fVar, ru.ozon.android.messenger.blocks.buttons.f fVar2) {
        ru.ozon.android.messenger.blocks.buttons.f oldItem = fVar;
        ru.ozon.android.messenger.blocks.buttons.f newItem = fVar2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (oldItem.c() != newItem.c()) {
            arrayList.add(b.STATE_CHANGED);
        }
        if (!oldItem.b().equals(newItem.b())) {
            arrayList.add(b.BUTTONS_CHANGED);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return this.f84406a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<d.w.a, ru.ozon.android.messenger.blocks.buttons.f, ru.ozon.android.messenger.blocks.buttons.f> getUpdateConsumer() {
        return this.f84407b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockButtonsBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.buttons.f, MBlockButtonsBinding>> getViewProducer() {
        return (Function2) this.f84409d;
    }
}
