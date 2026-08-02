package q80;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq80/a;", "Landroid/view/View;", "tabber_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: q80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8997a extends View {

    /* renamed from: a, reason: collision with root package name */
    private int f81738a;

    /* renamed from: b, reason: collision with root package name */
    private long f81739b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private O30.b f81740c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC8997a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void a() {
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final O30.b getF81740c() {
        return this.f81740c;
    }

    public final void c(@NotNull O30.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f81740c = bVar;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            if (System.currentTimeMillis() - this.f81739b < 1000) {
                int i11 = this.f81738a + 1;
                this.f81738a = i11;
                if (i11 > 4) {
                    this.f81738a = 0;
                    a();
                }
            } else {
                this.f81738a = 1;
            }
            this.f81739b = System.currentTimeMillis();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8997a(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f81740c = O30.b.FINANCE;
    }
}
