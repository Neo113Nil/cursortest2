package ru.ozon.android.messenger.blocks.cell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.collections.C7714v;
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
import ru.ozon.app.android.messenger.databinding.MOnlyNewBlockCellBinding;

/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.core.viewmapper.a<CellDTO, ru.ozon.android.messenger.blocks.cell.c, MOnlyNewBlockCellBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f84462a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MOnlyNewBlockCellBinding> f84463b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final h<g> f84464c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, CellDTO> f84465d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<CellDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.cell.c>> f84466e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f84467f;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MOnlyNewBlockCellBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f84468a = new a(3, MOnlyNewBlockCellBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MOnlyNewBlockCellBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MOnlyNewBlockCellBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MOnlyNewBlockCellBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function2<CellDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.cell.c>> {
        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends ru.ozon.android.messenger.blocks.cell.c> invoke(CellDTO cellDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            CellDTO state = cellDTO;
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            return C7714v.a0(new ru.ozon.android.messenger.blocks.cell.c(blockId, ru.ozon.android.messenger.utils.c.d(state.getTextRes(), d.this.f84462a), state.getDefaultValue()));
        }
    }

    static final class c extends AbstractC7737t implements Function1<String, CellDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f84470b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JsonParser jsonParser) {
            super(1);
            this.f84470b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CellDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (CellDTO) this.f84470b.fromJson(state, CellDTO.class);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.cell.d$d, reason: collision with other inner class name */
    /* synthetic */ class C1475d extends C7735q implements Function2<MOnlyNewBlockCellBinding, ru.ozon.android.messenger.framework.core.d, g> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1475d f84471a = new C1475d(2, g.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MOnlyNewBlockCellBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final g invoke(MOnlyNewBlockCellBinding mOnlyNewBlockCellBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MOnlyNewBlockCellBinding p02 = mOnlyNewBlockCellBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new g(p02, p12);
        }
    }

    public d(@NotNull Context context, @NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84462a = context;
        this.f84463b = a.f84468a;
        this.f84464c = C1475d.f84471a;
        this.f84465d = new c(deserializer);
        this.f84466e = new b();
        this.f84467f = a.AbstractC1563a.C1564a.f87356a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f84467f;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MOnlyNewBlockCellBinding> getInflate() {
        return this.f84463b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<CellDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.cell.c>> getMapper() {
        return this.f84466e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, CellDTO> getParser() {
        return this.f84465d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MOnlyNewBlockCellBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.cell.c, MOnlyNewBlockCellBinding>> getViewProducer() {
        return (Function2) this.f84464c;
    }
}
