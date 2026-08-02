package ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f89824a = new a();
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.b$b, reason: collision with other inner class name */
    public static final class C1660b implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final q f89825a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f89826b;

        /* renamed from: c, reason: collision with root package name */
        private final String f89827c;

        public C1660b(@NotNull q footer, @NotNull String updateMessageId, String str) {
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(updateMessageId, "updateMessageId");
            this.f89825a = footer;
            this.f89826b = updateMessageId;
            this.f89827c = str;
        }

        @NotNull
        public final q a() {
            return this.f89825a;
        }

        public final String b() {
            return this.f89827c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1660b)) {
                return false;
            }
            C1660b c1660b = (C1660b) obj;
            return Intrinsics.d(this.f89825a, c1660b.f89825a) && Intrinsics.d(this.f89826b, c1660b.f89826b) && Intrinsics.d(this.f89827c, c1660b.f89827c);
        }

        public final int hashCode() {
            int a11 = G.g.a(this.f89825a.hashCode() * 31, 31, this.f89826b);
            String str = this.f89827c;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Edit(footer=");
            sb2.append(this.f89825a);
            sb2.append(", updateMessageId=");
            sb2.append(this.f89826b);
            sb2.append(", originalText=");
            return o0.c(sb2, this.f89827c, ")");
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final q f89828a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f89829b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final BlockDTO f89830c;

        public c(@NotNull q footer, @NotNull String replyToMessageId, @NotNull BlockDTO localMessageBlock) {
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(replyToMessageId, "replyToMessageId");
            Intrinsics.checkNotNullParameter(localMessageBlock, "localMessageBlock");
            this.f89828a = footer;
            this.f89829b = replyToMessageId;
            this.f89830c = localMessageBlock;
        }

        @NotNull
        public final q a() {
            return this.f89828a;
        }

        @NotNull
        public final BlockDTO b() {
            return this.f89830c;
        }

        @NotNull
        public final String c() {
            return this.f89829b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f89828a, cVar.f89828a) && Intrinsics.d(this.f89829b, cVar.f89829b) && Intrinsics.d(this.f89830c, cVar.f89830c);
        }

        public final int hashCode() {
            return this.f89830c.hashCode() + G.g.a(this.f89828a.hashCode() * 31, 31, this.f89829b);
        }

        @NotNull
        public final String toString() {
            return "Reply(footer=" + this.f89828a + ", replyToMessageId=" + this.f89829b + ", localMessageBlock=" + this.f89830c + ")";
        }
    }
}
