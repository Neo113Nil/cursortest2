package ru.ozon.android.messenger.blocks.dangerousText;

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
import ru.ozon.app.android.messenger.databinding.MBlockDangerousTextBinding;

/* loaded from: classes10.dex */
public final class j extends ru.ozon.android.messenger.framework.core.viewmapper.a<DangerousTextDTO, e, MBlockDangerousTextBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, DangerousTextDTO> f85012a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f85013b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockDangerousTextBinding> f85014c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.h<f> f85015d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f85016e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockDangerousTextBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f85017a = new a(3, MBlockDangerousTextBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockDangerousTextBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockDangerousTextBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockDangerousTextBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, DangerousTextDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85018b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f85018b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DangerousTextDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (DangerousTextDTO) this.f85018b.fromJson(state, DangerousTextDTO.class);
        }
    }

    /* synthetic */ class c extends C7735q implements Function2<MBlockDangerousTextBinding, ru.ozon.android.messenger.framework.core.d, f> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f85019a = new c(2, f.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockDangerousTextBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final f invoke(MBlockDangerousTextBinding mBlockDangerousTextBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockDangerousTextBinding p02 = mBlockDangerousTextBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new f(p02, p12);
        }
    }

    public j(@NotNull JsonParser deserializer) {
        int i11;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85012a = new b(deserializer);
        this.f85013b = new d();
        this.f85014c = a.f85017a;
        this.f85015d = c.f85019a;
        i11 = ru.ozon.android.messenger.utils.e.f91908e;
        this.f85016e = new a.AbstractC1563a.b(28, Integer.valueOf(i11), 0, null, null);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f85016e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockDangerousTextBinding> getInflate() {
        return this.f85014c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return this.f85013b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, DangerousTextDTO> getParser() {
        return this.f85012a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockDangerousTextBinding, ru.ozon.android.messenger.framework.core.d, q<e, MBlockDangerousTextBinding>> getViewProducer() {
        return (Function2) this.f85015d;
    }
}
