package com.vk.voip.ui.groupcalls.grid.holder.video_grid;

import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.c;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import xsna.biq;
import xsna.bwt0;
import xsna.cn70;
import xsna.diu;
import xsna.dnp0;
import xsna.e43;
import xsna.eiu;
import xsna.epx;
import xsna.j5g;
import xsna.jq;
import xsna.khu;
import xsna.kiu;
import xsna.piu;
import xsna.rl3;
import xsna.sgu;
import xsna.tmg0;
import xsna.vlp0;
import xsna.wra;
import xsna.zmp0;

/* compiled from: GroupCallGridView.kt */
/* loaded from: classes7.dex */
public final class GroupCallGridView extends ViewGroup implements tmg0 {
    public static final /* synthetic */ int l = 0;
    public final float b;
    public final HashMap c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public final diu[] g;
    public final piu h;
    public final EmptyList i;
    public final EmptyList j;
    public Float k;

    public GroupCallGridView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static Size b(int i, int i2, boolean z) {
        int b = cn70.b(4);
        int i3 = i - (b * 2);
        int height = (i2 - d(i, i2, true).getHeight()) - (b * 3);
        if (!z) {
            height = i3;
        }
        return new Size(i3, height);
    }

    public static Size d(int i, int i2, boolean z) {
        int b = cn70.b(4);
        int i3 = b * 3;
        int i4 = (i - i3) / 2;
        return new Size(i4, z ? jq.a(b, 4, i2, 3) : Math.min((i2 - i3) / 2, i4));
    }

    private final View getSecondChildIndex() {
        return this.e ? getTipView() : this.g[1];
    }

    private final piu getTipView() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(sgu.b bVar) {
        boolean z;
        ArrayList arrayList = this.d;
        arrayList.clear();
        List<CallMemberId> list = bVar.c;
        arrayList.addAll(j5g.H0(list, 6));
        this.e = bVar.d;
        diu[] diuVarArr = this.g;
        ArrayList w0 = rl3.w0(diuVarArr);
        Object[] objArr = new diu[6];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            HashMap hashMap = this.c;
            if (!hasNext) {
                for (int i2 = 0; i2 < 6; i2++) {
                    if (objArr[i2] == null) {
                        objArr[i2] = w0.remove(0);
                    }
                }
                int length = diuVarArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    diuVarArr[i3] = objArr[i3];
                }
                hashMap.clear();
                if (this.f) {
                    zmp0.b(this);
                    vlp0 wraVar = new wra();
                    vlp0 biqVar = new biq(1);
                    vlp0 biqVar2 = new biq(2);
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        GLSurfaceView gLSurfaceView = diuVarArr[i4];
                        wraVar.addTarget(gLSurfaceView);
                        if (!bwt0.K(gLSurfaceView)) {
                            biqVar.addTarget(gLSurfaceView);
                        }
                    }
                    for (int size2 = arrayList.size(); size2 < 6; size2++) {
                        GLSurfaceView gLSurfaceView2 = diuVarArr[size2];
                        if (bwt0.K(gLSurfaceView2)) {
                            biqVar2.addTarget(gLSurfaceView2);
                        }
                    }
                    dnp0 dnp0Var = new dnp0();
                    if (!biqVar2.getTargets().isEmpty()) {
                        dnp0Var.c(biqVar2);
                    }
                    if (!wraVar.getTargets().isEmpty()) {
                        dnp0Var.c(wraVar);
                    }
                    if (!biqVar.getTargets().isEmpty()) {
                        dnp0Var.c(biqVar);
                    }
                    if (dnp0Var.b.size() > 0) {
                        zmp0.a(this, dnp0Var);
                    }
                }
                int i5 = 0;
                boolean z2 = false;
                for (CallMemberId callMemberId : list) {
                    int i6 = i5 + 1;
                    GroupCallViewModel.b.getClass();
                    kiu b = GroupCallViewModel.b(callMemberId);
                    eiu eiuVar = diuVarArr[i5];
                    ConversationVideoTrackParticipantKey videoTrackKey = eiuVar.getVideoTrackKey();
                    eiuVar.setVisibility(0);
                    eiuVar.setVideoOn(this.f);
                    eiuVar.setViewModel(b);
                    if (b == null) {
                        z = false;
                    } else {
                        hashMap.put(b.a.a, eiuVar);
                        c.b.getClass();
                        if (c.r0()) {
                            eiuVar.setOnLongClickListener(new khu());
                        }
                        z = !epx.f(videoTrackKey, eiuVar.getVideoTrackKey());
                    }
                    if (z) {
                        z2 = true;
                    }
                    i5 = i6;
                }
                while (i5 < 6) {
                    eiu eiuVar2 = diuVarArr[i5];
                    if (eiuVar2.x) {
                        z2 = true;
                    }
                    eiuVar2.setViewModel(null);
                    eiuVar2.setVideoOn(false);
                    eiuVar2.setVisibility(8);
                    i5++;
                }
                piu tipView = getTipView();
                tipView.setVideoOn(this.f);
                if (this.e) {
                    tipView.setVisibility(0);
                    return z2;
                }
                tipView.setVisibility(8);
                return z2;
            }
            Object next = it.next();
            int i7 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            diu diuVar = (diu) hashMap.get((CallMemberId) next);
            if (diuVar != null) {
                objArr[i] = diuVar;
                w0.remove(diuVar);
            }
            i = i7;
        }
    }

    public final int c(int i, int i2) {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        if (rect.height() == 0) {
            return (i - i2) / 2;
        }
        int height = ((rect.height() / 2) - iArr[1]) - (i2 / 2);
        return height < 0 ? (i - i2) / 2 : height + i2 > i ? (i - i2) / 2 : height;
    }

    public final void e() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        diu diuVar = this.g[0];
        View secondChildIndex = getSecondChildIndex();
        int b = cn70.b(4);
        Size size = new Size(measuredWidth - (b * 2), jq.a(b, 3, measuredHeight, 2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size.getHeight(), 1073741824);
        diuVar.getLayoutParams().width = makeMeasureSpec;
        diuVar.getLayoutParams().height = makeMeasureSpec2;
        secondChildIndex.getLayoutParams().width = makeMeasureSpec;
        secondChildIndex.getLayoutParams().height = makeMeasureSpec2;
    }

    public final void f() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = (int) this.b;
        diu diuVar = this.g[0];
        View secondChildIndex = getSecondChildIndex();
        int b = cn70.b(4);
        Size size = new Size(measuredWidth - (b * 2), jq.a(b, 3, measuredHeight, 2));
        int c = c(measuredHeight, (size.getHeight() * 2) - i);
        int width = (measuredWidth - size.getWidth()) / 2;
        int width2 = size.getWidth() + width;
        int height = size.getHeight() + c;
        diuVar.layout(width, c, width2, height);
        int i2 = height + i;
        secondChildIndex.layout(width, i2, width2, size.getHeight() + i2);
    }

    public final void g() {
        for (diu diuVar : this.g) {
            diuVar.release();
        }
        getTipView().getClass();
    }

    @Override // xsna.tmg0
    public List<View> getAnimatedViewsToRotate() {
        return this.j;
    }

    @Override // xsna.tmg0
    public List<View> getViewsToRotate() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int size = this.d.size();
        float f = this.b;
        diu[] diuVarArr = this.g;
        switch (size) {
            case 1:
                if (!this.e) {
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    diu diuVar = diuVarArr[0];
                    Size b = b(measuredWidth, measuredHeight, false);
                    int c = c(measuredHeight, b.getHeight());
                    int width = (measuredWidth - b.getWidth()) / 2;
                    diuVar.layout(width, c, b.getWidth() + width, b.getHeight() + c);
                    break;
                } else {
                    f();
                    break;
                }
            case 2:
                f();
                break;
            case 3:
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                int i5 = (int) f;
                diu diuVar2 = diuVarArr[0];
                diu diuVar3 = diuVarArr[1];
                diu diuVar4 = diuVarArr[2];
                Size b2 = b(measuredWidth2, measuredHeight2, true);
                Size d = d(measuredWidth2, measuredHeight2, true);
                int height = d.getHeight() + b2.getHeight() + i5;
                int width2 = (measuredWidth2 - b2.getWidth()) / 2;
                int c2 = c(measuredHeight2, height);
                int width3 = b2.getWidth() + width2;
                int height2 = b2.getHeight() + c2;
                diuVar2.layout(width2, c2, width3, height2);
                int width4 = ((measuredWidth2 - (d.getWidth() * 2)) - i5) / 2;
                int i6 = height2 + i5;
                int width5 = d.getWidth() + width4;
                int height3 = d.getHeight() + i6;
                diuVar3.layout(width4, i6, width5, height3);
                int i7 = width5 + i5;
                diuVar4.layout(i7, i6, d.getWidth() + i7, height3);
                break;
            case 4:
                int measuredWidth3 = getMeasuredWidth();
                int measuredHeight3 = getMeasuredHeight();
                int i8 = (int) f;
                diu diuVar5 = diuVarArr[0];
                diu diuVar6 = diuVarArr[1];
                diu diuVar7 = diuVarArr[2];
                diu diuVar8 = diuVarArr[3];
                Size d2 = d(measuredWidth3, measuredHeight3, false);
                int height4 = (d2.getHeight() * 2) + i8;
                int width6 = (d2.getWidth() * 2) + i8;
                int c3 = c(measuredHeight3, height4);
                int i9 = (measuredWidth3 - width6) / 2;
                int width7 = d2.getWidth() + i9;
                int height5 = d2.getHeight() + c3;
                diuVar5.layout(i9, c3, width7, height5);
                int i10 = width7 + i8;
                diuVar6.layout(i10, c3, d2.getWidth() + i10, height5);
                int i11 = height5 + i8;
                int width8 = d2.getWidth() + i9;
                int height6 = d2.getHeight() + i11;
                diuVar7.layout(i9, i11, width8, height6);
                int i12 = width8 + i8;
                diuVar8.layout(i12, i11, d2.getWidth() + i12, height6);
                break;
            case 5:
                int measuredWidth4 = getMeasuredWidth();
                int measuredHeight4 = getMeasuredHeight();
                int i13 = (int) f;
                diu diuVar9 = diuVarArr[0];
                diu diuVar10 = diuVarArr[1];
                diu diuVar11 = diuVarArr[2];
                diu diuVar12 = diuVarArr[3];
                diu diuVar13 = diuVarArr[4];
                Size d3 = d(measuredWidth4, measuredHeight4, true);
                int i14 = i13 * 2;
                int height7 = (d3.getHeight() * 3) + i14;
                int width9 = (d3.getWidth() * 2) + i13;
                int c4 = c(measuredHeight4, height7);
                int i15 = (measuredWidth4 - width9) / 2;
                int width10 = d3.getWidth() + i15;
                int height8 = d3.getHeight() + c4;
                diuVar9.layout(i15, c4, width10, height8);
                int i16 = width10 + i13;
                diuVar10.layout(i16, c4, d3.getWidth() + i16, height8);
                int i17 = height8 + i13;
                int width11 = d3.getWidth() + i15;
                int height9 = d3.getHeight() + i17;
                diuVar11.layout(i15, i17, width11, height9);
                int i18 = width11 + i13;
                diuVar12.layout(i18, i17, d3.getWidth() + i18, height9);
                int width12 = (measuredWidth4 - d3.getWidth()) / 2;
                int height10 = (d3.getHeight() * 2) + c4 + i14;
                diuVar13.layout(width12, height10, d3.getWidth() + width12, d3.getHeight() + height10);
                break;
            case 6:
                diu diuVar14 = diuVarArr[0];
                diu diuVar15 = diuVarArr[1];
                diu diuVar16 = diuVarArr[2];
                diu diuVar17 = diuVarArr[3];
                diu diuVar18 = diuVarArr[4];
                diu diuVar19 = diuVarArr[5];
                int measuredWidth5 = getMeasuredWidth();
                int measuredHeight5 = getMeasuredHeight();
                Size d4 = d(measuredWidth5, measuredHeight5, true);
                int i19 = (int) f;
                int height11 = (i19 * 2) + (d4.getHeight() * 3);
                int width13 = (d4.getWidth() * 2) + i19;
                int c5 = c(measuredHeight5, height11);
                int i20 = (measuredWidth5 - width13) / 2;
                int width14 = d4.getWidth() + i20;
                int height12 = d4.getHeight() + c5;
                diuVar14.layout(i20, c5, width14, height12);
                int i21 = width14 + i19;
                diuVar15.layout(i21, c5, d4.getWidth() + i21, height12);
                int i22 = height12 + i19;
                int width15 = d4.getWidth() + i20;
                int height13 = d4.getHeight() + i22;
                diuVar16.layout(i20, i22, width15, height13);
                int i23 = width15 + i19;
                diuVar17.layout(i23, i22, d4.getWidth() + i23, height13);
                int i24 = height13 + i19;
                int width16 = d4.getWidth() + i20;
                int height14 = d4.getHeight() + i24;
                diuVar18.layout(i20, i24, width16, height14);
                int i25 = width16 + i19;
                diuVar19.layout(i25, i24, d4.getWidth() + i25, height14);
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = this.d.size();
        diu[] diuVarArr = this.g;
        switch (size) {
            case 1:
                if (!this.e) {
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    diu diuVar = diuVarArr[0];
                    Size b = b(measuredWidth, measuredHeight, false);
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(b.getWidth(), 1073741824);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(b.getHeight(), 1073741824);
                    diuVar.getLayoutParams().width = makeMeasureSpec;
                    diuVar.getLayoutParams().height = makeMeasureSpec2;
                    break;
                } else {
                    e();
                    break;
                }
            case 2:
                e();
                break;
            case 3:
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                diu diuVar2 = diuVarArr[0];
                diu diuVar3 = diuVarArr[1];
                diu diuVar4 = diuVarArr[2];
                Size d = d(measuredWidth2, measuredHeight2, true);
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(d.getWidth(), 1073741824);
                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(d.getHeight(), 1073741824);
                Size b2 = b(measuredWidth2, measuredHeight2, true);
                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(b2.getWidth(), 1073741824);
                int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(b2.getHeight(), 1073741824);
                diuVar2.getLayoutParams().width = makeMeasureSpec5;
                diuVar2.getLayoutParams().height = makeMeasureSpec6;
                diuVar3.getLayoutParams().width = makeMeasureSpec3;
                diuVar3.getLayoutParams().height = makeMeasureSpec4;
                diuVar4.getLayoutParams().width = makeMeasureSpec3;
                diuVar4.getLayoutParams().height = makeMeasureSpec4;
                break;
            case 4:
                int measuredWidth3 = getMeasuredWidth();
                int measuredHeight3 = getMeasuredHeight();
                diu diuVar5 = diuVarArr[0];
                diu diuVar6 = diuVarArr[1];
                diu diuVar7 = diuVarArr[2];
                diu diuVar8 = diuVarArr[3];
                Size d2 = d(measuredWidth3, measuredHeight3, false);
                int makeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec(d2.getWidth(), 1073741824);
                int makeMeasureSpec8 = View.MeasureSpec.makeMeasureSpec(d2.getHeight(), 1073741824);
                diuVar5.getLayoutParams().width = makeMeasureSpec7;
                diuVar5.getLayoutParams().height = makeMeasureSpec8;
                diuVar6.getLayoutParams().width = makeMeasureSpec7;
                diuVar6.getLayoutParams().height = makeMeasureSpec8;
                diuVar7.getLayoutParams().width = makeMeasureSpec7;
                diuVar7.getLayoutParams().height = makeMeasureSpec8;
                diuVar8.getLayoutParams().width = makeMeasureSpec7;
                diuVar8.getLayoutParams().height = makeMeasureSpec8;
                break;
            case 5:
                int measuredWidth4 = getMeasuredWidth();
                int measuredHeight4 = getMeasuredHeight();
                diu diuVar9 = diuVarArr[0];
                diu diuVar10 = diuVarArr[1];
                diu diuVar11 = diuVarArr[2];
                diu diuVar12 = diuVarArr[3];
                diu diuVar13 = diuVarArr[4];
                Size d3 = d(measuredWidth4, measuredHeight4, true);
                int makeMeasureSpec9 = View.MeasureSpec.makeMeasureSpec(d3.getWidth(), 1073741824);
                int makeMeasureSpec10 = View.MeasureSpec.makeMeasureSpec(d3.getHeight(), 1073741824);
                diuVar13.getLayoutParams().width = makeMeasureSpec9;
                diuVar13.getLayoutParams().height = makeMeasureSpec10;
                diuVar9.getLayoutParams().width = makeMeasureSpec9;
                diuVar9.getLayoutParams().height = makeMeasureSpec10;
                diuVar10.getLayoutParams().width = makeMeasureSpec9;
                diuVar10.getLayoutParams().height = makeMeasureSpec10;
                diuVar11.getLayoutParams().width = makeMeasureSpec9;
                diuVar11.getLayoutParams().height = makeMeasureSpec10;
                diuVar12.getLayoutParams().width = makeMeasureSpec9;
                diuVar12.getLayoutParams().height = makeMeasureSpec10;
                break;
            case 6:
                int measuredWidth5 = getMeasuredWidth();
                int measuredHeight5 = getMeasuredHeight();
                diu diuVar14 = diuVarArr[0];
                diu diuVar15 = diuVarArr[1];
                diu diuVar16 = diuVarArr[2];
                diu diuVar17 = diuVarArr[3];
                diu diuVar18 = diuVarArr[4];
                diu diuVar19 = diuVarArr[5];
                Size d4 = d(measuredWidth5, measuredHeight5, true);
                int makeMeasureSpec11 = View.MeasureSpec.makeMeasureSpec(d4.getWidth(), 1073741824);
                int makeMeasureSpec12 = View.MeasureSpec.makeMeasureSpec(d4.getHeight(), 1073741824);
                diuVar19.getLayoutParams().width = makeMeasureSpec11;
                diuVar19.getLayoutParams().height = makeMeasureSpec12;
                diuVar18.getLayoutParams().width = makeMeasureSpec11;
                diuVar18.getLayoutParams().height = makeMeasureSpec12;
                diuVar14.getLayoutParams().width = makeMeasureSpec11;
                diuVar14.getLayoutParams().height = makeMeasureSpec12;
                diuVar15.getLayoutParams().width = makeMeasureSpec11;
                diuVar15.getLayoutParams().height = makeMeasureSpec12;
                diuVar16.getLayoutParams().width = makeMeasureSpec11;
                diuVar16.getLayoutParams().height = makeMeasureSpec12;
                diuVar17.getLayoutParams().width = makeMeasureSpec11;
                diuVar17.getLayoutParams().height = makeMeasureSpec12;
                break;
        }
        measureChildren(i, i2);
    }

    public final void setIsVideoOn(boolean z) {
        this.f = z;
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.g[i].setVideoOn(z);
        }
        this.h.setVideoOn(z);
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        if (epx.d(this.k, f)) {
            return;
        }
        this.k = Float.valueOf(f);
        super.v0(f);
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.g[i].v0(f);
        }
        getTipView().v0(f);
    }

    public GroupCallGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public GroupCallGridView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ GroupCallGridView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public GroupCallGridView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new HashMap();
        this.d = new ArrayList();
        diu[] diuVarArr = new diu[6];
        for (int i3 = 0; i3 < 6; i3++) {
            diuVarArr[i3] = new diu(getContext());
        }
        this.g = diuVarArr;
        this.h = new piu(context);
        EmptyList emptyList = EmptyList.b;
        this.i = emptyList;
        this.j = emptyList;
        this.b = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        for (int i4 = 0; i4 < 6; i4++) {
            addView(this.g[i4]);
        }
        addView(this.h);
    }
}
