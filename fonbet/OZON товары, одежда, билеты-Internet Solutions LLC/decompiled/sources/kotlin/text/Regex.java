package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0002\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "", "writeReplace", "()Ljava/lang/Object;", "", "input", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "b", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Regex implements Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Pattern f71949a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/Regex$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.Regex$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00062\u00060\u0001j\u0002`\u0002:\u0001\u0007J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlin/text/Regex$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "c", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    private static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f71951a;

        /* renamed from: b, reason: collision with root package name */
        private final int f71952b;

        public b(@NotNull String pattern, int i11) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.f71951a = pattern;
            this.f71952b = i11;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f71951a, this.f71952b);
            Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
            return new Regex(compile);
        }
    }

    public Regex(@NotNull Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f71949a = nativePattern;
    }

    public static Sequence d(Regex regex, String input) {
        regex.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() >= 0) {
            return kotlin.sequences.l.r(new d(regex, input), e.f71971a);
        }
        StringBuilder f7 = P4.f.f(0, "Start index out of bounds: ", ", input length: ");
        f7.append(input.length());
        throw new IndexOutOfBoundsException(f7.toString());
    }

    private final Object writeReplace() {
        Pattern pattern = this.f71949a;
        String pattern2 = pattern.pattern();
        Intrinsics.checkNotNullExpressionValue(pattern2, "pattern(...)");
        return new b(pattern2, pattern.flags());
    }

    public final boolean a(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f71949a.matcher(input).find();
    }

    public final MatchResult b(int i11, @NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f71949a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.find(i11)) {
            return new c(matcher, input);
        }
        return null;
    }

    public final MatchResult e(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f71949a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new c(matcher, input);
        }
        return null;
    }

    public final boolean f(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f71949a.matcher(input).matches();
    }

    @NotNull
    public final String g(@NotNull String input, @NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i11 = 0;
        MatchResult b11 = b(0, input);
        if (b11 == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            c cVar = (c) b11;
            sb2.append((CharSequence) input, i11, cVar.d().getStart().intValue());
            sb2.append((CharSequence) transform.invoke(b11));
            i11 = cVar.d().getF71843b() + 1;
            b11 = cVar.next();
            if (i11 >= length) {
                break;
            }
        } while (b11 != null);
        if (i11 < length) {
            sb2.append((CharSequence) input, i11, length);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    public final String h(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter("/", "replacement");
        String replaceFirst = this.f71949a.matcher(input).replaceFirst("/");
        Intrinsics.checkNotNullExpressionValue(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    @NotNull
    public final List i(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        int i11 = 0;
        w.j(0);
        Matcher matcher = this.f71949a.matcher(input);
        if (!matcher.find()) {
            return C7714v.a0(input.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(input.subSequence(i11, matcher.start()).toString());
            i11 = matcher.end();
        } while (matcher.find());
        arrayList.add(input.subSequence(i11, input.length()).toString());
        return arrayList;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String replaceAll = this.f71949a.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @NotNull
    public final String toString() {
        String pattern = this.f71949a.toString();
        Intrinsics.checkNotNullExpressionValue(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(@NotNull String pattern) {
        this(r2);
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern compile = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(@NotNull String pattern, @NotNull f option) {
        this(r2);
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(option, "option");
        Companion companion = INSTANCE;
        int value = option.getValue();
        companion.getClass();
        Pattern compile = Pattern.compile(pattern, (value & 2) != 0 ? value | 64 : value);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
    }
}
