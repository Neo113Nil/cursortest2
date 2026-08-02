package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes12.dex */
public final class MMessengerPopUpBinding implements a {

    @NonNull
    public final MBlockAlertBinding messengerPopUpAlert;

    @NonNull
    public final LinearLayout messengerPopUpBottomContainer;

    @NonNull
    public final RecyclerView messengerPopUpRecyclerView;

    @NonNull
    public final ConstraintLayout messengerPopUpRoot;

    @NonNull
    public final NestedScrollView messengerPopUpRvNsv;

    @NonNull
    public final LargeButtonView messengerPopUpSendButton;

    @NonNull
    private final ConstraintLayout rootView;

    private MMessengerPopUpBinding(@NonNull ConstraintLayout constraintLayout, @NonNull MBlockAlertBinding mBlockAlertBinding, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout2, @NonNull NestedScrollView nestedScrollView, @NonNull LargeButtonView largeButtonView) {
        this.rootView = constraintLayout;
        this.messengerPopUpAlert = mBlockAlertBinding;
        this.messengerPopUpBottomContainer = linearLayout;
        this.messengerPopUpRecyclerView = recyclerView;
        this.messengerPopUpRoot = constraintLayout2;
        this.messengerPopUpRvNsv = nestedScrollView;
        this.messengerPopUpSendButton = largeButtonView;
    }

    @NonNull
    public static MMessengerPopUpBinding bind(@NonNull View view) {
        int i11 = R$id.messenger_pop_up_alert;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            MBlockAlertBinding bind = MBlockAlertBinding.bind(d11);
            i11 = R$id.messenger_pop_up_bottom_container;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                i11 = R$id.messenger_pop_up_recycler_view;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.messenger_pop_up_rv_nsv;
                    NestedScrollView nestedScrollView = (NestedScrollView) C2548q.d(i11, view);
                    if (nestedScrollView != null) {
                        i11 = R$id.messenger_pop_up_send_button;
                        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
                        if (largeButtonView != null) {
                            return new MMessengerPopUpBinding(constraintLayout, bind, linearLayout, recyclerView, constraintLayout, nestedScrollView, largeButtonView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MMessengerPopUpBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_messenger_pop_up, viewGroup, false);
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
