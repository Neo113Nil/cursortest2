package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.TapTagsView;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockAiTapTagsBinding implements a {

    @NonNull
    private final TapTagsView rootView;

    private MBlockAiTapTagsBinding(@NonNull TapTagsView tapTagsView) {
        this.rootView = tapTagsView;
    }

    @NonNull
    public static MBlockAiTapTagsBinding bind(@NonNull View view) {
        if (view != null) {
            return new MBlockAiTapTagsBinding((TapTagsView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static MBlockAiTapTagsBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_ai_tap_tags, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public TapTagsView getRoot() {
        return this.rootView;
    }
}
