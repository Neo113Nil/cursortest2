package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sofascore.results.chat.view.ChatConnectingView;
import com.sofascore.results.chat.view.ChatMessageInputView;
import com.sofascore.results.chat.view.ChatRecyclerView;
import com.sofascore.results.chat.view.FloatingIndicationLabelView;
import com.sofascore.results.chat.view.ScoreUpdateView;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yn8 implements krk {
    public final ConstraintLayout a;
    public final ChatConnectingView b;
    public final gh5 c;
    public final e92 d;
    public final FrameLayout e;
    public final ChatMessageInputView f;
    public final ImageView g;
    public final GraphicLarge h;
    public final FloatingIndicationLabelView i;
    public final RecyclerView j;
    public final View k;
    public final ChatRecyclerView l;
    public final ScoreUpdateView m;
    public final FloatingActionButton n;

    public yn8(ConstraintLayout constraintLayout, ChatConnectingView chatConnectingView, gh5 gh5Var, e92 e92Var, FrameLayout frameLayout, ChatMessageInputView chatMessageInputView, ImageView imageView, GraphicLarge graphicLarge, FloatingIndicationLabelView floatingIndicationLabelView, RecyclerView recyclerView, View view, ChatRecyclerView chatRecyclerView, ScoreUpdateView scoreUpdateView, FloatingActionButton floatingActionButton) {
        this.a = constraintLayout;
        this.b = chatConnectingView;
        this.c = gh5Var;
        this.d = e92Var;
        this.e = frameLayout;
        this.f = chatMessageInputView;
        this.g = imageView;
        this.h = graphicLarge;
        this.i = floatingIndicationLabelView;
        this.j = recyclerView;
        this.k = view;
        this.l = chatRecyclerView;
        this.m = scoreUpdateView;
        this.n = floatingActionButton;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
