package ru.ozon.android.messenger.blocks.systemText.data;

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
import ru.ozon.android.messenger.utils.f;
import ru.ozon.app.android.messenger.databinding.MBlockSystemTextBinding;

/* loaded from: classes10.dex */
public final class b extends ru.ozon.android.messenger.framework.core.viewmapper.a<SystemTextDTO, ru.ozon.android.messenger.blocks.systemText.presentation.a, MBlockSystemTextBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockSystemTextBinding> f86485a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockSystemTextBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.systemText.presentation.a, MBlockSystemTextBinding>> f86486b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f86487c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, SystemTextDTO> f86488d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f86489e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockSystemTextBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f86490a = new a(3, MBlockSystemTextBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockSystemTextBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockSystemTextBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockSystemTextBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.systemText.data.b$b, reason: collision with other inner class name */
    static final class C1533b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.systemText.data.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1533b f86491b = new C1533b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.systemText.data.a invoke() {
            return new ru.ozon.android.messenger.blocks.systemText.data.a();
        }
    }

    /* synthetic */ class c extends C7735q implements Function1<String, SystemTextDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final SystemTextDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (SystemTextDTO) ((JsonParser) this.receiver).fromJson(p02, SystemTextDTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MBlockSystemTextBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.systemText.presentation.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f86492a = new d(2, ru.ozon.android.messenger.blocks.systemText.presentation.b.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockSystemTextBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.systemText.presentation.b invoke(MBlockSystemTextBinding mBlockSystemTextBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockSystemTextBinding binding = mBlockSystemTextBinding;
            ru.ozon.android.messenger.framework.core.d references = dVar;
            Intrinsics.checkNotNullParameter(binding, "p0");
            Intrinsics.checkNotNullParameter(references, "p1");
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(references, "references");
            return new ru.ozon.android.messenger.blocks.systemText.presentation.b(binding, references);
        }
    }

    public b(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86485a = a.f86490a;
        this.f86486b = d.f86492a;
        this.f86487c = a.AbstractC1563a.C1564a.f87356a;
        this.f86488d = new c(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f86489e = f.b(C1533b.f86491b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f86487c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockSystemTextBinding> getInflate() {
        return this.f86485a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<SystemTextDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.systemText.presentation.a>> getMapper() {
        return (Function2) this.f86489e.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, SystemTextDTO> getParser() {
        return this.f86488d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockSystemTextBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.systemText.presentation.a, MBlockSystemTextBinding>> getViewProducer() {
        return this.f86486b;
    }
}
