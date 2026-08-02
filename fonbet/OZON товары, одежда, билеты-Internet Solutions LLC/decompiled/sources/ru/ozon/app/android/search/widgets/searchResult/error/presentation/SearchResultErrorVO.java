package ru.ozon.app.android.search.widgets.searchResult.error.presentation;

import Ak.C2436a;
import G.g;
import WZ.t;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001)BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b%\u0010\u0012R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/error/presentation/SearchResultErrorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "message", "action", "deeplink", "Lru/ozon/app/android/search/widgets/searchResult/error/presentation/SearchResultErrorVO$DeeplinkType;", "type", "image", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/widgets/searchResult/error/presentation/SearchResultErrorVO$DeeplinkType;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getMessage", "getAction", "getDeeplink", "Lru/ozon/app/android/search/widgets/searchResult/error/presentation/SearchResultErrorVO$DeeplinkType;", "getType", "()Lru/ozon/app/android/search/widgets/searchResult/error/presentation/SearchResultErrorVO$DeeplinkType;", "getImage", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "DeeplinkType", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchResultErrorVO implements c {

    @NotNull
    private final String action;

    @NotNull
    private final String deeplink;
    private final long id;

    @NotNull
    private final String image;

    @NotNull
    private final String message;
    private final t tokenizedEvent;

    @NotNull
    private final DeeplinkType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/error/presentation/SearchResultErrorVO$DeeplinkType;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN", "REFRESH", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeeplinkType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DeeplinkType[] $VALUES;
        public static final DeeplinkType OPEN = new DeeplinkType("OPEN", 0);
        public static final DeeplinkType REFRESH = new DeeplinkType("REFRESH", 1);

        private static final /* synthetic */ DeeplinkType[] $values() {
            return new DeeplinkType[]{OPEN, REFRESH};
        }

        static {
            DeeplinkType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DeeplinkType(String str, int i11) {
        }

        public static DeeplinkType valueOf(String str) {
            return (DeeplinkType) Enum.valueOf(DeeplinkType.class, str);
        }

        public static DeeplinkType[] values() {
            return (DeeplinkType[]) $VALUES.clone();
        }
    }

    public SearchResultErrorVO(long j11, @NotNull String message, @NotNull String action, @NotNull String deeplink, @NotNull DeeplinkType type, @NotNull String image, t tVar) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(image, "image");
        this.id = j11;
        this.message = message;
        this.action = action;
        this.deeplink = deeplink;
        this.type = type;
        this.image = image;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultErrorVO)) {
            return false;
        }
        SearchResultErrorVO searchResultErrorVO = (SearchResultErrorVO) other;
        return this.id == searchResultErrorVO.id && Intrinsics.d(this.message, searchResultErrorVO.message) && Intrinsics.d(this.action, searchResultErrorVO.action) && Intrinsics.d(this.deeplink, searchResultErrorVO.deeplink) && this.type == searchResultErrorVO.type && Intrinsics.d(this.image, searchResultErrorVO.image) && Intrinsics.d(this.tokenizedEvent, searchResultErrorVO.tokenizedEvent);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final DeeplinkType getType() {
        return this.type;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a((this.type.hashCode() + g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.message), 31, this.action), 31, this.deeplink)) * 31, 31, this.image);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.message;
        String str2 = this.action;
        String str3 = this.deeplink;
        DeeplinkType deeplinkType = this.type;
        String str4 = this.image;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "SearchResultErrorVO(id=", ", message=", str);
        Nh.a.h(c11, ", action=", str2, ", deeplink=", str3);
        c11.append(", type=");
        c11.append(deeplinkType);
        c11.append(", image=");
        c11.append(str4);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
