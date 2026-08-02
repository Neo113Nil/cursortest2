package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;
import com.sofascore.results.media.highlights.MediaHighlightHeaderView;
import com.sofascore.results.media.highlights.MediaHighlightsActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class z4c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaHighlightsActivity b;

    public /* synthetic */ z4c(MediaHighlightsActivity mediaHighlightsActivity, int i) {
        this.a = i;
        this.b = mediaHighlightsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MediaHighlightsActivity mediaHighlightsActivity = this.b;
        switch (i) {
            case 0:
                int i2 = MediaHighlightsActivity.a0;
                View inflate = mediaHighlightsActivity.getLayoutInflater().inflate(R.layout.activity_media_highlights, (ViewGroup) null, false);
                int i3 = R.id.app_bar;
                if (((AppBarLayout) nq8.B(R.id.app_bar, inflate)) != null) {
                    i3 = R.id.no_internet_view;
                    ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                    if (viewStub != null) {
                        i3 = R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                        if (recyclerView != null) {
                            i3 = R.id.selected_highlight;
                            MediaHighlightHeaderView mediaHighlightHeaderView = (MediaHighlightHeaderView) nq8.B(R.id.selected_highlight, inflate);
                            if (mediaHighlightHeaderView != null) {
                                i3 = R.id.swipe_refresh_layout;
                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.swipe_refresh_layout, inflate);
                                if (swipeRefreshLayout != null) {
                                    i3 = R.id.toolbar;
                                    View B = nq8.B(R.id.toolbar, inflate);
                                    if (B != null) {
                                        z3f.b(B);
                                        return new pd((ConstraintLayout) inflate, viewStub, recyclerView, mediaHighlightHeaderView, swipeRefreshLayout);
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 1:
                int i4 = MediaHighlightsActivity.a0;
                return Boolean.valueOf(mediaHighlightsActivity.getIntent().getBooleanExtra("highlight_embeddable", false));
            case 2:
                int i5 = MediaHighlightsActivity.a0;
                return Integer.valueOf(mediaHighlightsActivity.getIntent().getIntExtra("media_type_ordinal", 0));
            case 3:
                int i6 = MediaHighlightsActivity.a0;
                return Integer.valueOf(mediaHighlightsActivity.getIntent().getIntExtra("title", 0));
            case 4:
                int i7 = MediaHighlightsActivity.a0;
                return Integer.valueOf(mediaHighlightsActivity.getIntent().getIntExtra("highlight_id", 0));
            case 5:
                i2c i2cVar = mediaHighlightsActivity.Z;
                if (i2cVar != null && i2cVar.c.isEmpty()) {
                    i2cVar.a.getHitRect(i2cVar.d);
                    i2cVar.c();
                }
                return Unit.a;
            case 6:
                int i8 = MediaHighlightsActivity.a0;
                ArrayList<Integer> integerArrayListExtra = mediaHighlightsActivity.getIntent().getIntegerArrayListExtra("media_post_group_ids");
                if (integerArrayListExtra != null) {
                    return CollectionsKt.S0(integerArrayListExtra);
                }
                return null;
            case 7:
                int i9 = MediaHighlightsActivity.a0;
                return Integer.valueOf(mediaHighlightsActivity.getIntent().getIntExtra("tournament_team_id", 0));
            case 8:
                int i10 = MediaHighlightsActivity.a0;
                return Integer.valueOf(mediaHighlightsActivity.getIntent().getIntExtra("tournament_id", 0));
            case 9:
                int i11 = MediaHighlightsActivity.a0;
                return mediaHighlightsActivity.getIntent().getStringExtra("analytics_location");
            case 10:
                int i12 = MediaHighlightsActivity.a0;
                if (mediaHighlightsActivity.R().getItemCount() == 0) {
                    mediaHighlightsActivity.S();
                } else {
                    mediaHighlightsActivity.Q().e.setRefreshing(false);
                }
                return Unit.a;
            case 11:
                int i13 = MediaHighlightsActivity.a0;
                return new y4c(mediaHighlightsActivity);
            case 12:
                int i14 = MediaHighlightsActivity.a0;
                return mediaHighlightsActivity.getIntent().getStringExtra("highlight_url");
            case 13:
                int i15 = MediaHighlightsActivity.a0;
                return mediaHighlightsActivity.getIntent().getStringExtra("highlight_title");
            default:
                int i16 = MediaHighlightsActivity.a0;
                return Boolean.valueOf(mediaHighlightsActivity.getIntent().getBooleanExtra("influencer_video_post", false));
        }
    }
}
