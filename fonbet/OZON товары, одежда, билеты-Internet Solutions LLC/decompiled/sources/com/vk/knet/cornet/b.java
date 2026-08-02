package com.vk.knet.cornet;

import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public interface b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;

        @NotNull
        private static final InterfaceC4008j<Set<a>> ALL$delegate;
        public static final a CLIENT_BUILDER;
        public static final a CLIENT_CALLBACK;
        public static final a CLIENT_QUEUE;
        public static final a CLIENT_STATE;
        public static final a CLIENT_TIMEOUTS;

        @NotNull
        public static final c Companion;
        public static final a EXEC_POOL;
        public static final a NATIVE_BUFFER;

        @NotNull
        private static final InterfaceC4008j<Set<a>> RELEASE$delegate;

        /* renamed from: com.vk.knet.cornet.b$a$a, reason: collision with other inner class name */
        static final class C0931a extends AbstractC7737t implements Function0<Set<? extends a>> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0931a f60692b = new C0931a(0);

            @Override // kotlin.jvm.functions.Function0
            public final Set<? extends a> invoke() {
                return C7705l.j0(a.values());
            }
        }

        /* renamed from: com.vk.knet.cornet.b$a$b, reason: collision with other inner class name */
        static final class C0932b extends AbstractC7737t implements Function0<Set<? extends a>> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0932b f60693b = new C0932b(0);

            @Override // kotlin.jvm.functions.Function0
            public final Set<? extends a> invoke() {
                a[] elements = {a.CLIENT_BUILDER, a.NATIVE_BUFFER, a.EXEC_POOL};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return C7705l.j0(elements);
            }
        }

        public static final class c {
        }

        static {
            a aVar = new a("NATIVE_BUFFER", 0);
            NATIVE_BUFFER = aVar;
            a aVar2 = new a("EXEC_POOL", 1);
            EXEC_POOL = aVar2;
            a aVar3 = new a("CLIENT_TIMEOUTS", 2);
            CLIENT_TIMEOUTS = aVar3;
            a aVar4 = new a("CLIENT_QUEUE", 3);
            CLIENT_QUEUE = aVar4;
            a aVar5 = new a("CLIENT_CALLBACK", 4);
            CLIENT_CALLBACK = aVar5;
            a aVar6 = new a("CLIENT_BUILDER", 5);
            CLIENT_BUILDER = aVar6;
            a aVar7 = new a("CLIENT_STATE", 6);
            CLIENT_STATE = aVar7;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
            Companion = new c();
            ALL$delegate = k.b(C0931a.f60692b);
            RELEASE$delegate = k.b(C0932b.f60693b);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    void debug(@NotNull a aVar, @NotNull Object... objArr);

    void error(@NotNull Object... objArr);

    void info(@NotNull Object... objArr);
}
