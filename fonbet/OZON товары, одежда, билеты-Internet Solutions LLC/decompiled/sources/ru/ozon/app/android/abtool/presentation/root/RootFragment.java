package ru.ozon.app.android.abtool.presentation.root;

import B0.A0;
import B90.C2615q;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.R$string;
import ru.ozon.app.android.abtool.databinding.RootFragmentBinding;
import ru.ozon.app.android.abtool.presentation.AbToggleActivity;
import ru.ozon.app.android.abtool.presentation.AbToggleScreenType;
import ru.ozon.app.android.abtool.presentation.BaseFragment;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J$\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/abtool/presentation/root/RootFragment;", "Lru/ozon/app/android/abtool/presentation/BaseFragment;", "Lru/ozon/app/android/abtool/databinding/RootFragmentBinding;", "<init>", "()V", "onStart", "", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "Companion", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RootFragment extends BaseFragment<RootFragmentBinding> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/abtool/presentation/root/RootFragment$Companion;", "", "<init>", "()V", "SCREEN_TYPE_ARG", "", "newInstance", "Lru/ozon/app/android/abtool/presentation/root/RootFragment;", "screenType", "Lru/ozon/app/android/abtool/presentation/AbToggleScreenType;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RootFragment newInstance(@NotNull AbToggleScreenType screenType) {
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            RootFragment rootFragment = new RootFragment();
            Bundle bundle = new Bundle();
            bundle.putString("SCREEN_TYPE", screenType.name());
            rootFragment.setArguments(bundle);
            return rootFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(String str, TabLayout.e tab, int i11) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.n(Intrinsics.d(str, "EXPERIMENTS") ? RootExperimentsViewPagerAdapter.INSTANCE.getTabTitles().get(i11) : RootFeatureViewPagerAdapter.INSTANCE.getTabTitles().get(i11));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        r activity = getActivity();
        if (activity != null) {
            activity.setTitle(R$string.feature_flags);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        String name;
        RecyclerView.g rootFeatureViewPagerAdapter;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (name = arguments.getString("SCREEN_TYPE")) == null) {
            name = AbToggleActivity.INSTANCE.getDEFAULT_SCREEN_TYPE$abzone_release().name();
        }
        ViewPager2 viewPager2 = getBinding().viewPager;
        if (Intrinsics.d(name, "EXPERIMENTS")) {
            rootFeatureViewPagerAdapter = new RootExperimentsViewPagerAdapter(this);
        } else {
            if (!Intrinsics.d(name, "FEATURES")) {
                throw new IllegalStateException(A0.b("This screen type \"", name, "\" not supported"));
            }
            rootFeatureViewPagerAdapter = new RootFeatureViewPagerAdapter(this);
        }
        viewPager2.s(rootFeatureViewPagerAdapter);
        new f(getBinding().tabLayout, getBinding().viewPager, new C2615q(name, 5)).a();
    }

    @Override // ru.ozon.app.android.abtool.presentation.BaseFragment
    @NotNull
    public RootFragmentBinding getViewBinding(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        RootFragmentBinding inflate = RootFragmentBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
