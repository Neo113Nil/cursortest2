package ru.ozon.android.messenger.blocks.useristyping;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.utils.f;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.databinding.MBlockUserTypingBinding;

/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.core.viewmapper.a<UserIsTypingDTO, ru.ozon.android.messenger.blocks.useristyping.b, MBlockUserTypingBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockUserTypingBinding> f86564a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockUserTypingBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.useristyping.b, MBlockUserTypingBinding>> f86565b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f86566c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, UserIsTypingDTO> f86567d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f86568e;

    static final class a extends AbstractC7737t implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockUserTypingBinding> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f86569b = new a(3);

        @Override // fd.InterfaceC6511n
        public final MBlockUserTypingBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater inflater = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            return MBlockUserTypingBinding.inflate(inflater, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.useristyping.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f86570b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.useristyping.a invoke() {
            return new ru.ozon.android.messenger.blocks.useristyping.a();
        }
    }

    static final class c extends AbstractC7737t implements Function1<String, UserIsTypingDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86571b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JsonParser jsonParser) {
            super(1);
            this.f86571b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final UserIsTypingDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (UserIsTypingDTO) this.f86571b.fromJson(state, UserIsTypingDTO.class);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.useristyping.d$d, reason: collision with other inner class name */
    static final class C1535d extends AbstractC7737t implements Function2<MBlockUserTypingBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.useristyping.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1535d f86572b = new C1535d(2);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.useristyping.c invoke(MBlockUserTypingBinding mBlockUserTypingBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockUserTypingBinding binding = mBlockUserTypingBinding;
            ru.ozon.android.messenger.framework.core.d references = dVar;
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(references, "references");
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(references, "references");
            return new ru.ozon.android.messenger.blocks.useristyping.c(binding, references);
        }
    }

    public d(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86564a = a.f86569b;
        this.f86565b = C1535d.f86572b;
        this.f86566c = new a.AbstractC1563a.b(23, null, null, Integer.valueOf(R$color.bg_primary), null);
        this.f86567d = new c(deserializer);
        this.f86568e = f.b(b.f86570b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f86566c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockUserTypingBinding> getInflate() {
        return this.f86564a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<UserIsTypingDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.useristyping.b>> getMapper() {
        return (Function2) this.f86568e.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, UserIsTypingDTO> getParser() {
        return this.f86567d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockUserTypingBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.useristyping.b, MBlockUserTypingBinding>> getViewProducer() {
        return this.f86565b;
    }
}
