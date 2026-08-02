package ru.ozon.android.messenger.blocks.ai.tapTags;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MBlockAiTapTagsBinding;

/* loaded from: classes10.dex */
public final class b extends ru.ozon.android.messenger.framework.core.viewmapper.a<TapTagsDTO, ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c, MBlockAiTapTagsBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JsonParser f84303a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockAiTapTagsBinding> f84304b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final h<ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.a> f84305c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, TapTagsDTO> f84306d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.ai.tapTags.a f84307e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f84308f;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockAiTapTagsBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f84309a = new a(3, MBlockAiTapTagsBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockAiTapTagsBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockAiTapTagsBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockAiTapTagsBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.ai.tapTags.b$b, reason: collision with other inner class name */
    /* synthetic */ class C1463b extends C7735q implements Function1<String, TapTagsDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final TapTagsDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (TapTagsDTO) ((JsonParser) this.receiver).fromJson(p02, TapTagsDTO.class);
        }
    }

    /* synthetic */ class c extends C7735q implements Function2<MBlockAiTapTagsBinding, d, ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f84310a = new c(2, ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.a.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockAiTapTagsBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.a invoke(MBlockAiTapTagsBinding mBlockAiTapTagsBinding, d dVar) {
            MBlockAiTapTagsBinding p02 = mBlockAiTapTagsBinding;
            d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.a(p02, p12);
        }
    }

    public b(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84303a = deserializer;
        this.f84304b = a.f84309a;
        this.f84305c = c.f84310a;
        this.f84306d = new C1463b(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f84307e = new ru.ozon.android.messenger.blocks.ai.tapTags.a();
        this.f84308f = a.AbstractC1563a.C1564a.f87356a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f84308f;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockAiTapTagsBinding> getInflate() {
        return this.f84304b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return this.f84307e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, TapTagsDTO> getParser() {
        return this.f84306d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockAiTapTagsBinding, d, q<ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c, MBlockAiTapTagsBinding>> getViewProducer() {
        return (Function2) this.f84305c;
    }
}
