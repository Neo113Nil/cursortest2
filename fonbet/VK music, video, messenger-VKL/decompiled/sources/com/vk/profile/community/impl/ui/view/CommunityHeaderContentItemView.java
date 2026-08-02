package com.vk.profile.community.impl.ui.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.links.LinkedTextView;
import com.vk.typography.b;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.iah0;

/* compiled from: CommunityHeaderContentItemView.kt */
/* loaded from: classes5.dex */
public class CommunityHeaderContentItemView extends ConstraintLayout {
    public final LinkedTextView t;
    public final TextView u;
    public final PhotoStackView v;

    public CommunityHeaderContentItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void setBackground(int i) {
        setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(i), dhr0.w(R.drawable.highlight, getContext())}));
    }

    public final void setContentAvatars(List<String> list) {
        PhotoStackView photoStackView = this.v;
        photoStackView.r(3, list);
        photoStackView.setVisibility(!list.isEmpty() ? 0 : 8);
    }

    public final void setContentFontStyle(com.vk.typography.a aVar) {
        b.h(this.t, aVar, 0);
    }

    public final void setContentIconPadding(int i) {
        this.t.setCompoundDrawablePadding(i);
    }

    public final void setContentSubtitle(CharSequence charSequence) {
        TextView textView = this.u;
        if (charSequence == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }

    public final void setContentSubtitleClickListener(View.OnClickListener onClickListener) {
        bwt0.h0(onClickListener, this.u);
    }

    public final void setContentSubtitleColor(int i) {
        this.u.setTextColor(e3m.f(i, getContext()));
    }

    public final void setContentText(CharSequence charSequence) {
        this.t.setText(charSequence);
    }

    public final void setContentTextClickListener(View.OnClickListener onClickListener) {
        bwt0.h0(onClickListener, this.t);
    }

    public final void setContentTextColor(int i) {
        setContentTextColorId(e3m.f(i, getContext()));
    }

    public final void setContentTextColorId(int i) {
        this.t.setTextColor(i);
    }

    public final void setContentTextEllipsize(TextUtils.TruncateAt truncateAt) {
        this.t.setEllipsize(truncateAt);
    }

    public final void setContentTextIncludeFontPadding(boolean z) {
        this.t.setIncludeFontPadding(z);
    }

    public final void setContentTextMaxLines(int i) {
        this.t.setMaxLines(i);
    }

    public final void setContentTextMovementMethod(MovementMethod movementMethod) {
        this.t.setMovementMethod(movementMethod);
    }

    public final void setContentTextSize(float f) {
        this.t.setTextSize(f);
    }

    public final void setContentTitleCompoundDrawablePadding(int i) {
        this.t.setCompoundDrawablePadding(i);
    }

    public final void setOnAvatarsClickListener(View.OnClickListener onClickListener) {
        bwt0.h0(onClickListener, this.v);
    }

    public CommunityHeaderContentItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.item_community_header_content_view, this);
        this.t = (LinkedTextView) findViewById(R.id.community_content_title);
        this.u = (TextView) findViewById(R.id.community_content_subtitle);
        PhotoStackView photoStackView = (PhotoStackView) findViewById(R.id.community_friend_avatars);
        photoStackView.setRoundedCut(true);
        photoStackView.v(22.0f, 1.5f, 24.0f);
        this.v = photoStackView;
        setBackground(e3m.f(R.attr.vk_ui_background_content, context));
        setMinHeight(iah0.a(28));
        setLayoutParams(new ConstraintLayout.b(-1, -2));
    }

    public final void setContentText(int i) {
        this.t.setText(i);
    }
}
