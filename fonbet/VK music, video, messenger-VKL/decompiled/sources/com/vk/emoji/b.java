package com.vk.emoji;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.emoji.FastScroller;
import com.vkontakte.android.R;
import xsna.krv0;
import xsna.l7s;
import xsna.o9f0;
import xsna.q1t;
import xsna.sdp;

/* compiled from: EmojiKeyboardView.java */
/* loaded from: classes18.dex */
public final class b extends FrameLayout {
    public final FastScroller b;
    public final EmojiRecyclerView c;
    public final a d;
    public RecyclerView.t e;
    public Typeface f;
    public sdp g;

    public b(@NonNull Context context) {
        super(context);
        o9f0 o9f0Var = new o9f0(getContext());
        if (context instanceof l7s) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.vk_ui_write_bar_input_border, typedValue, true)) {
                setBackgroundColor(typedValue.data);
            } else {
                krv0.n(R.attr.vk_ui_write_bar_input_border, this);
            }
        } else {
            krv0.n(R.attr.vk_ui_write_bar_input_border, this);
        }
        LayoutInflater.from(context).inflate(R.layout.vk_emoji_keyboard_view, this);
        this.b = (FastScroller) findViewById(R.id.fast_scroller);
        EmojiRecyclerView emojiRecyclerView = (EmojiRecyclerView) findViewById(R.id.rv_emoji);
        this.c = emojiRecyclerView;
        a aVar = new a(context, emojiRecyclerView, o9f0Var, this.g, this.f);
        this.d = aVar;
        EmojiRecyclerView emojiRecyclerView2 = this.c;
        emojiRecyclerView2.d = aVar;
        emojiRecyclerView2.setLayoutManager(new GridLayoutManager(1));
        this.c.setAdapter(this.d);
        RecyclerView.t tVar = this.e;
        if (tVar != null) {
            this.c.addOnScrollListener(tVar);
        }
        EmojiRecyclerView emojiRecyclerView3 = this.c;
        emojiRecyclerView3.e = new q1t(this);
        FastScroller fastScroller = this.b;
        a aVar2 = this.d;
        FastScroller.c cVar = fastScroller.p;
        RecyclerView recyclerView = fastScroller.n;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(cVar);
        }
        fastScroller.n = emojiRecyclerView3;
        emojiRecyclerView3.addOnScrollListener(cVar);
        fastScroller.o = aVar2;
    }

    public FastScroller getFastScroller() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.d;
        if (aVar != null) {
            aVar.x0();
        }
    }

    public void setEmojiKeyboardListener(sdp sdpVar) {
        this.g = sdpVar;
        this.d.g = sdpVar;
    }

    public void setFastScrollBarColor(int i) {
        this.b.setTrackColor(i);
    }

    public void setFastScrollHandleColor(int i) {
        this.b.setHandleColor(i);
    }

    public void setHeadersTypeface(Typeface typeface) {
        this.f = typeface;
        this.d.h = typeface;
    }

    public void setOnScrollListener(RecyclerView.t tVar) {
        RecyclerView.t tVar2;
        EmojiRecyclerView emojiRecyclerView = this.c;
        if (emojiRecyclerView != null && (tVar2 = this.e) != null) {
            emojiRecyclerView.removeOnScrollListener(tVar2);
        }
        EmojiRecyclerView emojiRecyclerView2 = this.c;
        if (emojiRecyclerView2 != null) {
            emojiRecyclerView2.addOnScrollListener(tVar);
        }
        this.e = tVar;
    }
}
