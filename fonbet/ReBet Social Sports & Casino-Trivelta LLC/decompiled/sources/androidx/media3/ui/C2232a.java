package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import d1.C3985a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.ui.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2232a extends View implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f22345a;

    /* renamed from: b, reason: collision with root package name */
    public List f22346b;

    /* renamed from: c, reason: collision with root package name */
    public int f22347c;

    /* renamed from: d, reason: collision with root package name */
    public float f22348d;

    /* renamed from: e, reason: collision with root package name */
    public C2233b f22349e;

    /* renamed from: f, reason: collision with root package name */
    public float f22350f;

    public C2232a(Context context) {
        this(context, null);
    }

    public static C3985a b(C3985a c3985a) {
        C3985a.b p10 = c3985a.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (c3985a.f44862f == 0) {
            p10.h(1.0f - c3985a.f44861e, 0);
        } else {
            p10.h((-c3985a.f44861e) - 1.0f, 1);
        }
        int i10 = c3985a.f44863g;
        if (i10 == 0) {
            p10.i(2);
        } else if (i10 == 2) {
            p10.i(0);
        }
        return p10.a();
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List list, C2233b c2233b, float f10, int i10, float f11) {
        this.f22346b = list;
        this.f22349e = c2233b;
        this.f22348d = f10;
        this.f22347c = i10;
        this.f22350f = f11;
        while (this.f22345a.size() < list.size()) {
            this.f22345a.add(new h0(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.f22346b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float f10 = k0.f(this.f22347c, this.f22348d, height, i10);
        if (f10 <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3985a c3985a = (C3985a) list.get(i11);
            if (c3985a.f44872p != Integer.MIN_VALUE) {
                c3985a = b(c3985a);
            }
            ((h0) this.f22345a.get(i11)).b(c3985a, this.f22349e, f10, k0.f(c3985a.f44870n, c3985a.f44871o, height, i10), this.f22350f, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    public C2232a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22345a = new ArrayList();
        this.f22346b = Collections.EMPTY_LIST;
        this.f22347c = 0;
        this.f22348d = 0.0533f;
        this.f22349e = C2233b.f22353g;
        this.f22350f = 0.08f;
    }
}
