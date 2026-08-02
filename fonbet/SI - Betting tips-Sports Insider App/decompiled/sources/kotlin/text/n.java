package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.t0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n implements MatchResult {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f19280a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f19281b;

    /* renamed from: c, reason: collision with root package name */
    public final m f19282c;

    /* renamed from: d, reason: collision with root package name */
    public t0 f19283d;

    public n(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f19280a = matcher;
        this.f19281b = input;
        this.f19282c = new m(this);
    }

    public final List a() {
        if (this.f19283d == null) {
            this.f19283d = new t0(this);
        }
        t0 t0Var = this.f19283d;
        Intrinsics.checkNotNull(t0Var);
        return t0Var;
    }

    public final IntRange b() {
        Matcher matcher = this.f19280a;
        return zf.j.d(matcher.start(), matcher.end());
    }

    public final n c() {
        Matcher matcher = this.f19280a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f19281b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
        if (matcher2.find(end)) {
            return new n(matcher2, charSequence);
        }
        return null;
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String group = this.f19280a.group();
        Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return group;
    }
}
