package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractC7694a;
import kotlin.collections.AbstractC7696c;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public final class c implements MatchResult {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Matcher f71962a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CharSequence f71963b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f71964c;

    /* renamed from: d, reason: collision with root package name */
    private a f71965d;

    public static final class a extends AbstractC7696c<String> {
        a() {
        }

        @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final Object get(int i11) {
            String group = c.e(c.this).group(i11);
            return group == null ? "" : group;
        }

        @Override // kotlin.collections.AbstractC7694a
        public final int getSize() {
            return c.e(c.this).groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC7696c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractC7696c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public static final class b extends AbstractC7694a<MatchGroup> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/text/MatchGroup;", "a", "(I)Lkotlin/text/MatchGroup;"}, k = 3, mv = {1, 9, 0})
        static final class a extends AbstractC7737t implements Function1<Integer, MatchGroup> {
            a() {
                super(1);
            }

            public final MatchGroup a(int i11) {
                return b.this.b(i11);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ MatchGroup invoke(Integer num) {
                return a(num.intValue());
            }
        }

        b() {
        }

        public final MatchGroup b(int i11) {
            c cVar = c.this;
            Matcher e11 = c.e(cVar);
            IntRange o11 = kotlin.ranges.h.o(e11.start(i11), e11.end(i11));
            if (o11.getStart().intValue() < 0) {
                return null;
            }
            String group = c.e(cVar).group(i11);
            Intrinsics.checkNotNullExpressionValue(group, "group(...)");
            return new MatchGroup(group, o11);
        }

        @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return super.contains((MatchGroup) obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC7694a
        public final int getSize() {
            return c.e(c.this).groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC7694a, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<MatchGroup> iterator() {
            return kotlin.sequences.l.v(C7714v.w(C7714v.O(this)), new a()).iterator();
        }
    }

    public c(@NotNull Matcher matcher, @NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f71962a = matcher;
        this.f71963b = input;
        this.f71964c = new b();
    }

    public static final Matcher e(c cVar) {
        return cVar.f71962a;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public final MatchResult.a a() {
        return new MatchResult.a(this);
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public final b b() {
        return this.f71964c;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public final List<String> c() {
        if (this.f71965d == null) {
            this.f71965d = new a();
        }
        a aVar = this.f71965d;
        Intrinsics.f(aVar);
        return aVar;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public final IntRange d() {
        Matcher matcher = this.f71962a;
        return kotlin.ranges.h.o(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public final String getValue() {
        String group = this.f71962a.group();
        Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return group;
    }

    @Override // kotlin.text.MatchResult
    public final MatchResult next() {
        Matcher matcher = this.f71962a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f71963b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
        if (matcher2.find(end)) {
            return new c(matcher2, charSequence);
        }
        return null;
    }
}
