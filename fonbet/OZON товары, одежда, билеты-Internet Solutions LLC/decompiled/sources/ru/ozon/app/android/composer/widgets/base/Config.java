package ru.ozon.app.android.composer.widgets.base;

import Sc.InterfaceC3999a;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R,\u0010\u0007\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/composer/widgets/base/Config;", "S", "Lj20/a;", "Lkotlin/Function2;", "", "getParser", "()Lkotlin/jvm/functions/Function2;", "parser", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Config<S> extends InterfaceC7243a<S> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <S> boolean canParse(@NotNull Config<S> config, @NotNull C7244b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            InterfaceC7243a.C1128a.a(state);
            return true;
        }

        @NotNull
        public static <S> Set<String> getSupportedPlaceholders(@NotNull Config<S> config) {
            return M.f71699a;
        }

        @NotNull
        public static <S> long[] getSupportedVersions(@NotNull Config<S> config) {
            return j.b();
        }

        public static <S> S parse(@NotNull Config<S> config, @NotNull C7244b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return config.getParser().invoke(null, state.b());
        }
    }

    @NotNull
    Function2<String, String, S> getParser();
}
