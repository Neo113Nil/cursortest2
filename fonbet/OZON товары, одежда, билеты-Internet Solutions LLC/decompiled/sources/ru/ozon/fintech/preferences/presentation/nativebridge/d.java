package ru.ozon.fintech.preferences.presentation.nativebridge;

import G.g;
import Sc.s;
import bd.q;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@e(c = "ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingViewModel$loadPresetsFromAssets$2", f = "FintechNativeBridgeTestingViewModel.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super Map<String, String>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Map f96866d;

    /* renamed from: e, reason: collision with root package name */
    String[] f96867e;

    /* renamed from: f, reason: collision with root package name */
    String f96868f;

    /* renamed from: g, reason: collision with root package name */
    Function1 f96869g;

    /* renamed from: h, reason: collision with root package name */
    Function1 f96870h;

    /* renamed from: i, reason: collision with root package name */
    D90.j f96871i;

    /* renamed from: j, reason: collision with root package name */
    Map f96872j;

    /* renamed from: k, reason: collision with root package name */
    int f96873k;

    /* renamed from: l, reason: collision with root package name */
    int f96874l;

    /* renamed from: m, reason: collision with root package name */
    int f96875m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function1<String, String[]> f96876n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f96877o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ Function1<String, InputStream> f96878p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ D90.j f96879q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    d(Function1<? super String, String[]> function1, String str, Function1<? super String, ? extends InputStream> function12, D90.j jVar, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f96876n = function1;
        this.f96877o = str;
        this.f96878p = function12;
        this.f96879q = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f96876n, this.f96877o, this.f96878p, this.f96879q, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Map<String, String>> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:11|(1:13)(1:43)|14|15|(2:33|(1:35)(2:36|(1:38)(3:39|7|8)))(5:17|18|19|20|21)|9|(1:44)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
    
        r10 = r15;
        r7 = r8;
        r5 = r9;
        r8 = r11;
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
    
        L80.a.a("FintechNativeBridgeTestingViewModel", " loadPresetsFromAssets error: " + r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110 A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0094 -> B:9:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b2 -> B:9:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e7 -> B:7:0x00ee). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        String str;
        String[] strArr;
        int i11;
        int i12;
        D90.j jVar;
        Function1<String, String[]> function1;
        Function1<String, InputStream> function12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i13 = this.f96875m;
        if (i13 == 0) {
            s.b(obj);
            linkedHashMap = new LinkedHashMap();
            Function1<String, String[]> function13 = this.f96876n;
            String str2 = this.f96877o;
            String[] invoke = function13.invoke(str2);
            int length = invoke.length;
            Function1<String, InputStream> function14 = this.f96878p;
            str = str2;
            strArr = invoke;
            i11 = length;
            i12 = 0;
            jVar = this.f96879q;
            function1 = function13;
            function12 = function14;
            if (i12 < i11) {
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f96874l;
            i12 = this.f96873k;
            Map map = this.f96872j;
            D90.j jVar2 = this.f96871i;
            function1 = this.f96870h;
            Function1<String, InputStream> function15 = this.f96869g;
            String str3 = this.f96868f;
            String[] strArr2 = this.f96867e;
            Map map2 = this.f96866d;
            try {
                s.b(obj);
                map2 = map2;
            } catch (Throwable th2) {
                L80.a.a("FintechNativeBridgeTestingViewModel", " loadPresetsFromAssets error: " + th2);
            }
            map.putAll((Map) obj);
            str = str3;
            strArr = strArr2;
            linkedHashMap = map2;
            jVar = jVar2;
            function12 = function15;
            i12++;
            if (i12 < i11) {
                String str4 = strArr[i12];
                String c11 = str.length() == 0 ? str4 : g.c(str, "/", str4);
                if (h.A(str4, ".json", true)) {
                    InputStream invoke2 = function12.invoke(c11);
                    try {
                        linkedHashMap.put(c11, h.z0(q.d(new BufferedReader(new InputStreamReader(invoke2)))).toString());
                        Unit unit = Unit.f71690a;
                        Vd0.b.a(invoke2, null);
                    } finally {
                    }
                } else if (function1.invoke(c11).length != 0) {
                    this.f96866d = linkedHashMap;
                    this.f96867e = strArr;
                    this.f96868f = str;
                    this.f96869g = function12;
                    this.f96870h = function1;
                    this.f96871i = jVar;
                    this.f96872j = linkedHashMap;
                    this.f96873k = i12;
                    this.f96874l = i11;
                    this.f96875m = 1;
                    jVar.getClass();
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    Object f7 = C10727i.f(He.b.f10879b, new d(function1, c11, function12, jVar, null), this);
                    if (f7 == aVar) {
                        return aVar;
                    }
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    function15 = function12;
                    jVar2 = jVar;
                    str3 = str;
                    strArr2 = strArr;
                    obj = f7;
                    map = linkedHashMap2;
                    map2 = linkedHashMap2;
                    map.putAll((Map) obj);
                    str = str3;
                    strArr = strArr2;
                    linkedHashMap = map2;
                    jVar = jVar2;
                    function12 = function15;
                }
                i12++;
                if (i12 < i11) {
                    return linkedHashMap;
                }
            }
        }
    }
}
