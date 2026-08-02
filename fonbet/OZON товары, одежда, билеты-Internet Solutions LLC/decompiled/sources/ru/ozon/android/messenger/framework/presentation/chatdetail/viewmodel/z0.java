package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.blocks.messagefile.FileDTO;
import ru.ozon.android.messenger.blocks.messageimage.ImageDTO;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.u0;

/* loaded from: classes10.dex */
public abstract class z0 {

    public static final class a extends z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f90398a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private u0 f90399b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String messageText) {
            super(0);
            Intrinsics.checkNotNullParameter(messageText, "messageText");
            this.f90398a = messageText;
            this.f90399b = u0.a.a();
        }

        @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0
        public final void a(@NotNull u0 u0Var) {
            Intrinsics.checkNotNullParameter(u0Var, "<set-?>");
            this.f90399b = u0Var;
        }

        @NotNull
        public final u0 b() {
            return this.f90399b;
        }

        @NotNull
        public final String c() {
            return this.f90398a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f90398a, ((a) obj).f90398a);
        }

        public final int hashCode() {
            return this.f90398a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C.o0.c(new StringBuilder("AiTextMessage(messageText="), this.f90398a, ")");
        }
    }

    public static final class b extends z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f90400a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, String> f90401b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private u0 f90402c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String messageText, Map<String, String> map) {
            super(0);
            Intrinsics.checkNotNullParameter(messageText, "messageText");
            this.f90400a = messageText;
            this.f90401b = map;
            this.f90402c = u0.a.a();
        }

        @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0
        public final void a(@NotNull u0 u0Var) {
            Intrinsics.checkNotNullParameter(u0Var, "<set-?>");
            this.f90402c = u0Var;
        }

        @NotNull
        public final u0 b() {
            return this.f90402c;
        }

        public final Map<String, String> c() {
            return this.f90401b;
        }

        @NotNull
        public final String d() {
            return this.f90400a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f90400a, bVar.f90400a) && Intrinsics.d(this.f90401b, bVar.f90401b);
        }

        public final int hashCode() {
            int hashCode = this.f90400a.hashCode() * 31;
            Map<String, String> map = this.f90401b;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AiTextMessageWithContext(messageText=");
            sb2.append(this.f90400a);
            sb2.append(", context=");
            return T7.P.f(sb2, this.f90401b, ")");
        }
    }

    public static final class c extends z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f90403a;

        /* renamed from: b, reason: collision with root package name */
        private FileDTO f90404b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private u0 f90405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Uri uri) {
            super(0);
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f90403a = uri;
            this.f90405c = u0.a.a();
        }

        @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0
        public final void a(@NotNull u0 u0Var) {
            Intrinsics.checkNotNullParameter(u0Var, "<set-?>");
            this.f90405c = u0Var;
        }

        @NotNull
        public final u0 b() {
            return this.f90405c;
        }

        public final FileDTO c() {
            return this.f90404b;
        }

        public final void d(FileDTO fileDTO) {
            this.f90404b = fileDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f90403a, ((c) obj).f90403a);
        }

        public final int hashCode() {
            return this.f90403a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "FileMessage(uri=" + this.f90403a + ")";
        }
    }

    public static final class d extends z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f90406a;

        /* renamed from: b, reason: collision with root package name */
        private ImageDTO f90407b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private u0 f90408c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull Uri uri) {
            super(0);
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f90406a = uri;
            this.f90408c = u0.a.a();
        }

        @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0
        public final void a(@NotNull u0 u0Var) {
            Intrinsics.checkNotNullParameter(u0Var, "<set-?>");
            this.f90408c = u0Var;
        }

        @NotNull
        public final u0 b() {
            return this.f90408c;
        }

        public final ImageDTO c() {
            return this.f90407b;
        }

        public final void d(ImageDTO imageDTO) {
            this.f90407b = imageDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.d(this.f90406a, ((d) obj).f90406a);
        }

        public final int hashCode() {
            return this.f90406a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ImageMessage(uri=" + this.f90406a + ")";
        }
    }

    public static final class e extends z0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f90409a;

        /* renamed from: b, reason: collision with root package name */
        private CustomBlockDTO f90410b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private u0 f90411c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull String messageText) {
            super(0);
            Intrinsics.checkNotNullParameter(messageText, "messageText");
            this.f90409a = messageText;
            this.f90411c = u0.a.a();
        }

        @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0
        public final void a(@NotNull u0 u0Var) {
            Intrinsics.checkNotNullParameter(u0Var, "<set-?>");
            this.f90411c = u0Var;
        }

        @NotNull
        public final u0 b() {
            return this.f90411c;
        }

        public final CustomBlockDTO c() {
            return this.f90410b;
        }

        @NotNull
        public final String d() {
            return this.f90409a;
        }

        public final void e(CustomBlockDTO customBlockDTO) {
            this.f90410b = customBlockDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.d(this.f90409a, ((e) obj).f90409a);
        }

        public final int hashCode() {
            return this.f90409a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C.o0.c(new StringBuilder("TextMessage(messageText="), this.f90409a, ")");
        }
    }

    public /* synthetic */ z0(int i11) {
        this();
    }

    public abstract void a(@NotNull u0 u0Var);

    private z0() {
    }
}
