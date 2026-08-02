package ru.ozon.android.messenger.blocks.messageimage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.messageimage.presentation.e;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MBlockImageBinding;

/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.core.viewmapper.a<ImageDTO, ru.ozon.android.messenger.blocks.messageimage.c, MBlockImageBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, ImageDTO> f85743a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.messageimage.a f85744b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockImageBinding> f85745c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final h<e> f85746d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f85747e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockImageBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f85748a = new a(3, MBlockImageBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockImageBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockImageBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockImageBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, ImageDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85749b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f85749b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ImageDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (ImageDTO) this.f85749b.fromJson(state, ImageDTO.class);
        }
    }

    /* synthetic */ class c extends C7735q implements Function2<MBlockImageBinding, ru.ozon.android.messenger.framework.core.d, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f85750a = new c(2, e.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockImageBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final e invoke(MBlockImageBinding mBlockImageBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockImageBinding p02 = mBlockImageBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new e(p02, p12);
        }
    }

    public d(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85743a = new b(deserializer);
        this.f85744b = new ru.ozon.android.messenger.blocks.messageimage.a();
        this.f85745c = a.f85748a;
        this.f85746d = c.f85750a;
        this.f85747e = new a.AbstractC1563a.b(28, 0, 0, null, null);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f85747e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockImageBinding> getInflate() {
        return this.f85745c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return this.f85744b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ImageDTO> getParser() {
        return this.f85743a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockImageBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.messageimage.c, MBlockImageBinding>> getViewProducer() {
        return (Function2) this.f85746d;
    }
}
