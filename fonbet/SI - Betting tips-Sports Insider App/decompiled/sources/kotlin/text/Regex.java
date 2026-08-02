package kotlin.text;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0002\u0014\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "b", "kotlin/text/q", "kotlin/text/o", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,404:1\n24#2,3:405\n1#3:408\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n105#1:405,3\n*E\n"})
/* loaded from: classes3.dex */
public final class Regex implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final o f19246b = new o(null);

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f19247a;

    public Regex(Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f19247a = nativePattern;
    }

    public static n a(Regex regex, CharSequence input) {
        regex.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = regex.f19247a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new n(matcher, input);
        }
        return null;
    }

    private final void readObject(ObjectInputStream input) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.f19247a;
        String pattern2 = pattern.pattern();
        Intrinsics.checkNotNullExpressionValue(pattern2, "pattern(...)");
        return new q(pattern2, pattern.flags());
    }

    public final n b(int i5, String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher region = this.f19247a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i5, input.length());
        if (!region.lookingAt()) {
            return null;
        }
        Intrinsics.checkNotNull(region);
        return new n(region, input);
    }

    public final n c(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f19247a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new n(matcher, input);
        }
        return null;
    }

    public final boolean d(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f19247a.matcher(input).matches();
    }

    public final List e(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        int i5 = 0;
        StringsKt__StringsKt.u(0);
        Matcher matcher = this.f19247a.matcher(input);
        if (!matcher.find()) {
            return kotlin.collections.t.c(input.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(input.subSequence(i5, matcher.start()).toString());
            i5 = matcher.end();
        } while (matcher.find());
        arrayList.add(input.subSequence(i5, input.length()).toString());
        return arrayList;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String replaceAll = this.f19247a.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f19247a.toString();
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
    public Regex(String pattern, r option) {
        this(r2);
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(option, "option");
        o oVar = f19246b;
        int i5 = option.f19289a;
        oVar.getClass();
        Pattern compile = Pattern.compile(pattern, (i5 & 2) != 0 ? i5 | 64 : i5);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
    }
}
