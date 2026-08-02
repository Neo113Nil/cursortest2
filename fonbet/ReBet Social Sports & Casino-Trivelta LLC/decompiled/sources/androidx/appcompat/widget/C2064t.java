package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import l.AbstractC5335a;

/* renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2064t extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C2065u f17359a;

    public C2064t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f54977J);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f17359a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f17359a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f17359a.g(canvas);
    }

    public C2064t(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        W.a(this, getContext());
        C2065u c2065u = new C2065u(this);
        this.f17359a = c2065u;
        c2065u.c(attributeSet, i10);
    }
}
