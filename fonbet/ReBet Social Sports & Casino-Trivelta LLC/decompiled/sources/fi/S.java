package fi;

import ei.C4216f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4285a f46709a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46710b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f46711c;

    /* renamed from: d, reason: collision with root package name */
    public int f46712d;

    public static final class a extends RestrictedSuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f46713n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f46714o;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(DeepRecursiveScope deepRecursiveScope, Unit unit, Continuation continuation) {
            a aVar = S.this.new a(continuation);
            aVar.f46714o = deepRecursiveScope;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DeepRecursiveScope deepRecursiveScope = (DeepRecursiveScope) this.f46714o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f46713n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                byte F10 = S.this.f46709a.F();
                if (F10 == 1) {
                    return S.this.j(true);
                }
                if (F10 == 0) {
                    return S.this.j(false);
                }
                if (F10 != 6) {
                    if (F10 == 8) {
                        return S.this.f();
                    }
                    AbstractC4285a.z(S.this.f46709a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                S s10 = S.this;
                this.f46714o = SpillingKt.nullOutSpilledVariable(deepRecursiveScope);
                this.f46713n = 1;
                obj = s10.h(deepRecursiveScope, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (JsonElement) obj;
        }
    }

    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f46716n;

        /* renamed from: o, reason: collision with root package name */
        public Object f46717o;

        /* renamed from: p, reason: collision with root package name */
        public Object f46718p;

        /* renamed from: q, reason: collision with root package name */
        public Object f46719q;

        /* renamed from: r, reason: collision with root package name */
        public int f46720r;

        /* renamed from: s, reason: collision with root package name */
        public int f46721s;

        /* renamed from: t, reason: collision with root package name */
        public byte f46722t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f46723u;

        /* renamed from: w, reason: collision with root package name */
        public int f46725w;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f46723u = obj;
            this.f46725w |= Integer.MIN_VALUE;
            return S.this.h(null, this);
        }
    }

    public S(C4216f configuration, AbstractC4285a lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f46709a = lexer;
        this.f46710b = configuration.q();
        this.f46711c = configuration.d();
    }

    public final JsonElement e() {
        byte F10 = this.f46709a.F();
        if (F10 == 1) {
            return j(true);
        }
        if (F10 == 0) {
            return j(false);
        }
        if (F10 == 6) {
            int i10 = this.f46712d + 1;
            this.f46712d = i10;
            this.f46712d--;
            return i10 == 200 ? g() : i();
        }
        if (F10 == 8) {
            return f();
        }
        AbstractC4285a.z(this.f46709a, "Cannot read Json element because of unexpected " + AbstractC4286b.c(F10), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final JsonElement f() {
        byte k10 = this.f46709a.k();
        if (this.f46709a.F() == 4) {
            AbstractC4285a.z(this.f46709a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f46709a.f()) {
            arrayList.add(e());
            k10 = this.f46709a.k();
            if (k10 != 4) {
                AbstractC4285a abstractC4285a = this.f46709a;
                boolean z10 = k10 == 9;
                int i10 = abstractC4285a.f46745a;
                if (!z10) {
                    AbstractC4285a.z(abstractC4285a, "Expected end of the array or comma", i10, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (k10 == 8) {
            this.f46709a.l((byte) 9);
        } else if (k10 == 4) {
            if (!this.f46711c) {
                C.g(this.f46709a, "array");
                throw new KotlinNothingValueException();
            }
            this.f46709a.l((byte) 9);
        }
        return new JsonArray(arrayList);
    }

    public final JsonElement g() {
        return (JsonElement) DeepRecursiveKt.invoke(new DeepRecursiveFunction(new a(null)), Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a6 -> B:10:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(DeepRecursiveScope deepRecursiveScope, Continuation continuation) {
        b bVar;
        int i10;
        S s10;
        LinkedHashMap linkedHashMap;
        int i11;
        b bVar2;
        byte b10;
        DeepRecursiveScope deepRecursiveScope2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f46725w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f46725w = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f46723u;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = bVar.f46725w;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    byte l10 = this.f46709a.l((byte) 6);
                    if (this.f46709a.F() == 4) {
                        AbstractC4285a.z(this.f46709a, "Unexpected leading comma", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    s10 = this;
                    linkedHashMap = new LinkedHashMap();
                    i11 = 0;
                    bVar2 = bVar;
                    b10 = l10;
                    deepRecursiveScope2 = deepRecursiveScope;
                    if (s10.f46709a.f()) {
                    }
                    if (b10 == 6) {
                    }
                    return new JsonObject(linkedHashMap);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = bVar.f46720r;
                String str = (String) bVar.f46719q;
                linkedHashMap = (LinkedHashMap) bVar.f46718p;
                s10 = (S) bVar.f46717o;
                DeepRecursiveScope deepRecursiveScope3 = (DeepRecursiveScope) bVar.f46716n;
                ResultKt.throwOnFailure(obj);
                bVar2 = bVar;
                int i14 = i13;
                linkedHashMap.put(str, (JsonElement) obj);
                byte k10 = s10.f46709a.k();
                if (k10 == 4) {
                    if (k10 != 7) {
                        AbstractC4285a.z(s10.f46709a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    b10 = k10;
                    if (b10 == 6) {
                        s10.f46709a.l((byte) 7);
                    } else if (b10 == 4) {
                        if (!s10.f46711c) {
                            C.h(s10.f46709a, null, 1, null);
                            throw new KotlinNothingValueException();
                        }
                        s10.f46709a.l((byte) 7);
                    }
                    return new JsonObject(linkedHashMap);
                }
                i11 = i14;
                b10 = k10;
                deepRecursiveScope2 = deepRecursiveScope3;
                if (s10.f46709a.f()) {
                    String s11 = s10.f46710b ? s10.f46709a.s() : s10.f46709a.q();
                    s10.f46709a.l((byte) 5);
                    Unit unit = Unit.INSTANCE;
                    bVar2.f46716n = deepRecursiveScope2;
                    bVar2.f46717o = s10;
                    bVar2.f46718p = linkedHashMap;
                    bVar2.f46719q = s11;
                    bVar2.f46720r = i11;
                    bVar2.f46722t = b10;
                    bVar2.f46721s = 0;
                    bVar2.f46725w = 1;
                    Object callRecursive = deepRecursiveScope2.callRecursive(unit, bVar2);
                    if (callRecursive == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    String str2 = s11;
                    deepRecursiveScope3 = deepRecursiveScope2;
                    obj = callRecursive;
                    i14 = i11;
                    str = str2;
                    linkedHashMap.put(str, (JsonElement) obj);
                    byte k102 = s10.f46709a.k();
                    if (k102 == 4) {
                    }
                }
                if (b10 == 6) {
                }
                return new JsonObject(linkedHashMap);
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f46723u;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = bVar.f46725w;
        if (i10 != 0) {
        }
    }

    public final JsonElement i() {
        byte l10 = this.f46709a.l((byte) 6);
        if (this.f46709a.F() == 4) {
            AbstractC4285a.z(this.f46709a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f46709a.f()) {
                break;
            }
            String s10 = this.f46710b ? this.f46709a.s() : this.f46709a.q();
            this.f46709a.l((byte) 5);
            linkedHashMap.put(s10, e());
            l10 = this.f46709a.k();
            if (l10 != 4) {
                if (l10 != 7) {
                    AbstractC4285a.z(this.f46709a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (l10 == 6) {
            this.f46709a.l((byte) 7);
        } else if (l10 == 4) {
            if (!this.f46711c) {
                C.h(this.f46709a, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.f46709a.l((byte) 7);
        }
        return new JsonObject(linkedHashMap);
    }

    public final JsonPrimitive j(boolean z10) {
        String s10 = (this.f46710b || !z10) ? this.f46709a.s() : this.f46709a.q();
        return (z10 || !Intrinsics.areEqual(s10, "null")) ? new ei.w(s10, z10, null, 4, null) : JsonNull.INSTANCE;
    }
}
