package ru.ozon.android.messenger.framework.data.repository;

import android.text.style.URLSpan;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.curtain.CurtainModalResponseDTO;
import ru.ozon.android.messenger.blocks.disclaimer.modal.DisclaimerModalResponseDTO;
import ru.ozon.android.messenger.blocks.originalText.DataTextDTO;
import ru.ozon.android.messenger.blocks.originalText.OriginalTextResponseDTO;
import ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.RateMessengerSuccessModalDto;
import ru.ozon.android.messenger.framework.data.remote.models.ActionCurtainDTO;
import ru.ozon.android.messenger.framework.data.requests.ActionsCurtainResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.AddFastAnswerResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ContextMenuItemActionResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.CouponActionResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.DataDTO;
import ru.ozon.android.messenger.framework.data.requests.EditChatMessageResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ExternalTransitionModalResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ReadAllDataDTO;
import ru.ozon.android.messenger.framework.data.requests.ReadAllResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ReplyChatMessageResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.SuccessMessageDTO;
import ru.ozon.android.messenger.framework.data.requests.SuspiciousLinkModalDTO;
import ru.ozon.android.messenger.framework.presentation.models.C9514a;
import ru.ozon.android.messenger.framework.presentation.models.responses.c;
import ru.ozon.android.messenger.framework.presentation.models.responses.d;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import xe.C10727i;

/* renamed from: ru.ozon.android.messenger.framework.data.repository.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9351a implements ru.ozon.android.messenger.framework.domain.repository.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.mapper.g f88447a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.action.y f88448b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xe.M f88449c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final xe.I f88450d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$acceptPolitics$2", f = "ActionRepositoryImpl.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$a, reason: collision with other inner class name */
    static final class C1630a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88451d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AtomActionDTO f88453f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1630a(AtomActionDTO atomActionDTO, kotlin.coroutines.d<? super C1630a> dVar) {
            super(2, dVar);
            this.f88453f = atomActionDTO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new C1630a(this.f88453f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
            return ((C1630a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88451d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
            this.f88451d = 1;
            Object k11 = yVar.k(this.f88453f, this);
            return k11 == aVar ? aVar : k11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$aiLikeOrDislike$2", f = "ActionRepositoryImpl.kt", l = {172}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88454d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88456f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f88456f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new b(this.f88456f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88454d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
            this.f88454d = 1;
            Object l11 = yVar.l(this.f88456f, this);
            return l11 == aVar ? aVar : l11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$aiRetrySendMessage$2", f = "ActionRepositoryImpl.kt", l = {175}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88457d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88459f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f88459f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new c(this.f88459f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88457d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
            this.f88457d = 1;
            Object l11 = yVar.l(this.f88459f, this);
            return l11 == aVar ? aVar : l11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$enableNotificationsV2$2", f = "ActionRepositoryImpl.kt", l = {156}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88460d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88462f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f88462f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new d(this.f88462f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88460d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
            this.f88460d = 1;
            Object l11 = yVar.l(this.f88462f, this);
            return l11 == aVar ? aVar : l11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$hideCoupon$2", f = "ActionRepositoryImpl.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$e */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88463d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88465f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f88465f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new e(this.f88465f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88463d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
            this.f88463d = 1;
            Object r11 = yVar.r(this.f88465f, this);
            return r11 == aVar ? aVar : r11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$sendButtonClickAction$2", f = "ActionRepositoryImpl.kt", l = {40}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$f */
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88466d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AtomActionDTO f88468f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AtomActionDTO atomActionDTO, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f88468f = atomActionDTO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new f(this.f88468f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88466d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
            this.f88466d = 1;
            Object q11 = yVar.q(this.f88468f, this);
            return q11 == aVar ? aVar : q11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$sendButtonClickAction$4", f = "ActionRepositoryImpl.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$g */
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88469d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88471f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f88471f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new g(this.f88471f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88469d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
            this.f88469d = 1;
            Object r11 = yVar.r(this.f88471f, this);
            return r11 == aVar ? aVar : r11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$sendOnboardingHiddenAction$2", f = "ActionRepositoryImpl.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$h */
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88472d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88474f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f88474f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new h(this.f88474f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88472d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
            this.f88472d = 1;
            Object t2 = yVar.t(this.f88474f, this);
            return t2 == aVar ? aVar : t2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$sendRateOperatorAction$2", f = "ActionRepositoryImpl.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$i */
    static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88475d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.j f88477f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.j jVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f88477f = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new i(this.f88477f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88475d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
            this.f88475d = 1;
            Object v11 = yVar.v(this.f88477f, this);
            return v11 == aVar ? aVar : v11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$sendReport$2", f = "ActionRepositoryImpl.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$j */
    static final class j extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88478d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AtomActionDTO f88480f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(AtomActionDTO atomActionDTO, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f88480f = atomActionDTO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new j(this.f88480f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
            return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88478d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
            this.f88478d = 1;
            Object k11 = yVar.k(this.f88480f, this);
            return k11 == aVar ? aVar : k11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$unpinHeaderItem$2", f = "ActionRepositoryImpl.kt", l = {152}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$k */
    static final class k extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88481d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88483f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f88483f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new k(this.f88483f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
            return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88481d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
            this.f88481d = 1;
            Object z11 = yVar.z(this.f88483f, this);
            return z11 == aVar ? aVar : z11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$updateBlock$2", f = "ActionRepositoryImpl.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$l */
    static final class l extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88484d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88486f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f88486f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new l(this.f88486f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
            return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88484d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
            this.f88484d = 1;
            Object y11 = yVar.y(this.f88486f, this);
            return y11 == aVar ? aVar : y11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$updateFastAnswersUsageAction$1", f = "ActionRepositoryImpl.kt", l = {124}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.repository.a$m */
    static final class m extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88487d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88489f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f88489f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9351a.this.new m(this.f88489f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88487d;
            if (i11 == 0) {
                Sc.s.b(obj);
                ru.ozon.android.messenger.framework.data.remote.action.y yVar = C9351a.this.f88448b;
                this.f88487d = 1;
                if (yVar.A(this.f88489f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public C9351a(@NotNull ru.ozon.android.messenger.framework.data.remote.mapper.g responseMapper, @NotNull ru.ozon.android.messenger.framework.data.remote.action.y actionDataSource, @NotNull xe.M externalScope, @NotNull xe.I ioDispatcher) {
        Intrinsics.checkNotNullParameter(responseMapper, "responseMapper");
        Intrinsics.checkNotNullParameter(actionDataSource, "actionDataSource");
        Intrinsics.checkNotNullParameter(externalScope, "externalScope");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f88447a = responseMapper;
        this.f88448b = actionDataSource;
        this.f88449c = externalScope;
        this.f88450d = ioDispatcher;
    }

    private final CoroutineContext y() {
        return this.f88449c.getCoroutineContext().plus(this.f88450d);
    }

    public final Object A(AtomActionDTO atomActionDTO, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
        return C10727i.f(y(), new f(atomActionDTO, null), dVar);
    }

    public final Object B(AtomActionDTO atomActionDTO, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
        return C10727i.f(y(), new j(atomActionDTO, null), dVar);
    }

    public final Object C(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        return C10727i.f(y(), new F(this, aVar, null), jVar);
    }

    public final Object D(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
        return C10727i.f(y(), new k(aVar, null), dVar);
    }

    public final Object E(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
        return C10727i.f(y(), new l(aVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.domain.repository.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        B b11;
        int i11;
        C9351a c9351a;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof B) {
            b11 = (B) cVar;
            int i12 = b11.f88259g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                b11.f88259g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = b11.f88257e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = b11.f88259g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C c11 = new C(this, aVar, null);
                    b11.f88256d = this;
                    b11.f88259g = 1;
                    obj = C10727i.f(y11, c11, b11);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    c9351a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9351a = b11.f88256d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                AddFastAnswerResponseDTO addFastAnswerResponseDTO = (AddFastAnswerResponseDTO) ((i.b) iVar).b();
                c9351a.f88447a.getClass();
                return new i.b(ru.ozon.android.messenger.framework.data.remote.mapper.g.d(addFastAnswerResponseDTO));
            }
        }
        b11 = new B(this, cVar);
        Object obj2 = b11.f88257e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = b11.f88259g;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.domain.repository.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9362l c9362l;
        int i11;
        C9351a c9351a;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof C9362l) {
            c9362l = (C9362l) cVar;
            int i12 = c9362l.f88571g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9362l.f88571g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9362l.f88569e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9362l.f88571g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C9363m c9363m = new C9363m(this, aVar, null);
                    c9362l.f88568d = this;
                    c9362l.f88571g = 1;
                    obj = C10727i.f(y11, c9363m, c9362l);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    c9351a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9351a = c9362l.f88568d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                CurtainModalResponseDTO curtainModalResponseDTO = (CurtainModalResponseDTO) ((i.b) iVar).b();
                c9351a.f88447a.getClass();
                return new i.b(ru.ozon.android.messenger.framework.data.remote.mapper.g.k(curtainModalResponseDTO));
            }
        }
        c9362l = new C9362l(this, cVar);
        Object obj2 = c9362l.f88569e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9362l.f88571g;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.ozon.android.messenger.framework.domain.repository.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9369t c9369t;
        int i11;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof C9369t) {
            c9369t = (C9369t) cVar;
            int i12 = c9369t.f88613f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9369t.f88613f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9369t.f88611d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9369t.f88613f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C9370u c9370u = new C9370u(this, aVar, null);
                    c9369t.f88613f = 1;
                    obj = C10727i.f(y11, c9370u, c9369t);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.b)) {
                    DisclaimerModalResponseDTO disclaimerModalResponseDTO = (DisclaimerModalResponseDTO) ((i.b) iVar).b();
                    return new i.b(disclaimerModalResponseDTO != null ? disclaimerModalResponseDTO.map() : null);
                }
                if (iVar instanceof i.a) {
                    return iVar;
                }
                throw new Sc.o();
            }
        }
        c9369t = new C9369t(this, cVar);
        Object obj2 = c9369t.f88611d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9369t.f88613f;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (!(iVar instanceof i.b)) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.a
    public final void d(@NotNull ru.ozon.android.messenger.framework.navigation.action.a atomActionWrapper) {
        Intrinsics.checkNotNullParameter(atomActionWrapper, "atomActionWrapper");
        C10727i.c(this.f88449c, y(), null, new m(atomActionWrapper, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.ozon.android.messenger.framework.domain.repository.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9373x c9373x;
        int i11;
        C9351a c9351a;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof C9373x) {
            c9373x = (C9373x) cVar;
            int i12 = c9373x.f88626g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9373x.f88626g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9373x.f88624e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9373x.f88626g;
                ru.ozon.android.messenger.framework.presentation.models.responses.b bVar = null;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C9374y c9374y = new C9374y(this, aVar, null);
                    c9373x.f88623d = this;
                    c9373x.f88626g = 1;
                    obj = C10727i.f(y11, c9374y, c9373x);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    c9351a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9351a = c9373x.f88623d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                ReadAllResponseDTO readAllResponseDTO = (ReadAllResponseDTO) ((i.b) iVar).b();
                c9351a.f88447a.getClass();
                if (readAllResponseDTO != null) {
                    ReadAllDataDTO data = readAllResponseDTO.getData();
                    bVar = new ru.ozon.android.messenger.framework.presentation.models.responses.b(data.getTitle(), data.getSubtitle());
                }
                return new i.b(bVar);
            }
        }
        c9373x = new C9373x(this, cVar);
        Object obj2 = c9373x.f88624e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9373x.f88626g;
        ru.ozon.android.messenger.framework.presentation.models.responses.b bVar2 = null;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.domain.repository.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        D d11;
        int i11;
        C9351a c9351a;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof D) {
            d11 = (D) cVar;
            int i12 = d11.f88266g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                d11.f88266g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = d11.f88264e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = d11.f88266g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    E e11 = new E(this, aVar, null);
                    d11.f88263d = this;
                    d11.f88266g = 1;
                    obj = C10727i.f(y11, e11, d11);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    c9351a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9351a = d11.f88263d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                CurtainModalResponseDTO curtainModalResponseDTO = (CurtainModalResponseDTO) ((i.b) iVar).b();
                c9351a.f88447a.getClass();
                return new i.b(ru.ozon.android.messenger.framework.data.remote.mapper.g.k(curtainModalResponseDTO));
            }
        }
        d11 = new D(this, cVar);
        Object obj2 = d11.f88264e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = d11.f88266g;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.ozon.android.messenger.framework.domain.repository.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9356f c9356f;
        int i11;
        C9351a c9351a;
        ru.ozon.android.messenger.utils.i iVar;
        DataDTO data;
        SuccessMessageDTO successMessage;
        if (cVar instanceof C9356f) {
            c9356f = (C9356f) cVar;
            int i12 = c9356f.f88519g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9356f.f88519g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9356f.f88517e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9356f.f88519g;
                ru.ozon.android.messenger.framework.presentation.models.responses.b bVar = null;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C9357g c9357g = new C9357g(this, aVar, null);
                    c9356f.f88516d = this;
                    c9356f.f88519g = 1;
                    obj = C10727i.f(y11, c9357g, c9356f);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    c9351a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9351a = c9356f.f88516d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                ContextMenuItemActionResponseDTO contextMenuItemActionResponseDTO = (ContextMenuItemActionResponseDTO) ((i.b) iVar).b();
                c9351a.f88447a.getClass();
                if (contextMenuItemActionResponseDTO != null && (data = contextMenuItemActionResponseDTO.getData()) != null && (successMessage = data.getSuccessMessage()) != null) {
                    bVar = new ru.ozon.android.messenger.framework.presentation.models.responses.b(successMessage.getTitle(), successMessage.getSubtitle());
                }
                return new i.b(bVar);
            }
        }
        c9356f = new C9356f(this, cVar);
        Object obj2 = c9356f.f88517e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9356f.f88519g;
        ru.ozon.android.messenger.framework.presentation.models.responses.b bVar2 = null;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.a
    public final Object h(@NotNull ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.j jVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
        return C10727i.f(y(), new i(jVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.domain.repository.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(@NotNull String str, Map map, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9375z c9375z;
        int i11;
        C9351a c9351a;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof C9375z) {
            c9375z = (C9375z) cVar;
            int i12 = c9375z.f88633g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9375z.f88633g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9375z.f88631e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9375z.f88633g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    A a11 = new A(this, str, map, null);
                    c9375z.f88630d = this;
                    c9375z.f88633g = 1;
                    obj = C10727i.f(y11, a11, c9375z);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c9351a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9351a = c9375z.f88630d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                AddFastAnswerResponseDTO addFastAnswerResponseDTO = (AddFastAnswerResponseDTO) ((i.b) iVar).b();
                c9351a.f88447a.getClass();
                return new i.b(ru.ozon.android.messenger.framework.data.remote.mapper.g.d(addFastAnswerResponseDTO));
            }
        }
        c9375z = new C9375z(this, cVar);
        Object obj2 = c9375z.f88631e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9375z.f88633g;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.a
    public final Object j(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
        return C10727i.f(y(), new h(aVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ru.ozon.android.messenger.framework.domain.repository.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9371v c9371v;
        int i11;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof C9371v) {
            c9371v = (C9371v) cVar;
            int i12 = c9371v.f88619f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9371v.f88619f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9371v.f88617d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9371v.f88619f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C9372w c9372w = new C9372w(this, aVar, null);
                    c9371v.f88619f = 1;
                    obj = C10727i.f(y11, c9372w, c9371v);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.b)) {
                    RateMessengerSuccessModalDto rateMessengerSuccessModalDto = (RateMessengerSuccessModalDto) ((i.b) iVar).b();
                    return new i.b(rateMessengerSuccessModalDto != null ? rateMessengerSuccessModalDto.map() : null);
                }
                if (iVar instanceof i.a) {
                    return iVar;
                }
                throw new Sc.o();
            }
        }
        c9371v = new C9371v(this, cVar);
        Object obj2 = c9371v.f88617d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9371v.f88619f;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (!(iVar instanceof i.b)) {
        }
    }

    public final Object l(AtomActionDTO atomActionDTO, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
        return C10727i.f(y(), new C1630a(atomActionDTO, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9352b c9352b;
        int i11;
        C9351a c9351a;
        ru.ozon.android.messenger.utils.i iVar;
        Object aVar2;
        if (cVar instanceof C9352b) {
            c9352b = (C9352b) cVar;
            int i12 = c9352b.f88495g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9352b.f88495g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9352b.f88493e;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9352b.f88495g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C9353c c9353c = new C9353c(this, aVar, null);
                    c9352b.f88492d = this;
                    c9352b.f88495g = 1;
                    obj = C10727i.f(y11, c9353c, c9352b);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    c9351a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9351a = c9352b.f88492d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                CouponActionResponseDTO couponActionResponseDTO = (CouponActionResponseDTO) ((i.b) iVar).b();
                c9351a.f88447a.getClass();
                CouponActionResponseDTO.Data data = couponActionResponseDTO != null ? couponActionResponseDTO.getData() : null;
                if (data != null) {
                    CouponActionResponseDTO.CouponModalDTO modal = data.getModal();
                    TextAtom title = modal.getTitle();
                    TextAtom subtitle = modal.getSubtitle();
                    String imageUrl = modal.getImageUrl();
                    CouponActionResponseDTO.AppAnimationDTO animations = modal.getAnimations();
                    aVar2 = new c.b(new c.b.C1710b(title, subtitle, imageUrl, animations != null ? new c.b.a(animations.getLottie(), animations.getBackgroundLottie()) : null, modal.getButton(), modal.getTrackingInfo()));
                } else {
                    String error = couponActionResponseDTO != null ? couponActionResponseDTO.getError() : null;
                    if (error == null) {
                        error = "";
                    }
                    aVar2 = new c.a(error);
                }
                return new i.b(aVar2);
            }
        }
        c9352b = new C9352b(this, cVar);
        Object obj2 = c9352b.f88493e;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9352b.f88495g;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
    }

    public final Object o(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
        return C10727i.f(y(), new b(aVar, null), dVar);
    }

    public final Object p(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
        return C10727i.f(y(), new c(aVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9354d c9354d;
        int i11;
        C9351a c9351a;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof C9354d) {
            c9354d = (C9354d) cVar;
            int i12 = c9354d.f88507g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9354d.f88507g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9354d.f88505e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9354d.f88507g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C9355e c9355e = new C9355e(this, aVar, null);
                    c9354d.f88504d = this;
                    c9354d.f88507g = 1;
                    obj = C10727i.f(y11, c9355e, c9354d);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    c9351a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9351a = c9354d.f88504d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                AddFastAnswerResponseDTO addFastAnswerResponseDTO = (AddFastAnswerResponseDTO) ((i.b) iVar).b();
                c9351a.f88447a.getClass();
                return new i.b(ru.ozon.android.messenger.framework.data.remote.mapper.g.d(addFastAnswerResponseDTO));
            }
        }
        c9354d = new C9354d(this, cVar);
        Object obj2 = c9354d.f88505e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9354d.f88507g;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
    }

    public final Object r(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
        return C10727i.f(y(), new d(aVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9358h c9358h;
        int i11;
        C9351a c9351a;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof C9358h) {
            c9358h = (C9358h) cVar;
            int i12 = c9358h.f88533g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9358h.f88533g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9358h.f88531e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9358h.f88533g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C9359i c9359i = new C9359i(this, aVar, null);
                    c9358h.f88530d = this;
                    c9358h.f88533g = 1;
                    obj = C10727i.f(y11, c9359i, c9358h);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    c9351a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9351a = c9358h.f88530d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.b)) {
                    return new i.b(c9351a.f88447a.b((EditChatMessageResponseDTO) ((i.b) iVar).b()));
                }
                if (iVar instanceof i.a) {
                    return iVar;
                }
                throw new Sc.o();
            }
        }
        c9358h = new C9358h(this, cVar);
        Object obj2 = c9358h.f88531e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9358h.f88533g;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (!(iVar instanceof i.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9360j c9360j;
        int i11;
        ru.ozon.android.messenger.utils.i iVar;
        ActionCurtainDTO data;
        if (cVar instanceof C9360j) {
            c9360j = (C9360j) cVar;
            int i12 = c9360j.f88555f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9360j.f88555f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9360j.f88553d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9360j.f88555f;
                C9514a c9514a = null;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C9361k c9361k = new C9361k(this, aVar, null);
                    c9360j.f88555f = 1;
                    obj = C10727i.f(y11, c9361k, c9360j);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                ActionsCurtainResponseDTO actionsCurtainResponseDTO = (ActionsCurtainResponseDTO) ((i.b) iVar).b();
                if (actionsCurtainResponseDTO != null && (data = actionsCurtainResponseDTO.getData()) != null) {
                    Intrinsics.checkNotNullParameter(data, "<this>");
                    c9514a = new C9514a(data.getTitle(), data.getCells(), data.getButtons());
                }
                return new i.b(c9514a);
            }
        }
        c9360j = new C9360j(this, cVar);
        Object obj2 = c9360j.f88553d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9360j.f88555f;
        C9514a c9514a2 = null;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r4v1, types: [ru.ozon.android.messenger.framework.presentation.models.responses.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9364n c9364n;
        int i11;
        C9351a c9351a;
        ru.ozon.android.messenger.utils.i iVar;
        URLSpan uRLSpan;
        if (cVar instanceof C9364n) {
            c9364n = (C9364n) cVar;
            int i12 = c9364n.f88588g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9364n.f88588g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9364n.f88586e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9364n.f88588g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C9365o c9365o = new C9365o(this, aVar, null);
                    c9364n.f88585d = this;
                    c9364n.f88588g = 1;
                    obj = C10727i.f(y11, c9365o, c9364n);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    c9351a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9351a = c9364n.f88585d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                ExternalTransitionModalResponseDTO externalTransitionModalResponseDTO = (ExternalTransitionModalResponseDTO) ((i.b) iVar).b();
                c9351a.f88447a.getClass();
                if (externalTransitionModalResponseDTO != null) {
                    SuspiciousLinkModalDTO data = externalTransitionModalResponseDTO.getData();
                    URLSpan[] uRLSpanArr = (URLSpan[]) data.getLink().getText().getSpans(0, data.getLink().getText().length(), URLSpan.class);
                    String url = (uRLSpanArr == null || (uRLSpan = (URLSpan) C7705l.F(uRLSpanArr)) == null) ? null : uRLSpan.getURL();
                    r3 = new ru.ozon.android.messenger.framework.presentation.models.responses.d(data.getImage(), data.getTitle(), data.getSubtitle(), url != null ? new d.b(data.getLink(), url) : null, data.getDisclaimer(), data.getButton());
                }
                return new i.b(r3);
            }
        }
        c9364n = new C9364n(this, cVar);
        Object obj2 = c9364n.f88586e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9364n.f88588g;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9366p c9366p;
        int i11;
        C9351a c9351a;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof C9366p) {
            c9366p = (C9366p) cVar;
            int i12 = c9366p.f88601g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9366p.f88601g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9366p.f88599e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9366p.f88601g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C9367q c9367q = new C9367q(this, aVar, null);
                    c9366p.f88598d = this;
                    c9366p.f88601g = 1;
                    obj = C10727i.f(y11, c9367q, c9366p);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    c9351a = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9351a = c9366p.f88598d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.b)) {
                    return new i.b(c9351a.f88447a.c((ReplyChatMessageResponseDTO) ((i.b) iVar).b()));
                }
                if (iVar instanceof i.a) {
                    return iVar;
                }
                throw new Sc.o();
            }
        }
        c9366p = new C9366p(this, cVar);
        Object obj2 = c9366p.f88599e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9366p.f88601g;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (!(iVar instanceof i.b)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v8, types: [ru.ozon.android.messenger.blocks.originalText.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        r rVar;
        int i11;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i12 = rVar.f88607f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                rVar.f88607f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = rVar.f88605d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = rVar.f88607f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    CoroutineContext y11 = y();
                    C9368s c9368s = new C9368s(this, aVar, null);
                    rVar.f88607f = 1;
                    obj = C10727i.f(y11, c9368s, rVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                OriginalTextResponseDTO originalTextResponseDTO = (OriginalTextResponseDTO) ((i.b) iVar).b();
                if (originalTextResponseDTO != null) {
                    Intrinsics.checkNotNullParameter(originalTextResponseDTO, "<this>");
                    DataTextDTO data = originalTextResponseDTO.getData();
                    r4 = new ru.ozon.android.messenger.blocks.originalText.e(data != null ? data.getText() : null, originalTextResponseDTO.getError());
                }
                return new i.b(r4);
            }
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.f88605d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = rVar.f88607f;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
    }

    public final Object x(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
        return C10727i.f(y(), new e(aVar, null), dVar);
    }

    public final Object z(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<?>> dVar) {
        return C10727i.f(y(), new g(aVar, null), dVar);
    }
}
