package df;

import com.google.gson.h;
import com.google.gson.k;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleCategoryEntity;
import com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf.EnumC5132a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import og.AbstractC5896h;
import og.i;

/* renamed from: df.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4065a {

    /* renamed from: df.a$a, reason: collision with other inner class name */
    public static final class C0656a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f45173n;

        /* renamed from: o, reason: collision with root package name */
        public Object f45174o;

        /* renamed from: p, reason: collision with root package name */
        public Object f45175p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f45176q;

        /* renamed from: s, reason: collision with root package name */
        public int f45178s;

        public C0656a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f45176q = obj;
            this.f45178s |= Integer.MIN_VALUE;
            return InterfaceC4065a.x(InterfaceC4065a.this, null, null, false, null, this);
        }
    }

    /* renamed from: df.a$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f45179n;

        /* renamed from: o, reason: collision with root package name */
        public Object f45180o;

        /* renamed from: p, reason: collision with root package name */
        public Object f45181p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f45182q;

        /* renamed from: s, reason: collision with root package name */
        public int f45184s;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f45182q = obj;
            this.f45184s |= Integer.MIN_VALUE;
            return InterfaceC4065a.d(InterfaceC4065a.this, null, null, false, null, this);
        }
    }

    /* renamed from: df.a$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f45185n;

        /* renamed from: o, reason: collision with root package name */
        public Object f45186o;

        /* renamed from: p, reason: collision with root package name */
        public Object f45187p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f45188q;

        /* renamed from: s, reason: collision with root package name */
        public int f45190s;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f45188q = obj;
            this.f45190s |= Integer.MIN_VALUE;
            return InterfaceC4065a.h(InterfaceC4065a.this, null, null, this);
        }
    }

    /* renamed from: df.a$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f45191n;

        /* renamed from: o, reason: collision with root package name */
        public Object f45192o;

        /* renamed from: p, reason: collision with root package name */
        public Object f45193p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f45194q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f45195r;

        /* renamed from: t, reason: collision with root package name */
        public int f45197t;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f45195r = obj;
            this.f45197t |= Integer.MIN_VALUE;
            return InterfaceC4065a.o(InterfaceC4065a.this, null, false, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        if (r6.q(r5, r8) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[LOOP:0: B:18:0x007c->B:20:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object d(InterfaceC4065a interfaceC4065a, String str, String str2, boolean z10, List list, Continuation continuation) {
        b bVar;
        int i10;
        b bVar2;
        List list2;
        InterfaceC4065a interfaceC4065a2;
        List list3;
        Iterator it;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f45184s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f45184s = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f45182q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = bVar.f45184s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    List mutableList = CollectionsKt.toMutableList((Collection) interfaceC4065a.g(str, str2, z10));
                    bVar.f45179n = interfaceC4065a;
                    bVar.f45180o = list;
                    bVar.f45181p = mutableList;
                    bVar.f45184s = 1;
                    bVar2 = bVar;
                    if (l(interfaceC4065a, list, false, bVar2, 2, null) != coroutine_suspended) {
                        list2 = list;
                        interfaceC4065a2 = interfaceC4065a;
                        list3 = mutableList;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                list3 = (List) bVar.f45181p;
                list2 = (List) bVar.f45180o;
                interfaceC4065a2 = (InterfaceC4065a) bVar.f45179n;
                ResultKt.throwOnFailure(obj);
                bVar2 = bVar;
                List list4 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ArticleEntity) it.next()).getId());
                }
                list3.removeAll(arrayList);
                List list5 = CollectionsKt.toList(list3);
                bVar2.f45179n = null;
                bVar2.f45180o = null;
                bVar2.f45181p = null;
                bVar2.f45184s = 2;
            }
        }
        bVar = interfaceC4065a.new b(continuation);
        Object obj2 = bVar.f45182q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = bVar.f45184s;
        if (i10 != 0) {
        }
        List list42 = list2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list42, 10));
        it = list42.iterator();
        while (it.hasNext()) {
        }
        list3.removeAll(arrayList2);
        List list52 = CollectionsKt.toList(list3);
        bVar2.f45179n = null;
        bVar2.f45180o = null;
        bVar2.f45181p = null;
        bVar2.f45184s = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if (r9.z(r10, r11, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object h(InterfaceC4065a interfaceC4065a, String str, EnumC5132a enumC5132a, Continuation continuation) {
        c cVar;
        int i10;
        ArticleEntity articleEntity;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f45190s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f45190s = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f45188q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar.f45190s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC5321f a10 = interfaceC4065a.a(str);
                    cVar.f45185n = interfaceC4065a;
                    cVar.f45186o = str;
                    cVar.f45187p = enumC5132a;
                    cVar.f45190s = 1;
                    obj = AbstractC5323h.t(a10, cVar);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    enumC5132a = (EnumC5132a) cVar.f45187p;
                    str = (String) cVar.f45186o;
                    interfaceC4065a = (InterfaceC4065a) cVar.f45185n;
                    ResultKt.throwOnFailure(obj);
                }
                articleEntity = (ArticleEntity) obj;
                if (articleEntity != null) {
                    k o10 = i.o(articleEntity.getStats());
                    if (o10 != null) {
                        o10.p(enumC5132a.getValue(), String.valueOf(AbstractC5896h.e(o10.r(enumC5132a.getValue())) + 1));
                        Unit unit = Unit.INSTANCE;
                    } else {
                        o10 = null;
                    }
                    String valueOf = String.valueOf(o10);
                    cVar.f45185n = null;
                    cVar.f45186o = null;
                    cVar.f45187p = null;
                    cVar.f45190s = 2;
                }
                return Unit.INSTANCE;
            }
        }
        cVar = interfaceC4065a.new c(continuation);
        Object obj2 = cVar.f45188q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f45190s;
        if (i10 != 0) {
        }
        articleEntity = (ArticleEntity) obj2;
        if (articleEntity != null) {
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object l(InterfaceC4065a interfaceC4065a, List list, boolean z10, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertArticles");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return interfaceC4065a.f(list, z10, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0225, code lost:
    
        if (r9.c(r5, r1) == r3) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0225 -> B:12:0x0228). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x022e -> B:12:0x0228). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object o(InterfaceC4065a interfaceC4065a, List list, boolean z10, Continuation continuation) {
        d dVar;
        InterfaceC4065a interfaceC4065a2;
        int i10;
        d dVar2;
        Iterator it;
        boolean z11;
        InterfaceC4065a interfaceC4065a3;
        ArticleEntity articleEntity;
        Iterator it2;
        boolean z12;
        Unit unit;
        InterfaceC4065a interfaceC4065a4;
        Iterator it3;
        ArticleEntity articleEntity2;
        InterfaceC4065a interfaceC4065a5;
        ArticleEntity articleEntity3;
        ArticleEntity articleEntity4;
        String str;
        h r10;
        h r11;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f45197t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f45197t = i11 - Integer.MIN_VALUE;
                interfaceC4065a2 = interfaceC4065a;
                Object obj = dVar.f45195r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f45197t;
                int i12 = 1;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    dVar2 = dVar;
                    it = list.iterator();
                    z11 = z10;
                    if (it.hasNext()) {
                    }
                } else if (i10 == 1) {
                    z12 = dVar.f45194q;
                    ArticleEntity articleEntity5 = (ArticleEntity) dVar.f45193p;
                    Iterator it4 = (Iterator) dVar.f45192o;
                    interfaceC4065a5 = (InterfaceC4065a) dVar.f45191n;
                    ResultKt.throwOnFailure(obj);
                    articleEntity3 = articleEntity5;
                    it2 = it4;
                    articleEntity4 = (ArticleEntity) obj;
                    if (articleEntity4 == null) {
                    }
                } else if (i10 == 2) {
                    z12 = dVar.f45194q;
                    articleEntity2 = (ArticleEntity) dVar.f45193p;
                    it3 = (Iterator) dVar.f45192o;
                    interfaceC4065a4 = (InterfaceC4065a) dVar.f45191n;
                    ResultKt.throwOnFailure(obj);
                    unit = Unit.INSTANCE;
                    articleEntity = articleEntity2;
                    it2 = it3;
                    interfaceC4065a3 = interfaceC4065a4;
                    if (unit == null) {
                    }
                    Iterator it5 = it2;
                    dVar2 = dVar;
                    it = it5;
                    z11 = z12;
                    interfaceC4065a2 = interfaceC4065a3;
                    i12 = 1;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z12 = dVar.f45194q;
                    it2 = (Iterator) dVar.f45192o;
                    interfaceC4065a3 = (InterfaceC4065a) dVar.f45191n;
                    ResultKt.throwOnFailure(obj);
                    char c10 = 3;
                    Iterator it52 = it2;
                    dVar2 = dVar;
                    it = it52;
                    z11 = z12;
                    interfaceC4065a2 = interfaceC4065a3;
                    i12 = 1;
                    if (it.hasNext()) {
                        articleEntity3 = (ArticleEntity) it.next();
                        InterfaceC5321f a10 = interfaceC4065a2.a(articleEntity3.getId());
                        dVar2.f45191n = interfaceC4065a2;
                        dVar2.f45192o = it;
                        dVar2.f45193p = articleEntity3;
                        dVar2.f45194q = z11;
                        dVar2.f45197t = i12;
                        Object t10 = AbstractC5323h.t(a10, dVar2);
                        if (t10 != coroutine_suspended) {
                            InterfaceC4065a interfaceC4065a6 = interfaceC4065a2;
                            z12 = z11;
                            obj = t10;
                            interfaceC4065a5 = interfaceC4065a6;
                            d dVar3 = dVar2;
                            it2 = it;
                            dVar = dVar3;
                            articleEntity4 = (ArticleEntity) obj;
                            if (articleEntity4 == null) {
                                Long lastViewedTime = articleEntity4.getLastViewedTime();
                                Long recentlyViewedTimeFromSearch = articleEntity4.getRecentlyViewedTimeFromSearch();
                                String ratedType = articleEntity4.getRatedType();
                                String publishedTitle = articleEntity3.getPublishedTitle();
                                if (publishedTitle == null) {
                                    publishedTitle = articleEntity4.getPublishedTitle();
                                }
                                String str2 = publishedTitle;
                                String content = articleEntity3.getContent();
                                if (content == null) {
                                    content = articleEntity4.getContent();
                                }
                                String str3 = content;
                                if (articleEntity4.getStats() == null || articleEntity3.getStats() == null) {
                                    str = null;
                                } else {
                                    k o10 = i.o(articleEntity4.getStats());
                                    k o11 = i.o(articleEntity3.getStats());
                                    if (o11 != null) {
                                        for (EnumC5132a enumC5132a : EnumC5132a.getEntries()) {
                                            h r12 = o11.r(enumC5132a.getValue());
                                            Intrinsics.checkNotNullExpressionValue(r12, "get(...)");
                                            if (AbstractC5896h.b(r12) > i.m((o10 == null || (r11 = o10.r(enumC5132a.getValue())) == null) ? null : Boxing.boxInt(AbstractC5896h.b(r11)))) {
                                                String value = enumC5132a.getValue();
                                                h r13 = o11.r(enumC5132a.getValue());
                                                Intrinsics.checkNotNullExpressionValue(r13, "get(...)");
                                                o11.o(value, Boxing.boxInt(AbstractC5896h.b(r13)));
                                            } else {
                                                o11.o(enumC5132a.getValue(), Boxing.boxInt(i.m((o10 == null || (r10 = o10.r(enumC5132a.getValue())) == null) ? null : Boxing.boxInt(AbstractC5896h.b(r10)))));
                                            }
                                        }
                                    } else {
                                        o11 = null;
                                    }
                                    str = String.valueOf(o11);
                                }
                                ArticleEntity.a localMeta = articleEntity3.getLocalMeta();
                                if (localMeta == null) {
                                    localMeta = articleEntity4.getLocalMeta();
                                }
                                ArticleEntity.a aVar = localMeta;
                                InterfaceC4065a interfaceC4065a7 = interfaceC4065a5;
                                ArticleEntity copy$default = ArticleEntity.copy$default(articleEntity3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str2, str, str3, ratedType, lastViewedTime, recentlyViewedTimeFromSearch, aVar, 32767, null);
                                if (z12) {
                                    copy$default = ArticleEntity.copy$default(copy$default, null, articleEntity4.getCategoryId(), articleEntity4.getCategoryName(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194297, null);
                                }
                                dVar.f45191n = interfaceC4065a7;
                                dVar.f45192o = it2;
                                dVar.f45193p = articleEntity3;
                                dVar.f45194q = z12;
                                dVar.f45197t = 2;
                                if (interfaceC4065a7.t(copy$default, dVar) != coroutine_suspended) {
                                    ArticleEntity articleEntity6 = articleEntity3;
                                    it3 = it2;
                                    articleEntity2 = articleEntity6;
                                    interfaceC4065a4 = interfaceC4065a7;
                                    unit = Unit.INSTANCE;
                                    articleEntity = articleEntity2;
                                    it2 = it3;
                                    interfaceC4065a3 = interfaceC4065a4;
                                    if (unit == null) {
                                        dVar.f45191n = interfaceC4065a3;
                                        dVar.f45192o = it2;
                                        dVar.f45193p = null;
                                        dVar.f45194q = z12;
                                        c10 = 3;
                                        dVar.f45197t = 3;
                                    } else {
                                        c10 = 3;
                                    }
                                    Iterator it522 = it2;
                                    dVar2 = dVar;
                                    it = it522;
                                    z11 = z12;
                                    interfaceC4065a2 = interfaceC4065a3;
                                    i12 = 1;
                                    if (it.hasNext()) {
                                        return Unit.INSTANCE;
                                    }
                                }
                            } else {
                                ArticleEntity articleEntity7 = articleEntity3;
                                interfaceC4065a3 = interfaceC4065a5;
                                articleEntity = articleEntity7;
                                unit = null;
                                if (unit == null) {
                                }
                                Iterator it5222 = it2;
                                dVar2 = dVar;
                                it = it5222;
                                z11 = z12;
                                interfaceC4065a2 = interfaceC4065a3;
                                i12 = 1;
                                if (it.hasNext()) {
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                }
            }
        }
        interfaceC4065a2 = interfaceC4065a;
        dVar = interfaceC4065a2.new d(continuation);
        Object obj2 = dVar.f45195r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f45197t;
        int i122 = 1;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
    
        if (r7.p(r6, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[LOOP:0: B:18:0x0076->B:20:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object x(InterfaceC4065a interfaceC4065a, String str, String str2, boolean z10, List list, Continuation continuation) {
        C0656a c0656a;
        int i10;
        InterfaceC4065a interfaceC4065a2;
        List list2;
        Iterator it;
        if (continuation instanceof C0656a) {
            c0656a = (C0656a) continuation;
            int i11 = c0656a.f45178s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0656a.f45178s = i11 - Integer.MIN_VALUE;
                Object obj = c0656a.f45176q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0656a.f45178s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    List mutableList = CollectionsKt.toMutableList((Collection) interfaceC4065a.w(str, str2, z10));
                    c0656a.f45173n = interfaceC4065a;
                    c0656a.f45174o = list;
                    c0656a.f45175p = mutableList;
                    c0656a.f45178s = 1;
                    if (interfaceC4065a.u(list, c0656a) != coroutine_suspended) {
                        interfaceC4065a2 = interfaceC4065a;
                        list2 = mutableList;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                list2 = (List) c0656a.f45175p;
                list = (List) c0656a.f45174o;
                interfaceC4065a2 = (InterfaceC4065a) c0656a.f45173n;
                ResultKt.throwOnFailure(obj);
                List list3 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ArticleCategoryEntity) it.next()).getId());
                }
                list2.removeAll(arrayList);
                List list4 = CollectionsKt.toList(list2);
                c0656a.f45173n = null;
                c0656a.f45174o = null;
                c0656a.f45175p = null;
                c0656a.f45178s = 2;
            }
        }
        c0656a = interfaceC4065a.new C0656a(continuation);
        Object obj2 = c0656a.f45176q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0656a.f45178s;
        if (i10 != 0) {
        }
        List list32 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
        it = list32.iterator();
        while (it.hasNext()) {
        }
        list2.removeAll(arrayList2);
        List list42 = CollectionsKt.toList(list2);
        c0656a.f45173n = null;
        c0656a.f45174o = null;
        c0656a.f45175p = null;
        c0656a.f45178s = 2;
    }

    Object A(String str, Continuation continuation);

    default Object B(String str, String str2, boolean z10, List list, Continuation continuation) {
        return d(this, str, str2, z10, list, continuation);
    }

    Object C(Continuation continuation);

    Object D(String str, long j10, Continuation continuation);

    InterfaceC5321f a(String str);

    default Object b(String str, String str2, boolean z10, List list, Continuation continuation) {
        return x(this, str, str2, z10, list, continuation);
    }

    Object c(ArticleEntity articleEntity, Continuation continuation);

    InterfaceC5321f e(String str, String str2, String str3, boolean z10);

    default Object f(List list, boolean z10, Continuation continuation) {
        return o(this, list, z10, continuation);
    }

    List g(String str, String str2, boolean z10);

    Object i(List list, Continuation continuation);

    InterfaceC5321f j(String str, String str2, boolean z10, boolean z11, List list, int i10);

    InterfaceC5321f k(String str, String str2, String str3, boolean z10, boolean z11, List list);

    default Object m(String str, EnumC5132a enumC5132a, Continuation continuation) {
        return h(this, str, enumC5132a, continuation);
    }

    InterfaceC5321f n(List list);

    Object p(List list, Continuation continuation);

    Object q(List list, Continuation continuation);

    Object r(String str, String str2, Continuation continuation);

    Object s(Continuation continuation);

    Object t(ArticleEntity articleEntity, Continuation continuation);

    Object u(List list, Continuation continuation);

    Object v(String str, long j10, Continuation continuation);

    List w(String str, String str2, boolean z10);

    InterfaceC5321f y(List list, String str, List list2);

    Object z(String str, String str2, Continuation continuation);
}
