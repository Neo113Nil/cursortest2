package com.vk.stories.design.view.stats.tabs.info.mvi;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.afm0;
import xsna.bwt0;
import xsna.f5z;
import xsna.gm50;
import xsna.n9m0;
import xsna.o8;
import xsna.oxm;

/* compiled from: StoryStatisticsInfoMviView.kt */
/* loaded from: classes6.dex */
public final class c implements gm50 {
    public final f5z b;
    public final View c;
    public final RecyclerView d;
    public final View e;
    public final afm0 f;

    public c(View view, f5z f5zVar, o8 o8Var) {
        this.b = f5zVar;
        this.c = view.findViewById(R.id.info_loading_view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.info_recycler);
        this.d = recyclerView;
        View findViewById = view.findViewById(R.id.info_error_view);
        this.e = findViewById;
        TextView textView = (TextView) findViewById.findViewById(R.id.error_text);
        TextView textView2 = (TextView) findViewById.findViewById(R.id.error_retry);
        afm0 afm0Var = new afm0(new oxm());
        this.f = afm0Var;
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(afm0Var);
        textView.setText(R.string.story_statistics_error_text_info);
        bwt0.i0(textView2, new n9m0(o8Var, 2));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
