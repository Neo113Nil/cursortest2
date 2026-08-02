package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MBlockChatBinding implements a {

    @NonNull
    public final IconView avatarIv;

    @NonNull
    public final Barrier barrierChatTitleTop;

    @NonNull
    public final ConstraintLayout blockChatRootCl;

    @NonNull
    public final LinearLayout chatIconsLayout;

    @NonNull
    public final TextView chatPreviewDateTv;

    @NonNull
    public final TextView chatPreviewTextTv;

    @NonNull
    public final TextAtomV2View chatTitleTv;

    @NonNull
    public final IndicatorView chatUnreadCountIndicator;

    @NonNull
    public final TextView conversationIdTv;

    @NonNull
    public final RecyclerView menuItemsRv;

    @NonNull
    public final FrameLayout previewContainerFl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final LinearLayoutCompat statusBadgesContainer;

    @NonNull
    public final AppCompatImageView statusIv;

    @NonNull
    public final Group sxExtendedInfoGroup;

    private MBlockChatBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconView iconView, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextAtomV2View textAtomV2View, @NonNull IndicatorView indicatorView, @NonNull TextView textView3, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatImageView appCompatImageView, @NonNull Group group) {
        this.rootView = constraintLayout;
        this.avatarIv = iconView;
        this.barrierChatTitleTop = barrier;
        this.blockChatRootCl = constraintLayout2;
        this.chatIconsLayout = linearLayout;
        this.chatPreviewDateTv = textView;
        this.chatPreviewTextTv = textView2;
        this.chatTitleTv = textAtomV2View;
        this.chatUnreadCountIndicator = indicatorView;
        this.conversationIdTv = textView3;
        this.menuItemsRv = recyclerView;
        this.previewContainerFl = frameLayout;
        this.statusBadgesContainer = linearLayoutCompat;
        this.statusIv = appCompatImageView;
        this.sxExtendedInfoGroup = group;
    }

    @NonNull
    public static MBlockChatBinding bind(@NonNull View view) {
        int i11 = R$id.avatarIv;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.barrierChatTitleTop;
            Barrier barrier = (Barrier) C2548q.d(i11, view);
            if (barrier != null) {
                i11 = R$id.blockChatRootCl;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    i11 = R$id.chatIconsLayout;
                    LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout != null) {
                        i11 = R$id.chatPreviewDateTv;
                        TextView textView = (TextView) C2548q.d(i11, view);
                        if (textView != null) {
                            i11 = R$id.chatPreviewTextTv;
                            TextView textView2 = (TextView) C2548q.d(i11, view);
                            if (textView2 != null) {
                                i11 = R$id.chatTitleTv;
                                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View != null) {
                                    i11 = R$id.chatUnreadCountIndicator;
                                    IndicatorView indicatorView = (IndicatorView) C2548q.d(i11, view);
                                    if (indicatorView != null) {
                                        i11 = R$id.conversationIdTv;
                                        TextView textView3 = (TextView) C2548q.d(i11, view);
                                        if (textView3 != null) {
                                            i11 = R$id.menuItemsRv;
                                            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                            if (recyclerView != null) {
                                                i11 = R$id.previewContainerFl;
                                                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                                                if (frameLayout != null) {
                                                    i11 = R$id.statusBadgesContainer;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C2548q.d(i11, view);
                                                    if (linearLayoutCompat != null) {
                                                        i11 = R$id.statusIv;
                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                                                        if (appCompatImageView != null) {
                                                            i11 = R$id.sxExtendedInfoGroup;
                                                            Group group = (Group) C2548q.d(i11, view);
                                                            if (group != null) {
                                                                return new MBlockChatBinding((ConstraintLayout) view, iconView, barrier, constraintLayout, linearLayout, textView, textView2, textAtomV2View, indicatorView, textView3, recyclerView, frameLayout, linearLayoutCompat, appCompatImageView, group);
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
    public static MBlockChatBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_chat, viewGroup, false);
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
