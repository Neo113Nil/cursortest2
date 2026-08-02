package x4;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10655a {

    /* renamed from: g, reason: collision with root package name */
    public static final C10655a f105010g = new C10655a(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f105011a;

    /* renamed from: b, reason: collision with root package name */
    public final int f105012b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105013c;

    /* renamed from: d, reason: collision with root package name */
    public final int f105014d;

    /* renamed from: e, reason: collision with root package name */
    public final int f105015e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f105016f;

    public C10655a(int i11, int i12, int i13, int i14, int i15, Typeface typeface) {
        this.f105011a = i11;
        this.f105012b = i12;
        this.f105013c = i13;
        this.f105014d = i14;
        this.f105015e = i15;
        this.f105016f = typeface;
    }

    public static C10655a a(CaptioningManager.CaptionStyle captionStyle) {
        return new C10655a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : -1, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : -16777216, captionStyle.hasWindowColor() ? captionStyle.windowColor : 0, captionStyle.hasEdgeType() ? captionStyle.edgeType : 0, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : -1, captionStyle.getTypeface());
    }
}
