package ru.ozon.android.messenger.framework.domain.model;

import B0.C2454a;
import C.o0;
import Kk.C3532b;
import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.blocks.messagefile.FileDTO;
import ru.ozon.android.messenger.blocks.messageimage.ImageDTO;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.u0;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public interface g {

    public interface a extends g {

        /* renamed from: ru.ozon.android.messenger.framework.domain.model.g$a$a, reason: collision with other inner class name */
        public static final class C1635a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f88811a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f88812b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final u0 f88813c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f88814d;

            /* renamed from: e, reason: collision with root package name */
            @NotNull
            private final String f88815e;

            /* renamed from: f, reason: collision with root package name */
            private final Map<String, String> f88816f;

            public C1635a(@NotNull String chatId, @NotNull String localId, @NotNull u0 composedMessage, boolean z11, @NotNull String messageText, Map map) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                Intrinsics.checkNotNullParameter(localId, "localId");
                Intrinsics.checkNotNullParameter(composedMessage, "composedMessage");
                Intrinsics.checkNotNullParameter(messageText, "messageText");
                this.f88811a = chatId;
                this.f88812b = localId;
                this.f88813c = composedMessage;
                this.f88814d = z11;
                this.f88815e = messageText;
                this.f88816f = map;
            }

            @Override // ru.ozon.android.messenger.framework.domain.model.g.a
            @NotNull
            public final String a() {
                return this.f88811a;
            }

            @Override // ru.ozon.android.messenger.framework.domain.model.g.a
            public final boolean b() {
                return this.f88814d;
            }

            @NotNull
            public final u0 c() {
                return this.f88813c;
            }

            public final Map<String, String> d() {
                return this.f88816f;
            }

            @NotNull
            public final String e() {
                return this.f88812b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1635a)) {
                    return false;
                }
                C1635a c1635a = (C1635a) obj;
                return this.f88811a.equals(c1635a.f88811a) && Intrinsics.d(this.f88812b, c1635a.f88812b) && Intrinsics.d(this.f88813c, c1635a.f88813c) && this.f88814d == c1635a.f88814d && Intrinsics.d(this.f88815e, c1635a.f88815e) && Intrinsics.d(this.f88816f, c1635a.f88816f);
            }

            @NotNull
            public final String f() {
                return this.f88815e;
            }

            public final int hashCode() {
                int a11 = G.g.a(C3532b.a((this.f88813c.hashCode() + C2454a.a(1, G.g.a(this.f88811a.hashCode() * 31, 31, this.f88812b), 31)) * 31, 31, this.f88814d), 961, this.f88815e);
                Map<String, String> map = this.f88816f;
                return a11 + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AiText(chatId=");
                sb2.append(this.f88811a);
                sb2.append(", localId=");
                sb2.append(this.f88812b);
                sb2.append(", version=1, composedMessage=");
                sb2.append(this.f88813c);
                sb2.append(", shouldAddLocalItem=");
                sb2.append(this.f88814d);
                sb2.append(", messageText=");
                sb2.append(this.f88815e);
                sb2.append(", customBlock=null, context=");
                return P.f(sb2, this.f88816f, ")");
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f88817a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f88818b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final u0 f88819c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f88820d;

            /* renamed from: e, reason: collision with root package name */
            @NotNull
            private final FileDTO f88821e;

            public b(@NotNull String chatId, @NotNull String localId, @NotNull u0 composedMessage, boolean z11, @NotNull FileDTO fileDTO) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                Intrinsics.checkNotNullParameter(localId, "localId");
                Intrinsics.checkNotNullParameter(composedMessage, "composedMessage");
                Intrinsics.checkNotNullParameter(fileDTO, "fileDTO");
                this.f88817a = chatId;
                this.f88818b = localId;
                this.f88819c = composedMessage;
                this.f88820d = z11;
                this.f88821e = fileDTO;
            }

            @Override // ru.ozon.android.messenger.framework.domain.model.g.a
            @NotNull
            public final String a() {
                return this.f88817a;
            }

            @Override // ru.ozon.android.messenger.framework.domain.model.g.a
            public final boolean b() {
                return this.f88820d;
            }

            @NotNull
            public final u0 c() {
                return this.f88819c;
            }

            @NotNull
            public final FileDTO d() {
                return this.f88821e;
            }

            @NotNull
            public final String e() {
                return this.f88818b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f88817a.equals(bVar.f88817a) && Intrinsics.d(this.f88818b, bVar.f88818b) && Intrinsics.d(this.f88819c, bVar.f88819c) && this.f88820d == bVar.f88820d && this.f88821e.equals(bVar.f88821e);
            }

            public final int hashCode() {
                return this.f88821e.hashCode() + C3532b.a((this.f88819c.hashCode() + C2454a.a(1, G.g.a(this.f88817a.hashCode() * 31, 31, this.f88818b), 31)) * 31, 31, this.f88820d);
            }

            @NotNull
            public final String toString() {
                return "File(chatId=" + this.f88817a + ", localId=" + this.f88818b + ", version=1, composedMessage=" + this.f88819c + ", shouldAddLocalItem=" + this.f88820d + ", fileDTO=" + this.f88821e + ")";
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f88822a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f88823b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final u0 f88824c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f88825d;

            /* renamed from: e, reason: collision with root package name */
            @NotNull
            private final ImageDTO f88826e;

            public c(@NotNull String chatId, @NotNull String localId, @NotNull u0 composedMessage, boolean z11, @NotNull ImageDTO imageDTO) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                Intrinsics.checkNotNullParameter(localId, "localId");
                Intrinsics.checkNotNullParameter(composedMessage, "composedMessage");
                Intrinsics.checkNotNullParameter(imageDTO, "imageDTO");
                this.f88822a = chatId;
                this.f88823b = localId;
                this.f88824c = composedMessage;
                this.f88825d = z11;
                this.f88826e = imageDTO;
            }

            @Override // ru.ozon.android.messenger.framework.domain.model.g.a
            @NotNull
            public final String a() {
                return this.f88822a;
            }

            @Override // ru.ozon.android.messenger.framework.domain.model.g.a
            public final boolean b() {
                return this.f88825d;
            }

            @NotNull
            public final u0 c() {
                return this.f88824c;
            }

            @NotNull
            public final ImageDTO d() {
                return this.f88826e;
            }

            @NotNull
            public final String e() {
                return this.f88823b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f88822a.equals(cVar.f88822a) && Intrinsics.d(this.f88823b, cVar.f88823b) && Intrinsics.d(this.f88824c, cVar.f88824c) && this.f88825d == cVar.f88825d && this.f88826e.equals(cVar.f88826e);
            }

            public final int hashCode() {
                return this.f88826e.hashCode() + C3532b.a((this.f88824c.hashCode() + C2454a.a(1, G.g.a(this.f88822a.hashCode() * 31, 31, this.f88823b), 31)) * 31, 31, this.f88825d);
            }

            @NotNull
            public final String toString() {
                return "Image(chatId=" + this.f88822a + ", localId=" + this.f88823b + ", version=1, composedMessage=" + this.f88824c + ", shouldAddLocalItem=" + this.f88825d + ", imageDTO=" + this.f88826e + ")";
            }
        }

        public static final class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f88827a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f88828b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final u0 f88829c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f88830d;

            /* renamed from: e, reason: collision with root package name */
            @NotNull
            private final String f88831e;

            /* renamed from: f, reason: collision with root package name */
            private final CustomBlockDTO f88832f;

            /* renamed from: g, reason: collision with root package name */
            private final String f88833g;

            /* renamed from: h, reason: collision with root package name */
            private final BlockDTO f88834h;

            public d(@NotNull String chatId, @NotNull String localId, @NotNull u0 composedMessage, boolean z11, @NotNull String messageText, CustomBlockDTO customBlockDTO, String str, BlockDTO blockDTO) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                Intrinsics.checkNotNullParameter(localId, "localId");
                Intrinsics.checkNotNullParameter(composedMessage, "composedMessage");
                Intrinsics.checkNotNullParameter(messageText, "messageText");
                this.f88827a = chatId;
                this.f88828b = localId;
                this.f88829c = composedMessage;
                this.f88830d = z11;
                this.f88831e = messageText;
                this.f88832f = customBlockDTO;
                this.f88833g = str;
                this.f88834h = blockDTO;
            }

            @Override // ru.ozon.android.messenger.framework.domain.model.g.a
            @NotNull
            public final String a() {
                return this.f88827a;
            }

            @Override // ru.ozon.android.messenger.framework.domain.model.g.a
            public final boolean b() {
                return this.f88830d;
            }

            @NotNull
            public final u0 c() {
                return this.f88829c;
            }

            public final CustomBlockDTO d() {
                return this.f88832f;
            }

            @NotNull
            public final String e() {
                return this.f88828b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f88827a.equals(dVar.f88827a) && Intrinsics.d(this.f88828b, dVar.f88828b) && Intrinsics.d(this.f88829c, dVar.f88829c) && this.f88830d == dVar.f88830d && Intrinsics.d(this.f88831e, dVar.f88831e) && Intrinsics.d(this.f88832f, dVar.f88832f) && Intrinsics.d(this.f88833g, dVar.f88833g) && Intrinsics.d(this.f88834h, dVar.f88834h);
            }

            public final BlockDTO f() {
                return this.f88834h;
            }

            @NotNull
            public final String g() {
                return this.f88831e;
            }

            public final String h() {
                return this.f88833g;
            }

            public final int hashCode() {
                int a11 = G.g.a(C3532b.a((this.f88829c.hashCode() + C2454a.a(1, G.g.a(this.f88827a.hashCode() * 31, 31, this.f88828b), 31)) * 31, 31, this.f88830d), 31, this.f88831e);
                CustomBlockDTO customBlockDTO = this.f88832f;
                int hashCode = (a11 + (customBlockDTO == null ? 0 : customBlockDTO.hashCode())) * 31;
                String str = this.f88833g;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                BlockDTO blockDTO = this.f88834h;
                return hashCode2 + (blockDTO != null ? blockDTO.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                return "Text(chatId=" + this.f88827a + ", localId=" + this.f88828b + ", version=1, composedMessage=" + this.f88829c + ", shouldAddLocalItem=" + this.f88830d + ", messageText=" + this.f88831e + ", customBlock=" + this.f88832f + ", replyToMessageId=" + this.f88833g + ", localMessageBlock=" + this.f88834h + ")";
            }
        }

        @NotNull
        String a();

        boolean b();
    }

    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f88835a;

        public b(@NotNull String itemId) {
            Intrinsics.checkNotNullParameter(itemId, "itemId");
            this.f88835a = itemId;
        }

        @NotNull
        public final String c() {
            return this.f88835a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f88835a, ((b) obj).f88835a);
        }

        public final int hashCode() {
            return this.f88835a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Resend(itemId="), this.f88835a, ")");
        }
    }

    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        private final String f88836a;

        public c(String str) {
            this.f88836a = str;
        }

        public final String a() {
            return this.f88836a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f88836a, ((c) obj).f88836a);
        }

        public final int hashCode() {
            String str = this.f88836a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("ResendLastMessage(chatId="), this.f88836a, ")");
        }
    }

    public static final class d implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f88837a;

        public d(@NotNull String updateMessageId) {
            Intrinsics.checkNotNullParameter(updateMessageId, "updateMessageId");
            this.f88837a = updateMessageId;
        }

        @NotNull
        public final String c() {
            return this.f88837a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.d(this.f88837a, ((d) obj).f88837a);
        }

        public final int hashCode() {
            return this.f88837a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("ResendUpdateAfterConfirmation(updateMessageId="), this.f88837a, ")");
        }
    }

    public static final class e implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f88838a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f88839b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f88840c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f88841d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final q f88842e;

        /* renamed from: f, reason: collision with root package name */
        private final String f88843f;

        public e(@NotNull String chatId, @NotNull String localId, @NotNull String messageText, @NotNull String updateMessageId, @NotNull q editFooter, String str) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(localId, "localId");
            Intrinsics.checkNotNullParameter(messageText, "messageText");
            Intrinsics.checkNotNullParameter(updateMessageId, "updateMessageId");
            Intrinsics.checkNotNullParameter(editFooter, "editFooter");
            this.f88838a = chatId;
            this.f88839b = localId;
            this.f88840c = messageText;
            this.f88841d = updateMessageId;
            this.f88842e = editFooter;
            this.f88843f = str;
        }

        @NotNull
        public final String a() {
            return this.f88838a;
        }

        @NotNull
        public final q c() {
            return this.f88842e;
        }

        @NotNull
        public final String d() {
            return this.f88839b;
        }

        @NotNull
        public final String e() {
            return this.f88840c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.d(this.f88838a, eVar.f88838a) && Intrinsics.d(this.f88839b, eVar.f88839b) && Intrinsics.d(this.f88840c, eVar.f88840c) && Intrinsics.d(this.f88841d, eVar.f88841d) && Intrinsics.d(this.f88842e, eVar.f88842e) && Intrinsics.d(this.f88843f, eVar.f88843f);
        }

        public final String f() {
            return this.f88843f;
        }

        @NotNull
        public final String g() {
            return this.f88841d;
        }

        public final int hashCode() {
            int hashCode = (this.f88842e.hashCode() + G.g.a(G.g.a(G.g.a(this.f88838a.hashCode() * 31, 31, this.f88839b), 31, this.f88840c), 31, this.f88841d)) * 31;
            String str = this.f88843f;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateMessage(chatId=");
            sb2.append(this.f88838a);
            sb2.append(", localId=");
            sb2.append(this.f88839b);
            sb2.append(", messageText=");
            sb2.append(this.f88840c);
            sb2.append(", updateMessageId=");
            sb2.append(this.f88841d);
            sb2.append(", editFooter=");
            sb2.append(this.f88842e);
            sb2.append(", originalText=");
            return o0.c(sb2, this.f88843f, ")");
        }
    }
}
