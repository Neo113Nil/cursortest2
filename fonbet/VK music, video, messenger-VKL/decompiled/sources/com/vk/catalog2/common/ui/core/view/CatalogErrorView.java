package com.vk.catalog2.common.ui.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.bd0;
import xsna.by2;
import xsna.d3m;
import xsna.gzs;
import xsna.jjc;
import xsna.k8;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: CatalogErrorView.kt */
/* loaded from: classes16.dex */
public final class CatalogErrorView extends RelativeLayout {
    public static final /* synthetic */ int f = 0;
    public final TextView b;
    public final TextView c;
    public State d;
    public gzs<s3q0> e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogErrorView.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ERROR;
        public static final State ERROR_WITHOUT_RETRY;
        public static final State NONE;

        static {
            State state = new State("NONE", 0);
            NONE = state;
            State state2 = new State("ERROR", 1);
            ERROR = state2;
            State state3 = new State("ERROR_WITHOUT_RETRY", 2);
            ERROR_WITHOUT_RETRY = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public CatalogErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = State.NONE;
        setGravity(16);
        LayoutInflater.from(context).inflate(R.layout.vk_error_screen, (ViewGroup) this, true);
        this.b = (TextView) findViewById(R.id.error_retry);
        this.c = (TextView) findViewById(R.id.error_text);
    }

    public final void a(String str, boolean z) {
        this.d = z ? State.ERROR : State.ERROR_WITHOUT_RETRY;
        this.c.setText(str);
        if (z) {
            d3m.c(this.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        d3m.c(this.c, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void setErrorMode(by2 by2Var) {
        boolean z = by2Var.b;
        this.d = z ? State.ERROR : State.ERROR_WITHOUT_RETRY;
        this.c.setText(by2Var.a);
        jjc.g(this.b, new k8(3, by2Var, this));
        if (z) {
            d3m.c(this.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        d3m.c(this.c, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void setOnRetryClickListener(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
        this.b.setOnClickListener(new bd0(gzsVar, 1));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        State state = this.d;
        State state2 = State.ERROR;
        this.b.setVisibility(state == state2 ? i : 8);
        if (this.d != state2) {
            i = 8;
        }
        this.c.setVisibility(i);
    }
}
