package com.vk.photos.root.photoflow.presentation.views.skeleton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.cn70;
import xsna.dga0;
import xsna.fnj;
import xsna.iah0;
import xsna.j5g;
import xsna.jgu;
import xsna.swe0;
import xsna.w7a0;

/* compiled from: PhotoFlowGridSkeletonView.kt */
/* loaded from: classes4.dex */
public final class PhotoFlowGridSkeletonView extends RecyclerView {
    public PhotoFlowGridSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.photo_flow_grid_skeleton_view, this);
        w7a0 w7a0Var = new w7a0(context);
        w7a0Var.setItems(j5g.O0(swe0.q(0, 15)));
        setAdapter(w7a0Var);
        HashSet hashSet = iah0.a;
        setLayoutManager(new GridLayoutManager((fnj.c(context) || iah0.s(context)) ? 3 : 6));
        addItemDecoration(new jgu((fnj.c(context) || iah0.s(context)) ? 3 : 6, cn70.b(2), false, 0));
        addItemDecoration(new dga0((fnj.c(context) || iah0.s(context)) ? 3 : 6, new dga0.b()));
    }
}
