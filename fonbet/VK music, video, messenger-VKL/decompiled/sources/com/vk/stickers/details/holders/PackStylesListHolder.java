package com.vk.stickers.details.holders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.a790;
import xsna.asp;
import xsna.bq00;
import xsna.bwt0;
import xsna.ctm0;
import xsna.e3m;
import xsna.edl0;
import xsna.g3l0;
import xsna.j5g;
import xsna.qai0;
import xsna.yr6;
import xsna.z690;
import xsna.zrp;

/* compiled from: PackStylesListHolder.kt */
/* loaded from: classes6.dex */
public final class PackStylesListHolder extends yr6<a790> {
    public final g3l0 l;
    public final ViewGroup m;
    public final RecyclerView n;
    public final TextView o;
    public final TextView p;
    public final View q;
    public final edl0 r;
    public boolean s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PackStylesListHolder.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DATA;
        public static final State ERROR;
        public static final State LOADING;
        public static final State UNDEFINED;

        static {
            State state = new State("LOADING", 0);
            LOADING = state;
            State state2 = new State("ERROR", 1);
            ERROR = state2;
            State state3 = new State("DATA", 2);
            DATA = state3;
            State state4 = new State("UNDEFINED", 3);
            UNDEFINED = state4;
            State[] stateArr = {state, state2, state3, state4};
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

    /* compiled from: PackStylesListHolder.kt */
    public static final class a implements edl0.a {
        public a() {
        }

        @Override // xsna.edl0.a
        public final void a(qai0 qai0Var) {
            PackStylesListHolder.this.l.B(qai0Var.a);
        }
    }

    /* compiled from: PackStylesListHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PackStylesListHolder(g3l0 g3l0Var, ViewGroup viewGroup, boolean z) {
        super(R.layout.sticker_details_styles_view_item, viewGroup);
        this.l = g3l0Var;
        this.m = viewGroup;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.styles_recycler);
        this.n = recyclerView;
        this.o = (TextView) this.itemView.findViewById(R.id.styles_error_tv);
        TextView textView = (TextView) this.itemView.findViewById(R.id.styles_retry_btn);
        this.p = textView;
        this.q = this.itemView.findViewById(R.id.styles_progress);
        this.s = true;
        recyclerView.setNestedScrollingEnabled(false);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        viewGroup.getContext();
        edl0 edl0Var = new edl0(z, new a());
        this.r = edl0Var;
        recyclerView.setAdapter(edl0Var);
        bwt0.i0(textView, new bq00(this, 20));
    }

    @Override // xsna.yr6
    /* renamed from: i6, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void W5(a790 a790Var) {
        int i = b.$EnumSwitchMapping$0[a790Var.b.ordinal()];
        View view = this.q;
        TextView textView = this.p;
        TextView textView2 = this.o;
        RecyclerView recyclerView = this.n;
        if (i == 1) {
            bwt0.p0(recyclerView, false);
            bwt0.p0(textView2, false);
            bwt0.p0(textView, false);
            bwt0.p0(view, true);
            return;
        }
        if (i == 2) {
            bwt0.p0(recyclerView, false);
            bwt0.p0(textView2, true);
            bwt0.p0(textView, true);
            bwt0.p0(view, false);
            return;
        }
        if (i != 3) {
            bwt0.p0(recyclerView, false);
            bwt0.p0(textView2, false);
            bwt0.p0(textView, false);
            bwt0.p0(view, false);
            return;
        }
        bwt0.p0(recyclerView, true);
        bwt0.p0(textView2, false);
        bwt0.p0(textView, false);
        bwt0.p0(view, false);
        ArrayList arrayList = a790Var.c;
        int i2 = a790Var.d;
        edl0 edl0Var = this.r;
        edl0Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        if (i2 <= 0 || i2 >= arrayList.size()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new z690((qai0) it.next()));
            }
        } else {
            Iterator it2 = j5g.H0(arrayList, i2).iterator();
            while (it2.hasNext()) {
                arrayList2.add(new z690((qai0) it2.next()));
            }
            arrayList2.add(ctm0.b);
            Iterator it3 = j5g.I0(arrayList.size() - i2, arrayList).iterator();
            while (it3.hasNext()) {
                arrayList2.add(new z690((qai0) it3.next()));
            }
        }
        edl0Var.setItems(arrayList2);
        if (this.s) {
            int i3 = a790Var.e;
            if (i3 != -1) {
                ((LinearLayoutManager) recyclerView.getLayoutManager()).K(i3, e3m.a(R.dimen.stickers_style_img_size, this.m.getContext()) / 2);
            }
            this.s = false;
        }
    }
}
