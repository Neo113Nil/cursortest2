package ru.ozon.android.messenger.blocks.input;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface e {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f85533a = new a();

        @Override // ru.ozon.android.messenger.blocks.input.e
        @NotNull
        public final String a() {
            return "DEFAULT";
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f85534a = new b();

        @Override // ru.ozon.android.messenger.blocks.input.e
        @NotNull
        public final String a() {
            return "EDIT";
        }
    }

    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f85535a = new c();

        @Override // ru.ozon.android.messenger.blocks.input.e
        @NotNull
        public final String a() {
            return "REPLY";
        }
    }

    @NotNull
    String a();
}
