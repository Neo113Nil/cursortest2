package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockChatGroupListBinding implements a {

    @NonNull
    public final RecyclerView chatGroupsRv;

    @NonNull
    private final View rootView;

    private MBlockChatGroupListBinding(@NonNull View view, @NonNull RecyclerView recyclerView) {
        this.rootView = view;
        this.chatGroupsRv = recyclerView;
    }

    @NonNull
    public static MBlockChatGroupListBinding bind(@NonNull View view) {
        int i11 = R$id.chatGroupsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            return new MBlockChatGroupListBinding(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockChatGroupListBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.m_block_chat_group_list, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
