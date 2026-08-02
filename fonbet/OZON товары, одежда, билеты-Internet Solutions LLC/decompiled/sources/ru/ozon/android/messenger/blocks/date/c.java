package ru.ozon.android.messenger.blocks.date;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MBlockDateBinding;

/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.core.viewmapper.a<DateDTO, ru.ozon.android.messenger.blocks.date.a, MBlockDateBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<DateDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.date.a>> f85024a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockDateBinding> f85025b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockDateBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.date.a, MBlockDateBinding>> f85026c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, DateDTO> f85027d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f85028e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockDateBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f85029a = new a(3, MBlockDateBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockDateBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockDateBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockDateBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function2<DateDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.date.a>> {
        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends ru.ozon.android.messenger.blocks.date.a> invoke(DateDTO dateDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            DateDTO dto = dateDTO;
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(dto, "dto");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            DateTime date = dto.getDate();
            c.this.getClass();
            String str = date.s().equals(new DateTime().s()) ? "d MMMM" : "d MMMM YYYY";
            DateTime date2 = dto.getDate();
            DateTime date3 = dto.getDate();
            Locale locale = Locale.getDefault();
            date3.getClass();
            String g10 = org.joda.time.format.a.b(str).m(locale).g(date3);
            Intrinsics.checkNotNullExpressionValue(g10, "toString(...)");
            return C7714v.a0(new ru.ozon.android.messenger.blocks.date.a(blockId, date2, g10));
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.date.c$c, reason: collision with other inner class name */
    static final class C1489c extends AbstractC7737t implements Function1<String, DateDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85031b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1489c(JsonParser jsonParser) {
            super(1);
            this.f85031b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DateDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (DateDTO) this.f85031b.fromJson(state, DateDTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MBlockDateBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.date.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f85032a = new d(2, ru.ozon.android.messenger.blocks.date.b.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockDateBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.date.b invoke(MBlockDateBinding mBlockDateBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockDateBinding p02 = mBlockDateBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.date.b(p02, p12);
        }
    }

    public c(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85024a = new b();
        this.f85025b = a.f85029a;
        this.f85026c = d.f85032a;
        this.f85027d = new C1489c(deserializer);
        this.f85028e = a.AbstractC1563a.C1564a.f87356a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f85028e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockDateBinding> getInflate() {
        return this.f85025b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<DateDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.date.a>> getMapper() {
        return this.f85024a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, DateDTO> getParser() {
        return this.f85027d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockDateBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.date.a, MBlockDateBinding>> getViewProducer() {
        return this.f85026c;
    }
}
