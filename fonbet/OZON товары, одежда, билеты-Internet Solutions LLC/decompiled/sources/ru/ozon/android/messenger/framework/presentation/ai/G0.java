package ru.ozon.android.messenger.framework.presentation.ai;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$startChat$1", f = "AiAssistantViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class G0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89257d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$startChat$1$1", f = "AiAssistantViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C9414c0 f89258d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
            super(2, dVar);
            this.f89258d = c9414c0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(dVar, this.f89258d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C11115c c11115c;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            c11115c = this.f89258d.f89521x;
            c11115c.b(new j.i(0));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G0(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
        super(2, dVar);
        this.f89257d = c9414c0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new G0(dVar, this.f89257d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((G0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C9409a c9409a;
        Map map;
        LinkedHashMap O02;
        LinkedHashMap O03;
        Uri deeplink;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        C9414c0 c9414c0 = this.f89257d;
        c9409a = c9414c0.f89520w;
        if (c9409a == null || (deeplink = c9409a.getDeeplink()) == null) {
            map = null;
        } else {
            String queryParameter = deeplink.getQueryParameter(ImagesContract.URL);
            if (queryParameter == null) {
                map = kotlin.collections.U.c();
            } else {
                Uri parse = Uri.parse(queryParameter);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
                Set<String> set = queryParameterNames;
                int h11 = kotlin.collections.U.h(C7714v.z(set, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                for (Object obj2 : set) {
                    String queryParameter2 = parse.getQueryParameter((String) obj2);
                    if (queryParameter2 == null) {
                        queryParameter2 = "";
                    }
                    linkedHashMap.put(obj2, queryParameter2);
                }
                map = linkedHashMap;
            }
        }
        if (map != null) {
            O03 = c9414c0.O0();
            O02 = kotlin.collections.U.m(map, O03);
        } else {
            O02 = c9414c0.O0();
        }
        c9414c0.f89506i.V(O02, new a(null, c9414c0));
        return Unit.f71690a;
    }
}
