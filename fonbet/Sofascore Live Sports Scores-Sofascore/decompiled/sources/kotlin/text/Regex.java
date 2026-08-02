package kotlin.text;

import defpackage.a65;
import defpackage.quf;
import defpackage.suf;
import defpackage.tuf;
import defpackage.txb;
import defpackage.uuf;
import defpackage.zbe;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0002\u0014\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "b", "suf", "quf", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Regex implements Serializable {

    @NotNull
    public static final quf b = new quf(null);
    public final Pattern a;

    public Regex(String str, uuf uufVar) {
        str.getClass();
        uufVar.getClass();
        quf qufVar = b;
        int i = uufVar.a;
        qufVar.getClass();
        Pattern compile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        compile.getClass();
        this.a = compile;
    }

    private final void readObject(ObjectInputStream input) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.a;
        String pattern2 = pattern.pattern();
        pattern2.getClass();
        return new suf(pattern2, pattern.flags());
    }

    public final boolean a(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).find();
    }

    public final txb b(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        if (matcher.find(0)) {
            return new txb(matcher, charSequence);
        }
        return null;
    }

    public final a65 c(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 0) {
            return new a65(new zbe(23, this, charSequence), tuf.b);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + charSequence.length());
    }

    public final txb d(int i, String str) {
        str.getClass();
        Matcher region = this.a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new txb(region, str);
        }
        return null;
    }

    public final txb e(String str) {
        str.getClass();
        Matcher matcher = this.a.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new txb(matcher, str);
        }
        return null;
    }

    public final boolean f(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).matches();
    }

    public final String g(CharSequence charSequence, Function1 function1) {
        charSequence.getClass();
        txb b2 = b(charSequence);
        if (b2 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append(charSequence, i, b2.b().a);
            sb.append((CharSequence) function1.invoke(b2));
            i = b2.b().b + 1;
            b2 = b2.next();
            if (i >= length) {
                break;
            }
        } while (b2 != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        return sb.toString();
    }

    public final List h(CharSequence charSequence) {
        charSequence.getClass();
        int i = 0;
        StringsKt__StringsKt.A(0);
        Matcher matcher = this.a.matcher(charSequence);
        if (!matcher.find()) {
            return kotlin.collections.a.c(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(i, matcher.start()).toString());
            i = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        input.getClass();
        replacement.getClass();
        String replaceAll = this.a.matcher(input).replaceAll(replacement);
        replaceAll.getClass();
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.a.toString();
        pattern.getClass();
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(@NotNull String str) {
        this(r1);
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
    }

    public Regex(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }
}
