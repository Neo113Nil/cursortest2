package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

/* loaded from: classes9.dex */
public final class IntercomToolbarBinding implements ViewBinding {
    public final FrameLayout intercomLeftItemLayout;
    public final ImageView intercomToolbarAvatar;
    public final View intercomToolbarAvatarActiveState;
    public final ImageButton intercomToolbarClose;
    public final View intercomToolbarDivider;
    public final ImageButton intercomToolbarInbox;
    public final TextView intercomToolbarSubtitle;
    public final TextView intercomToolbarTitle;
    public final LinearLayout intercomToolbarTitleContainer;
    private final FrameLayout rootView;
    public final RelativeLayout toolbarContentContainer;
    public final ProgressBar toolbarProgressBar;
    public final ImageView wallpaperImage;

    private IntercomToolbarBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, View view, ImageButton imageButton, View view2, ImageButton imageButton2, TextView textView, TextView textView2, LinearLayout linearLayout, RelativeLayout relativeLayout, ProgressBar progressBar, ImageView imageView2) {
        this.rootView = frameLayout;
        this.intercomLeftItemLayout = frameLayout2;
        this.intercomToolbarAvatar = imageView;
        this.intercomToolbarAvatarActiveState = view;
        this.intercomToolbarClose = imageButton;
        this.intercomToolbarDivider = view2;
        this.intercomToolbarInbox = imageButton2;
        this.intercomToolbarSubtitle = textView;
        this.intercomToolbarTitle = textView2;
        this.intercomToolbarTitleContainer = linearLayout;
        this.toolbarContentContainer = relativeLayout;
        this.toolbarProgressBar = progressBar;
        this.wallpaperImage = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IntercomToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntercomToolbarBinding bind(View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.intercom_left_item_layout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.intercom_toolbar_avatar;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.intercom_toolbar_avatar_active_state))) != null) {
                i = R.id.intercom_toolbar_close;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.intercom_toolbar_divider))) != null) {
                    i = R.id.intercom_toolbar_inbox;
                    ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                    if (imageButton2 != null) {
                        i = R.id.intercom_toolbar_subtitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.intercom_toolbar_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.intercom_toolbar_title_container;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = R.id.toolbar_content_container;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout != null) {
                                        i = R.id.toolbar_progress_bar;
                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                        if (progressBar != null) {
                                            i = R.id.wallpaper_image;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView2 != null) {
                                                return new IntercomToolbarBinding((FrameLayout) view, frameLayout, imageView, findChildViewById, imageButton, findChildViewById2, imageButton2, textView, textView2, linearLayout, relativeLayout, progressBar, imageView2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
