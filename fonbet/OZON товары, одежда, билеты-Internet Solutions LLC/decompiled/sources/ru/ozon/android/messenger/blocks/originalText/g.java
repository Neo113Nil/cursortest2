package ru.ozon.android.messenger.blocks.originalText;

import C.o0;
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
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.h;
import ru.ozon.app.android.messenger.databinding.MBlockOriginalTextBinding;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class g extends ru.ozon.android.messenger.framework.core.viewmapper.a<OriginalTextDTO, ru.ozon.android.messenger.blocks.originalText.f, MBlockOriginalTextBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, OriginalTextDTO> f86006a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.originalText.d f86007b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockOriginalTextBinding> f86008c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Class<? extends d.w.a>> f86009d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<d.w.a, ru.ozon.android.messenger.blocks.originalText.f, ru.ozon.android.messenger.blocks.originalText.f> f86010e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockOriginalTextBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.originalText.f, MBlockOriginalTextBinding>> f86011f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f86012g;

    public static final class a implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f86013a;

        /* renamed from: b, reason: collision with root package name */
        private final String f86014b;

        public a(String str, String str2) {
            this.f86013a = str;
            this.f86014b = str2;
        }

        public final String a() {
            return this.f86013a;
        }

        public final String b() {
            return this.f86014b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f86013a, aVar.f86013a) && Intrinsics.d(this.f86014b, aVar.f86014b);
        }

        public final int hashCode() {
            String str = this.f86013a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f86014b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OriginalTextError(blockId=");
            sb2.append(this.f86013a);
            sb2.append(", error=");
            return o0.c(sb2, this.f86014b, ")");
        }
    }

    public static final class b implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f86015a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDTO f86016b;

        public b(String str, TextDTO textDTO) {
            this.f86015a = str;
            this.f86016b = textDTO;
        }

        public final String a() {
            return this.f86015a;
        }

        public final TextDTO b() {
            return this.f86016b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f86015a, bVar.f86015a) && Intrinsics.d(this.f86016b, bVar.f86016b);
        }

        public final int hashCode() {
            String str = this.f86015a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            TextDTO textDTO = this.f86016b;
            return hashCode + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "OriginalTextUpdate(blockId=" + this.f86015a + ", originalText=" + this.f86016b + ")";
        }
    }

    /* synthetic */ class c extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockOriginalTextBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f86017a = new c(3, MBlockOriginalTextBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockOriginalTextBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockOriginalTextBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockOriginalTextBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class d extends AbstractC7737t implements Function1<String, OriginalTextDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86018b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(JsonParser jsonParser) {
            super(1);
            this.f86018b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final OriginalTextDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (OriginalTextDTO) this.f86018b.fromJson(state, OriginalTextDTO.class);
        }
    }

    static final class e extends AbstractC7737t implements Function2<d.w.a, ru.ozon.android.messenger.blocks.originalText.f, ru.ozon.android.messenger.blocks.originalText.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f86019b = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.originalText.f invoke(d.w.a aVar, ru.ozon.android.messenger.blocks.originalText.f fVar) {
            d.w.a update = aVar;
            ru.ozon.android.messenger.blocks.originalText.f oldVO = fVar;
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(oldVO, "oldVO");
            if (update instanceof b) {
                b bVar = (b) update;
                if (Intrinsics.d(h.b(oldVO), bVar.a())) {
                    return ru.ozon.android.messenger.blocks.originalText.f.a(oldVO, bVar.b(), null, 59);
                }
            } else if (update instanceof a) {
                a aVar2 = (a) update;
                if (Intrinsics.d(h.b(oldVO), aVar2.a())) {
                    return ru.ozon.android.messenger.blocks.originalText.f.a(oldVO, null, aVar2.b(), 55);
                }
            }
            return null;
        }
    }

    static final class f extends AbstractC7737t implements Function2<MBlockOriginalTextBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.originalText.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f86020b = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.originalText.c invoke(MBlockOriginalTextBinding mBlockOriginalTextBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockOriginalTextBinding binding = mBlockOriginalTextBinding;
            ru.ozon.android.messenger.framework.core.d references = dVar;
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(references, "references");
            return new ru.ozon.android.messenger.blocks.originalText.c(binding, references);
        }
    }

    public g(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86006a = new d(deserializer);
        this.f86007b = new ru.ozon.android.messenger.blocks.originalText.d();
        this.f86008c = c.f86017a;
        this.f86009d = C7714v.a0(b.class);
        this.f86010e = e.f86019b;
        this.f86011f = f.f86020b;
        this.f86012g = new a.AbstractC1563a.b(28, 0, 0, null, null);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f86012g;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockOriginalTextBinding> getInflate() {
        return this.f86008c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return this.f86007b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, OriginalTextDTO> getParser() {
        return this.f86006a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return this.f86009d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<d.w.a, ru.ozon.android.messenger.blocks.originalText.f, ru.ozon.android.messenger.blocks.originalText.f> getUpdateConsumer() {
        return this.f86010e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockOriginalTextBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.originalText.f, MBlockOriginalTextBinding>> getViewProducer() {
        return this.f86011f;
    }
}
