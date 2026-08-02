package ru.ozon.android.messenger.blocks.onboarding;

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
import ru.ozon.app.android.messenger.databinding.MBlockOnboardingBinding;

/* loaded from: classes10.dex */
public final class f extends ru.ozon.android.messenger.framework.core.viewmapper.a<OnboardingDTO, ru.ozon.android.messenger.blocks.onboarding.b, MBlockOnboardingBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockOnboardingBinding> f85952a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockOnboardingBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.onboarding.b, MBlockOnboardingBinding>> f85953b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f85954c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, OnboardingDTO> f85955d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f85956e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockOnboardingBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f85957a = new a(3, MBlockOnboardingBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockOnboardingBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockOnboardingBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockOnboardingBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.onboarding.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f85958b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.onboarding.a invoke() {
            return new ru.ozon.android.messenger.blocks.onboarding.a();
        }
    }

    /* synthetic */ class c extends C7735q implements Function1<String, OnboardingDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final OnboardingDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (OnboardingDTO) ((JsonParser) this.receiver).fromJson(p02, OnboardingDTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MBlockOnboardingBinding, ru.ozon.android.messenger.framework.core.d, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f85959a = new d(2, e.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockOnboardingBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final e invoke(MBlockOnboardingBinding mBlockOnboardingBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockOnboardingBinding p02 = mBlockOnboardingBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new e(p02, p12);
        }
    }

    public f(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85952a = a.f85957a;
        this.f85953b = d.f85959a;
        this.f85954c = a.AbstractC1563a.C1564a.f87356a;
        this.f85955d = new c(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f85956e = ru.ozon.android.messenger.utils.f.b(b.f85958b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f85954c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockOnboardingBinding> getInflate() {
        return this.f85952a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<OnboardingDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.onboarding.b>> getMapper() {
        return (Function2) this.f85956e.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, OnboardingDTO> getParser() {
        return this.f85955d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockOnboardingBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.onboarding.b, MBlockOnboardingBinding>> getViewProducer() {
        return this.f85953b;
    }
}
