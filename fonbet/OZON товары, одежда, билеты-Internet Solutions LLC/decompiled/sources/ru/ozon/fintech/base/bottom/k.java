package ru.ozon.fintech.base.bottom;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.android.cell.selection.checkbox.CheckboxTitleSubtitleCellView;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f95010b;

    public /* synthetic */ k(Object obj, int i11) {
        this.f95009a = i11;
        this.f95010b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean disableDragFor$lambda$8;
        boolean touchEnabled$lambda$1;
        switch (this.f95009a) {
            case 0:
                disableDragFor$lambda$8 = m.disableDragFor$lambda$8((m) this.f95010b, view, motionEvent);
                return disableDragFor$lambda$8;
            default:
                touchEnabled$lambda$1 = CheckboxTitleSubtitleCellView.setTouchEnabled$lambda$1((Function2) this.f95010b, view, motionEvent);
                return touchEnabled$lambda$1;
        }
    }
}
