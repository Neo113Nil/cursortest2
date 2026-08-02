package ru.ozon.android.messenger.framework.data.local.database.draft;

import Ae.InterfaceC2395h;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface b {

    /* loaded from: classes10.dex */
    public static final class a {

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.local.database.draft.DraftMessageDao$DefaultImpls", f = "DraftMessageDao.kt", l = {74, 80}, m = "saveCustomBlockForDraft")
        /* renamed from: ru.ozon.android.messenger.framework.data.local.database.draft.b$a$a, reason: collision with other inner class name */
        static final class C1571a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            b f87470d;

            /* renamed from: e, reason: collision with root package name */
            ru.ozon.android.messenger.framework.data.local.database.draft.entity.b f87471e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f87472f;

            /* renamed from: g, reason: collision with root package name */
            int f87473g;

            C1571a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f87472f = obj;
                this.f87473g |= LinearLayoutManager.INVALID_OFFSET;
                return a.b(null, null, null, 0L, this);
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.local.database.draft.DraftMessageDao$DefaultImpls", f = "DraftMessageDao.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 38, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "saveTextDataForDraft")
        /* renamed from: ru.ozon.android.messenger.framework.data.local.database.draft.b$a$b, reason: collision with other inner class name */
        static final class C1572b extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            b f87474d;

            /* renamed from: e, reason: collision with root package name */
            String f87475e;

            /* renamed from: f, reason: collision with root package name */
            String f87476f;

            /* renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f87477g;

            /* renamed from: h, reason: collision with root package name */
            int f87478h;

            C1572b() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f87477g = obj;
                this.f87478h |= LinearLayoutManager.INVALID_OFFSET;
                return a.c(null, null, null, 0L, this);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        
            if (r5.e(r7, r0) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        
            if (r6 == r1) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object a(@NotNull b bVar, @NotNull String str, @NotNull ArrayList arrayList, long j11, @NotNull kotlin.coroutines.d dVar) {
            c cVar;
            int i11;
            ArrayList arrayList2;
            b bVar2;
            if (dVar instanceof c) {
                cVar = (c) dVar;
                int i12 = cVar.f87482g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    cVar.f87482g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = cVar.f87481f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = cVar.f87482g;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        ru.ozon.android.messenger.framework.data.local.database.draft.entity.c cVar2 = new ru.ozon.android.messenger.framework.data.local.database.draft.entity.c(str, j11);
                        cVar.f87479d = bVar;
                        cVar.f87480e = arrayList;
                        cVar.f87482g = 1;
                        Object g10 = bVar.g(cVar2, cVar);
                        bVar2 = bVar;
                        arrayList2 = arrayList;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj);
                            return Unit.f71690a;
                        }
                        List list = cVar.f87480e;
                        b bVar3 = cVar.f87479d;
                        Sc.s.b(obj);
                        bVar2 = bVar3;
                        arrayList2 = list;
                    }
                    cVar.f87479d = null;
                    cVar.f87480e = null;
                    cVar.f87482g = 2;
                }
            }
            cVar = new c(dVar);
            Object obj2 = cVar.f87481f;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = cVar.f87482g;
            if (i11 != 0) {
            }
            cVar.f87479d = null;
            cVar.f87480e = null;
            cVar.f87482g = 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        
            if (r5.i(r6, r0) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        
            if (r5.g(r10, r0) == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object b(@NotNull b bVar, @NotNull String str, @NotNull ru.ozon.android.messenger.framework.data.local.database.draft.entity.b bVar2, long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            C1571a c1571a;
            int i11;
            if (dVar instanceof C1571a) {
                c1571a = (C1571a) dVar;
                int i12 = c1571a.f87473g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1571a.f87473g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c1571a.f87472f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1571a.f87473g;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        ru.ozon.android.messenger.framework.data.local.database.draft.entity.c cVar = new ru.ozon.android.messenger.framework.data.local.database.draft.entity.c(str, j11);
                        c1571a.f87470d = bVar;
                        c1571a.f87471e = bVar2;
                        c1571a.f87473g = 1;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj);
                            return Unit.f71690a;
                        }
                        bVar2 = c1571a.f87471e;
                        bVar = c1571a.f87470d;
                        Sc.s.b(obj);
                    }
                    List<ru.ozon.android.messenger.framework.data.local.database.draft.entity.b> a02 = C7714v.a0(bVar2);
                    c1571a.f87470d = null;
                    c1571a.f87471e = null;
                    c1571a.f87473g = 2;
                }
            }
            c1571a = new C1571a(dVar);
            Object obj2 = c1571a.f87472f;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1571a.f87473g;
            if (i11 != 0) {
            }
            List<ru.ozon.android.messenger.framework.data.local.database.draft.entity.b> a022 = C7714v.a0(bVar2);
            c1571a.f87470d = null;
            c1571a.f87471e = null;
            c1571a.f87473g = 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
        
            if (r6.k(r9, r0) == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        
            if (r6.f(r7, r0) == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        
            if (r6.g(r11, r0) == r1) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object c(@NotNull b bVar, @NotNull String str, @NotNull String str2, long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            C1572b c1572b;
            int i11;
            if (dVar instanceof C1572b) {
                c1572b = (C1572b) dVar;
                int i12 = c1572b.f87478h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1572b.f87478h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c1572b.f87477g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1572b.f87478h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        if (str2.length() == 0) {
                            c1572b.f87478h = 1;
                        } else {
                            ru.ozon.android.messenger.framework.data.local.database.draft.entity.c cVar = new ru.ozon.android.messenger.framework.data.local.database.draft.entity.c(str, j11);
                            c1572b.f87474d = bVar;
                            c1572b.f87475e = str;
                            c1572b.f87476f = str2;
                            c1572b.f87478h = 2;
                        }
                        return aVar;
                    }
                    if (i11 == 1) {
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    str2 = c1572b.f87476f;
                    str = c1572b.f87475e;
                    bVar = c1572b.f87474d;
                    Sc.s.b(obj);
                    ru.ozon.android.messenger.framework.data.local.database.draft.entity.d dVar2 = new ru.ozon.android.messenger.framework.data.local.database.draft.entity.d(str, str2);
                    c1572b.f87474d = null;
                    c1572b.f87475e = null;
                    c1572b.f87476f = null;
                    c1572b.f87478h = 3;
                }
            }
            c1572b = new C1572b(dVar);
            Object obj2 = c1572b.f87477g;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1572b.f87478h;
            if (i11 != 0) {
            }
        }
    }

    Object a(@NotNull String str, @NotNull String str2, long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object b(@NotNull String str, @NotNull ArrayList arrayList, long j11, @NotNull kotlin.coroutines.d dVar);

    Object c(@NotNull String str, @NotNull ru.ozon.android.messenger.framework.data.local.database.draft.entity.b bVar, long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object d(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object e(@NotNull List<ru.ozon.android.messenger.framework.data.local.database.draft.entity.a> list, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object f(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object g(@NotNull ru.ozon.android.messenger.framework.data.local.database.draft.entity.c cVar, @NotNull kotlin.coroutines.jvm.internal.c cVar2);

    @NotNull
    InterfaceC2395h<ru.ozon.android.messenger.framework.data.local.database.draft.model.a> h(@NotNull String str);

    Object i(@NotNull List<ru.ozon.android.messenger.framework.data.local.database.draft.entity.b> list, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    Object j(@NotNull kotlin.coroutines.d<? super Map<String, ru.ozon.android.messenger.framework.data.local.database.draft.model.a>> dVar);

    Object k(@NotNull ru.ozon.android.messenger.framework.data.local.database.draft.entity.d dVar, @NotNull kotlin.coroutines.d<? super Unit> dVar2);

    Object l(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
