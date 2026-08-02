package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class NewToolbarViewBinding implements a {

    @NonNull
    public final AppCompatImageView avatarImage;

    @NonNull
    public final TextAtomView avatarTitle;

    @NonNull
    public final TextAtomView rootLeftText;

    @NonNull
    public final TextAtomView rootRightText;

    @NonNull
    public final TextAtomView rootSubtitle;

    @NonNull
    public final TextView rootTitle;

    @NonNull
    private final View rootView;

    @NonNull
    public final LinearLayout titleContainer;

    private NewToolbarViewBinding(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3, @NonNull TextAtomView textAtomView4, @NonNull TextView textView, @NonNull LinearLayout linearLayout) {
        this.rootView = view;
        this.avatarImage = appCompatImageView;
        this.avatarTitle = textAtomView;
        this.rootLeftText = textAtomView2;
        this.rootRightText = textAtomView3;
        this.rootSubtitle = textAtomView4;
        this.rootTitle = textView;
        this.titleContainer = linearLayout;
    }

    @NonNull
    public static NewToolbarViewBinding bind(@NonNull View view) {
        int i11 = R.id.avatar_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(R.id.avatar_image, view);
        if (appCompatImageView != null) {
            i11 = R.id.avatar_title;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(R.id.avatar_title, view);
            if (textAtomView != null) {
                i11 = R.id.root_left_text;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(R.id.root_left_text, view);
                if (textAtomView2 != null) {
                    i11 = R.id.root_right_text;
                    TextAtomView textAtomView3 = (TextAtomView) C2548q.d(R.id.root_right_text, view);
                    if (textAtomView3 != null) {
                        i11 = R.id.root_subtitle;
                        TextAtomView textAtomView4 = (TextAtomView) C2548q.d(R.id.root_subtitle, view);
                        if (textAtomView4 != null) {
                            i11 = R.id.root_title;
                            TextView textView = (TextView) C2548q.d(R.id.root_title, view);
                            if (textView != null) {
                                i11 = R.id.title_container;
                                LinearLayout linearLayout = (LinearLayout) C2548q.d(R.id.title_container, view);
                                if (linearLayout != null) {
                                    return new NewToolbarViewBinding(view, appCompatImageView, textAtomView, textAtomView2, textAtomView3, textAtomView4, textView, linearLayout);
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
    public static NewToolbarViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.new_toolbar_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
