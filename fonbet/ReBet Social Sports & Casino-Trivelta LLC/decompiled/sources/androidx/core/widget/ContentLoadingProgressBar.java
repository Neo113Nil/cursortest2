package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.widget.ContentLoadingProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    public long f19303a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19304b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19305c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19306d;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f19307e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f19308f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f19303a = -1L;
        this.f19304b = false;
        this.f19305c = false;
        this.f19306d = false;
        this.f19307e = new Runnable() { // from class: C0.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.b(ContentLoadingProgressBar.this);
            }
        };
        this.f19308f = new Runnable() { // from class: C0.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.a(ContentLoadingProgressBar.this);
            }
        };
    }

    public static /* synthetic */ void a(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f19305c = false;
        if (contentLoadingProgressBar.f19306d) {
            return;
        }
        contentLoadingProgressBar.f19303a = System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }

    public static /* synthetic */ void b(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f19304b = false;
        contentLoadingProgressBar.f19303a = -1L;
        contentLoadingProgressBar.setVisibility(8);
    }

    public final void c() {
        removeCallbacks(this.f19307e);
        removeCallbacks(this.f19308f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }
}
