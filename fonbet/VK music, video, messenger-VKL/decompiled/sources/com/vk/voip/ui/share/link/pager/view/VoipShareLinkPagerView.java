package com.vk.voip.ui.share.link.pager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerState;
import com.vkontakte.android.R;
import xsna.b8j0;
import xsna.bwt0;
import xsna.dgu0;
import xsna.i9u0;
import xsna.ifw0;
import xsna.ijw0;
import xsna.q1x0;
import xsna.r1x0;
import xsna.v1x0;
import xsna.z4t0;

/* compiled from: VoipShareLinkPagerView.kt */
/* loaded from: classes7.dex */
public final class VoipShareLinkPagerView extends LinearLayout {
    public static final /* synthetic */ int k = 0;
    public final q1x0 b;
    public final View c;
    public final TextView d;
    public final View e;
    public final View f;
    public final View g;
    public b h;
    public String i;
    public final io.reactivex.rxjava3.disposables.b j;

    /* compiled from: VoipShareLinkPagerView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipShareLinkPagerState.TypeControl.values().length];
            try {
                iArr[VoipShareLinkPagerState.TypeControl.SHARE_REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipShareLinkPagerState.TypeControl.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipShareLinkPagerState.TypeControl.SINGLE_SHARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VoipShareLinkPagerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.j = new io.reactivex.rxjava3.disposables.b();
        LayoutInflater.from(context).inflate(R.layout.voip_share_link_pager_view, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.voip_share_link_pager_tab_recycler_view);
        recyclerView.setItemAnimator(null);
        this.c = findViewById(R.id.voip_share_link_pager_progress_bar);
        TextView textView = (TextView) findViewById(R.id.voip_share_link_pager_link);
        this.d = textView;
        View findViewById = findViewById(R.id.voip_share_link_pager_share_btn);
        this.e = findViewById;
        View findViewById2 = findViewById(R.id.voip_share_link_pager_refresh_btn);
        this.f = findViewById2;
        View findViewById3 = findViewById(R.id.voip_share_link_pager_single_share_btn);
        this.g = findViewById3;
        z4t0 z4t0Var = new z4t0(this, 14);
        q1x0 q1x0Var = new q1x0();
        q1x0Var.x0(r1x0.class, new dgu0(z4t0Var, 5));
        this.b = q1x0Var;
        recyclerView.setAdapter(q1x0Var);
        textView.setOnTouchListener(new v1x0());
        bwt0.i0(findViewById, new ifw0(this, 4));
        bwt0.i0(findViewById2, new b8j0(this, 29));
        bwt0.i0(findViewById3, new i9u0(this, 11));
    }

    public final void a(b bVar) {
        this.h = bVar;
        this.j.b(io.reactivex.rxjava3.kotlin.c.f(3, bVar.i, null, null, new ijw0(this, 4)));
    }
}
