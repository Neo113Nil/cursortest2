package ru.ozon.android.messenger.framework.core.initialization;

import A0.h;
import B90.C2618u;
import C.o0;
import I0.C3173b;
import N3.C3660k;
import S0.InterfaceC3967k;
import We.E;
import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC5392m;
import ei0.InterfaceC6369b;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.i;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9915y;
import u0.InterfaceC9914x;

/* loaded from: classes6.dex */
public interface d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f87138a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C1558a f87139b;

        /* renamed from: c, reason: collision with root package name */
        private final String f87140c;

        /* renamed from: d, reason: collision with root package name */
        private final String f87141d;

        /* renamed from: e, reason: collision with root package name */
        private final Function2<InterfaceC3967k, Integer, Unit> f87142e;

        /* renamed from: ru.ozon.android.messenger.framework.core.initialization.d$a$a, reason: collision with other inner class name */
        public static final class C1558a {

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            private static final C1558a f87143d;

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final C9915y f87144a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final C1559a f87145b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f87146c;

            /* renamed from: ru.ozon.android.messenger.framework.core.initialization.d$a$a$a, reason: collision with other inner class name */
            public static final class C1559a {

                /* renamed from: a, reason: collision with root package name */
                private final float f87147a;

                /* renamed from: b, reason: collision with root package name */
                private final float f87148b;

                /* renamed from: c, reason: collision with root package name */
                private final float f87149c;

                /* renamed from: d, reason: collision with root package name */
                private final float f87150d;

                public C1559a(float f7, float f11, float f12, float f13) {
                    this.f87147a = f7;
                    this.f87148b = f11;
                    this.f87149c = f12;
                    this.f87150d = f13;
                }

                @NotNull
                public final A0.g a() {
                    float f7 = this.f87149c;
                    return h.c(this.f87147a, this.f87148b, this.f87150d, f7);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1559a)) {
                        return false;
                    }
                    C1559a c1559a = (C1559a) obj;
                    return Z1.h.b(this.f87147a, c1559a.f87147a) && Z1.h.b(this.f87148b, c1559a.f87148b) && Z1.h.b(this.f87149c, c1559a.f87149c) && Z1.h.b(this.f87150d, c1559a.f87150d);
                }

                public final int hashCode() {
                    return Float.hashCode(this.f87150d) + Pk0.b.a(this.f87149c, Pk0.b.a(this.f87148b, Float.hashCode(this.f87147a) * 31, 31), 31);
                }

                @NotNull
                public final String toString() {
                    String c11 = Z1.h.c(this.f87147a);
                    String c12 = Z1.h.c(this.f87148b);
                    return C3173b.c(C3660k.d("CornerRadii(topStart=", c11, ", topEnd=", c12, ", bottomStart="), Z1.h.c(this.f87149c), ", bottomEnd=", Z1.h.c(this.f87150d), ")");
                }
            }

            static {
                UniTheme uniTheme = UniTheme.INSTANCE;
                f87143d = new C1558a(new C9915y(uniTheme.getPaddings().getPadding400(), uniTheme.getPaddings().getPadding300(), uniTheme.getPaddings().getPadding400(), uniTheme.getPaddings().getPadding400()), new C1559a(uniTheme.getRadii().getRadius550(), uniTheme.getRadii().getRadius550(), uniTheme.getRadii().getRadius550(), uniTheme.getRadii().getRadius200()), uniTheme.getColorTokens().getBgPrimary().getId());
            }

            public C1558a(@NotNull C9915y externalPadding, @NotNull C1559a cornerRadii, @NotNull String backgroundToken) {
                Intrinsics.checkNotNullParameter(externalPadding, "externalPadding");
                Intrinsics.checkNotNullParameter(cornerRadii, "cornerRadii");
                Intrinsics.checkNotNullParameter(backgroundToken, "backgroundToken");
                this.f87144a = externalPadding;
                this.f87145b = cornerRadii;
                this.f87146c = backgroundToken;
            }

            @NotNull
            public final String b() {
                return this.f87146c;
            }

            @NotNull
            public final C1559a c() {
                return this.f87145b;
            }

            @NotNull
            public final InterfaceC9914x d() {
                return this.f87144a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1558a)) {
                    return false;
                }
                C1558a c1558a = (C1558a) obj;
                return this.f87144a.equals(c1558a.f87144a) && this.f87145b.equals(c1558a.f87145b) && Intrinsics.d(this.f87146c, c1558a.f87146c);
            }

            public final int hashCode() {
                return this.f87146c.hashCode() + ((this.f87145b.hashCode() + (this.f87144a.hashCode() * 31)) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MessageBubbleSettings(externalPadding=");
                sb2.append(this.f87144a);
                sb2.append(", cornerRadii=");
                sb2.append(this.f87145b);
                sb2.append(", backgroundToken=");
                return o0.c(sb2, this.f87146c, ")");
            }
        }

        static {
            new a(UniTheme.INSTANCE.getColorTokens().getLayerFloor1().getId(), C1558a.f87143d, null, null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull String backgroundColorToken, @NotNull C1558a messageBubbleSettings, String str, String str2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
            Intrinsics.checkNotNullParameter(backgroundColorToken, "backgroundColorToken");
            Intrinsics.checkNotNullParameter(messageBubbleSettings, "messageBubbleSettings");
            this.f87138a = backgroundColorToken;
            this.f87139b = messageBubbleSettings;
            this.f87140c = str;
            this.f87141d = str2;
            this.f87142e = function2;
        }

        @NotNull
        public final String a() {
            return this.f87138a;
        }

        public final String b() {
            return this.f87141d;
        }

        public final String c() {
            return this.f87140c;
        }

        @NotNull
        public final C1558a d() {
            return this.f87139b;
        }

        public final Function2<InterfaceC3967k, Integer, Unit> e() {
            return this.f87142e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f87138a, aVar.f87138a) && Intrinsics.d(this.f87139b, aVar.f87139b) && Intrinsics.d(this.f87140c, aVar.f87140c) && Intrinsics.d(this.f87141d, aVar.f87141d) && Intrinsics.d(this.f87142e, aVar.f87142e);
        }

        public final int hashCode() {
            int hashCode = (this.f87139b.hashCode() + (this.f87138a.hashCode() * 31)) * 31;
            String str = this.f87140c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f87141d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Function2<InterfaceC3967k, Integer, Unit> function2 = this.f87142e;
            return hashCode3 + (function2 != null ? function2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "AiAssistantCustomSettings(backgroundColorToken=" + this.f87138a + ", messageBubbleSettings=" + this.f87139b + ", defaultHeaderTitle=" + this.f87140c + ", defaultHeaderSubtitle=" + this.f87141d + ", suggestsScreenBackground=" + this.f87142e + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f87151a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f87152b = true;

        public final boolean a() {
            return this.f87152b;
        }

        public final boolean b() {
            return this.f87151a;
        }

        public final void c(boolean z11) {
            this.f87152b = z11;
        }

        public final void d(boolean z11) {
            this.f87151a = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f87151a == bVar.f87151a && this.f87152b == bVar.f87152b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f87152b) + (Boolean.hashCode(this.f87151a) * 31);
        }

        @NotNull
        public final String toString() {
            return Ef0.c.c("BlockCustomSettings(backButtonOnChatListHeaderEnabled=", ", backButtonOnChatHeaderEnabled=", ")", this.f87151a, this.f87152b);
        }
    }

    public interface c {
        @NotNull
        ru.ozon.android.messenger.framework.core.initialization.a getAppVersionConfig();

        InterfaceC6369b getOzonTracker();
    }

    /* renamed from: ru.ozon.android.messenger.framework.core.initialization.d$d, reason: collision with other inner class name */
    public interface InterfaceC1560d {
        void onCreate(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m);
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<Object> f87153a;

        public e(@NotNull List<? extends Object> externalAdapters) {
            Intrinsics.checkNotNullParameter(externalAdapters, "externalAdapters");
            this.f87153a = externalAdapters;
        }

        @NotNull
        public final List<Object> a() {
            return this.f87153a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.d(this.f87153a, ((e) obj).f87153a);
        }

        public final int hashCode() {
            return this.f87153a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("MoshiConfig(externalAdapters="), this.f87153a, ")");
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f87154a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f87155b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f87156c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f87157d;

        public f(String baseUrl, String webSocketUrl, String namespace, String baseComposerUrl) {
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter("composer-api.bx/_action/v2", "baseUrlPath");
            Intrinsics.checkNotNullParameter(webSocketUrl, "webSocketUrl");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(baseComposerUrl, "baseComposerUrl");
            this.f87154a = baseUrl;
            this.f87155b = webSocketUrl;
            this.f87156c = namespace;
            this.f87157d = baseComposerUrl;
        }

        @NotNull
        public final String a() {
            return this.f87157d;
        }

        @NotNull
        public final String b() {
            return this.f87154a;
        }

        @NotNull
        public final String c() {
            return this.f87156c;
        }

        @NotNull
        public final String d() {
            return this.f87155b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.d(this.f87154a, fVar.f87154a) && Intrinsics.d(this.f87155b, fVar.f87155b) && Intrinsics.d(this.f87156c, fVar.f87156c) && Intrinsics.d(this.f87157d, fVar.f87157d);
        }

        public final int hashCode() {
            return this.f87157d.hashCode() + G.g.a(G.g.a(((this.f87154a.hashCode() * 31) - 252882290) * 31, 31, this.f87155b), 961, this.f87156c);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NetworkConfig(baseUrl=");
            sb2.append(this.f87154a);
            sb2.append(", baseUrlPath=composer-api.bx/_action/v2, webSocketUrl=");
            sb2.append(this.f87155b);
            sb2.append(", namespace=");
            sb2.append(this.f87156c);
            sb2.append(", baseFileUrl=, baseComposerUrl=");
            return o0.c(sb2, this.f87157d, ")");
        }
    }

    public interface g {
        void onChanged();
    }

    @NotNull
    a getAiAssistantCustomSettings();

    @NotNull
    Context getAppContext();

    @NotNull
    b getBlockCustomSettings();

    @NotNull
    Set<ru.ozon.android.messenger.framework.core.a> getBlocks();

    @NotNull
    c getComposerDependencies();

    boolean getEnabledInsets();

    @NotNull
    ru.ozon.android.messenger.framework.core.c getFeatureProvider();

    @NotNull
    ru.ozon.android.messenger.framework.navigation.action.f getMessengerExternalActionHandler();

    InterfaceC1560d getMessengerLifecycleCallback();

    @NotNull
    e getMoshiAdapters();

    @NotNull
    f getNetworkConfig();

    ru.ozon.android.messenger.framework.logger.b getNonFatalLogger();

    @NotNull
    E getOkHttpClient();

    boolean getOzonLoggerEnabled();

    i getTrackerAnalyticsAdapter();

    @NotNull
    g getUnreadMsgCountChangedListener();
}
