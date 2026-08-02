package ru.ozon.app.android.geo.options.data;

import B0.C2454a;
import B90.C2616s;
import B90.C2618u;
import G.g;
import N3.C3660k;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J{\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0007HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001c¨\u0006."}, d2 = {"Lru/ozon/app/android/geo/options/data/Options;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", HammersV3BodyDTO.PLACEHOLDER, SearchIntents.EXTRA_QUERY, "threshold", "", "geocodingActionPath", "viewPort", "Lru/ozon/app/android/geo/options/data/ViewPort;", "emptyStateElements", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "unavailableStateElements", "initialElements", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lru/ozon/app/android/geo/options/data/ViewPort;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getPlaceholder", "getQuery", "getThreshold", "()I", "getGeocodingActionPath", "getViewPort", "()Lru/ozon/app/android/geo/options/data/ViewPort;", "getEmptyStateElements", "()Ljava/util/List;", "getUnavailableStateElements", "getInitialElements", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Options {
    private final List<TextAtom> emptyStateElements;

    @NotNull
    private final String geocodingActionPath;
    private final List<TextAtom> initialElements;

    @NotNull
    private final String placeholder;

    @NotNull
    private final String query;
    private final int threshold;

    @NotNull
    private final String title;
    private final List<TextAtom> unavailableStateElements;

    @NotNull
    private final ViewPort viewPort;

    public Options(@NotNull String title, @NotNull String placeholder, @NotNull String query, int i11, @NotNull String geocodingActionPath, @NotNull ViewPort viewPort, List<TextAtom> list, List<TextAtom> list2, List<TextAtom> list3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(geocodingActionPath, "geocodingActionPath");
        Intrinsics.checkNotNullParameter(viewPort, "viewPort");
        this.title = title;
        this.placeholder = placeholder;
        this.query = query;
        this.threshold = i11;
        this.geocodingActionPath = geocodingActionPath;
        this.viewPort = viewPort;
        this.emptyStateElements = list;
        this.unavailableStateElements = list2;
        this.initialElements = list3;
    }

    public static /* synthetic */ Options copy$default(Options options, String str, String str2, String str3, int i11, String str4, ViewPort viewPort, List list, List list2, List list3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = options.title;
        }
        if ((i12 & 2) != 0) {
            str2 = options.placeholder;
        }
        if ((i12 & 4) != 0) {
            str3 = options.query;
        }
        if ((i12 & 8) != 0) {
            i11 = options.threshold;
        }
        if ((i12 & 16) != 0) {
            str4 = options.geocodingActionPath;
        }
        if ((i12 & 32) != 0) {
            viewPort = options.viewPort;
        }
        if ((i12 & 64) != 0) {
            list = options.emptyStateElements;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list2 = options.unavailableStateElements;
        }
        if ((i12 & 256) != 0) {
            list3 = options.initialElements;
        }
        List list4 = list2;
        List list5 = list3;
        ViewPort viewPort2 = viewPort;
        List list6 = list;
        String str5 = str4;
        String str6 = str3;
        return options.copy(str, str2, str6, i11, str5, viewPort2, list6, list4, list5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component4, reason: from getter */
    public final int getThreshold() {
        return this.threshold;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getGeocodingActionPath() {
        return this.geocodingActionPath;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ViewPort getViewPort() {
        return this.viewPort;
    }

    public final List<TextAtom> component7() {
        return this.emptyStateElements;
    }

    public final List<TextAtom> component8() {
        return this.unavailableStateElements;
    }

    public final List<TextAtom> component9() {
        return this.initialElements;
    }

    @NotNull
    public final Options copy(@NotNull String title, @NotNull String placeholder, @NotNull String query, int threshold, @NotNull String geocodingActionPath, @NotNull ViewPort viewPort, List<TextAtom> emptyStateElements, List<TextAtom> unavailableStateElements, List<TextAtom> initialElements) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(geocodingActionPath, "geocodingActionPath");
        Intrinsics.checkNotNullParameter(viewPort, "viewPort");
        return new Options(title, placeholder, query, threshold, geocodingActionPath, viewPort, emptyStateElements, unavailableStateElements, initialElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Options)) {
            return false;
        }
        Options options = (Options) other;
        return Intrinsics.d(this.title, options.title) && Intrinsics.d(this.placeholder, options.placeholder) && Intrinsics.d(this.query, options.query) && this.threshold == options.threshold && Intrinsics.d(this.geocodingActionPath, options.geocodingActionPath) && Intrinsics.d(this.viewPort, options.viewPort) && Intrinsics.d(this.emptyStateElements, options.emptyStateElements) && Intrinsics.d(this.unavailableStateElements, options.unavailableStateElements) && Intrinsics.d(this.initialElements, options.initialElements);
    }

    public final List<TextAtom> getEmptyStateElements() {
        return this.emptyStateElements;
    }

    @NotNull
    public final String getGeocodingActionPath() {
        return this.geocodingActionPath;
    }

    public final List<TextAtom> getInitialElements() {
        return this.initialElements;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final List<TextAtom> getUnavailableStateElements() {
        return this.unavailableStateElements;
    }

    @NotNull
    public final ViewPort getViewPort() {
        return this.viewPort;
    }

    public int hashCode() {
        int hashCode = (this.viewPort.hashCode() + g.a(C2454a.a(this.threshold, g.a(g.a(this.title.hashCode() * 31, 31, this.placeholder), 31, this.query), 31), 31, this.geocodingActionPath)) * 31;
        List<TextAtom> list = this.emptyStateElements;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<TextAtom> list2 = this.unavailableStateElements;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TextAtom> list3 = this.initialElements;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.placeholder;
        String str3 = this.query;
        int i11 = this.threshold;
        String str4 = this.geocodingActionPath;
        ViewPort viewPort = this.viewPort;
        List<TextAtom> list = this.emptyStateElements;
        List<TextAtom> list2 = this.unavailableStateElements;
        List<TextAtom> list3 = this.initialElements;
        StringBuilder d11 = C3660k.d("Options(title=", str, ", placeholder=", str2, ", query=");
        Pk0.g.d(i11, str3, ", threshold=", ", geocodingActionPath=", d11);
        d11.append(str4);
        d11.append(", viewPort=");
        d11.append(viewPort);
        d11.append(", emptyStateElements=");
        C2616s.g(", unavailableStateElements=", ", initialElements=", d11, list, list2);
        return C2618u.h(d11, list3, ")");
    }
}
