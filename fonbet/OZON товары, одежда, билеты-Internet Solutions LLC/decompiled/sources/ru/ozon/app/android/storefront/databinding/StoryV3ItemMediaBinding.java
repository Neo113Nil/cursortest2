package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.media3.ui.PlayerView;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.R$layout;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListView;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.views.StoryItemClickableLayoutV3;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryTimeLine;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes2.dex */
public final class StoryV3ItemMediaBinding implements a {

    @NonNull
    public final VerticalAtomsLayout atomsContent;

    @NonNull
    public final IconTitleSubtitleCellView authorBlock;

    @NonNull
    public final Barrier bottomBarrier;

    @NonNull
    public final AppCompatImageView bottomShadowIv;

    @NonNull
    public final ButtonView button;

    @NonNull
    public final Guideline centerGuideline;

    @NonNull
    public final SmallIconButtonView closeSIB;
    public final ConstraintLayout contentCl;

    @NonNull
    public final StoryItemClickableLayoutV3 gestureView;

    @NonNull
    public final LoaderView loadingPB;

    @NonNull
    public final TextView retryTv;

    @NonNull
    public final ConstraintLayout rootCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SmallIconButtonView shareSIVC;

    @NonNull
    public final LinearLayoutCompat smallButtonContainerLLC;

    @NonNull
    public final SocialProductListView socialProductsList;

    @NonNull
    public final SmallIconButtonView soundControlView;
    public final AppCompatImageView storyBackgroundIv;

    @NonNull
    public final AppCompatImageView storyItemIV;

    @NonNull
    public final PlayerView storyItemVideoPV;

    @NonNull
    public final StoryTimeLine timeLine;

    @NonNull
    public final AppCompatImageView topShadowIv;

    private StoryV3ItemMediaBinding(@NonNull ConstraintLayout constraintLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull IconTitleSubtitleCellView iconTitleSubtitleCellView, @NonNull Barrier barrier, @NonNull AppCompatImageView appCompatImageView, @NonNull ButtonView buttonView, @NonNull Guideline guideline, @NonNull SmallIconButtonView smallIconButtonView, ConstraintLayout constraintLayout2, @NonNull StoryItemClickableLayoutV3 storyItemClickableLayoutV3, @NonNull LoaderView loaderView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull SmallIconButtonView smallIconButtonView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull SocialProductListView socialProductListView, @NonNull SmallIconButtonView smallIconButtonView3, AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull PlayerView playerView, @NonNull StoryTimeLine storyTimeLine, @NonNull AppCompatImageView appCompatImageView4) {
        this.rootView = constraintLayout;
        this.atomsContent = verticalAtomsLayout;
        this.authorBlock = iconTitleSubtitleCellView;
        this.bottomBarrier = barrier;
        this.bottomShadowIv = appCompatImageView;
        this.button = buttonView;
        this.centerGuideline = guideline;
        this.closeSIB = smallIconButtonView;
        this.contentCl = constraintLayout2;
        this.gestureView = storyItemClickableLayoutV3;
        this.loadingPB = loaderView;
        this.retryTv = textView;
        this.rootCl = constraintLayout3;
        this.shareSIVC = smallIconButtonView2;
        this.smallButtonContainerLLC = linearLayoutCompat;
        this.socialProductsList = socialProductListView;
        this.soundControlView = smallIconButtonView3;
        this.storyBackgroundIv = appCompatImageView2;
        this.storyItemIV = appCompatImageView3;
        this.storyItemVideoPV = playerView;
        this.timeLine = storyTimeLine;
        this.topShadowIv = appCompatImageView4;
    }

    @NonNull
    public static StoryV3ItemMediaBinding bind(@NonNull View view) {
        int i11 = R$id.atomsContent;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.authorBlock;
            IconTitleSubtitleCellView iconTitleSubtitleCellView = (IconTitleSubtitleCellView) C2548q.d(i11, view);
            if (iconTitleSubtitleCellView != null) {
                i11 = R$id.bottomBarrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.bottomShadowIv;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                    if (appCompatImageView != null) {
                        i11 = R$id.button;
                        ButtonView buttonView = (ButtonView) C2548q.d(i11, view);
                        if (buttonView != null) {
                            i11 = R$id.centerGuideline;
                            Guideline guideline = (Guideline) C2548q.d(i11, view);
                            if (guideline != null) {
                                i11 = R$id.closeSIB;
                                SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                                if (smallIconButtonView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(R$id.contentCl, view);
                                    i11 = R$id.gestureView;
                                    StoryItemClickableLayoutV3 storyItemClickableLayoutV3 = (StoryItemClickableLayoutV3) C2548q.d(i11, view);
                                    if (storyItemClickableLayoutV3 != null) {
                                        i11 = R$id.loadingPB;
                                        LoaderView loaderView = (LoaderView) C2548q.d(i11, view);
                                        if (loaderView != null) {
                                            i11 = R$id.retryTv;
                                            TextView textView = (TextView) C2548q.d(i11, view);
                                            if (textView != null) {
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                i11 = R$id.shareSIVC;
                                                SmallIconButtonView smallIconButtonView2 = (SmallIconButtonView) C2548q.d(i11, view);
                                                if (smallIconButtonView2 != null) {
                                                    i11 = R$id.smallButtonContainerLLC;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C2548q.d(i11, view);
                                                    if (linearLayoutCompat != null) {
                                                        i11 = R$id.socialProductsList;
                                                        SocialProductListView socialProductListView = (SocialProductListView) C2548q.d(i11, view);
                                                        if (socialProductListView != null) {
                                                            i11 = R$id.soundControlView;
                                                            SmallIconButtonView smallIconButtonView3 = (SmallIconButtonView) C2548q.d(i11, view);
                                                            if (smallIconButtonView3 != null) {
                                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(R$id.storyBackgroundIv, view);
                                                                i11 = R$id.storyItemIV;
                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) C2548q.d(i11, view);
                                                                if (appCompatImageView3 != null) {
                                                                    i11 = R$id.storyItemVideoPV;
                                                                    PlayerView playerView = (PlayerView) C2548q.d(i11, view);
                                                                    if (playerView != null) {
                                                                        i11 = R$id.timeLine;
                                                                        StoryTimeLine storyTimeLine = (StoryTimeLine) C2548q.d(i11, view);
                                                                        if (storyTimeLine != null) {
                                                                            i11 = R$id.topShadowIv;
                                                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) C2548q.d(i11, view);
                                                                            if (appCompatImageView4 != null) {
                                                                                return new StoryV3ItemMediaBinding(constraintLayout2, verticalAtomsLayout, iconTitleSubtitleCellView, barrier, appCompatImageView, buttonView, guideline, smallIconButtonView, constraintLayout, storyItemClickableLayoutV3, loaderView, textView, constraintLayout2, smallIconButtonView2, linearLayoutCompat, socialProductListView, smallIconButtonView3, appCompatImageView2, appCompatImageView3, playerView, storyTimeLine, appCompatImageView4);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static StoryV3ItemMediaBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.story_v3_item_media, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
