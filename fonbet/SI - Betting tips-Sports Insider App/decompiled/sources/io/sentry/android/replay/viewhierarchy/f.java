package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f16162a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16163b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16164c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16165d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f16166e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f16167f;

    public f(int i5, int i10, float f6, f fVar, boolean z5, Rect rect) {
        this.f16162a = i5;
        this.f16163b = i10;
        this.f16164c = f6;
        this.f16165d = z5;
        this.f16166e = rect;
    }

    public final void a(f2.a callback) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!((Boolean) callback.invoke(this)).booleanValue() || (arrayList = this.f16167f) == null) {
            return;
        }
        Intrinsics.checkNotNull(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(callback);
        }
    }
}
