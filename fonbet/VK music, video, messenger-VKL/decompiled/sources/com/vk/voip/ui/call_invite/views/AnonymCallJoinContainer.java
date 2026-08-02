package com.vk.voip.ui.call_invite.views;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;
import xsna.izs;
import xsna.s3q0;
import xsna.tt2;
import xsna.x9;

/* compiled from: AnonymCallJoinContainer.kt */
/* loaded from: classes7.dex */
public final class AnonymCallJoinContainer extends ViewGroup implements tt2 {
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public izs<? super Boolean, s3q0> f;
    public boolean g;
    public final View h;
    public final View i;
    public final View j;
    public final AnonymCallJoinContainerChildView k;
    public final View l;

    /* compiled from: AnonymCallJoinContainer.kt */
    public static final class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public boolean b;

        /* compiled from: AnonymCallJoinContainer.kt */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public State(Parcel parcel) {
            super(parcel);
            this.b = parcel.readInt() != 0;
        }
    }

    public AnonymCallJoinContainer(Context context) {
        super(context, null, 0);
        this.b = cn70.b(38);
        this.c = cn70.b(80);
        this.d = cn70.b(20);
        this.e = cn70.b(2);
        LayoutInflater.from(context).inflate(R.layout.voip_anonym_group_call, (ViewGroup) this, true);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.h = findViewById(R.id.voip_call_join_logo);
        this.j = findViewById(R.id.voip_call_invite_toolbar);
        this.i = findViewById(R.id.voip_call_invite_footer);
        this.l = findViewById(R.id.voip_call_invite_scroll_view);
        this.k = (AnonymCallJoinContainerChildView) findViewById(R.id.voip_call_invite_info_container);
    }

    public final izs<Boolean, s3q0> getCallback() {
        return this.f;
    }

    public View getDataContainer() {
        return this.k.getDataContainer();
    }

    public final View getFooter() {
        return this.i;
    }

    public final View getInfoChildView() {
        return this.l;
    }

    public ViewGroup getInfoContainer() {
        return this.k;
    }

    public final AnonymCallJoinContainerChildView getInfoContainerView() {
        return this.k;
    }

    public final View getLogo() {
        return this.h;
    }

    public View getProgressContainer() {
        return this.k.getProgressContainer();
    }

    public final View getToolbar() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.j;
        int i5 = 0;
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        int measuredHeight = view.getMeasuredHeight();
        View view2 = this.l;
        view2.layout(0, measuredHeight, view2.getMeasuredWidth(), getMeasuredHeight());
        if (bwt0.K(getDataContainer())) {
            i5 = Math.min(getDataContainer().getMeasuredHeight(), view2.getMeasuredHeight());
        } else if (bwt0.K(getProgressContainer())) {
            i5 = Math.min(getProgressContainer().getMeasuredHeight(), view2.getMeasuredHeight());
        }
        int measuredHeight2 = view.getMeasuredHeight();
        int i6 = this.d;
        int i7 = (measuredHeight2 - i6) / 2;
        boolean z2 = this.g;
        View view3 = this.h;
        if (!z2) {
            int measuredHeight3 = (((getMeasuredHeight() - view.getMeasuredHeight()) - i5) - this.i.getMeasuredHeight()) / 2;
            int b = x9.b(measuredHeight3 - view3.getMeasuredHeight(), this.b, 2, view.getMeasuredHeight());
            if (b > view.getMeasuredHeight() + this.e) {
                i6 = view3.getMeasuredHeight();
                i7 = b;
            }
        }
        int measuredWidth = (getMeasuredWidth() - i6) / 2;
        view3.layout(measuredWidth, i7, measuredWidth + i6, i6 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.j;
        measureChild(view, i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - view.getMeasuredHeight(), 1073741824);
        View view2 = this.l;
        measureChild(view2, i, makeMeasureSpec);
        AnonymCallJoinContainerChildView anonymCallJoinContainerChildView = this.k;
        View dataContainer = anonymCallJoinContainerChildView.getDataContainer();
        View progressContainer = anonymCallJoinContainerChildView.getProgressContainer();
        int min = bwt0.K(dataContainer) ? Math.min(dataContainer.getMeasuredHeight(), view2.getMeasuredHeight()) : bwt0.K(progressContainer) ? Math.min(progressContainer.getMeasuredHeight(), view2.getMeasuredHeight()) : 0;
        boolean z = this.g;
        View view3 = this.h;
        int i3 = this.d;
        if (!z) {
            int measuredHeight = (((size - view.getMeasuredHeight()) - min) - this.i.getMeasuredHeight()) / 2;
            int measuredHeight2 = view.getMeasuredHeight();
            int measuredHeight3 = measuredHeight - view3.getMeasuredHeight();
            int i4 = this.b;
            int i5 = ((measuredHeight3 - i4) / 2) + measuredHeight2;
            int measuredHeight4 = view.getMeasuredHeight();
            int i6 = this.e;
            if (i5 > measuredHeight4 + i6) {
                i3 = Math.max(i3, Math.min(this.c, (measuredHeight - i4) - i6));
            }
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        measureChild(view3, makeMeasureSpec2, makeMeasureSpec2);
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(state.getSuperState());
            setLogoCollapsed(state.b);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        State state = new State(super.onSaveInstanceState());
        state.b = this.g;
        return state;
    }

    public final void setCallback(izs<? super Boolean, s3q0> izsVar) {
        this.f = izsVar;
    }

    @Override // xsna.tt2
    public void setLogoCollapsed(boolean z) {
        this.g = z;
        requestLayout();
    }
}
