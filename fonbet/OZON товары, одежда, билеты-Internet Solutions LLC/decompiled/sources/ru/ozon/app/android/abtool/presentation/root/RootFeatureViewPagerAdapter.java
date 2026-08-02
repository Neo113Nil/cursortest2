package ru.ozon.app.android.abtool.presentation.root;

import Z4.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.di.DiStoreWrapper;
import ru.ozon.app.android.abtool.presentation.features.FeaturesFragment;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/abtool/presentation/root/RootFeatureViewPagerAdapter;", "LZ4/a;", "Landroidx/fragment/app/m;", "fragment", "<init>", "(Landroidx/fragment/app/m;)V", "", "getItemCount", "()I", "position", "createFragment", "(I)Landroidx/fragment/app/m;", "Companion", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RootFeatureViewPagerAdapter extends a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<String> tabTitles = C7714v.b0(DiStoreWrapper.INSTANCE.getConfig().getNamespace(), "platform_mobile");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/abtool/presentation/root/RootFeatureViewPagerAdapter$Companion;", "", "<init>", "()V", "tabTitles", "", "", "getTabTitles", "()Ljava/util/List;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<String> getTabTitles() {
            return RootFeatureViewPagerAdapter.tabTitles;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootFeatureViewPagerAdapter(@NotNull ComponentCallbacksC5392m fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    @Override // Z4.a
    @NotNull
    public ComponentCallbacksC5392m createFragment(int position) {
        return Intrinsics.d(tabTitles.get(position), "platform_mobile") ? FeaturesFragment.INSTANCE.newInstance(AbToolNamespace.PLATFORM_MOBILE) : FeaturesFragment.INSTANCE.newInstance(AbToolNamespace.DEFAULT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return tabTitles.size();
    }
}
