package ru.ozon.android.messenger.framework.presentation.common.startup;

import Ae.M0;
import java.util.Map;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public interface a {

    /* renamed from: ru.ozon.android.messenger.framework.presentation.common.startup.a$a, reason: collision with other inner class name */
    public static final class C1700a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f91136a;

        /* renamed from: b, reason: collision with root package name */
        private final String f91137b;

        /* renamed from: c, reason: collision with root package name */
        private final Tc.d f91138c;

        public C1700a(@NotNull String chatId, String str, Tc.d dVar) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.f91136a = chatId;
            this.f91137b = str;
            this.f91138c = dVar;
        }

        @NotNull
        public final String a() {
            return this.f91136a;
        }

        public final Map<String, String> b() {
            return this.f91138c;
        }

        public final String c() {
            return this.f91137b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1700a)) {
                return false;
            }
            C1700a c1700a = (C1700a) obj;
            return Intrinsics.d(this.f91136a, c1700a.f91136a) && Intrinsics.d(this.f91137b, c1700a.f91137b) && Intrinsics.d(this.f91138c, c1700a.f91138c);
        }

        public final int hashCode() {
            int hashCode = this.f91136a.hashCode() * 31;
            String str = this.f91137b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Tc.d dVar = this.f91138c;
            return hashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "ChatStartupResult(chatId=" + this.f91136a + ", firstUnreadMsgId=" + this.f91137b + ", context=" + this.f91138c + ")";
        }
    }

    Object a(@NotNull Map<String, String> map, @NotNull kotlin.coroutines.d<? super i<C1700a>> dVar);

    Object b(@NotNull Map map, @NotNull j jVar);

    @NotNull
    M0<String> e();
}
