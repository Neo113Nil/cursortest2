package com.vk.newsfeed.impl.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.bwt0;
import xsna.e9h;
import xsna.iah0;
import xsna.msy;
import xsna.z5f;

/* compiled from: ModalCommentsPaginatedView.kt */
/* loaded from: classes4.dex */
public final class ModalCommentsPaginatedView extends RecyclerPaginatedView {
    public static final int T = iah0.a(28);
    public View N;
    public TextView O;
    public View P;
    public TextView Q;
    public final Object R;
    public final Object S;

    public ModalCommentsPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        z5f z5fVar = new z5f(context, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, z5fVar);
        this.S = msy.a(lazyThreadSafetyMode, new e9h(context, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Drawable getCommentsIcon() {
        return (Drawable) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Drawable getLockIcon() {
        return (Drawable) this.R.getValue();
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_comments_empty, (ViewGroup) this, false);
        this.P = inflate.findViewById(R.id.modal_disabled_comments_container);
        this.Q = (TextView) inflate.findViewById(R.id.modal_disabled_comments_text);
        this.N = inflate.findViewById(R.id.modal_empty_comments_container);
        TextView textView = (TextView) inflate.findViewById(R.id.modal_empty_comments_text);
        this.O = textView;
        if (textView != null) {
            textView.setText(context.getString(R.string.post_comments_empty_title));
        }
        View view = this.P;
        if (view != null) {
            bwt0.p0(view, false);
        }
        return inflate;
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View q(Context context, AttributeSet attributeSet) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.list);
        this.x = recyclerView;
        return recyclerView;
    }

    public final void setDisableCommentsTitle(String str) {
        TextView textView = this.Q;
        if (textView != null) {
            textView.setText(str);
        }
        View view = this.N;
        if (view != null) {
            bwt0.p0(view, false);
        }
        View view2 = this.P;
        if (view2 != null) {
            bwt0.p0(view2, true);
        }
    }

    public final void setEmptyTitle(String str) {
        TextView textView = this.O;
        if (textView != null) {
            textView.setText(str);
        }
        View view = this.N;
        if (view != null) {
            bwt0.p0(view, true);
        }
        View view2 = this.P;
        if (view2 != null) {
            bwt0.p0(view2, false);
        }
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.c.n
    public final void K9() {
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.c.n
    public final void Mk() {
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public void setSwipeRefreshEnabled(boolean z) {
    }
}
