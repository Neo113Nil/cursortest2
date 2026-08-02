package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;
import com.sofascore.results.tv.TVChannelEditorActivity;
import com.sofascore.results.tv.fragments.TVChannelsPickerModal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class pri implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TVChannelEditorActivity b;

    public /* synthetic */ pri(TVChannelEditorActivity tVChannelEditorActivity, int i) {
        this.a = i;
        this.b = tVChannelEditorActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TVChannelEditorActivity tVChannelEditorActivity = this.b;
        switch (i) {
            case 0:
                int i2 = TVChannelEditorActivity.N;
                View inflate = tVChannelEditorActivity.getLayoutInflater().inflate(R.layout.activity_tv_channel_editor, (ViewGroup) null, false);
                int i3 = R.id.app_bar;
                if (((AppBarLayout) nq8.B(R.id.app_bar, inflate)) != null) {
                    i3 = R.id.no_internet_view;
                    ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                    if (viewStub != null) {
                        i3 = R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                        if (recyclerView != null) {
                            i3 = R.id.select_country;
                            ComposeView composeView = (ComposeView) nq8.B(R.id.select_country, inflate);
                            if (composeView != null) {
                                i3 = R.id.select_country_holder;
                                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.select_country_holder, inflate);
                                if (frameLayout != null) {
                                    i3 = R.id.toolbar;
                                    View B = nq8.B(R.id.toolbar, inflate);
                                    if (B != null) {
                                        z3f.b(B);
                                        return new af((CoordinatorLayout) inflate, viewStub, recyclerView, composeView, frameLayout);
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 1:
                int i4 = TVChannelEditorActivity.N;
                return new t3k(tVChannelEditorActivity);
            default:
                int i5 = TVChannelEditorActivity.N;
                new TVChannelsPickerModal().p(tVChannelEditorActivity.k(), "TVChannelsPickerModal");
                return Unit.a;
        }
    }
}
