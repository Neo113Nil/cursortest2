package defpackage;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class txb implements MatchResult {
    public final Matcher a;
    public final CharSequence b;
    public final a5 c;
    public sxb d;

    public txb(Matcher matcher, CharSequence charSequence) {
        matcher.getClass();
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new a5(this, 1);
    }

    @Override // kotlin.text.MatchResult
    public final List a() {
        sxb sxbVar = this.d;
        if (sxbVar != null) {
            return sxbVar;
        }
        sxb sxbVar2 = new sxb(this);
        this.d = sxbVar2;
        return sxbVar2;
    }

    @Override // kotlin.text.MatchResult
    public final IntRange b() {
        Matcher matcher = this.a;
        return llf.j(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String group = this.a.group();
        group.getClass();
        return group;
    }

    @Override // kotlin.text.MatchResult
    public final txb next() {
        Matcher matcher = this.a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(end)) {
            return new txb(matcher2, charSequence);
        }
        return null;
    }
}
