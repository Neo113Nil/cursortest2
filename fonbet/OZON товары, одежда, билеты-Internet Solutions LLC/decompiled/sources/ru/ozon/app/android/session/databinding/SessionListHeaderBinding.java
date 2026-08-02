package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.ozon.app.android.session.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class SessionListHeaderBinding implements a {

    @NonNull
    private final LinearLayoutCompat rootView;

    @NonNull
    public final TextAtomView subtitleTextAtomView;

    @NonNull
    public final TextAtomView titleTextAtomView;

    private SessionListHeaderBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = linearLayoutCompat;
        this.subtitleTextAtomView = textAtomView;
        this.titleTextAtomView = textAtomView2;
    }

    @NonNull
    public static SessionListHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.subtitleTextAtomView;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.titleTextAtomView;
            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView2 != null) {
                return new SessionListHeaderBinding((LinearLayoutCompat) view, textAtomView, textAtomView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
