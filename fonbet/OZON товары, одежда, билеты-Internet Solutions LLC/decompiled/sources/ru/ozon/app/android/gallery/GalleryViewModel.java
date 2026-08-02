package ru.ozon.app.android.gallery;

import H3.c;
import T7.E;
import io.reactivex.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.FullScreenModel;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u001cJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H&¢\u0006\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel;", "", "Lru/ozon/app/android/gallery/GalleryRequest;", "request", "", "init", "(Lru/ozon/app/android/gallery/GalleryRequest;)V", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;", "fullScreenModel", "onOrientationChanged", "(Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;)V", "", "page", "onPageSelected", "(I)V", "onCloseClick", "()V", "", "zoomState", "onZoomChanged", "(Z)V", "isRewinding", "onVideoRewindChanged", "Lio/reactivex/p;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "getAction", "()Lio/reactivex/p;", "action", "Action", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface GalleryViewModel {

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "", "<init>", "()V", "NotifyPreviewAdapter", "Close", "LockPager", "UnlockPager", "ShowPreview", "HidePreview", "HideSystemUI", "HideCloseBtn", "ShowSystemUI", "ShowCloseBtn", "BindItems", "SetCurrentPage", "SmoothScrollToPage", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$BindItems;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$Close;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$HideCloseBtn;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$HidePreview;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$HideSystemUI;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$LockPager;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$NotifyPreviewAdapter;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$SetCurrentPage;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$ShowCloseBtn;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$ShowPreview;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$ShowSystemUI;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$SmoothScrollToPage;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action$UnlockPager;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$BindItems;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "", "Lru/ozon/app/android/gallery/ItemVO;", "items", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BindItems extends Action {

            @NotNull
            private final List<ItemVO> items;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public BindItems(@NotNull List<? extends ItemVO> items) {
                super(null);
                Intrinsics.checkNotNullParameter(items, "items");
                this.items = items;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BindItems) && Intrinsics.d(this.items, ((BindItems) other).items);
            }

            @NotNull
            public final List<ItemVO> getItems() {
                return this.items;
            }

            public int hashCode() {
                return this.items.hashCode();
            }

            @NotNull
            public String toString() {
                return c.a("BindItems(items=", ")", this.items);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$Close;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "<init>", "()V", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Close extends Action {

            @NotNull
            public static final Close INSTANCE = new Close();

            private Close() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$HideCloseBtn;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "<init>", "()V", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HideCloseBtn extends Action {

            @NotNull
            public static final HideCloseBtn INSTANCE = new HideCloseBtn();

            private HideCloseBtn() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$HidePreview;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "<init>", "()V", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HidePreview extends Action {

            @NotNull
            public static final HidePreview INSTANCE = new HidePreview();

            private HidePreview() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$HideSystemUI;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "<init>", "()V", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HideSystemUI extends Action {

            @NotNull
            public static final HideSystemUI INSTANCE = new HideSystemUI();

            private HideSystemUI() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$LockPager;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "<init>", "()V", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class LockPager extends Action {

            @NotNull
            public static final LockPager INSTANCE = new LockPager();

            private LockPager() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$NotifyPreviewAdapter;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "<init>", "()V", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NotifyPreviewAdapter extends Action {

            @NotNull
            public static final NotifyPreviewAdapter INSTANCE = new NotifyPreviewAdapter();

            private NotifyPreviewAdapter() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$SetCurrentPage;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "", "page", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPage", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SetCurrentPage extends Action {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$ShowCloseBtn;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "<init>", "()V", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ShowCloseBtn extends Action {

            @NotNull
            public static final ShowCloseBtn INSTANCE = new ShowCloseBtn();

            private ShowCloseBtn() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$ShowPreview;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "<init>", "()V", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ShowPreview extends Action {

            @NotNull
            public static final ShowPreview INSTANCE = new ShowPreview();

            private ShowPreview() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$ShowSystemUI;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "<init>", "()V", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ShowSystemUI extends Action {

            @NotNull
            public static final ShowSystemUI INSTANCE = new ShowSystemUI();

            private ShowSystemUI() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$SmoothScrollToPage;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "", "page", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPage", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SmoothScrollToPage extends Action {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/gallery/GalleryViewModel$Action$UnlockPager;", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "<init>", "()V", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UnlockPager extends Action {

            @NotNull
            public static final UnlockPager INSTANCE = new UnlockPager();

            private UnlockPager() {
                super(null);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @NotNull
    p<Action> getAction();

    void init(@NotNull GalleryRequest request);

    void onCloseClick();

    void onOrientationChanged(@NotNull FullScreenModel fullScreenModel);

    void onPageSelected(int page);

    void onVideoRewindChanged(boolean isRewinding);

    void onZoomChanged(boolean zoomState);
}
