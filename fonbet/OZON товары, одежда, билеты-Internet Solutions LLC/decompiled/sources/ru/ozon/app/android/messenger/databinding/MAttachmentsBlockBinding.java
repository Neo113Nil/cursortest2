package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MAttachmentsBlockBinding implements a {

    @NonNull
    public final RecyclerView attachmentRv;

    @NonNull
    private final RecyclerView rootView;

    private MAttachmentsBlockBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.attachmentRv = recyclerView2;
    }

    @NonNull
    public static MAttachmentsBlockBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new MAttachmentsBlockBinding(recyclerView, recyclerView);
    }

    @NonNull
    public static MAttachmentsBlockBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_attachments_block, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
