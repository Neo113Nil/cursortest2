package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation;

import A00.a;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4VO;

@InterfaceC6346b
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4Update;", "LA00/a$J$a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;", "content", "constructor-impl", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;", "", "toString-impl", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;Ljava/lang/Object;)Z", "equals", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;", "getContent", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFormV4Update implements a.J.InterfaceC0007a {

    @NotNull
    private final SearchFormV4VO.Content content;

    private /* synthetic */ SearchFormV4Update(SearchFormV4VO.Content content) {
        this.content = content;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SearchFormV4Update m1275boximpl(SearchFormV4VO.Content content) {
        return new SearchFormV4Update(content);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static SearchFormV4VO.Content m1276constructorimpl(@NotNull SearchFormV4VO.Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return content;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1277equalsimpl(SearchFormV4VO.Content content, Object obj) {
        return (obj instanceof SearchFormV4Update) && Intrinsics.d(content, ((SearchFormV4Update) obj).getContent());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1278hashCodeimpl(SearchFormV4VO.Content content) {
        return content.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1279toStringimpl(SearchFormV4VO.Content content) {
        return "SearchFormV4Update(content=" + content + ")";
    }

    public boolean equals(Object obj) {
        return m1277equalsimpl(this.content, obj);
    }

    public int hashCode() {
        return m1278hashCodeimpl(this.content);
    }

    public String toString() {
        return m1279toStringimpl(this.content);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ SearchFormV4VO.Content getContent() {
        return this.content;
    }
}
