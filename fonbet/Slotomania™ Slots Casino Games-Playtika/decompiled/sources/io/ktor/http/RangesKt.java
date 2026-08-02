package io.ktor.http;

import io.ktor.http.ContentRange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.LongRange;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0005*\b\u0012\u0004\u0012\u00020\t0\u0005H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "rangeSpec", "Lio/ktor/http/RangesSpecifier;", "parseRangesSpecifier", "(Ljava/lang/String;)Lio/ktor/http/RangesSpecifier;", "", "Lio/ktor/http/ContentRange;", "", "contentLength", "Lkotlin/ranges/LongRange;", "toLongRanges", "(Ljava/util/List;J)Ljava/util/List;", "mergeRangesKeepOrder", "(Ljava/util/List;)Ljava/util/List;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RangesKt {
    public static final RangesSpecifier parseRangesSpecifier(String rangeSpec) {
        int indexOf$default;
        Pair pair;
        ContentRange bounded;
        Intrinsics.checkNotNullParameter(rangeSpec, "rangeSpec");
        try {
            indexOf$default = StringsKt.indexOf$default((CharSequence) rangeSpec, "=", 0, false, 6, (Object) null);
        } catch (Throwable unused) {
        }
        if (indexOf$default == -1) {
            return null;
        }
        String substring = rangeSpec.substring(0, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = rangeSpec.substring(indexOf$default + "=".length());
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        Pair pair2 = TuplesKt.to(substring, substring2);
        String str = (String) pair2.component1();
        List<String> split$default = StringsKt.split$default((CharSequence) pair2.component2(), new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
        for (String str2 : split$default) {
            if (StringsKt.startsWith$default(str2, "-", false, 2, (Object) null)) {
                bounded = new ContentRange.Suffix(Long.parseLong(StringsKt.removePrefix(str2, (CharSequence) "-")));
            } else {
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, "-", 0, false, 6, (Object) null);
                if (indexOf$default2 == -1) {
                    pair = TuplesKt.to("", "");
                } else {
                    String substring3 = str2.substring(0, indexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                    String substring4 = str2.substring(indexOf$default2 + "-".length());
                    Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                    pair = TuplesKt.to(substring3, substring4);
                }
                String str3 = (String) pair.component1();
                String str4 = (String) pair.component2();
                bounded = str4.length() > 0 ? new ContentRange.Bounded(Long.parseLong(str3), Long.parseLong(str4)) : new ContentRange.TailFrom(Long.parseLong(str3));
            }
            arrayList.add(bounded);
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty() && str.length() != 0) {
            RangesSpecifier rangesSpecifier = new RangesSpecifier(str, arrayList2);
            if (RangesSpecifier.isValid$default(rangesSpecifier, null, 1, null)) {
                return rangesSpecifier;
            }
        }
        return null;
    }

    public static final List<LongRange> toLongRanges(List<? extends ContentRange> list, long j) {
        LongRange until;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<? extends ContentRange> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ContentRange contentRange : list2) {
            if (contentRange instanceof ContentRange.Bounded) {
                ContentRange.Bounded bounded = (ContentRange.Bounded) contentRange;
                until = new LongRange(bounded.getFrom(), kotlin.ranges.RangesKt.coerceAtMost(bounded.getTo(), j - 1));
            } else if (contentRange instanceof ContentRange.TailFrom) {
                until = kotlin.ranges.RangesKt.until(((ContentRange.TailFrom) contentRange).getFrom(), j);
            } else {
                if (!(contentRange instanceof ContentRange.Suffix)) {
                    throw new NoWhenBranchMatchedException();
                }
                until = kotlin.ranges.RangesKt.until(kotlin.ranges.RangesKt.coerceAtLeast(j - ((ContentRange.Suffix) contentRange).getLastCount(), 0L), j);
            }
            arrayList.add(until);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((LongRange) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final List<LongRange> mergeRangesKeepOrder(List<LongRange> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<LongRange> sortedWith = CollectionsKt.sortedWith(list, new Comparator() { // from class: io.ktor.http.RangesKt$mergeRangesKeepOrder$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((LongRange) t).getFirst()), Long.valueOf(((LongRange) t2).getFirst()));
            }
        });
        ArrayList arrayList = new ArrayList(list.size());
        for (LongRange longRange : sortedWith) {
            if (arrayList.isEmpty()) {
                arrayList.add(longRange);
            } else {
                ArrayList arrayList2 = arrayList;
                if (((LongRange) CollectionsKt.last((List) arrayList2)).getLast() < longRange.getFirst() - 1) {
                    arrayList.add(longRange);
                } else {
                    LongRange longRange2 = (LongRange) CollectionsKt.last((List) arrayList2);
                    arrayList.set(CollectionsKt.getLastIndex(arrayList2), new LongRange(longRange2.getFirst(), Math.max(longRange2.getLast(), longRange.getLast())));
                }
            }
        }
        LongRange[] longRangeArr = new LongRange[list.size()];
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            LongRange longRange3 = (LongRange) next;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (io.ktor.util.RangesKt.contains(longRange3, list.get(i))) {
                    longRangeArr[i] = longRange3;
                    break;
                }
                i++;
            }
        }
        return ArraysKt.filterNotNull(longRangeArr);
    }
}
