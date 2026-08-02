package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import ru.ozon.app.android.atoms.v3.molecules.authorBlock.AuthorBlockView;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.R$layout;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryTimeLine;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class MoleculeStoryItemMediaBinding implements a {

    @NonNull
    public final AuthorBlockView authorBlockV;

    @NonNull
    public final LargeButtonView buttonLBV;

    @NonNull
    public final SmallIconButtonView closeSIB;
    public final ConstraintLayout contentCl;

    @NonNull
    public final ProgressBar loadingPB;

    @NonNull
    public final TextView retryTv;

    @NonNull
    public final StoryItemClickableLayout rootSICL;

    @NonNull
    private final StoryItemClickableLayout rootView;

    @NonNull
    public final ImageView shadowIv;

    @NonNull
    public final SmallIconButtonView soundControlView;
    public final ImageView storyBackgroundIv;

    @NonNull
    public final ImageView storyItemIV;

    @NonNull
    public final PlayerView storyItemVideoPV;

    @NonNull
    public final TextAtomView subtitleTAV;

    @NonNull
    public final TextView tagTitleTV;

    @NonNull
    public final LinearLayoutCompat textContentLLC;

    @NonNull
    public final StoryTimeLine timeLine;

    @NonNull
    public final Barrier titleBarrier;

    @NonNull
    public final TextAtomView titleTAV;

    private MoleculeStoryItemMediaBinding(@NonNull StoryItemClickableLayout storyItemClickableLayout, @NonNull AuthorBlockView authorBlockView, @NonNull LargeButtonView largeButtonView, @NonNull SmallIconButtonView smallIconButtonView, ConstraintLayout constraintLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull StoryItemClickableLayout storyItemClickableLayout2, @NonNull ImageView imageView, @NonNull SmallIconButtonView smallIconButtonView2, ImageView imageView2, @NonNull ImageView imageView3, @NonNull PlayerView playerView, @NonNull TextAtomView textAtomView, @NonNull TextView textView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull StoryTimeLine storyTimeLine, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView2) {
        this.rootView = storyItemClickableLayout;
        this.authorBlockV = authorBlockView;
        this.buttonLBV = largeButtonView;
        this.closeSIB = smallIconButtonView;
        this.contentCl = constraintLayout;
        this.loadingPB = progressBar;
        this.retryTv = textView;
        this.rootSICL = storyItemClickableLayout2;
        this.shadowIv = imageView;
        this.soundControlView = smallIconButtonView2;
        this.storyBackgroundIv = imageView2;
        this.storyItemIV = imageView3;
        this.storyItemVideoPV = playerView;
        this.subtitleTAV = textAtomView;
        this.tagTitleTV = textView2;
        this.textContentLLC = linearLayoutCompat;
        this.timeLine = storyTimeLine;
        this.titleBarrier = barrier;
        this.titleTAV = textAtomView2;
    }

    @NonNull
    public static MoleculeStoryItemMediaBinding bind(@NonNull View view) {
        int i11 = R$id.authorBlockV;
        AuthorBlockView authorBlockView = (AuthorBlockView) C2548q.d(i11, view);
        if (authorBlockView != null) {
            i11 = R$id.buttonLBV;
            LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
            if (largeButtonView != null) {
                i11 = R$id.closeSIB;
                SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                if (smallIconButtonView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(R$id.contentCl, view);
                    i11 = R$id.loadingPB;
                    ProgressBar progressBar = (ProgressBar) C2548q.d(i11, view);
                    if (progressBar != null) {
                        i11 = R$id.retryTv;
                        TextView textView = (TextView) C2548q.d(i11, view);
                        if (textView != null) {
                            StoryItemClickableLayout storyItemClickableLayout = (StoryItemClickableLayout) view;
                            i11 = R$id.shadowIv;
                            ImageView imageView = (ImageView) C2548q.d(i11, view);
                            if (imageView != null) {
                                i11 = R$id.soundControlView;
                                SmallIconButtonView smallIconButtonView2 = (SmallIconButtonView) C2548q.d(i11, view);
                                if (smallIconButtonView2 != null) {
                                    ImageView imageView2 = (ImageView) C2548q.d(R$id.storyBackgroundIv, view);
                                    i11 = R$id.storyItemIV;
                                    ImageView imageView3 = (ImageView) C2548q.d(i11, view);
                                    if (imageView3 != null) {
                                        i11 = R$id.storyItemVideoPV;
                                        PlayerView playerView = (PlayerView) C2548q.d(i11, view);
                                        if (playerView != null) {
                                            i11 = R$id.subtitleTAV;
                                            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                                            if (textAtomView != null) {
                                                i11 = R$id.tagTitleTV;
                                                TextView textView2 = (TextView) C2548q.d(i11, view);
                                                if (textView2 != null) {
                                                    i11 = R$id.textContentLLC;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C2548q.d(i11, view);
                                                    if (linearLayoutCompat != null) {
                                                        i11 = R$id.timeLine;
                                                        StoryTimeLine storyTimeLine = (StoryTimeLine) C2548q.d(i11, view);
                                                        if (storyTimeLine != null) {
                                                            i11 = R$id.titleBarrier;
                                                            Barrier barrier = (Barrier) C2548q.d(i11, view);
                                                            if (barrier != null) {
                                                                i11 = R$id.titleTAV;
                                                                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                                                if (textAtomView2 != null) {
                                                                    return new MoleculeStoryItemMediaBinding(storyItemClickableLayout, authorBlockView, largeButtonView, smallIconButtonView, constraintLayout, progressBar, textView, storyItemClickableLayout, imageView, smallIconButtonView2, imageView2, imageView3, playerView, textAtomView, textView2, linearLayoutCompat, storyTimeLine, barrier, textAtomView2);
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
    public static MoleculeStoryItemMediaBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.molecule_story_item_media, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public StoryItemClickableLayout getConstraintLayout() {
        return this.rootView;
    }
}
