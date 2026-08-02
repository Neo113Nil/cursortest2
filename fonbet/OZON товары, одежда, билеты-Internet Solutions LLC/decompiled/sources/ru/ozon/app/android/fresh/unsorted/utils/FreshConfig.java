package ru.ozon.app.android.fresh.unsorted.utils;

import j20.C7244b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.base.Config;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/utils/FreshConfig;", "State", "Lru/ozon/app/android/composer/widgets/base/Config;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FreshConfig<State> extends Config<State> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <State> boolean canParse(@NotNull FreshConfig<State> freshConfig, @NotNull C7244b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return Config.DefaultImpls.canParse(freshConfig, state);
        }

        @NotNull
        public static <State> Set<String> getSupportedPlaceholders(@NotNull FreshConfig<State> freshConfig) {
            return Config.DefaultImpls.getSupportedPlaceholders(freshConfig);
        }

        @NotNull
        public static <State> long[] getSupportedVersions(@NotNull FreshConfig<State> freshConfig) {
            return Config.DefaultImpls.getSupportedVersions(freshConfig);
        }

        @NotNull
        public static <State> String getVertical(@NotNull FreshConfig<State> freshConfig) {
            return "express";
        }

        public static <State> State parse(@NotNull FreshConfig<State> freshConfig, @NotNull C7244b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return (State) Config.DefaultImpls.parse(freshConfig, state);
        }
    }
}
