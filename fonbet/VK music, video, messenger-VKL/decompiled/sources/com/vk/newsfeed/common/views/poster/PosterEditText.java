package com.vk.newsfeed.common.views.poster;

import android.content.Context;
import android.util.AttributeSet;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.dto.stories.model.mention.SelectionChangeEditText;
import xsna.cbc0;

/* compiled from: PosterTextViews.kt */
/* loaded from: classes4.dex */
public class PosterEditText extends SelectionChangeEditText {
    public final cbc0 c;

    public PosterEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new cbc0(this);
    }

    public void setConstants(Poster.Constants constants) {
        this.c.d = constants;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.c.e = i;
    }

    public void setWithMentionsParsing(boolean z) {
        this.c.getClass();
    }
}
