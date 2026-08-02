package ru.ozon.android.ozonLogger.core;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface h {

    public static final class a {
        public static /* synthetic */ void a(h hVar, String str, xj.a aVar, Boolean bool, int i11) {
            if ((i11 & 2) != 0) {
                aVar = null;
            }
            if ((i11 & 4) != 0) {
                bool = null;
            }
            hVar.c(str, aVar, bool);
        }

        public static /* synthetic */ void b(h hVar, String str, Boolean bool, int i11) {
            if ((i11 & 4) != 0) {
                bool = null;
            }
            hVar.d(str, null, bool);
        }

        public static /* synthetic */ void d(h hVar, c cVar, String str, xj.a aVar, Boolean bool, int i11) {
            if ((i11 & 4) != 0) {
                aVar = null;
            }
            if ((i11 & 8) != 0) {
                bool = null;
            }
            hVar.f(cVar, str, aVar, bool);
        }
    }

    void a(@NotNull String str);

    void b(@NotNull String str, ru.ozon.android.ozonLogger.core.a aVar, Boolean bool);

    void c(@NotNull String str, ru.ozon.android.ozonLogger.core.a aVar, Boolean bool);

    void d(@NotNull String str, xj.a aVar, Boolean bool);

    void e(@NotNull c cVar, @NotNull String str, String str2, ru.ozon.android.ozonLogger.core.a aVar, Boolean bool);

    void f(@NotNull c cVar, @NotNull String str, ru.ozon.android.ozonLogger.core.a aVar, Boolean bool);
}
