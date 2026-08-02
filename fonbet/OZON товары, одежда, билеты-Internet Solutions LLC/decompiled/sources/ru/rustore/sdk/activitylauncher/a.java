package ru.rustore.sdk.activitylauncher;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f97947a;

    /* renamed from: ru.rustore.sdk.activitylauncher.a$a, reason: collision with other inner class name */
    public static final class C2157a extends a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C2157a f97948b = new C2157a(2);
    }

    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f97949b = new b(0);
    }

    public static final class c extends a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f97950b = new c(-1);
    }

    public static final class d extends a {

        /* renamed from: b, reason: collision with root package name */
        private final int f97951b;

        public d(int i11) {
            super(i11);
            this.f97951b = i11;
        }

        @Override // ru.rustore.sdk.activitylauncher.a
        public final int a() {
            return this.f97951b;
        }
    }

    public static final class e extends a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e f97952b = new e(9901);
    }

    public static final class f extends a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f f97953b = new f(9902);
    }

    public a(int i11) {
        this.f97947a = i11;
    }

    public int a() {
        return this.f97947a;
    }
}
