package ru.ozon.android.messenger.framework.presentation.chatlist;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface j {

    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f90488a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, String> f90489b;

        public a(@NotNull String link, @NotNull Map<String, String> bodyParams) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(bodyParams, "bodyParams");
            this.f90488a = link;
            this.f90489b = bodyParams;
        }

        @NotNull
        public final Map<String, String> a() {
            return this.f90489b;
        }

        @NotNull
        public final String b() {
            return this.f90488a;
        }
    }

    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.navigation.args.a f90490a;

        public b(@NotNull ru.ozon.android.messenger.framework.navigation.args.a args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.f90490a = args;
        }

        @NotNull
        public final ru.ozon.android.messenger.framework.navigation.args.a a() {
            return this.f90490a;
        }
    }

    public static final class c implements j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.blocks.curtain.c f90491a;

        public c(@NotNull ru.ozon.android.messenger.blocks.curtain.c curtainModalVO) {
            Intrinsics.checkNotNullParameter(curtainModalVO, "curtainModalVO");
            this.f90491a = curtainModalVO;
        }

        @NotNull
        public final ru.ozon.android.messenger.blocks.curtain.c a() {
            return this.f90491a;
        }
    }
}
