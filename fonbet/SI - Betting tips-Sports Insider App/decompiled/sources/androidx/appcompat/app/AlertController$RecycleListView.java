package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f200a;

    /* renamed from: b, reason: collision with root package name */
    public final int f201b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f10848u);
        this.f201b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f200a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
