package ru.ozon.android.messenger.blocks.showTextButton;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MBlockShowTextButtonBinding;

/* loaded from: classes10.dex */
public final class p extends ru.ozon.android.messenger.framework.core.viewmapper.a<ShowTextButtonDTO, l, MBlockShowTextButtonBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, ShowTextButtonDTO> f86417a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f86418b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockShowTextButtonBinding> f86419c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.h<o> f86420d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f86421e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockShowTextButtonBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f86422a = new a(3, MBlockShowTextButtonBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockShowTextButtonBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockShowTextButtonBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockShowTextButtonBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, ShowTextButtonDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86423b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f86423b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ShowTextButtonDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (ShowTextButtonDTO) this.f86423b.fromJson(state, ShowTextButtonDTO.class);
        }
    }

    /* synthetic */ class c extends C7735q implements Function2<MBlockShowTextButtonBinding, ru.ozon.android.messenger.framework.core.d, o> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f86424a = new c(2, o.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockShowTextButtonBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final o invoke(MBlockShowTextButtonBinding mBlockShowTextButtonBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockShowTextButtonBinding p02 = mBlockShowTextButtonBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new o(p02, p12);
        }
    }

    public p(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86417a = new b(deserializer);
        this.f86418b = new j();
        this.f86419c = a.f86422a;
        this.f86420d = c.f86424a;
        this.f86421e = new a.AbstractC1563a.b(28, 0, 0, null, null);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f86421e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockShowTextButtonBinding> getInflate() {
        return this.f86419c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return this.f86418b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ShowTextButtonDTO> getParser() {
        return this.f86417a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockShowTextButtonBinding, ru.ozon.android.messenger.framework.core.d, q<l, MBlockShowTextButtonBinding>> getViewProducer() {
        return (Function2) this.f86420d;
    }
}
