package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/MatchResult;", "", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface MatchResult {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final MatchResult f71947a;

        public a(@NotNull MatchResult match) {
            Intrinsics.checkNotNullParameter(match, "match");
            this.f71947a = match;
        }

        @NotNull
        public final MatchResult a() {
            return this.f71947a;
        }
    }

    @NotNull
    a a();

    @NotNull
    c.b b();

    @NotNull
    List<String> c();

    @NotNull
    IntRange d();

    @NotNull
    String getValue();

    MatchResult next();
}
