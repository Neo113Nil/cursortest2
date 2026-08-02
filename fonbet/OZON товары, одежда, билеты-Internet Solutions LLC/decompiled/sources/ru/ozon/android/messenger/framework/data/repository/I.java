package ru.ozon.android.messenger.framework.data.repository;

import Ae.C2406m0;
import Ae.C2408n0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.blocks.input.attachments.manager.a;
import ru.ozon.android.messenger.blocks.messagefile.FileDTO;
import ru.ozon.android.messenger.blocks.messageimage.ImageDTO;
import ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.data.remote.websocket.C9331b;
import ru.ozon.android.messenger.framework.data.requests.GetChatsRequest;
import ru.ozon.android.messenger.framework.data.requests.GetChatsResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.GetMessagesResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.SendMessageRequest;
import ru.ozon.android.messenger.framework.data.requests.SendMessagesResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.UpdateMessageResponseDTO;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.u0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.y0;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class I implements ru.ozon.android.messenger.framework.domain.repository.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.mapper.g f88278a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.mapper.c f88279b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9331b f88280c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.cache.b f88281d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.cache.f f88282e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final c0 f88283f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final X f88284g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.mapper.c f88285h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.s f88286i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final xe.M f88287j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final xe.I f88288k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.c f88289l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final H f88290m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.attachments.data.g f88291n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final S f88292o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final M0<AbstractC9330a> f88293p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final M0<NetworkInfo> f88294q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final x0<ru.ozon.android.messenger.framework.data.local.r> f88295r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final Object f88296s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.mapper.i f88297t;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$chatEnter$2", f = "ChatRepositoryImpl.kt", l = {258}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.a>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88298d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.a f88300f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ru.ozon.android.messenger.framework.data.requests.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f88300f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return I.this.new a(this.f88300f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.a>> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88298d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            C9331b c9331b = I.this.f88280c;
            this.f88298d = 1;
            Object j11 = c9331b.j(this.f88300f, this);
            return j11 == aVar ? aVar : j11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$getAiMessages$2", f = "ChatRepositoryImpl.kt", l = {119, 124}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.h>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        GetMessagesResponseDTO f88301d;

        /* renamed from: e, reason: collision with root package name */
        int f88302e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.b f88304g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ru.ozon.android.messenger.framework.data.requests.b bVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f88304g = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return I.this.new b(this.f88304g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.h>> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x002f, code lost:
        
            if (r7 == r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GetMessagesResponseDTO getMessagesResponseDTO;
            List<UndeliveredMessageEntity> list;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88302e;
            ru.ozon.android.messenger.framework.data.requests.b bVar = this.f88304g;
            I i12 = I.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9331b c9331b = i12.f88280c;
                this.f88302e = 1;
                obj = c9331b.q(bVar, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getMessagesResponseDTO = this.f88301d;
                    Sc.s.b(obj);
                    list = (List) ((ru.ozon.android.messenger.utils.i) obj).a();
                    if (list == null) {
                        list = kotlin.collections.K.f71697a;
                    }
                    return new i.b(i12.f88284g.a(getMessagesResponseDTO, bVar.e(), list));
                }
                Sc.s.b(obj);
            }
            ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
            GetMessagesResponseDTO getMessagesResponseDTO2 = (GetMessagesResponseDTO) iVar.a();
            if (!(iVar instanceof i.b) || getMessagesResponseDTO2 == null) {
                i.a aVar2 = iVar instanceof i.a ? (i.a) iVar : null;
                return aVar2 == null ? new i.a.e("Undefined result of getMessages") : aVar2;
            }
            c0 c0Var = i12.f88283f;
            String d11 = bVar.d();
            this.f88301d = getMessagesResponseDTO2;
            this.f88302e = 2;
            obj = c0Var.f(d11, this);
            if (obj != aVar) {
                getMessagesResponseDTO = getMessagesResponseDTO2;
                list = (List) ((ru.ozon.android.messenger.utils.i) obj).a();
                if (list == null) {
                }
                return new i.b(i12.f88284g.a(getMessagesResponseDTO, bVar.e(), list));
            }
            return aVar;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$getChats$2", f = "ChatRepositoryImpl.kt", l = {ModuleDescriptor.MODULE_VERSION, 216, 219, 225, 230}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.g>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Map f88305d;

        /* renamed from: e, reason: collision with root package name */
        ru.ozon.android.messenger.utils.i f88306e;

        /* renamed from: f, reason: collision with root package name */
        GetChatsResponseDTO f88307f;

        /* renamed from: g, reason: collision with root package name */
        int f88308g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ GetChatsRequest f88310i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(GetChatsRequest getChatsRequest, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f88310i = getChatsRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return I.this.new c(this.f88310i, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.g>> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
        
            if (r4.c(r2, r6, r10) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
        
            if (r11 == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x005b, code lost:
        
            if (r11 == r0) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0113 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Map<String, ru.ozon.android.messenger.blocks.input.b> map;
            ru.ozon.android.messenger.utils.i iVar;
            GetChatsResponseDTO getChatsResponseDTO;
            Map<String, ru.ozon.android.messenger.blocks.input.b> map2;
            ru.ozon.android.messenger.utils.i iVar2;
            Object b11;
            GetChatsResponseDTO getChatsResponseDTO2;
            Map<String, UndeliveredMessageEntity> map3;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88308g;
            GetChatsRequest getChatsRequest = this.f88310i;
            I i12 = I.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                S s11 = i12.f88292o;
                this.f88308g = 1;
                obj = s11.f(this);
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        map = this.f88305d;
                        Sc.s.b(obj);
                        iVar = (ru.ozon.android.messenger.utils.i) obj;
                        getChatsResponseDTO = (GetChatsResponseDTO) iVar.a();
                        if (getChatsResponseDTO == null) {
                            ru.ozon.android.messenger.framework.data.cache.b bVar = i12.f88281d;
                            this.f88305d = map;
                            this.f88306e = iVar;
                            this.f88308g = 3;
                        } else {
                            ru.ozon.android.messenger.framework.data.cache.b bVar2 = i12.f88281d;
                            this.f88305d = map;
                            this.f88308g = 4;
                            obj = bVar2.b(getChatsRequest, this);
                        }
                        return aVar;
                    }
                    if (i11 == 3) {
                        iVar2 = this.f88306e;
                        map2 = this.f88305d;
                        Sc.s.b(obj);
                        GetChatsResponseDTO getChatsResponseDTO3 = (GetChatsResponseDTO) iVar2.a();
                        c0 c0Var = i12.f88283f;
                        this.f88305d = map2;
                        this.f88306e = iVar2;
                        this.f88307f = getChatsResponseDTO3;
                        this.f88308g = 5;
                        b11 = c0Var.b(this);
                        if (b11 != aVar) {
                        }
                        return aVar;
                    }
                    if (i11 != 4) {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        getChatsResponseDTO2 = this.f88307f;
                        iVar2 = this.f88306e;
                        map2 = this.f88305d;
                        Sc.s.b(obj);
                        map3 = (Map) ((ru.ozon.android.messenger.utils.i) obj).a();
                        if (map3 == null) {
                            map3 = kotlin.collections.U.c();
                        }
                        iVar2.getClass();
                        if (!(iVar2 instanceof i.b) && getChatsResponseDTO2 != null) {
                            return new i.b(i12.f88290m.c(i12.f88278a.e(getChatsResponseDTO2), map3, map2));
                        }
                        i.a aVar2 = !(iVar2 instanceof i.a) ? (i.a) iVar2 : null;
                        return aVar2 != null ? new i.a.e("Undefined result of getChats") : aVar2;
                    }
                    map = this.f88305d;
                    Sc.s.b(obj);
                    iVar = (ru.ozon.android.messenger.utils.i) obj;
                    map2 = map;
                    iVar2 = iVar;
                    GetChatsResponseDTO getChatsResponseDTO32 = (GetChatsResponseDTO) iVar2.a();
                    c0 c0Var2 = i12.f88283f;
                    this.f88305d = map2;
                    this.f88306e = iVar2;
                    this.f88307f = getChatsResponseDTO32;
                    this.f88308g = 5;
                    b11 = c0Var2.b(this);
                    if (b11 != aVar) {
                        getChatsResponseDTO2 = getChatsResponseDTO32;
                        obj = b11;
                        map3 = (Map) ((ru.ozon.android.messenger.utils.i) obj).a();
                        if (map3 == null) {
                        }
                        iVar2.getClass();
                        if (!(iVar2 instanceof i.b)) {
                        }
                        if (!(iVar2 instanceof i.a)) {
                        }
                        if (aVar2 != null) {
                        }
                    }
                    return aVar;
                }
                Sc.s.b(obj);
            }
            Map<String, ru.ozon.android.messenger.blocks.input.b> map4 = (Map) ((ru.ozon.android.messenger.utils.i) obj).a();
            if (map4 == null) {
                map4 = kotlin.collections.U.c();
            }
            C9331b c9331b = i12.f88280c;
            this.f88305d = map4;
            this.f88308g = 2;
            Object n11 = c9331b.n(getChatsRequest, this);
            if (n11 != aVar) {
                map = map4;
                obj = n11;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                getChatsResponseDTO = (GetChatsResponseDTO) iVar.a();
                if (getChatsResponseDTO == null) {
                }
            }
            return aVar;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$getMessages$2", f = "ChatRepositoryImpl.kt", l = {94, 97, 103, 109}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.h>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Object f88311d;

        /* renamed from: e, reason: collision with root package name */
        int f88312e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.b f88314g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ru.ozon.android.messenger.framework.data.requests.b bVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f88314g = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return I.this.new d(this.f88314g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.h>> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
        
            if (r3.b(r6, r9, r8) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
        
            if (r9 == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0044, code lost:
        
            if (r9 == r0) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ru.ozon.android.messenger.utils.i iVar;
            GetMessagesResponseDTO getMessagesResponseDTO;
            List<UndeliveredMessageEntity> list;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88312e;
            ru.ozon.android.messenger.framework.data.requests.b bVar = this.f88314g;
            I i12 = I.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9331b c9331b = i12.f88280c;
                this.f88312e = 1;
                obj = c9331b.q(bVar, this);
            } else if (i11 == 1) {
                Sc.s.b(obj);
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        getMessagesResponseDTO = (GetMessagesResponseDTO) this.f88311d;
                        Sc.s.b(obj);
                        list = (List) ((ru.ozon.android.messenger.utils.i) obj).a();
                        if (list == null) {
                            list = kotlin.collections.K.f71697a;
                        }
                        return new i.b(i12.f88284g.a(getMessagesResponseDTO, bVar.e(), list));
                    }
                    Sc.s.b(obj);
                    iVar = (ru.ozon.android.messenger.utils.i) obj;
                    GetMessagesResponseDTO getMessagesResponseDTO2 = (GetMessagesResponseDTO) iVar.a();
                    if ((iVar instanceof i.b) || getMessagesResponseDTO2 == null) {
                        i.a aVar2 = !(iVar instanceof i.a) ? (i.a) iVar : null;
                        return aVar2 != null ? new i.a.e("Undefined result of getMessages") : aVar2;
                    }
                    c0 c0Var = i12.f88283f;
                    String d11 = bVar.d();
                    this.f88311d = getMessagesResponseDTO2;
                    this.f88312e = 4;
                    Object f7 = c0Var.f(d11, this);
                    if (f7 != aVar) {
                        getMessagesResponseDTO = getMessagesResponseDTO2;
                        obj = f7;
                        list = (List) ((ru.ozon.android.messenger.utils.i) obj).a();
                        if (list == null) {
                        }
                        return new i.b(i12.f88284g.a(getMessagesResponseDTO, bVar.e(), list));
                    }
                    return aVar;
                }
                iVar = (ru.ozon.android.messenger.utils.i) this.f88311d;
                Sc.s.b(obj);
                GetMessagesResponseDTO getMessagesResponseDTO22 = (GetMessagesResponseDTO) iVar.a();
                if (iVar instanceof i.b) {
                }
                if (!(iVar instanceof i.a)) {
                }
                if (aVar2 != null) {
                }
            }
            iVar = (ru.ozon.android.messenger.utils.i) obj;
            GetMessagesResponseDTO getMessagesResponseDTO3 = (GetMessagesResponseDTO) iVar.a();
            if (getMessagesResponseDTO3 != null) {
                ru.ozon.android.messenger.framework.data.cache.f fVar = i12.f88282e;
                this.f88311d = iVar;
                this.f88312e = 2;
            } else {
                ru.ozon.android.messenger.framework.data.cache.f fVar2 = i12.f88282e;
                this.f88312e = 3;
                obj = fVar2.e(bVar, this);
            }
            return aVar;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$initializeChat$2", f = "ChatRepositoryImpl.kt", l = {255}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.i>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88315d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.c f88317f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ru.ozon.android.messenger.framework.data.requests.c cVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f88317f = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return I.this.new e(this.f88317f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.i>> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88315d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            C9331b c9331b = I.this.f88280c;
            this.f88315d = 1;
            Object t2 = c9331b.t(this.f88317f, this);
            return t2 == aVar ? aVar : t2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$searchChats$2", f = "ChatRepositoryImpl.kt", l = {210}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.k>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88318d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.f f88320f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ru.ozon.android.messenger.framework.data.requests.f fVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f88320f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return I.this.new f(this.f88320f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.k>> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88318d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            C9331b c9331b = I.this.f88280c;
            this.f88318d = 1;
            Object v11 = c9331b.v(this.f88320f, this);
            return v11 == aVar ? aVar : v11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$sendMessage$2", f = "ChatRepositoryImpl.kt", l = {140, 142, 175, 178}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.l>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Object f88321d;

        /* renamed from: e, reason: collision with root package name */
        I f88322e;

        /* renamed from: f, reason: collision with root package name */
        Object f88323f;

        /* renamed from: g, reason: collision with root package name */
        int f88324g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f88325h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ I f88326i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.remote.models.c f88327j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f88328k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ru.ozon.android.messenger.framework.presentation.models.q qVar, I i11, ru.ozon.android.messenger.framework.data.remote.models.c cVar, String str, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f88325h = qVar;
            this.f88326i = i11;
            this.f88327j = cVar;
            this.f88328k = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f88325h, this.f88326i, this.f88327j, this.f88328k, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.l>> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:125:0x00a0, code lost:
        
            if (r11 == r2) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x039b, code lost:
        
            if (r1 != r2) goto L104;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ru.ozon.android.messenger.framework.presentation.models.q a11;
            Object R11;
            ru.ozon.android.messenger.framework.data.remote.models.c cVar;
            y0 f7;
            SendMessageRequest sendMessageRequest;
            Map<String, String> custom;
            SendMessageRequest sendMessageRequest2;
            Map<String, String> custom2;
            String str;
            Iterator it;
            Object w11;
            SendMessagesResponseDTO sendMessagesResponseDTO;
            I i11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i12 = this.f88324g;
            Throwable th2 = null;
            ru.ozon.android.messenger.framework.presentation.models.q qVar = this.f88325h;
            I i13 = this.f88326i;
            if (i12 == 0) {
                Sc.s.b(obj);
                ru.ozon.android.messenger.framework.presentation.models.p c11 = qVar.c();
                Intrinsics.g(c11, "null cannot be cast to non-null type ru.ozon.android.messenger.framework.presentation.models.MessageItemInfo");
                DateTime dateTime = new DateTime();
                Intrinsics.checkNotNullExpressionValue(dateTime, "now(...)");
                a11 = ru.ozon.android.messenger.framework.presentation.models.q.a(qVar, null, ru.ozon.android.messenger.framework.presentation.models.s.d((ru.ozon.android.messenger.framework.presentation.models.s) c11, null, null, dateTime, 1000.0d * r12.h().getMillis(), false, false, 0, null, 262063), 1);
                this.f88321d = a11;
                this.f88324g = 1;
                R11 = I.R(i13, this.f88327j, this);
            } else if (i12 == 1) {
                a11 = (ru.ozon.android.messenger.framework.presentation.models.q) this.f88321d;
                Sc.s.b(obj);
                R11 = obj;
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sendMessagesResponseDTO = (SendMessagesResponseDTO) this.f88323f;
                        i11 = this.f88322e;
                        cVar = (ru.ozon.android.messenger.framework.data.remote.models.c) this.f88321d;
                        Sc.s.b(obj);
                        i11.f88282e.d(cVar.b(), sendMessagesResponseDTO.getItem());
                        return i11.f88278a.i(sendMessagesResponseDTO);
                    }
                    qVar = (ru.ozon.android.messenger.framework.presentation.models.q) this.f88323f;
                    i13 = this.f88322e;
                    ru.ozon.android.messenger.framework.data.remote.models.c cVar2 = (ru.ozon.android.messenger.framework.data.remote.models.c) this.f88321d;
                    Sc.s.b(obj);
                    cVar = cVar2;
                    w11 = obj;
                    ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) w11;
                    SendMessagesResponseDTO sendMessagesResponseDTO2 = (SendMessagesResponseDTO) iVar.a();
                    if (!(iVar instanceof i.b) || sendMessagesResponseDTO2 == null) {
                        i.a aVar2 = iVar instanceof i.a ? (i.a) iVar : null;
                        return aVar2 == null ? new i.a.e("Undefined result of sendMessage") : aVar2;
                    }
                    c0 c0Var = i13.f88283f;
                    String d11 = ru.ozon.android.messenger.framework.presentation.models.r.d(qVar);
                    this.f88321d = cVar;
                    this.f88322e = i13;
                    this.f88323f = sendMessagesResponseDTO2;
                    this.f88324g = 4;
                    if (c0Var.d(d11, this) != aVar) {
                        sendMessagesResponseDTO = sendMessagesResponseDTO2;
                        i11 = i13;
                        i11.f88282e.d(cVar.b(), sendMessagesResponseDTO.getItem());
                        return i11.f88278a.i(sendMessagesResponseDTO);
                    }
                    return aVar;
                }
                cVar = (ru.ozon.android.messenger.framework.data.remote.models.c) this.f88321d;
                Sc.s.b(obj);
                ru.ozon.android.messenger.framework.data.remote.mapper.i iVar2 = i13.f88297t;
                f7 = cVar.f();
                if (f7 instanceof y0.c) {
                    boolean z11 = f7 instanceof y0.d;
                    String str2 = this.f88328k;
                    if (z11) {
                        String messageText = ((y0.d) cVar.f()).b();
                        CustomBlockDTO a12 = ((y0.d) cVar.f()).a();
                        if (a12 == null || (custom2 = a12.getPayload()) == null) {
                            custom2 = kotlin.collections.U.c();
                        }
                        iVar2.getClass();
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        Intrinsics.checkNotNullParameter(messageText, "messageText");
                        Intrinsics.checkNotNullParameter(custom2, "custom");
                        ArrayList arrayList = new ArrayList();
                        int i14 = 0;
                        int i15 = 6;
                        int i16 = 0;
                        for (Iterator it2 = kotlin.text.h.m(messageText, new String[]{"\n"}, 0, 6).iterator(); it2.hasNext(); it2 = it) {
                            Object next = it2.next();
                            int i17 = i16 + 1;
                            if (i16 < 0) {
                                Throwable th3 = th2;
                                C7714v.O0();
                                throw th3;
                            }
                            String str3 = (String) next;
                            if (i16 > 0) {
                                arrayList.add(new MessageTextDTO.MessageTextType.NewLine());
                            }
                            if (str3.length() == 0) {
                                it = it2;
                            } else {
                                it = it2;
                                List m11 = kotlin.text.h.m(str3, new String[]{" "}, i14, i15);
                                Iterator it3 = m11.iterator();
                                int i18 = i14;
                                String str4 = "";
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    int i19 = i18 + 1;
                                    if (i18 < 0) {
                                        C7714v.O0();
                                        throw null;
                                    }
                                    List list = m11;
                                    String str5 = (String) next2;
                                    Iterator it4 = it3;
                                    if (x2.e.f104937a.matcher(str5).find()) {
                                        if (!kotlin.text.h.K(str4)) {
                                            if (kotlin.text.h.M(str4) != ' ') {
                                                str4 = ((Object) str4) + " ";
                                            }
                                            arrayList.add(new MessageTextDTO.MessageTextType.TextType(str4));
                                            str4 = "";
                                        }
                                        arrayList.add(new MessageTextDTO.MessageTextType.LinkType(str5, str5, null, null));
                                    } else {
                                        int length = str5.length();
                                        if (i18 != 0) {
                                            if (length == 0) {
                                                str5 = " ";
                                            }
                                            str5 = " " + ((Object) str5);
                                        } else if (length == 0) {
                                            str5 = " ";
                                        }
                                        String str6 = ((Object) str4) + str5;
                                        if (i18 == C7714v.P(list)) {
                                            arrayList.add(new MessageTextDTO.MessageTextType.TextType(str6));
                                        }
                                        str4 = str6;
                                    }
                                    it3 = it4;
                                    i18 = i19;
                                    m11 = list;
                                }
                            }
                            th2 = null;
                            i16 = i17;
                            i15 = 6;
                            i14 = 0;
                        }
                        String b11 = cVar.b();
                        String d12 = cVar.d();
                        Tc.b B11 = C7714v.B();
                        if (custom2.isEmpty()) {
                            str = "builder";
                        } else {
                            str = "builder";
                            B11.add(new SendMessageRequest.Blocks("custom", cVar.h(), custom2));
                        }
                        if (!arrayList.isEmpty()) {
                            B11.add(new SendMessageRequest.Blocks(f.c.TEXT.b(), cVar.h(), new SendMessageRequest.TextState.Text(arrayList)));
                        }
                        Unit unit = Unit.f71690a;
                        Intrinsics.checkNotNullParameter(B11, str);
                        sendMessageRequest2 = new SendMessageRequest(b11, d12, B11.B(), cVar.c(), str2, cVar.g(), 32);
                    } else if (f7 instanceof y0.a) {
                        String rawMessage = ((y0.a) cVar.f()).c();
                        CustomBlockDTO b12 = ((y0.a) cVar.f()).b();
                        if (b12 == null || (custom = b12.getPayload()) == null) {
                            custom = kotlin.collections.U.c();
                        }
                        Map<String, String> a13 = ((y0.a) cVar.f()).a();
                        iVar2.getClass();
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        Intrinsics.checkNotNullParameter(rawMessage, "rawMessage");
                        Intrinsics.checkNotNullParameter(custom, "custom");
                        List a02 = C7714v.a0(new MessageTextDTO.MessageTextType.TextType(rawMessage));
                        Tc.b builder = C7714v.B();
                        if (!custom.isEmpty()) {
                            builder.add(new SendMessageRequest.Blocks("custom", cVar.h(), custom));
                        }
                        builder.add(new SendMessageRequest.Blocks(f.c.TEXT.b(), cVar.h(), new SendMessageRequest.TextState.Text(a02)));
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        sendMessageRequest2 = new SendMessageRequest(cVar.b(), cVar.d(), builder.B(), cVar.c(), str2, a13, cVar.g());
                    } else {
                        if (!(f7 instanceof y0.b)) {
                            throw new Sc.o();
                        }
                        FileDTO fileDTO = ((y0.b) cVar.f()).a();
                        iVar2.getClass();
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        Intrinsics.checkNotNullParameter(fileDTO, "fileDTO");
                        sendMessageRequest = new SendMessageRequest(cVar.b(), cVar.d(), C7714v.a0(new SendMessageRequest.Blocks(f.c.FILE.b(), cVar.h(), fileDTO)), cVar.c(), (String) null, cVar.g(), 48);
                    }
                    sendMessageRequest = sendMessageRequest2;
                } else {
                    ImageDTO imageDTO = ((y0.c) cVar.f()).a();
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    Intrinsics.checkNotNullParameter(imageDTO, "imageDTO");
                    sendMessageRequest = new SendMessageRequest(cVar.b(), cVar.d(), C7714v.a0(new SendMessageRequest.Blocks(f.c.IMAGE.b(), cVar.h(), imageDTO)), cVar.c(), (String) null, cVar.g(), 48);
                }
                C9331b c9331b = i13.f88280c;
                this.f88321d = cVar;
                this.f88322e = i13;
                this.f88323f = qVar;
                this.f88324g = 3;
                w11 = c9331b.w(sendMessageRequest, this);
            }
            ru.ozon.android.messenger.framework.data.remote.models.c cVar3 = (ru.ozon.android.messenger.framework.data.remote.models.c) ((ru.ozon.android.messenger.utils.i) R11).a();
            if (cVar3 == null) {
                return new i.a.e("Undefined result of sendMessage");
            }
            c0 c0Var2 = i13.f88283f;
            String b13 = cVar3.b();
            this.f88321d = cVar3;
            this.f88324g = 2;
            if (c0Var2.g(b13, this, cVar3, a11) != aVar) {
                cVar = cVar3;
                ru.ozon.android.messenger.framework.data.remote.mapper.i iVar22 = i13.f88297t;
                f7 = cVar.f();
                if (f7 instanceof y0.c) {
                }
                C9331b c9331b2 = i13.f88280c;
                this.f88321d = cVar;
                this.f88322e = i13;
                this.f88323f = qVar;
                this.f88324g = 3;
                w11 = c9331b2.w(sendMessageRequest, this);
            }
            return aVar;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$setAiState$2", f = "ChatRepositoryImpl.kt", l = {264}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88329d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.ai.a f88331f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ru.ozon.android.messenger.framework.data.requests.ai.a aVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f88331f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return I.this.new h(this.f88331f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88329d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            C9331b c9331b = I.this.f88280c;
            this.f88329d = 1;
            Object x11 = c9331b.x(this.f88331f, this);
            return x11 == aVar ? aVar : x11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$setReadMessages$2", f = "ChatRepositoryImpl.kt", l = {321}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88332d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.g f88334f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$setReadMessages$2$1", f = "ChatRepositoryImpl.kt", l = {321}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f88335d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ I f88336e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.g f88337f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(I i11, ru.ozon.android.messenger.framework.data.requests.g gVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f88336e = i11;
                this.f88337f = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f88336e, this.f88337f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f88335d;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return obj;
                }
                Sc.s.b(obj);
                C9331b c9331b = this.f88336e.f88280c;
                this.f88335d = 1;
                Object y11 = c9331b.y(this.f88337f, this);
                return y11 == aVar ? aVar : y11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ru.ozon.android.messenger.framework.data.requests.g gVar, kotlin.coroutines.d<? super i> dVar) {
            super(1, dVar);
            this.f88334f = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return I.this.new i(this.f88334f, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>> dVar) {
            return ((i) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88332d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            I i12 = I.this;
            xe.I i13 = i12.f88288k;
            a aVar2 = new a(i12, this.f88334f, null);
            this.f88332d = 1;
            Object f7 = C10727i.f(i13, aVar2, this);
            return f7 == aVar ? aVar : f7;
        }
    }

    static final class j extends AbstractC7737t implements Function0<ru.ozon.android.messenger.utils.coroutines.a<ru.ozon.android.messenger.utils.i<? extends Object>>> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f88338b = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.utils.coroutines.a<ru.ozon.android.messenger.utils.i<? extends Object>> invoke() {
            return new ru.ozon.android.messenger.utils.coroutines.a<>();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$setState$2", f = "ChatRepositoryImpl.kt", l = {261}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88339d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.h f88341f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ru.ozon.android.messenger.framework.data.requests.h hVar, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f88341f = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return I.this.new k(this.f88341f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>> dVar) {
            return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88339d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            C9331b c9331b = I.this.f88280c;
            this.f88339d = 1;
            Object z11 = c9331b.z(this.f88341f, this);
            return z11 == aVar ? aVar : z11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$setUserIsTyping$2", f = "ChatRepositoryImpl.kt", l = {325}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88342d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.k f88344f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ru.ozon.android.messenger.framework.data.requests.k kVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f88344f = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return I.this.new l(this.f88344f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>> dVar) {
            return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88342d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            C9331b c9331b = I.this.f88280c;
            this.f88342d = 1;
            Object C11 = c9331b.C(this.f88344f, this);
            return C11 == aVar ? aVar : C11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$startOrGetChat$2", f = "ChatRepositoryImpl.kt", l = {252}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.m>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88345d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.i f88347f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ru.ozon.android.messenger.framework.data.requests.i iVar, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f88347f = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return I.this.new m(this.f88347f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.m>> dVar) {
            return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88345d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            C9331b c9331b = I.this.f88280c;
            this.f88345d = 1;
            Object A11 = c9331b.A(this.f88347f, this);
            return A11 == aVar ? aVar : A11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$updateMessage$2", f = "ChatRepositoryImpl.kt", l = {310}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.n>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88348d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.data.remote.models.c f88349e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f88350f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f88351g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ I f88352h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ru.ozon.android.messenger.framework.data.remote.models.c cVar, String str, String str2, I i11, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f88349e = cVar;
            this.f88350f = str;
            this.f88351g = str2;
            this.f88352h = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new n(this.f88349e, this.f88350f, this.f88351g, this.f88352h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.n>> dVar) {
            return ((n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String b11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88348d;
            I i12 = this.f88352h;
            if (i11 == 0) {
                Sc.s.b(obj);
                ru.ozon.android.messenger.framework.data.remote.models.c cVar = this.f88349e;
                y0 f7 = cVar.f();
                y0.d dVar = f7 instanceof y0.d ? (y0.d) f7 : null;
                if (dVar == null || (b11 = dVar.b()) == null) {
                    return new i.a.e("No text for updateMessage");
                }
                ru.ozon.android.messenger.framework.data.requests.j jVar = new ru.ozon.android.messenger.framework.data.requests.j(cVar.b(), cVar.d(), this.f88350f, this.f88351g, C7714v.a0(new SendMessageRequest.Blocks(f.c.TEXT.b(), cVar.h(), new SendMessageRequest.TextState.Text(C7714v.a0(new MessageTextDTO.MessageTextType.TextType(b11))))));
                C9331b c9331b = i12.f88280c;
                this.f88348d = 1;
                obj = c9331b.B(jVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
            UpdateMessageResponseDTO updateMessageResponseDTO = (UpdateMessageResponseDTO) iVar.a();
            if ((iVar instanceof i.b) && updateMessageResponseDTO != null) {
                return i12.f88278a.j(updateMessageResponseDTO);
            }
            i.a aVar2 = iVar instanceof i.a ? (i.a) iVar : null;
            return aVar2 == null ? new i.a.e("Failed to update message") : aVar2;
        }
    }

    public I(@NotNull ru.ozon.android.messenger.framework.data.remote.mapper.g responseMapper, @NotNull ru.ozon.android.messenger.framework.data.remote.mapper.c eventMapper, @NotNull C9331b socketDataSource, @NotNull ru.ozon.android.messenger.framework.data.cache.b chatListDataCache, @NotNull ru.ozon.android.messenger.framework.data.cache.f chatRoomDataCache, @NotNull c0 undeliveredMessagesRepository, @NotNull X messagesPageCombiner, @NotNull ru.ozon.android.messenger.framework.data.local.mapper.c undeliveredMessagesMapper, @NotNull ru.ozon.android.messenger.framework.data.local.s internalBlocksDataSource, @NotNull xe.M externalScope, @NotNull xe.I ioDispatcher, @NotNull ru.ozon.android.messenger.framework.domain.repository.c filterStateDataSource, @NotNull H chatListPageModifier, @NotNull ru.ozon.android.messenger.blocks.input.attachments.data.g uploadAttachmentsRepository, @NotNull S draftsRepository) {
        Intrinsics.checkNotNullParameter(responseMapper, "responseMapper");
        Intrinsics.checkNotNullParameter(eventMapper, "eventMapper");
        Intrinsics.checkNotNullParameter(socketDataSource, "socketDataSource");
        Intrinsics.checkNotNullParameter(chatListDataCache, "chatListDataCache");
        Intrinsics.checkNotNullParameter(chatRoomDataCache, "chatRoomDataCache");
        Intrinsics.checkNotNullParameter(undeliveredMessagesRepository, "undeliveredMessagesRepository");
        Intrinsics.checkNotNullParameter(messagesPageCombiner, "messagesPageCombiner");
        Intrinsics.checkNotNullParameter(undeliveredMessagesMapper, "undeliveredMessagesMapper");
        Intrinsics.checkNotNullParameter(internalBlocksDataSource, "internalBlocksDataSource");
        Intrinsics.checkNotNullParameter(externalScope, "externalScope");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(filterStateDataSource, "filterStateDataSource");
        Intrinsics.checkNotNullParameter(chatListPageModifier, "chatListPageModifier");
        Intrinsics.checkNotNullParameter(uploadAttachmentsRepository, "uploadAttachmentsRepository");
        Intrinsics.checkNotNullParameter(draftsRepository, "draftsRepository");
        this.f88278a = responseMapper;
        this.f88279b = eventMapper;
        this.f88280c = socketDataSource;
        this.f88281d = chatListDataCache;
        this.f88282e = chatRoomDataCache;
        this.f88283f = undeliveredMessagesRepository;
        this.f88284g = messagesPageCombiner;
        this.f88285h = undeliveredMessagesMapper;
        this.f88286i = internalBlocksDataSource;
        this.f88287j = externalScope;
        this.f88288k = ioDispatcher;
        this.f88289l = filterStateDataSource;
        this.f88290m = chatListPageModifier;
        this.f88291n = uploadAttachmentsRepository;
        this.f88292o = draftsRepository;
        this.f88293p = socketDataSource.o();
        this.f88294q = socketDataSource.r();
        this.f88295r = O0.a(ru.ozon.android.messenger.framework.data.local.r.IDLE);
        this.f88296s = ru.ozon.android.messenger.utils.f.b(j.f88338b);
        this.f88297t = new ru.ozon.android.messenger.framework.data.remote.mapper.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R(I i11, ru.ozon.android.messenger.framework.data.remote.models.c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        P p11;
        int i12;
        String a11;
        y0 y0Var;
        y0 y0Var2;
        ru.ozon.android.messenger.blocks.input.attachments.data.b bVar;
        String g10;
        ru.ozon.android.messenger.blocks.input.attachments.data.a aVar;
        String h11;
        i11.getClass();
        if (cVar2 instanceof P) {
            p11 = (P) cVar2;
            int i13 = p11.f88380h;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                p11.f88380h = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = p11.f88378f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i12 = p11.f88380h;
                if (i12 == 0) {
                    if (i12 == 1) {
                        y0Var2 = p11.f88377e;
                        cVar = p11.f88376d;
                        Sc.s.b(obj);
                        bVar = (ru.ozon.android.messenger.blocks.input.attachments.data.b) ((ru.ozon.android.messenger.utils.i) obj).a();
                        if (bVar != null || (g10 = bVar.g()) == null) {
                            return new i.b(cVar);
                        }
                        ImageDTO imageDTO = ImageDTO.copy$default(((y0.c) y0Var2).a(), g10, null, null, null, null, null, 62, null);
                        Intrinsics.checkNotNullParameter(imageDTO, "imageDTO");
                        return new i.b(ru.ozon.android.messenger.framework.data.remote.models.c.a(cVar, new y0.c(imageDTO)));
                    }
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y0Var = p11.f88377e;
                    cVar = p11.f88376d;
                    Sc.s.b(obj);
                    aVar = (ru.ozon.android.messenger.blocks.input.attachments.data.a) ((ru.ozon.android.messenger.utils.i) obj).a();
                    if (aVar != null || (h11 = aVar.h()) == null) {
                        return new i.b(cVar);
                    }
                    FileDTO fileDTO = FileDTO.copy$default(((y0.b) y0Var).a(), h11, null, null, null, null, 30, null);
                    Intrinsics.checkNotNullParameter(fileDTO, "fileDTO");
                    return new i.b(ru.ozon.android.messenger.framework.data.remote.models.c.a(cVar, new y0.b(fileDTO)));
                }
                Sc.s.b(obj);
                if (cVar.i() && (a11 = a.b.a()) != null) {
                    y0 f7 = cVar.f();
                    boolean z11 = f7 instanceof y0.c;
                    ru.ozon.android.messenger.framework.data.remote.mapper.i iVar = i11.f88297t;
                    ru.ozon.android.messenger.blocks.input.attachments.data.g gVar = i11.f88291n;
                    if (z11) {
                        y0.c sendMessageData = (y0.c) f7;
                        String localUrl = sendMessageData.a().getLocalUrl();
                        if (localUrl == null) {
                            return new i.b(cVar);
                        }
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(sendMessageData, "sendMessageData");
                        Intrinsics.checkNotNullParameter(localUrl, "localUrl");
                        UUID randomUUID = UUID.randomUUID();
                        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
                        Uri parse = Uri.parse(localUrl);
                        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                        ru.ozon.android.messenger.blocks.input.attachments.data.b bVar2 = new ru.ozon.android.messenger.blocks.input.attachments.data.b(randomUUID, (String) null, parse, sendMessageData.a().getMime(), sendMessageData.a().getWidth(), sendMessageData.a().getHeight(), 10);
                        p11.f88376d = cVar;
                        p11.f88377e = f7;
                        p11.f88380h = 1;
                        obj = gVar.b(bVar2, a11, p11);
                        if (obj != aVar2) {
                            y0Var2 = f7;
                            bVar = (ru.ozon.android.messenger.blocks.input.attachments.data.b) ((ru.ozon.android.messenger.utils.i) obj).a();
                            if (bVar != null) {
                            }
                            return new i.b(cVar);
                        }
                    } else {
                        if (!(f7 instanceof y0.b)) {
                            return new i.b(cVar);
                        }
                        y0.b sendMessageData2 = (y0.b) f7;
                        String localUrl2 = sendMessageData2.a().getLocalUrl();
                        if (localUrl2 == null) {
                            return new i.b(cVar);
                        }
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(sendMessageData2, "sendMessageData");
                        Intrinsics.checkNotNullParameter(localUrl2, "localUrl");
                        UUID randomUUID2 = UUID.randomUUID();
                        Intrinsics.checkNotNullExpressionValue(randomUUID2, "randomUUID(...)");
                        Uri parse2 = Uri.parse(localUrl2);
                        Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
                        ru.ozon.android.messenger.blocks.input.attachments.data.a aVar3 = new ru.ozon.android.messenger.blocks.input.attachments.data.a(randomUUID2, (String) null, parse2, sendMessageData2.a().getMime(), sendMessageData2.a().getName(), sendMessageData2.a().getSize(), 10);
                        p11.f88376d = cVar;
                        p11.f88377e = f7;
                        p11.f88380h = 2;
                        obj = gVar.a(aVar3, a11, p11);
                        if (obj != aVar2) {
                            y0Var = f7;
                            aVar = (ru.ozon.android.messenger.blocks.input.attachments.data.a) ((ru.ozon.android.messenger.utils.i) obj).a();
                            if (aVar != null) {
                            }
                            return new i.b(cVar);
                        }
                    }
                    return aVar2;
                }
                return new i.b(cVar);
            }
        }
        p11 = new P(i11, cVar2);
        Object obj2 = p11.f88378f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i12 = p11.f88380h;
        if (i12 == 0) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object A(@NotNull ru.ozon.android.messenger.framework.data.requests.g gVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>> dVar) {
        return ((ru.ozon.android.messenger.utils.coroutines.a) this.f88296s.getValue()).b(new i(gVar, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object B(@NotNull ru.ozon.android.messenger.framework.data.requests.h hVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>> dVar) {
        return C10727i.f(this.f88288k, new k(hVar, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final M0 C() {
        return this.f88295r;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        M m11;
        int i11;
        I i12;
        UndeliveredMessageEntity entity;
        y0 bVar;
        if (cVar instanceof M) {
            m11 = (M) cVar;
            int i13 = m11.f88370g;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                m11.f88370g = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = m11.f88368e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = m11.f88370g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    m11.f88367d = this;
                    m11.f88370g = 1;
                    obj = this.f88283f.e(str, m11);
                    if (obj == aVar) {
                        return aVar;
                    }
                    i12 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = m11.f88367d;
                    Sc.s.b(obj);
                }
                entity = (UndeliveredMessageEntity) ((ru.ozon.android.messenger.utils.i) obj).a();
                if (entity != null) {
                    return null;
                }
                i12.f88285h.getClass();
                Intrinsics.checkNotNullParameter(entity, "entity");
                UndeliveredMessageEntity.UndeliveredMessage c11 = entity.c();
                if (c11 instanceof UndeliveredMessageEntity.UndeliveredMessage.Text) {
                    UndeliveredMessageEntity.UndeliveredMessage.Text text = (UndeliveredMessageEntity.UndeliveredMessage.Text) c11;
                    bVar = new y0.d(text.getMessageText(), text.getCustomBlockDTO());
                } else if (c11 instanceof UndeliveredMessageEntity.UndeliveredMessage.Image) {
                    bVar = new y0.c(((UndeliveredMessageEntity.UndeliveredMessage.Image) c11).getImageDTO());
                } else {
                    if (!(c11 instanceof UndeliveredMessageEntity.UndeliveredMessage.File)) {
                        throw new Sc.o();
                    }
                    bVar = new y0.b(((UndeliveredMessageEntity.UndeliveredMessage.File) c11).getFileDTO());
                }
                y0 y0Var = bVar;
                UndeliveredMessageEntity.UndeliveredMessage c12 = entity.c();
                UndeliveredMessageEntity.UndeliveredMessage.Text text2 = c12 instanceof UndeliveredMessageEntity.UndeliveredMessage.Text ? (UndeliveredMessageEntity.UndeliveredMessage.Text) c12 : null;
                String replyToMessageId = text2 != null ? text2.getReplyToMessageId() : null;
                UndeliveredMessageEntity.UndeliveredMessage c13 = entity.c();
                UndeliveredMessageEntity.UndeliveredMessage.Text text3 = c13 instanceof UndeliveredMessageEntity.UndeliveredMessage.Text ? (UndeliveredMessageEntity.UndeliveredMessage.Text) c13 : null;
                return new ru.ozon.android.messenger.framework.data.remote.models.c(entity.a(), entity.b(), 1L, y0Var, ru.ozon.android.messenger.framework.data.remote.mapper.j.b(u0.a.a()), true, replyToMessageId, text3 != null ? text3.getLocalMessageBlock() : null);
            }
        }
        m11 = new M(this, cVar);
        Object obj2 = m11.f88368e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = m11.f88370g;
        if (i11 != 0) {
        }
        entity = (UndeliveredMessageEntity) ((ru.ozon.android.messenger.utils.i) obj2).a();
        if (entity != null) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    @NotNull
    public final M0<NetworkInfo> E() {
        return this.f88294q;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object F(String str, @NotNull kotlin.coroutines.d dVar, @NotNull ru.ozon.android.messenger.framework.data.remote.models.c cVar, @NotNull ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        return C10727i.f(this.f88287j.getCoroutineContext().plus(this.f88288k), new g(qVar, this, cVar, str, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = this.f88283f.a(str, dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        N n11;
        int i11;
        I i12;
        if (cVar instanceof N) {
            n11 = (N) cVar;
            int i13 = n11.f88374g;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                n11.f88374g = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = n11.f88372e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = n11.f88374g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    n11.f88371d = this;
                    n11.f88374g = 1;
                    obj = this.f88283f.b(n11);
                    if (obj == aVar) {
                        return aVar;
                    }
                    i12 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = n11.f88371d;
                    Sc.s.b(obj);
                }
                Map map = (Map) ((ru.ozon.android.messenger.utils.i) obj).a();
                return map == null ? ru.ozon.android.messenger.utils.b.d(map, new O(i12)) : (Serializable) kotlin.collections.U.c();
            }
        }
        n11 = new N(this, cVar);
        Object obj2 = n11.f88372e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = n11.f88374g;
        if (i11 != 0) {
        }
        Map map2 = (Map) ((ru.ozon.android.messenger.utils.i) obj2).a();
        if (map2 == null) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    @NotNull
    public final id.f c() {
        Intrinsics.checkNotNullParameter("PREFERENCES_HIDE_READ_KEY", "filterKey");
        return this.f88289l.c();
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object d(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object d11 = this.f88283f.d(str, cVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object e(@NotNull ru.ozon.android.messenger.framework.data.requests.i iVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.m>> dVar) {
        return C10727i.f(this.f88288k, new m(iVar, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final void f(@NotNull ru.ozon.android.messenger.framework.data.local.r initializeStatus) {
        Intrinsics.checkNotNullParameter(initializeStatus, "initializeStatus");
        this.f88295r.setValue(initializeStatus);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object g(@NotNull ru.ozon.android.messenger.framework.data.requests.b bVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<ru.ozon.android.messenger.framework.presentation.models.responses.h>> dVar) {
        return C10727i.f(this.f88288k, new d(bVar, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final C2406m0 getEvents() {
        return new C2406m0(new J(new C2408n0(this.f88280c.p(), new K(this, null)), this.f88279b));
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    @NotNull
    public final NetworkInfo h() {
        return this.f88280c.l();
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final void i(@NotNull String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.f88282e.c(chatId);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object j(@NotNull GetChatsRequest getChatsRequest, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<ru.ozon.android.messenger.framework.presentation.models.responses.g>> dVar) {
        return C10727i.f(this.f88288k, new c(getChatsRequest, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object k(@NotNull ru.ozon.android.messenger.framework.data.remote.models.c cVar, @NotNull String str, String str2, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<ru.ozon.android.messenger.framework.presentation.models.responses.n>> dVar) {
        return C10727i.f(this.f88287j.getCoroutineContext().plus(this.f88288k), new n(cVar, str2, str, this, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    @NotNull
    public final M0<AbstractC9330a> l() {
        return this.f88293p;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object m(@NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Unit f7 = this.f88282e.f(str, str2);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final boolean n() {
        return this.f88281d.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        L l11;
        int i11;
        I i12;
        UndeliveredMessageEntity undeliveredMessageEntity;
        if (cVar instanceof L) {
            l11 = (L) cVar;
            int i13 = l11.f88366g;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                l11.f88366g = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = l11.f88364e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = l11.f88366g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    l11.f88363d = this;
                    l11.f88366g = 1;
                    obj = this.f88283f.e(str, l11);
                    if (obj == aVar) {
                        return aVar;
                    }
                    i12 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = l11.f88363d;
                    Sc.s.b(obj);
                }
                undeliveredMessageEntity = (UndeliveredMessageEntity) ((ru.ozon.android.messenger.utils.i) obj).a();
                if (undeliveredMessageEntity == null) {
                    return i12.f88285h.c(undeliveredMessageEntity);
                }
                return null;
            }
        }
        l11 = new L(this, cVar);
        Object obj2 = l11.f88364e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = l11.f88366g;
        if (i11 != 0) {
        }
        undeliveredMessageEntity = (UndeliveredMessageEntity) ((ru.ozon.android.messenger.utils.i) obj2).a();
        if (undeliveredMessageEntity == null) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object p(@NotNull ru.ozon.android.messenger.framework.data.requests.f fVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<ru.ozon.android.messenger.framework.presentation.models.responses.k>> dVar) {
        return C10727i.f(this.f88288k, new f(fVar, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object q(@NotNull ru.ozon.android.messenger.framework.data.requests.ai.a aVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>> dVar) {
        return C10727i.f(this.f88288k, new h(aVar, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final boolean r(String str) {
        if (str != null) {
            return this.f88282e.g(str);
        }
        return false;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object s(@NotNull ru.ozon.android.messenger.framework.data.requests.b bVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<ru.ozon.android.messenger.framework.presentation.models.responses.h>> dVar) {
        return C10727i.f(this.f88288k, new b(bVar, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object t(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object s11 = this.f88280c.s(dVar);
        return s11 == Wc.a.COROUTINE_SUSPENDED ? s11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object u(@NotNull ru.ozon.android.messenger.framework.data.requests.a aVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<ru.ozon.android.messenger.framework.presentation.models.responses.a>> dVar) {
        return C10727i.f(this.f88288k, new a(aVar, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object v(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object k11 = this.f88280c.k(dVar);
        return k11 == Wc.a.COROUTINE_SUSPENDED ? k11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object w(@NotNull ru.ozon.android.messenger.framework.data.requests.k kVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends Object>> dVar) {
        return C10727i.f(this.f88288k, new l(kVar, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object x(@NotNull ru.ozon.android.messenger.framework.data.requests.c cVar, @NotNull kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<ru.ozon.android.messenger.framework.presentation.models.responses.i>> dVar) {
        return C10727i.f(this.f88288k, new e(cVar, null), dVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    public final Object y(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return this.f88280c.m(true, cVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.b
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.q z(@NotNull f.b block, Object obj) {
        Intrinsics.checkNotNullParameter(block, "block");
        return this.f88286i.a(block, obj);
    }
}
