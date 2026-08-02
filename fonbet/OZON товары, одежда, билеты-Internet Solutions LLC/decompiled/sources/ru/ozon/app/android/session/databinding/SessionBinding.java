package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.session.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes2.dex */
public final class SessionBinding implements a {

    @NonNull
    public final RecyclerView dataRecyclerView;

    @NonNull
    public final AppCompatTextView headerTextView;

    @NonNull
    public final LargeButtonView logoutButton;

    @NonNull
    private final LinearLayoutCompat rootView;

    private SessionBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull AppCompatTextView appCompatTextView, @NonNull LargeButtonView largeButtonView) {
        this.rootView = linearLayoutCompat;
        this.dataRecyclerView = recyclerView;
        this.headerTextView = appCompatTextView;
        this.logoutButton = largeButtonView;
    }

    @NonNull
    public static SessionBinding bind(@NonNull View view) {
        int i11 = R$id.dataRecyclerView;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.headerTextView;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.logoutButton;
                LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                if (largeButtonView != null) {
                    return new SessionBinding((LinearLayoutCompat) view, recyclerView, appCompatTextView, largeButtonView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayoutCompat getConstraintLayout() {
        return this.rootView;
    }
}
