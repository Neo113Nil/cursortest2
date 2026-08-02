package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import Ae.InterfaceC2395h;
import Ae.x0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.common.screen.m;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.u;
import xe.M;

/* loaded from: classes10.dex */
public interface a extends u {

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a$a, reason: collision with other inner class name */
    public static final class C1665a {
        public static void a(a aVar, Map map) {
            aVar.X(map, new ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.b(2, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
        public static void b(a aVar, LinkedHashMap linkedHashMap, Function2 function2, int i11) {
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            if ((i11 & 1) != 0) {
                linkedHashMap2 = U.c();
            }
            if ((i11 & 2) != 0) {
                function2 = new c(2, null);
            }
            aVar.V(linkedHashMap2, function2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b FIRST;
        public static final b REGULAR;
        public static final b SCROLL_TO_END;

        static {
            b bVar = new b("REGULAR", 0);
            REGULAR = bVar;
            b bVar2 = new b("FIRST", 1);
            FIRST = bVar2;
            b bVar3 = new b("SCROLL_TO_END", 2);
            SCROLL_TO_END = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    @NotNull
    x0<Integer> D();

    Object F(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    boolean O();

    void V(@NotNull Map<String, String> map, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2);

    void X(@NotNull Map<String, String> map, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2);

    Object Z(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @NotNull
    u c();

    void cleanup();

    @NotNull
    InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.common.screen.l> getLoader();

    void n(String str);

    Object u(@NotNull d.q qVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    void w(boolean z11, @NotNull m.a aVar);

    boolean z();
}
