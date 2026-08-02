package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import B0.A0;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/SearchAnalyticsCustomizedParams;", "", "", "searchString", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "getSearchString", "()Ljava/lang/String;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchAnalyticsCustomizedParams {
    private final String searchString;

    private /* synthetic */ SearchAnalyticsCustomizedParams(String str) {
        this.searchString = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SearchAnalyticsCustomizedParams m982boximpl(String str) {
        return new SearchAnalyticsCustomizedParams(str);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m983constructorimpl(String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m984equalsimpl(String str, Object obj) {
        return (obj instanceof SearchAnalyticsCustomizedParams) && Intrinsics.d(str, ((SearchAnalyticsCustomizedParams) obj).getSearchString());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m985hashCodeimpl(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m986toStringimpl(String str) {
        return A0.b("SearchAnalyticsCustomizedParams(searchString=", str, ")");
    }

    public boolean equals(Object obj) {
        return m984equalsimpl(this.searchString, obj);
    }

    public int hashCode() {
        return m985hashCodeimpl(this.searchString);
    }

    public String toString() {
        return m986toStringimpl(this.searchString);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ String getSearchString() {
        return this.searchString;
    }
}
