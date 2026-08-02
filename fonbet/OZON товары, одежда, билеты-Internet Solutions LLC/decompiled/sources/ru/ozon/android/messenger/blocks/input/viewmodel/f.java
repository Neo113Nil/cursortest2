package ru.ozon.android.messenger.blocks.input.viewmodel;

import Bk.C2638a;
import De.C2862e;
import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.framework.data.repository.S;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S f85605a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f85606b;

    /* renamed from: c, reason: collision with root package name */
    private B0 f85607c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewmodel.DraftSaver$onAttachmentRemoved$1", f = "DraftSaver.kt", l = {47}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85608d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f85610f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f85610f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new a(this.f85610f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85608d;
            if (i11 == 0) {
                s.b(obj);
                S s11 = f.this.f85605a;
                this.f85608d = 1;
                if (s11.g(this.f85610f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewmodel.DraftSaver$onAttachmentsAdded$1", f = "DraftSaver.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85611d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f85613f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> f85614g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f85613f = str;
            this.f85614g = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new b(this.f85613f, this.f85614g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85611d;
            if (i11 == 0) {
                s.b(obj);
                S s11 = f.this.f85605a;
                long a11 = C2638a.a();
                this.f85611d = 1;
                if (s11.e(this.f85613f, this.f85614g, a11, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewmodel.DraftSaver$onCustomBlockAdded$1", f = "DraftSaver.kt", l = {53}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85615d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f85617f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ CustomBlockDTO f85618g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, CustomBlockDTO customBlockDTO, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f85617f = str;
            this.f85618g = customBlockDTO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new c(this.f85617f, this.f85618g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85615d;
            if (i11 == 0) {
                s.b(obj);
                S s11 = f.this.f85605a;
                long a11 = C2638a.a();
                this.f85615d = 1;
                if (s11.d(this.f85617f, this.f85618g, a11, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewmodel.DraftSaver$onTextChanged$1", f = "DraftSaver.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85619d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f85621f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f85622g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, kotlin.coroutines.d<? super d> dVar) {
            super(1, dVar);
            this.f85621f = str;
            this.f85622g = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return f.this.new d(this.f85621f, this.f85622g, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85619d;
            if (i11 == 0) {
                s.b(obj);
                S s11 = f.this.f85605a;
                String obj2 = kotlin.text.h.z0(this.f85622g).toString();
                long a11 = C2638a.a();
                this.f85619d = 1;
                if (s11.a(this.f85621f, obj2, a11, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public f(@NotNull S draftsRepository) {
        Intrinsics.checkNotNullParameter(draftsRepository, "draftsRepository");
        this.f85605a = draftsRepository;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f85606b = N.a(De.s.f6650a.x());
    }

    public final void b(@NotNull String attachmentId) {
        Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        C10727i.c(this.f85606b, null, null, new a(attachmentId, null), 3);
    }

    public final void c(@NotNull String chatId, @NotNull List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> attachments) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        C10727i.c(this.f85606b, null, null, new b(chatId, attachments, null), 3);
    }

    public final void d(@NotNull String chatId, @NotNull CustomBlockDTO customBlock) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(customBlock, "customBlock");
        C10727i.c(this.f85606b, null, null, new c(chatId, customBlock, null), 3);
    }

    public final void e(@NotNull String chatId, @NotNull String text) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(text, "text");
        d dVar = new d(chatId, text, null);
        B0 b02 = this.f85607c;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f85607c = C10727i.c(this.f85606b, null, null, new g(dVar, null), 3);
    }

    public final Object f(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object c11 = this.f85605a.c(str, cVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }
}
