package ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator;

import B90.b0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.a;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper;", "", "<init>", "()V", "itemCount", "", "getItemCount", "()I", "registerOnPageChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$OnPageChangeListener;", "unregisterOnPageChangeListener", "OnPageChangeListener", "V1", "V2", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$V1;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$V2;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ViewPagerWrapper {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$OnPageChangeListener;", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnPageChangeListener {
    }

    @Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$V1;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "<init>", "(Landroidx/viewpager/widget/ViewPager;)V", "itemCount", "", "getItemCount", "()I", "actualListener", "ru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$V1$actualListener$1", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$V1$actualListener$1;", "delegateListener", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$OnPageChangeListener;", "registerOnPageChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregisterOnPageChangeListener", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class V1 extends ViewPagerWrapper {

        @NotNull
        private final ViewPagerWrapper$V1$actualListener$1 actualListener;
        private OnPageChangeListener delegateListener;

        @NotNull
        private final ViewPager viewPager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper$V1$actualListener$1] */
        public V1(@NotNull ViewPager viewPager) {
            super(null);
            Intrinsics.checkNotNullParameter(viewPager, "viewPager");
            this.viewPager = viewPager;
            this.actualListener = new ViewPager.m() { // from class: ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper$V1$actualListener$1
                @Override // androidx.viewpager.widget.ViewPager.j
                public void onPageSelected(int position) {
                    ViewPagerWrapper.OnPageChangeListener onPageChangeListener;
                    onPageChangeListener = ViewPagerWrapper.V1.this.delegateListener;
                    if (onPageChangeListener != null) {
                        ((b0) onPageChangeListener).b(position);
                    }
                }
            };
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper
        public int getItemCount() {
            a adapter = this.viewPager.getAdapter();
            if (adapter != null) {
                return adapter.getCount();
            }
            return 0;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper
        public void registerOnPageChangeListener(@NotNull OnPageChangeListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.delegateListener = listener;
            this.viewPager.addOnPageChangeListener(this.actualListener);
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper
        public void unregisterOnPageChangeListener() {
            this.delegateListener = null;
            this.viewPager.removeOnPageChangeListener(this.actualListener);
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$V2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "<init>", "(Landroidx/viewpager2/widget/ViewPager2;)V", "itemCount", "", "getItemCount", "()I", "actualListener", "ru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$V2$actualListener$1", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$V2$actualListener$1;", "delegateListener", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/pagerindicator/ViewPagerWrapper$OnPageChangeListener;", "registerOnPageChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregisterOnPageChangeListener", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class V2 extends ViewPagerWrapper {

        @NotNull
        private final ViewPagerWrapper$V2$actualListener$1 actualListener;
        private OnPageChangeListener delegateListener;

        @NotNull
        private final ViewPager2 viewPager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper$V2$actualListener$1] */
        public V2(@NotNull ViewPager2 viewPager) {
            super(null);
            Intrinsics.checkNotNullParameter(viewPager, "viewPager");
            this.viewPager = viewPager;
            this.actualListener = new ViewPager2.g() { // from class: ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper$V2$actualListener$1
                @Override // androidx.viewpager2.widget.ViewPager2.g
                public void onPageSelected(int position) {
                    ViewPagerWrapper.OnPageChangeListener onPageChangeListener;
                    onPageChangeListener = ViewPagerWrapper.V2.this.delegateListener;
                    if (onPageChangeListener != null) {
                        ((b0) onPageChangeListener).b(position);
                    }
                }
            };
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper
        public int getItemCount() {
            RecyclerView.g e11 = this.viewPager.e();
            if (e11 != null) {
                return e11.getItemCount();
            }
            return 0;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper
        public void registerOnPageChangeListener(@NotNull OnPageChangeListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.delegateListener = listener;
            this.viewPager.p(this.actualListener);
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper
        public void unregisterOnPageChangeListener() {
            this.delegateListener = null;
            this.viewPager.A(this.actualListener);
        }
    }

    public /* synthetic */ ViewPagerWrapper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getItemCount();

    public abstract void registerOnPageChangeListener(@NotNull OnPageChangeListener listener);

    public abstract void unregisterOnPageChangeListener();

    private ViewPagerWrapper() {
    }
}
