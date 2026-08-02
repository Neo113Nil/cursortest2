package ru.ozon.android.messenger.blocks.messagetext;

import android.content.Context;
import android.text.SpannableStringBuilder;
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
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.databinding.MBlockTextBinding;

/* loaded from: classes10.dex */
public final class l extends ru.ozon.android.messenger.framework.core.viewmapper.a<MessageTextDTO, ru.ozon.android.messenger.blocks.messagetext.f, MBlockTextBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Class<? extends d.w.a>> f85882a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<d.w.a, ru.ozon.android.messenger.blocks.messagetext.f, ru.ozon.android.messenger.blocks.messagetext.f> f85883b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<String, MessageTextDTO> f85884c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f85885d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockTextBinding> f85886e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockTextBinding, ru.ozon.android.messenger.framework.core.d, g> f85887f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f85888g;

    public static final class a implements d.w.a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "TextUpdate(itemId=null, text=null)";
        }
    }

    /* synthetic */ class b extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockTextBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f85889a = new b(3, MBlockTextBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockTextBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockTextBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockTextBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class c extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.messagetext.e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f85890b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f85890b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.messagetext.e invoke() {
            return new ru.ozon.android.messenger.blocks.messagetext.e(this.f85890b);
        }
    }

    static final class d extends AbstractC7737t implements Function1<String, MessageTextDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85891b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(JsonParser jsonParser) {
            super(1);
            this.f85891b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final MessageTextDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (MessageTextDTO) this.f85891b.fromJson(state, MessageTextDTO.class);
        }
    }

    static final class e extends AbstractC7737t implements Function2<d.w.a, ru.ozon.android.messenger.blocks.messagetext.f, ru.ozon.android.messenger.blocks.messagetext.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f85892b = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.messagetext.f invoke(d.w.a aVar, ru.ozon.android.messenger.blocks.messagetext.f fVar) {
            d.w.a update = aVar;
            ru.ozon.android.messenger.blocks.messagetext.f oldVO = fVar;
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(oldVO, "oldVO");
            if (update instanceof a) {
                ((a) update).getClass();
                if (Intrinsics.d(null, ru.ozon.android.messenger.framework.presentation.models.h.b(oldVO))) {
                    return ru.ozon.android.messenger.blocks.messagetext.f.c(oldVO, new SpannableStringBuilder(null));
                }
            }
            return null;
        }
    }

    static final class f extends AbstractC7737t implements Function2<MBlockTextBinding, ru.ozon.android.messenger.framework.core.d, g> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f85893b = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final g invoke(MBlockTextBinding mBlockTextBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockTextBinding binding = mBlockTextBinding;
            ru.ozon.android.messenger.framework.core.d references = dVar;
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(references, "references");
            return new g(binding, references);
        }
    }

    public l(@NotNull Context context, @NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85882a = C7714v.a0(a.class);
        this.f85883b = e.f85892b;
        this.f85884c = new d(deserializer);
        this.f85885d = ru.ozon.android.messenger.utils.f.b(new c(context));
        this.f85886e = b.f85889a;
        this.f85887f = f.f85893b;
        this.f85888g = new a.AbstractC1563a.b(31, null, null, null, null);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f85888g;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockTextBinding> getInflate() {
        return this.f85886e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.messagetext.e) this.f85885d.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, MessageTextDTO> getParser() {
        return this.f85884c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return this.f85882a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<d.w.a, ru.ozon.android.messenger.blocks.messagetext.f, ru.ozon.android.messenger.blocks.messagetext.f> getUpdateConsumer() {
        return this.f85883b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockTextBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.messagetext.f, MBlockTextBinding>> getViewProducer() {
        return this.f85887f;
    }
}
