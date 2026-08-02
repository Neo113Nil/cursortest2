package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation;

import T7.E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"ru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action", "", "<init>", "()V", "NotifyPreviewAdapter", "LockPager", "UnlockPager", "ShowPreview", "HidePreview", "HideSystemUI", "HideCloseBtn", "ShowSystemUI", "ShowCloseBtn", "Expand", "Collapse", "BindItems", "SetCurrentPage", "SmoothScrollToPage", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$BindItems;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$Collapse;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$Expand;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$HideCloseBtn;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$HidePreview;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$HideSystemUI;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$LockPager;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$NotifyPreviewAdapter;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$SetCurrentPage;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$ShowCloseBtn;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$ShowPreview;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$ShowSystemUI;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$SmoothScrollToPage;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$UnlockPager;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GalleryFullViewViewModel$Action {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$BindItems;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;", "data", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;", "getData", "()Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BindItems extends GalleryFullViewViewModel$Action {

        @NotNull
        private final GalleryFullViewVO data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindItems(@NotNull GalleryFullViewVO data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BindItems) && Intrinsics.d(this.data, ((BindItems) other).data);
        }

        @NotNull
        public final GalleryFullViewVO getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "BindItems(data=" + this.data + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$Collapse;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Collapse extends GalleryFullViewViewModel$Action {

        @NotNull
        public static final Collapse INSTANCE = new Collapse();

        private Collapse() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$Expand;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Expand extends GalleryFullViewViewModel$Action {

        @NotNull
        public static final Expand INSTANCE = new Expand();

        private Expand() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$HideCloseBtn;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HideCloseBtn extends GalleryFullViewViewModel$Action {

        @NotNull
        public static final HideCloseBtn INSTANCE = new HideCloseBtn();

        private HideCloseBtn() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$HidePreview;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HidePreview extends GalleryFullViewViewModel$Action {

        @NotNull
        public static final HidePreview INSTANCE = new HidePreview();

        private HidePreview() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$HideSystemUI;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HideSystemUI extends GalleryFullViewViewModel$Action {

        @NotNull
        public static final HideSystemUI INSTANCE = new HideSystemUI();

        private HideSystemUI() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$LockPager;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LockPager extends GalleryFullViewViewModel$Action {

        @NotNull
        public static final LockPager INSTANCE = new LockPager();

        private LockPager() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$NotifyPreviewAdapter;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotifyPreviewAdapter extends GalleryFullViewViewModel$Action {

        @NotNull
        public static final NotifyPreviewAdapter INSTANCE = new NotifyPreviewAdapter();

        private NotifyPreviewAdapter() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$SetCurrentPage;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "", "page", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPage", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SetCurrentPage extends GalleryFullViewViewModel$Action {
        private final int page;

        public SetCurrentPage(int i11) {
            super(null);
            this.page = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetCurrentPage) && this.page == ((SetCurrentPage) other).page;
        }

        public final int getPage() {
            return this.page;
        }

        public int hashCode() {
            return Integer.hashCode(this.page);
        }

        @NotNull
        public String toString() {
            return E.a(this.page, "SetCurrentPage(page=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$ShowCloseBtn;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowCloseBtn extends GalleryFullViewViewModel$Action {

        @NotNull
        public static final ShowCloseBtn INSTANCE = new ShowCloseBtn();

        private ShowCloseBtn() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$ShowPreview;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowPreview extends GalleryFullViewViewModel$Action {

        @NotNull
        public static final ShowPreview INSTANCE = new ShowPreview();

        private ShowPreview() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$ShowSystemUI;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowSystemUI extends GalleryFullViewViewModel$Action {

        @NotNull
        public static final ShowSystemUI INSTANCE = new ShowSystemUI();

        private ShowSystemUI() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$SmoothScrollToPage;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "", "page", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPage", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SmoothScrollToPage extends GalleryFullViewViewModel$Action {
        private final int page;

        public SmoothScrollToPage(int i11) {
            super(null);
            this.page = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SmoothScrollToPage) && this.page == ((SmoothScrollToPage) other).page;
        }

        public final int getPage() {
            return this.page;
        }

        public int hashCode() {
            return Integer.hashCode(this.page);
        }

        @NotNull
        public String toString() {
            return E.a(this.page, "SmoothScrollToPage(page=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action$UnlockPager;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnlockPager extends GalleryFullViewViewModel$Action {

        @NotNull
        public static final UnlockPager INSTANCE = new UnlockPager();

        private UnlockPager() {
            super(null);
        }
    }

    public /* synthetic */ GalleryFullViewViewModel$Action(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GalleryFullViewViewModel$Action() {
    }
}
