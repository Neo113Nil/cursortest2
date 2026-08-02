package okhttp3;

import e6.g0;
import gh.v;
import gh.w;
import hh.e;
import hh.g;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import j$.util.DesugarCollections;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.p;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lh.d;
import of.c;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y4.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 52\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002$6B\u0017\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020!H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0/¢\u0006\u0004\b0\u00101R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u00067"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "", "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "getDate", "(Ljava/lang/String;)Ljava/util/Date;", "j$/time/Instant", "getInstant", "(Ljava/lang/String;)Lj$/time/Instant;", "", "-deprecated_size", "()I", "size", "index", "(I)Ljava/lang/String;", "value", "", "names", "()Ljava/util/Set;", "", "values", "(Ljava/lang/String;)Ljava/util/List;", "", "byteCount", "()J", "", "iterator", "()Ljava/util/Iterator;", "Lgh/v;", "newBuilder", "()Lgh/v;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "", "toMultimap", "()Ljava/util/Map;", "[Ljava/lang/String;", "getNamesAndValues$okhttp", "()[Ljava/lang/String;", "Companion", "gh/w", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers\n+ 2 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n*L\n1#1,359:1\n246#2:360\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers\n*L\n110#1:360\n*E\n"})
/* loaded from: classes3.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    @NotNull
    public static final w Companion = new w();

    @NotNull
    public static final Headers EMPTY = new Headers(new String[0]);

    @NotNull
    private final String[] namesAndValues;

    public Headers(@NotNull String[] namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        this.namesAndValues = namesAndValues;
    }

    @NotNull
    public static final Headers of(@NotNull Map<String, String> map) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map, "<this>");
        String[] strArr = new String[map.size() * 2];
        int i5 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String obj = StringsKt.Z(key).toString();
            String obj2 = StringsKt.Z(value).toString();
            a.w(obj);
            a.x(obj2, obj);
            strArr[i5] = obj;
            strArr[i5 + 1] = obj2;
            i5 += 2;
        }
        return new Headers(strArr);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m121deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i5 = 0; i5 < strArr.length; i5++) {
            length += this.namesAndValues[i5].length();
        }
        return length;
    }

    public boolean equals(@Nullable Object other) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return (other instanceof Headers) && Arrays.equals(getNamesAndValues(), ((Headers) other).getNamesAndValues());
    }

    @Nullable
    public final String get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] namesAndValues = this.namesAndValues;
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = namesAndValues.length - 2;
        int a7 = c.a(length, 0, -2);
        if (a7 > length) {
            return null;
        }
        while (!z.j(name, namesAndValues[length], true)) {
            if (length == a7) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    @Nullable
    public final Date getDate(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String str = get(name);
        if (str == null) {
            return null;
        }
        g0 g0Var = d.f20086a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) d.f20086a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = d.f20087b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i5 = 0; i5 < length; i5++) {
                    DateFormat[] dateFormatArr = d.f20088c;
                    DateFormat dateFormat = dateFormatArr[i5];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(d.f20087b[i5], Locale.US);
                        dateFormat.setTimeZone(g.f10825a);
                        dateFormatArr[i5] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                Unit unit = Unit.f19194a;
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant getInstant(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return DateRetargetClass.toInstant(date);
        }
        return null;
    }

    @NotNull
    /* renamed from: getNamesAndValues$okhttp, reason: from getter */
    public final String[] getNamesAndValues() {
        return this.namesAndValues;
    }

    public int hashCode() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return Arrays.hashCode(getNamesAndValues());
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i5 = 0; i5 < size; i5++) {
            pairArr[i5] = new Pair(name(i5), value(i5));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    @NotNull
    public final String name(int index) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        String str = (String) p.r(index * 2, getNamesAndValues());
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + index + ']');
    }

    @NotNull
    public final Set<String> names() {
        Intrinsics.checkNotNullParameter(StringCompanionObject.INSTANCE, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            treeSet.add(name(i5));
        }
        Set<String> unmodifiableSet = DesugarCollections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    @NotNull
    public final v newBuilder() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        v vVar = new v();
        kotlin.collections.z.o(vVar.f10320a, getNamesAndValues());
        return vVar;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @NotNull
    public final Map<String, List<String>> toMultimap() {
        Intrinsics.checkNotNullParameter(StringCompanionObject.INSTANCE, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            String name = name(i5);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = name.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i5));
        }
        return treeMap;
    }

    @NotNull
    public String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            String name = name(i5);
            String value = value(i5);
            sb2.append(name);
            sb2.append(": ");
            if (e.j(name)) {
                value = "██";
            }
            sb2.append(value);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    @NotNull
    public final String value(int index) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        String str = (String) p.r((index * 2) + 1, getNamesAndValues());
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + index + ']');
    }

    @NotNull
    public final List<String> values(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        List<String> list = null;
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < size; i5++) {
            if (z.j(name, name(i5), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i5));
            }
        }
        if (arrayList != null) {
            list = DesugarCollections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(list, "unmodifiableList(...)");
        }
        return list == null ? e0.f19204a : list;
    }

    @NotNull
    public static final Headers of(@NotNull String... strArr) {
        Companion.getClass();
        return w.a(strArr);
    }
}
