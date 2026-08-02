package ru.ozon.app.android.commonwidgets.widgets.refresh;

import B0.C2454a;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/refresh/RefreshDTO;", "", "refreshAction", "Lru/ozon/app/android/commonwidgets/widgets/refresh/RefreshDTO$RefreshAction;", "<init>", "(Lru/ozon/app/android/commonwidgets/widgets/refresh/RefreshDTO$RefreshAction;)V", "getRefreshAction", "()Lru/ozon/app/android/commonwidgets/widgets/refresh/RefreshDTO$RefreshAction;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RefreshAction", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RefreshDTO {
    private final RefreshAction refreshAction;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/refresh/RefreshDTO$RefreshAction;", "", "link", "", "refreshAfter", "", "scrollPosition", "Lru/ozon/app/android/commonwidgets/widgets/refresh/ScrollPosition;", "<init>", "(Ljava/lang/String;ILru/ozon/app/android/commonwidgets/widgets/refresh/ScrollPosition;)V", "getLink", "()Ljava/lang/String;", "getRefreshAfter", "()I", "getScrollPosition", "()Lru/ozon/app/android/commonwidgets/widgets/refresh/ScrollPosition;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RefreshAction {

        @NotNull
        private final String link;
        private final int refreshAfter;
        private final ScrollPosition scrollPosition;

        public RefreshAction(@NotNull String link, int i11, ScrollPosition scrollPosition) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
            this.refreshAfter = i11;
            this.scrollPosition = scrollPosition;
        }

        public static /* synthetic */ RefreshAction copy$default(RefreshAction refreshAction, String str, int i11, ScrollPosition scrollPosition, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = refreshAction.link;
            }
            if ((i12 & 2) != 0) {
                i11 = refreshAction.refreshAfter;
            }
            if ((i12 & 4) != 0) {
                scrollPosition = refreshAction.scrollPosition;
            }
            return refreshAction.copy(str, i11, scrollPosition);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRefreshAfter() {
            return this.refreshAfter;
        }

        /* renamed from: component3, reason: from getter */
        public final ScrollPosition getScrollPosition() {
            return this.scrollPosition;
        }

        @NotNull
        public final RefreshAction copy(@NotNull String link, int refreshAfter, ScrollPosition scrollPosition) {
            Intrinsics.checkNotNullParameter(link, "link");
            return new RefreshAction(link, refreshAfter, scrollPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RefreshAction)) {
                return false;
            }
            RefreshAction refreshAction = (RefreshAction) other;
            return Intrinsics.d(this.link, refreshAction.link) && this.refreshAfter == refreshAction.refreshAfter && this.scrollPosition == refreshAction.scrollPosition;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public final int getRefreshAfter() {
            return this.refreshAfter;
        }

        public final ScrollPosition getScrollPosition() {
            return this.scrollPosition;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.refreshAfter, this.link.hashCode() * 31, 31);
            ScrollPosition scrollPosition = this.scrollPosition;
            return a11 + (scrollPosition == null ? 0 : scrollPosition.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.link;
            int i11 = this.refreshAfter;
            ScrollPosition scrollPosition = this.scrollPosition;
            StringBuilder c11 = C3660k.c(i11, "RefreshAction(link=", str, ", refreshAfter=", ", scrollPosition=");
            c11.append(scrollPosition);
            c11.append(")");
            return c11.toString();
        }
    }

    public RefreshDTO(RefreshAction refreshAction) {
        this.refreshAction = refreshAction;
    }

    public static /* synthetic */ RefreshDTO copy$default(RefreshDTO refreshDTO, RefreshAction refreshAction, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            refreshAction = refreshDTO.refreshAction;
        }
        return refreshDTO.copy(refreshAction);
    }

    /* renamed from: component1, reason: from getter */
    public final RefreshAction getRefreshAction() {
        return this.refreshAction;
    }

    @NotNull
    public final RefreshDTO copy(RefreshAction refreshAction) {
        return new RefreshDTO(refreshAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RefreshDTO) && Intrinsics.d(this.refreshAction, ((RefreshDTO) other).refreshAction);
    }

    public final RefreshAction getRefreshAction() {
        return this.refreshAction;
    }

    public int hashCode() {
        RefreshAction refreshAction = this.refreshAction;
        if (refreshAction == null) {
            return 0;
        }
        return refreshAction.hashCode();
    }

    @NotNull
    public String toString() {
        return "RefreshDTO(refreshAction=" + this.refreshAction + ")";
    }
}
