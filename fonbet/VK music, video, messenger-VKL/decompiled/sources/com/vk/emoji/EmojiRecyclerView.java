package com.vk.emoji;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.q1t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes18.dex */
public final class EmojiRecyclerView extends RecyclerView {
    public final a b;
    public int c;
    public com.vk.emoji.a d;
    public q1t e;

    public class a extends GridLayoutManager.c {
        public a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            EmojiRecyclerView emojiRecyclerView = EmojiRecyclerView.this;
            if (emojiRecyclerView.d.getItemViewType(i) == 0) {
                return emojiRecyclerView.c;
            }
            return 1;
        }
    }

    public EmojiRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new a();
        this.c = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        com.vk.emoji.a aVar;
        super.onMeasure(i, i2);
        int dimension = (int) getResources().getDimension(R.dimen.vk_emoji_keyboard_item_width);
        if (dimension <= 0 || getLayoutManager() == null || !(getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        int max = Math.max(1, getMeasuredWidth() / dimension);
        if (max != this.c) {
            this.c = max;
            q1t q1tVar = this.e;
            if (q1tVar != null && (aVar = ((b) q1tVar.b).d) != null) {
                aVar.A0();
            }
            ((GridLayoutManager) getLayoutManager()).setSpanCount(this.c);
        }
        ((GridLayoutManager) getLayoutManager()).x = this.b;
    }
}
