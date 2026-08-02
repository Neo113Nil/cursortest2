package com.journeyapps.barcodescanner;

import N9.m;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h9.s;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
public class ViewfinderView extends View {

    /* renamed from: l, reason: collision with root package name */
    protected static final int[] f60256l = {0, 64, UserVerificationMethods.USER_VERIFY_PATTERN, 192, 255, 192, UserVerificationMethods.USER_VERIFY_PATTERN, 64};

    /* renamed from: a, reason: collision with root package name */
    protected final Paint f60257a;

    /* renamed from: b, reason: collision with root package name */
    protected int f60258b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f60259c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f60260d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f60261e;

    /* renamed from: f, reason: collision with root package name */
    protected int f60262f;

    /* renamed from: g, reason: collision with root package name */
    protected ArrayList f60263g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList f60264h;

    /* renamed from: i, reason: collision with root package name */
    protected c f60265i;

    /* renamed from: j, reason: collision with root package name */
    protected Rect f60266j;

    /* renamed from: k, reason: collision with root package name */
    protected m f60267k;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60257a = new Paint(1);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m9.j.f74667b);
        this.f60258b = obtainStyledAttributes.getColor(4, resources.getColor(R.color.zxing_viewfinder_mask));
        obtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        this.f60259c = obtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        this.f60260d = obtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        this.f60261e = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        this.f60262f = 0;
        this.f60263g = new ArrayList(20);
        this.f60264h = new ArrayList(20);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m mVar;
        c cVar = this.f60265i;
        if (cVar != null) {
            Rect j11 = cVar.j();
            m l11 = this.f60265i.l();
            if (j11 != null && l11 != null) {
                this.f60266j = j11;
                this.f60267k = l11;
            }
        }
        Rect rect = this.f60266j;
        if (rect == null || (mVar = this.f60267k) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        Paint paint = this.f60257a;
        paint.setColor(this.f60258b);
        float f7 = width;
        canvas.drawRect(0.0f, 0.0f, f7, rect.top, paint);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, paint);
        canvas.drawRect(rect.right + 1, rect.top, f7, rect.bottom + 1, paint);
        canvas.drawRect(0.0f, rect.bottom + 1, f7, height, paint);
        if (this.f60261e) {
            paint.setColor(this.f60259c);
            paint.setAlpha(f60256l[this.f60262f]);
            this.f60262f = (this.f60262f + 1) % 8;
            int height2 = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, height2 - 1, rect.right - 1, height2 + 2, paint);
        }
        float width2 = getWidth() / mVar.f18815a;
        float height3 = getHeight() / mVar.f18816b;
        boolean isEmpty = this.f60264h.isEmpty();
        int i11 = this.f60260d;
        if (!isEmpty) {
            paint.setAlpha(80);
            paint.setColor(i11);
            Iterator it = this.f60264h.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                canvas.drawCircle((int) (sVar.b() * width2), (int) (sVar.c() * height3), 3.0f, paint);
            }
            this.f60264h.clear();
        }
        if (!this.f60263g.isEmpty()) {
            paint.setAlpha(160);
            paint.setColor(i11);
            Iterator it2 = this.f60263g.iterator();
            while (it2.hasNext()) {
                s sVar2 = (s) it2.next();
                canvas.drawCircle((int) (sVar2.b() * width2), (int) (sVar2.c() * height3), 6.0f, paint);
            }
            ArrayList arrayList = this.f60263g;
            ArrayList arrayList2 = this.f60264h;
            this.f60263g = arrayList2;
            this.f60264h = arrayList;
            arrayList2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }
}
