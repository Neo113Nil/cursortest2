package ru.ozon.app.android.travel.ui.molecules.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.ui.molecules.R$layout;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class ViewCellWithTimerBinding implements a {

    @NonNull
    public final AppCompatImageView rightIconView;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextAtomView subtitleTextView;

    @NonNull
    public final Image timerImageView;

    @NonNull
    public final TextAtomView timerTextView;

    @NonNull
    public final TextAtomView titleTextView;

    private ViewCellWithTimerBinding(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull Image image, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = view;
        this.rightIconView = appCompatImageView;
        this.subtitleTextView = textAtomView;
        this.timerImageView = image;
        this.timerTextView = textAtomView2;
        this.titleTextView = textAtomView3;
    }

    @NonNull
    public static ViewCellWithTimerBinding bind(@NonNull View view) {
        int i11 = R$id.rightIconView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.subtitleTextView;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.timerImageView;
                Image image = (Image) C2548q.d(i11, view);
                if (image != null) {
                    i11 = R$id.timerTextView;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        i11 = R$id.titleTextView;
                        TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView3 != null) {
                            return new ViewCellWithTimerBinding(view, appCompatImageView, textAtomView, image, textAtomView2, textAtomView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewCellWithTimerBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_cell_with_timer, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
