package k5;

import androidx.annotation.NonNull;

/* renamed from: k5.v1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC7576v1 {

    /* renamed from: k5.v1$a */
    public interface a {
        void b();

        void g(@NonNull b bVar);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: k5.v1$b */
    public static final class b {

        /* renamed from: default, reason: not valid java name */
        public static final b f38default;

        /* renamed from: do, reason: not valid java name */
        public static final b f39do;

        /* renamed from: final, reason: not valid java name */
        public static final b f40final;

        /* renamed from: for, reason: not valid java name */
        private static final /* synthetic */ b[] f41for;

        /* renamed from: instanceof, reason: not valid java name */
        public static final b f42instanceof;

        /* renamed from: native, reason: not valid java name */
        public static final b f43native;

        /* renamed from: transient, reason: not valid java name */
        public static final b f44transient;

        static {
            b bVar = new b("Invalid", 0);
            f44transient = bVar;
            b bVar2 = new b("Normal", 1);
            f40final = bVar2;
            b bVar3 = new b("Ringtone", 2);
            f38default = bVar3;
            b bVar4 = new b("InCall", 3);
            f39do = bVar4;
            b bVar5 = new b("InVoipCall", 4);
            f42instanceof = bVar5;
            b bVar6 = new b("CallScreen", 5);
            f43native = bVar6;
            f41for = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f41for.clone();
        }
    }

    void a(@NonNull a aVar);

    void b(@NonNull a aVar);

    void c();
}
