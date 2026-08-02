package androidx.media3.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* renamed from: androidx.media3.ui.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2233b {

    /* renamed from: g, reason: collision with root package name */
    public static final C2233b f22353g = new C2233b(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f22354a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22355b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22356c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22357d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22358e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f22359f;

    public C2233b(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f22354a = i10;
        this.f22355b = i11;
        this.f22356c = i12;
        this.f22357d = i13;
        this.f22358e = i14;
        this.f22359f = typeface;
    }

    public static C2233b a(CaptioningManager.CaptionStyle captionStyle) {
        return new C2233b(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f22353g.f22354a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f22353g.f22355b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f22353g.f22356c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f22353g.f22357d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f22353g.f22358e, captionStyle.getTypeface());
    }
}
